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
                                                        (code "(false? (palindrome '(:a :b :c)))"))
                                                      (testing
                                                        (is (false? (palindrome '(1 2 3 4 5))) :default :advanced)
                                                        (is (true? (palindrome "racecar")) :default :advanced)
                                                        (is (true? (palindrome [:foo :bar :foo])) :default :advanced)
                                                        (is (true? (palindrome '(1 1 3 3 1 1))) :default :advanced)
                                                        (is (false? (palindrome '(:a :b :c))) :default :advanced))))
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
                        'pack-a-sequence)))


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