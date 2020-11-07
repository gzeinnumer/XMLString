# XMLString

- String
```xml
<resources>
    <string name="read_string">Read String</string>
</resources>
```

```java
String xmlString1 = getResources().getString(R.string.read_string);
String xmlString2 = getString(R.string.read_string);
```

#
- Array String
```xml
<resources>
    <string-array name="array_string">
        <item>My Tab 1</item>
        <item>My Tab 2</item>
    </string-array>
</resources>
```

```java
String[] arrayString = getResources().getStringArray(R.array.array_string);
String array1 = arrayString[0];
```

---

```
Copyright 2020 M. Fadli Zein
```