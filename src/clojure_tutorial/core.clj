(ns clojure-tutorial.core
  (:require [clojure.string :as str])
  (:require [clojure-tutorial.stringlib :as strlib])
  (:require [clojure-tutorial.collib :as collib])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  []
  ;(strlib/test-string "this is a hello world test with numbers 12!")
  (collib/testlist (list 1 2 3 4 5 6 7 8 9 10))
  (collib/testvector [1 2 3 4 5 6 7 8 9 10])
  (collib/generate-seq 5)
  (println (first (collib/zeros))))




