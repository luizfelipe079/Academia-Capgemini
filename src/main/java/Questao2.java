public class Questao2
{

    public void senhaTam(String senha)
    {
        // Armazena o tamanho da senha
        int tamanho = senha.length();

        // Define o tamnho que a senha precisa ter
        int tamanhoMin = 6;

        // Se a senha tiver menos de 6 caracteres é impresso o valor que falta
        if(tamanhoMin - tamanho > 0)
        {
            System.out.println(tamanhoMin - tamanho);
        } else
        {
            System.out.println("Sua senha tem o tamanho necessário");
        }
    }
}
