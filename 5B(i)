import 'package:flutter/material.dart';
import 'package:provider/provider.dart';

void main() {
  runApp(
    ChangeNotifierProvider(
      create: (context) => Cprovider(),
      child: MaterialApp(
        debugShowCheckedModeBanner: false,
        home: A(),
      ),
    ),
  );
}
class Cprovider extends ChangeNotifier {
  int c = 0;
  void increment() {
    c++;
    notifyListeners();
  }
}
class A extends StatelessWidget {
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.cyan,
      appBar: AppBar(
        backgroundColor: Colors.purple,
        title: Text("SetState Vs Provider"),
        centerTitle: true,
      ),
      body: Column(
        children: [
          C(),
        ],
      ),
    );
  }
}
class C extends StatefulWidget {
  _D createState() {
    return _D();
  }
}
class _D extends State<C> {
  dynamic count = 0;
  Widget build(BuildContext context) {
    final provider = Provider.of<Cprovider>(context);
    return Center(
      child: Column(
        children: [
          Container(
            width: 400,
            height: 110,
            color: Colors.lightGreen,
            child: Column(
              children: [
                SizedBox(height: 10),
                Text("Stateful Widget(data changes)"),
                SizedBox(height: 10),
                Text("count : ${count}"),
                SizedBox(height: 10),
                ElevatedButton(
                  onPressed: () {
                    setState(() {
                      count++;
                    });
                  },
                  child: Text("click me"),
                ),
              ],
            ),
          ),
          Container(
            margin: EdgeInsets.only(top: 20),
            width: 400,
            height: 110,
            color: Colors.yellow,
            child: Column(
              children: [
                SizedBox(height: 10),
                Text("Provider(data changes)"),
                SizedBox(height: 10),
                Text("count : ${provider.c}"),
                SizedBox(height: 10),
                ElevatedButton(
                  onPressed: () {
                    Provider.of<Cprovider>(context, listen: false).increment();
                  },
                  child: Text("click me"),
                ),
              ],
            ),
          ),
        ],
      ),
    );
  }
}
