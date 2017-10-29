(ns clj.sub-chapters.easy
  (:require [clojurecademy.dsl.core :refer :all]
            [clojurecademy.dsl.test :refer :all]))


(def sub-ch-easy
  (sub-chapter 'sub-ch-easy
               "Easy"

               (subject 'subj-easy-into
                        "Intro"

                        (learn
                          (text
                            (p "From now on you will be asked to write "
                               (bold "a top-level function")
                               " in the editor and this function will be evaluated so there is " (bold "NO") " more filling the "
                               (bold "blank") ".")
                            (p "For example: write a function called " (hi "my-add") " which adds two numbers and returns the result.")
                            (p "Such as:")
                            (code "(defn my-add\n  [a b]\n  (+ a b))")
                            (p (bold "Good luck!")))))


               (subject 'subj-last-element
                        "Last Element"

                        (learn
                          (text
                            (p "Write a function called " (hi "my-last") " which returns the last element in a sequence.")))

                        (instruction 'ins-last-element
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :restricted-fns '[last])

                                     (sub-instruction 'sub-ins-last-element
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (= (my-last [1 2 3 4 5]) 5))
                                                        (code "(= (my-last '(5 4 3)) 3)")
                                                        (code (= (my-last ["b" "c" "d"]) "d")))
                                                      (testing
                                                        (is (= (my-last [1 2 3 4 5]) 5) :default :advanced)
                                                        (is (= (my-last '(5 4 3)) 3) :default :advanced)
                                                        (is (= (my-last ["b" "c" "d"]) "d") :default :advanced))))
                        'last-element)


               (subject 'subj-penultimate-element
                        "Penultimate Element"

                        (learn
                          (text
                            (p "Write a function called " (hi "second-last") " which returns the second to last element from a sequence.")))

                        (instruction 'ins-penultimate-element
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-penultimate-element
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (= (second-last (list 1 2 3 4 5)) 4))
                                                        (code (= (second-last ["a" "b" "c"]) "b"))
                                                        (code (= (second-last [[1 2] [3 4]]) [1 2])))
                                                      (testing
                                                        (is (= (second-last (list 1 2 3 4 5)) 4) :default :advanced)
                                                        (is (= (second-last ["a" "b" "c"]) "b") :default :advanced)
                                                        (is (= (second-last [[1 2] [3 4]]) [1 2]) :default :advanced))))
                        'penultimate-element)


               (subject 'subj-nth-element
                        "Nth Element"

                        (learn
                          (text
                            (p "Write a function called " (hi "my-nth") " which returns the Nth element from a sequence.")))

                        (instruction 'ins-nth-element
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :restricted-fns '[nth])

                                     (sub-instruction 'sub-ins-nth-element
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code "(= (my-nth '(4 5 6 7) 2) 6)")
                                                        (code (= (my-nth [:a :b :c] 0) :a))
                                                        (code (= (my-nth [1 2 3 4] 1) 2))
                                                        (code "(= (my-nth '([1 2] [3 4] [5 6]) 2) [5 6])"))
                                                      (testing
                                                        (is (= (my-nth '(4 5 6 7) 2) 6) :default :advanced)
                                                        (is (= (my-nth [:a :b :c] 0) :a) :default :advanced)
                                                        (is (= (my-nth [1 2 3 4] 1) 2) :default :advanced)
                                                        (is (= (my-nth '([1 2] [3 4] [5 6]) 2) [5 6]) :default :advanced))))
                        'nth-element)


               (subject 'subj-count-a-sequence
                        "Count a Sequence"

                        (learn
                          (text
                            (p "Write a function called " (hi "count-seq") " which returns the total number of elements in a sequence.")))

                        (instruction 'ins-count-a-sequence
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :restricted-fns '[count])

                                     (sub-instruction 'sub-ins-count-a-sequence
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code "(= (count-seq '(1 2 3 3 1)) 5)")
                                                        (code (= (count-seq "Hello World") 11))
                                                        (code (= (count-seq [[1 2] [3 4] [5 6]]) 3))
                                                        (code "(= (count-seq '(13)) 1)")
                                                        (code (= (count-seq '(:a :b :c)) 3)))
                                                      (testing
                                                        (is (= (count-seq '(1 2 3 3 1)) 5) :default :advanced)
                                                        (is (= (count-seq "Hello World") 11) :default :advanced)
                                                        (is (= (count-seq [[1 2] [3 4] [5 6]]) 3) :default :advanced)
                                                        (is (= (count-seq '(13)) 1) :default :advanced))))
                        'count-a-sequence)


               (subject 'subj-sum-it-all-up
                        "Sum It All Up"

                        (learn
                          (text
                            (p "Write a function called " (hi "sum") " which returns the sum of a sequence of numbers.")))

                        (instruction 'ins-sum-it-all-up
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-sum-it-all-up
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (= (sum [1 2 3]) 6))
                                                        (code (= (sum (list 0 -2 5 5)) 8))
                                                        (code (= (sum #{4 2 1}) 7))
                                                        (code "(= (sum '(0 0 -1)) -1)")
                                                        (code "(= (sum '(1 10 3)) 14)"))
                                                      (testing
                                                        (is (= (sum [1 2 3]) 6) :default :advanced)
                                                        (is (= (sum (list 0 -2 5 5)) 8) :default :advanced)
                                                        (is (= (sum #{4 2 1}) 7) :default :advanced)
                                                        (is (= (sum '(0 0 -1)) -1) :default :advanced)
                                                        (is (= (sum '(1 10 3)) 14) :default :advanced))))
                        'sum-it-all-up)


               (subject 'subj-find-the-odd-numbers
                        "Find the odd numbers"

                        (learn
                          (text
                            (p "Write a function called " (hi "just-odds") " which returns only the odd numbers from a sequence.")))

                        (instruction 'ins-find-the-odd-numbers
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-find-the-odd-numbers
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code "(= (just-odds #{1 2 3 4 5}) '(1 3 5))")
                                                        (code "(= (just-odds [4 2 1 6]) '(1))")
                                                        (code "(= (just-odds [2 2 4 6]) '())")
                                                        (code "(= (just-odds [1 1 1 3]) '(1 1 1 3))"))
                                                      (testing
                                                        (is (= (just-odds #{1 2 3 4 5}) '(1 3 5)) :default :advanced)
                                                        (is (= (just-odds [4 2 1 6]) '(1)) :default :advanced)
                                                        (is (= (just-odds [2 2 4 6]) '()) :default :advanced)
                                                        (is (= (just-odds [1 1 1 3]) '(1 1 1 3)) :default :advanced))))
                        'find-the-odd-numbers)


               (subject 'subj-reverse-a-sequence
                        "Reverse a Sequence"

                        (learn
                          (text
                            (p "Write a function called " (hi "reverse-seq") " which reverses a sequence.")))

                        (instruction 'ins-reverse-a-sequence
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :restricted-fns '[reverse rseq])

                                     (sub-instruction 'sub-ins-reverse-a-sequence
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (= (reverse-seq [1 2 3 4 5]) [5 4 3 2 1]))
                                                        (code "(= (reverse-seq (sorted-set 5 7 2 7)) '(7 5 2))")
                                                        (code (= (reverse-seq [[1 2] [3 4] [5 6]]) [[5 6] [3 4] [1 2]])))
                                                      (testing
                                                        (is (= (reverse-seq [1 2 3 4 5]) [5 4 3 2 1]) :default :advanced)
                                                        (is (= (reverse-seq (sorted-set 5 7 2 7)) '(7 5 2)) :default :advanced)
                                                        (is (= (reverse-seq [[1 2] [3 4] [5 6]]) [[5 6] [3 4] [1 2]]) :default :advanced))))
                        'reverse-a-sequence)


               (subject 'subj-palindrome-detector
                        "Palindrome Detector"

                        (learn
                          (text
                            (p "Write a function called " (hi "palindrome") " which returns true if the given sequence is a palindrome.")
                            (p "Hint: " (bold "\"racecar\"") " does not equal " (hi "'(\\r \\a \\c \\e \\c \\a \\r)"))))

                        (instruction 'ins-palindrome-detector
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-palindrome-detector
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (false? (palindrome '(1 2 3 4 5))))
                                                        (code (true? (palindrome "racecar")))
                                                        (code (true? (palindrome [:foo :bar :foo])))
                                                        (code "(true? (palindrome '(1 1 3 3 1 1)))")
                                                        (code "(false? (palindrome '(:a :b :c)))")
                                                        (code (false? (palindrome [:a :b :c :a])))
                                                        (code (true? (palindrome [:x]))))
                                                      (testing
                                                        (is (false? (palindrome '(1 2 3 4 5))) :default :advanced)
                                                        (is (true? (palindrome "racecar")) :default :advanced)
                                                        (is (true? (palindrome [:foo :bar :foo])) :default :advanced)
                                                        (is (true? (palindrome '(1 1 3 3 1 1))) :default :advanced)
                                                        (is (false? (palindrome '(:a :b :c))) :default :advanced)
                                                        (is (false? (palindrome [:a :b :c :a])) :default :advanced)
                                                        (is (true? (palindrome [:x])) :default :advanced))))
                        'palindrome-detector)


               (subject 'subj-fibonacci-sequence
                        "Fibonacci Sequence"

                        (learn
                          (text
                            (p "Write a function called " (hi "nth-fib") " which returns the first " (bold "n") " fibonacci numbers.")))

                        (instruction 'ins-fibonacci-sequence
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-fibonacci-sequence
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code "(= (nth-fib 3) '(1 1 2))")
                                                        (code "(= (nth-fib 6) '(1 1 2 3 5 8))")
                                                        (code "(= (nth-fib 8) '(1 1 2 3 5 8 13 21))"))
                                                      (testing
                                                        (is (= (nth-fib 3) '(1 1 2)) :default :advanced)
                                                        (is (= (nth-fib 6) '(1 1 2 3 5 8)) :default :advanced)
                                                        (is (= (nth-fib 8) '(1 1 2 3 5 8 13 21)) :default :advanced))))
                        'fibonacci-sequence)


               (subject 'subj-maximum-value
                        "Maximum value"

                        (learn
                          (text
                            (p "Write a function called " (hi "my-max") " which takes a variable number of parameters and returns the maximum value.")))

                        (instruction 'ins-maximum-value
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :restricted-fns '[max max-key])

                                     (sub-instruction 'sub-ins-maximum-value
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (= (my-max 1 8 3 4) 8))
                                                        (code (= (my-max 30 20) 30))
                                                        (code (= (my-max 45 67 11) 67)))
                                                      (testing
                                                        (is (= (my-max 1 8 3 4) 8) :default :advanced)
                                                        (is (= (my-max 30 20) 30) :default :advanced)
                                                        (is (= (my-max 45 67 11) 67) :default :advanced))))
                        'maximum-value)


               (subject 'subj-get-the-caps
                        "Get the Caps"

                        (learn
                          (text
                            (p "Write a function called " (hi "only-capitals") " which takes a string and returns a new string containing only the capital letters.")))

                        (instruction 'ins-get-the-caps
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-get-the-caps
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (= (only-capitals "HeLlO, WoRlD!") "HLOWRD"))
                                                        (code (empty? (only-capitals "nothing")))
                                                        (code (= (only-capitals "$#A(*&987Zf") "AZ")))
                                                      (testing
                                                        (is (= (only-capitals "HeLlO, WoRlD!") "HLOWRD") :default :advanced)
                                                        (is (empty? (only-capitals "nothing")) :default :advanced)
                                                        (is (= (only-capitals "$#A(*&987Zf") "AZ") :default :advanced))))
                        'get-the-caps)


               (subject 'subj-duplicate-a-sequence
                        "Duplicate a Sequence"

                        (learn
                          (text
                            (p "Write a function called " (hi "duplicate") " which duplicates each element of a sequence.")))

                        (instruction 'ins-duplicate-a-sequence
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-duplicate-a-sequence
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code "(= (duplicate [1 2 3]) '(1 1 2 2 3 3))")
                                                        (code "(= (duplicate [:a :a :b :b]) '(:a :a :a :a :b :b :b :b))")
                                                        (code "(= (duplicate [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))"))
                                                      (testing
                                                        (is (= (duplicate [1 2 3]) '(1 1 2 2 3 3)) :default :advanced)
                                                        (is (= (duplicate [:a :a :b :b]) '(:a :a :a :a :b :b :b :b)) :default :advanced)
                                                        (is (= (duplicate [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4])) :default :advanced))))
                        'duplicate-a-sequence)


               (subject 'subj-implement-range
                        "Implement range"

                        (learn
                          (text
                            (p "Write a function called " (hi "my-range") " which creates a list of all integers in a given range.")))

                        (instruction 'ins-implement-range
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :restricted-fns '[range])

                                     (sub-instruction 'sub-ins-implement-range
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code "(= (my-range 1 4) '(1 2 3))")
                                                        (code "(= (my-range -2 2) '(-2 -1 0 1))")
                                                        (code "(= (my-range 5 8) '(5 6 7))"))
                                                      (testing
                                                        (is (= (my-range 1 4) '(1 2 3)) :default :advanced)
                                                        (is (= (my-range -2 2) '(-2 -1 0 1)) :default :advanced)
                                                        (is (= (my-range 5 8) '(5 6 7)) :default :advanced))))
                        'implement-range)


               (subject 'subj-compress-a-sequence
                        "Compress a Sequence"

                        (learn
                          (text
                            (p "Write a function called " (hi "compress") " which removes consecutive duplicates from a sequence.")))

                        (instruction 'ins-compress-a-sequence
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :restricted-fns '[range])

                                     (sub-instruction 'sub-ins-compress-a-sequence
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (= (apply str (compress "Leeeeeerrroyyy")) "Leroy"))
                                                        (code (= (compress [1 1 2 3 3 2 2 3]) '(1 2 3 2 3)))
                                                        (code (= (compress [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))))
                                                      (testing
                                                        (is (= (apply str (compress "Leeeeeerrroyyy")) "Leroy") :default :advanced)
                                                        (is (= (compress [1 1 2 3 3 2 2 3]) '(1 2 3 2 3)) :default :advanced)
                                                        (is (= (compress [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2])) :default :advanced))))
                        'compress-a-sequence)


               (subject 'subj-factorial-fun
                        "Factorial Fun"

                        (learn
                          (text
                            (p "Write a function called " (hi "factorial") " which calculates factorials.")))

                        (instruction 'ins-factorial-fun
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-factorial-fun
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (= (factorial 1) 1))
                                                        (code (= (factorial 3) 6))
                                                        (code (= (factorial 5) 120))
                                                        (code (= (factorial 8) 40320)))
                                                      (testing
                                                        (is (= (factorial 1) 1) :default :advanced)
                                                        (is (= (factorial 3) 6) :default :advanced)
                                                        (is (= (factorial 5) 120) :default :advanced)
                                                        (is (= (factorial 8) 40320) :default :advanced))))
                        'factorial-fun)


               (subject 'subj-interleave-two-seqs
                        "Interleave Two Seqs"

                        (learn
                          (text
                            (p "Write a function called " (hi "interleave-seqs")
                               " which takes two sequences and returns the first item from each, then the second item from each, then the third, etc.")))

                        (instruction 'ins-interleave-two-seqs
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :restricted-fns '[interleave])

                                     (sub-instruction 'sub-ins-interleave-two-seqs
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code "(= (interleave-seqs [1 2 3] [:a :b :c]) '(1 :a 2 :b 3 :c))")
                                                        (code "(= (interleave-seqs [1 2] [3 4 5 6]) '(1 3 2 4))")
                                                        (code (= (interleave-seqs [1 2 3 4] [5]) [1 5]))
                                                        (code (= (interleave-seqs [30 20] [25 15]) [30 25 20 15])))
                                                      (testing
                                                        (is (= (interleave-seqs [1 2 3] [:a :b :c]) '(1 :a 2 :b 3 :c)) :default :advanced)
                                                        (is (= (interleave-seqs [1 2] [3 4 5 6]) '(1 3 2 4)) :default :advanced)
                                                        (is (= (interleave-seqs [1 2 3 4] [5]) [1 5]) :default :advanced)
                                                        (is (= (interleave-seqs [30 20] [25 15]) [30 25 20 15]) :default :advanced))))
                        'interleave-two-seqs)


               (subject 'subj-flatten-a-sequence
                        "Flatten a Sequence"

                        (learn
                          (text
                            (p "Write a function called " (hi "flat") " which flattens a sequence.")))

                        (instruction 'ins-flatten-a-sequence
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :restricted-fns '[flatten])

                                     (sub-instruction 'sub-ins-flatten-a-sequence
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code "(= (flat '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6))")
                                                        (code "(= (flat [\"a\" [\"b\"] \"c\"]) '(\"a\" \"b\" \"c\"))")
                                                        (code "(= (flat '((((:a))))) '(:a))"))
                                                      (testing
                                                        (is (= (flat '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6)) :default :advanced)
                                                        (is (= (flat ["a" ["b"] "c"]) '("a" "b" "c")) :default :advanced)
                                                        (is (= (flat '((((:a))))) '(:a)) :default :advanced))))
                        'flatten-a-sequence)


               (subject 'subj-replicate-a-sequence
                        "Replicate a Sequence"

                        (learn
                          (text
                            (p "Write a function called " (hi "my-replicate")
                               " which replicates each element of a sequence a variable number of times.")))

                        (instruction 'ins-replicate-a-sequence
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :restricted-fns '[replicate])

                                     (sub-instruction 'sub-ins-replicate-a-sequence
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code "(= (my-replicate [1 2 3] 2) '(1 1 2 2 3 3))")
                                                        (code "(= (my-replicate [:a :b] 4) '(:a :a :a :a :b :b :b :b))")
                                                        (code "(= (my-replicate [4 5 6] 1) '(4 5 6))")
                                                        (code "(= (my-replicate [[1 2] [3 4]] 2) '([1 2] [1 2] [3 4] [3 4]))")
                                                        (code (= (my-replicate [44 33] 2) [44 44 33 33])))
                                                      (testing
                                                        (is (= (my-replicate [1 2 3] 2) '(1 1 2 2 3 3)) :default :advanced)
                                                        (is (= (my-replicate [:a :b] 4) '(:a :a :a :a :b :b :b :b)) :default :advanced)
                                                        (is (= (my-replicate [4 5 6] 1) '(4 5 6)) :default :advanced)
                                                        (is (= (my-replicate [[1 2] [3 4]] 2) '([1 2] [1 2] [3 4] [3 4])) :default :advanced)
                                                        (is (= (my-replicate [44 33] 2) [44 44 33 33]) :default :advanced))))
                        'replicate-a-sequence)


               (subject 'subj-interpose-a-seq
                        "Interpose a Seq"

                        (learn
                          (text
                            (p "Write a function called " (hi "interpose-seq") " which separates the items of a sequence by an arbitrary value.")))

                        (instruction 'ins-interpose-a-seq
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :restricted-fns '[interpose])

                                     (sub-instruction 'sub-ins-interpose-a-seq
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (= (interpose-seq 0 [1 2 3]) [1 0 2 0 3]))
                                                        (code (= (apply str (interpose-seq ", " ["one" "two" "three"])) "one, two, three"))
                                                        (code (= (interpose-seq :z [:a :b :c :d]) [:a :z :b :z :c :z :d])))
                                                      (testing
                                                        (is (= (interpose-seq 0 [1 2 3]) [1 0 2 0 3]) :default :advanced)
                                                        (is (= (apply str (interpose-seq ", " ["one" "two" "three"])) "one, two, three") :default :advanced)
                                                        (is (= (interpose-seq :z [:a :b :c :d]) [:a :z :b :z :c :z :d]) :default :advanced))))
                        'interpose-a-seq)


               (subject 'subj-pack-a-sequence
                        "Pack a Sequence"

                        (learn
                          (text
                            (p "Write a function called " (hi "pack-seq") " which packs consecutive duplicates into sub-lists.")))

                        (instruction 'ins-pack-a-sequence
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-pack-a-sequence
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code "(= (pack-seq [1 1 2 1 1 1 3 3]) '((1 1) (2) (1 1 1) (3 3)))")
                                                        (code "(= (pack-seq [:a :a :b :b :c]) '((:a :a) (:b :b) (:c)))")
                                                        (code "(= (pack-seq [[1 2] [1 2] [3 4]]) '(([1 2] [1 2]) ([3 4])))"))
                                                      (testing
                                                        (is (= (pack-seq [1 1 2 1 1 1 3 3]) '((1 1) (2) (1 1 1) (3 3))) :default :advanced)
                                                        (is (= (pack-seq [:a :a :b :b :c]) '((:a :a) (:b :b) (:c))) :default :advanced)
                                                        (is (= (pack-seq [[1 2] [1 2] [3 4]]) '(([1 2] [1 2]) ([3 4]))) :default :advanced))))
                        'pack-a-sequence)


               (subject 'subj-drop-every-nth-item
                        "Drop Every Nth Item"

                        (learn
                          (text
                            (p "Write a function called " (hi "drop-every-nth") " which drops every Nth item from a sequence.")))

                        (instruction 'ins-drop-every-nth-item
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-drop-every-nth-item
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (= (drop-every-nth [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8]))
                                                        (code (= (drop-every-nth [:a :b :c :d :e :f] 2) [:a :c :e]))
                                                        (code (= (drop-every-nth [1 2 3 4 5 6] 4) [1 2 3 5 6])))
                                                      (testing
                                                        (is (= (drop-every-nth [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8]) :default :advanced)
                                                        (is (= (drop-every-nth [:a :b :c :d :e :f] 2) [:a :c :e]) :default :advanced)
                                                        (is (= (drop-every-nth [1 2 3 4 5 6] 4) [1 2 3 5 6]) :default :advanced))))
                        'drop-every-nth-item)


               (subject 'subj-split-a-sequence
                        "Split a sequence"

                        (learn
                          (text
                            (p "Write a function called " (hi "split-seq") " which will split a sequence into two parts.")))

                        (instruction 'ins-split-a-sequence
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :restricted-fns '[split-at])

                                     (sub-instruction 'sub-ins-split-a-sequence
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (= (split-seq 3 [1 2 3 4 5 6]) [[1 2 3] [4 5 6]]))
                                                        (code (= (split-seq 1 [:a :b :c :d]) [[:a] [:b :c :d]]))
                                                        (code (= (split-seq 2 [[1 2] [3 4] [5 6]]) [[[1 2] [3 4]] [[5 6]]])))
                                                      (testing
                                                        (is (= (split-seq 3 [1 2 3 4 5 6]) [[1 2 3] [4 5 6]]) :default :advanced)
                                                        (is (= (split-seq 1 [:a :b :c :d]) [[:a] [:b :c :d]]) :default :advanced)
                                                        (is (= (split-seq 2 [[1 2] [3 4] [5 6]]) [[[1 2] [3 4]] [[5 6]]]) :default :advanced))))
                        'split-a-sequence)


               (subject 'subj-a-half-truth
                        "A Half-Truth"

                        (learn
                          (text
                            (p "Write a function called " (hi "half-truth") " which takes a variable number of booleans. Your function should return true if some of the parameters are true, but not all of the parameters are true. Otherwise your function should return false.")))

                        (instruction 'ins-a-half-truth
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-a-half-truth
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (= false (half-truth false false)))
                                                        (code (= true (half-truth true false)))
                                                        (code (= false (half-truth true)))
                                                        (code (= true (half-truth false true false)))
                                                        (code (= false (half-truth true true true)))
                                                        (code (= true (half-truth true true true false))))
                                                      (testing
                                                        (is (= false (half-truth false false)) :default :advanced)
                                                        (is (= true (half-truth true false)) :default :advanced)
                                                        (is (= false (half-truth true)) :default :advanced)
                                                        (is (= true (half-truth false true false)) :default :advanced)
                                                        (is (= false (half-truth true true true)) :default :advanced)
                                                        (is (= true (half-truth true true true false)) :default :advanced))))
                        'a-half-truth)


               (subject 'subj-map-construction
                        "Map Construction"

                        (learn
                          (text
                            (p "Write a function called " (hi "my-zipmap") " which takes a vector of keys and a vector of values and constructs a map from them.")))

                        (instruction 'ins-map-construction
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :restricted-fns '[zipmap])

                                     (sub-instruction 'sub-ins-map-construction
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (= (my-zipmap [:a :b :c] [1 2 3]) {:a 1, :b 2, :c 3}))
                                                        (code (= (my-zipmap [1 2 3 4] ["one" "two" "three"]) {1 "one", 2 "two", 3 "three"}))
                                                        (code (= (my-zipmap [:foo :bar] ["foo" "bar" "baz"]) {:foo "foo", :bar "bar"})))
                                                      (testing
                                                        (is (= (my-zipmap [:a :b :c] [1 2 3]) {:a 1, :b 2, :c 3}) :default :advanced)
                                                        (is (= (my-zipmap [1 2 3 4] ["one" "two" "three"]) {1 "one", 2 "two", 3 "three"}) :default :advanced)
                                                        (is (= (my-zipmap [:foo :bar] ["foo" "bar" "baz"]) {:foo "foo", :bar "bar"}) :default :advanced))))
                        'map-construction)


               (subject 'subj-greatest-common-divisor
                        "Greatest Common Divisor"

                        (learn
                          (text
                            (p "Write a function called " (hi "gcd") " which returns the greatest common divisor.")))

                        (instruction 'ins-greatest-common-divisor
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-greatest-common-divisor
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (= (gcd 2 4) 2))
                                                        (code (= (gcd 10 5) 5))
                                                        (code (= (gcd 5 7) 1))
                                                        (code (= (gcd 1023 858) 33)))
                                                      (testing
                                                        (is (= (gcd 2 4) 2) :default :advanced)
                                                        (is (= (gcd 10 5) 5) :default :advanced)
                                                        (is (= (gcd 5 7) 1) :default :advanced)
                                                        (is (= (gcd 1023 858) 33) :default :advanced))))
                        'greatest-common-divisor)


               (subject 'subj-set-intersection
                        "Set Intersection"

                        (learn
                          (text
                            (p "Write a function called " (hi "my-intersection")
                               " which returns the intersection of two sets. The intersection is the sub-set of items that each set has in common.")))

                        (instruction 'ins-set-intersection
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :restricted-fns '[intersection])

                                     (sub-instruction 'sub-ins-set-intersection
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (= (my-intersection #{0 1 2 3} #{2 3 4 5}) #{2 3}))
                                                        (code (= (my-intersection #{0 1 2} #{3 4 5}) #{}))
                                                        (code (= (my-intersection #{:a :b :c :d} #{:c :e :a :f :d}) #{:a :c :d})))
                                                      (testing
                                                        (is (= (my-intersection #{0 1 2 3} #{2 3 4 5}) #{2 3}) :default :advanced)
                                                        (is (= (my-intersection #{0 1 2} #{3 4 5}) #{}) :default :advanced)
                                                        (is (= (my-intersection #{:a :b :c :d} #{:c :e :a :f :d}) #{:a :c :d}) :default :advanced))))
                        'set-intersection)


               (subject 'subj-comparisons
                        "Comparisons"

                        (learn
                          (text
                            (p "For any orderable data type it's possible to derive all of the basic comparison operations (<, ≤, =, ≠, ≥, and >) from a single operation (any operator but = or ≠ will work). Write a function called " (hi "my-comparison") " takes three arguments, a less than operator for the data and two items to compare. The function should return a keyword describing the relationship between the two items. The keywords for the relationship between x and y are as follows:")
                            (p (hi "x = y → :eq"))
                            (p (hi "x > y → :gt"))
                            (p (hi "x < y → :lt"))))

                        (instruction 'ins-comparisons
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-comparisons
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (= :gt (my-comparison < 5 1)))
                                                        (code (= :eq (my-comparison (fn [x y] (< (count x) (count y))) "pear" "plum")))
                                                        (code (= :lt (my-comparison (fn [x y] (< (mod x 5) (mod y 5))) 21 3)))
                                                        (code (= :gt (my-comparison > 0 2))))
                                                      (testing
                                                        (is (= :gt (my-comparison < 5 1)) :default :advanced)
                                                        (is (= :eq (my-comparison (fn [x y] (< (count x) (count y))) "pear" "plum")) :default :advanced)
                                                        (is (= :lt (my-comparison (fn [x y] (< (mod x 5) (mod y 5))) 21 3)) :default :advanced)
                                                        (is (= :gt (my-comparison > 0 2)) :default :advanced))))
                        'comparisons)


               (subject 'subj-re-implement-iterate
                        "Re-implement Iterate"

                        (learn
                          (text
                            (p "Given a side-effect free function f and an initial value x write a function called " (hi "my-iterate")
                               " which returns an infinite lazy sequence of x, (f x), (f (f x)), (f (f (f x))), etc.\n")))

                        (instruction 'ins-re-implement-iterate
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :restricted-fns '[iterate])

                                     (sub-instruction 'sub-ins-re-implement-iterate
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code "(= (take 5 (my-iterate #(* 2 %) 1)) [1 2 4 8 16])")
                                                        (code "(= (take 100 (my-iterate inc 0)) (take 100 (range)))")
                                                        (code "(= (take 9 (my-iterate #(inc (mod % 3)) 1)) (take 9 (cycle [1 2 3])))"))
                                                      (testing
                                                        (is (= (take 5 (my-iterate #(* 2 %) 1)) [1 2 4 8 16]) :default :advanced)
                                                        (is (= (take 100 (my-iterate inc 0)) (take 100 (range))) :default :advanced)
                                                        (is (= (take 9 (my-iterate #(inc (mod % 3)) 1)) (take 9 (cycle [1 2 3]))) :default :advanced))))
                        're-implement-iterate)


               (subject 'subj-cartesian-product
                        "Cartesian Product"

                        (learn
                          (text
                            (p "Write a function called " (hi "cartesian") " which calculates the Cartesian product of two sets.")))

                        (instruction 'ins-cartesian-product
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-cartesian-product
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code "(= (cartesian #{\"ace\" \"king\" \"queen\"} #{\"♠\" \"♥\" \"♦\" \"♣\"})\n   #{[\"ace\"   \"♠\"] [\"ace\"   \"♥\"] [\"ace\"   \"♦\"] [\"ace\"   \"♣\"]\n     [\"king\"  \"♠\"] [\"king\"  \"♥\"] [\"king\"  \"♦\"] [\"king\"  \"♣\"]\n     [\"queen\" \"♠\"] [\"queen\" \"♥\"] [\"queen\" \"♦\"] [\"queen\" \"♣\"]})")
                                                        (code "(= (cartesian #{1 2 3} #{4 5})\n   #{[1 4] [2 4] [3 4] [1 5] [2 5] [3 5]})")
                                                        (code "(= 300 (count (cartesian (into #{} (range 10))\n                  (into #{} (range 30)))))"))
                                                      (testing
                                                        (is (= (cartesian #{"ace" "king" "queen"} #{"♠" "♥" "♦" "♣"})
                                                               #{["ace" "♠"] ["ace" "♥"] ["ace" "♦"] ["ace" "♣"]
                                                                 ["king" "♠"] ["king" "♥"] ["king" "♦"] ["king" "♣"]
                                                                 ["queen" "♠"] ["queen" "♥"] ["queen" "♦"] ["queen" "♣"]}) :default :advanced)
                                                        (is (= (cartesian #{1 2 3} #{4 5})
                                                               #{[1 4] [2 4] [3 4] [1 5] [2 5] [3 5]}) :default :advanced)
                                                        (is (= 300 (count (cartesian (into #{} (range 10))
                                                                                     (into #{} (range 30))))) :default :advanced))))
                        'cartesian-product)


               (subject 'subj-product-digits
                        "Product Digits"

                        (learn
                          (text
                            (p "Write a function called " (hi "product-digits")
                               " which multiplies two numbers and returns the result as a sequence of its digits.")))

                        (instruction 'ins-product-digits
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-product-digits
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (= (product-digits 1 1) [1]))
                                                        (code (= (product-digits 99 9) [8 9 1]))
                                                        (code (= (product-digits 999 99) [9 8 9 0 1])))
                                                      (testing
                                                        (is (= (product-digits 1 1) [1]) :default :advanced)
                                                        (is (= (product-digits 99 9) [8 9 1]) :default :advanced)
                                                        (is (= (product-digits 999 99) [9 8 9 0 1]) :default :advanced))))
                        'product-digits)


               (subject 'subj-group-a-sequence
                        "Group a Sequence"

                        (learn
                          (text
                            (p "Given a function f and a sequence s, write a function called " (hi "my-group-by")
                               " which returns a map. The keys should be the values of f applied to each item in s. The value at each key should be a vector of corresponding items in the order they appear in s.")))

                        (instruction 'ins-group-a-sequence
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :restricted-fns '[group-by])

                                     (sub-instruction 'sub-ins-group-a-sequence
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code "(= (my-group-by #(> % 5) [1 3 6 8]) {false [1 3], true [6 8]})")
                                                        (code "(= (my-group-by #(apply / %) [[1 2] [2 4] [4 6] [3 6]])\n   {1/2 [[1 2] [2 4] [3 6]], 2/3 [[4 6]]})")
                                                        (code "(= (my-group-by count [[1] [1 2] [3] [1 2 3] [2 3]])\n   {1 [[1] [3]], 2 [[1 2] [2 3]], 3 [[1 2 3]]})"))
                                                      (testing
                                                        (is (= (my-group-by #(> % 5) [1 3 6 8]) {false [1 3], true [6 8]}) :default :advanced)
                                                        (is (= (my-group-by #(apply / %) [[1 2] [2 4] [4 6] [3 6]])
                                                               {1/2 [[1 2] [2 4] [3 6]], 2/3 [[4 6]]}) :default :advanced)
                                                        (is (= (my-group-by count [[1] [1 2] [3] [1 2 3] [2 3]])
                                                               {1 [[1] [3]], 2 [[1 2] [2 3]], 3 [[1 2 3]]}) :default :advanced))))
                        'group-a-sequence)


               (subject 'subj-symmetric-difference
                        "Symmetric Difference"

                        (learn
                          (text
                            (p "Write a function called " (hi "symmetric-diff")
                               " which returns the symmetric difference of two sets. The symmetric difference is the set of items belonging to one but not both of the two sets.")))

                        (instruction 'ins-symmetric-difference
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-symmetric-difference
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (= (symmetric-diff #{1 2 3 4 5 6} #{1 3 5 7}) #{2 4 6 7}))
                                                        (code (= (symmetric-diff #{:a :b :c} #{}) #{:a :b :c}))
                                                        (code (= (symmetric-diff #{} #{4 5 6}) #{4 5 6}))
                                                        (code (= (symmetric-diff #{[1 2] [2 3]} #{[2 3] [3 4]}) #{[1 2] [3 4]})))
                                                      (testing
                                                        (is (= (symmetric-diff #{1 2 3 4 5 6} #{1 3 5 7}) #{2 4 6 7}) :default :advanced)
                                                        (is (= (symmetric-diff #{:a :b :c} #{}) #{:a :b :c}) :default :advanced)
                                                        (is (= (symmetric-diff #{} #{4 5 6}) #{4 5 6}) :default :advanced)
                                                        (is (= (symmetric-diff #{[1 2] [2 3]} #{[2 3] [3 4]}) #{[1 2] [3 4]}) :default :advanced))))
                        'symmetric-difference)


               (subject 'subj-dot-product
                        "dot product"

                        (learn
                          (text
                            (p "Write a function called " (hi "dot-product")
                               " which computes the " (link "dot product" "http://en.wikipedia.org/wiki/Dot_product#Definition")
                               " of two sequences. You may assume that the vectors will have the same length.")))

                        (instruction 'ins-dot-product
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-dot-product
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (= 0 (dot-product [0 1 0] [1 0 0])))
                                                        (code (= 3 (dot-product [1 1 1] [1 1 1])))
                                                        (code (= 32 (dot-product [1 2 3] [4 5 6])))
                                                        (code (= 256 (dot-product [2 5 6] [100 10 1]))))
                                                      (testing
                                                        (is (= 0 (dot-product [0 1 0] [1 0 0])) :default :advanced)
                                                        (is (= 3 (dot-product [1 1 1] [1 1 1])) :default :advanced)
                                                        (is (= 32 (dot-product [1 2 3] [4 5 6])) :default :advanced)
                                                        (is (= 256 (dot-product [2 5 6] [100 10 1])) :default :advanced))))
                        'dot-product)


               (subject 'subj-read-a-binary-number
                        "Read a binary number"

                        (learn
                          (text
                            (p "Write a function called " (hi "read-binary")
                               " which converts a binary number, provided in the form of a string, to its numerical value.")))

                        (instruction 'ins-read-a-binary-number
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-read-a-binary-number
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (= 0 (read-binary "0")))
                                                        (code (= 7 (read-binary "111")))
                                                        (code (= 8 (read-binary "1000")))
                                                        (code (= 9 (read-binary "1001")))
                                                        (code (= 255 (read-binary "11111111")))
                                                        (code (= 1365 (read-binary "10101010101")))
                                                        (code (= 65535 (read-binary "1111111111111111"))))
                                                      (testing
                                                        (is (= 0 (read-binary "0")) :default :advanced)
                                                        (is (= 7 (read-binary "111")) :default :advanced)
                                                        (is (= 8 (read-binary "1000")) :default :advanced)
                                                        (is (= 9 (read-binary "1001")) :default :advanced)
                                                        (is (= 255 (read-binary "11111111")) :default :advanced)
                                                        (is (= 1365 (read-binary "10101010101")) :default :advanced)
                                                        (is (= 65535 (read-binary "1111111111111111")) :default :advanced))))
                        'read-a-binary-number)


               (subject 'subj-infix-calculator
                        "Infix Calculator"

                        (learn
                          (text
                            (p "Your friend Joe is always whining about Lisps using the prefix notation for math. Show him how you could easily write a function that does math using the infix notation. Is your favorite language that flexible, Joe? Write a function called " (hi "infix-calc") " that accepts a variable length mathematical expression consisting of numbers and the operations +, -, *, and /. Assume a simple calculator that does not do precedence and instead just calculates left to right.")))

                        (instruction 'ins-infix-calculator
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-infix-calculator
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (= 7 (infix-calc 2 + 5)))
                                                        (code (= 42 (infix-calc 38 + 48 - 2 / 2)))
                                                        (code (= 8 (infix-calc 10 / 2 - 1 * 2)))
                                                        (code (= 72 (infix-calc 20 / 2 + 2 + 4 + 8 - 6 - 10 * 9))))
                                                      (testing
                                                        (is (= 7 (infix-calc 2 + 5)) :default :advanced)
                                                        (is (= 42 (infix-calc 38 + 48 - 2 / 2)) :default :advanced)
                                                        (is (= 8 (infix-calc 10 / 2 - 1 * 2)) :default :advanced)
                                                        (is (= 72 (infix-calc 20 / 2 + 2 + 4 + 8 - 6 - 10 * 9)) :default :advanced))))
                        'infix-calculator)


               (subject 'subj-indexing-sequences
                        "Indexing Sequences"

                        (learn
                          (text
                            (p "Write a function called " (hi "index-seq")
                               " which transforms a sequence into a sequence of pairs containing the original elements along with their index.")))

                        (instruction 'ins-indexing-sequences
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-indexing-sequences
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (= (index-seq [:a :b :c]) [[:a 0] [:b 1] [:c 2]]))
                                                        (code "(= (index-seq [0 1 3]) '((0 0) (1 1) (3 2)))")
                                                        (code (= (index-seq [[:foo] {:bar :baz}]) [[[:foo] 0] [{:bar :baz} 1]])))
                                                      (testing
                                                        (is (= (index-seq [:a :b :c]) [[:a 0] [:b 1] [:c 2]]) :default :advanced)
                                                        (is (= (index-seq [0 1 3]) '((0 0) (1 1) (3 2))) :default :advanced)
                                                        (is (= (index-seq [[:foo] {:bar :baz}]) [[[:foo] 0] [{:bar :baz} 1]]) :default :advanced))))
                        'indexing-sequences)


               (subject 'subj-pascals-triangle
                        "Pascal's Triangle"

                        (learn
                          (text
                            (p (link "Pascal's triangle" "http://en.wikipedia.org/wiki/Pascal%27s_triangle") " is a triangle of numbers computed using the following rules:")
                            (p "- The first row is 1.")
                            (p "- Each successive row is computed by adding together adjacent numbers in the row above, and adding a 1 to the beginning and end of the row.")
                            (p "Write a function called " (hi "pascals-triangle") " which returns the nth row of Pascal's Triangle.")))

                        (instruction 'ins-pascals-triangle
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-pascals-triangle
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (= (pascals-triangle 1) [1]))
                                                        (code "(= (map pascals-triangle (range 1 6))\n   [     [1]\n        [1 1]\n       [1 2 1]\n      [1 3 3 1]\n     [1 4 6 4 1]])")
                                                        (code "(= (pascals-triangle 11)\n   [1 10 45 120 210 252 210 120 45 10 1])"))
                                                      (testing
                                                        (is (= (pascals-triangle 1) [1]) :default :advanced)
                                                        (is (= (map pascals-triangle (range 1 6)) [[1] [1 1] [1 2 1] [1 3 3 1] [1 4 6 4 1]]) :default :advanced)
                                                        (is (= (pascals-triangle 11) [1 10 45 120 210 252 210 120 45 10 1]) :default :advanced))))
                        'pascals-triangle)


               (subject 'subj-re-implement-map
                        "Re-implement Map"

                        (learn
                          (text
                            (p "Map is one of the core elements of a functional programming language. Given a function f and an input sequence s, return a lazy sequence of (f x) for each element x in s. Write a function called " (hi "my-map") " which re-implements map function.")))

                        (instruction 'ins-re-implement-map
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :restricted-fns '[map map-indexed mapcat for])

                                     (sub-instruction 'sub-ins-re-implement-map
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code "(= [3 4 5 6 7]\n   (my-map inc [2 3 4 5 6]))")
                                                        (code "(= (repeat 10 nil)\n   (my-map (fn [_] nil) (range 10)))")
                                                        (code "(= [1000000 1000001]\n   (->> (my-map inc (range))\n        (drop (dec 1000000))\n        (take 2)))"))
                                                      (testing
                                                        (is (= [3 4 5 6 7] (my-map inc [2 3 4 5 6])) :default :advanced)
                                                        (is (= (repeat 10 nil) (my-map (fn [_] nil) (range 10))) :default :advanced)
                                                        (is (= [1000000 1000001] (->> (my-map inc (range)) (drop (dec 1000000)) (take 2))) :default :advanced))))
                        're-implement-map)


               (subject 'subj-to-tree-or-not-to-tree
                        "To Tree, or not to Tree"

                        (learn
                          (text
                            (p "Write a function called " (hi "tree?")
                               " which checks whether or not a given sequence represents a " (link "binary tree"
                                                                                                   "http://en.wikipedia.org/wiki/Binary_tree")
                               ". Each node in the tree must have a value, a left child, and a right child.")))

                        (instruction 'ins-to-tree-or-not-to-tree
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-to-tree-or-not-to-tree
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code "(= (tree? '(:a (:b nil nil) nil))\n   true)")
                                                        (code "(= (tree? '(:a (:b nil nil)))\n   false)")
                                                        (code "(= (tree? [1 nil [2 [3 nil nil] [4 nil nil]]])\n   true)")
                                                        (code "(= (tree? [1 [2 nil nil] [3 nil nil] [4 nil nil]])\n   false)")
                                                        (code "(= (tree? [1 [2 [3 [4 nil nil] nil] nil] nil])\n   true)")
                                                        (code "(= (tree? [1 [2 [3 [4 false nil] nil] nil] nil])\n   false)")
                                                        (code "(= (tree? '(:a nil ()))\n   false)"))
                                                      (testing
                                                        (is (= (tree? '(:a (:b nil nil) nil)) true) :default :advanced)
                                                        (is (= (tree? '(:a (:b nil nil))) false) :default :advanced)
                                                        (is (= (tree? [1 nil [2 [3 nil nil] [4 nil nil]]]) true) :default :advanced)
                                                        (is (= (tree? [1 [2 nil nil] [3 nil nil] [4 nil nil]]) false) :default :advanced)
                                                        (is (= (tree? [1 [2 [3 [4 nil nil] nil] nil] nil]) true) :default :advanced)
                                                        (is (= (tree? [1 [2 [3 [4 false nil] nil] nil] nil]) false) :default :advanced)
                                                        (is (= (tree? '(:a nil ())) false) :default :advanced))))
                        'to-tree-or-not-to-tree)


               (subject 'subj-sum-of-square-of-digits
                        "Sum of square of digits"

                        (learn
                          (text
                            (p "Write a function called " (hi "square-dig")
                               " which takes a collection of integers as an argument. Return the count of how many elements are smaller than the sum of their squared component digits. For example: 10 is larger than 1 squared plus 0 squared; whereas 15 is smaller than 1 squared plus 5 squared.")))

                        (instruction 'ins-sum-of-square-of-digits
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-sum-of-square-of-digits
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (= 8 (square-dig (range 10))))
                                                        (code (= 19 (square-dig (range 30))))
                                                        (code (= 50 (square-dig (range 100))))
                                                        (code (= 50 (square-dig (range 1000)))))
                                                      (testing
                                                        (is (= 8 (square-dig (range 10))) :default :advanced)
                                                        (is (= 19 (square-dig (range 30))) :default :advanced)
                                                        (is (= 50 (square-dig (range 100))) :default :advanced)
                                                        (is (= 50 (square-dig (range 1000))) :default :advanced))))
                        'sum-of-square-of-digits)


               (subject 'subj-least-common-multiple
                        "Least Common Multiple"

                        (learn
                          (text
                            (p "Write a function called " (hi "lcm")
                               " which calculates the " (link "least common multiple" "http://en.wikipedia.org/wiki/Least_common_multiple")
                               ". Your function should accept a variable number of positive integers or ratios. ")))

                        (instruction 'ins-least-common-multiple
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-least-common-multiple
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (== (lcm 2 3) 6))
                                                        (code (== (lcm 5 3 7) 105))
                                                        (code (== (lcm 1/3 2/5) 2))
                                                        (code (== (lcm 3/4 1/6) 3/2))
                                                        (code (== (lcm 7 5/7 2 3/5) 210)))
                                                      (testing
                                                        (is (== (lcm 2 3) 6) :default :advanced)
                                                        (is (== (lcm 5 3 7) 105) :default :advanced)
                                                        (is (== (lcm 1/3 2/5) 2) :default :advanced)
                                                        (is (== (lcm 3/4 1/6) 3/2) :default :advanced)
                                                        (is (== (lcm 7 5/7 2 3/5) 210) :default :advanced))))
                        'least-common-multiple)


               (subject 'subj-beauty-is-symmetry
                        "Beauty is Symmetry"

                        (learn
                          (text
                            (p "Let us define a binary tree as " (bold "symmetric") " if the left half of the tree is the mirror image of the right half of the tree. Write a function called " (hi "symmetry") " which determines whether or not a given binary tree is symmetric.")))

                        (instruction 'ins-beauty-is-symmetry
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-beauty-is-symmetry
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code "(= (symmetric '(:a (:b nil nil) (:b nil nil))) true)")
                                                        (code "(= (symmetric '(:a (:b nil nil) nil)) false)")
                                                        (code "(= (symmetric '(:a (:b nil nil) (:c nil nil))) false)")
                                                        (code "(= (symmetric [1 [2 nil [3 [4 [5 nil nil] [6 nil nil]] nil]]\n          [2 [3 nil [4 [6 nil nil] [5 nil nil]]] nil]])\n   true)")
                                                        (code "(= (symmetric [1 [2 nil [3 [4 [5 nil nil] [6 nil nil]] nil]]\n          [2 [3 nil [4 [5 nil nil] [6 nil nil]]] nil]])\n   false)")
                                                        (code "(= (symmetric [1 [2 nil [3 [4 [5 nil nil] [6 nil nil]] nil]]\n          [2 [3 nil [4 [6 nil nil] nil]] nil]])\n   false)"))
                                                      (testing
                                                        (is (= (symmetric '(:a (:b nil nil) (:b nil nil))) true) :default :advanced)
                                                        (is (= (symmetric '(:a (:b nil nil) nil)) false) :default :advanced)
                                                        (is (= (symmetric '(:a (:b nil nil) (:c nil nil))) false) :default :advanced)
                                                        (is (= (symmetric [1 [2 nil [3 [4 [5 nil nil] [6 nil nil]] nil]] [2 [3 nil [4 [6 nil nil] [5 nil nil]]] nil]]) true) :default :advanced)
                                                        (is (= (symmetric [1 [2 nil [3 [4 [5 nil nil] [6 nil nil]] nil]] [2 [3 nil [4 [5 nil nil] [6 nil nil]]] nil]]) false) :default :advanced)
                                                        (is (= (symmetric [1 [2 nil [3 [4 [5 nil nil] [6 nil nil]] nil]] [2 [3 nil [4 [6 nil nil] nil]] nil]]) false) :default :advanced))))
                        'beauty-is-symmetry)


               (subject 'subj-pascals-trapezoid
                        "Pascal's Trapezoid"

                        (learn
                          (text
                            (p "Write a function called " (hi "trapezoid")
                               " that, for any given input vector of numbers, returns an infinite lazy sequence of vectors, where each next one is constructed from the previous following the rules used in Pascal's Triangle. For example, for [3 1 2], the next row is [3 4 3 2].")

                            (p "Beware of arithmetic overflow! In clojure (since version 1.3 in 2011), if you use an arithmetic operator like + and the result is too large to fit into a 64-bit integer, an exception is thrown. You can use " (hi "+'") " to indicate that you would rather overflow into Clojure's slower, arbitrary-precision bigint.")))

                        (instruction 'ins-pascals-trapezoid
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-pascals-trapezoid
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code (= (second (trapezoid [2 3 2])) [2 5 5 2]))
                                                        (code (= (take 5 (trapezoid [1])) [[1] [1 1] [1 2 1] [1 3 3 1] [1 4 6 4 1]]))
                                                        (code (= (take 2 (trapezoid [3 1 2])) [[3 1 2] [3 4 3 2]]))
                                                        (code (= (take 100 (trapezoid [2 4 2])) (rest (take 101 (trapezoid [2 2]))))))
                                                      (testing
                                                        (is (= (second (trapezoid [2 3 2])) [2 5 5 2]) :default :advanced)
                                                        (is (= (take 5 (trapezoid [1])) [[1] [1 1] [1 2 1] [1 3 3 1] [1 4 6 4 1]]) :default :advanced)
                                                        (is (= (take 2 (trapezoid [3 1 2])) [[3 1 2] [3 4 3 2]]) :default :advanced)
                                                        (is (= (take 100 (trapezoid [2 4 2])) (rest (take 101 (trapezoid [2 2])))) :default :advanced))))
                        'pascals-trapezoid)


               (subject 'subj-trees-into-tables
                        "Trees into tables"

                        (learn
                          (text
                            (p "Because Clojure's for macro allows you to \"walk\" over multiple sequences in a nested fashion, it is excellent for transforming all sorts of sequences. If you don't want a sequence as your final output (say you want a map), you are often still best-off using for, because you can produce a sequence and feed it into a map, for example.")
                            (p "For this problem, your goal is to \"flatten\" a map of hashmaps. Each key in your output map should be the \"path\"1 that you would have to take in the original map to get to a value, so for example {1 {2 3}} should result in {[1 2] 3}. You only need to flatten one level of maps: if one of the values is a map, just leave it alone. Define your function name as: " (hi "trees-into-tables") ".")
                            (p "That is, (get-in original [k1 k2]) should be the same as (get result [k1 k2])\n\n")))

                        (instruction 'ins-trees-into-tables
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-trees-into-tables
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code "(= (trees-into-tables '{a {p 1, q 2}\n         b {m 3, n 4}})\n   '{[a p] 1, [a q] 2\n     [b m] 3, [b n] 4})")
                                                        (code "(= (trees-into-tables '{[1] {a b c d}\n         [2] {q r s t u v w x}})\n   '{[[1] a] b, [[1] c] d,\n     [[2] q] r, [[2] s] t,\n     [[2] u] v, [[2] w] x})")
                                                        (code "(= (trees-into-tables '{m {1 [a b c] 3 nil}})\n   '{[m 1] [a b c], [m 3] nil})"))
                                                      (testing
                                                        (is (= (trees-into-tables '{a {p 1, q 2} b {m 3, n 4}}) '{[a p] 1, [a q] 2 [b m] 3, [b n] 4}) :default :advanced)
                                                        (is (= (trees-into-tables '{[1] {a b c d} [2] {q r s t u v w x}}) '{[[1] a] b, [[1] c] d, [[2] q] r, [[2] s] t, [[2] u] v, [[2] w] x}) :default :advanced)
                                                        (is (= (trees-into-tables '{m {1 [a b c] 3 nil}}) '{[m 1] [a b c], [m 3] nil}) :default :advanced))))
                        'trees-into-tables)


               (subject 'subj-pairwise-disjoint-sets
                        "Pairwise Disjoint Sets"

                        (learn
                          (text
                            (p "Given a set of sets, create a function called " (hi "disjoint-sets") " which returns true if no two of those sets have any elements in common1 and false otherwise. Some of the test cases are a bit tricky, so pay a little more attention to them.")
                            (p "Such sets are usually called pairwise disjoint or mutually disjoint.")))

                        (instruction 'ins-pairwise-disjoint-sets
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-pairwise-disjoint-sets
                                                      (text
                                                        (p "Tests need to pass:")
                                                        (code "(= (disjoint-sets #{#{\\U} #{\\s} #{\\e \\R \\E} #{\\P \\L} #{\\.}})\n   true)")
                                                        (code "(= (disjoint-sets #{#{:a :b :c :d :e}\n         #{:a :b :c :d}\n         #{:a :b :c}\n         #{:a :b}\n         #{:a}})\n   false)")
                                                        (code "(= (disjoint-sets #{#{[1 2 3] [4 5]}\n         #{[1 2] [3 4 5]}\n         #{[1] [2] 3 4 5}\n         #{1 2 [3 4] [5]}})\n   true)")
                                                        (code "(= (disjoint-sets #{#{'a 'b}\n         #{'c 'd 'e}\n         #{'f 'g 'h 'i}\n         #{''a ''c ''f}})\n   true)")
                                                        (code "(= (disjoint-sets #{#{'(:x :y :z) '(:x :y) '(:z) '()}\n         #{#{:x :y :z} #{:x :y} #{:z} #{}}\n         #{'[:x :y :z] [:x :y] [:z] [] {}}})\n   false)")
                                                        (code "(= (disjoint-sets #{#{(= \"true\") false}\n         #{:yes :no}\n         #{(class 1) 0}\n         #{(symbol \"true\") 'false}\n         #{(keyword \"yes\") ::no}\n         #{(class '1) (int \\0)}})\n   false)")
                                                        (code "(= (disjoint-sets #{#{distinct?}\n         #{#(-> %) #(-> %)}\n         #{#(-> %) #(-> %) #(-> %)}\n         #{#(-> %) #(-> %) #(-> %)}})\n   true)")
                                                        (code "(= (disjoint-sets #{#{(#(-> *)) + (quote mapcat) #_ nil}\n         #{'+ '* mapcat (comment mapcat)}\n         #{(do) set contains? nil?}\n         #{, , , #_, , empty?}})\n   false)")
                                                        )
                                                      (testing
                                                        (is (= (disjoint-sets #{#{\U} #{\s} #{\e \R \E} #{\P \L} #{\.}}) true) :default :advanced)
                                                        (is (= (disjoint-sets #{#{:a :b :c :d :e} #{:a :b :c :d} #{:a :b :c} #{:a :b} #{:a}}) false) :default :advanced)
                                                        (is (= (disjoint-sets #{#{[1 2 3] [4 5]} #{[1 2] [3 4 5]} #{[1] [2] 3 4 5} #{1 2 [3 4] [5]}}) true) :default :advanced)
                                                        (is (= (disjoint-sets #{#{'a 'b} #{'c 'd 'e} #{'f 'g 'h 'i} #{''a ''c ''f}}) true) :default :advanced)
                                                        (is (= (disjoint-sets #{#{'(:x :y :z) '(:x :y) '(:z) '()} #{#{:x :y :z} #{:x :y} #{:z} #{}} #{'[:x :y :z] [:x :y] [:z] [] {}}}) false) :default :advanced)
                                                        (is (= (disjoint-sets #{#{(= "true") false} #{:yes :no} #{(class 1) 0} #{(symbol "true") 'false} #{(keyword "yes") ::no} #{(class '1) (int \0)}}) false) :default :advanced)
                                                        (is (= (disjoint-sets #{#{distinct?} #{#(-> %) #(-> %)} #{#(-> %) #(-> %) #(-> %)} #{#(-> %) #(-> %) #(-> %)}}) true) :default :advanced)
                                                        (is (= (disjoint-sets #{#{(#(-> *)) + (quote mapcat) #_nil}
                                                                                #{'+ '* mapcat (comment mapcat)}
                                                                                #{(do) set contains? nil?}
                                                                                #{,,, #_,, empty?}})
                                                               false) :default :advanced))))
                        'pairwise-disjoint-sets)))


(defcoursetest my-test-1
               [ch-problems sub-ch-easy subj-last-element ins-last-element sub-ins-last-element]
               (defn my-last
                 [x]
                 (nth x (- (count x) 1))))


(defcoursetest my-test-2
               [ch-problems sub-ch-easy subj-penultimate-element ins-penultimate-element sub-ins-penultimate-element]
               (defn second-last
                 [col]
                 (nth col (- (count col) 2)))) 1


(defcoursetest my-test-3
               [ch-problems sub-ch-easy subj-nth-element ins-nth-element sub-ins-nth-element]
               (defn my-nth
                 [a b]
                 (last (take (+ b 1) a))))


(defcoursetest my-test-4
               [ch-problems sub-ch-easy subj-count-a-sequence ins-count-a-sequence sub-ins-count-a-sequence]
               (defn count-seq
                 [coll]
                 (reduce (fn [x _] (inc x)) 0 coll)))


(defcoursetest my-test-5
               [ch-problems sub-ch-easy subj-sum-it-all-up ins-sum-it-all-up sub-ins-sum-it-all-up]
               (defn sum
                 [v]
                 (apply + v)))


(defcoursetest my-test-6
               [ch-problems sub-ch-easy subj-find-the-odd-numbers ins-find-the-odd-numbers sub-ins-find-the-odd-numbers]
               (defn just-odds
                 [coll]
                 (for [c coll
                       :when (odd? c)]
                   c)))


(defcoursetest my-test-7
               [ch-problems sub-ch-easy subj-reverse-a-sequence ins-reverse-a-sequence sub-ins-reverse-a-sequence]
               (defn reverse-seq
                 [s]
                 (reduce conj '() s)))


(defcoursetest my-test-8
               [ch-problems sub-ch-easy subj-palindrome-detector ins-palindrome-detector sub-ins-palindrome-detector]
               (defn palindrome
                 [x]
                 (= (apply str x) (apply str (reverse x)))))


(defcoursetest my-test-9
               [ch-problems sub-ch-easy subj-fibonacci-sequence ins-fibonacci-sequence sub-ins-fibonacci-sequence]
               (defn nth-fib
                 [nth-fib-elem]
                 (loop [fibs [1 1]]
                   (if (= nth-fib-elem (count fibs))
                     fibs
                     (recur (conj fibs (+ (last fibs) (nth fibs (- (count fibs) 2)))))))))


(defcoursetest my-test-10
               [ch-problems sub-ch-easy subj-maximum-value ins-maximum-value sub-ins-maximum-value]
               (defn my-max
                 [& args]
                 (reduce (fn [v1 v2] (if (> v1 v2)
                                       v1
                                       v2)) args)))


(defcoursetest my-test-11
               [ch-problems sub-ch-easy subj-get-the-caps ins-get-the-caps sub-ins-get-the-caps]
               (defn only-capitals
                 [x]
                 (apply str (for [s x :when (Character/isUpperCase s)] s))))


(defcoursetest my-test-12
               [ch-problems sub-ch-easy subj-duplicate-a-sequence ins-duplicate-a-sequence sub-ins-duplicate-a-sequence]
               (defn duplicate
                 [coll]
                 (reduce #(conj (conj %1 %2) %2) [] coll)))


(defcoursetest my-test-13
               [ch-problems sub-ch-easy subj-implement-range ins-implement-range sub-ins-implement-range]
               (defn my-range
                 [x y]
                 (loop [i x v []]
                   (if (= i y)
                     v
                     (recur (inc i) (conj v i))))))


(defcoursetest my-test-14
               [ch-problems sub-ch-easy subj-compress-a-sequence ins-compress-a-sequence sub-ins-compress-a-sequence]
               (defn compress
                 [coll]
                 (loop [v []
                        i 0]
                   (if (= i (count coll))
                     v
                     (recur (if (not= (last v) (nth coll i))
                              (conj v (nth coll i))
                              v) (inc i))))))


(defcoursetest my-test-15
               [ch-problems sub-ch-easy subj-factorial-fun ins-factorial-fun sub-ins-factorial-fun]
               (defn factorial
                 [x]
                 (apply * (range 1 (+ 1 x)))))


(defcoursetest my-test-16
               [ch-problems sub-ch-easy subj-interleave-two-seqs ins-interleave-two-seqs sub-ins-interleave-two-seqs]
               (defn interleave-seqs
                 [seq1 seq2]
                 (flatten (map list seq1 seq2))))


(defcoursetest my-test-17
               [ch-problems sub-ch-easy subj-flatten-a-sequence ins-flatten-a-sequence sub-ins-flatten-a-sequence]
               (defn flat
                 [x]
                 (if (coll? x)
                   (mapcat flat x)
                   [x])))


(defcoursetest my-test-18
               [ch-problems sub-ch-easy subj-replicate-a-sequence ins-replicate-a-sequence sub-ins-replicate-a-sequence]
               (defn my-replicate
                 [a b]
                 (apply concat (map (fn [x] (repeat b x)) a))))


(defcoursetest my-test-19
               [ch-problems sub-ch-easy subj-interpose-a-seq ins-interpose-a-seq sub-ins-interpose-a-seq]
               (defn interpose-seq
                 [inter seq2]
                 (let [li []]
                   (drop-last (flatten (map #(conj li %1 inter) seq2))))))


(defcoursetest my-test-20
               [ch-problems sub-ch-easy subj-pack-a-sequence ins-pack-a-sequence sub-ins-pack-a-sequence]
               (defn pack-seq
                 [coll]
                 (partition-by identity coll)))


(defcoursetest my-test-21
               [ch-problems sub-ch-easy subj-drop-every-nth-item ins-drop-every-nth-item sub-ins-drop-every-nth-item]
               (defn drop-every-nth [coll nth-drop]
                 (flatten (reduce #(if (= (count %2) nth-drop)
                                     (conj %1 (drop-last %2))
                                     (conj %1 %2)) [] (partition nth-drop nth-drop [] coll)))))


(defcoursetest my-test-22
               [ch-problems sub-ch-easy subj-split-a-sequence ins-split-a-sequence sub-ins-split-a-sequence]
               (defn split-seq [s c]
                 (conj (conj [] (take s c)) (drop s c))))


(defcoursetest my-test-23
               [ch-problems sub-ch-easy subj-a-half-truth ins-a-half-truth sub-ins-a-half-truth]
               (defn half-truth [& args]
                 (if (< (count args) 2)
                   false
                   (and (not (not-any? false? args)) (not (not-any? true? args))))))


(defcoursetest my-test-24
               [ch-problems sub-ch-easy subj-map-construction ins-map-construction sub-ins-map-construction]
               (defn my-zipmap [x t]
                 (apply assoc {} (reverse (interleave t x)))))


(defcoursetest my-test-25
               [ch-problems sub-ch-easy subj-greatest-common-divisor ins-greatest-common-divisor sub-ins-greatest-common-divisor]
               (defn gcd [a b]
                 (if (= b 0)
                   a
                   (gcd b (mod a b)))))


(defcoursetest my-test-26
               [ch-problems sub-ch-easy subj-set-intersection ins-set-intersection sub-ins-set-intersection]
               (defn my-intersection [c1 c2]
                 (set (for [c c1
                            :when (contains? c2 c)]
                        c))))


(defcoursetest my-test-27
               [ch-problems sub-ch-easy subj-comparisons ins-comparisons sub-ins-comparisons]
               (defn my-comparison [f a b]
                 (cond
                   (f a b) :lt
                   (f b a) :gt
                   :else :eq)))


(defcoursetest my-test-28
               [ch-problems sub-ch-easy subj-re-implement-iterate ins-re-implement-iterate sub-ins-re-implement-iterate]
               (defn my-iterate [f n]
                 (lazy-seq (cons n (my-iterate f (f n))))))


(defcoursetest my-test-29
               [ch-problems sub-ch-easy subj-cartesian-product ins-cartesian-product sub-ins-cartesian-product]
               (defn cartesian
                 [x y]
                 (into #{} (for [i x j y] [i j]))))


(defcoursetest my-test-30
               [ch-problems sub-ch-easy subj-product-digits ins-product-digits sub-ins-product-digits]
               (defn product-digits
                 [x y]
                 (loop [i (* x y)
                        r '()]
                   (if (= i 0)
                     r
                     (recur (quot i 10) (cons (mod i 10) r))))))


(defcoursetest my-test-31
               [ch-problems sub-ch-easy subj-group-a-sequence ins-group-a-sequence sub-ins-group-a-sequence]
               (defn my-group-by [f s]
                 (reduce (fn [m v]
                           (let [key (f v)
                                 pre (get m key)]
                             (if pre
                               (assoc m key (conj pre v))
                               (assoc m key [v])))) {} s)))


(defcoursetest my-test-32
               [ch-problems sub-ch-easy subj-symmetric-difference ins-symmetric-difference sub-ins-symmetric-difference]
               (defn symmetric-diff
                 [x y]
                 (let [u (clojure.set/union x y)
                       i (clojure.set/intersection x y)]
                   (clojure.set/difference u i))))



(defcoursetest my-test-33
               [ch-problems sub-ch-easy subj-dot-product ins-dot-product sub-ins-dot-product]
               (defn dot-product [v1 v2]
                 (reduce #(+ %1 (* (first %2) (second %2))) 0 (partition 2 (interleave v1 v2)))))


(defcoursetest my-test-34
               [ch-problems sub-ch-easy subj-read-a-binary-number ins-read-a-binary-number sub-ins-read-a-binary-number]
               (defn read-binary [arg]
                 (reduce #(+ %1 (int (Math/pow 2 %2))) 0 (keep-indexed #(if (= \1 %2) %1) (reverse arg)))))


(defcoursetest my-test-35
               [ch-problems sub-ch-easy subj-infix-calculator ins-infix-calculator sub-ins-infix-calculator]
               (defn infix-calc [& args]
                 (reduce (fn [a [op b]]
                           (op a b)) (first args) (partition 2 (rest args)))))


(defcoursetest my-test-36
               [ch-problems sub-ch-easy subj-indexing-sequences ins-indexing-sequences sub-ins-indexing-sequences]
               (defn index-seq [coll]
                 (keep-indexed #(vector %2 %1) coll)))


(defcoursetest my-test-37
               [ch-problems sub-ch-easy subj-pascals-triangle ins-pascals-triangle sub-ins-pascals-triangle]
               (defn pascals-triangle [n]
                 (nth (lazy-seq (iterate #(vec (map +' (cons 0 %) (conj % 0))) [1])) (- n 1))))


(defcoursetest my-test-38
               [ch-problems sub-ch-easy subj-re-implement-map ins-re-implement-map sub-ins-re-implement-map]
               (defn my-map [f coll]
                 (if (not (empty? coll))
                   (lazy-seq
                     (cons (f (first coll)) (my-map f (rest coll)))))))


(defcoursetest my-test-39
               [ch-problems sub-ch-easy subj-to-tree-or-not-to-tree ins-to-tree-or-not-to-tree sub-ins-to-tree-or-not-to-tree]
               (defn tree? [root]
                 (or (nil? root)
                     (and (sequential? root)
                          (= 3 (count root))
                          (every? tree? (rest root))))))


(defcoursetest my-test-40
               [ch-problems sub-ch-easy subj-sum-of-square-of-digits ins-sum-of-square-of-digits sub-ins-sum-of-square-of-digits]
               (defn square-dig [coll]
                 (let [sumOfSquaredComponent (->> coll
                                                  (map str)
                                                  (map seq)
                                                  (map #(map (fn [x] (- (int x) 48)) %))
                                                  (map #(map (fn [x] (* x x)) %))
                                                  (map #(reduce + %)))]
                   (count (filter true? (map > sumOfSquaredComponent coll))))))


(defcoursetest my-test-41
               [ch-problems sub-ch-easy subj-least-common-multiple ins-least-common-multiple sub-ins-least-common-multiple]
               (defn lcm [& nums]
                 (reduce #(/ (* %1 %2) ((fn gcd
                                          [f s]
                                          (if (= s 0)
                                            f
                                            (gcd s (mod f s)))) %1 %2)) nums)))


(defcoursetest my-test-42
               [ch-problems sub-ch-easy subj-beauty-is-symmetry ins-beauty-is-symmetry sub-ins-beauty-is-symmetry]
               (defn symmetric [[root left right]]
                 (let [mirror? (fn mirror? [a b]
                                 (cond
                                   (not= (sequential? a) (sequential? b)) false
                                   (sequential? a) (let [[ra La Ra] a
                                                         [rb Lb Rb] b]
                                                     (and (= ra rb) (mirror? La Rb) (mirror? Lb Ra)))
                                   :else (= a b)))]
                   (mirror? left right))))


(defcoursetest my-test-43
               [ch-problems sub-ch-easy subj-pascals-trapezoid ins-pascals-trapezoid sub-ins-pascals-trapezoid]
               (defn trapezoid [coll]
                 (lazy-seq (iterate #(vec (map +' (conj % 0) (cons 0 %))) coll))))


(defcoursetest my-test-44
               [ch-problems sub-ch-easy subj-trees-into-tables ins-trees-into-tables sub-ins-trees-into-tables]
               (defn trees-into-tables
                 [m]
                 (into {} (for [[k1 v1] m [k2 v2] v1] [[k1 k2] v2]))))


(defcoursetest my-test-45
               [ch-problems sub-ch-easy subj-pairwise-disjoint-sets ins-pairwise-disjoint-sets sub-ins-pairwise-disjoint-sets]
               (defn disjoint-sets
                 [x]
                 (apply distinct? (mapcat seq x))))