(ns coinchanger.core)


(defn biggest-coin [amount]
  1)

(defn changer [number]
  (loop [amount number purse []]
    (if (= 0 amount)
      purse
      (recur(- amount (biggest-coin amount)) (conj purse (biggest-coin amount))))))
