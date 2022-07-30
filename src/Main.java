import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso Java 2022 pela DIO usando a IDE Intellij");
        curso1.setCargaHoraria(8);


        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Springboot");
        curso2.setDescricao("Curso Springboot 2022 pela DIO");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria Java ministrada pela DIO");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devEliane = new Dev();
        devEliane.setNome("Eliane");
        devEliane.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Incritos Eliane:" + devEliane.getConteudosInscritos());
        devEliane.progredir();
        devEliane.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Incritos Eliane:" + devEliane.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Eliane:" + devEliane.getConteudosConcluidos());
        System.out.println("XP:" + devEliane.calcularXp());

        System.out.println("-----------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Incritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Incritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Conclúidos Camila" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularXp());




    }
}
