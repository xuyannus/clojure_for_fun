(ns clojure-tutorial.collib)


(defn testlist
  "test functions of list"
  [l]
  (println (count l))
  (println (list? l))
  ; (println (contains? l 10)) -- not supported
  (println (conj l 10))
  (println (conj l "start"))
  ; (println (assoc l 3 true))
  (println (map #(+ %1 %1) l))
  (println (get l 1))
  (println (get l 100))
  (println (pop l))
  (println (peek l))
  (println (first l))
  (println (rest l))
  (println (seq l)))




(defn testvector
  "test functions of vector"
  [v]
  (println (count v))
  (println (vector? v))
  (println (contains? v 9))
  (println (conj v 10))
  (println (conj v "end"))
  (println (assoc v 3 true))
  (println (map #(+ %1 %1) v))
  (println (get v 1))
  (println (get v 100))
  (println (pop v))
  (println (peek v))
  (println (first v))
  (println (rest v))
  (println (seq v)))



(defn generate-seq
  [n]
  (println (range 1 n))
  (println (range 1 n 2))
  (println (range n 1 -2))
  (println (range 1 n 0.5))
  (println (repeat 3 5))
  (println (repeatedly 3 rand))
  (println (take 10 (cycle [1 2 3])))
  (println (take 10 (iterate dec 2)))

  (println (next [2 3 4 5]))
  (println (next []))

  (println (nth [7 8 9 10] 3))
  (println (nth [7 8 9] 5 10))
  (println (map + [1 2 3 4 5]))
  (println (map * [1 2 3 4] [2 3 4]))
  (println (reduce + [1 2 3 4 5]))
  (println (reduce + 10 [1 2 3 4 5]))
  (println (reductions + 20 [1 2 3 4]))

  ;; basic functions
  (println (filter even? [1 2 3 4 5 6]))
  (println (remove even? [1 2 3 4 5 6]))
  (println (take 3 [1 2 3 4 5 6]))
  (println (take-last 3 [1 2 3 4 5 6]))
  (println (take-nth 2 [1 2 3 4 5 6]))

  ;; more functions
  (println (interleave [1 2 3] [3 ] [6 7]))
  (println (interpose 3 [1 2 3 4]))
  (println (distinct [1 2 3 4 5 1 2 3 4 5]))
  (println (reverse [1 2 3 4 5]))
  (println (flatten [1 2 3 [3 4 [6] [5 6]]]))
  (println (sort > [1 3 5 7 2 5 9]))
  (println (sort [1 2 8 9 5 6])))


(defn zeros
  []
  (lazy-seq (cons 0 (zeros))))


