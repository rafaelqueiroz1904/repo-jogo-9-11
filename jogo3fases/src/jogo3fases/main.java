package jogo3fases;
import javax.swing.JOptionPane;
import java.util.Random;
public class main {

	public static void main(String[] args) {
		
JOptionPane.showMessageDialog(null, "Jogo das 3 fases.");

String nome = JOptionPane.showInputDialog("Digite seu nome");

JOptionPane.showMessageDialog(null, "Bem-vindo(a), " + nome + "!");

int resposta = JOptionPane.showConfirmDialog(null, "Deseja iniciar a partida?", null, JOptionPane.YES_NO_OPTION);
	
	if (resposta == JOptionPane.YES_OPTION) { 
		JOptionPane.showMessageDialog(null, "O jogo começará");}
	else { 	JOptionPane.showMessageDialog(null, "Jogo Cancelado");}
		
	JOptionPane.showMessageDialog(null, "Jogo 1 = Pedra, papel e tesoura");
	
	int vitorias = 0;
	while (vitorias < 2) {
		
	Random sorteio = new Random();
	int computador = sorteio.nextInt(3) + 1;
	
	int jogador = Integer.parseInt(
		    JOptionPane.showInputDialog(null,
		    "Escolha: 1 - Pedra; 2 - Papel; 3 - Tesoura")
		);
	  if (jogador < 1 || jogador > 3) {

	        JOptionPane.showMessageDialog(null, "Opção inválida!");
	        continue;

	    }
	  
	if (computador == 1) { 
		JOptionPane.showMessageDialog(null, "Escolha do adversário: Pedra");}
	else if (computador == 2) {
		JOptionPane.showMessageDialog(null, "Escolha do adversário: Papel");}
	else { 	JOptionPane.showMessageDialog(null, "Escolha do adversário: Tesoura");}
	
	


		    if (jogador == computador) {

		        JOptionPane.showMessageDialog(null, "Empate!");}
    else if (
	(jogador == 1 && computador == 3) ||
    (jogador == 2 && computador == 1) ||
	(jogador == 3 && computador == 2)
		    ) {

		        JOptionPane.showMessageDialog(null, "Você venceu!");
		        vitorias++;

		    } else {

		        JOptionPane.showMessageDialog(null, "O adversário venceu!");

		    }

		}
	
	JOptionPane.showMessageDialog(null, "Parabéns! Você passou para a próxima fase!"); 
	
	
	int pontos = 0;
	
	do {
	    pontos = 0;

	String resposta1 = JOptionPane.showInputDialog(null,
	    "Pergunta 1: Qual é a função do comando System.out.println()?" +
	    " 1 - Receber informações do usuário; " +
	    " 2 - Exibir informações no console;" +
	    " 3 - Criar uma variável; "
	);

	if (resposta1.equals("2")) {

	    JOptionPane.showMessageDialog(null, "Resposta correta! +15 pontos");
	    pontos += 15;

	} else {

	    JOptionPane.showMessageDialog(null, "Resposta incorreta!");

	}
	
	String resposta2 = JOptionPane.showInputDialog(null,
		    "Pergunta 2:Qual tipo de dado é utilizado para armazenar números inteiros?" +
		    " 1 - int; " +
		    " 2 - String; " +
		    " 3 - boolean; "
		);

		if (resposta2.equals("1")) {
		    JOptionPane.showMessageDialog(null, "Resposta correta! +15 pontos");
		    pontos += 15;
		} else {
		    JOptionPane.showMessageDialog(null, "Resposta incorreta!");
		}
		
		String resposta3 = JOptionPane.showInputDialog(null,
			    "Pergunta 3: Qual estrutura é utilizada para tomar decisões em Java?" +
			    " 1 - if/else; " +
			    " 2 - import; " +
			    " 3 - package; "
			);

			if (resposta3.equals("1")) {
			    JOptionPane.showMessageDialog(null, "Resposta correta! +15 pontos");
			    pontos += 15;
			} else {
			    JOptionPane.showMessageDialog(null, "Resposta incorreta!");
			}
			
			String resposta4 = JOptionPane.showInputDialog(null,
				    "Pergunta 4: Qual comando permite receber informações digitadas pelo usuário com JOptionPane?" +
				    " 1 - showMessageDialog; " +
				    " 2 - showInputDialog; " +
				    " 3 - showConfirmDialog; "
				);

				if (resposta4.equals("2")) {
				    JOptionPane.showMessageDialog(null, "Resposta correta! +15 pontos");
				    pontos += 15;
				} else {
				    JOptionPane.showMessageDialog(null, "Resposta incorreta!");
				}
				
				String resposta5 = JOptionPane.showInputDialog(null,
					    "Pergunta 5: Qual operador é utilizado para comparar se dois valores são iguais?" +
					    " 1 - =; " +
					    " 2 - !=; " +
					    " 3 - ==; "
					);

					if (resposta5.equals("3")) {
					    JOptionPane.showMessageDialog(null, "Resposta correta! +15 pontos");
					    pontos += 15;
					} else {
					    JOptionPane.showMessageDialog(null, "Resposta incorreta!");
					}
					
					JOptionPane.showMessageDialog(null,
						    "Fim da Fase 2!\nSua pontuação: " + pontos + " de 75 pontos."
						);

						if (pontos >= 60) {
						    JOptionPane.showMessageDialog(null, "Parabéns! Você passou para a Fase 3!");
						} else {
						    JOptionPane.showMessageDialog(null, "Você não atingiu 60 pontos. Tente novamente!");
						}
	} while (pontos < 60);
	
	
	int pontosFase3 = 0;


	JOptionPane.showMessageDialog(null,
	    "FASE 3 - DESAFIO DO FUTEBOL.");

	String respostaF1 = JOptionPane.showInputDialog(null,
	    "Pergunta 1: Qual clube brasileiro é conhecido como Verdão?" +
	    " 1 - Palmeiras; " +
	    " 2 - Corinthians; " +
	    " 3 - Santos ");

	if (respostaF1.equals("1")) {
	    JOptionPane.showMessageDialog(null, "Correto! +15 pontos");
	    pontosFase3 += 15;
	} else {
	    JOptionPane.showMessageDialog(null, "Resposta incorreta!");
	}
	
	String respostaF2 = JOptionPane.showInputDialog(null,
		    "Pergunta 2: Qual seleção venceu a Copa do Mundo de 2002? " +
		    " 1 - Alemanha; " +
		    " 2 - Brasil; " +
		    " 3 - Itália ");

		if (respostaF2.equals("2")) {
		    JOptionPane.showMessageDialog(null, "Correto! +15 pontos");
		    pontosFase3 += 15;
		} else {
		    JOptionPane.showMessageDialog(null, "Resposta incorreta!");
		}

		String respostaF3 = JOptionPane.showInputDialog(null,
		    "Pergunta 3: Qual jogador é conhecido como Rei do Futebol?" +
		    " 1 - Cristiano Ronaldo; " +
		    " 2 - Lionel Messi; " +
		    " 3 - Pelé ");

		if (respostaF3.equals("3")) {
		    JOptionPane.showMessageDialog(null, "Correto! +15 pontos");
		    pontosFase3 += 15;
		} else {
		    JOptionPane.showMessageDialog(null, "Resposta incorreta!");
		}
		
		
		String respostaF4 = JOptionPane.showInputDialog(null,
			    "Pergunta 4: Em qual país fica o estádio Camp Nou?" +
			    " 1 - Espanha; " +
			    " 2 - Itália; " +
			    " 3 - Inglaterra ");

			if (respostaF4.equals("1")) {
			    JOptionPane.showMessageDialog(null, "Correto! +15 pontos");
			    pontosFase3 += 15;
			} else {
			    JOptionPane.showMessageDialog(null, "Resposta incorreta!");
			}

			String respostaF5 = JOptionPane.showInputDialog(null,
			    "Pergunta 5: Qual clube venceu a Champions League de 2023? " +
			    " 1 - Manchester City; " +
			    " 2 - Real Madrid; " +
			    " 3 - Inter de Milão ");

			if (respostaF5.equals("1")) {
			    JOptionPane.showMessageDialog(null, "Correto! +15 pontos");
			    pontosFase3 += 15;
			} else {
			    JOptionPane.showMessageDialog(null, "Resposta incorreta!");
			}

			
			String respostaF6 = JOptionPane.showInputDialog(null,
			    "Pergunta 6: Quantos jogadores de cada equipe começam uma partida?" +
			    " 1 - 10; " +
			    " 2 - 11; " +
			    " 3 - 12 ");

			if (respostaF6.equals("2")) {
			    JOptionPane.showMessageDialog(null, "Correto! +15 pontos");
			    pontosFase3 += 15;
			} else {
			    JOptionPane.showMessageDialog(null, "Resposta incorreta!");
			}

			String respostaF7 = JOptionPane.showInputDialog(null,
			    "Pergunta 7: Qual seleção venceu a Copa do Mundo de 2018?" +
			    " 1 - Argentina; " +
			    " 2 - França; " +
			    " 3 - Croácia ");

			if (respostaF7.equals("2")) {
			    JOptionPane.showMessageDialog(null, "Correto! +15 pontos");
			    pontosFase3 += 15;
			} else {
			    JOptionPane.showMessageDialog(null, "Resposta incorreta!");
			}

			String respostaF8 = JOptionPane.showInputDialog(null,
			    "Pergunta 8: Qual é o maior rival histórico do Palmeiras?" +
			    " 1 - São Paulo; " +
			    " 2 - Santos; " +
			    " 3 - Corinthians ");

			if (respostaF8.equals("3")) {
			    JOptionPane.showMessageDialog(null, "Correto! +15 pontos");
			    pontosFase3 += 15;
			} else {
			    JOptionPane.showMessageDialog(null, "Resposta incorreta!");
			}

			String respostaF9 = JOptionPane.showInputDialog(null,
			    "Pergunta 9: Em qual país surgiu o futebol?" +
			    " 1 - Inglaterra; " +
			    " 2 - Brasil; " +
			    " 3 - Argentina ");

			if (respostaF9.equals("1")) {
			    JOptionPane.showMessageDialog(null, "Correto! +15 pontos");
			    pontosFase3 += 15;
			} else {
			    JOptionPane.showMessageDialog(null, "Resposta incorreta!");
			}

			String respostaF10 = JOptionPane.showInputDialog(null,
			    "Pergunta 10: Qual clube é conhecido como Merengue?" +
			    " 1 - Barcelona; " +
			    " 2 - Real Madrid; " +
			    " 3 - Atlético de Madrid ");

			if (respostaF10.equals("2")) {
			    JOptionPane.showMessageDialog(null, "Correto! +15 pontos");
			    pontosFase3 += 15;
			} else {
			    JOptionPane.showMessageDialog(null, "Resposta incorreta!");
			}

			JOptionPane.showMessageDialog(null,
			    "FIM DA FASE 3!" +
			    "Pontuação: " + pontosFase3 + " de 150 pontos.");
			int pontuacaoFinal = (vitorias * 15) + pontos + pontosFase3;

			JOptionPane.showMessageDialog(null,
			    "FIM DE JOGO!" +
			    "Jogador: " + nome + ". " +
			    " Fase 1: " + (vitorias * 15) + " pontos; " +
			    " Fase 2: " + pontos + " pontos; " +
			    " Fase 3: " + pontosFase3 + " pontos; " +
			    " Pontuação final: " + pontuacaoFinal);
	}

}
