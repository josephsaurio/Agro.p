/*  Universidad EAFIT
    Escuela de Ciencias Aplicadas e Ingeniería
    Ingeniería en Sistemas
    Curso:    Principios de desarrollo de software
    Programa: Codigo para quemar en el arduino de temperatura y humedad ambiental
    Por:      Sebastian Andres Medina Cabezas, Alejandro Sepulveda Posada y Joseph Saldarriaga Ladino
*/

// Declaración de librerías
#include <DHT.h>

// Definición de constantes
#define DHTPIN 3 //El pin al q esta conectado el DHT11
#define DHTTYPE DHT11 //El tipo de DHT que tenmos
#define HUMIDITY_SENSOR A0 //El pin al que esta conectado el sensor de humedad HW-080

// Definición de Variables
DHT dht(DHTPIN, DHTTYPE);

void setup() {
  Serial.begin(9600);
  dht.begin();
}

void loop() {
  // Lectura del sensor DHT11
  float temperatura = dht.readTemperature();
  float humedad = dht.readHumidity();

  // Lectura del sensor HW080 (humedad del suelo)
  int valorhumedad = map(analogRead(HUMIDITY_SENSOR), 0, 1023, 100, 0); //Le cambie el rango de 0 a 1023, y ahora tengo un rango de 0 a 100

  // Comprobamos si ha habido algún error en la lectura del DHT11
  if (isnan(humedad) || isnan(temperatura)) {
    Serial.println("Error obteniendo los datos del sensor DHT11");
  } else {
    Serial.println(String(temperatura)+","+String(humedad)+","+String(valorhumedad));
  }

  delay(1000); // Agregue un pequeño retraso entre lecturas
}
