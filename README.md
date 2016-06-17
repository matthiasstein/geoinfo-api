# KSwe SoSe 2016 - Aufgabe 8

Entwicklung eine JSON-Encodings für ein Wetter-Objekt.

Forke wie gewohnt das Projekt in deinen GitHub-Account. Falls schon vorhanden,
lösche den Fork oder aktualisiere deinen Fork mit einem Pull Request.

## Vorgehensweise

Es soll ein JSON-Encoder geschrieben werden, der ein Java-Objekt der Klasse
`Weather` in ein JSON-Objekt wandelt. Hierzu soll explizit Test-Driven
Development angewandt werden.

* Implementiere zunächst die Test-Klasse `JsonWeatherEncoderTest`
* Implementiere dann die Logik der Klasse `JsonWeatherEncoder`
* Schreibe `Assert.asserThat(...)`-Statements zur Verifikation der richtigen
JSON-Struktur

Das enkodierte Wetter-Objekt sollte due folgende Struktur aufweisen

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

## Automatisches Testen

[Travis-CI](https://travis-ci.org/) ist eine [Continuous
Integration](https://de.wikipedia.org/wiki/Kontinuierliche_Integration)-Plattform
für Open-Source-Projekte. Es bietet die Möglichkeit, GitHub-Projekte
automatisiert zu testen.

Sobald ein GitHub-Repository die Datei
[`travis.yml`](https://docs.travis-ci.com/user/getting-started/) enthält
und ein entsprechender
[Service Hook](https://www.objc.io/issues/6-build-tools/travis-ci/#link-travis-and-github)
für das Repository eingerichtet ist, führt Travis automatisch das Kompilieren
des Projekts - inklusive Tests - aus.

* Logge dich mit deinem GitHub-Account auf [travis-ci.org](https://travis-ci.org/)
ein und aktiviere das `geoinfo-api` Repository
* Erstelle die Datei `.travis.yml` (siehe oben) im Hautpverzeichnis des
Repositories
* Commite die `.travis.yml` und pushe zu GitHub

Travis wird ab nun nach jedem Commit in deinem Repository das Projekt bauen
und bei Fehlern eine Meldung versenden.
