# boiler plate code:
the basic structure of our web page we are generating from emmet is known as boiler plate code.
command:- shift +1:-!
       or html:5
# emmet :-
it is tool present inside vs code.
# root elements:

it is the combination of opening of html tag and content of html with closing of html tag.

# difference between inline and block level elements :

# inline level elements :
1 occupy space required by content.
2 we can not set height and width.
3. eg- span tag,italic,bold,strong,u,emphasised,anchor,img,audio,video

# block level elements :
1 always take full width of the parent container.
2 we can set height and width.
3 it will always start with a new line.
4 eg- div,header,footer,aside,article,main,section,blockquote,figure,figcapture.

# text formatting tags:
1 itallic tag :- <i></i>
bold tag :- <b></b>
underline tag :- <u></u>
emphasise tag :- <em></em> italics ,important
strong tag :- <strong></strong>  bold,important
insert tag :-<ins></ins>  undeline,newly added content

# subscript tag:
 co2 :- 2 is subscript   <sub></sub>

 # superscript tag :
  x *2*2 :- x power 2 power 2 <sup></sup>

  # address tag:
  <address></address>
  thappa technicals 

  # queue tag:
   <q></q>

   # blockquote tag :
   <blockquote></blockquote>

   # abbr (abbreviation ) tag :
   <abbr title="nhvjgfdg">hvjhfg</abbr>
   title attribute is used to create tool tip

   # code tag:
   use to write code inside it

   # heading tag:
   <h1>most important heading .It automatically create one line break to upper and lower side of the heading</h1>
   as we go down we importance decreases

   # paragraph tag:
   <p>It automatically create one line break to upper and lower side of the heading
   </p>

   # image tag:
   1. space:- <img>
2. path:- src attribute
syntax:-
<img src=" path of image"
      alt="
height="
width="
title="
loading="

# path :
are of two type absolute path and relative path
# absolute path:
the path which is represented from its root directory is known as absolute path 
# relative path:
the path which is represented from its current directory is known as relative path
<img src="./assets/bholenath.webp">

# loading lazy:
 to waste data of user to download that image

 <img src="../ ">:- used to locate file if the image is in some other folder

 # assignment :
 top-5 favourate songs 

 # hyperlink:
hyperlink is used to link or attach different documents to our web /html page
steps to create hyperlink:-
1. first we have to mark the content 
to mark the content we use anchor tag (<a></a>) . it is container tag
2. mention the path or location or hyper refrence where we want user to be redirected . we use href attribute.
href:- hyper refrence
syntax:-
<a      href="https://www.google.com"
      target="__blank  ">
  google
</a>

# target attribute :
target attribute is used to specify where to open the link
i) __self:- open in same browser tab   (default)
ii) __blank:- open in new browser tab.

# states of anchor tag:
1. not visited :- sky blue
2. active :- red
3. visited :- purple

# how to connect with mobile:
http://ipv6 address:5500/html/day-4%20hyperlink%20in%20html/hyperlink-3.html
ipconfig type in terminal to get ipv6 address and put it in above address and connect ur laptop with the same phone hotspot and make sure u have clicked on go live in vs code and then put this address in mobile chrome to call directly trough mobile and thats how we can open this in mobile 

whatsapp.com

# lists:
it is a collection or group of related items

# types of list:
1. ordered list
2. unordered list
3. description list/dictionary list/ definition list

# ordered list :
 it is group of related items represented in an order/sequence
 to create ordered list we use <ol></ol>tag
 to create list items we use <li></li>tag

 syntax:-
 <ol type=""start=""reversed="">
 <li>HTML</li>
 <li>css</li>
 </ol>

 # attributes of ordered list:
 1. type: type attibute is used to specify which type of bullet you want to represent.

 type:_________ values:- (1,a,A,I,i)
 2. start: start attribute specifies starting of the sequence and here start attribute only accepts the numbers.

 start="___" values:-1,2,3,....
 3. reversed: reversed attribute is used to reverse the sequenceof ordered lists.

 # unordered list:
 it is a group of related items represented in an unordered way i.e., bullets are not following any sequence.
 to create inordered list we use <ul></ul>tag. it is container tag.
 to create list item we use <li></li>tag.

 # attribute of unordered lists:
 1. type: type attribute is used to specify which type of bullet you want to represent.

 type="____" (values:- disc,circle,square,none)

 # description list/dictionary list/definition list:-
 1. description list is a list of term with a description of each term.
 2. to create description list we use <dl></dl>tag. it is container tag.
 3. to create description term we use <dt></dt>tag.
 4. to create description definition list we use <dd></dd>tag.
 5. description definition tag we have to write within description term tag.
 6. description term tag we have to write with in description list tag.

 syntax:-
  <dl> decription list

      <dt> description term-1
            <dd> decription definition tag</dd>
      </dt>
      <dt>decription term-2
            <dd> decription definition tag</dd>
      </dt>
  </dl>
