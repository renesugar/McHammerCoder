/* generated from model null*/
/* generated by template ast.AstClass*/

package htmlred._ast;

/* generated by template ast.AstImports*/
import java.util.Optional;
import de.monticore.symboltable.Symbol;
import de.monticore.symboltable.Scope;
import de.se_rwth.commons.logging.Log;
import java.util.Iterator;


 public  class ASTP extends /* generated by template ast.AstSuperTypes*/
de.monticore.ast.ASTCNode implements  ASTHTMLRedNode
 {
  /* generated by template ast.Attribute*/
   protected  java.util.List<htmlred._ast.ASTAlternatives> alternativess = new java.util.ArrayList<>();

  /* generated by template ast.Attribute*/
   public  Optional<? extends Symbol> symbol = Optional.empty();

  /* generated by template ast.Attribute*/
   public  Optional<? extends Scope> enclosingScope = Optional.empty();

    /* generated by template ast.Constructor*/
  
   protected  ASTP (/* generated by template ast.ParametersDeclaration*/
    // Parameters declaration
 
    )  
  /* generated by template ast.EmptyMethodBody*/

  { // empty body 
  }


    /* generated by template ast.Constructor*/
  
   protected  ASTP (/* generated by template ast.ConstructorParametersDeclaration*/
     java.util.List<htmlred._ast.ASTAlternatives> alternativess 
 
    )  
  /* generated by template ast.ConstructorAttributesSetter*/
  {
    setAlternativess(alternativess);
  }


  
    /* generated by template ast.ClassMethod*/
  
   public  void accept(htmlred._visitor.HTMLRedVisitor visitor)
   
    { 
     /* generated by template ast.ErrorIfNull*/
    Log.errorIfNull(visitor, "0xA7006_466 Parameter 'visitor' must not be null.");

     /* generated by template ast.additionalmethods.Accept*/

      visitor.handle(this);

  } 

    /* generated by template ast.ClassMethod*/
  
   public  boolean deepEquals(Object o,boolean forceSameOrder)
   
    { 
     /* generated by template ast.ErrorIfNull*/
    Log.errorIfNull(o, "0xA7006_556 Parameter 'o' must not be null.");

     /* generated by template ast.additionalmethods.DeepEqualsWithOrder*/

      ASTP comp;
    if ((o instanceof ASTP)) {
      comp = (ASTP) o;
    } else {
      return false;
    }
    if (!equalAttributes(comp)) {
      return false;
    }
    // comparing alternativess
    if (this.alternativess.size() != comp.alternativess.size()) {
      return false;
    } else {
      if (forceSameOrder) {
        Iterator<htmlred._ast.ASTAlternatives> it1 = this.alternativess.iterator();
        Iterator<htmlred._ast.ASTAlternatives> it2 = comp.alternativess.iterator();
        while (it1.hasNext() && it2.hasNext()) {
          if (!it1.next().deepEquals(it2.next())) {
            return false;
          }
        }
      } else {
        java.util.Iterator<htmlred._ast.ASTAlternatives> it1 = this.alternativess.iterator();
        while (it1.hasNext()) {
          htmlred._ast.ASTAlternatives oneNext = it1.next();
          boolean matchFound = false;
          java.util.Iterator<htmlred._ast.ASTAlternatives> it2 = comp.alternativess.iterator();
          while (it2.hasNext()) {
            if (oneNext.deepEquals(it2.next())) {
              matchFound = true;
              break;
            }
          }
          if (!matchFound) {
            return false;
          }
        }
      }
    }
    return true;     


  } 

    /* generated by template ast.ClassMethod*/
  
   public  boolean deepEquals(Object o)
   
    { 
     /* generated by template ast.ErrorIfNull*/
    Log.errorIfNull(o, "0xA7006_808 Parameter 'o' must not be null.");

     return deepEquals(o, true);

  } 

    /* generated by template ast.ClassMethod*/
  
   public  boolean deepEqualsWithComments(Object o,boolean forceSameOrder)
   
    { 
     /* generated by template ast.ErrorIfNull*/
    Log.errorIfNull(o, "0xA7006_064 Parameter 'o' must not be null.");

     /* generated by template ast.additionalmethods.DeepEqualsWithComments*/

      ASTP comp;
    if ((o instanceof ASTP)) {
      comp = (ASTP) o;
    } else {
      return false;
    }
    if (!equalsWithComments(comp)) {
      return false;
    }
    // comparing alternativess
    if (this.alternativess.size() != comp.alternativess.size()) {
      return false;
    } else {
      if (forceSameOrder) {
        Iterator<htmlred._ast.ASTAlternatives> it1 = this.alternativess.iterator();
        Iterator<htmlred._ast.ASTAlternatives> it2 = comp.alternativess.iterator();
        while (it1.hasNext() && it2.hasNext()) {
          if (!it1.next().deepEqualsWithComments(it2.next())) {
            return false;
          }
        }
      } else {
        java.util.Iterator<htmlred._ast.ASTAlternatives> it1 = this.alternativess.iterator();
        while (it1.hasNext()) {
          htmlred._ast.ASTAlternatives oneNext = it1.next();
          boolean matchFound = false;
          java.util.Iterator<htmlred._ast.ASTAlternatives> it2 = comp.alternativess.iterator();
          while (it2.hasNext()) {
            if (oneNext.deepEqualsWithComments(it2.next())) {
              matchFound = true;
              break;
            }
          }
          if (!matchFound) {
            return false;
          }
        }
      }
    }
    return true;     

  } 

    /* generated by template ast.ClassMethod*/
  
   public  boolean deepEqualsWithComments(Object o)
   
    { 
     /* generated by template ast.ErrorIfNull*/
    Log.errorIfNull(o, "0xA7006_554 Parameter 'o' must not be null.");

     return deepEqualsWithComments(o, true);

  } 

    /* generated by template ast.ClassMethod*/
  
   public  boolean equalAttributes(Object o)
   
    { 
     /* generated by template ast.ErrorIfNull*/
    Log.errorIfNull(o, "0xA7006_601 Parameter 'o' must not be null.");

     /* generated by template ast.additionalmethods.EqualAttributes*/

      ASTP comp;
    if ((o instanceof ASTP)) {
      comp = (ASTP) o;
    } else {
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
    Log.errorIfNull(o, "0xA7006_626 Parameter 'o' must not be null.");

     /* generated by template ast.additionalmethods.EqualsWithComments*/

      ASTP comp;
    if ((o instanceof ASTP)) {
      comp = (ASTP) o;
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
       result.addAll ( getAlternativess() );
    return result;

  } 

    /* generated by template ast.ClassMethod*/
  
   public  void remove_Child(de.monticore.ast.ASTNode child)
   
    { 
     /* generated by template ast.ErrorIfNull*/
    Log.errorIfNull(child, "0xA7006_152 Parameter 'child' must not be null.");

     /* generated by template ast.additionalmethods.RemoveChild*/

    if (getAlternativess().contains(child)) {
      getAlternativess().remove(child);
    }

  } 

    /* generated by template ast.ClassMethod*/
  
   public  static  Builder getBuilder()
   
    { 
     
     return new Builder();

  } 

    /* generated by template ast.ClassMethod*/
  
   public  ASTP deepClone()
   
    { 
     
     return deepClone(_construct());

  } 

    /* generated by template ast.ClassMethod*/
  
   public  ASTP deepClone(ASTP result)
   
    { 
     /* generated by template ast.ErrorIfNull*/
    Log.errorIfNull(result, "0xA7006_462 Parameter 'result' must not be null.");

     /* generated by template ast.additionalmethods.DeepCloneWithParameters*/
  
    super.deepClone(result);
    
    if (this.alternativess != null) {
      result.alternativess = com.google.common.collect.Lists.newArrayList();
      this.alternativess.forEach(s -> result.alternativess.add(s.deepClone()));
    }
    result.symbol = this.symbol.isPresent()? Optional.ofNullable((Symbol)this.symbol.get()) : Optional.empty();
    result.enclosingScope = this.enclosingScope.isPresent()? Optional.ofNullable((Scope)this.enclosingScope.get()) : Optional.empty();
    return result;

  } 

    /* generated by template ast.ClassMethod*/
  
   protected  ASTP _construct()
   
    { 
     
     return new ASTP();

  } 

    /* generated by template ast.ClassMethod*/
  
   public  java.util.List<htmlred._ast.ASTAlternatives> getAlternativess()
   
    { 
     
     /* generated by template ast.additionalmethods.Get*/

    return  this.alternativess;

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
  
   public  void setAlternativess(java.util.List<htmlred._ast.ASTAlternatives> alternativess)
   
    { 
     /* generated by template ast.ErrorIfNull*/
    Log.errorIfNull(alternativess, "0xA7006_570 Parameter 'alternativess' must not be null.");

     /* generated by template ast.additionalmethods.Set*/

    this.alternativess = alternativess;

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
   * Builder for {@link ASTP}.
   */
  public static class Builder  {
    /* generated by template ast.BuilderAttribute*/
     protected  java.util.List<htmlred._ast.ASTAlternatives> alternativess = new java.util.ArrayList<>();

    public ASTP build() {
      return new ASTP (/* generated by template ast.BuilderConstructorParametersDeclaration*/
  
        this.alternativess 

      );
    }
    /* generated by template ast.AstBuilderAttributeSetter*/
    public Builder alternativess(java.util.List<htmlred._ast.ASTAlternatives> alternativess) {
      this.alternativess = alternativess;
      return this;
    }

  }    

  
}
