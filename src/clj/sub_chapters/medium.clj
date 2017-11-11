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


               (subject 'subj-word-sorting
                        "Word Sorting"

                        (learn
                          (text
                            (p "Write a function called " (hi "sort-words") " which splits a sentence up into a sorted list of words. Capitalization should not affect sort order and punctuation should be ignored.")))

                        (instruction 'ins-word-sorting
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-word-sorting
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code "(= (sort-words  \"Have a nice day.\")\n   [\"a\" \"day\" \"Have\" \"nice\"])")
                                                        (code "(= (sort-words  \"Clojure is a fun language!\")\n   [\"a\" \"Clojure\" \"fun\" \"is\" \"language\"])")
                                                        (code "(= (sort-words  \"Fools fall for foolish follies.\")\n   [\"fall\" \"follies\" \"foolish\" \"Fools\" \"for\"])"))
                                                      (testing
                                                        (is (= (sort-words "Have a nice day.")
                                                               ["a" "day" "Have" "nice"]) :default :advanced)
                                                        (is (= (sort-words "Clojure is a fun language!")
                                                               ["a" "Clojure" "fun" "is" "language"]) :default :advanced)
                                                        (is (= (sort-words "Fools fall for foolish follies.")
                                                               ["fall" "follies" "foolish" "Fools" "for"]) :default :advanced))))
                        'word-sorting)


               (subject 'subj-prime-numbers
                        "Prime Numbers"

                        (learn
                          (text
                            (p "Write a function called " (hi "prime-nums") " which returns the first x number of prime numbers.")))

                        (instruction 'ins-prime-numbers
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-prime-numbers
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (= (prime-nums 2) [2 3]))
                                                        (code (= (prime-nums 5) [2 3 5 7 11]))
                                                        (code (= (last (prime-nums 100)) 541)))
                                                      (testing
                                                        (is (= (prime-nums 2) [2 3]) :default :advanced)
                                                        (is (= (prime-nums 5) [2 3 5 7 11]) :default :advanced)
                                                        (is (= (last (prime-nums 100)) 541) :default :advanced))))
                        'prime-numbers)


               (subject 'subj-black-box-testing
                        "Black Box Testing"

                        (learn
                          (text
                            (p "Clojure has many sequence types, which act in subtly different ways. The core functions typically convert them into a uniform \"sequence\" type and work with them that way, but it can be important to understand the behavioral and performance differences so that you know which kind is appropriate for your application.")

                            (p "Write a function called " (hi "black-box") " which takes a collection and returns one of :map, :set, :list, or :vector - describing the type of collection it was given.")
                            (p "You won't be allowed to inspect their class or use the built-in predicates like list? - the point is to poke at them and understand their behavior.")))

                        (instruction 'ins-black-box-testing
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :restricted-fns '[class type Class vector? sequential? list? seq? map? set? instance? getClass])

                                     (sub-instruction 'sub-ins-black-box-testing
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (= :map (black-box {:a 1, :b 2})))
                                                        (code (= :list (black-box (range (rand-int 20)))))
                                                        (code (= :vector (black-box [1 2 3 4 5 6])))
                                                        (code (= :set (black-box #{10 (rand-int 5)})))
                                                        (code (= [:map :set :vector :list] (map black-box [{} #{} [] ()]))))
                                                      (testing
                                                        (is (= :map (black-box {:a 1, :b 2})) :default :advanced)
                                                        (is (= :list (black-box (range (rand-int 20)))) :default :advanced)
                                                        (is (= :vector (black-box [1 2 3 4 5 6])) :default :advanced)
                                                        (is (= :set (black-box #{10 (rand-int 5)})) :default :advanced)
                                                        (is (= [:map :set :vector :list] (map black-box [{} #{} [] ()])) :default :advanced))))
                        'black-box-testing)


               (subject 'subj-filter-perfect-squares
                        "Filter Perfect Squares"

                        (learn
                          (text
                            (p "Given a string of comma separated integers, write a function called " (hi "comma-sep") " which returns a new comma separated string that only contains the numbers which are perfect squares.")))

                        (instruction 'ins-filter-perfect-squares
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-filter-perfect-squares
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (= (comma-sep "4,5,6,7,8,9") "4,9"))
                                                        (code (= (comma-sep "15,16,25,36,37") "16,25,36")))
                                                      (testing
                                                        (is (= (comma-sep "4,5,6,7,8,9") "4,9") :default :advanced)
                                                        (is (= (comma-sep "15,16,25,36,37") "16,25,36") :default :advanced))))
                        'filter-perfect-squares)


               (subject 'subj-anagram-finder
                        "Anagram Finder"

                        (learn
                          (text
                            (p "Write a function called " (hi "find-anagrams") " which finds all the anagrams in a vector of words. A word x is an anagram of word y if all the letters in x can be rearranged in a different order to form y. Your function should return a set of sets, where each sub-set is a group of words which are anagrams of each other. Each sub-set should have at least two words. Words without any anagrams should not be included in the result.")))

                        (instruction 'ins-anagram-finder
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-anagram-finder
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code "(= (find-anagrams [\"meat\" \"mat\" \"team\" \"mate\" \"eat\"])\n   #{#{\"meat\" \"team\" \"mate\"}})")
                                                        (code "(= (find-anagrams [\"veer\" \"lake\" \"item\" \"kale\" \"mite\" \"ever\"])\n   #{#{\"veer\" \"ever\"} #{\"lake\" \"kale\"} #{\"mite\" \"item\"}})"))
                                                      (testing
                                                        (is (= (find-anagrams ["meat" "mat" "team" "mate" "eat"]) #{#{"meat" "team" "mate"}}) :default :advanced)
                                                        (is (= (find-anagrams ["veer" "lake" "item" "kale" "mite" "ever"]) #{#{"veer" "ever"} #{"lake" "kale"} #{"mite" "item"}}) :default :advanced))))
                        'anagram-finder)


               (subject 'subj-perfect-numbers
                        "Perfect Numbers"

                        (learn
                          (text
                            (p "A number is \"perfect\" if the sum of its divisors equal the number itself. 6 is a perfect number because 1+2+3=6. Write a function called " (hi "perfect-num?") " which returns true for perfect numbers and false otherwise.")))

                        (instruction 'ins-perfect-numbers
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-perfect-numbers
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (= (perfect-num? 6) true))
                                                        (code (= (perfect-num? 7) false))
                                                        (code (= (perfect-num? 496) true))
                                                        (code (= (perfect-num? 500) false))
                                                        (code (= (perfect-num? 8128) true)))
                                                      (testing
                                                        (is (= (perfect-num? 6) true) :default :advanced)
                                                        (is (= (perfect-num? 7) false) :default :advanced)
                                                        (is (= (perfect-num? 496) true) :default :advanced)
                                                        (is (= (perfect-num? 500) false) :default :advanced)
                                                        (is (= (perfect-num? 8128) true) :default :advanced))))
                        'perfect-numbers)


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


               (subject 'subj-power-set
                        "Power Set"

                        (learn
                          (text
                            (p "Write a function called " (hi "power-set")
                               " which generates the " (link "power set" "http://en.wikipedia.org/wiki/Power_set")
                               " of a given set. The power set of a set x is the set of all subsets of x, including the empty set and x itself.\n")))

                        (instruction 'ins-power-set
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-power-set
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (= (power-set #{1 :a}) #{#{1 :a} #{:a} #{} #{1}}))
                                                        (code (= (power-set #{}) #{#{}}))
                                                        (code "(= (power-set #{1 2 3})\n   #{#{} #{1} #{2} #{3} #{1 2} #{1 3} #{2 3} #{1 2 3}})")
                                                        (code (= (count (power-set (into #{} (range 10)))) 1024)))
                                                      (testing
                                                        (is (= (power-set #{1 :a}) #{#{1 :a} #{:a} #{} #{1}}) :default :advanced)
                                                        (is (= (power-set #{}) #{#{}}) :default :advanced)
                                                        (is (= (power-set #{1 2 3}) #{#{} #{1} #{2} #{3} #{1 2} #{1 3} #{2 3} #{1 2 3}}) :default :advanced)
                                                        (is (= (count (power-set (into #{} (range 10)))) 1024) :default :advanced))))
                        'power-set)


               (subject 'subj-equivalence-classes
                        "Equivalence Classes"

                        (learn
                          (text
                            (p "A function f defined on a domain D induces an " (link "equivalence relation " "http://en.wikipedia.org/wiki/Equivalence_relation")
                               " on D, as follows: a is equivalent to b with respect to f if and only if (f a) is equal to (f b). Write a function called " (hi "eq") " with arguments f and D that computes the " (link "equivalence classes" "http://en.wikipedia.org/wiki/Equivalence_class")
                               " of D with respect to f.")))

                        (instruction 'ins-equivalence-classes
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-equivalence-classes
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code "(= (eq #(* % %) #{-2 -1 0 1 2})\n   #{#{0} #{1 -1} #{2 -2}})")
                                                        (code "(= (eq #(rem % 3) #{0 1 2 3 4 5 })\n   #{#{0 3} #{1 4} #{2 5}})")
                                                        (code "(= (eq identity #{0 1 2 3 4})\n   #{#{0} #{1} #{2} #{3} #{4}})")
                                                        (code "(= (eq (constantly true) #{0 1 2 3 4})\n   #{#{0 1 2 3 4}})"))
                                                      (testing
                                                        (is (= (eq #(* % %) #{-2 -1 0 1 2}) #{#{0} #{1 -1} #{2 -2}}) :default :advanced)
                                                        (is (= (eq #(rem % 3) #{0 1 2 3 4 5}) #{#{0 3} #{1 4} #{2 5}}) :default :advanced)
                                                        (is (= (eq identity #{0 1 2 3 4}) #{#{0} #{1} #{2} #{3} #{4}}) :default :advanced)
                                                        (is (= (eq (constantly true) #{0 1 2 3 4}) #{#{0 1 2 3 4}}) :default :advanced))))
                        'equivalence-classes)


               (subject 'subj-identify-keys-and-values
                        "Identify keys and values"

                        (learn
                          (text
                            (p "Given an input sequence of keywords and numbers, write a function called " (hi "keys-vals") " which creates a map such that each key in the map is a keyword, and the value is a sequence of all the numbers (if any) between it and the next keyword in the sequence.")))

                        (instruction 'ins-identify-keys-and-values
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-identify-keys-and-values
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (= {} (keys-vals [])))
                                                        (code (= {:a [1]} (keys-vals [:a 1])))
                                                        (code (= {:a [1], :b [2]} (keys-vals [:a 1, :b 2])))
                                                        (code (= {:a [1 2 3], :b [], :c [4]} (keys-vals [:a 1 2 3 :b :c 4]))))
                                                      (testing
                                                        (is (= {} (keys-vals [])) :default :advanced)
                                                        (is (= {:a [1]} (keys-vals [:a 1])) :default :advanced)
                                                        (is (= {:a [1], :b [2]} (keys-vals [:a 1, :b 2])) :default :advanced)
                                                        (is (= {:a [1 2 3], :b [], :c [4]} (keys-vals [:a 1 2 3 :b :c 4])) :default :advanced))))
                        'identify-keys-and-values)


               (subject 'subj-digits-and-bases
                        "Digits and bases"

                        (learn
                          (text
                            (p "Write a function called " (hi "digits") " which returns a sequence of digits of a non-negative number (first argument) in numerical system with an arbitrary base (second argument). Digits should be represented with their integer values, e.g. 15 would be [1 5] in base 10, [1 1 1 1] in base 2 and [15] in base 16.")))

                        (instruction 'ins-digits-and-bases
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-digits-and-bases
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (= [1 2 3 4 5 0 1] (digits 1234501 10)))
                                                        (code (= [0] (digits 0 11)))
                                                        (code (= [1 0 0 1] (digits 9 2)))
                                                        (code (= [1 0] (let [n (rand-int 100000)] (digits n n))))
                                                        (code (= [16 18 5 24 15 1] (digits Integer/MAX_VALUE 42))))
                                                      (testing
                                                        (is (= [1 2 3 4 5 0 1] (digits 1234501 10)) :default :advanced)
                                                        (is (= [0] (digits 0 11)) :default :advanced)
                                                        (is (= [1 0 0 1] (digits 9 2)) :default :advanced)
                                                        (is (= [1 0] (let [n (rand-int 100000)] (digits n n))) :default :advanced)
                                                        (is (= [16 18 5 24 15 1] (digits Integer/MAX_VALUE 42)) :default :advanced))))
                        'digits-and-bases)


               (subject 'subj-oscilrate
                        "Oscilrate"

                        (learn
                          (text
                            (p "Write a function called " (hi "oscilrate") " that takes an initial value and a variable number of functions. It should return a lazy sequence of the functions applied to the value in order, restarting from the first function after it hits the end.")))

                        (instruction 'ins-oscilrate
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-oscilrate
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (= (take 3 (oscilrate 3.14 int double)) [3.14 3 3.0]))
                                                        (code (= (take 5 (oscilrate 3 #(- % 3) #(+ 5 %))) [3 0 5 2 7]))
                                                        (code (= (take 12 (oscilrate 0 inc dec inc dec inc)) [0 1 0 1 0 1 2 1 2 1 2 3])))
                                                      (testing
                                                        (is (= (take 3 (oscilrate 3.14 int double)) [3.14 3 3.0]) :default :advanced)
                                                        (is (= (take 5 (oscilrate 3 #(- % 3) #(+ 5 %))) [3 0 5 2 7]) :default :advanced)
                                                        (is (= (take 12 (oscilrate 0 inc dec inc dec inc)) [0 1 0 1 0 1 2 1 2 1 2 3]) :default :advanced))))
                        'oscilrate)


               (subject 'subj-pronounce-seq
                        "Sequence of pronunciations"

                        (learn
                          (text
                            (p "Write a function called " (hi "pronounce-seq") " that returns a lazy sequence of \"pronunciations\" of a sequence of numbers. A pronunciation of each element in the sequence consists of the number of repeating identical numbers and the number itself. For example, [1 1] is pronounced as [2 1] (\"two ones\"), which in turn is pronounced as [1 2 1 1] (\"one two, one one\").")
                            (p "Your function should accept an initial sequence of numbers, and return an infinite lazy sequence of pronunciations, each element being a pronunciation of the previous element.")))

                        (instruction 'ins-pronounce-seq
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-pronounce-seq
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (= [[1 1] [2 1] [1 2 1 1]] (take 3 (pronounce-seq [1]))))
                                                        (code (= [3 1 2 4] (first (pronounce-seq [1 1 1 4 4]))))
                                                        (code (= [1 1 1 3 2 1 3 2 1 1] (nth (pronounce-seq [1]) 6)))
                                                        (code (= 338 (count (nth (pronounce-seq [3 2]) 15)))))
                                                      (testing
                                                        (is (= [[1 1] [2 1] [1 2 1 1]] (take 3 (pronounce-seq [1]))) :default :advanced)
                                                        (is (= [3 1 2 4] (first (pronounce-seq [1 1 1 4 4]))) :default :advanced)
                                                        (is (= [1 1 1 3 2 1 3 2 1 1] (nth (pronounce-seq [1]) 6)) :default :advanced)
                                                        (is (= 338 (count (nth (pronounce-seq [3 2]) 15))) :default :advanced))))
                        'pronounce-seq)


               (subject 'subj-decurry
                        "Decurry"

                        (learn
                          (text
                            (p "Write a function called " (hi "decurry") " that accepts a curried function of unknown arity n. Return an equivalent function of n arguments.")
                            (p "You may wish to read " (link "this" "http://en.wikipedia.org/wiki/Currying") ".")))

                        (instruction 'ins-decurry
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-decurry
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code "(= 10 ((decurry (fn [a]\n             (fn [b]\n               (fn [c]\n                 (fn [d]\n                   (+ a b c d))))))\n       1 2 3 4))")
                                                        (code "(= 24 ((decurry (fn [a]\n             (fn [b]\n               (fn [c]\n                 (fn [d]\n                   (* a b c d))))))\n       1 2 3 4))")
                                                        (code "(= 25 ((decurry (fn [a]\n             (fn [b]\n               (* a b))))\n       5 5))\n"))
                                                      (testing
                                                        (is (= 10 ((decurry (fn [a]
                                                                              (fn [b]
                                                                                (fn [c]
                                                                                  (fn [d]
                                                                                    (+ a b c d)))))) 1 2 3 4)) :default :advanced)
                                                        (is (= 24 ((decurry (fn [a]
                                                                              (fn [b]
                                                                                (fn [c]
                                                                                  (fn [d]
                                                                                    (* a b c d)))))) 1 2 3 4)) :default :advanced)
                                                        (is (= 25 ((decurry (fn [a]
                                                                              (fn [b]
                                                                                (* a b)))) 5 5)) :default :advanced))))
                        'decurry)


               (subject 'subj-lazy-searching
                        "Lazy Searching"

                        (learn
                          (text
                            (p "Given any number of sequences, each sorted from smallest to largest, write a function called " (hi "lazy-search") " that finds the smallest single number which appears in all of the sequences. The sequences may be infinite, so be careful to search lazily.")))

                        (instruction 'ins-lazy-searching
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-lazy-searching
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (= 3 (lazy-search [3 4 5])))
                                                        (code (= 4 (lazy-search [1 2 3 4 5 6 7] [0.5 3/2 4 19])))
                                                        (code (= 7 (lazy-search (range) (range 0 100 7/6) [2 3 5 7 11 13])))
                                                        (code "(= 64 (lazy-search (map #(* % % %) (range)) ;; perfect cubes\n          (filter #(zero? (bit-and % (dec %))) (range)) ;; powers of 2\n          (iterate inc 20))) ;; at least as large as 20"))
                                                      (testing
                                                        (is (= 3 (lazy-search [3 4 5])) :default :advanced)
                                                        (is (= 4 (lazy-search [1 2 3 4 5 6 7] [0.5 3/2 4 19])) :default :advanced)
                                                        (is (= 7 (lazy-search (range) (range 0 100 7/6) [2 3 5 7 11 13])) :default :advanced)
                                                        (is (= 64 (lazy-search (map #(* % % %) (range)) ;; perfect cubes
                                                                               (filter #(zero? (bit-and % (dec %))) (range))
                                                                               (iterate inc 20))) :default :advanced))))
                        'lazy-searching)


               (subject 'subj-partially-flatten-a-sequence
                        "Partially Flatten a Sequence"

                        (learn
                          (text
                            (p "Write a function called " (hi "partially-flatten") " which flattens any nested combination of sequential things (lists, vectors, etc.), but maintains the lowest level sequential items. The result should be a sequence of sequences with only one level of nesting.")))

                        (instruction 'ins-partially-flatten-a-sequence
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-partially-flatten-a-sequence
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code "(= (partially-flatten [[\"Do\"] [\"Nothing\"]])\n   [[\"Do\"] [\"Nothing\"]])")
                                                        (code "(= (partially-flatten [[[[:a :b]]] [[:c :d]] [:e :f]])\n   [[:a :b] [:c :d] [:e :f]])")
                                                        (code "(= (partially-flatten '((1 2)((3 4)((((5 6)))))))\n   '((1 2)(3 4)(5 6)))"))
                                                      (testing
                                                        (is (= (partially-flatten [["Do"] ["Nothing"]]) [["Do"] ["Nothing"]]) :default :advanced)
                                                        (is (= (partially-flatten [[[[:a :b]]] [[:c :d]] [:e :f]]) [[:a :b] [:c :d] [:e :f]]) :default :advanced)
                                                        (is (= (partially-flatten '((1 2) ((3 4) ((((5 6))))))) '((1 2) (3 4) (5 6))) :default :advanced))))
                        'partially-flatten-a-sequence)


               (subject 'subj-global-take-while
                        "Global take-while"

                        (learn
                          (text
                            (p (link "take-while" "http://clojuredocs.org/clojure_core/clojure.core/take-while") " is great for filtering sequences, but it limited: you can only examine a single item of the sequence at a time. What if you need to keep track of some state as you go over the sequence?")
                            (p "Write a function called " (hi "global-take-while") " which accepts an integer n, a predicate p, and a sequence. It should return a lazy sequence of items in the list up to, but not including, the nth item that satisfies the predicate.")))

                        (instruction 'ins-global-take-while
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-global-take-while
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code "(= [2 3 5 7 11 13]\n   (global-take-while 4 #(= 2 (mod % 3))\n         [2 3 5 7 11 13 17 19 23]))")
                                                        (code "(= [\"this\" \"is\" \"a\" \"sentence\"]\n   (global-take-while 3 #(some #{\\i} %)\n         [\"this\" \"is\" \"a\" \"sentence\" \"i\" \"wrote\"]))")
                                                        (code "(= [\"this\" \"is\"]\n   (global-take-while 1 #{\"a\"}\n         [\"this\" \"is\" \"a\" \"sentence\" \"i\" \"wrote\"]))"))
                                                      (testing
                                                        (is (= [2 3 5 7 11 13] (global-take-while 4 #(= 2 (mod % 3)) [2 3 5 7 11 13 17 19 23])) :default :advanced)
                                                        (is (= ["this" "is" "a" "sentence"] (global-take-while 3 #(some #{\i} %) ["this" "is" "a" "sentence" "i" "wrote"])) :default :advanced)
                                                        (is (= ["this" "is"] (global-take-while 1 #{"a"} ["this" "is" "a" "sentence" "i" "wrote"])) :default :advanced))))
                        'global-take-while)


               (subject 'subj-insert-between
                        "Insert between two items"

                        (learn
                          (text
                            (p "Write a function called " (hi "insert-between") " that takes a two-argument predicate, a value, and a collection; and returns a new collection where the value is inserted between every two items that satisfy the predicate.")))

                        (instruction 'ins-insert-between
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-insert-between
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code "(= '(1 :less 6 :less 7 4 3) (insert-between < :less [1 6 7 4 3]))")
                                                        (code "(= '(2) (insert-between > :more [2]))")
                                                        (code "(= [0 1 :x 2 :x 3 :x 4]  (insert-between #(and (pos? %) (< % %2)) :x (range 5)))")
                                                        (code "(empty? (insert-between > :more ()))")
                                                        (code "(= [0 1 :same 1 2 3 :same 5 8 13 :same 21]\n   (take 12 (->> [0 1]\n                 (iterate (fn [[a b]] [b (+ a b)]))\n                 (map first) ; fibonacci numbers\n                 (insert-between (fn [a b] ; both even or both odd\n                       (= (mod a 2) (mod b 2)))\n                     :same))))"))
                                                      (testing
                                                        (is (= '(1 :less 6 :less 7 4 3) (insert-between < :less [1 6 7 4 3])) :default :advanced)
                                                        (is (= '(2) (insert-between > :more [2])) :default :advanced)
                                                        (is (= [0 1 :x 2 :x 3 :x 4] (insert-between #(and (pos? %) (< % %2)) :x (range 5))) :default :advanced)
                                                        (is (empty? (insert-between > :more ())) :default :advanced)
                                                        (is (= [0 1 :same 1 2 3 :same 5 8 13 :same 21]
                                                               (take 12 (->> [0 1]
                                                                             (iterate (fn [[a b]] [b (+ a b)]))
                                                                             (map first)
                                                                             (insert-between (fn [a b]
                                                                                               (= (mod a 2) (mod b 2))) :same)))) :default :advanced))))
                        'insert-between)


               (subject 'subj-to-roman
                        "Write Roman Numerals"

                        (learn
                          (text
                            (p "Given an integer smaller than 4000, write a function called " (hi "to-roman")
                               " which returns the corresponding roman numeral in uppercase, adhering to the "
                               (link "subtractive principle" "http://www.numericana.com/answer/roman.htm#valid") ".")))

                        (instruction 'ins-to-roman
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-to-roman
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (= "I" (to-roman 1)))
                                                        (code (= "XXX" (to-roman 30)))
                                                        (code (= "IV" (to-roman 4)))
                                                        (code (= "CXL" (to-roman 140)))
                                                        (code (= "DCCCXXVII" (to-roman 827)))
                                                        (code (= "MMMCMXCIX" (to-roman 3999)))
                                                        (code (= "XLVIII" (to-roman 48))))
                                                      (testing
                                                        (is (= "I" (to-roman 1)) :default :advanced)
                                                        (is (= "XXX" (to-roman 30)) :default :advanced)
                                                        (is (= "IV" (to-roman 4)) :default :advanced)
                                                        (is (= "CXL" (to-roman 140)) :default :advanced)
                                                        (is (= "DCCCXXVII" (to-roman 827)) :default :advanced)
                                                        (is (= "MMMCMXCIX" (to-roman 3999)) :default :advanced)
                                                        (is (= "XLVIII" (to-roman 48)) :default :advanced))))
                        'to-roman)


               (subject 'subj-k-combinations
                        "Generating k-combinations"

                        (learn
                          (text
                            (p "Given a sequence S consisting of n elements, write a function called " (hi "k-combinations")
                               " which generates all " (link "k-combinations" "https://secure.wikimedia.org/wikipedia/en/wiki/Combination")
                               " of S, i. e. generate all possible sets consisting of k distinct elements taken from S. The number of k-combinations for a sequence is equal to the "
                               (link "binomial coefficient" "https://secure.wikimedia.org/wikipedia/en/wiki/Binomial_coefficient") ".")))

                        (instruction 'ins-k-combinations
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-k-combinations
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (= (k-combinations 1 #{4 5 6}) #{#{4} #{5} #{6}}))
                                                        (code (= (k-combinations 10 #{4 5 6}) #{}))
                                                        (code (= (k-combinations 2 #{0 1 2}) #{#{0 1} #{0 2} #{1 2}}))
                                                        (code "(= (k-combinations 3 #{0 1 2 3 4}) #{#{0 1 2} #{0 1 3} #{0 1 4} #{0 2 3} #{0 2 4}\n                         #{0 3 4} #{1 2 3} #{1 2 4} #{1 3 4} #{2 3 4}})")
                                                        (code (= (k-combinations 4 #{[1 2 3] :a "abc" "efg"}) #{#{[1 2 3] :a "abc" "efg"}}))
                                                        (code "(= (k-combinations 2 #{[1 2 3] :a \"abc\" \"efg\"}) #{#{[1 2 3] :a} #{[1 2 3] \"abc\"} #{[1 2 3] \"efg\"}\n                                    #{:a \"abc\"} #{:a \"efg\"} #{\"abc\" \"efg\"}})"))
                                                      (testing
                                                        (is (= (k-combinations 1 #{4 5 6}) #{#{4} #{5} #{6}}) :default :advanced)
                                                        (is (= (k-combinations 10 #{4 5 6}) #{}) :default :advanced)
                                                        (is (= (k-combinations 2 #{0 1 2}) #{#{0 1} #{0 2} #{1 2}}) :default :advanced)
                                                        (is (= (k-combinations 3 #{0 1 2 3 4}) #{#{0 1 2} #{0 1 3} #{0 1 4} #{0 2 3} #{0 2 4} #{0 3 4} #{1 2 3} #{1 2 4} #{1 3 4} #{2 3 4}}) :default :advanced)
                                                        (is (= (k-combinations 4 #{[1 2 3] :a "abc" "efg"}) #{#{[1 2 3] :a "abc" "efg"}}) :default :advanced)
                                                        (is (= (k-combinations 2 #{[1 2 3] :a "abc" "efg"}) #{#{[1 2 3] :a} #{[1 2 3] "abc"} #{[1 2 3] "efg"} #{:a "abc"} #{:a "efg"} #{"abc" "efg"}}) :default :advanced))))
                        'k-combinations)


               (subject 'subj-prime-sandwich
                        "Prime Sandwich"

                        (learn
                          (text
                            (p "A " (link "balanced prime" "http://en.wikipedia.org/wiki/Balanced_prime")
                               " is a prime number which is also the mean of the primes directly before and after it in the sequence of valid primes. Create a function called "
                               (hi "balanced?") " which takes an integer n, and returns true iff it is a balanced prime.")))

                        (instruction 'ins-prime-sandwich
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-prime-sandwich
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (= false (balanced? 4)))
                                                        (code (= true (balanced? 563)))
                                                        (code (= 1103 (nth (filter balanced? (range)) 15))))
                                                      (testing
                                                        (is (= false (balanced? 4)) :default :advanced)
                                                        (is (= true (balanced? 563)) :default :advanced)
                                                        (is (= 1103 (nth (filter balanced? (range)) 15)) :default :advanced))))
                        'prime-sandwich)


               (subject 'subj-uct
                        "Universal Computation Engine"

                        (learn
                          (text
                            (p "Given a mathematical formula in prefix notation, write a function called " (hi "uct") " which returns a function that calculates the value of the formula. The formula can contain nested calculations using the four basic mathematical operators, numeric constants, and symbols representing variables. The returned function has to accept a single parameter containing the map of variable names to their values.")))

                        (instruction 'ins-uct
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-uct
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code "(= 2 ((uct '(/ a b))\n      '{b 8 a 16}))")
                                                        (code "(= 8 ((uct '(+ a b 2))\n      '{a 2 b 4}))")
                                                        (code "(= [6 0 -4]\n     (map (uct '(* (+ 2 a)\n  \t              (- 10 b)))\n\t        '[{a 1 b 8}\n\t          {b 5 a -2}\n\t          {a 2 b 11}]))")
                                                        (code "(= 1 ((utc '(/ (+ x 2)\n              (* 3 (+ y 1))))\n      '{x 4 y 1}))\n"))
                                                      (testing
                                                        (is (= 2 ((uct '(/ a b)) '{b 8 a 16})) :default :advanced)
                                                        (is (= 8 ((uct '(+ a b 2)) '{a 2 b 4})) :default :advanced)
                                                        (is (= [6 0 -4]
                                                               (map (uct '(* (+ 2 a)
                                                                             (- 10 b))) '[{a 1 b 8}
                                                                                          {b 5 a -2}
                                                                                          {a 2 b 11}])) :default :advanced)
                                                        (is (= 1 ((uct '(/ (+ x 2) (* 3 (+ y 1)))) '{x 4 y 1})) :default :advanced))))
                        'uct)


               (subject 'subj-intervals
                        "Intervals"

                        (learn
                          (text
                            (p "Write a function called " (hi "intervals") " that takes a sequence of integers and returns a sequence of \"intervals\". Each interval is a a vector of two integers, start and end, such that all integers between start and end (inclusive) are contained in the input sequence.")))

                        (instruction 'ins-intervals
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-intervals
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (= (intervals [1 2 3]) [[1 3]]))
                                                        (code (= (intervals [10 9 8 1 2 3]) [[1 3] [8 10]]))
                                                        (code (= (intervals [1 1 1 1 1 1 1]) [[1 1]]))
                                                        (code (= (intervals []) []))
                                                        (code "(= (intervals [19 4 17 1 3 10 2 13 13 2 16 4 2 15 13 9 6 14 2 11])\n       [[1 4] [6 6] [9 11] [13 17] [19 19]])"))
                                                      (testing
                                                        (is (= (intervals [1 2 3]) [[1 3]]) :default :advanced)
                                                        (is (= (intervals [10 9 8 1 2 3]) [[1 3] [8 10]]) :default :advanced)
                                                        (is (= (intervals [1 1 1 1 1 1 1]) [[1 1]]) :default :advanced)
                                                        (is (= (intervals []) []) :default :advanced)
                                                        (is (= (intervals [19 4 17 1 3 10 2 13 13 2 16 4 2 15 13 9 6 14 2 11])
                                                               [[1 4] [6 6] [9 11] [13 17] [19 19]]) :default :advanced))))
                        'intervals)


               (subject 'subj-big-divide
                        "The Big Divide"

                        (learn
                          (text
                            (p "Write a function called " (hi "big-divide")
                               " which calculates the sum of all natural numbers under n (first argument) which are evenly divisible by at least one of a and b (second and third argument). Numbers a and b are guaranteed to be " (link "coprimes" "http://en.wikipedia.org/wiki/Coprime") ".")
                            (p "Note: Some test cases have a very large n, so the most obvious solution will exceed the time limit.")))

                        (instruction 'ins-big-divide
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-big-divide
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (= 0 (big-divide 3 17 11)))
                                                        (code (= 23 (big-divide 10 3 5)))
                                                        (code (= 233168 (big-divide 1000 3 5)))
                                                        (code (= "2333333316666668" (str (big-divide 100000000 3 5))))
                                                        (code "(= \"110389610389889610389610\"\n  (str (big-divide (* 10000 10000 10000) 7 11)))")
                                                        (code "(= \"1277732511922987429116\"\n  (str (big-divide (* 10000 10000 10000) 757 809)))")
                                                        (code "(= \"4530161696788274281\"\n  (str (big-divide (* 10000 10000 1000) 1597 3571)))"))
                                                      (testing
                                                        (is (= 0 (big-divide 3 17 11)) :default :advanced)
                                                        (is (= 23 (big-divide 10 3 5)) :default :advanced)
                                                        (is (= 233168 (big-divide 1000 3 5)) :default :advanced)
                                                        (is (= "2333333316666668" (str (big-divide 100000000 3 5))) :default :advanced)
                                                        (is (= "110389610389889610389610" (str (big-divide (* 10000 10000 10000) 7 11))) :default :advanced)
                                                        (is (= "1277732511922987429116" (str (big-divide (* 10000 10000 10000) 757 809))) :default :advanced)
                                                        (is (= "4530161696788274281" (str (big-divide (* 10000 10000 1000) 1597 3571))) :default :advanced))))
                        'big-divide)


               (subject 'subj-balancing-brackets
                        "Balancing Brackets"

                        (learn
                          (text
                            (p "When parsing a snippet of code it's often a good idea to do a sanity check to see if all the brackets match up. Write a function called "
                               (hi "balanced?") " that takes in a string and returns truthy if all square [ ] round ( ) and curly { } brackets are properly paired and legally nested, or returns falsey otherwise.")))

                        (instruction 'ins-balancing-brackets
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-balancing-brackets
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (balanced? "This string has no brackets."))
                                                        (code "(balanced? \"class Test {\n      public static void main(String[] args) {\n        System.out.println(\\\"Hello world.\\\");\n      }\n    }\")")
                                                        (code (not (balanced? "(start, end]")))
                                                        (code (not (balanced? "())")))
                                                        (code (not (balanced? "[ { ] } ")))
                                                        (code (balanced? "([]([(()){()}(()(()))(([[]]({}()))())]((((()()))))))"))
                                                        (code (not (balanced? "([]([(()){()}(()(()))(([[]]({}([)))())]((((()()))))))")))
                                                        (code (not (balanced? "["))))
                                                      (testing
                                                        (is (balanced? "This string has no brackets.") :default :advanced)
                                                        (is (balanced? "class Test {
      public static void main(String[] args) {
        System.out.println(\"Hello world.\");
      }
    }") :default :advanced)
                                                        (is (not (balanced? "(start, end]")) :default :advanced)
                                                        (is (not (balanced? "())")) :default :advanced)
                                                        (is (not (balanced? "[ { ] } ")) :default :advanced)
                                                        (is (balanced? "([]([(()){()}(()(()))(([[]]({}()))())]((((()()))))))") :default :advanced)
                                                        (is (not (balanced? "([]([(()){()}(()(()))(([[]]({}([)))())]((((()()))))))")) :default :advanced)
                                                        (is (not (balanced? "[")) :default :advanced))))
                        'balancing-brackets)


               (subject 'subj-set-subset
                        "Sum Some Set Subsets"

                        (learn
                          (text
                            (p "Given a variable number of sets of integers, write a function called " (hi "have-subset?")
                               " create a function which returns true iff all of the sets have a non-empty subset with an equivalent summation.")))

                        (instruction 'ins-set-subset
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-set-subset
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code "(= true  (have-subset? #{-1 1 99} \n             #{-2 2 888}\n             #{-3 3 7777}))")
                                                        (code "(= false (have-subset? #{1}\n             #{2}\n             #{3}\n             #{4}))")
                                                        (code "(= true  (have-subset? #{1}))")
                                                        (code "(= false (have-subset? #{1 -3 51 9} \n             #{0} \n             #{9 2 81 33}))")
                                                        (code "(= true  (have-subset? #{1 3 5}\n             #{9 11 4}\n             #{-3 12 3}\n             #{-3 4 -2 10}))")
                                                        (code "(= false (have-subset? #{-1 -2 -3 -4 -5 -6}\n             #{1 2 3 4 5 6 7 8 9}))")
                                                        (code "(= true  (have-subset? #{1 3 5 7}\n             #{2 4 6 8}))")
                                                        (code "(= true  (have-subset? #{-1 3 -5 7 -9 11 -13 15}\n             #{1 -3 5 -7 9 -11 13 -15}\n             #{1 -1 2 -2 4 -4 8 -8}))")
                                                        (code "(= true  (have-subset? #{-10 9 -8 7 -6 5 -4 3 -2 1}\n             #{10 -9 8 -7 6 -5 4 -3 2 -1}))"))
                                                      (testing
                                                        (is (= true  (have-subset? #{-1 1 99}
                                                                         #{-2 2 888}
                                                                         #{-3 3 7777})) :default :advanced)
                                                        (is (= false (have-subset? #{1}
                                                                         #{2}
                                                                         #{3}
                                                                         #{4})) :default :advanced)
                                                        (is (= true  (have-subset? #{1})) :default :advanced)
                                                        (is (= false (have-subset? #{1 -3 51 9}
                                                                         #{0}
                                                                         #{9 2 81 33})) :default :advanced)
                                                        (is (= true  (have-subset? #{1 3 5}
                                                                         #{9 11 4}
                                                                         #{-3 12 3}
                                                                         #{-3 4 -2 10})) :default :advanced)
                                                        (is (= false (have-subset? #{-1 -2 -3 -4 -5 -6}
                                                                         #{1 2 3 4 5 6 7 8 9})) :default :advanced)
                                                        (is (= true  (have-subset? #{1 3 5 7}
                                                                         #{2 4 6 8})) :default :advanced)
                                                        (is (= true  (have-subset? #{-1 3 -5 7 -9 11 -13 15}
                                                                         #{1 -3 5 -7 9 -11 13 -15}
                                                                         #{1 -1 2 -2 4 -4 8 -8})) :default :advanced)
                                                        (is (= true  (have-subset? #{-10 9 -8 7 -6 5 -4 3 -2 1}
                                                                         #{10 -9 8 -7 6 -5 4 -3 2 -1})) :default :advanced))))
                        'set-subset)
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

(defcoursetest my-test-16
               [ch-problems sub-ch-medium subj-word-sorting ins-word-sorting sub-ins-word-sorting]
               (defn sort-words
                 [x]
                 (sort-by (fn [v] (.toLowerCase v)) (re-seq #"\w+" x))))

(defcoursetest my-test-17
               [ch-problems sub-ch-medium subj-prime-numbers ins-prime-numbers sub-ins-prime-numbers]
               (defn prime-nums [n]
                 (take n
                       (filter (fn [x]
                                 (->> x
                                      (range 2)
                                      (map #(rem x %))
                                      (some zero?)
                                      not))
                               (drop 2 (range))))))

(defcoursetest my-test-18
               [ch-problems sub-ch-medium subj-black-box-testing ins-black-box-testing sub-ins-black-box-testing]
               (defn black-box
                 [x]
                 ({{} :map #{} :set} (empty x) (if (reversible? x) :vector :list))))

(defcoursetest my-test-19
               [ch-problems sub-ch-medium subj-filter-perfect-squares ins-filter-perfect-squares sub-ins-filter-perfect-squares]
               (defn comma-sep [s]
                 (let [nums        (map #(Integer/valueOf %) (clojure.string/split s #","))
                       all-perf-sq (set (map #(* % %) (range 100)))
                       sq-nums     (filter all-perf-sq nums)]
                   (apply str (interpose "," sq-nums)))))

(defcoursetest my-test-20
               [ch-problems sub-ch-medium subj-anagram-finder ins-anagram-finder sub-ins-anagram-finder]
               (defn find-anagrams [v]
                 (into #{}
                       (map set
                            (filter #(> (count %) 1)
                                    (map val (group-by sort v)))))))

(defcoursetest my-test-21
               [ch-problems sub-ch-medium subj-perfect-numbers ins-perfect-numbers sub-ins-perfect-numbers]
               (defn perfect-num? [n]
                 (= n (apply + (filter #(zero? (mod n %)) (range 1 n))))))

(defcoursetest my-test-22
               [ch-problems sub-ch-medium subj-power-set ins-power-set sub-ins-power-set]
               (defn power-set
                 [s]
                 (set (reduce #(concat %1 (map (fn [i] (set (conj i %2))) %1)) #{#{}} s))))

(defcoursetest my-test-23
               [ch-problems sub-ch-medium subj-equivalence-classes ins-equivalence-classes sub-ins-equivalence-classes]
               (defn eq [f s]
                 (set (map #(set (val %)) (group-by f s)))))

(defcoursetest my-test-24
               [ch-problems sub-ch-medium subj-identify-keys-and-values ins-identify-keys-and-values sub-ins-identify-keys-and-values]
               (defn keys-vals [xs]
                 (let [partitioned    (partition-by #(and (keyword? %) (identity %)) xs)
                       pairs          (map vector partitioned (rest partitioned))
                       relevant-pairs (filter #(->> % first first keyword?) pairs)]
                   (into {}
                         (for [[k v] relevant-pairs]
                           (if (keyword? (first v))
                             [(first k) []]
                             [(first k) (into [] v)]))))))

(defcoursetest my-test-25
               [ch-problems sub-ch-medium subj-digits-and-bases ins-digits-and-bases sub-ins-digits-and-bases]
               (defn digits [n base]
                 (if (>= n base)
                   (concat (digits (int (/ n base)) base) [(mod n base)])
                   [n])))

(defcoursetest my-test-26
               [ch-problems sub-ch-medium subj-oscilrate ins-oscilrate sub-ins-oscilrate]
               (defn oscilrate [x f & funcs]
                 (lazy-seq
                   (let [y          (f x)
                         next-funcs (concat funcs [f])]
                     (cons x (apply oscilrate y next-funcs))))))

(defcoursetest my-test-27
               [ch-problems sub-ch-medium subj-pronounce-seq ins-pronounce-seq sub-ins-pronounce-seq]
               (defn pronounce-seq [xs]
                 (lazy-seq
                   (let [pron (->> xs
                                   (partition-by identity)
                                   (map #(vector (count %) (first %)))
                                   (reduce concat))]
                     (cons pron (pronounce-seq pron))))))

(defcoursetest my-test-28
               [ch-problems sub-ch-medium subj-decurry ins-decurry sub-ins-decurry]
               (defn decurry [f]
                 (fn inner [x & args]
                   (if (empty? args)
                     (f x)
                     (apply (decurry (f x)) args)))))

(defcoursetest my-test-29
               [ch-problems sub-ch-medium subj-lazy-searching ins-lazy-searching sub-ins-lazy-searching]
               (defn lazy-search [& seqs]
                 (let [smallest (first (first seqs))
                       dropped  (map (fn [xs] (drop-while #(< % smallest) xs)) seqs)
                       firsts   (map first dropped)]
                   (if (apply = firsts)
                     smallest
                     (apply lazy-search (cons (rest (first dropped)) (rest dropped)))))))

(defcoursetest my-test-30
               [ch-problems sub-ch-medium subj-partially-flatten-a-sequence ins-partially-flatten-a-sequence sub-ins-partially-flatten-a-sequence]
               (defn partially-flatten [xs]
                 (if (every? sequential? xs)
                   (mapcat partially-flatten xs)
                   [xs])))

(defcoursetest my-test-31
               [ch-problems sub-ch-medium subj-global-take-while ins-global-take-while sub-ins-global-take-while]
               (defn global-take-while [n p xs]
                 (lazy-seq
                   (if (p (first xs))
                     (if (> n 1)
                       (cons (first xs) (global-take-while (dec n) p (rest xs))))
                     (cons (first xs) (global-take-while n p (rest xs)))))))

(defcoursetest my-test-32
               [ch-problems sub-ch-medium subj-insert-between ins-insert-between sub-ins-insert-between]
               (defn insert-between [predicate delimiter xs]
                 (mapcat (fn [[a b]] (if (and (not (nil? b)) (predicate a b)) (list a delimiter) (list a)))
                         (partition-all 2 1 xs))))

(defcoursetest my-test-33
               [ch-problems sub-ch-medium subj-to-roman ins-to-roman sub-ins-to-roman]
               (defn to-roman [n]
                 (let [thousands       ["" "M" "MM" "MMM" "MMMM"]
                       hundreds        ["" "C" "CC" "CCC" "CD" "D" "DC" "DCC" "DCCC" "CM"]
                       tens            ["" "X" "XX" "XXX" "XL" "L" "LX" "LXX" "LXXX" "XC"]
                       units           ["" "I" "II" "III" "IV" "V" "VI" "VII" "VIII" "IX"]
                       positions       [units tens hundreds thousands]
                       char-to-digit   (zipmap (seq "0123456789") (range 10))
                       digits          (map char-to-digit (seq (str n)))
                       position-digits (map-indexed vector (reverse digits))
                       chars           (map (fn [[pos val]] ((positions pos) val)) position-digits)]
                   (apply str (reverse chars)))))

(defcoursetest my-test-34
               [ch-problems sub-ch-medium subj-k-combinations ins-k-combinations sub-ins-k-combinations]
               (defn k-combinations [n s]
                 (if (> n (count s))
                   #{}
                   (if (= 1 n) (into #{} (map (comp set vector) s))
                               (let [prior (k-combinations (dec n) s)]
                                 (into #{} (for [p prior
                                                 q (clojure.set/difference s p)]
                                             (clojure.set/union p #{q}))))))))

(defcoursetest my-test-35
               [ch-problems sub-ch-medium subj-prime-sandwich ins-prime-sandwich sub-ins-prime-sandwich]
               (defn balanced? [num]
                 (letfn [(prime []
                           (letfn [(step [coll]
                                     (let [head (first coll)]
                                       (lazy-seq (cons head (step (filter #(pos? (mod % head)) coll))))))]
                             (step (range 2 Long/MAX_VALUE))))
                         (balanced-prime []
                           (map second (filter #(= (second %) (/ (+ (first %) (last %)) 2)) (partition 3 1 (prime)))))]
                   (= num (last (take-while #(<= % num) (balanced-prime)))))))

(defcoursetest my-test-36
               [ch-problems sub-ch-medium subj-uct ins-uct sub-ins-uct]
               (defn uct [[op-sym & args]]
                 (let [operator (get {'/ / '* * '+ + '- -} op-sym)]
                   (fn [vars]
                     (let [calculate (fn [exp] (if (seq? exp) ((uct exp) vars) (or (vars exp) exp)))]
                       (apply operator (map calculate args)))))))

(defcoursetest my-test-37
               [ch-problems sub-ch-medium subj-intervals ins-intervals sub-ins-intervals]
               (defn intervals [xs]
                 (->> xs
                      sort
                      (partition-all 2 1)
                      (#(cons [(ffirst %)] %))
                      (remove (fn [[a b]] (and a b (< (- b a) 2))))
                      flatten
                      (partition 2))))

(defcoursetest my-test-38
               [ch-problems sub-ch-medium subj-big-divide ins-big-divide sub-ins-big-divide]
               (defn big-divide [num a b]
                 (let [ar-sum   (fn [m n] (* m (+ n 1) (/ n 2)))
                       how-many (fn [m] (bigint (/ (dec num) m)))]
                   (- (+ (ar-sum a (how-many a))
                         (ar-sum b (how-many b)))
                      (ar-sum (* a b) (how-many (* a b)))))))

(defcoursetest my-test-39
               [ch-problems sub-ch-medium subj-balancing-brackets ins-balancing-brackets sub-ins-balancing-brackets]
               (defn balanced? [string]
                 (let [pairs {\( \) \[ \] \}}]
                   (loop [[ch & more] string
                          stack []]
                     (if (nil? ch)
                       (empty? stack)
                       (if (pairs ch)
                         (recur more (cons ch stack))
                         (if (some #{ch} (vals pairs))
                           (and (= ch (pairs (first stack))) (recur more (rest stack)))
                           (recur more stack))))))))

(defcoursetest my-test-40
               [ch-problems sub-ch-medium subj-set-subset ins-set-subset sub-ins-set-subset]
               (defn have-subset? [& sets]
                 (let [powerset (fn [s] (reduce
                                          #(clojure.set/union %1 (into #{} (for [subset %1] (conj subset %2))))
                                          #{#{}}
                                          s))
                       sumset (fn [s] (into #{} (map (partial reduce +) s)))]
                   (->> sets
                        (map powerset)
                        (map #(remove empty? %))
                        (map sumset)
                        (apply clojure.set/intersection)
                        empty?
                        not))))