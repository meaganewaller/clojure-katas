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
          
          )

