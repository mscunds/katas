# Hibernate Kata

## Einleitung
Um Daten aus einer relationalen Datenbank wie Oracle oder PostgreSQL auszulesen und in einer objektorientieren 
Programmiersprache zu verarbeiten, gibt es zwei Möglichkeiten: man mapped die Daten manuell in eine passende 
Struktur oder man nutzt einen OR-Mapper wie z.B. Hibernate.

Wenn man sich für Hibernate entscheidet, gibt es wieder zwei Möglichkeiten: man nutzt Hibernate direkt oder man 
nutzt die JPA Implementierung von Hibernate.

## JPA oder Hibernate plain
Wo liegt jetzt der Unterschied zwischen JPA uind Hibernate? 

**JPA** ist eine Spezifikation, für die es mehrere Implementierunge gibt, wie Hibernate und EclipseLink;
**Hibernate** ist eine eigenständige Implementierung für den Zugriff auf eine relationale Dantebank. 

Im großen und ganzen sind sich die beiden 
Implementierung sehr ähnlich. Der wesentliche Unterschied aber ist der Zugriff auf die genutzte Datenbank.
Während JPA einen **EntitManager** nutzt, benötigt man in Hibernate eine **SessionFactory**, um deren 
Initialisierung man sich selber kümmern darf.


---

<div style="color:grey">Hibernate ist ein ORM (Object-Relational-Mapper), der hilft 
relationale Datenstrukturen aus einer 
relationale
Datenbank in Objekte einer objekt-orientierten Programmiersprache zu mappe, so dass in der Programmiersprache in
üblicher Weise mit den Daten umgegangen werden.
</div>
<div style="color:grey">
Hier bei entstehen zahlreiche Herausforderungen, wie z.B. Umgang mit Fremdschlüsseln, tabellarische Trennung von
verschiedenen Hierarchiestufen, Umgang mit ablaufrelevanten Daten, verschiedenen MöglichkeitenDaten aus einer
Datenbank zu lesen, ...</div>
