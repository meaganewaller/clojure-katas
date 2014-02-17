(ns coinchanger.core)

(defn find-biggest-coin-to-use [coin amount]
  (>= (/ amount coin) 1))

(defn biggest-coin [amount]
  (cond
    (find-biggest-coin-to-use 25 amount) 25
    (find-biggest-coin-to-use 10 amount) 10
    (find-biggest-coin-to-use 5 amount) 5
    :else 1))

(defn changer [number]
  (loop [amount number purse []]
    (if (= 0 amount)
      purse
      (recur(- amount (biggest-coin amount)) (conj purse (biggest-coin amount))))))


; explained: 
; number gets passed into changer
; the base case is if amount is 0 it returns the purse []
; else, it enters recursion
; conj returns a new collection, purse is the collection, and it returns a collection with biggest-coin amount added
; biggest-coin amount takes an amount, and goes through the condition, if it can be used by 25 it hits that and returns 25, 25 gets adds to the purse, if not it goes through the list, if it can't hit anything it just adds 1 to the purse

; example
; if you want to see changer [34] it goes through these steps:
; changer = 0? false
; 34 gets passed to biggest-coin, (>= (/ 34 25) 1) true so it adds 25 to the purse, and subtracts so now we have 9 left. 9 isn't 0 so it hits the recursion again, we pass 9 into biggest coin and all it can hit is 5 as the biggest coin to hit, it add 5 to the purse collection and subtracts 5 from the total, leaving us with 4, 4 is going to hit biggest-coin 4 times and return 1 for each one, finally when we are left with 0 we return purse which will look like this: [25, 5, 1, 1, 1, 1]
