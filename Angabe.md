# Aufgabenstellung: T-Shirt Konfigurator mit JavaFX und FXML

**Ziel:** Entwickeln Sie eine JavaFX-Anwendung, die es dem Benutzer ermöglicht, ein T-Shirt mit verschiedenen Optionen wie Ärmellänge, Aufdrucke, Marke und Material zu konfigurieren. Die Anwendung soll die Daten mittels einer FXML-basierten Benutzeroberfläche entgegennehmen und ein `TShirt` Objekt basierend auf den Eingaben des Benutzers erstellen.

## Voraussetzungen:

- Grundkenntnisse in Java und JavaFX mit FXML
- Verständnis des Builder-Patterns
- Umgang mit Scene Builder

## Anforderungen

1. **FXML-Benutzeroberfläche erstellen:**
   - Nutzen Sie den Scene Builder, um eine FXML-Datei für die Benutzeroberfläche zu erstellen.
   - Die Benutzeroberfläche soll Eingabefelder/Labels für folgende T-Shirt Optionen enthalten:
     - Ärmellänge (Kurzarm oder Langarm)
     - Aufdruck hinten
     - Kleiner Aufdruck vorne (*mehrzeilig*)
     - Großer Aufdruck vorne (*mehrzeilig*)
     - Marke (z.B. `Fair for Me`, `Fast Fashion As We Wish`, `I Can Not Care Less`)
     - Ob es aus Bio-Baumwolle ist
     - Preis (***soll automatisch berechnet werden***)
   - Ein "Bestellen" Button, um die Konfiguration zu übermitteln.
2. **JavaFX Controller implementieren:**
   - Implementieren Sie einen Controller, der die Logik zur Handhabung der Benutzereingaben aus der FXML-Datei verarbeitet.
   - Der Controller soll ein `TShirt` Objekt mittels des Builder-Patterns aus der `TShirt` Klasse erstellen, basierend auf den Benutzereingaben 
3. **Fehlerbehandlung:**
   - Bei ungültigen Konfigurationen oder anderen Fehlern soll ein Standard-Fehlerdialog angezeigt werden, der eine aussagekräftige Fehlermeldung enthält.
4. **Bestätigungsdialog:**
   - Bei erfolgreicher Erstellung des `TShirt` Objekts soll ein Bestätigungsdialog geöffnet werden, der alle konfigurierten Parameter des T-Shirts ausgibt.
   - Der Dialog soll zwei Optionen bieten: Bestellung bestätigen oder abbrechen.

## (V) Zusätzliche Herausforderungen:

- Erweitern Sie die Anwendung, sodass die finale Bestellung in einer Datenbank oder Datei gespeichert wird.

## Abgabe

- Pushen sie den aktuellen Stand auf das GitHub - Repository **am Ende jeder Unterrichtseinheit**.

<br>

> <span style="font-size: 1.5em">:information_source: </span> Diese Aufgabenstellung kombiniert die Prinzipien des Softwareentwurfs mit praktischen Fähigkeiten in der Java-Programmierung und der Benutzeroberflächenentwicklung.

<span style="font-size: 1.5em">Viel Erfolg!</span>