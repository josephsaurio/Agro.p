/*  Universidad EAFIT
    Escuela de Ciencias Aplicadas e Ingeniería
    Ingeniería en Sistemas
    Curso:    Principios de desarrollo de software
    Programa: Codigo para quemar en el arduino de temperatura y humedad ambiental
    Por:      Sebastian Andres Medina Cabezas
*/

//Declaración de librerías
#include <DHT.h>
#include <SPI.h>
#include <Wire.h>

//Definición de constantes
#define DHTPIN 3
#define DHTTYPE DHT11

//Definición de Variables
DHT dht(DHTPIN, DHTTYPE);
int tiempoActual = 0;
int tiempoEspera = 5;
int tiempoConteo = 0;

//los siguientes float son del ambiente
float temperatura;
float humedad;

// Configuración inicial
void setup() {
   Serial.begin(9600);
   dht.begin();

   tiempoActual = millis()/1000;
   tiempoConteo = tiempoActual; 
}

// Ciclo del programa
void loop() {
  if (tiempoActual > tiempoConteo + tiempoEspera){
      // Leemos la humedad relativa
      humedad = dht.readHumidity();
      // Leemos la temperatura en grados centígrados (por defecto)
      temperatura = dht.readTemperature();

      // Comprobamos si ha habido algún error en la lectura

      if (isnan(humedad) || isnan(temperatura)) {
        Serial.println("Error obteniendo los datos del sensor DHT11");
        return;
      }

      String dato_sensor = String(temperatura)+"|"+String(humedad);
      Serial.println(dato_sensor);

      tiempoConteo = tiempoActual;      
    }
    else {
      tiempoActual = millis()/1000;
    }
 }
