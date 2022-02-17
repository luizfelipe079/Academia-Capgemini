import java.util.Scanner;

public class Questao3
{

    public void anagramasPares(String palavra)
    {
        // Converte a String em um array de caracteres
        char[] letras = palavra.toCharArray();

        int count = 0;

        for (int i = 0; i < letras.length; i++)
        {
            for (int j = i; j < letras.length; j++)
            {
                //compara as letras
                if (letras[i] == letras[j] && j != i)
                {
                    //caso a distância entre uma letra e outra seja maior que um, é adicionado mais um ao contador para indicar a existencia de um anagrama
                    if(j - i > 1)
                    {
                        count++;
                    }
                    // conta letras iguais
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
