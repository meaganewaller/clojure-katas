(ns fizzbuzz.core)
(defn fizzbuzz [number]
  (if (zero? (rem number 3)) "fizz" number)
)
