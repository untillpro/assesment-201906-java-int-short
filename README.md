# assesment_typeconv

Assesment test for `Java developer` position. 

You should develop `Convertor` to convert value of `int` type to two `short` values (`crack` method) and back to orignal value (`uncrack` method)

- Fork this repo
- Implement [Convertor](src/main/java/assesment_typeconv/Convertor.java)
- Implement [ConvertorTest](src/test/java/assesment_typeconv/ConvertorTest.java)

# Rationale

- Document is identified by ID
- ID is of `int` type
- We need to store documents in Cassandra
- For Cassandra we will use two `short`s as a key, to optimize partition size
- Therefore we need to convert `int` to `short`'s and vice versa
