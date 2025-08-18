﻿Console.WriteLine("## Conversão de tipos ##\n");

/*int varInt = 100; //int usa 4bytes
double varDouble = varInt; //double usa 8bytes

//byte -> 1 byte
//short -> 2 bytes
//int -> 4 bytes
//long -> 8 bytes
//float -> 4 bytes
//double -> 8 bytes
//decimal -> 16 bytes

Console.WriteLine(varDouble);

int numeroInt = 2145678;
long numeroLong = numeroInt;
float numeroFloat = numeroInt;
double numeroDouble = numeroInt;
decimal numeroDecimal = numeroInt;

Console.WriteLine(numeroInt);
Console.WriteLine(numeroLong);
Console.WriteLine(numeroFloat);
Console.WriteLine(numeroDouble);
Console.WriteLine(numeroDecimal);
*/

double varDouble = 12.456; // 8 bytes
int varInt = (int)varDouble; // 4 bytes (perda de precisão)
Console.WriteLine(varInt);

int num1 = 10;
int num2 = 4;

float resultado = num1 / num2; // 10/4 = 2.5
Console.WriteLine(resultado);

Console.ReadLine();