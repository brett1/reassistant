
/* First created by JCasGen Mon Dec 29 18:34:55 ART 2014 */
package edu.isistan.uima.unified.typesystems.nlp;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import edu.isistan.uima.unified.typesystems.IdentifiableAnnotation_Type;

/** 
 * Updated by JCasGen Tue Dec 30 11:22:03 ART 2014
 * @generated */
public class SDDependency_Type extends IdentifiableAnnotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (SDDependency_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = SDDependency_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new SDDependency(addr, SDDependency_Type.this);
  			   SDDependency_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new SDDependency(addr, SDDependency_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = SDDependency.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.isistan.uima.unified.typesystems.nlp.SDDependency");
 
  /** @generated */
  final Feature casFeat_relation;
  /** @generated */
  final int     casFeatCode_relation;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getRelation(int addr) {
        if (featOkTst && casFeat_relation == null)
      jcas.throwFeatMissing("relation", "edu.isistan.uima.unified.typesystems.nlp.SDDependency");
    return ll_cas.ll_getStringValue(addr, casFeatCode_relation);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRelation(int addr, String v) {
        if (featOkTst && casFeat_relation == null)
      jcas.throwFeatMissing("relation", "edu.isistan.uima.unified.typesystems.nlp.SDDependency");
    ll_cas.ll_setStringValue(addr, casFeatCode_relation, v);}
    
  
 
  /** @generated */
  final Feature casFeat_gov;
  /** @generated */
  final int     casFeatCode_gov;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getGov(int addr) {
        if (featOkTst && casFeat_gov == null)
      jcas.throwFeatMissing("gov", "edu.isistan.uima.unified.typesystems.nlp.SDDependency");
    return ll_cas.ll_getRefValue(addr, casFeatCode_gov);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setGov(int addr, int v) {
        if (featOkTst && casFeat_gov == null)
      jcas.throwFeatMissing("gov", "edu.isistan.uima.unified.typesystems.nlp.SDDependency");
    ll_cas.ll_setRefValue(addr, casFeatCode_gov, v);}
    
  
 
  /** @generated */
  final Feature casFeat_dep;
  /** @generated */
  final int     casFeatCode_dep;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getDep(int addr) {
        if (featOkTst && casFeat_dep == null)
      jcas.throwFeatMissing("dep", "edu.isistan.uima.unified.typesystems.nlp.SDDependency");
    return ll_cas.ll_getRefValue(addr, casFeatCode_dep);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDep(int addr, int v) {
        if (featOkTst && casFeat_dep == null)
      jcas.throwFeatMissing("dep", "edu.isistan.uima.unified.typesystems.nlp.SDDependency");
    ll_cas.ll_setRefValue(addr, casFeatCode_dep, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public SDDependency_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_relation = jcas.getRequiredFeatureDE(casType, "relation", "uima.cas.String", featOkTst);
    casFeatCode_relation  = (null == casFeat_relation) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_relation).getCode();

 
    casFeat_gov = jcas.getRequiredFeatureDE(casType, "gov", "edu.isistan.uima.unified.typesystems.nlp.Token", featOkTst);
    casFeatCode_gov  = (null == casFeat_gov) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_gov).getCode();

 
    casFeat_dep = jcas.getRequiredFeatureDE(casType, "dep", "edu.isistan.uima.unified.typesystems.nlp.Token", featOkTst);
    casFeatCode_dep  = (null == casFeat_dep) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_dep).getCode();

  }
}



    