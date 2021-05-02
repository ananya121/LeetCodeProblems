import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RevealCardsInIncreasingOrder {
	public int[] deckRevealedIncreasing(int[] deck) 
    {
        Arrays.sort(deck);
        int r[]=new int[deck.length];
        List<Integer> result=new ArrayList<Integer>();
        int n=deck.length;
        if(n<=2)
            return deck;
        n--;
        result.add(deck[n]);
        n--;
        result.add(0,deck[n]);
        n--;
        while(n>=0)
        {
            int bottom=result.get(result.size()-1);
            result.remove(result.size()-1);
            result.add(0,bottom);
            result.add(0,deck[n]);
            n--;
        }
        for (int i=0; i < result.size(); i++)
        {
            r[i] = result.get(i).intValue();
        }
        return r;
    }
}
