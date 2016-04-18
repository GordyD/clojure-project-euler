(ns project-euler.core)
(require ['clojure.test])
(use ['project-euler.problems])

(defn -main
  "Given the application args, run the specified problem implementation"
  [& args]
  (if 
    (= (count args) 1)
    ;; then
    (if
      (clojure.test/function? (symbol "project-euler.problems" (first args)))
      ;; then
      (println (@(resolve (symbol "project-euler.problems" (first args)))))
      ;; else
      (println " [x] Error:" (first args) "does not exist, please specify one that does to get output!")
    )
    ;; else
    (println "[x] No problem specified, please specify one eg. problem2!")))
