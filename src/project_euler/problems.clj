(ns project-euler.problems)

(use '[project-euler.lib :as lib])

(defn problem1
  "See https://projecteuler.net/problem=1"
  []
    (reduce + 
      (sort(distinct (concat
        (lib/multiplesOf 3 1000)
        (lib/multiplesOf 5 1000))))))

(defn problem2
  "See https://projecteuler.net/problem=2"
  []
    (reduce + 
      (filter 
        #(zero? (mod % 2))
        (lib/fibonacciSequence 4000000 [1 2]))))

(defn problem3
  "See https://projecteuler.net/problem=3"
  []
    (apply max (filter
      #(lib/prime? %)
      (lib/factorsOf 600851475143)))
)

(defn problem4
  "See https://projecteuler.net/problem=4"
  []
  (let [rn (range 1000 100 -1)]
    (apply max (sort (filter
      #(lib/palindrome? %)
      (mapcat (fn [x] (map (fn [y] (* x y)) rn)) rn))))))

(defn problem5
  "See https://projecteuler.net/problem=5"
  []
  (println " [!] Yet to be implemented!")
)

(defn problem6
  "See https://projecteuler.net/problem=6"
  []
  (println " [!] Yet to be implemented!")
)

(defn problemX
  "See https://projecteuler.net/problem=x"
  []
  (println " [!] Yet to be implemented!")
)