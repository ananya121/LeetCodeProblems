import java.util.ArrayList;
import java.util.List;

public class CountItemsMatchingaRule {

	public static void main(String[] args) {
		// Problem Description
		/**
		 * You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.

				The ith item is said to match the rule if one of the following is true:
				
				ruleKey == "type" and ruleValue == typei.
				ruleKey == "color" and ruleValue == colori.
				ruleKey == "name" and ruleValue == namei.
				Return the number of items that match the given rule.
		 */
		List<List<String>> items = new ArrayList<List<String>>();
		List<String> list1 = new ArrayList<>();
		list1.add("phone");
		list1.add("silver");
		list1.add("pixel");
		items.add(list1 );
		items.add(list1);
		System.out.println(countMatches(items,"color","silver"));

	}
	
	public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        int n = items.size();
        for(int i=0;i<n;i++)
        {
            if(ruleKey.equals("type"))
            {
                if(ruleValue.equals(items.get(i).get(0)))
                    count++;
            }
            else if(ruleKey.equals("color"))
            {
                if(ruleValue.equals(items.get(i).get(1)))
                    count++;
            }
            else
            {
                if(ruleValue.equals(items.get(i).get(2)))
                    count++;
            }
        }
        
        return count;
        
    }

}
