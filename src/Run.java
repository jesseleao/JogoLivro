import java.util.Scanner;
/*Autor: Jess� Augusto Santos
 * Nome do Jogo: ScapeGame
 * Atividade realizada no m�dulo de L�gica de Programa��o da imers�o Java Xpert
 */
public class Run {

	public static void main(String[] args) {
		Scanner medo = new Scanner(System.in);
		String acao;
		
		try {
			System.out.println("  Voc� acorda no meio da noite, assustado com um pesadelo que teve, ap�s recobrar os sentidos da realidade lembra-se do motivo, os jornais locais e a vizinhan�a so falam de uma coisa, uma sequencia de assassinatos que est�o acontecendo na sua regi�o.");
			Thread.sleep(25000);//25000
			
			System.out.println("  Voc� esfrega a m�o no rosto e decide tomar agua para acalmar os animos, abre a porta do quarto e tenta ascender as luzes, porem elas n�o funcionam \"Deve ter acabado a for�a!\", voc� afirma enquanto desce as escadas. Voc� vai at� a cozinha, abre a geladeira, pega a agua e toma, enquanto isso, voc� ouve um barulho na porta de tras, decide fechar a geladeira para verificar e se depara com a seguinte silhueta no vidro");
			Thread.sleep(40000);// 40000
			
			System.out.println("                                                     #@@@@@@@&&%&%#%%%");
			System.out.println("                                                  @@@@&%@&&&@@@&&&@&&%%%%");
			System.out.println("                                                @@@@&&@&%&&&&&&&&%%&&%&&&&%");
			System.out.println("                    @@@@(@                    /@@@@@@&%%####%%&&&&%&&@&&&&&&");
			System.out.println("               @@@@@@@@@@@&&                 @@@@@@&#(*,,,,,,/(%&&&&&&&&&&&&&");
			System.out.println("              @@@@@&@@@@@&@@&@@@            @@@@&@&%(#/,.   . .*/%&&@&&&&&&&&");
			System.out.println("             @@@@@&&&@@@@@&&&@@            @@@@@%%%%(,.@@*  ...  .&&&@%&@&&&&*");
			System.out.println("            @@@@@@@@&&@@@&&@@             @@@@&#,.@@@@@@@. ,,@@,  /%%&@&&&&&&");
			System.out.println("          @@@@@@@@@@&@@&@@@@@            @@@@( @@@@@@@@&. . @@@@. /%&@@@&@&&&");
			System.out.println("     @@%%@@@@@@@@@@@&@@&&&@@(           @@@@@/  @@@@#/,/.   @@@@@ .#@@@@&@&&");
			System.out.println("@@@@@@@@@@@@@@@@@@@@&&@@@@@@          /@@@@@@#*,*,*///(,    @&@@@@* #@@@@@&(");
			System.out.println("@@@@&@@@@@@@@@@@@@@@@@@@@@@,          @@@@@@@@@%#((/ @@&@%    @@@@@. /@@@@@");
			System.out.println("@@@&@@@@@&@@@@@@@@@%//(#@@@@         ,@@@@@@@@@&#(/..        .       @@@@@@");
			System.out.println("@@@&@@@@@&@@@      **....             @@@@@@@@@%#/ @@@@       .*/((@@@&@@@");
			System.out.println("@@@&&@@@@&@@&@     *,.....            @@@@@@@@@#.@@@@@@@@*      @@@@@@&@@@");
			System.out.println("@@@@@&@@@&@@&&@@   *,.....          @&@@@@@@@@@(/@@@@@@@@*     @@@@@@@@@@@");
			System.out.println("@@@@@@@@@&@@&&&@@@&,,.....@     @@@@@@@@@@@&@@@.@@@@@@@@#    @@@@@@@@@@@@");
			System.out.println("@@@@@@@@@@@@&&&&@@@,,  , @&@@@&@@@@@@@@@@@@&@@@ @@&&&&&/  @@@@@@@@@@@&@@");
			System.out.println("@@@@@@@@@&@&&@@@@@@,.  , @@@@@@@@@@@@@@@@@@&@@@.@@&&&%.(@@@@@@@@@@@@@&@@,");
			System.out.println("@@@@&@@@&&@@@&@@@@@,.  , @@@@@@@@@@@@@@@@@@&@@%@&@@@@ @@@@@@@@@@@@@@@&@@@@&");
			System.out.println("@@@&&@@@&&@@@@&@@@@@.    @@@@@@@@@@@@@@@@@@@@@ &@@@@ @@@@@@@@@@@@@@@&@@@@@&@@");
			System.out.println("@@@&&&@@&@@@@&@@@@@@.    @@@@@@@@@@@@@@@@@@@@@ @@@/ @@@@@@@@@@@@@@&@&@@@@@@@@&@,");
			System.out.println("@@@&&&@@&@@@@@&@@@@@@    @@@@@@@@@@@@@@@@@@@@@@@&@@@@@@@@@@@@@@@@&@@&@@@@@@&&&@&");
			System.out.println("@@@@&&&&@@@@@@@@@@@@@@@  #@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("@@@@&&&&&@@@@@@@@@@@@@@@@ @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&@@@@&@@&@@@");
			System.out.println("@@@@&&&&@@@&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&@@@@@@");
			System.out.println("@@@@&&&&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&@@@&@@");
			System.out.println("@@@@@&&&&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&@@@@@@");
			System.out.println("@@@@@&&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&@@@@@@@");
			System.out.println("@@@@@&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&@@@@@@@");
			System.out.println(" ");
			
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("- O que voc� faz? [Corre] para a porta da frente ou [Sobe] as escadas para ir ao seu quarto?");
		acao = medo.next();
		
		if (acao.equalsIgnoreCase("Corre")) {
			System.out.println("- A porta esta trancada! A silhuta esta chutando a porta! As chaves est�o ao lado da geladeira! Voc� vai [Pegar] as chaves ou [Subir] as escadas");
			acao = medo.next();
			
			if (acao.equalsIgnoreCase("Pegar")) {
				System.out.println("- Ap�s correr para a geladeira voc� percebe que as dobradi�as da porta foram estouradas e o assassino corre em sua dira��o, indo um de encontro com o outro! Voc� pega as chaves e corre para a porta, porem � apunhalado pelas costas enquanto tenta abri-la!");
			}else {
				System.out.println("- Voc� ouve as dobradi�as da porta estourando enquanto sobe as escadas, voc� pode entrar no seu [Quarto] ou se esconder no [Armario], em qual voc� decide ir?");
				acao = medo.next();
				
			if (acao.equalsIgnoreCase("Quarto")){
				System.out.println("- Seu quarto n�o tem trava, porem tem um [Guarda] roupas que voc� pode se esconder ou uma [Janela] para voc� tentar abrir e fugir, sua intui��o te diz? ");
				acao = medo.next();
				
				if (acao.equalsIgnoreCase("Guarda")) {
					System.out.println("- Voc� corre para o guarda roupas e o fecha, logo ap�s fechar o assassino entra no quarto, verifica a janela que esta fechada e logo em seguida abre o guarda roupas, e mata voc�!");
				}else {
					System.out.println("- Voc� corre para abrir a janela, ap�s abrir o assassino entra no quarto, voc� tenta pular, mas � pego pela perna, puxado e esfaqueado!");
				}
			}else {
				System.out.println("- Voc� entra no armario correndo, porem o assassino o ve entrando, ele abre o armario e voc� � morto!");
			}
			}
		}else {
			System.out.println("- Trope�ando pelo caminho, voc� sobe as escadas e se depara com duas op��es, a porta do [Armario] e a porta do seu [Quarto]");
			acao = medo.next();
			
			if (acao.equalsIgnoreCase("Quarto")) {
				System.out.println("- Voc� se depara com duas dificeis escolhas, se [Esconder] no guarda roupas ou [Abrir] as janelas, por qual voc� opta?");
				acao = medo.next();
				
				if (acao.equalsIgnoreCase("Esconder")) {
					System.out.println("- Ap�s se esconder no armario voc� ouve as dobradi�as da porta estourando, o assassino entra rapido no quarto, ve a janela fechada e vai verificar o armario. Ele o encontra e o mata!");
				}else {
					System.out.println("- Ap�s abrir a janela voc� ouve as dobradi�as da porta estourando e se ve dividido entre [Pular] do segundo andar ou quebrar a janela e se [Esconder] no armario");
					acao = medo.next();
					
					if (acao.equalsIgnoreCase("Pular")) {
						System.out.println("- Voc� torce o tornozelo na queda e solta um grito lancinante, alto o suficiente para a vizinhan�a acordar e ver o que estava acontecendo. O assassino desce as escadas, vai at� voc� e o mata. Os vizinhos identificam a silhueta e a mascara do assassino, seus relatos juntamente a velocidade de a��o da policia foram precisos o suficiente para pega-lo pouco depois do crime");
					}else {
						System.out.println("- Voc� se esconde no armario, o assassino logo chega no quarto e se depara com a janela aberta e quebrada, preocupado de ter perdido uma vitima que havia visto seu rosco, ele corre para o andar de baixo e tenta encotra-lo do lado de fora de casa. Ap�s ouvir o som da janela se quebrando, os vizinhos foram verificar o que havia acontecido e, ao se deparar com aquela pessoa saindo por tras de uma casa com a porta estourada e a janela do segundo andar quebrada, decidem ligar para a policia que chega rapidamente ao local, voc� pode [Ir] at� a Janela e gritar por ajuda aos policiais ou [Continuar] escondido");
						acao = medo.next();
						
						if (acao.equalsIgnoreCase("Ir")){
							System.out.println("- Tanto os policiais quanto o assassino o vem, em um ultimo ato de cumprir seu desejo de matar, o assassino corre at� as escadas e antes que a policia chegue ao local, voc� � esfaqueado e, logo em seguida, o assassino � pego em flagrante e preso!");
						}else {
							System.out.println("- Ap�s a prender o suspeito a policia investiga a casa e o encontra, voc� presta depoimento juntamente aos vizinhos e o assassino em s�rie � preso!");
						}
					}
				}
				
				
			}else {
				System.out.println("- Voc� se esconde no armario, o assassino quebra as dobradi�as, sobe as escadas e entra no quarto e deixa a porta aberta, voc� [Sai] do armario e tenta correr para as portas dos fundos e gritar por socorro ou [Permanece] no armario?");
				acao = medo.next();
				
				if (acao.equalsIgnoreCase("Sai")) {
					System.out.println("- Voc� sai correndo escadas abaixo, o assassino percebe e corre em sua dire��o, logo ap�s sair de casa voc� grita, porem ele o alcan�a, voc� � esfaqueado pelas costas e morre. Ap�s ouvir seus gritos os vizinhos v�o at� a janela, identificam a silhueta e a mascara do assassino, seus relatos juntamente a velocidade de a��o da policia foram precisos o suficiente para pega-lo pouco depois do crime.");
				}else {
					System.out.println("- Ap�s verificar o quarto, o assassino por exclus�o foi verificar o armario em que voc� estava escondido, ao abrir ele simplesmente o matou");
				}
			}
			
			
		}
		medo.close();
	}

}