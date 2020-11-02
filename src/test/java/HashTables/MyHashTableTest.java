package HashTables;

import org.junit.Assert;
import org.junit.Test;

public class MyHashTableTest {

	@Test
    public void givenASentence_WhenWordsAreAddedToList_ShouldReturnWordFrequency() {
        String sentence = "To be or not to be";
        MyHashTable<String , Integer> myHashTable = new MyHashTable<>();
        String[] words = sentence.toLowerCase().split(" ");
        for (String word : words) {
            Integer value = myHashTable.get(word);
            if (value == null) value = 1;
            else value = value + 1;
            myHashTable.add(word , value);
        }
        int frequency = myHashTable.get("to");
        System.out.println(myHashTable);
        Assert.assertEquals(2 , frequency);
    }
}
