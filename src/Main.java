import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Como Criar seu Plano de Estudos Usando GitHub");
        mentoria.setDescricao("Aprenda na prática a criar um repositório no GitHub com o objetivo de explorar a linguagem de marcação Markdown para criar um README.md de impacto. Para isso, criaremos um plano de estudos baseado nos conteúdos incríveis disponível no DIO Play.");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(mentoria);

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("Potência Tech powered by iFood - Java Beginners");
        bootCamp.setDescricao("O iFood chegou na DIO com uma super trilha para pessoas que querem ingressar no mercado tech! O Potência Tech" +
                " Powered by iFood - Java Beginners já está com inscrições abertas para pessoas de todo o Brasil, mas " +
                "voltado e focado em grupos sub-representados e pessoas de baixa renda. Uma trilha com conteúdos" +
                " completos, desafios de projetos, mentorias ao vivo e networking com a comunidade.  Ao final do programa, " +
                "ainda vai acontecer o Minha Carreira Tech, uma oportunidade de conhecer as empresas parceiras e ficar" +
                " disponível na plataforma de talentos da DIO e ainda poder ganhar prêmios pelo seu desempenho.");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(mentoria);


        Dev  dev = new Dev();
        dev.setNome("Rodrigo");
        dev.inscreverBootCamp(bootCamp);
        System.out.println("\n"+ dev.getNome() + " Está Inscrito no seguintes Conteúdos: " + " BootCamp-> "+ bootCamp.getNome() + "\n" + dev.getConteudoInscritos());
        dev.progredir();
        System.out.println("\nConteúdo Concluidos por "+ dev.getNome()+ ":\n" + dev.getConteudoConcluido());
        System.out.println("XP Obitida: " + dev.calcularTotalXp());





    }
}