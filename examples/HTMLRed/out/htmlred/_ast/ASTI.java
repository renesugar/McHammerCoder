/* generated from model null*/
/* generated by template ast.AstClass*/

package htmlred._ast;

/* generated by template ast.AstImports*/
import java.util.Optional;
import de.monticore.symboltable.Symbol;
import de.monticore.symboltable.Scope;
import de.se_rwth.commons.logging.Log;
import java.util.Iterator;


 public  class ASTI extends /* generated by template ast.AstSuperTypes*/
de.monticore.ast.ASTCNode implements  ASTHTMLRedNode
 {
  /* generated by template ast.Attribute*/
   protected  String text;

  /* generated by template ast.Attribute*/
   public  Optional<? extends Symbol> symbol = Optional.empty();

  /* generated by template ast.Attribute*/
   public  Optional<? extends Scope> enclosingScope = Optional.empty();

    /* generated by template ast.Constructor*/
  
   protected  ASTI (/* generated by template ast.ParametersDeclaration*/
    // Parameters declaration
 
    )  
  /* generated by template ast.EmptyMethodBody*/

  { // empty body 
  }


    /* generated by template ast.Constructor*/
  
   protected  ASTI (/* generated by template ast.ConstructorParametersDeclaration*/
     String text 
 
    )  
  /* generated by template ast.ConstructorAttributesSetter*/
  {
    setText(text);
  }


  
    /* generated by template ast.ClassMethod*/
  
   public  void accept(htmlred._visitor.HTMLRedVisitor visitor)
   
    { 
     /* generated by template ast.ErrorIfNull*/
    Log.errorIfNull(visitor, "0xA7006_076 Parameter 'visitor' must not be null.");

     /* generated by template ast.additionalmethods.Accept*/

      visitor.handle(this);

  } 

    /* generated by template ast.ClassMethod*/
  
   public  boolean deepEquals(Object o,boolean forceSameOrder)
   
    { 
     /* generated by template ast.ErrorIfNull*/
    Log.errorIfNull(o, "0xA7006_512 Parameter 'o' must not be null.");

     /* generated by template ast.additionalmethods.DeepEqualsWithOrder*/

      ASTI comp;
    if ((o instanceof ASTI)) {
      comp = (ASTI) o;
    } else {
      return false;
    }
    if (!equalAttributes(comp)) {
      return false;
    }
    return true;     


  } 

    /* generated by template ast.ClassMethod*/
  
   public  boolean deepEquals(Object o)
   
    { 
     /* generated by template ast.ErrorIfNull*/
    Log.errorIfNull(o, "0xA7006_454 Parameter 'o' must not be null.");

     return deepEquals(o, true);

  } 

    /* generated by template ast.ClassMethod*/
  
   public  boolean deepEqualsWithComments(Object o,boolean forceSameOrder)
   
    { 
     /* generated by template ast.ErrorIfNull*/
    Log.errorIfNull(o, "0xA7006_116 Parameter 'o' must not be null.");

     /* generated by template ast.additionalmethods.DeepEqualsWithComments*/

      ASTI comp;
    if ((o instanceof ASTI)) {
      comp = (ASTI) o;
    } else {
      return false;
    }
    if (!equalsWithComments(comp)) {
      return false;
    }
    return true;     

  } 

    /* generated by template ast.ClassMethod*/
  
   public  boolean deepEqualsWithComments(Object o)
   
    { 
     /* generated by template ast.ErrorIfNull*/
    Log.errorIfNull(o, "0xA7006_646 Parameter 'o' must not be null.");

     return deepEqualsWithComments(o, true);

  } 

    /* generated by template ast.ClassMethod*/
  
   public  boolean equalAttributes(Object o)
   
    { 
     /* generated by template ast.ErrorIfNull*/
    Log.errorIfNull(o, "0xA7006_948 Parameter 'o' must not be null.");

     /* generated by template ast.additionalmethods.EqualAttributes*/

      ASTI comp;
    if ((o instanceof ASTI)) {
      comp = (ASTI) o;
    } else {
      return false;
    }
	// comparing text 
    if ( (this.text == null && comp.text != null) 
      || (this.text != null && !this.text.equals(comp.text)) ) {
      return false;
    }
	// comparing symbol 
    if ( this.symbol.isPresent() != comp.symbol.isPresent() ||
       (this.symbol.isPresent() && !this.symbol.get().equals(comp.symbol.get())) ) {
      return false;
    }
	// comparing enclosingScope 
    if ( this.enclosingScope.isPresent() != comp.enclosingScope.isPresent() ||
       (this.enclosingScope.isPresent() && !this.enclosingScope.get().equals(comp.enclosingScope.get())) ) {
      return false;
    }
    return true;     


  } 

    /* generated by template ast.ClassMethod*/
  
   public  boolean equalsWithComments(Object o)
   
    { 
     /* generated by template ast.ErrorIfNull*/
    Log.errorIfNull(o, "0xA7006_747 Parameter 'o' must not be null.");

     /* generated by template ast.additionalmethods.EqualsWithComments*/

      ASTI comp;
    if ((o instanceof ASTI)) {
      comp = (ASTI) o;
    } else {
      return false;
    }
    if (!equalAttributes(comp)) {
      return false;
    }
    // comparing comments
    if (get_PreComments().size() == comp.get_PreComments().size()) {
      java.util.Iterator<de.monticore.ast.Comment> one = get_PreComments().iterator();
      java.util.Iterator<de.monticore.ast.Comment> two = comp.get_PreComments().iterator();
      while (one.hasNext()) {
        if (!one.next().equals(two.next())) {
          return false;
        }
      }
    } else {
      return false;
    }
    
    if (get_PostComments().size() == comp.get_PostComments().size()) {
      java.util.Iterator<de.monticore.ast.Comment> one = get_PostComments().iterator();
      java.util.Iterator<de.monticore.ast.Comment> two = comp.get_PostComments().iterator();
      while (one.hasNext()) {
        if (!one.next().equals(two.next())) {
          return false;
        }
      }
    } else {
      return false;
    }
    return true;

  } 

    /* generated by template ast.ClassMethod*/
  
   public  java.util.Collection<de.monticore.ast.ASTNode> get_Children()
   
    { 
     
     /* generated by template ast.additionalmethods.GetChildren*/

    java.util.LinkedList<de.monticore.ast.ASTNode> result = new java.util.LinkedList<de.monticore.ast.ASTNode>();
    return result;

  } 

    /* generated by template ast.ClassMethod*/
  
   public  void remove_Child(de.monticore.ast.ASTNode child)
   
    { 
     /* generated by template ast.ErrorIfNull*/
    Log.errorIfNull(child, "0xA7006_275 Parameter 'child' must not be null.");

     /* generated by template ast.additionalmethods.RemoveChild*/


  } 

    /* generated by template ast.ClassMethod*/
  
   public  static  Builder getBuilder()
   
    { 
     
     return new Builder();

  } 

    /* generated by template ast.ClassMethod*/
  
   public  ASTI deepClone()
   
    { 
     
     return deepClone(_construct());

  } 

    /* generated by template ast.ClassMethod*/
  
   public  ASTI deepClone(ASTI result)
   
    { 
     /* generated by template ast.ErrorIfNull*/
    Log.errorIfNull(result, "0xA7006_585 Parameter 'result' must not be null.");

     /* generated by template ast.additionalmethods.DeepCloneWithParameters*/
  
    super.deepClone(result);
    
    if (this.text != null) {
      result.text = this.text;
    }
    result.symbol = this.symbol.isPresent()? Optional.ofNullable((Symbol)this.symbol.get()) : Optional.empty();
    result.enclosingScope = this.enclosingScope.isPresent()? Optional.ofNullable((Scope)this.enclosingScope.get()) : Optional.empty();
    return result;

  } 

    /* generated by template ast.ClassMethod*/
  
   protected  ASTI _construct()
   
    { 
     
     return new ASTI();

  } 

    /* generated by template ast.ClassMethod*/
  
   public  String getText()
   
    { 
     
     /* generated by template ast.additionalmethods.Get*/

    return  this.text;

  } 

    /* generated by template ast.ClassMethod*/
  
   public  Optional<? extends Symbol> getSymbol()
   
    { 
     
     /* generated by template ast.additionalmethods.Get*/

    return  this.symbol;

  } 

    /* generated by template ast.ClassMethod*/
  
   public  Optional<? extends Scope> getEnclosingScope()
   
    { 
     
     /* generated by template ast.additionalmethods.Get*/

    return  this.enclosingScope;

  } 

    /* generated by template ast.ClassMethod*/
  
   public  void setText(String text)
   
    { 
     /* generated by template ast.ErrorIfNull*/
    Log.errorIfNull(text, "0xA7006_419 Parameter 'text' must not be null.");

     /* generated by template ast.additionalmethods.Set*/

    this.text = text;

  } 

    /* generated by template ast.ClassMethod*/
  
   public  void setSymbol(Symbol symbol)
   
    { 
     
     /* generated by template ast.additionalmethods.Set*/

    this.symbol = Optional.ofNullable(symbol);

  } 

    /* generated by template ast.ClassMethod*/
  
   public  boolean symbolIsPresent()
   
    { 
     
       return symbol.isPresent(); 

  } 

    /* generated by template ast.ClassMethod*/
  
   public  void setEnclosingScope(Scope enclosingScope)
   
    { 
     
     /* generated by template ast.additionalmethods.Set*/

    this.enclosingScope = Optional.ofNullable(enclosingScope);

  } 

    /* generated by template ast.ClassMethod*/
  
   public  boolean enclosingScopeIsPresent()
   
    { 
     
       return enclosingScope.isPresent(); 

  } 

   
  /* generated by template ast.ClassContent*/
  // Class content

    /* generated by template ast.AstBuilder*/

 /**
   * Builder for {@link ASTI}.
   */
  public static class Builder  {
    /* generated by template ast.BuilderAttribute*/
     protected  String text;

    public ASTI build() {
      return new ASTI (/* generated by template ast.BuilderConstructorParametersDeclaration*/
  
        this.text 

      );
    }
    /* generated by template ast.AstBuilderAttributeSetter*/
    public Builder text(String text) {
      this.text = text;
      return this;
    }

  }    

  
}
