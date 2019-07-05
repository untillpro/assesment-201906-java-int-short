# assesment_typeconv

Assesment test for `Java developer` position. 

You should develop `Convertor` to convert value of `int` type to two `short` values (`crack` method) and back to orignal value (`uncrack` method)

- Fork this repo
- Implement [Convertor](src/main/java/Convertor.java)
- Implement [ConvertorTest](src/test/java/ConvertorTest.java)
- `gradlew test` should be fine

# Rationale

- Document is identified by ID
- ID is of `int` type
- We need to store documents using Apache Cassandra
- For Cassandra we will use two `short`s as a primary key, to optimize partition size
- Therefore we need to convert `int` to `short`'s and vice versa
