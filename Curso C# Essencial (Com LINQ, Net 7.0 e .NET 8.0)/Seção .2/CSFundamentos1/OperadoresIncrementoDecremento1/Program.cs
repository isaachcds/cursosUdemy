
int x = 0;
Console.WriteLine($"x = {x}");

// Pós-incremento -> primeiro resolve depois incrementa

int resultado1 = x++ + 10;
Console.WriteLine($"pós-incremento ==> {resultado1}");
Console.WriteLine($"o valor de x ===> {x}\n");

//pré-decremento -> primeiro decrementa depois resolve
int y = 0;
Console.WriteLine($"y = {y}");
int resultado2 = ++y + 10;

Console.WriteLine($"pré-incremento ==>{resultado2}");
Console.WriteLine($"valor de y ==> {y}\n");

Console.ReadKey();
