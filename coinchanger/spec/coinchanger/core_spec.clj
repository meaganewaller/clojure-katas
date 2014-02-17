(ns coinchanger.core-spec
  (:require [speclj.core :refer :all]
            [coinchanger.core :refer :all]))

(describe "coin changer"
          (it "0 is 0"
              (should= [] (changer 0)))
          
          (it "1 is 1"
             (should= [1] (changer 1))) 

          (it "2 is [1,1]"
              (should= [1, 1] (changer 2))) 
          
          (it "5 is [5]"
              (should= [5] (changer 5)))

          (it "6 is [5, 1]"
              (should= [5, 1] (changer 6)))

          (it "10 is [10]"
              (should= [10] (changer 10)))

          (it "15 is [10, 5]"
              (should= [10, 5] (changer 15)))
          
          )

