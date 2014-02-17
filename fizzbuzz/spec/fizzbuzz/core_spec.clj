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






          )
