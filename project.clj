(defproject project-euler "0.1.0-SNAPSHOT"
  :description "project Euler Problems solved using Clojure"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot project-euler.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
