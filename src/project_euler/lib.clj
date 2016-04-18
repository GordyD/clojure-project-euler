(ns project-euler.lib)

(defn multiplesOf 
  "Given a factor and an excluded upper limit, return a sequence of all the multiples of the factor from 1 - limit"
  [factor limit]
  (filter 
    (fn [x] (= (mod x factor) 0))
    (range 1 limit)))

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