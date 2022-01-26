import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Abstraindo um Bootcamp Usando Orientacao a Objetos em Java");
        curso1.setDescricao("Bootcamp POO Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Entendendo Metodos Java");
        curso2.setDescricao("Entenda o que são metodos e os principais conceitos.");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria GFT Start 3");
        mentoria.setDescricao("A tecnologia nos motiva, olhamos para as oportunidades com entusiasmo");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp GFT Java");
        bootcamp.setDescricao("Descrição Bootcamp GFT com base em Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devIgor = new Dev();
        devIgor.setNome("Igor");
        devIgor.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Igor:" + devIgor.getConteudosInscritos());
        devIgor.progredir();
        devIgor.progredir();
        devIgor.progredir();
        System.out.println("-*-*-");
        System.out.println("Conteúdos Inscritos Igor:" + devIgor.getConteudosInscritos());
        System.out.println("-*-*-");
        System.out.println("Conteúdos Concluídos Igor:" + devIgor.getConteudosConcluidos());
        System.out.println("XP:" + devIgor.calcularTotalXp());

        System.out.println("------******------");

        Dev devAline = new Dev();
        devAline.setNome("Aline");
        devAline.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Aline:" + devAline.getConteudosInscritos());
        devAline.progredir();
        devAline.progredir();
        System.out.println("-*-*-");
        System.out.println("Conteúdos Inscritos Aline:" + devAline.getConteudosInscritos());
        System.out.println("-*-*-");
        System.out.println("Conteúdos Concluidos Aline:" + devAline.getConteudosConcluidos());
        System.out.println("XP:" + devAline.calcularTotalXp());

    }

}