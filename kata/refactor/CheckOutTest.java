// Created with permission from Dave Thomas (given May 11, 2012)
// Variation of Dave Thomas–Pragmatic Programmer's "Kata Nine: Back to the CheckOut"
// from http://codekata.pragprog.com/2007/01/kata_nine_back_.html 
// Dave Thomas–Pragmatic Programmer

package kata.refactor;

import static org.junit.Assert.*;

import org.junit.Test;

@SuppressWarnings("unused")
public class CheckOutTest {

   // Focus On Refactoring exercise.

   // INSTRUCTIONS - Do the following:
   // 1) Uncomment out a test and save/compile
   // 2) run tests; see red
   // 3) change the code; see green
   // 4) Refactor.
   // 5) run tests; see green
   // 6) goto step 1
   
/*
(Background information for the tests.) 
Scan prices of As, Bs, Cs, and Ds.
   
   Item   Unit    Special
          Price   Price
--------------------------
    A     50      3 for 130
    B     30      2 for 45
    C     20
    D     15
*/

// // Section 1 begins here
//   @Test
//   public void priceIsZeroWhenNoGoods() throws Exception {
//      final String noItems = "";
//
//      int price = price(noItems);
//
//      assertEquals(0, price);
//   }
//
   private int price(CharSequence goods) {
      CheckOut checkOut = new CheckOut();

      for (int i = 0; i < goods.length(); i++) {
         char good = goods.charAt(i);
         checkOut.scan(good);
      }

      return checkOut.total();
   }

//   @Test
//   public void priceIsFiftyWhenGoodIsA() throws Exception {
//      final String items = "A";
//
//      int price = price(items);
//
//      assertEquals(50, price);
//   }
//
//   @Test
//   public void priceIsEightyWhenGoodsAreAB() throws Exception {
//      final String items = "AB";
//
//      int price = price(items);
//
//      assertEquals(80, price);
//   }
//
//   @Test
//   public void priceIsOneHundredFifteenWhenGoodsAreCDBA() throws Exception {
//      final String items = "CDBA";
//
//      int price = price(items);
//
//      assertEquals(115, price);
//   }
//
//   // Section 1 ends here
//   // Section 2 begins here
//
//   @Test
//   public void priceIsOneHundredWhenGoodsAreAA() throws Exception {
//      final String items = "AA";
//
//      int price = price(items);
//
//      assertEquals(100, price);
//   }
//
//   @Test
//   public void priceIsOneHundredThirtyWhenGoodsAreAAA() throws Exception {
//      final String items = "AAA";
//
//      int price = price(items);
//
//      assertEquals(130, price);
//   }
//
//   @Test
//   public void priceIsOneHundredEightyWhenGoodsAreAAAA() throws Exception {
//      final String items = "AAAA";
//
//      int price = price(items);
//
//      assertEquals(180, price);
//   }
//
//   @Test
//   public void priceIsTwoHundredThirtyWhenGoodsAreAAAAA() throws Exception {
//      final String items = "AAAAA";
//
//      int price = price(items);
//
//      assertEquals(230, price);
//   }
//
//   @Test
//   public void priceIsTwoHundredSixtyWhenGoodsAreAAAAAA() throws Exception {
//      final String items = "AAAAAA";
//
//      int price = price(items);
//
//      assertEquals(260, price);
//   }
//
//   // Section 2 ends here
//   // Section 3 begins here
//
//   @Test
//   public void priceIsOneHundredSixtyWhenGoodsAreAAAB() throws Exception {
//      final String items = "AAAB";
//
//      int price = price(items);
//
//      assertEquals(160, price);
//   }
//
//   @Test
//   public void priceIsOneHundredSeventyFiveWhenGoodsAreAAABB() throws Exception {
//      final String items = "AAABB";
//
//      int price = price(items);
//
//      assertEquals(175, price);
//   }
//
//   @Test
//   public void priceIsOneHundredNinetyWhenGoodsAreAAABBD() throws Exception {
//      final String items = "AAABBD";
//
//      int price = price(items);
//
//      assertEquals(190, price);
//   }
//
//   @Test
//   public void priceIsOneHundredNinetyWhenGoodsAreDABABA() throws Exception {
//      final String items = "DABABA";
//
//      int price = price(items);
//
//      assertEquals(190, price);
//   }
//
//   // Section 3 ends here
//   // Section 4 starts here
//
//   @Test
//   public void totalIncrementsAccordingToPricePlanPerScan() throws Exception {
//
//      CheckOut checkout = new CheckOut();
//
//      assertEquals(0, checkout.total());
//
//      checkout.scan('A');
//      assertEquals(50, checkout.total());
//
//      checkout.scan('B');
//      assertEquals(80, checkout.total());
//
//      checkout.scan('A');
//      assertEquals(130, checkout.total());
//
//      checkout.scan('A');
//      assertEquals(160, checkout.total());
//
//      checkout.scan('B');
//      assertEquals(175, checkout.total());
//
//   }
//   // Section 4 ends here

}
