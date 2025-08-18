// See https://aka.ms/new-console-template for more information
Console.WriteLine("## Struct DateTime ##\n");

DateTime dataAtual = DateTime.Now;

Console.WriteLine(dataAtual);

//criar uma data especifica usa formato: aaaa, mm, dd

DateTime dataHoje = new DateTime(2022, 09, 06);
Console.WriteLine(dataHoje);  

//definiri as horas
DateTime dataHoraHoje = new DateTime(2022, 09, 06, 21,10,30);
Console.WriteLine(dataHoraHoje);    

Console.ReadKey();
