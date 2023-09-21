package br.com.senac.inicializacao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import br.com.senac.entity.Aluno;
import br.com.senac.entity.Professor;
import br.com.senac.service.AlunoService;
import br.com.senac.service.ProfessorService;

@Component
public class Init implements ApplicationListener<ContextRefreshedEvent> {
	
	@Autowired
	private AlunoService alunoService;
	
	@Autowired
	private ProfessorService professorService;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event){
//		
//		Aluno aluno1 = new Aluno();
//		aluno1.setEmail("lucas@gmail.com");
//		aluno1.setNome("Lucas");
//		aluno1.setSobreNome("Silva");
//		alunoService.salvar(aluno1);
//		
//		Aluno aluno2 = new Aluno();
//		aluno2.setEmail("gabriel@gmail.com");
//		aluno2.setNome("Gabriel");
//		aluno2.setSobreNome("Silva");
//		alunoService.salvar(aluno2);
//		
//		Aluno aluno3 = new Aluno();
//		aluno3.setEmail("karen@gmail.com");
//		aluno3.setNome("Karen");
//		aluno3.setSobreNome("Silva");
//		alunoService.salvar(aluno3);
//		
//		Professor professor1 = new Professor();
//		professor1.setEmail("marcelo@gmail.com");
//		professor1.setNome("Marcelo");
//		professor1.setSobreNome("Estruc");
//		professorService.salvar(professor1);
//		
//		
//		
//		List<Aluno> listaAlunos = alunoService.buscarTodosAlunos();
//		listaAlunos.forEach(aluno -> System.out.println(aluno.getNome()));
//		
//		List<Professor> listaProfessores = professorService.buscarTodosProfessores();
//		listaProfessores.forEach(professor -> System.out.println(professor.getNome()));
//		
//		//Boolean flag = alunoService.deleteAluno(23);
//		//System.out.println(flag);
//		
//		Aluno alunoAlterado = new Aluno();
//		alunoAlterado.setEmail("lucas@gmail.com");
//		alunoAlterado.setNome("Luccass");
//		aluno1.setSobreNome("Silva");
//		Aluno alunoAtualizado = alunoService.updateAluno(1, alunoAlterado);
//		System.out.println("Aluno alterado: " + alunoAtualizado.getEmail());

	}
	
	
}
