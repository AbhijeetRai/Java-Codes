/**
 * When we know, one or more methods of our class will be surely overridden,
 * then we can declare that / those, method(s) abstract and that class abstract, too, compulsarily.

 * An abstract class supports 0-100% abstraction.
 * Class extending an abstract class must give body to all its methods or decalre itself also abstract
 */

 abstract class Demo {

	//must declare the class abstract, after having  at least 1 abstract method.
	abstract void method();
}

/**
 * 					abstract class 				interface
 	generation of.class file	    yes					    yes
	construcor			    yes					    no
	object as default parent	    yes					    no
	instance variable		    yes					    no(variables of interface are static by default)
	static variable		            yes					    yes

 */
