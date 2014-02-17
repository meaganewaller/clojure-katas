(ns fizzbuzz.core-spec
  (:require [speclj.core :refer :all]
            [fizzbuzz.core :refer :all]))

(describe "not fizzbuzz"
          (it "1 is 1"
              (should= 1 (fizzbuzz 1)))

          (it "2 is 2"
              (should= 2 (fizzbuzz 2)))

          (it "3 is fizz"
              (should= "fizz" (fizzbuzz 3)))

          (it "5 is buzz"
              (should= "buzz" (fizzbuzz 5)))

          (it "6 is fizz"
              (should= "fizz" (fizzbuzz 6)))
          
          (it "10 is buzz"
              (should= "buzz" (fizzbuzz 10)))

          (it "15 is fizzbuzz"
              (should= "fizzbuzz" (fizzbuzz 15)))






          )
