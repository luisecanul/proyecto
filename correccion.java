/*Clase que permite leer un archivo de texto*/

//Importamos clases a usar
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.*;
import java.util.*;
public class correccion
{
public static void main(String arg[])
{
//Creamos un String que va a contener todo el texto del archivo
String s1="";

try
{
 String s1; 
  String s2;
  BufferedReader br = new BufferedReader (new FileReader ("palabras.txt")); 
  while((s1=br.readLine())!=null)
{
	
 	// Cargamos el buffer con el contenido del archivo BufferedReader
	
	s1 = br.readLine(); 

System.out.println ("La primera linea del archivo es: " + s1);
System.out.println ("La linea tiene " + s1.length() + " caracteres"); 
System.out.println (); 


}
System.out.println ("Separando la linea en trozos tenemos las siguientes palabras:");

int numTokens = 0; 
StringTokenizer st = new StringTokenizer (s1); // bucle por todas las palabras
while (st.hasMoreTokens()) {
s2 = st.nextToken(); numTokens++; System.out.println (" Palabra " + numTokens + " es: " + s2);

}catch(Exception e)
{
System.out.println("Error al leer");
}
}
}




/***************************************************
/*Clase que permite escribir en un archivo de texto*/

//Importamos clases que se usaran
import java.io.File;
import java.io.FileWriter;

public class Escribir
{
public static void main(String []args)
{

//Un texto cualquiera guardado en una variable
String saludo="Hola";

try
{
//Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
File archivo=new File("texto.txt");

//Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
FileWriter escribir=new FileWriter(archivo,true);

//Escribimos en el archivo con el metodo write
escribir.write(saludo);

//Cerramos la conexion
escribir.close();
}

//Si existe un problema al escribir cae aqui
catch(Exception e)
{
System.out.println("Error al escribir");
}
}
} 
