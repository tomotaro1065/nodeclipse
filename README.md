# Nodeclipse -- Node.js support for Eclipse

![nodeclipse-logo](nodeclipse-logo-rough.png)

> [Nodeclipse](http://www.nodeclipse.org/) or [Nodeclipse-1 v0.2](http://www.tomotaro1065.com/nodeclipse/) is [Eclipse](http://www.eclipse.org/) plugin for the [Node.js](http://www.nodejs.org/). 
The purpose of Nodeclipse is to create environment in 
which Node.js development is easy for any user from beginner to professional. 

## Vision

One-stop shop for Node.js tools.

We can't develop everything at once, but we let you know what are the best things around for Node.js development with Eclipse.

## Features

* Creating default structure for New Node Project and New Node Source File 
* JavaScript Syntax highlighting
* Content Assistant
* NPM support
* Debugging - Breakpoint, Trace, etc... via [Eclipse debugger plugin for V8](http://code.google.com/p/chromedevtools/)

## Installing

Download site v0.1.8: http://www.nodeclipse.org/updates  
Download site v>0.2 (Nodeclipse-1): http://www.tomotaro1065.com/nodeclipse/updates/

## Usage

Check out http://www.tomotaro1065.com/nodeclipse/  
For debugging check [Using-Eclipse-as-Node-Applications-Debugger]( https://github.com/joyent/node/wiki/Using-Eclipse-as-Node-Applications-Debugger)

{% youtube aTe7SoaNd1E %}

<center>
	<video controls width="640" height="480">
		<source src="http://tomotaro1065.github.com/nodeclipse/Nodeclipse-0.2.0.mp4" />
		<source src="http://tomotaro1065.github.com/nodeclipse/Nodeclipse-0.2.0.webm" />
		<source src="http://tomotaro1065.github.com/nodeclipse/Nodeclipse-0.2.0.ogv" />
		Your browser do not support HTML5 video tag.					
	</video><br/><br/>
	<ul>
	<li><a href="http://tomotaro1065.github.com/nodeclipse/Nodeclipse-0.2.0.mp4">download mp4 video</a></li>
	<li><a href="http://tomotaro1065.github.com/nodeclipse/Nodeclipse-0.2.0.ogv">download ogv video</a></li>
	<li><a href="http://tomotaro1065.github.com/nodeclipse/Nodeclipse-0.2.0.webm">download webm video</a></li>
	</ul>
</center>

If you can not access the video, please try <a href="http://tomotaro1065.github.com/nodeclipse/index2.htm">here</a>.

For Markdown: 

1. Window -> Show View -> Other... -> Markdown
2. Click inside "Markdown HTML Preview" view to refresh rendering
3. (Optional, recommended because double whitespace is hard line break) 
	Show whitespace character via Preferences > General > Editors > Text Editors : checkbox labeled "Show whitespace characters"


## Roadmap

- [ ] Debugging features without Chrome developer tools.  In other words, debugging on Node Editor
- [ ] Obfuscation and source-level debugging features using Source Maps
- [ ] Unit test support
- [ ] Easily deployment to Heroku (possibly via [Heroku Eclipse plugin](https://devcenter.heroku.com/articles/getting-started-with-heroku-eclipse))  
	Download site: https://eclipse-plugin.herokuapp.com/install

- [ ] Add Markdown support via [Markdown Editor plugin for Eclipse](http://www.winterwell.com/software/markdown-editor.php) developped by [Daniel Winterstein](http://winterstein.me.uk)  
	Download site: http://winterwell.com/software/updatesite/
- [ ] Update template for new project
* Add README.md template
* Add hellow-world-server.js
- [ ] Add [JSHint](http://www.jshint.com/) integration for Eclipse, [developed by EclipseSource](https://github.com/eclipsesource/jshint-eclipse)  
	Download site: http://github.eclipsesource.com/jshint-eclipse/updates/
- [ ] Add Jade support	(http://blog.wookets.com/2011/10/how-to-compile-coffeescript-jade-stylus.html Posted 30th October 2011 by Sean Wesenberg)
- [ ] Integrate console window (library unknown)
- [ ] Add CoffeeScript support via [coffeescript-eclipse plugin](https://github.com/adamschmideg/coffeescript-eclipse)  
	Download site: http://coffeescript-editor.eclipselabs.org.codespot.com/hg/
	
	
## Contacts
Do not hesitate to contact developers. 
Create issue or send [email](mailto:dev@nodeclipse.com).
Or skype me by ID pverest, QQ 908781544.

## Developing

Before starting development, please do

1. Carefully read materials
2. Install and give thorough try
3. Contact current contributors, make friends
4. Say what you are going to do, before you head in.


## Contributors
LambGao 魔都 https://github.com/Nodeclipse (original creator v0.1.8)   
Scott Elcomb https://github.com/psema4  
Tomoyuki Inagaki https://github.com/tomotaro1065 (debugging integration v0.2) [blog](http://tomotaro1065.blog52.fc2.com/)   
Paul Verest https://github.com/PaulVI/  (Vision, readme, reference to plugings) [blog](https://github.com/PaulVI/blog)   

## Spread the words

Please let others know about this effort. Add links below:  

Site that reference this project  
http://www.oschina.net/p/nodeclipse  
http://stackoverflow.com/questions/8025825/is-there-a-nodejs-plugin-for-aptana-studio  
http://stackoverflow.com/questions/8179369/debugging-node-js-with-eclipse  
http://stackoverflow.com/questions/7038961/node-js-in-eclipse-which-plugins-are-most-people-using  
https://groups.google.com/forum/#!msg/nodejs/ayLUeUOanzA/et6EEZppVjMJ  
http://stackoverflow.com/questions/15407334/eclipse-rcp-add-optional-dependencies  

### Hot requests

http://stackoverflow.com/questions/14533885/which-ide-supports-coffeescript-debugging-source-mapping-breakpoints-call-st  
http://stackoverflow.com/questions/10286364/coffeescript-editor-plugin-for-eclipse  
http://stackoverflow.com/questions/7057466/how-to-use-coffeescript-and-eclipse-together-in-windows  
http://stackoverflow.com/questions/3919977/what-ide-to-use-for-node-js-javascript asked Oct 13 '10 [closed] -> Vim, Cloud9 IDE, editors
http://www.iteye.com/news/23933        

### Interesting and useful Links

#### Other Node IDEs

Nide http://coreh.github.com/nide/ v0.2 Last update 2012-04  
JetBrains WebStorm or [IntelliJ IDEA](www.jetbrains.com/idea/features/nodejs.html) (commercial products)  
Microsoft WebMatrix (free) or Visual Studio ((commercial product)  
CloudIDE [c9.io](https://c9.io) (cloud service)  
Scripted https://github.com/scripted-editor/scripted  
Eclipse Orion  

#### Hints

http://stackoverflow.com/questions/10352089/how-do-i-build-an-eclipse-rcp-app-so-that-its-features-can-be-updated-automatica?rq=1  
http://stackoverflow.com/questions/14591472/installing-an-additional-feature-during-product-build-for-some-eclipse-versions  
http://wiki.eclipse.org/Tycho/Reference_Card  
http://stackoverflow.com/questions/10529859/how-to-include-video-in-jekyll-markdown-blog  
http://stackoverflow.com/questions/2330620/eclipse-i-turned-on-hidden-characters-now-i-cant-turn-off  
add interesting stuff here...

