/* 
    Tipos Primitivos
  Types        Memory      min Value                        max value
  byte         1byte        -128                              127
  short        2byte        -32.768                           32767
  int          4bytes       -2.147.483.648                    2.147.483.647
  long         8bytes       -9.223.372.036.854.775.808        9.223.373.036.854.775.807    


    Tipos Primitivos que podem conter partes fracionarias
  Types         Memory      minimo value         maximo value
  float         4 bytes      -3,4028E + 38          3,4028E + 38  
  double        8 bytes      -1,7976E + 308         1,7976E + 308

  */

public class TypesVariables {
    public static void main(String[] args) throws Exception {
        byte idade = 123;
        short ano = 2021;
        int cep = 21070333;
        long cpf = 123453234L;
        float pi = 3.14F;
        double salario = 1275.33;
    }
}
