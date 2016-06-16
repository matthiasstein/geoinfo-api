# KSwe SoSe 2016 - Aufgabe 8

Entwicklung eine JSON-Encodings für ein Wetter-Objekt.

## Vorgehensweise

Es soll ein JSON-Encoder geschrieben werden, der ein Java-Objekt der Klasse
`Weather` in ein JSON-Objekt wandelt. Hierzu soll explizit Test-Driven
Development angewandt werden.

* Implementiere zunächste die Test-Klasse `JsonWeatherEncoderTest`
* Implementiere dann die Logik der Klasse `JsonWeatherEncoder`
* Schreibe `Assert.asserThat(...)`-Statements zur Verfikiation der richtigen
JSON-Struktur

Das enkodierte Wetter-Objekt sollte de folgende Struktur aufweisen

```json
{
  "city": {
    "name": "Bochum",
    "country": "Germany"
  },
  "phenomena": {
    "temperature": {
      "value": 22.3,
      "unit": "C"
    },
    "rain": {
      "value": 2.3,
      "unit": "mm/h"
    },
    "windSpeed": {
      "value": 1.3,
      "unit": "m/s"
    }
  }
}
```
