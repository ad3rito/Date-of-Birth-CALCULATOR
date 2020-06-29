Scanner sc = new Scanner(System.in);
String pergunta = "\n\tInsira o ano de Nascimento : ";
int AnoNasc, AnoActual= 2020;
int admitirNumero(String msg){
int qual;
System.out.print(msg);
qual = sc.nextInt();
return qual;
}
void main() {
AnoNasc = admitirNumero(pergunta);
System.out.println("\n\tTotal de anos de vida = "+(AnoActual-AnoNasc));
System.out.println();
}
main()

