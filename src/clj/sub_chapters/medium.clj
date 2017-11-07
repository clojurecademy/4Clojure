(ns clj.sub-chapters.medium
  (:require [clojurecademy.dsl.core :refer :all]
            [clojurecademy.dsl.test :refer :all]))


(def sub-ch-medium
  (sub-chapter 'sub-ch-medium
               "Medium"

               (subject 'subj-flipping-out
                        "Flipping out"

                        (learn
                          (text
                            (p "Write a function called " (hi "flip") " which flips the order of the arguments of an input function.")))

                        (instruction 'ins-flipping-out
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-flipping-out
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (= 3 ((flip nth) 2 [1 2 3 4 5])))
                                                        (code (= true ((flip >) 7 8)))
                                                        (code (= 4 ((flip quot) 2 8)))
                                                        (code (= [1 2 3] ((flip take) [1 2 3 4 5] 3))))
                                                      (testing
                                                        (is (= 3 ((flip nth) 2 [1 2 3 4 5])) :default :advanced)
                                                        (is (= true ((flip >) 7 8)) :default :advanced)
                                                        (is (= 4 ((flip quot) 2 8)) :default :advanced)
                                                        (is (= [1 2 3] ((flip take) [1 2 3 4 5] 3)) :default :advanced))))
                        'flipping-out)


               (subject 'subj-rotate-sequence
                        "Rotate Sequence"

                        (learn
                          (text
                            (p "Write a function called " (hi "rotate") " which can rotate a sequence in either direction.")))

                        (instruction 'ins-rotate-sequence
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-rotate-sequence
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code "(= (rotate 2 [1 2 3 4 5]) '(3 4 5 1 2))")
                                                        (code "(= (rotate -2 [1 2 3 4 5]) '(4 5 1 2 3))")
                                                        (code "(= (rotate 6 [1 2 3 4 5]) '(2 3 4 5 1))")
                                                        (code "(= (rotate 1 '(:a :b :c)) '(:b :c :a))")
                                                        (code "(= (rotate -4 '(:a :b :c)) '(:c :a :b))"))
                                                      (testing
                                                        (is (= (rotate 2 [1 2 3 4 5]) '(3 4 5 1 2)) :default :advanced)
                                                        (is (= (rotate -2 [1 2 3 4 5]) '(4 5 1 2 3)) :default :advanced)
                                                        (is (= (rotate 6 [1 2 3 4 5]) '(2 3 4 5 1)) :default :advanced)
                                                        (is (= (rotate 1 '(:a :b :c)) '(:b :c :a)) :default :advanced)
                                                        (is (= (rotate -4 '(:a :b :c)) '(:c :a :b)) :default :advanced))))
                        'rotate-sequence)


               (subject 'subj-reverse-interleave
                        "Reverse Interleave"

                        (learn
                          (text
                            (p "Write a function called " (hi "reverse-interleave") " which reverses the interleave process into x number of subsequences.")))

                        (instruction 'ins-reverse-interleave
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-reverse-interleave
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code "(= (reverse-interleave [1 2 3 4 5 6] 2) '((1 3 5) (2 4 6)))")
                                                        (code "(= (reverse-interleave (range 9) 3) '((0 3 6) (1 4 7) (2 5 8)))")
                                                        (code "(= (reverse-interleave (range 10) 5) '((0 5) (1 6) (2 7) (3 8) (4 9)))"))
                                                      (testing
                                                        (is (= (reverse-interleave [1 2 3 4 5 6] 2) '((1 3 5) (2 4 6))) :default :advanced)
                                                        (is (= (reverse-interleave (range 9) 3) '((0 3 6) (1 4 7) (2 5 8))) :default :advanced)
                                                        (is (= (reverse-interleave (range 10) 5) '((0 5) (1 6) (2 7) (3 8) (4 9))) :default :advanced))))
                        'reverse-interleave)


               (subject 'subj-split-by-type
                        "Split by Type"

                        (learn
                          (text
                            (p "Write a function called " (hi "split-by-type") " which takes a sequence consisting of items with different types and splits them up into a set of homogeneous sub-sequences. The internal order of each sub-sequence should be maintained, but the sub-sequences themselves can be returned in any order (this is why 'set' is used in the test cases).")))

                        (instruction 'ins-split-by-type
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-split-by-type
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (= (set (split-by-type [1 :a 2 :b 3 :c])) #{[1 2 3] [:a :b :c]}))
                                                        (code (= (set (split-by-type [:a "foo" "bar" :b])) #{[:a :b] ["foo" "bar"]}))
                                                        (code (= (set (split-by-type [[1 2] :a [3 4] 5 6 :b])) #{[[1 2] [3 4]] [:a :b] [5 6]})))
                                                      (testing
                                                        (is (= (set (split-by-type [1 :a 2 :b 3 :c])) #{[1 2 3] [:a :b :c]}) :default :advanced)
                                                        (is (= (set (split-by-type [:a "foo" "bar" :b])) #{[:a :b] ["foo" "bar"]}) :default :advanced)
                                                        (is (= (set (split-by-type [[1 2] :a [3 4] 5 6 :b])) #{[[1 2] [3 4]] [:a :b] [5 6]}) :default :advanced))))
                        'split-by-type)


               (subject 'subj-count-occurrences
                        "Count Occurrences"

                        (learn
                          (text
                            (p "Write a function called " (hi "my-frequencies") " which returns a map containing the number of occurences of each distinct item in a sequence.")))

                        (instruction 'ins-count-occurrences
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :restricted-fns '[frequencies])

                                     (sub-instruction 'sub-ins-count-occurrences
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (= (my-frequencies [1 1 2 3 2 1 1]) {1 4, 2 2, 3 1}))
                                                        (code (= (my-frequencies [:b :a :b :a :b]) {:a 2, :b 3}))
                                                        (code "(= (my-frequencies '([1 2] [1 3] [1 3])) {[1 2] 1, [1 3] 2})"))
                                                      (testing
                                                        (is (= (my-frequencies [1 1 2 3 2 1 1]) {1 4, 2 2, 3 1}) :default :advanced)
                                                        (is (= (my-frequencies [:b :a :b :a :b]) {:a 2, :b 3}) :default :advanced)
                                                        (is (= (my-frequencies '([1 2] [1 3] [1 3])) {[1 2] 1, [1 3] 2}) :default :advanced))))
                        'count-occurrences)


               (subject 'subj-find-distinct-items
                        "Find Distinct Items"

                        (learn
                          (text
                            (p "Write a function called " (hi "my-distinct") " which removes the duplicates from a sequence. Order of the items must be maintained.")))

                        (instruction 'ins-find-distinct-items
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :restricted-fns '[distinct])

                                     (sub-instruction 'sub-ins-find-distinct-items
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (= (my-distinct [1 2 1 3 1 2 4]) [1 2 3 4]))
                                                        (code (= (my-distinct [:a :a :b :b :c :c]) [:a :b :c]))
                                                        (code "(= (my-distinct '([2 4] [1 2] [1 3] [1 3])) '([2 4] [1 2] [1 3]))")
                                                        (code (= (my-distinct (range 50)) (range 50))))
                                                      (testing
                                                        (is (= (my-distinct [1 2 1 3 1 2 4]) [1 2 3 4]) :default :advanced)
                                                        (is (= (my-distinct [:a :a :b :b :c :c]) [:a :b :c]) :default :advanced)
                                                        (is (= (my-distinct '([2 4] [1 2] [1 3] [1 3])) '([2 4] [1 2] [1 3])) :default :advanced)
                                                        (is (= (my-distinct (range 50)) (range 50)) :default :advanced))))
                        'find-distinct-items)


               (subject 'subj-function-composition
                        "Function Composition"

                        (learn
                          (text
                            (p "Write a function called " (hi "my-comp") " which allows you to create function compositions. The parameter list should take a variable number of functions, and create a function that applies them from right-to-left.")))

                        (instruction 'ins-function-composition
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :restricted-fns '[comp])

                                     (sub-instruction 'sub-ins-function-composition
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (= [3 2 1] ((my-comp rest reverse) [1 2 3 4])))
                                                        (code (= 5 ((my-comp (partial + 3) second) [1 2 3 4])))
                                                        (code "(= true ((my-comp zero? #(mod % 8) +) 3 5 7 9))")
                                                        (code "(= \"HELLO\" ((my-comp #(.toUpperCase %) #(apply str %) take) 5 \"hello world\"))"))
                                                      (testing
                                                        (is (= [3 2 1] ((my-comp rest reverse) [1 2 3 4])) :default :advanced)
                                                        (is (= 5 ((my-comp (partial + 3) second) [1 2 3 4])) :default :advanced)
                                                        (is (= true ((my-comp zero? #(mod % 8) +) 3 5 7 9)) :default :advanced)
                                                        (is (= "HELLO" ((my-comp #(.toUpperCase %) #(apply str %) take) 5 "hello world")) :default :advanced))))
                        'function-composition)


               (subject 'subj-partition-a-sequence
                        "Partition a Sequence"

                        (learn
                          (text
                            (p "Write a function called " (hi "my-partition") " which returns a sequence of lists of x items each. Lists of less than x items should not be returned.")))

                        (instruction 'ins-partition-a-sequence
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :restricted-fns '[partition partition-all])

                                     (sub-instruction 'sub-ins-partition-a-sequence
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code "(= (my-partition 3 (range 9)) '((0 1 2) (3 4 5) (6 7 8)))")
                                                        (code "(= (my-partition 2 (range 8)) '((0 1) (2 3) (4 5) (6 7)))")
                                                        (code "(= (my-partition 3 (range 8)) '((0 1 2) (3 4 5)))"))
                                                      (testing
                                                        (is (= (my-partition 3 (range 9)) '((0 1 2) (3 4 5) (6 7 8))) :default :advanced)
                                                        (is (= (my-partition 2 (range 8)) '((0 1) (2 3) (4 5) (6 7))) :default :advanced)
                                                        (is (= (my-partition 3 (range 8)) '((0 1 2) (3 4 5))) :default :advanced))))
                        'partition-a-sequence)


               (subject 'subj-juxtaposition
                        "Juxtaposition"

                        (learn
                          (text
                            (p "Write a function called " (hi "my-juxt") " which takes a set of functions and return a new function that takes a variable number of arguments and returns a sequence containing the result of applying each function left-to-right to the argument list.")))

                        (instruction 'ins-juxtaposition
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :restricted-fns '[juxt])

                                     (sub-instruction 'sub-ins-juxtaposition
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code "(= [21 6 1] ((my-juxt + max min) 2 3 5 1 6 4))")
                                                        (code "(= [\"HELLO\" 5] ((my-juxt #(.toUpperCase %) count) \"hello\"))")
                                                        (code "(= [2 6 4] ((my-juxt :a :c :b) {:a 2, :b 4, :c 6, :d 8 :e 10}))"))
                                                      (testing
                                                        (is (= [21 6 1] ((my-juxt + max min) 2 3 5 1 6 4)) :default :advanced)
                                                        (is (= ["HELLO" 5] ((my-juxt #(.toUpperCase %) count) "hello")) :default :advanced)
                                                        (is (= [2 6 4] ((my-juxt :a :c :b) {:a 2, :b 4, :c 6, :d 8 :e 10})) :default :advanced))))
                        'juxtaposition)


               (subject 'subj-sequence-reductions
                        "Sequence Reductions"

                        (learn
                          (text
                            (p "Write a function called " (hi "my-reduce") " which behaves like reduce, but returns each intermediate value of the reduction. Your function must accept either two or three arguments, and the return sequence must be lazy.")))

                        (instruction 'ins-sequence-reductions
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :restricted-fns '[reductions])

                                     (sub-instruction 'sub-ins-sequence-reductions
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (= (take 5 (my-reduce + (range))) [0 1 3 6 10]))
                                                        (code (= (my-reduce conj [1] [2 3 4]) [[1] [1 2] [1 2 3] [1 2 3 4]]))
                                                        (code (= (my-last ["b" "c" "d"]) "d")))
                                                      (testing
                                                        (is (= (take 5 (my-reduce + (range))) [0 1 3 6 10]) :default :advanced)
                                                        (is (= (my-reduce conj [1] [2 3 4]) [[1] [1 2] [1 2 3] [1 2 3 4]]) :default :advanced)
                                                        (is (= (last (my-reduce * 2 [3 4 5])) (reduce * 2 [3 4 5]) 120) :default :advanced))))
                        'sequence-reductions)


               (subject 'subj-merge-with-a-function
                        "Merge with a Function"

                        (learn
                          (text
                            (p "Write a function called " (hi "my-merge") " which takes a function f and a variable number of maps. Your function should return a map that consists of the rest of the maps conj-ed onto the first. If a key occurs in more than one map, the mapping(s) from the latter (left-to-right) should be combined with the mapping in the result by calling (f val-in-result val-in-latter).")))

                        (instruction 'ins-merge-with-a-function
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :restricted-fns '[merge-with])

                                     (sub-instruction 'sub-ins-merge-with-a-function
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code "(= (my-merge * {:a 2, :b 3, :c 4} {:a 2} {:b 2} {:c 5})\n   {:a 4, :b 6, :c 20})")
                                                        (code "(= (my-merge - {1 10, 2 20} {1 3, 2 10, 3 15})\n   {1 7, 2 10, 3 15})")
                                                        (code "(= (my-merge concat {:a [3], :b [6]} {:a [4 5], :c [8 9]} {:b [7]})\n   {:a [3 4 5], :b [6 7], :c [8 9]})"))
                                                      (testing
                                                        (is (= (my-merge * {:a 2, :b 3, :c 4} {:a 2} {:b 2} {:c 5})
                                                               {:a 4, :b 6, :c 20}) :default :advanced)
                                                        (is (= (my-merge - {1 10, 2 20} {1 3, 2 10, 3 15})
                                                               {1 7, 2 10, 3 15}) :default :advanced)
                                                        (is (= (my-merge concat {:a [3], :b [6]} {:a [4 5], :c [8 9]} {:b [7]})
                                                               {:a [3 4 5], :b [6 7], :c [8 9]}) :default :advanced))))
                        'merge-with-a-function)


               (subject 'subj-eulers-totient-function
                        "Euler's Totient Function"

                        (learn
                          (text
                            (p "Two numbers are coprime if their greatest common divisor equals 1. Euler's totient function f(x) is defined as the number of positive integers less than x which are coprime to x. The special case f(1) equals 1. Write a function called " (hi "totient") " which calculates Euler's totient function.")))

                        (instruction 'ins-eulers-totient-function
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-eulers-totient-function
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (= (totient 1) 1))
                                                        (code "(= (totient 10) (count '(1 3 7 9)) 4)")
                                                        (code (= (totient 40) 16))
                                                        (code (= (totient 99) 60)))
                                                      (testing
                                                        (is (= (totient 1) 1) :default :advanced)
                                                        (is (= (totient 10) (count '(1 3 7 9)) 4) :default :advanced)
                                                        (is (= (totient 40) 16) :default :advanced)
                                                        (is (= (totient 99) 60) :default :advanced))))
                        'eulers-totient-function)


               (subject 'subj-happy-numbers
                        "Happy numbers"

                        (learn
                          (text
                            (p "Happy numbers are positive integers that follow a particular formula: take each individual digit, square it, and then sum the squares to get a new number. Repeat with the new number and eventually, you might get to a number whose squared sum is 1. This is a happy number. An unhappy number (or sad number) is one that loops endlessly. Write a function called " (hi "happy-num?") " that determines if a number is happy or not.")))

                        (instruction 'ins-happy-numbers
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-happy-numbers
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (= (happy-num? 7) true))
                                                        (code (= (happy-num? 986543210) true))
                                                        (code (= (happy-num? 2) false))
                                                        (code (= (happy-num? 3) false)))
                                                      (testing
                                                        (is (= (happy-num? 7) true) :default :advanced)
                                                        (is (= (happy-num? 986543210) true) :default :advanced)
                                                        (is (= (happy-num? 2) false) :default :advanced)
                                                        (is (= (happy-num? 3) false) :default :advanced))))
                        'happy-numbers)


               (subject 'subj-reimplement-trampoline
                        "Reimplement Trampoline"

                        (learn
                          (text
                            (p "The trampoline function takes a function f and a variable number of parameters. Trampoline calls f with any parameters that were supplied. If f returns a function, trampoline calls that function with no arguments. This is repeated, until the return value is not a function, and then trampoline returns that non-function value. This is useful for implementing mutually recursive algorithms in a way that won't consume the stack.")
                            (p "Reimplement the function trampoline your new function will be called " (hi "my-trampoline") ".")))

                        (instruction 'ins-reimplement-trampoline
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :restricted-fns '[trampoline])

                                     (sub-instruction 'sub-ins-reimplement-trampoline
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code "(= (letfn [(triple [x] #(sub-two (* 3 x)))\n          (sub-two [x] #(stop?(- x 2)))\n          (stop? [x] (if (> x 50) x #(triple x)))]\n    (my-trampoline triple 2))\n  82)")
                                                        (code "(= (letfn [(my-even? [x] (if (zero? x) true #(my-odd? (dec x))))\n          (my-odd? [x] (if (zero? x) false #(my-even? (dec x))))]\n    (map (partial my-trampoline my-even?) (range 6)))\n  [true false true false true false])"))
                                                      (testing
                                                        (is (= (letfn [(triple [x] #(sub-two (* 3 x)))
                                                                       (sub-two [x] #(stop? (- x 2)))
                                                                       (stop? [x] (if (> x 50) x #(triple x)))]
                                                                 (my-trampoline triple 2))
                                                               82) :default :advanced)
                                                        (is (= (letfn [(my-even? [x] (if (zero? x) true #(my-odd? (dec x))))
                                                                       (my-odd? [x] (if (zero? x) false #(my-even? (dec x))))]
                                                                 (map (partial my-trampoline my-even?) (range 6)))
                                                               [true false true false true false]) :default :advanced))))
                        'reimplement-trampoline)


               (subject 'subj-the-balance-of-n
                        "The Balance of N"

                        (learn
                          (text
                            (p "A balanced number is one whose component digits have the same sum on the left and right halves of the number. Write a function called " (hi "balanced?") " which accepts an integer n, and returns true iff n is balanced.")))

                        (instruction 'ins-the-balance-of-n
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-the-balance-of-n
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (= true (balanced? 11)))
                                                        (code (= true (balanced? 121)))
                                                        (code (= false (balanced? 123)))
                                                        (code (= true (balanced? 0)))
                                                        (code (= false (balanced? 88099)))
                                                        (code (= true (balanced? 89098)))
                                                        (code (= true (balanced? 89089)))
                                                        (code "(= (take 20 (filter balanced? (range)))\n   [0 1 2 3 4 5 6 7 8 9 11 22 33 44 55 66 77 88 99 101]) "))
                                                      (testing
                                                        (is (= true (balanced? 11)) :default :advanced)
                                                        (is (= true (balanced? 121)) :default :advanced)
                                                        (is (= false (balanced? 123)) :default :advanced)
                                                        (is (= true (balanced? 0)) :default :advanced)
                                                        (is (= false (balanced? 88099)) :default :advanced)
                                                        (is (= true (balanced? 89098)) :default :advanced)
                                                        (is (= true (balanced? 89089)) :default :advanced)
                                                        (is (= (take 20 (filter balanced? (range)))
                                                               [0 1 2 3 4 5 6 7 8 9 11 22 33 44 55 66 77 88 99 101]) :default :advanced))))
                        'the-balance-of-n)

               ))


(defcoursetest my-test-1
               [ch-problems sub-ch-medium subj-sequence-reductions ins-sequence-reductions sub-ins-sequence-reductions]
               (defn my-reduce
                 ([op input] (my-reduce op (first input) (rest input)))
                 ([op result input]
                  (lazy-seq
                    (if (empty? input) (list result)
                                       (cons result
                                             (my-reduce op
                                                        (op result (first input))
                                                        (rest input))))))))

(defcoursetest my-test-2
               [ch-problems sub-ch-medium subj-merge-with-a-function ins-merge-with-a-function sub-ins-merge-with-a-function]
               (defn my-merge [f & args]
                 (reduce (fn [map1 map2]
                           (reduce (fn [m [k v]]
                                     (if-let [vv (m k)]
                                       (assoc m k (f vv v))
                                       (assoc m k v)))
                                   map1 map2))
                         args)))

(defcoursetest my-test-3
               [ch-problems sub-ch-medium subj-eulers-totient-function ins-eulers-totient-function sub-ins-eulers-totient-function]
               (defn totient [n]
                 (if (= n 1)
                   1
                   (letfn [(gcd [a b]
                             (let [big (max a b) small (min a b) next-small (mod big small)]
                               (if (zero? next-small)
                                 small
                                 (gcd small next-small))))]
                     (count (filter #((fn [a b] (= 1 (gcd a b))) n %) (range 1 n)))))))

(defcoursetest my-test-4
               [ch-problems sub-ch-medium subj-happy-numbers ins-happy-numbers sub-ins-happy-numbers]
               (defn happy-num? [num]
                 (letfn [(square-sum-of-digits [num]
                           (reduce + (map #(* % %) (map #(Integer/parseInt (str %)) (.toString num)))))
                         (step [num mid-results]
                           (let [mid-result (square-sum-of-digits num)]
                             (if (= 1 mid-result)
                               true
                               (if (some #{mid-result} mid-results)
                                 false
                                 (step mid-result (cons mid-result mid-results))))))]
                   (step num [num]))))

(defcoursetest my-test-5
               [ch-problems sub-ch-medium subj-reimplement-trampoline ins-reimplement-trampoline sub-ins-reimplement-trampoline]
               (defn my-trampoline
                 [f & args]
                 (loop [res (apply f args)]
                   (if (fn? res)
                     (recur (res))
                     res))))

(defcoursetest my-test-6
               [ch-problems sub-ch-medium subj-the-balance-of-n ins-the-balance-of-n sub-ins-the-balance-of-n]
               (defn balanced?
                 [x]
                 (let [s (str x)
                       f (fn [s] (sort (take (/ (count s) 2) s)))]
                   (= (f s) (f (reverse s))))))

(defcoursetest my-test-7
               [ch-problems sub-ch-medium subj-flipping-out ins-flipping-out sub-ins-flipping-out]
               (defn flip
                 [x]
                 (fn [a b] (x b a))))

(defcoursetest my-test-8
               [ch-problems sub-ch-medium subj-rotate-sequence ins-rotate-sequence sub-ins-rotate-sequence]
               (defn rotate [n v]
                 (->> (concat v v)
                      (drop (mod n (count v)))
                      (take (count v)))))

(defcoursetest my-test-9
               [ch-problems sub-ch-medium subj-reverse-interleave ins-reverse-interleave sub-ins-reverse-interleave]
               (defn reverse-interleave [v n]
                 (apply map vector (partition n v))))

(defcoursetest my-test-10
               [ch-problems sub-ch-medium subj-split-by-type ins-split-by-type sub-ins-split-by-type]
               (defn split-by-type [v]
                 (for [[key value] (group-by class v)]
                   value)))

(defcoursetest my-test-11
               [ch-problems sub-ch-medium subj-count-occurrences ins-count-occurrences sub-ins-count-occurrences]
               (defn my-frequencies
                 [x]
                 (into {} (map (fn [[k v]] [k (count v)]) (group-by identity x)))))

(defcoursetest my-test-12
               [ch-problems sub-ch-medium subj-find-distinct-items ins-find-distinct-items sub-ins-find-distinct-items]
               (defn my-distinct
                 [a]
                 (reduce
                   (fn [acc x]
                     (if-let [found (some (fn [y] (= y x)) acc)]
                       acc
                       (conj acc x)))
                   [] a)))

(defcoursetest my-test-13
               [ch-problems sub-ch-medium subj-function-composition ins-function-composition sub-ins-function-composition]
               (defn my-comp [& funcs]
                 (fn [& args]
                   (first
                     (reduce #(vector (apply %2 %1)) args (reverse funcs))))))

(defcoursetest my-test-14
               [ch-problems sub-ch-medium subj-partition-a-sequence ins-partition-a-sequence sub-ins-partition-a-sequence]
               (defn my-partition [n v]
                 (if (>= (count v) n)
                   (cons (take n v) (my-partition n (drop n v))))))

(defcoursetest my-test-15
               [ch-problems sub-ch-medium subj-juxtaposition ins-juxtaposition sub-ins-juxtaposition]
               (defn my-juxt [& funcs]
                 (fn [& args]
                   (map #(apply % args) funcs))))