import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("Java", "Curso de java", 60);
        System.out.println(curso);

        LocalDate dataMentoria = LocalDate.now().plusDays(2);
        System.out.println(LocalDate.now());
        System.out.println(dataMentoria);
        Mentoria mentoria = new Mentoria("Java na pratica", "Demonstrando uso de java", dataMentoria);
        System.out.println(mentoria);


    }
}