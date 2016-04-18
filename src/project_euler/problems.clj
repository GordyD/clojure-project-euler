(ns project-euler.problems)

(use '[project-euler.lib :as lib])

(defn problem1
  "See https://projecteuler.net/problem=1"
  []
  (println 
    (reduce + 
      (sort(distinct (concat
        (lib/multiplesOf 3 1000)
        (lib/multiplesOf 5 1000)))))))

(defn problem2
  "See https://projecteuler.net/problem=2"
  []
  (println 
    (reduce + 
      (filter 
        (fn [x] (= (mod x 2) 0))
        (lib/fibonacciSequence 4000000 [1 2])))))