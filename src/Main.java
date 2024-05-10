import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Exemplo de descrição do curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Exemplo de descrição do curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Exemplo de descrição da mentoria de Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Exemplo de descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Reginaldo");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Reginaldo:" + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("--");
        System.out.println("Conteúdos Inscritos Reginaldo:" + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Reginaldo:" + dev1.getConteudosConcluidos());
        System.out.println("XP:" + dev1.calcularTotalXp());

        System.out.println("------------");

        Dev dev2 = new Dev();
        dev2.setNome("Simone");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Simone:" + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("--");
        System.out.println("Conteúdos Inscritos Simone:" + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Simone:" + dev2.getConteudosConcluidos());
        System.out.println("XP:" + dev2.calcularTotalXp());

    }
}
