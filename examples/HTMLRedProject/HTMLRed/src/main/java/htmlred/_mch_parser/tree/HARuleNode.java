/* generated from model null*/
/* generated by template mchtree.HARuleNode*/


package htmlred._mch_parser.tree;

import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.RuleNode;

public class HARuleNode extends HAParseTree implements RuleNode
{	
	
	/**
	 * Constructor for de.mchammer.rulecontexts.RNMessage.
	 * @param payload
	 */
	public HARuleNode(Object payload)
	{
		super(payload);
	}

	public int getIndex()
	{
		return HTMLRedTreeHelper.RuleType.RT_Undefined.ordinal();
	}

	public RuleContext getRuleContext()
	{
		return (RuleContext) payload;
	}
}