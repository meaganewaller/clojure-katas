(ns fizzbuzz.core)
(defn fizz? [number]
  (zero? (rem number 3)))

(defn buzz? [number]
  (zero? (rem number 5)))

(defn fizz-buzz? [number]
  (and (fizz? number) (buzz? number)))

(defn fizzbuzz [number]
  (if (fizz-buzz? number) "fizzbuzz"
    (if (fizz? number) "fizz"
      (if (buzz? number) "buzz" number))))

