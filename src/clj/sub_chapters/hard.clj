(ns clj.sub-chapters.hard
  (:require [clojurecademy.dsl.core :refer :all]
            [clojurecademy.dsl.test :refer :all]))


(def sub-ch-hard
  (sub-chapter 'sub-ch-hard
               "Hard"

               (subject 'subj-lis
                        "Longest Increasing Sub-Seq"

                        (learn
                          (text
                            (p "Given a vector of integers, find the longest consecutive sub-sequence of increasing numbers. If two sub-sequences have the same length, use the one that occurs first. An increasing sub-sequence must have a length of 2 or greater to qualify. Make your function called " (hi "lis"))))

                        (instruction 'ins-lis
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-lis
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (= (lis [1 0 1 2 3 0 4 5]) [0 1 2 3]))
                                                        (code (= (lis [5 6 1 3 2 7]) [5 6]))
                                                        (code (= (lis [2 3 3 4 5]) [3 4 5]))
                                                        (code (= (lis [7 6 5 4]) [])))
                                                      (testing
                                                        (is (= (lis [1 0 1 2 3 0 4 5]) [0 1 2 3]) :default :advanced)
                                                        (is (= (lis [5 6 1 3 2 7]) [5 6]) :default :advanced)
                                                        (is (= (lis [2 3 3 4 5]) [3 4 5]) :default :advanced)
                                                        (is (= (lis [7 6 5 4]) []) :default :advanced))))
                        'flipping-out)

               (subject 'subj-tic-tac-toe
                        "Analyze a Tic-Tac-Toe Board"

                        (learn
                          (text
                            (p "A tic-tac-toe board is represented by a two dimensional vector. X is represented by :x, O is represented by :o, and empty is represented by :e. A player wins by placing three Xs or three Os in a horizontal, vertical, or diagonal row. Write a function called " (hi "tic-tac-toe") " which analyzes a tic-tac-toe board and returns :x if X has won, :o if O has won, and nil if neither player has won.")))

                        (instruction 'ins-tic-tac-toe
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-tic-tac-toe
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code "(= nil (tic-tac-toe [[:e :e :e]\n            [:e :e :e]\n            [:e :e :e]]))")
                                                        (code "(= :x (tic-tac-toe [[:x :e :o]\n           [:x :e :e]\n           [:x :e :o]]))")
                                                        (code "(= :o (tic-tac-toe [[:e :x :e]\n           [:o :o :o]\n           [:x :e :x]]))")
                                                        (code "(= nil (tic-tac-toe [[:x :e :o]\n            [:x :x :e]\n            [:o :x :o]]))")
                                                        (code "(= :x (tic-tac-toe [[:x :e :e]\n           [:o :x :e]\n           [:o :e :x]]))")
                                                        (code "(= :o (tic-tac-toe [[:x :e :o]\n           [:x :o :e]\n           [:o :e :x]]))")
                                                        (code "(= nil (tic-tac-toe [[:x :o :x]\n            [:x :o :x]\n            [:o :x :o]]))"))
                                                      (testing
                                                        (is (= nil (tic-tac-toe [[:e :e :e]
                                                                                 [:e :e :e]
                                                                                 [:e :e :e]])) :default :advanced)
                                                        (is (= :x (tic-tac-toe [[:x :e :o]
                                                                                [:x :e :e]
                                                                                [:x :e :o]])) :default :advanced)
                                                        (is (= :o (tic-tac-toe [[:e :x :e]
                                                                                [:o :o :o]
                                                                                [:x :e :x]])) :default :advanced)
                                                        (is (= nil (tic-tac-toe [[:x :e :o]
                                                                                 [:x :x :e]
                                                                                 [:o :x :o]])) :default :advanced)
                                                        (is (= :x (tic-tac-toe [[:x :e :e]
                                                                                [:o :x :e]
                                                                                [:o :e :x]])) :default :advanced)
                                                        (is (= :o (tic-tac-toe [[:x :e :o]
                                                                                [:x :o :e]
                                                                                [:o :e :x]])) :default :advanced)
                                                        (is (= nil (tic-tac-toe [[:x :o :x]
                                                                                 [:x :o :x]
                                                                                 [:o :x :o]])) :default :advanced)
                                                        )))
                        'tic-tac-toe)

               (subject 'subj-roman
                        "Read Roman numerals"

                        (learn
                          (text
                            (p "Roman numerals are easy to recognize, but not everyone knows all the rules necessary to work with them. Write a function called " (hi "roman") " to parse a Roman-numeral string and return the number it represents. You can assume that the input will be well-formed, in upper-case, and follow the " (link "subtractive principle" "http://en.wikipedia.org/wiki/Roman_numerals#Subtractive_principle") ". You don't need to handle any numbers greater than MMMCMXCIX (3999), the largest number representable with ordinary letters.")))

                        (instruction 'ins-roman
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-roman
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (= 14 (roman "XIV")))
                                                        (code (= 827 (roman "DCCCXXVII")))
                                                        (code (= 3999 (roman "MMMCMXCIX")))
                                                        (code (= 48 (roman "XLVIII"))))
                                                      (testing
                                                        (is (= 14 (roman "XIV")) :default :advanced)
                                                        (is (= 827 (roman "DCCCXXVII")) :default :advanced)
                                                        (is (= 3999 (roman "MMMCMXCIX")) :default :advanced)
                                                        (is (= 48 (roman "XLVIII")) :default :advanced))))
                        'roman)

               (subject 'subj-min-path
                        "Triangle Minimal Path"

                        (learn
                          (text
                            (p "Write a function called " (hi "min-path") " which calculates the sum of the minimal path through a triangle. The triangle is represented as a collection of vectors. The path should start at the top of the triangle and move to an adjacent number on the next row until the bottom of the triangle is reached.")))

                        (instruction 'ins-roman
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-roman
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code "(= 7 (min-path '([1]\n          [2 4]\n         [5 1 4]\n        [2 3 4 5]))) ; 1->2->1->3")
                                                        (code "(= 20 (min-path '([3]\n           [2 4]\n          [1 9 3]\n         [9 9 2 4]\n        [4 6 6 7 8]\n       [5 7 3 5 1 4]))) ; 3->4->3->2->7->1"))
                                                      (testing
                                                        (is (= 7 (min-path '([1]
                                                                              [2 4]
                                                                              [5 1 4]
                                                                              [2 3 4 5]))) :default :advanced)
                                                        (is (= 20 (min-path '([3]
                                                                               [2 4]
                                                                               [1 9 3]
                                                                               [9 9 2 4]
                                                                               [4 6 6 7 8]
                                                                               [5 7 3 5 1 4])))
                                                            :default :advanced))))
                        'roman)

               (subject 'subj-word-chains
                        "Word Chains"

                        (learn
                          (text
                            (p "A word chain consists of a set of words ordered so that each word differs by only one letter from the words directly before and after it. The one letter difference can be either an insertion, a deletion, or a substitution. Here is an example word chain:")
                            (p "cat -> cot -> coat -> oat -> hat -> hot -> hog -> dog")
                            (p "Write a function called " (hi "word-chains?") " which takes a sequence of words, and returns true if they can be arranged into one continous word chain, and false if they cannot.\n")))

                        (instruction 'ins-word-chains
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-word-chains
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (= true (word-chains? #{"hat" "coat" "dog" "cat" "oat" "cot" "hot" "hog"})))
                                                        (code (= false (word-chains? #{"cot" "hot" "bat" "fat"})))
                                                        (code (= false (word-chains? #{"to" "top" "stop" "tops" "toss"})))
                                                        (code (= true (word-chains? #{"spout" "do" "pot" "pout" "spot" "dot"})))
                                                        (code (= true (word-chains? #{"share" "hares" "shares" "hare" "are"})))
                                                        (code (= false (word-chains? #{"share" "hares" "hare" "are"}))))
                                                      (testing
                                                        (is (= true (word-chains? #{"hat" "coat" "dog" "cat" "oat" "cot" "hot" "hog"})) :default :advanced)
                                                        (is (= false (word-chains? #{"cot" "hot" "bat" "fat"})) :default :advanced)
                                                        (is (= false (word-chains? #{"to" "top" "stop" "tops" "toss"})) :default :advanced)
                                                        (is (= true (word-chains? #{"spout" "do" "pot" "pout" "spot" "dot"})) :default :advanced)
                                                        (is (= true (word-chains? #{"share" "hares" "shares" "hare" "are"})) :default :advanced)
                                                        (is (= false (word-chains? #{"share" "hares" "hare" "are"})) :default :advanced))))
                        'word-chains)

               (subject 'subj-graph-tour
                        "Graph Tour"

                        (learn
                          (text
                            (p "Starting with a graph you must write a function that returns true if it is possible to make a tour of the graph in which every edge is visited exactly once. The graph is represented by a vector of tuples, where each tuple represents a single edge. Make your function called " (hi "graph-tour?"))
                            (p "The rules are:")
                            (p "- You can start at any node.")
                            (p "- You must visit each edge exactly once.")
                            (p "- All edges are undirected.")))

                        (instruction 'ins-graph-tour
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-graph-tour
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (= true (graph-tour? [[:a :b]])))
                                                        (code (= false (graph-tour? [[:a :a] [:b :b]])))
                                                        (code "(= false (graph-tour? [[:a :b] [:a :b] [:a :c] [:c :a]\n               [:a :d] [:b :d] [:c :d]]))")
                                                        (code (= true (graph-tour? [[1 2] [2 3] [3 4] [4 1]])))
                                                        (code "(= true (graph-tour? [[:a :b] [:a :c] [:c :b] [:a :e]\n              [:b :e] [:a :d] [:b :d] [:c :e]\n              [:d :e] [:c :f] [:d :f]]))")
                                                        (code (= false (graph-tour? [[1 2] [2 3] [2 4] [2 5]]))))
                                                      (testing
                                                        (is (= true (graph-tour? [[:a :b]])) :default :advanced)
                                                        (is (= false (graph-tour? [[:a :a] [:b :b]])) :default :advanced)
                                                        (is (= false (graph-tour? [[:a :b] [:a :b] [:a :c] [:c :a]
                                                                                   [:a :d] [:b :d] [:c :d]])) :default :advanced)
                                                        (is (= true (graph-tour? [[1 2] [2 3] [3 4] [4 1]])) :default :advanced)
                                                        (is (= true (graph-tour? [[:a :b] [:a :c] [:c :b] [:a :e]
                                                                                  [:b :e] [:a :d] [:b :d] [:c :e]
                                                                                  [:d :e] [:c :f] [:d :f]])) :default :advanced)
                                                        (is (= false (graph-tour? [[1 2] [2 3] [2 4] [2 5]])) :default :advanced))))
                        'graph-tour)

               (subject 'subj-graph-connectivity
                        "Graph Connectivity"

                        (learn
                          (text
                            (p "Given a graph, determine whether the graph is connected. A connected graph is such that a path exists between any two given nodes.")
                            (p "-Write function called " (hi "connectivity?") " must return true if the graph is connected and false otherwise.")
                            (p "-You will be given a set of tuples representing the edges of a graph. Each member of a tuple being a vertex/node in the graph.")
                            (p "-Each edge is undirected (can be traversed either direction).")))

                        (instruction 'ins-graph-connectivity
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-graph-connectivity
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (= true (connectivity? #{[:a :a]})))
                                                        (code (= true (connectivity? #{[:a :b]})))
                                                        (code "(= false (connectivity? #{[1 2] [2 3] [3 1]\n               [4 5] [5 6] [6 4]}))")
                                                        (code "(= true (connectivity? #{[1 2] [2 3] [3 1]\n              [4 5] [5 6] [6 4] [3 4]}))")
                                                        (code "(= false (connectivity? #{[:a :b] [:b :c] [:c :d]\n               [:x :y] [:d :a] [:b :e]}))")
                                                        (code "(= true (connectivity? #{[:a :b] [:b :c] [:c :d]\n              [:x :y] [:d :a] [:b :e] [:x :a]}))"))
                                                      (testing
                                                        (is (= true (connectivity? #{[:a :a]})) :default :advanced)
                                                        (is (= true (connectivity? #{[:a :b]})) :default :advanced)
                                                        (is (= false (connectivity? #{[1 2] [2 3] [3 1]
                                                                                      [4 5] [5 6] [6 4]})) :default :advanced)
                                                        (is (= true (connectivity? #{[1 2] [2 3] [3 1]
                                                                                     [4 5] [5 6] [6 4] [3 4]})) :default :advanced)
                                                        (is (= false (connectivity? #{[:a :b] [:b :c] [:c :d]
                                                                                      [:x :y] [:d :a] [:b :e]})) :default :advanced)
                                                        (is (= true (connectivity? #{[:a :b] [:b :c] [:c :d]
                                                                                     [:x :y] [:d :a] [:b :e] [:x :a]})) :default :advanced))))
                        'graph-connectivity)

               (subject 'subj-levenshtein
                        "Levenshtein Distance"

                        (learn
                          (text
                            (p "Given two sequences x and y, calculate the " (link "Levenshtein distance"
                                                                                   "https://secure.wikimedia.org/wikipedia/en/wiki/Levenshtein_distance")
                               " of x and y, i. e. the minimum number of edits needed to transform x into y. The allowed edits are:")
                            (p "Write a function called " (hi "lev-dist"))
                            (p "- insert a single item")
                            (p "- delete a single item")
                            (p "- replace a single item with another item")
                            (p "WARNING: Some of the test cases may timeout if you write an inefficient solution!")))

                        (instruction 'ins-levenshtein
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-levenshtein
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (= (lev-dist "kitten" "sitting") 3))
                                                        (code (= (lev-dist "closure" "clojure") (lev-dist "clojure" "closure") 1))
                                                        (code (= (lev-dist "xyx" "xyyyx") 2))
                                                        (code (= (lev-dist "" "123456") 6))
                                                        (code (= (lev-dist "Clojure" "Clojure") (lev-dist "" "") (lev-dist [] []) 0))
                                                        (code (= (lev-dist [1 2 3 4] [0 2 3 4 5]) 2))
                                                        (code (= (lev-dist '(:a :b :c :d) '(:a :d)) 2))
                                                        (code (= (lev-dist "ttttattttctg" "tcaaccctaccat") 10))
                                                        (code (= (lev-dist "gaattctaatctc" "caaacaaaaaattt") 9))
                                                        )
                                                      (testing
                                                        (is (= (lev-dist "kitten" "sitting") 3) :default :advanced)
                                                        (is (= (lev-dist "closure" "clojure") (lev-dist "clojure" "closure") 1) :default :advanced)
                                                        (is (= (lev-dist "xyx" "xyyyx") 2) :default :advanced)
                                                        (is (= (lev-dist "" "123456") 6) :default :advanced)
                                                        (is (= (lev-dist "Clojure" "Clojure") (lev-dist "" "") (lev-dist [] []) 0) :default :advanced)
                                                        (is (= (lev-dist [1 2 3 4] [0 2 3 4 5]) 2) :default :advanced)
                                                        (is (= (lev-dist '(:a :b :c :d) '(:a :d)) 2) :default :advanced)
                                                        (is (= (lev-dist "ttttattttctg" "tcaaccctaccat") 10) :default :advanced)
                                                        (is (= (lev-dist "gaattctaatctc" "caaacaaaaaattt") 9) :default :advanced))))
                        'levenshtein)

               (subject 'subj-number-maze
                        "Number Maze"

                        (learn
                          (text
                            (p "Given a pair of numbers, the start and end point, find a path between the two using only three possible operations:")
                            (p "-double")
                            (p "-halve (odd numbers cannot be halved)")
                            (p "-add 2")
                            (p "Find the shortest path through the \"maze\". Because there are multiple shortest paths, you must return the length of the shortest path, not the path itself.")
                            (p "Make your function called " (hi "number-maze") ".")))

                        (instruction 'ins-number-maze
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-number-maze
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code "(= 1 (number-maze 1 1))  ; 1")
                                                        (code "(= 3 (number-maze 3 12)) ; 3 6 12")
                                                        (code "(= 3 (number-maze 12 3)) ; 12 6 3")
                                                        (code "(= 3 (number-maze 5 9))  ; 5 7 9")
                                                        (code "(= 9 (number-maze 9 2))  ; 9 18 20 10 12 6 8 4 2")
                                                        (code "(= 5 (number-maze 9 12)) ; 9 11 22 24 12"))
                                                      (testing
                                                        (is (= 1 (number-maze 1 1)) :default :advanced)
                                                        (is (= 3 (number-maze 3 12)) :default :advanced)
                                                        (is (= 3 (number-maze 12 3)) :default :advanced)
                                                        (is (= 3 (number-maze 5 9)) :default :advanced)
                                                        (is (= 9 (number-maze 9 2)) :default :advanced)
                                                        (is (= 5 (number-maze 9 12)) :default :advanced))))
                        'number-maze)

               (subject 'subj-data-dance
                        "Making Data Dance"

                        (learn
                          (text
                            (p "Write a function called " (hi "make-data-dance") " that takes a variable number of integer arguments. If the output is coerced into a string, it should return a comma (and space) separated list of the inputs sorted smallest to largest. If the output is coerced into a sequence, it should return a seq of unique input elements in the same order as they were entered.")))

                        (instruction 'ins-data-dance
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :restricted-fns '[proxy])

                                     (sub-instruction 'sub-ins-data-dance
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (= "1, 2, 3" (str (make-data-dance 2 1 3))))
                                                        (code (= '(2 1 3) (seq (make-data-dance 2 1 3))))
                                                        (code (= '(2 1 3) (seq (make-data-dance 2 1 3 3 1 2))))
                                                        (code (= '(1) (seq (apply make-data-dance (repeat 5 1)))))
                                                        (code (= "1, 1, 1, 1, 1" (str (apply make-data-dance (repeat 5 1)))))
                                                        (code "(and (= nil (seq (make-data-dance)))\n     (=  \"\" (str (make-data-dance))))")
                                                        )
                                                      (testing
                                                        (is (= "1, 2, 3" (str (make-data-dance 2 1 3))) :default :advanced)
                                                        (is (= '(2 1 3) (seq (make-data-dance 2 1 3))) :default :advanced)
                                                        (is (= '(2 1 3) (seq (make-data-dance 2 1 3 3 1 2))) :default :advanced)
                                                        (is (= '(1) (seq (apply make-data-dance (repeat 5 1)))) :default :advanced)
                                                        (is (and (= nil (seq (make-data-dance)))
                                                                 (= "" (str (make-data-dance)))) :default :advanced))))
                        'data-dance)))

(defcoursetest my-test-1
               [ch-problems sub-ch-hard subj-lis ins-lis sub-ins-lis]
               (defn lis
                 [coll]
                 (or (->>
                       (map vector coll (range))
                       (partition-by #(apply - %))
                       (map #(map first %))
                       (filter #(> (count %) 1))
                       (sort-by (comp - count)) first)
                     [])))

(defcoursetest my-test-2
               [ch-problems sub-ch-hard subj-tic-tac-toe ins-tic-tac-toe sub-ins-tic-tac-toe]
               (defn tic-tac-toe [b]
                 (letfn [(w [[[a b c]
                              [d e f]
                              [g h i]] p] (or (= p a b c)
                                              (= p d e f)
                                              (= p g h i)
                                              (= p a d g)
                                              (= p b e h)
                                              (= p c f i)
                                              (= p a e i)
                                              (= p c e g)))]
                   (cond (w b :x) :x
                         (w b :o) :o
                         :else nil))))

(defcoursetest my-test-3
               [ch-problems sub-ch-hard subj-roman ins-roman sub-ins-roman]
               (defn roman [numeral]
                 (-> (let [roman {\I 1, \V 5, \X 10, \L 50, \C 100, \D 500, \M 1000}
                           digit (roman (first (vec numeral)))]
                       (reduce
                         (fn [[acc prv] cur]
                           (let [nacc (+ acc cur)]
                             [(if (< prv cur) (- nacc (* 2 prv)) nacc) cur]))
                         [digit digit] (map roman (rest (vec numeral))))) (first))))

(defcoursetest my-test-4
               [ch-problems sub-ch-hard subj-min-path ins-roman sub-ins-roman]
               (defn min-path [col]
                 (first
                   (reduce #(map +
                                 (map min (butlast %1)
                                      (rest %1))
                                 %2)
                           (reverse col)))))

(defcoursetest my-test-5
               [ch-problems sub-ch-hard subj-word-chains ins-word-chains sub-ins-word-chains]
               (defn word-chains? [words]
                 (let [connected?     (fn connected? [[a & rest-a] [b & rest-b]]
                                        (if (= a b) (connected? rest-a rest-b)
                                                    (or (= rest-a (cons b rest-b)) ; addition
                                                        (= rest-a rest-b) ; substitution
                                                        (= (cons a rest-a) rest-b)))) ; subtraction
                       connections-of (fn [word] (filter #(and (not= word %) (connected? word %)) words))
                       adjacencies    (into {} (map #(vector % (connections-of %)) words))
                       chain?         (fn chain? [visited word]
                                        (if (= (count words) (inc (count visited))) true
                                                                                    (some (partial chain? (conj visited word))
                                                                                          (clojure.set/difference (into #{} (get adjacencies word)) visited))))]
                   (boolean (some (partial chain? #{}) words)))))

(defcoursetest my-test-6
               [ch-problems sub-ch-hard subj-graph-tour ins-graph-tour sub-ins-graph-tour]
               (defn graph-tour? [graph]
                 (letfn [(step [current-vertice searched-edge graph]
                           (if (= (count searched-edge) (count graph))
                             true
                             (let [next-edges (filter
                                                #(nil? (some #{%} searched-edge))
                                                (filter #(some #{current-vertice} %) graph))]
                               (if (seq next-edges)
                                 (true?
                                   (some
                                     true?
                                     (map
                                       #(step
                                          (first (filter (fn [vertice] (not= vertice current-vertice)) %))
                                          (cons % searched-edge)
                                          graph)
                                       next-edges)))
                                 false))))]
                   (step (first (flatten graph)) [] graph))))

(defcoursetest my-test-7
               [ch-problems sub-ch-hard subj-graph-connectivity ins-graph-connectivity sub-ins-graph-connectivity]
               (defn add-edge [g [a b]]
                 (let [r (reduce conj (g a #{a}) (g b #{b}))]
                   (reduce #(assoc % %2 r) g r)))

               (defn connectivity? [x]
                 (apply = (vals (reduce add-edge {} x)))))

(defcoursetest my-test-8
               [ch-problems sub-ch-hard subj-levenshtein ins-levenshtein sub-ins-levenshtein]
               (defn lev-dist [a b]
                 (letfn [(step [calculated-result coordinate]
                           (let [x (first coordinate)
                                 y (last coordinate)]
                             (assoc calculated-result
                               coordinate
                               (if (zero? (min x y))
                                 (max x y)
                                 (min
                                   (inc (calculated-result [(dec x) y]))
                                   (inc (calculated-result [x (dec y)]))
                                   (+
                                     (calculated-result [(dec x) (dec y)])
                                     (if (= ((vec a) (dec x)) ((vec b) (dec y))) 0 1)))))))]
                   ((reduce step {} (apply concat (map #(map (fn [i] [% i]) (range 0 (inc (count b)))) (range 0 (inc (count a)))))) [(count a) (count b)]))))

(defcoursetest my-test-9
               [ch-problems sub-ch-hard subj-number-maze ins-number-maze sub-ins-number-maze]
               (defn number-maze [start end]
                 (letfn [(transform [num]
                           (if (even? num)
                             [(* 2 num) (+ 2 num) (quot num 2)]
                             [(* 2 num) (+ 2 num)]))
                         (step [current-set end step-count]
                           (let [next-set (reduce into #{} (map transform current-set))]
                             (if (next-set end)
                               (inc step-count)
                               (step next-set end (inc step-count)))))]
                   (if (= start end)
                     1
                     (step #{start} end 1)))))

(defcoursetest my-test-10
               [ch-problems sub-ch-hard subj-data-dance ins-data-dance sub-ins-data-dance]
               (defn make-data-dance [& coll]
                 (reify
                   java.lang.Object
                   (toString [this]
                     (apply str (interpose ", " (sort coll))))
                   clojure.lang.Seqable
                   (seq [this]
                     (letfn [(step [coll result]
                               (if (seq coll)
                                 (let [head (first coll)]
                                   (if (some #{head} result)
                                     (step (next coll) result)
                                     (step (next coll) (concat result [head]))))
                                 result))]
                       (step coll nil))))))
