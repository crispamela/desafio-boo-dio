import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev7;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
public static void main(String[] args) {
    Curso curso1 = new Curso();
    curso1.setTitulo("curso java");
    curso1.setDescricao("descricao curso java");
    curso1.setCargaHoraria(8);

    Curso curso2 = new Curso();
    curso1.setTitulo("curso js");
    curso1.setDescricao("descricao curso js");
    curso1.setCargaHoraria(4);


    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("mentoria java");
    mentoria.setDescricao("descrição mentoria java");
    mentoria.setData(LocalDate.now());

    System.out.println(curso1);
    System.out.println(curso2);
    System.out.println(mentoria);

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp Java Developer");
    bootcamp.setDescricao("Descrição Bootcamp Java Developer");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria);

    Dev7 dev7Pamela = new Dev7();
    dev7Pamela.setNome("Pamela");
    dev7Pamela.inscreverBootcamp(bootcamp);
    System.out.println("Conteúdos Inscritos Pamela:" + dev7Pamela.getConteudosInscritos());
    dev7Pamela.progredir();
    System.out.println("-");
    System.out.println("Conteúdos Inscritos Pamela:" + dev7Pamela.getConteudosInscritos());
    System.out.println("Conteúdos Concluidos Pamela:" + dev7Pamela.getConteudosInscritos());
    System.out.println("XP:" + dev7Pamela.calcularTotalXp());

    System.out.println("-----");

    Dev7 devCamila = new Dev7();
    devCamila.setNome ("Camila");
    devCamila.inscreverBootcamp(bootcamp);
    System.out.println(("Conteudos Inscritos:" +devCamila.getConteudosInscritos()));
    devCamila.progredir();
    System.out.println("-");
    System.out.println(("Conteudos Inscritos:" +devCamila.getConteudosInscritos()));
    System.out.println("Conteúdos Concluidos Camila:" + dev7Pamela.getConteudosInscritos());
    System.out.println("XP:" + devCamila.calcularTotalXp());



}
}
