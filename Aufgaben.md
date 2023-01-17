<h1>

</h1>

#### Beschreibung:

Willkommen zurück zum zweiten Teil von Maps und MutableMaps.
Heute schauen wir uns weitere Funktionen mit Maps und MutableMaps an
und steigen damit ein wenig tiefer in das Thema.

Daten werden in der Praxis oft in Maps und MutableMaps gespeichert,
es ist daher von Vorteil den Umgang mit Maps und MutableMaps zu kennen.

#### Hinweise zur Bearbeitung:

- Löse die Aufgaben programmatisch (D.h. schreibe Code, um auf die Lösung zu kommen).
- Achte auf einen sauberen Quellcode, insbesondere Einrückungen sind wichtig!
- Wenn ihr Hilfe braucht, könnt ihr euch am Code aus den Aufgaben des Vortages orientieren
oder jederzeit die Tutoren fragen.
- Viel Erfolg und natürlich viel Spaß!


---

<details>
<summary> <b> Aufgabe 1 - Wiederholung </b> </summary>

In dieser Aufgabe Wiederholen wir nochmal ein paar Grundlagen von gestern.

(Achte bei Strings genau auf die Schreibweise, man kann hier sehr leicht Tippfehler machen!)

a)
- Vervollständige in der Datei zu dieser Aufgabe die folgende Map:

      val temperaturZuTag: Map<Double, String>

- Die Map hat dabei initial (zu Beginn) die folgenden Paare:
   
      12.2 -> "Montag"
       9.8 -> "Dienstag"
      14.4 -> "Mittwoch"

- Überprüfe deine Map (über die Konsole). Wurde sie richtig erstellt?

b)
- Lege eine passende Map an, die initial folgende Paare enthält:

      "Ist heute Freitag?" -> true
      "War gestern Mittwoch?" -> false

- Füge anschließend der Map folgende Paare hinzu. Wenn nötig, passe deinen vorherigen Code an.  
    Veränder allerdings nicht die Paare aus der Teilaufgabe davor. Überprüfe dann deine Map in der Konsole.

      "Ist morgen Sonntag?" -> false
      "War gestern Donnerstag?" -> true

- Füge anschließend der Map die folgenden Paare mit der Index-Schreibweise hinzu.
Überprüfe dann deine Map in der Konsole.  

      "War vorgestern Montag?" -> false
      "Ist Übermorgen Dienstag?" -> false


- Entferne mit einer Funktion aus der Vorlesung die folgenden Paare aus der Liste 
  und gib in der Konsole aus, ob das Paar erfolgreich aus der Map entfernt werden konnte.

      "War gestern Mittwoch?" -> false
      "War gestern Donnerstag?" -> true
      "Ist Übermorgen Dienstag?" -> true

Die erste Ausgabe sollte true sein, die zweite ebenfalls true und die dritte false. Warum?

**Modul für die Aufgabe:** *Aufgabe1*  
**Datei für die Aufgabe:** *1_WiederholungMaps.kt*

</details>

---

<details>
<summary> <b> Aufgabe 2 - Schlüssel und Werte I </b> </summary>

a)  

Wie wir wissen besteht eine Map oder MutableMap aus Schlüsseln und Werten.
Alle Schlüsseln oder alle Werte zusammen nennt man ein Set 
oder ein Satz (vom englischen 'Set').

Wir können uns von der Map oder MutableMap das Set Schlüssel oder Werte 
ausgeben lassen.
Da wir allerdings in der Vorlesung Sets noch nicht kennengelernt haben,
konvertieren wir mit Typenkonvertierung das Set zu einer Liste.

- Schaue dir die Beispiele in der Datei an.

b)  

Gegeben ist die folgende Map, die Fahrzeuge zu ihrer Geschwindigkeit in Km/h mappt:

    "Auto" -> 120.5 
    "Flugzeug" -> 755.2
    "Fahrrad" -> 22.0
    "Tretroller" -> 15.7

- Erstelle eine passende Map, die initial die genannten Paare besitzt.
- Weise alle Schlüssel einer Variable zu und gib die Variable in der Konsole aus.
- Weise alle Werte einer Variable zu und gib die Variable in der Konsole aus.
- Stimmen die ausgegebenen Schlüssel und Werte mit denen der Map überein?

c)  

Gegeben ist die folgende Map:

    false -> 5
    true -> 7

- Erstelle eine passende Map, die initial die genannten Paare besitzt.
- Weise alle Schlüssel einer Variable zu und gib die Variable in der Konsole aus. 
- Weise alle Werte einer Variable zu und gib die Variable in der Konsole aus.
- Stimmen die ausgegebenen Schlüssel und Werte mit denen der Map überein? 


**Modul für die Aufgabe:** *Aufgabe2*  
**Datei für die Aufgabe:** *2_SchluesselUndWerte.kt*
</details>


---

<details>
<summary> <b> Aufgabe 3 - Schlüssel und Werte II </b> </summary>

Lese in dieser Aufgabe die Antwort für die Fragen nicht aus der Map heraus.
Schreibe Code, der die Antworten aus der Map herausfindet.

Gegeben ist die folgende Map, die Fahrzeuge zu ihrer Geschwindigkeit in Km/h mappt:

    "Auto" -> 120.5 
    "Flugzeug" -> 755.2
    "Fahrrad" -> 22.0
    "Tretroller" -> 15.7

- Erstelle eine passende Map, die initial die genannten Paare besitzt.

a)

- Hole dir die Schlüssel der Map, konvertiere den Typ von Set 
zu List und weise sie einer Variable zu.
- Verwende die contains() Funktion, die du aus der Vorlesung für Listen kennst,
um die folgenden Fragen zu beantworten. Gib dabei ein true für ja und ein false
für ein nein in der Konsole aus.
  - Ist der Schlüssel "Flugzeug" in den Schlüsseln?
  - Ist der Schlüssel "Moped" in den Schlüsseln?
  - Ist der Schlüssel "Tretroller" in den Schlüsseln?

b)

- Hole dir die Werte der Map, konvertiere den Typ von Set
  zu List und weise sie einer Variable zu.
- Verwende die contains() Funktion, die du aus der Vorlesung für Listen kennst,
  um die folgenden Fragen zu beantworten. Gib dabei ein true für ja und ein false
  für ein nein in der Konsole aus.
  - Ist der Wert 755.2 in den Werten?
  - Ist der Wert 2.0 in den Werten?
  - Ist der Wert 120.5 in den Werten?


**Modul für die Aufgabe:** *Aufgabe3*  
**Datei für die Aufgabe:** *3_Übungen.kt*
</details>

---

<details>
<summary> <b> Aufgabe 4 - Übung Maps </b> </summary>

Gegeben ist die folgende Map, die Fahrzeuge zu ihrer Geschwindigkeit in Km/h mappt:

    "Auto" -> 120.5 
    "Flugzeug" -> 755.2
    "Fahrrad" -> 22.0
    "Tretroller" -> 15.7

- Erstelle eine passende Map, die initial die genannten Paare besitzt.

a)

- Erstelle ein kleines Programm, 
dass die Schlüssel der Map aufsteigend sortiert (auch: natürlich sortiert) ausgibt.
Führe dabei folgende Teilschritte aus:
  - Erhalte die Schlüssel als Liste.
  - Sortiere die Schlüssel.
  - Gib die Schlüssel aus.  

Wenn du dich sicher fühlst, kannst du die drei Teilschritte   
mit nur einer Codezeile durchführen.

Überprüfe dann dein Ergebnis. Sind die Schlüssel (alphabetisch) sortiert?  

b) 

- Erstelle ein kleines Programm,
  dass die Werte der Map aufsteigend sortiert (auch bekannt als: natürlich sortiert) ausgibt.

Überprüfe dann dein Ergebnis. Sind die Werte (aufsteigend) sortiert?

c)

- Berechne den Durchschnitt der Werte und gib ihn in der Konsole aus.
Es sollte 228.35 in der Konsole ausgegeben werden.

How to: Durchschnitt berechnen.

Den Durchschnitt berechnest du, indem du alle Zahlen addierst
und du dann das Ergebnis (Das Ergebnis einer Addition nennt man auch Summe.)
dann durch die Anzahl der Zahlen dividierst.

Ein Beispiel:

Wir haben die zahlen 3, 4 und 8.  
Alle Zahlen addieren: 3 + 4 + 8 = 15.
Durch die Anzahl Zahlen teilen (hier sind es in der Anzahl drei Zahlen):
15 / 3 = 5.  
Der Durchschnitt aus 3, 4 und 8 ist also 5.



**Modul für die Aufgabe:** *Aufgabe4*  
**Datei für die Aufgabe:** *4_WeitereÜbungen.kt*
</details>
