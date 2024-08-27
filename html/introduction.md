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

  # table in html:-
  1. it is collection of rows and columns.
  2. table is grid organize in rows and columns much like in spreadsheet.
  3. to create table in html we use <table></table> tag.
  4. it is container and semantic tag (self explanatory tag).
  5. here we are creating table row by row.
  6. to create table we use <tr></tr> tag.
  7. to create cells ,html provide 2 tags.
      i) <th></th> tag:- it is used to create table heading cells.
      ii) <td></td> tag:- it is used to create tabledata cells.
8. to provide title or caption to gthe table we use <caption></caption>
tag.
9. syntax:-
<table border='1'>
      <caption>employee salary table</caption>

      <tr>
            <th>emp id</th>
            <th>ename</th>
            <th>salary</th>
      </tr>
      <tr>
            <td>101</td>
            <td>amit</td>
            <td>40000</td>
      </tr>
      <tr>
            <td>102</td>
            <td>manoj</td>
            <td>60000</td>
      </tr>

# cell spanning:-
in html ,we have 2 ways to span a cell

1. row span:- row span is an attibute used to span the cell on row basis
2. colspan:- colspan is an attibute used to span the cell oncolumn basis

# attributes of table tags
1. cell padding:- to create space cell boeder and cell content is known as cell padding
2. cell spacing:- to create space between outside the cell is known as cell spacing
3. border:- it is used to provide border
4. rules:- all
5. align=centre

# thread tag:-
1. it is a containery tag 
2. it represent top most part of our table
3. the top most part of our table we have to write within <thread></thread> tag.

# tbody tag:-
1. it is a containery tag 
2. the remaining part of our table we have to write with in in <tbody></tbody> tag.

# tfoot tag:-
1. it is a containery tag 
2. the conclusion or summary of the table we have to write with in <tfoot></tfoot> tag.
3. it represents bottom most part of our table.

# note:-
thead,tbody and tfoot tag are highly recommended for better expalnation to crawler and code understanding purposes.

# html form:-
1. forms are used to accept input from the user
2. to create form in html we use <form></form> tag.
3. it is a container tag.
4. in html form,we are accepting input from the user in an input field.
5. to createinput field we use <input></input> tag. it is non -container tag(un-pair tag).

# attibutes of input tag:
1. type: type attribute is used to specify which type of data we can accept in an input field.

<input type="______">

      values:- 1. text
      2. tel
      3. email
      4. password
      5. file multiple
      6. date
      7. time
      8. datetime-local
      9. colour
      10. range 
      11. search
      12. url
      13 .submit
      14. reset
      15. number 
      16. radio 
      17. checkbox
      18. image
      19. button
      20. month
      21. week
      22. hidden

      <form action="backend url or # just to refresh the page and not to save data in backend"></form>

2. name:-
      name attribute is used to provide name to the input field.

3. value:-
      value attribute is used to provide initial value to the input field or
      value attribute is used to target value inside an input field.

4. readonly:-
      it will make the input field as readonly used cant change the value ,but can access the input field.

5. disabled:-
      it will make the input field as disabled user cant access the input field.

6. required:-
      it will make the input field as required to be filled . if the input field is empty form will not be submitted.

7. placeholder:-
      it is used to provide hint to the user.

8. autofocus:-
      whenever page reloads it will automatically focus an input field.

9. size:-
      it is used to control the length of an input field.

      size ="_________"value=30 (number)

10. maxlength:-
      the maximum length attribute specifies the minimum number of characters allowed in an input field.

      maxlength="_________"value=16 (number)
11. minlength:-
      the minlength attribute specifies the minimum length of characters allowed in an input field.

      minlength = "_________"value=2 (number)

12. max:-
      it is used with type = number ,range
      max attribute specifies the maximum value of an input field.

      max= "_________"value=10 (number)

13. min:-
      it is used with type = number ,range
      min attribute specifies the minimum value of an input field.

      min="_________"value=5 (number)

14. autocomplete:-
      the autocomplete attribute specifies if browsers should try to perdict the value of an input field or not.

      autocomplete="_________"value=on|off

15. step:-
      step attribute is used to set the discrete step size of an input tag. the default stepping value for number input is 1  

      it works with :-
      number
      range
      date
      datetime-local
      month
      time
      week

16. accept:-
      accept attribute is used to specify the file types that the input field can accept.

      accept="________"

      1. audio/*: the user can pick all sound files.
      2. video/*:the user can pick all video files.
      3. image/*:a valid media type ,with no parameters.
      4. .png/*:

# label tag:-
1. label tag is used to connect text with the input fields.
2. the text we want to connect we have to write within label tag.
3. it is container tag.
4. the input tag, we have to use id attribute and that ids valuewe have to pass to labels for attribute .
5. whenever user click on that text respective input field will be focused.

6. syntax:-
      <label for="username">name</label>
      <input type="text" id="username">

# fieldset tag:-
1. fieldset tag is used to group form control and it will create one box around the group.
2. it is a container tag.
3. fieldset tag we have to write within form tag.

# legend tag:-
1. it is a container tag.
2. to provide title or caption to the fieldset we use legend tag
3. legend tag we have to write within field tag.

syntax:-
<form action="">
    <fieldset>
        <legend>registration form</legend>

        <label for="user-name">name</label>
        <input type="text" id="user-name" ><br><br>

    </fieldset>
</form>

# select tag:-
1. it is a container tag
2  it is used to create dropdown list.
3. to create dropdown list we use select tag
4. here we are providing multiple options to the user from these options user can select only one option.
5. to create option we use option tag. it is container tag
6. syntax:-
<select name="state-name" id="">
    <option value="" selected disabled>select state name</option>
    <option value="delhi">delhi</option>
    <option value="mumbai">mumbai</option>
    <option value="up">up</option>
    <option value="haryana">haryana</option>
    <option value="punjab">punjab</option>
</select>

