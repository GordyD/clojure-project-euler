(ns project-euler.lib)

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

(defn fibonacciStep
  [a b]
  (+ a b)
)

(defn fibonacciSequence
  [maxVal fseq]
  (if (< (last fseq) maxVal)
    (fibonacciSequence maxVal (concat fseq [(apply fibonacciStep (take-last 2 fseq))]))
    (butlast fseq)
  ))

(defn prime?
  [x]
  (if (even? x) false
    (let [base (int (Math/sqrt x))]
      (loop [i 3]
        (if (> i base) true
          (if (zero? (mod x i)) false
            (recur (+ i 2))))))))