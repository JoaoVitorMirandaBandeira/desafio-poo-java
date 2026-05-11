import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("Java", "Curso de java", 3);
        System.out.println(curso);
        LocalDate dataMentoria = LocalDate.now().plusDays(2);
        Mentoria mentoria = new Mentoria("Java na pratica", "Demonstrando uso de java", dataMentoria);
        System.out.println(mentoria);

        System.out.println("============\n");
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp");
        bootcamp.setDescricao("Bootcamp");
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(curso);
        System.out.println(bootcamp);

        System.out.println("============\n");

        Dev joao = new Dev();
        joao.setNome("Joao");
        joao.inscreverBootcamp(bootcamp);
        System.out.println(joao);

        System.out.println("============\n");
        joao.progredir();
        System.out.println(joao);
        System.out.println(joao.calcularTotalXp());
        joao.progredir();
        System.out.println(joao.calcularTotalXp());
    }
}