import java.util.Scanner;
/*Autor: Jessé Augusto Santos
 * Nome do Jogo: ScapeGame
 * Atividade realizada no módulo de Lógica de Programação da imersão Java Xpert
 */
public class Run {

	public static void main(String[] args) {
		Scanner medo = new Scanner(System.in);
		String acao;
		
		try {
			System.out.println("  Você acorda no meio da noite, assustado com um pesadelo que teve, após recobrar os sentidos da realidade lembra-se do motivo, os jornais locais e a vizinhança so falam de uma coisa, uma sequencia de assassinatos que estão acontecendo na sua região.");
			Thread.sleep(25000);//25000
			
			System.out.println("  Você esfrega a mão no rosto e decide tomar agua para acalmar os animos, abre a porta do quarto e tenta ascender as luzes, porem elas não funcionam \"Deve ter acabado a força!\", você afirma enquanto desce as escadas. Você vai até a cozinha, abre a geladeira, pega a agua e toma, enquanto isso, você ouve um barulho na porta de tras, decide fechar a geladeira para verificar e se depara com a seguinte silhueta no vidro");
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
		
		System.out.println("- O que você faz? [Corre] para a porta da frente ou [Sobe] as escadas para ir ao seu quarto?");
		acao = medo.next();
		
		if (acao.equalsIgnoreCase("Corre")) {
			System.out.println("- A porta esta trancada! A silhuta esta chutando a porta! As chaves estão ao lado da geladeira! Você vai [Pegar] as chaves ou [Subir] as escadas");
			acao = medo.next();
			
			if (acao.equalsIgnoreCase("Pegar")) {
				System.out.println("- Após correr para a geladeira você percebe que as dobradiças da porta foram estouradas e o assassino corre em sua diração, indo um de encontro com o outro! Você pega as chaves e corre para a porta, porem é apunhalado pelas costas enquanto tenta abri-la!");
			}else {
				System.out.println("- Você ouve as dobradiças da porta estourando enquanto sobe as escadas, você pode entrar no seu [Quarto] ou se esconder no [Armario], em qual você decide ir?");
				acao = medo.next();
				
			if (acao.equalsIgnoreCase("Quarto")){
				System.out.println("- Seu quarto não tem trava, porem tem um [Guarda] roupas que você pode se esconder ou uma [Janela] para você tentar abrir e fugir, sua intuição te diz? ");
				acao = medo.next();
				
				if (acao.equalsIgnoreCase("Guarda")) {
					System.out.println("- Você corre para o guarda roupas e o fecha, logo após fechar o assassino entra no quarto, verifica a janela que esta fechada e logo em seguida abre o guarda roupas, e mata você!");
				}else {
					System.out.println("- Você corre para abrir a janela, após abrir o assassino entra no quarto, você tenta pular, mas é pego pela perna, puxado e esfaqueado!");
				}
			}else {
				System.out.println("- Você entra no armario correndo, porem o assassino o ve entrando, ele abre o armario e você é morto!");
			}
			}
		}else {
			System.out.println("- Tropeçando pelo caminho, você sobe as escadas e se depara com duas opções, a porta do [Armario] e a porta do seu [Quarto]");
			acao = medo.next();
			
			if (acao.equalsIgnoreCase("Quarto")) {
				System.out.println("- Você se depara com duas dificeis escolhas, se [Esconder] no guarda roupas ou [Abrir] as janelas, por qual você opta?");
				acao = medo.next();
				
				if (acao.equalsIgnoreCase("Esconder")) {
					System.out.println("- Após se esconder no armario você ouve as dobradiças da porta estourando, o assassino entra rapido no quarto, ve a janela fechada e vai verificar o armario. Ele o encontra e o mata!");
				}else {
					System.out.println("- Após abrir a janela você ouve as dobradiças da porta estourando e se ve dividido entre [Pular] do segundo andar ou quebrar a janela e se [Esconder] no armario");
					acao = medo.next();
					
					if (acao.equalsIgnoreCase("Pular")) {
						System.out.println("- Você torce o tornozelo na queda e solta um grito lancinante, alto o suficiente para a vizinhança acordar e ver o que estava acontecendo. O assassino desce as escadas, vai até você e o mata. Os vizinhos identificam a silhueta e a mascara do assassino, seus relatos juntamente a velocidade de ação da policia foram precisos o suficiente para pega-lo pouco depois do crime");
					}else {
						System.out.println("- Você se esconde no armario, o assassino logo chega no quarto e se depara com a janela aberta e quebrada, preocupado de ter perdido uma vitima que havia visto seu rosco, ele corre para o andar de baixo e tenta encotra-lo do lado de fora de casa. Após ouvir o som da janela se quebrando, os vizinhos foram verificar o que havia acontecido e, ao se deparar com aquela pessoa saindo por tras de uma casa com a porta estourada e a janela do segundo andar quebrada, decidem ligar para a policia que chega rapidamente ao local, você pode [Ir] até a Janela e gritar por ajuda aos policiais ou [Continuar] escondido");
						acao = medo.next();
						
						if (acao.equalsIgnoreCase("Ir")){
							System.out.println("- Tanto os policiais quanto o assassino o vem, em um ultimo ato de cumprir seu desejo de matar, o assassino corre até as escadas e antes que a policia chegue ao local, você é esfaqueado e, logo em seguida, o assassino é pego em flagrante e preso!");
						}else {
							System.out.println("- Após a prender o suspeito a policia investiga a casa e o encontra, você presta depoimento juntamente aos vizinhos e o assassino em série é preso!");
						}
					}
				}
				
				
			}else {
				System.out.println("- Você se esconde no armario, o assassino quebra as dobradiças, sobe as escadas e entra no quarto e deixa a porta aberta, você [Sai] do armario e tenta correr para as portas dos fundos e gritar por socorro ou [Permanece] no armario?");
				acao = medo.next();
				
				if (acao.equalsIgnoreCase("Sai")) {
					System.out.println("- Você sai correndo escadas abaixo, o assassino percebe e corre em sua direção, logo após sair de casa você grita, porem ele o alcança, você é esfaqueado pelas costas e morre. Após ouvir seus gritos os vizinhos vão até a janela, identificam a silhueta e a mascara do assassino, seus relatos juntamente a velocidade de ação da policia foram precisos o suficiente para pega-lo pouco depois do crime.");
				}else {
					System.out.println("- Após verificar o quarto, o assassino por exclusão foi verificar o armario em que você estava escondido, ao abrir ele simplesmente o matou");
				}
			}
			
			
		}
		medo.close();
	}

}