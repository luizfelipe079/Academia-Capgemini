public class Questao1
{

    public void escadinha(int n)
    {
        // inicializa a variável espaços que vai ajustar a formatação da escada
        String espaços = "";

        for (int i = 1; i <= n; i++)
        {
            int j = i;
            // Loop para determinar a quantidade de espaços necessários por degrau da escada
            for (int a = i; a <= n -1; a++)
            {
                espaços+= " ";
            }

            // Ajusta o espaço
            System.out.print(espaços);

            // Imprime o número determinado de * de acordo com o valor passado
            while (j > 0)
            {
                System.out.print("*");
                j--;
            }

            //Reinicia a variável espaços
            espaços = "";

            //Quebra linha para descer o degrau
            System.out.print("\n");
        }
    }
}
