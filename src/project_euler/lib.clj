(ns project-euler.lib)

(require '[clojure.string :as s])

(defn multiplesOf 
  "Given a number and an excluded upper limit, return a sequence of all the multiples of the number from start - limit"
  [number limit & {:keys [start] :or {start 1}}]
  (filter
    #(zero? (mod % number))
    (range start limit)))

(defn factorsOf
  "Given a number return a sequence of all the factors of the number"
  [number]
  (sort (mapcat (fn [x] [x (/ number x)])
    (filter
      #(zero? (mod number %))
      (range 1 (inc (Math/sqrt number)))))))

(defn fibonacciSequence
  "Given a maxValue and existing sequence generate a fibonacci sequence up to the max value"
  [maxVal fseq]
  (if (< (last fseq) maxVal)
    (fibonacciSequence maxVal (concat fseq [(apply + (take-last 2 fseq))]))
    (butlast fseq)
  ))

(defn prime?
  "Given a number calculate whether this number is a prime number or not"
  [x]
  (if (even? x) false
    (let [base (int (Math/sqrt x))]
      (loop [i 3]
        (if (> i base) true
          (if (zero? (mod x i)) false
            (recur (+ i 2))))))))

(defn palindrome?
  "Given a value, return true if, when cast to a string, the value is a palindrome e.g. its reverse equals itself"
  [x]
  (let [xstring (str x)]
    (= (s/reverse xstring) xstring)))