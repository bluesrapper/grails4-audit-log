# grails4-audit-log

To reproduce the error 

```
java.lang.IllegalArgumentException: Argument [audit log null user SYS INSERT test.g4.api.Usuario id:1 version:0] is not an instance of [class test.g4.api.Bitacora] which this validator is configured for
```

just type the next

```
./gradlew bootRun
```

or

```
./grailsw run-app
```

You only need java 8 on your system to deploy