import java.util.Random;

public class GeradorSenha {

    public static void main(String[] args) {
        int tamanhoSenha = 8; // tamanho padrão da senha
        if (args.length > 0) {
            // se um parâmetro for passado, usar como tamanho da senha
            tamanhoSenha = Integer.parseInt(args[0]);
        }
        String senha = gerarSenha(tamanhoSenha);
        System.out.println(senha);
    }
    
    public static String gerarSenha(int tamanho) {
        String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&*()_+-=";
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            int index = rand.nextInt(caracteres.length()); // obter um índice aleatório
            sb.append(caracteres.charAt(index)); // adicionar o caractere correspondente ao índice à senha
        }
        return sb.toString(); // retornar a senha gerada
    }

}
