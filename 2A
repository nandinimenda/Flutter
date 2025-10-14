import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Student Profile Card',
      home: Scaffold(
        backgroundColor: Colors.lightBlue[50],
        appBar: AppBar(
          title: const Text('Profile Card'),
          backgroundColor: Colors.blueAccent,
        ),
        body: Center(
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
              // Profile picture
              const CircleAvatar(
                radius: 60,
                backgroundImage: AssetImage('images/profile.png'),
              ),
              const SizedBox(height: 20),

              // Name
              const Text(
                'Flutter App',
                style: TextStyle(
                  fontSize: 28,
                  fontWeight: FontWeight.bold,
                  color: Colors.blueAccent,
                ),
              ),

              // Profession
              const Text(
                'Flutter Beginner',
                style: TextStyle(
                  fontSize: 20,
                  color: Colors.black54,
                ),
              ),

              const SizedBox(height: 20),

              // Contact Card
              Container(
                margin: const EdgeInsets.symmetric(horizontal: 40),
                padding: const EdgeInsets.all(12),
                decoration: BoxDecoration(
                  color: Colors.white,
                  borderRadius: BorderRadius.circular(12),
                  boxShadow: const [
                    BoxShadow(color: Colors.grey, blurRadius: 4),
                  ],
                ),
                child: Row(
                  children: const [
                    Icon(Icons.phone, color: Colors.green),
                    SizedBox(width: 10),
                    Text(
                      '+91 9887766554',
                      style: TextStyle(fontSize: 18),
                    ),
                  ],
                ),
              ),

              const SizedBox(height: 12),

              Container(
                margin: const EdgeInsets.symmetric(horizontal: 40),
                padding: const EdgeInsets.all(12),
                decoration: BoxDecoration(
                  color: Colors.white,
                  borderRadius: BorderRadius.circular(12),
                  boxShadow: const [
                    BoxShadow(color: Colors.grey, blurRadius: 4),
                  ],
                ),
                child: Row(
                  children: const [
                    Icon(Icons.email, color: Colors.redAccent),
                    SizedBox(width: 10),
                    Text(
                      'vit@example.com',
                      style: TextStyle(fontSize: 18),
                    ),
                  ],
                ),
              ),
            ],
          ),
        ),
      ),
    );
  }
}