(ns coinchanger.core)

(defn is-dime? [amount]
  (>= (/ amount 10) 1))

(defn is-nickel? [amount]
  (>= (/ amount 5) 1))

(defn biggest-coin [amount]
  (if (is-dime? amount) 10 
    (if(is-nickel? amount) 5 1)))

(defn changer [number]
  (loop [amount number purse []]
    (if (= 0 amount)
      purse
      (recur(- amount (biggest-coin amount)) (conj purse (biggest-coin amount))))))
