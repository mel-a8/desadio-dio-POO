import br.com.dio.desafio.dominio.*;

import java.awt.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("descrição - Curso java");
        curso1.setCargaHorario(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("descrição - Curso js");
        curso2.setCargaHorario(4);

        Conteudo conteudo1 = new Curso();


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria java");
        mentoria1.setDescricao("descrição mentoria java");
        mentoria1.setData(LocalDate.now());


      /*  System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);

       */

        Bootcamp bootcamp   = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("descricao - Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devMelina = new Dev();
        devMelina.setNome("Melina");
        devMelina.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Melina: " + devMelina.getConteudosInscritos());
        devMelina.progredir();
        System.out.println("Conteudos Inscritos Melina: " + devMelina.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Melina: " + devMelina.getConteudosConcluidos());
        System.out.println("------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos João: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos Concluidos João: " + devJoao.getConteudosConcluidos());
        System.out.println("Conteudos Inscritos João: " + devJoao.getConteudosInscritos());

    }

}