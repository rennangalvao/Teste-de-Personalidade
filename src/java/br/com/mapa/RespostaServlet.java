/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mapa;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rennanbrito
 */
public class RespostaServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String questao1 = request.getParameter("questao1");
            
        String questao2 = request.getParameter("questao2");
        
        String questao3 = request.getParameter("questao2");
        
        String questao4 = request.getParameter("questao4");
        
        String questao5 = request.getParameter("questao5");
       
        String questao6 = request.getParameter("questao6");
        
        String questao7 = request.getParameter("questao7");
        
        String questao8 = request.getParameter("questao8");
        
        
         int respostaQuestao1 = 0;
         int respostaQuestao2 = 0;
         int respostaQuestao3 = 0;
         int respostaQuestao4 = 0;
         int respostaQuestao5 = 0;
         int respostaQuestao6 = 0;
         int respostaQuestao7 = 0;
         int respostaQuestao8 = 0;
         
         int resultadoResposta = 0;
         
         switch (questao1){
            case "a":
                 respostaQuestao1 = 4;
                 break;
            case "b":
                respostaQuestao1 = 2;
                break;
            case "c":
                respostaQuestao1 = 3;
                break;
            case "d":
                respostaQuestao1 = 1;
                break;
         }
         switch (questao2){
            case "a":
                 respostaQuestao2 = 4;
                 break;
            case "b":
                respostaQuestao2 = 3;
                break;
            case "c":
                respostaQuestao2 = 2;
                break;
            case "d":
                respostaQuestao2 = 1;
                break;
         }
         switch (questao3){
            case "a":
                 respostaQuestao3 = 3;
                 break;
            case "b":
                respostaQuestao3= 4;
                break;
            case "c":
                respostaQuestao3 = 1;
                break;
            case "d":
                respostaQuestao3 = 2;
                break;
         }
         switch (questao4){
            case "a":
                 respostaQuestao4 = 1;
                 break;
            case "b":
                respostaQuestao4 = 4;
                break;
            case "c":
                respostaQuestao4 = 2;
                break;
            case "d":
                respostaQuestao4 = 3;
                break;
         }
         switch (questao5){
            case "a":
                 respostaQuestao5 = 1;
                 break;
            case "b":
                respostaQuestao5 = 2;
                break;
            case "c":
                respostaQuestao5 = 3;
                break;
            case "d":
                respostaQuestao5 = 4;
                break;
         }
         switch (questao6){
            case "a":
                 respostaQuestao6 = 2;
                 break;
            case "b":
                respostaQuestao6 = 1;
                break;
            case "c":
                respostaQuestao6 = 4;
                break;
            case "d":
                respostaQuestao6 = 3;
                break;
         }
         switch (questao7){
            case "a":
                 respostaQuestao7 = 3;
                 break;
            case "b":
                respostaQuestao7 = 1;
                break;
            case "c":
                respostaQuestao7 = 2;
                break;
            case "d":
                respostaQuestao7 = 4;
                break;
         }
         switch (questao8){
            case "a":
                 respostaQuestao8 = 2;
                 break;
            case "b":
                respostaQuestao8 = 1;
                break;
            case "c":
                respostaQuestao8 = 3;
                break;
            case "d":
                respostaQuestao8 = 4;
                break;
         }
         
          
         resultadoResposta = (respostaQuestao1 + respostaQuestao2 + respostaQuestao3 +
                               respostaQuestao4 + respostaQuestao5 + respostaQuestao6 +
                                respostaQuestao7 + respostaQuestao8);
         
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Personalidade</title>");   
            
            out.println("<link href='css/styleBack.css' rel='stylesheet'/>");
             
            
            out.println("</head>");
            out.println("<body>");
            
            out.println("<header id='area-cabecalho'> <!-- Inicio header -->"); 
            out.println("<div id='area_logo'>");
            out.println("<h1>Programação <span class='branco' >Avançada</span></h1>");
            out.println("</div>");
            
            out.println("<nav id='area-menu'> <!--Inicio nav -->"); 
            out.println("<ul>");    
            out.println("<li><a href=\"\">Home</a></li>");     
            out.println("<li><a href=\"\">Sobre</a></li>");    
            out.println("<li><a href=\"\">Contato</a></li>");  

            out.println("</ul> ");
            out.println("</nav> <!--/fim nav -->");
            out.println("</header><!--/fim header -->");

            out.println("<div id='area-titulo'>");
            out.println("<h1>Resultado do Teste</h1>");
            out.println("</div>");
            
            out.println("<div id='area-principal'>");
            out.println("<fieldset>");
            out.println("<section class='area-secao'>");
            
            
            
            
            if (resultadoResposta >= 8 && resultadoResposta <= 10) {
                
                out.println ("<h2>Homem-Aranha</h2>");
                
                out.println("<img class='img' src='imagens/marvel-spider-man.jpeg'/>");
                out.println("<p>O Homem-Aranha tem um problema de identidade terrível,"
                + " um complexo de inferioridade marcado e um medo das mulheres."
                + " Ele é anti-social, castrado, atormentado pela culpa edipiana"
                + " e propenso a acidentes.um neurótico funcional.</p>");
                
                
            } else if (resultadoResposta >= 11 && resultadoResposta <= 13) {
                
                out.println ("<h2>Doutor Estranho</h2>");
                out.println("<img class='img' src='imagens/doutorEstranho.jpeg'/>");
                out.println("<p>Mesmo como Doutor Estranho, alguns traços de sua personalidade"
                 + " continuaram firmes, como uma leve arrogância que sempre dá as caras."
                 + " Entretanto, ele passou a ser altruísta, sábio, sereno e perspicaz.</p>");
                
            } else if (resultadoResposta >= 14 && resultadoResposta <= 16) {
                
                out.println ("<h2>Feiticeira Escarlate</h2>" );
                out.println("<img class='img' src='imagens/feiticeiraEscarlate.jpeg'/>");
                out.println("<p>A Feiticeira Escarlate sempre foi uma mulher decidida e forte. \n" +
                "Dona de si, ela sempre prezou pela sua família... \n" +
                "porém, em alguns vários momentos, o lado Maximoff/Lensherr\n" +
                " de sua família se provou como sendo mais rival do que amigo. \n" +
                " Ela sofreu diversos distúrbios de ordem psíquica, o que a levaram\n" +
                "  a enlouquecer em dado ponto de sua vida, no arco de sagas desde Vingadores: \n" +
                "  A Queda a Dinastia M. Wanda também sempre foi uma mulher com o coração livre.\n" +
                "   Apesar de ser marcada pelo romance com o Visão,\n" +
                "    ela também já se envolveu com o Magnum, com o Capitão \n" +
                "    América e até com o Doutor Destino (ainda que, nesse último caso, manipulada).</p>");
                
            }else if (resultadoResposta >= 17 && resultadoResposta <= 19) {
                
                out.println ("<h2>Thor</h2>");
                out.println("<img class='img' src='imagens/thor.jpeg'/>");
                out.println("<p>O Thor não sente que pertence a lugar algum. Apesar disso,\n" +
                " quando se enquadra em um ciclo de amizade, \n" +
                " se dedica e está sempre disposto a ajudar.\n" +
                "  Por isso, cria uma rede de amigos a partir da sua vontade\n" +
                "   de ser querido, ajudando quem está ao seu lado e utilizando\n" +
                "    a necessidade da sua presença como diferencial entre suas relações.\n" +
                "     Ele tem uma grande dor, da perda da sua família, \n" +
                "     e percebemos nele uma vontade de não repetir esse sentimento. \n" +
                "     Quando em estresse, sua ira mostra a direção da seta.</p>");
                
            }else if (resultadoResposta >= 20 && resultadoResposta <= 22) {
                
                out.println ("<h2>Hulk</h2>");
                out.println("<img class='img' src='imagens/hulk.jpeg'/>");
                out.println("<p>Movido pelo desejo de estabilidade, quando algo sai do controle,\n" +
                " o Hulk se sente ameaçado e extravasa, muitas vezes de forma agressiva.\n" +
                "  Inteligente, articula estratégias e sabe racionalizar suas escolhas, \n" +
                "  mas quando se transforma, perde a razão e se torna impulsivo.\n" +
                "   Isso faz com que o Hulk não trabalhe tão bem em equipe ou em situações de pressão.</p>");
                
            }else if (resultadoResposta >= 23 && resultadoResposta <= 25) {
                
                out.println ("<h2>Viúva Negra</h2>");
                out.println("<img class='img' src='imagens/ViuvaNegra.jpeg'/>");
                out.println("<p>Sedutora, determinada e super misteriosa, \n" +
                "a Agente Romanoff é uma das personagens mais intrigantes da saga.\n" +
                "Muito articulada, podemos ver no primeiro filme da franquia \n" +
                "como a personagem “extrai” de Loki, seu inimigo, \n" +
                "uma informação importante utilizando sua capacidade de manipulação.\n" +
                " É uma “femme fatale”, uma característica que não é \n" +
                " rara em mulheres do tipo 2 sexual. Utiliza seu poder \n" +
                " hipnotizante para conquistar – pessoas, causas e objetivos.</p>");
                
            }else if (resultadoResposta >= 26 && resultadoResposta <= 28) {
                
                out.println ("<h2>Homem de Ferro</h2>");
                out.println("<img class='img' src='imagens/homemFerro.jpeg'/>");
                out.println("<p>O Homem de Ferro tem foco em seu próprio prazer. \n" +
                "Inteligente, gosta de exibir suas conquistas como carros, \n" +
                "fortuna e capacidade de sedução. No campo do amor, \n" +
                "demora a se conectar pela sua busca por mais e mais \n" +
                "prazer e felicidade – até que se dá conta que, muitas vezes, \n" +
                "a felicidade está ao lado. No último filme, a cena icônica \n" +
                "que ele estala os dedos e fala “Eu sou o homem de ferro” \n" +
                "mostra a satisfação e absolutismo dele com ele mesmo. \n" +
                "Com sua síndrome de onipotência, o Homem de Ferro acredita \n" +
                "que pode usar seu dinheiro e fama para salvar o mundo –\n" +
                "mais uma conquista, mais um prazer.O Tony Stark não\n" +
                " tem um dom ou chamado legítimo, criou a sua armadura \n" +
                " para exercer o que queria fazer, a prova de que sua \n" +
                " personalidade não se contenta em ouvir o “não”, \n" +
                " principalmente se a negativa barrar algum de seus desejos.</p>");
      
          
            }else if (resultadoResposta >= 29 && resultadoResposta <= 32) {
                out.println ("<h2>Capitão América</h2>");
                out.println("<img class='img' src='imagens/capitaoAmerica.jpeg'/>");
                out.println("<p> Se Vingadores fosse uma franquia de romance, \n" +
                "sem dúvidas o Capitão América seria o nosso mocinho. \n" +
                "Movido pelos princípios da ética e da disciplina,\n" +
                " para sempre ser o melhor no que faz, não quer motivos \n" +
                " para que alguém fale mal dele e sempre quer estar \n" +
                " em um ato de bravura, o famoso “boa praça”. \n" +
                " Tem prazer de ser o líder e não admite errar, \n" +
                " acredita na beleza da vida e na sua moral. \n" +
                " Está sempre do lado que acredita estar certo.\n" +
                "  Patriota e com grande senso de heroísmo,\n" +
                "   ao longo da franquia, o vimos várias vezes \n" +
                "   arriscando a própria vida para salvar as\n" +
                "    pessoas – e, com isso, ter seu reconhecimento validado.</p>");
    }
 
            
            
            out.println("</section>");
            out.println("</fieldset");
            out.print("</div>");
            
            
            out.println("<footer>");
               
            out.println("<h3> &copy; 2020 - Rennan Galvão</h3>");

            out.println("</footer>");
            
            
            
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
