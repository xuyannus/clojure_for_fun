(ns clojure-tutorial.stringlib
  (:require [clojure.string :as str]))


(defn test-string
  "test different functions of string class"

  [s]

  (println (str/upper-case s))
  (println (str/replace s #"\d" "num"))
  (println (str/ends-with? s "dumb"))
  (println (str/includes? s "test"))
  (println (str/blank? s))
  (println (str/capitalize s))
  (println (str/index-of s "my"))
  (println (str/escape s {\! "!!!"}))
  (println (str/join ["hello: " s]))
  (println (str/reverse s))
  (println (str/trim s))
  (println (str/starts-with? s "hello"))
  )
