fun main() {

    val temperaturZuTag: Map<Double, String> = mapOf(
        12.2 to "Montag",
        9.8 to "Dienstag",
        14.4 to "Mittwoch",
    )

    println(temperaturZuTag)

    var tageZuDatum: MutableMap<String, Boolean> = mutableMapOf(
        "Ist heute Freitag?" to true,
        "War gestern Mittwoch?" to false
    )
    tageZuDatum.put("Ist morgen Sonntag?", false)
    tageZuDatum.put("War gestern Donnerstag?", false)

    println(tageZuDatum)

    tageZuDatum["War vorgestern Montag?"] = false
    tageZuDatum["Ist Übermorgen Dienstag?"] = false

    println(tageZuDatum)

    tageZuDatum.remove("War gestern Mittwoch?", false)
    tageZuDatum.remove("War gestern Donnerstag?", true)
    println( tageZuDatum.remove("Ist Übermorgen Dienstag?", true))

    println(tageZuDatum)

}