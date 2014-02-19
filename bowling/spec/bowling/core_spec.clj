(ns bowling.core-spec
  (:require [speclj.core :refer :all]
            [bowling.core :refer :all]))

(describe "a gutter game"
  (it "returns zero"
    (should= 0 (score(repeat 20 0)))))
