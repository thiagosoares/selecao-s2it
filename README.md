
# Seleção S2.it

## 1 - Acerca de sistemas de desenvolvimento web, assinale a opção correta.

**A - Servlet é uma classe do Java que possibilita ampliar os recursos de servidores web, desenvolvida para permitir conteúdos dinâmicos orientados ao usuário.**

B - Para utilizar bancos de dados relacionais em aplicações desenvolvidas em JSP, é ~obrigatória~ a utilização do Hibernate, que é um framework que realiza o mapeamento objeto/relacional.

C - O Ajax permite interagir com dados textuais nos formatos UTF-8 e XML, porém ~restringe~ o acesso a JSON (Java Script Object Notation) e a bancos de dados relacionais.

D - No XMLHttpRequest, utilizado para trocar dados com um servidor, com o intuito de melhorar sua usabilidade, o método open() aceita ~somente~ requisições no modo asynchronous.

E - O JSF (Java Server Faces) permite usar tags customizadas ~limitadas~ a páginas JSP, ~com vistas a encapsular a segurança~ na forma nativa do acesso aos JavaBeans.


## 2 - Um programador web foi contratado para desenvolver um site utilizando HTML, CSS, JSP e Servlets. Para tanto, deve usar um servidor escrito em Java, que não é contêiner EJB, mas é utilizado como servlet container, denominado :

A - GlassFish.

B - JBoss. 

C - WebLogic. 

**D - Jetty.**

E - WebSphere. s


## 3 - São apenas tipos de componentes executados em servidores Web:

A - Beans, Servlets e ~J2EE~.

B - ~JVM~, Servlets e JSP.

**C - Beans, Servlets e JSP.**

D - Beans, ~Swing~ e JSP.

E - Beans, ~Swing~ e ~JVM~.

## 4 - Analise os itens a seguir sobre JEE e EJB.

I. Um servidor J2EE fornece contêineres EJB e Web.

II. O contêiner EJB gerencia a execução de EJBs em aplicações J2EE.

III. O contêiner Web gerencia a execução de páginas JSP e componentes servlet em aplicações J2EE.

IV. Um session bean representa um único cliente dentro do servidor J2EE. Para acessar um aplicativo que é instalado no servidor, o cliente invoca os métodos do session bean.

Está correto o que se afirma em:

**A - I, II, III e IV.**

B - I e II, apenas.

C - I, III e IV, apenas.

D - I e IV, apenas.

E - III e IV, apenas.


## 5 - Spring Framework é uma plataforma Java completa que fornece suporte de infraestrutura para o desenvolvimento de aplicações Java. Acerca das características do framework Spring 3.0, assinale a opção correta.

A - Na arquitetura Spring MVC Web, o Validator é uma classe opcional que pode ser invocada para validar dados de formulários.

B - A injeção de dependência é feita após a criação do objeto, por meio dos métodos ~set~ de uma classe no estilo JavaBean, e não no momento da criação do objeto, ~tendo-se em vista que passar muitos argumentos no construtor pode tornar-se dispendioso~. (`Inicializar as dependência via construtor é exatamente a estratégia preferida pelo framework. Além de tudo, esta estratégia torna a Bean muito mais fácil de testar`)

C - A interface BeanFactory ~gerencia~ beans definidos em arquivos XML e trata recursos de mensagens. (`A classe BeanFactory está mais voltada para o ACESSO aos Beans que para a sua gerência.`)

D - O controlador AbstractWizardFormController, do módulo Spring MVC, permite suporte para o preenchimento de formulários a partir de determinada solicitação. (`Esta classe permite construir wuzards com os formulários, controlando fluxos e estados. Algo pareciso com o que o JBmp faz. Não exatamente a manipulação de fields.`)

E - A porta de entrada do navegador web para a arquitetura Spring MVC Web é a ~componente Interface (JSP/HTML)~. (`Seriam os Servlets`)


## 6 - No Spring, as configurações de segurança são realizadas no arquivo applicationContext-security.xml, e, para que qualquer página ou diretório seja seguro, é necessário adicionar a esse arquivo o elemento <intercept-url>. 

**C - Certo**

E - Errado

(`O xsd deste arquivo informa que ele não é obrigatório. A não utilização desta TAG na Role de segurança fará com que esta Role seja aplicada indistintamente, em todas as páginas. Apesar de não ser obrigatória, é difícil imaginar um caso real em que ele realmente não seja necessária. Por isso marco a assertiva como CERTA`)



## 7    - Spring é um framework que suporta a publicação de mensagens para determinado
tópico de mensagens para auxílio no desenvolvimento de sistemas complexos. Nesse
modelo, o desenvolvedor master não sabe da existência do desenvolvedor associado e
vice-versa.

C - Certo

**E – Errado**

(`O destinatário precisará conhecer o remetente para então se inscrever no referido tópico. O que não significa que haja um acoplamento entre emissor e destinatário, não. Por outro lado, o emissor não preciso conhecer todos os seus destinatários para  poder executar o delivery. `)

