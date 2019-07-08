# Description

Assesment test for `Java developer` position. 

You should develop `Convertor` to convert value of `int` type to two `short` values (`crack()` method) and back to orignal value (`uncrack()` method)

- Please do NOT fork this repo since others will see your results, just copy content to your repo
- Implement [Convertor](src/main/java/Convertor.java)
- Implement [ConvertorTest](src/test/java/ConvertorTest.java)
- `gradlew test` should be fine
- Send us the link to your repo

# Rationale

- Document is identified by ID
- ID is of `int` type
- We need to store documents using Apache Cassandra
- For Cassandra we will use two `short`s as a primary key, to optimize partition size
- Therefore we need to convert `int` to `short`'s and vice versa
