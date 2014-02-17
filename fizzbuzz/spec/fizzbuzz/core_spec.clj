(ns fizzbuzz.core-spec
  (:require [speclj.core :refer :all]
            [fizzbuzz.core :refer :all]))

(describe "not fizzbuzz"
  (it "1 is 1"
    (should= 1 (fizzbuzz 1))))
