(ns fizzbuzz.core)
(defn fizzbuzz [number]
  (if (zero?(rem number 15)) "fizzbuzz"
  (if (zero? (rem number 5)) "buzz"
    (if (zero? (rem number 3)) "fizz" number
  )))
)
