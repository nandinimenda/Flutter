import 'package:flutter/material.dart';
void main() {
  runApp(const MyApp());
}

class Person {
  String name;
  int age;
  Person(this.name, this.age);
  String greet() {
    return 'Hello, my name is $name and I am $age years old.';
  }
}
int square(int x) => x * x;

class MyApp extends StatelessWidget {
  const MyApp({super.key});
  @override
  Widget build(BuildContext context) {
    return const MaterialApp(
      debugShowCheckedModeBanner: false,
      home: MyHomePage(),
    );
  }
}

// ✅ Use StatefulWidget here
class MyHomePage extends StatefulWidget {
  const MyHomePage({super.key});
  @override
  State<MyHomePage> createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  String title = 'Dart Basics Demo';
  int number = 5;
  double pi = 3.14159;
  bool isLearning = true;
  List<String> fruits = ['Apple', 'Banana', 'Mango'];

  @override
  Widget build(BuildContext context) {
    String learningStatus = isLearning ? 'You are learning Dart!' : 'Take a break.';
    Person person = Person('Alice', 25);
    String greeting = person.greet();

    return Scaffold(
      backgroundColor: Colors.grey[100],
      appBar: AppBar(
        title: Text(title),
        backgroundColor: Colors.teal,
      ),
      body: SingleChildScrollView(
        padding: const EdgeInsets.all(16),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.stretch,
          children: [
            infoCard('Square of $number', '${square(number)}', Icons.calculate),
            infoCard('Value of Pi', '$pi', Icons.circle),
            infoCard('Status', learningStatus, Icons.info),
            infoCard('Person', greeting, Icons.person),
            fruitCard('Fruits', fruits),
          ],
        ),
      ),
    );
  }

  Widget infoCard(String title, String value, IconData icon) {
    return Card(
      margin: const EdgeInsets.symmetric(vertical: 8),
      elevation: 4,
      child: ListTile(
        leading: Icon(icon, color: Colors.teal),
        title: Text(
          title,
          style: const TextStyle(fontWeight: FontWeight.bold),
        ),
        subtitle: Text(value),
      ),
    );
  }

  Widget fruitCard(String title, List<String> items) {
    return Card(
      margin: const EdgeInsets.symmetric(vertical: 8),
      elevation: 4,
      child: ExpansionTile(
        leading: const Icon(Icons.local_grocery_store, color: Colors.teal),
        title: Text(
          title,
          style: const TextStyle(fontWeight: FontWeight.bold),
        ),
        children: items
            .map((item) => ListTile(
          title: Text(item),
        ))
            .toList(),
      ),
    );
  }
}