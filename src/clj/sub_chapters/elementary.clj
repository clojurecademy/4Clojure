(ns clj.sub-chapters.elementary
  (:require [clojurecademy.dsl.core :refer :all]
            [clojurecademy.dsl.test :refer :all]))


(def sub-ch-elementary
  (sub-chapter 'sub-ch-elementary
               "Elementary"

               (subject 'subj-nothing-but-the-truth
                        "Nothing but the Truth"

                        (learn
                          (text
                            (p "This is a Clojure form. Enter a value which will make the form evaluate to true."
                               (italic "Don't over think it!"))
                            (p "Hint: " (hi "true") " is equal to " (hi "true") ".")))

                        (instruction 'ins-nothing-but-the-truth
                                     (run-pre-tests? false)
                                     (initial-code "\n;;Write your code under this comment, it will fill the blank.\n")
                                     (rule :no-rule? true)
                                     (sub-instruction 'sub-ins-make-the-code-return-true
                                                      (text
                                                        (p "Enter only " (bold "enough to fill in the blank")
                                                           " (in this case, a boolean true/false) - do not retype the whole problem.")
                                                        (code "(= #_blank true)"))
                                                      (testing
                                                        (is (fills-the-blank? :_ (= :_ true))))))
                        'nothing-but-the-truth)


               (subject 'subj-simple-math
                        "Simple Math"

                        (learn
                          (text
                            (p "If you are not familiar with " (link "polish notation"
                                                                     "http://en.wikipedia.org/wiki/Polish_notation")
                               ", simple arithmetic might seem confusing.")))

                        (instruction 'ins-simple-math
                                     (run-pre-tests? false)
                                     (initial-code "\n;;Write your code under this comment, it will fill the blank.\n")
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-make-the-code-return-true-with-4
                                                      (text
                                                        (p "Enter only " (bold "enough to fill in the blank")
                                                           " (in this case, a single number) - do not retype the whole problem.")
                                                        (code "(= (- 10 (* 2 3)) #_blank)"))
                                                      (testing
                                                        (is (fills-the-blank? :_ (= (- 10 (* 2 3)) :_))))))
                        'simple-math)


               (subject 'subj-intro-to-strings
                        "Intro to Strings"

                        (learn
                          (text
                            (p "Clojure strings are Java strings. This means that you can use any of the Java string methods on Clojure strings.")))

                        (instruction 'ins-intro-to-strings
                                     (run-pre-tests? false)
                                     (initial-code "\n;;Write your code under this comment, it will fill the blank.\n")
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-make-the-code-return-true-with-str-uppercase
                                                      (text
                                                        (p "Enter only " (bold "enough to fill in the blank")
                                                           " (in this case, a string) - do not retype the whole problem.")
                                                        (code "(= #_blank (.toUpperCase \"hello world\"))"))
                                                      (testing
                                                        (is (fills-the-blank? :_ (= :_ (.toUpperCase "hello world")))))))
                        'intro-to-strings)


               (subject 'subj-intro-to-lists
                        "Intro to Lists"

                        (learn
                          (text
                            (p "Lists can be constructed with either a function or a quoted form.\n")))

                        (instruction 'ins-intro-to-lists
                                     (run-pre-tests? false)
                                     (initial-code "\n;;Write your code under this comment, it will fill the blank.\n")
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-make-the-code-return-true-with-list
                                                      (text
                                                        (p "Enter only " (bold "enough to fill in the blank")
                                                           " (in this case, a list) - do not retype the whole problem.")
                                                        (code "(= #_blank '(:a :b :c))"))
                                                      (testing
                                                        (is (fills-the-blank? :_ (= :_ '(:a :b :c)))))))
                        'intro-to-lists)


               (subject 'subj-lists-conj
                        "Lists: conj"

                        (learn
                          (text
                            (p "When operating on a list, the conj function will return a new list with one or more items "
                               (bold "added") " to the front.")))

                        (instruction 'ins-lists-conj
                                     (run-pre-tests? false)
                                     (initial-code "\n;;Write your code under this comment, it will fill the blank.\n")
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-make-the-code-return-true-with-lists-conj
                                                      (text
                                                        (p "Enter only " (bold "enough to fill in the blank")
                                                           ", do not retype the whole problem.")
                                                        (code "(= #_blank (conj '(2 3 4) 1))")
                                                        (code "(= #_blank(conj '(3 4) 2 1))"))
                                                      (testing
                                                        (is (fills-the-blank? :_ (= :_ (conj '(2 3 4) 1))))

                                                        (is (fills-the-blank? :_ (= :_ (conj '(3 4) 2 1)))))))
                        'lists-conj)


               (subject 'subj-intro-to-vectors
                        "Intro to Vectors"

                        (learn
                          (text
                            (p "Vectors can be constructed several ways. You can compare them with lists. \n")))

                        (instruction 'ins-intro-to-vectors
                                     (run-pre-tests? false)
                                     (initial-code "\n;;Write your code under this comment, it will fill the blank.\n")
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-make-the-code-return-true-with-vector
                                                      (text
                                                        (p "Enter only " (bold "enough to fill in the blank")
                                                           ", do not retype the whole problem.Please use " (hi "[value1 value2 ...]") " to construct a vector.")
                                                        (code "(= #_blank (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))"))
                                                      (testing
                                                        (is (fills-the-blank? :_ (= :_ (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c)))))))
                        'intro-to-vectors)


               (subject 'subj-vector-conj
                        "Vectors: conj"

                        (learn
                          (text
                            (p "When operating on a Vector, the conj function will return a new vector with one or more items "
                               (hi "added") " to the end.")))

                        (instruction 'ins-intro-to-vectors
                                     (run-pre-tests? false)
                                     (initial-code "\n;;Write your code under this comment, it will fill the blank.\n")
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-make-the-code-return-true-with-vectors-conj
                                                      (text
                                                        (p "Enter only " (bold "enough to fill in the blank")
                                                           ", do not retype the whole problem.")
                                                        (code "(= #_blank (conj [1 2 3] 4))")
                                                        (code "(= #_blank (conj [1 2] 3 4))"))
                                                      (testing
                                                        (is (fills-the-blank? :_ (= :_ (conj [1 2 3] 4))))

                                                        (is (fills-the-blank? :_ (= :_ (conj [1 2] 3 4)))))))
                        'vector-conj)


               (subject 'subj-intro-to-sets
                        "Intro to Sets"

                        (learn
                          (text
                            (p "Sets are collections of unique values.")))

                        (instruction 'ins-intro-to-sets
                                     (run-pre-tests? false)
                                     (initial-code "\n;;Write your code under this comment, it will fill the blank.\n")
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-make-the-code-return-true-with-sets
                                                      (text
                                                        (p "Enter only " (bold "enough to fill in the blank")
                                                           ", do not retype the whole problem.")
                                                        (code "(= #_blank (set '(:a :a :b :c :c :c :c :d :d)))")
                                                        (code "(= #_blank (clojure.set/union #{:a :b :c} #{:b :c :d}))"))
                                                      (testing
                                                        (is (fills-the-blank? :_ (= :_ (set '(:a :a :b :c :c :c :c :d :d)))))
                                                        (is (fills-the-blank? :_ (= :_ (clojure.set/union #{:a :b :c} #{:b :c :d})))))))
                        'intro-to-sets)


               (subject 'subj-sets-conj
                        "Sets: conj"

                        (learn
                          (text
                            (p "When operating on a set, the conj function returns a new set with one or more keys " (bold "added") ".")))

                        (instruction 'ins-sets-conj
                                     (run-pre-tests? false)
                                     (initial-code "\n;;Write your code under this comment, it will fill the blank.\n")
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-make-the-code-return-true-with-sets-conj
                                                      (text
                                                        (p "Enter only " (bold "enough to fill in the blank")
                                                           ", do not retype the whole problem.")
                                                        (code "(= #{1 2 3 4} (conj #{1 4 3} #_blank))"))
                                                      (testing
                                                        (is (fills-the-blank? :_ (= #{1 2 3 4} (conj #{1 4 3} :_)))))))
                        'sets-conj)


               (subject 'subj-intro-to-maps
                        "Intro to Maps"

                        (learn
                          (text
                            (p "Maps store key-value pairs. Both maps and keywords can be used as lookup functions.
                                     Commas can be used to make maps more readable, but they are " (bold "not required") ".")))

                        (instruction 'ins-sets-conj
                                     (run-pre-tests? false)
                                     (initial-code "\n;;Write your code under this comment, it will fill the blank.\n")
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-make-the-code-return-true-with-maps
                                                      (text
                                                        (p "Enter only " (bold "enough to fill in the blank")
                                                           ", do not retype the whole problem.")
                                                        (code "(= #_blank ((hash-map :a 10, :b 20, :c 30) :b))")
                                                        (code "(= #_blank (:b {:a 10, :b 20, :c 30}))"))
                                                      (testing
                                                        (is (fills-the-blank? :_ (= :_ ((hash-map :a 10, :b 20, :c 30) :b))))
                                                        (is (fills-the-blank? :_ (= :_ (:b {:a 10, :b 20, :c 30})))))))
                        'intro-to-maps)


               (subject 'subj-maps-conj
                        "Maps: conj"

                        (learn
                          (text
                            (p "When operating on a map, the conj function returns a new map with one or more key-value pairs " (bold "added") ".")))

                        (instruction 'ins-maps-conj
                                     (run-pre-tests? false)
                                     (initial-code "\n;;Write your code under this comment, it will fill the blank.\n")
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-make-the-code-return-true-with-map-conj
                                                      (text
                                                        (p "Enter only " (bold "enough to fill in the blank")
                                                           ", do not retype the whole problem.")
                                                        (code "(= {:a 1, :b 2, :c 3} (conj {:a 1} #_blank [:c 3]))"))
                                                      (testing
                                                        (is (fills-the-blank? :_ (= {:a 1, :b 2, :c 3} (conj {:a 1} :_ [:c 3])))))))
                        'maps-conj)


               (subject 'subj-intro-to-seqs
                        "Intro to Sequences"

                        (learn
                          (text
                            (p "All Clojure collections support sequencing. You can operate on sequences with functions like "
                               (bold "first") ", " (bold "second") ", and " (bold "last") ".")))

                        (instruction 'ins-intro-to-seqs
                                     (run-pre-tests? false)
                                     (initial-code "\n;;Write your code under this comment, it will fill the blank.\n")
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-make-the-code-return-true-with-seq-first
                                                      (text
                                                        (p "Enter only " (bold "enough to fill in the blank")
                                                           ", do not retype the whole problem.")
                                                        (code "(= #_blank (first '(3 2 1)))")
                                                        (code "(= #_blank (second [2 3 4]))")
                                                        (code "(= #_blank (last (list 1 2 3)))"))
                                                      (testing
                                                        (is (fills-the-blank? :_ (= :_ (first '(3 2 1)))))
                                                        (is (fills-the-blank? :_ (= :_ (second [2 3 4]))))
                                                        (is (fills-the-blank? :_ (= :_ (last (list 1 2 3))))))))
                        'intro-to-seqs)


               (subject 'subj-sequences-rest
                        "Sequences: rest"

                        (learn
                          (text
                            (p "The rest function will return all the items of a sequence except the first.")))

                        (instruction 'ins-sequences-rest
                                     (run-pre-tests? false)
                                     (initial-code "\n;;Write your code under this comment, it will fill the blank.\n")
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-make-the-code-return-true-with-sequences-rest
                                                      (text
                                                        (p "Enter only " (bold "enough to fill in the blank")
                                                           ", do not retype the whole problem.")
                                                        (code "(= #_blank (rest [10 20 30 40]))"))
                                                      (testing
                                                        (is (fills-the-blank? :_ (= :_ (rest [10 20 30 40])))))))
                        'sequences-rest)


               (subject 'subj-intro-to-functions
                        "Intro to Functions"

                        (learn
                          (text
                            (p "Clojure has many different ways to create functions.")))

                        (instruction 'ins-intro-to-functions
                                     (run-pre-tests? false)
                                     (initial-code "\n;;Write your code under this comment, it will fill the blank.\n")
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-make-the-code-return-true-with-fn-1
                                                      (text
                                                        (p "Enter only " (bold "enough to fill in the blank")
                                                           ", do not retype the whole problem.")
                                                        (code "(= #_blank ((fn add-five [x] (+ x 5)) 3))")
                                                        (code "(= #_blank ((fn [x] (+ x 5)) 3))")
                                                        (code "(= #_blank (#(+ % 5) 3))")
                                                        (code "(= #_blank ((partial + 5) 3))"))
                                                      (testing
                                                        (is (fills-the-blank? :_ (= :_ ((fn add-five [x] (+ x 5)) 3))))
                                                        (is (fills-the-blank? :_ (= :_ ((fn [x] (+ x 5)) 3))))
                                                        (is (fills-the-blank? :_ (= :_ (#(+ % 5) 3))))
                                                        (is (fills-the-blank? :_ (= :_ ((partial + 5) 3)))))))
                        'intro-to-functions)


               (subject 'subj-double-down
                        "Double Down"

                        (learn
                          (text
                            (p "Write an anonymous function which doubles a number.")
                            (code ";Anonymous function example\n(fn [arg-1 arg-2] <function body>)")))

                        (instruction 'ins-double-down
                                     (run-pre-tests? false)
                                     (initial-code "\n;;Write your code under this comment, it will fill the blank.\n")
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-make-the-code-return-true-with-double-down-1
                                                      (text
                                                        (p "Enter only " (bold "enough to fill in the blank")
                                                           ", do not retype the whole problem.")
                                                        (code "(= 4 (#_blank 2))")
                                                        (code "(= 6 (#_blank 3))")
                                                        (code "(= 22 (#_blank 11))")
                                                        (code "(= 14 (#_blank 7))"))
                                                      (testing
                                                        (is (fills-the-blank? :_ (= 4 (:_ 2))))
                                                        (is (fills-the-blank? :_ (= 6 (:_ 3))))
                                                        (is (fills-the-blank? :_ (= 22 (:_ 11))))
                                                        (is (fills-the-blank? :_ (= 14 (:_ 7)))))))
                        'double-down)


               (subject 'subj-hello-world
                        "Hello World"

                        (learn
                          (text
                            (p "Write an anonymous function which returns a personalized greeting.")
                            (code ";Anonymous function example\n(fn [arg-1 arg-2] <function body>)")))

                        (instruction 'ins-hello-world
                                     (run-pre-tests? false)
                                     (initial-code "\n;;Write your code under this comment, it will fill the blank.\n")
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-make-the-code-return-true-with-hello-world
                                                      (text
                                                        (p "Enter only " (bold "enough to fill in the blank")
                                                           ", do not retype the whole problem.")
                                                        (code "(= (#_blank \"Dave\") \"Hello, Dave!\")")
                                                        (code "(= (#_blank \"Jenn\") \"Hello, Jenn!\")")
                                                        (code "(= (#_blank \"Rhea\") \"Hello, Rhea!\")"))
                                                      (testing
                                                        (is (fills-the-blank? :_ (= (:_ "Dave") "Hello, Dave!")))
                                                        (is (fills-the-blank? :_ (= (:_ "Jenn") "Hello, Jenn!")))
                                                        (is (fills-the-blank? :_ (= (:_ "Rhea") "Hello, Rhea!"))))))
                        'hello-world)


               (subject 'subj-sequences-map
                        "Sequences: map"

                        (learn
                          (text
                            (p (str "The map function takes two arguments: a function " (bold "(f)") " and a sequence " (bold "(s)") "."
                                    "Map returns a new sequence consisting of the result of applying f to each item of s."
                                    "Do not confuse the map function with the map clj structure."))))

                        (instruction 'ins-sequences-map
                                     (run-pre-tests? false)
                                     (initial-code "\n;;Write your code under this comment, it will fill the blank.\n")
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-make-the-code-return-true-with-sequences-map
                                                      (text
                                                        (p "Enter only " (bold "enough to fill in the blank")
                                                           ", do not retype the whole problem.")
                                                        (code "(= #_blank (map #(+ % 5) '(1 2 3)))"))
                                                      (testing
                                                        (is (fills-the-blank? :_ (= :_ (map #(+ % 5) '(1 2 3))))))))
                        'sequences-map)


               (subject 'subj-sequences-filter
                        "Sequences: filter"

                        (learn
                          (text
                            (p (str "The filter function takes two arguments: a predicate function " (bold "(f)") " and a sequence " (bold "(s)") "."
                                    "Filter returns a new sequence consisting of all the items of s for which (f item) returns true."))))

                        (instruction 'ins-sequences-filter
                                     (run-pre-tests? false)
                                     (initial-code "\n;;Write your code under this comment, it will fill the blank.\n")
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-make-the-code-return-true-with-sequences-filter
                                                      (text
                                                        (p "Enter only " (bold "enough to fill in the blank")
                                                           ", do not retype the whole problem.")
                                                        (code "(= #_blank (filter #(> % 5) '(3 4 5 6 7)))"))
                                                      (testing
                                                        (is (fills-the-blank? :_ (= :_ (filter #(> % 5) '(3 4 5 6 7))))))))
                        'sequences-filter)


               (subject 'subj-local-bindings
                        "Local bindings"

                        (learn
                          (text
                            (p "Clojure lets you give local names to values using the special " (hi "let") " form.")))

                        (instruction 'ins-local-bindings
                                     (run-pre-tests? false)
                                     (initial-code "\n;;Write your code under this comment, it will fill the blank.\n")
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-make-the-code-return-true-with-local-bindings
                                                      (text
                                                        (p "Enter only " (bold "enough to fill in the blank")
                                                           ", do not retype the whole problem.")
                                                        (code "(= #_blank (let [x 5] (+ 2 x)))")
                                                        (code "(= #_blank (let [x 3, y 10] (- y x)))")
                                                        (code "(= #_blank (let [x 21] (let [y 3] (/ x y))))"))
                                                      (testing
                                                        (is (fills-the-blank? :_ (= :_ (let [x 5] (+ 2 x)))))
                                                        (is (fills-the-blank? :_ (= :_ (let [x 3, y 10] (- y x)))))
                                                        (is (fills-the-blank? :_ (= :_ (let [x 21] (let [y 3] (/ x y)))))))))
                        'local-bindings)


               (subject 'subj-regular-expressions
                        "Regular Expressions"

                        (learn
                          (text
                            (p "Regex patterns are supported with a special reader macro.")))

                        (instruction 'ins-regular-expressions
                                     (run-pre-tests? false)
                                     (initial-code "\n;;Write your code under this comment, it will fill the blank.\n")
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-make-the-code-return-true-with-regular-expressions
                                                      (text
                                                        (p "Enter only " (bold "enough to fill in the blank")
                                                           ", do not retype the whole problem.")
                                                        (code "(= #_blank (apply str (re-seq #\"[A-Z]+\" \"bA1B3Ce \")))"))
                                                      (testing
                                                        (is (fills-the-blank? :_ (= :_ (apply str (re-seq #"[A-Z]+" "bA1B3Ce "))))))))
                        'regular-expressions)


               (subject 'subj-intro-to-reduce
                        "Intro to Reduce"

                        (learn
                          (text
                            (p
                              (str "Reduce takes a 2 argument function and an optional starting value."
                                   "It then applies the function to the first 2 items in the sequence (or the starting value and the first element of the sequence)."
                                   " In the next iteration the function will be called on the previous return value and the next item from the sequence,"
                                   " thus reducing the entire collection to one value."
                                   " Don't worry, it's not as complicated as it sounds."))))

                        (instruction 'ins-intro-to-reduce
                                     (run-pre-tests? false)
                                     (initial-code "\n;;Write your code under this comment, it will fill the blank.\n")
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-make-the-code-return-true-with-reduce
                                                      (text
                                                        (p "Enter only " (bold "enough to fill in the blank")
                                                           ", do not retype the whole problem.")
                                                        (code "(= 15 (reduce #_blank [1 2 3 4 5]))")
                                                        (code "(=  0 (reduce #_blank []))")
                                                        (code "(=  6 (reduce #_blank 1 [2 3]))"))
                                                      (testing
                                                        (is (fills-the-blank? :_ (= 15 (reduce :_ [1 2 3 4 5]))))
                                                        (is (fills-the-blank? :_ (= 0 (reduce :_ []))))
                                                        (is (fills-the-blank? :_ (= 6 (reduce :_ 1 [2 3])))))))
                        'intro-to-reduce)


               (subject 'subj-simple-recursion
                        "Simple Recursion"

                        (learn
                          (text
                            (p "A recursive function is a function which calls itself. This is one of the fundamental techniques used in functional programming.")))

                        (instruction 'ins-simple-recursion
                                     (run-pre-tests? false)
                                     (initial-code "\n;;Write your code under this comment, it will fill the blank.\n")
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-make-the-code-return-true-with-simple-recursion
                                                      (text
                                                        (p "Enter only " (bold "enough to fill in the blank")
                                                           ", do not retype the whole problem.")
                                                        (code "(= #_blank ((fn foo [x] (when (> x 0) (conj (foo (dec x)) x))) 5))"))
                                                      (testing
                                                        (is (fills-the-blank? :_ (= :_ ((fn foo [x] (when (> x 0) (conj (foo (dec x)) x))) 5)))))))
                        'simple-recursion)


               (subject 'subj-rearranging-code
                        "Simple Recursion"

                        (learn
                          (text
                            (p "The " (hi "->")
                               (str " macro threads an expression x through a variable number of forms."
                                    "First, x is inserted as the second item in the first form, making a list of it if it is not a list already."))

                            (p (str "Then the first form is inserted as the second item in the second form, making a list of that form if necessary."
                                    "This process continues for all the forms. Using -> can sometimes make your code more readable."))))

                        (instruction 'ins-rearranging-code
                                     (run-pre-tests? false)
                                     (initial-code "\n;;Write your code under this comment, it will fill the blank.\n")
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-make-the-code-return-true-with-rearranging-code
                                                      (text
                                                        (p "Enter only " (bold "enough to fill in the blank")
                                                           ", do not retype the whole problem.")
                                                        (code (str "(= (#_blank (sort (rest (reverse [2 5 4 1 3 6]))))\n"
                                                                   "   (-> [2 5 4 1 3 6] (reverse) (rest) (sort) (#_blank))\n   5)")))
                                                      (testing
                                                        (is (fills-the-blank? :_ (= (:_ (sort (rest (reverse [2 5 4 1 3 6]))))
                                                                                    (-> [2 5 4 1 3 6] (reverse) (rest) (sort) (:_))
                                                                                    5))))))
                        'rearranging-code)


               (subject 'subj-recurring-theme
                        "Recurring Theme"

                        (learn
                          (text
                            (p (str "Clojure only has one non-stack-consuming looping construct: recur."
                                    "Either a function or a loop can be used as the recursion point."))

                            (p (str "Either way, recur rebinds the bindings of the recursion point to the values it is passed."
                                    "Recur must be called from the tail-position, and calling it elsewhere will result in an error."))))

                        (instruction 'ins-recurring-theme
                                     (run-pre-tests? false)
                                     (initial-code "\n;;Write your code under this comment, it will fill the blank.\n")
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-make-the-code-return-true-with-recurring-theme
                                                      (text
                                                        (p "Enter only " (bold "enough to fill in the blank")
                                                           ", do not retype the whole problem.")
                                                        (code (str "(= #_blank\n  (loop [x 5\n         result []]\n    (if (> x 0)\n"
                                                                   "      (recur (dec x) (conj result (+ 2 x)))\n      result)))")))
                                                      (testing
                                                        (is (fills-the-blank? :_ (= :_
                                                                                    (loop [x      5
                                                                                           result []]
                                                                                      (if (> x 0)
                                                                                        (recur (dec x) (conj result (+ 2 x)))
                                                                                        result))))))))
                        'recurring-theme)


               (subject 'subj-rearranging-code-2
                        "Rearranging Code: ->>"

                        (learn
                          (text
                            (p "The " (hi "->>")
                               (str " macro threads an expression x through a variable number of forms."
                                    "First, x is inserted as the last item in the first form, making a list of it if it is not a list already."))

                            (p (str "Then the first form is inserted as the last item in the second form, making a list of that form if necessary."
                                    "This process continues for all the forms. Using ->> can sometimes make your code more readable."))))

                        (instruction 'ins-rearranging-code-2
                                     (run-pre-tests? false)
                                     (initial-code "\n;;Write your code under this comment, it will fill the blank.\n")
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-make-the-code-return-true-with-rearranging-code-2
                                                      (text
                                                        (p "Enter only " (bold "enough to fill in the blank")
                                                           ", do not retype the whole problem.")
                                                        (code (str "(= (#_blank + (map inc (take 3 (drop 2 [2 5 4 1 3 6]))))\n"
                                                                   "   (->> [2 5 4 1 3 6] (drop 2) (take 3) (map inc) (#_blank))\n   11)")))
                                                      (testing
                                                        (is (fills-the-blank? :_ (= (:_ + (map inc (take 3 (drop 2 [2 5 4 1 3 6]))))
                                                                                    (->> [2 5 4 1 3 6] (drop 2) (take 3) (map inc) (:_ +))
                                                                                    11))))))
                        'rearranging-code-2)


               (subject 'subj-a-nil-key
                        "A nil key"

                        (learn
                          (text
                            (p "Write an anonymous function which, given a key and map, returns true "
                               (link "iff" "http://en.wikipedia.org/wiki/If_and_only_if")
                               " the map contains an entry with that key and its value is nil.")
                            (code ";Anonymous function example\n(fn [arg-1 arg-2] <function body>)")))

                        (instruction 'ins-a-nil-key
                                     (run-pre-tests? false)
                                     (initial-code "\n;;Write your code under this comment, it will fill the blank.\n")
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-make-the-code-return-true-with-a-nil-key
                                                      (text
                                                        (p "Enter only " (bold "enough to fill in the blank")
                                                           ", do not retype the whole problem.")
                                                        (code "(true?  (#_blank :a {:a nil :b 2}))")
                                                        (code "(false? (#_blank :b {:a nil :b 2}))")
                                                        (code "(false? (#_blank :c {:a nil :b 2}))"))
                                                      (testing
                                                        (is (fills-the-blank? :_ (true? (:_ :a {:a nil :b 2}))))
                                                        (is (fills-the-blank? :_ (false? (:_ :b {:a nil :b 2}))))
                                                        (is (fills-the-blank? :_ (false? (:_ :c {:a nil :b 2})))))))
                        'a-nil-key)


               (subject 'subj-for-the-win
                        "For the win"

                        (learn
                          (text
                            (p "Clojure's " (link "for" "http://clojuredocs.org/clojure_core/clojure.core/for")
                               " macro is a tremendously versatile mechanism for producing a sequence based on some other sequence(s).")
                            (p (str "It can take some time to understand how to use it properly,"
                                    " but that investment will be paid back with clear, concise sequence-wrangling later."
                                    " With that in mind, read over these for expressions and try to see how each of them produces the same result."))))

                        (instruction 'ins-for-the-win
                                     (run-pre-tests? false)
                                     (initial-code "\n;;Write your code under this comment, it will fill the blank.\n")
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-make-the-code-return-true-with-for-the-win
                                                      (text
                                                        (p "Enter only " (bold "enough to fill in the blank")
                                                           ", do not retype the whole problem.")
                                                        (code "(= #_blank (for [x (range 40)\n            :when (= 1 (rem x 4))]\n        x))")
                                                        (code "(= #_blank (for [x (iterate #(+ 4 %) 0)\n            :let [z (inc x)]\n            :while (< z 40)]\n        z))")
                                                        (code "(= #_blank (for [[x y] (partition 2 (range 20))]\n        (+ x y)))"))
                                                      (testing
                                                        (is (fills-the-blank? :_ (= :_ (for [x (range 40)
                                                                                             :when (= 1 (rem x 4))]
                                                                                         x))))
                                                        (is (fills-the-blank? :_ (= :_ (for [x (iterate #(+ 4 %) 0)
                                                                                             :let [z (inc x)]
                                                                                             :while (< z 40)]
                                                                                         z))))
                                                        (is (fills-the-blank? :_ (= :_ (for [[x y] (partition 2 (range 20))]
                                                                                         (+ x y))))))))
                        'for-the-win)


               (subject 'subj-logical-falsity-and-truth
                        "Logical falsity and truth"

                        (learn
                          (text
                            (p "In Clojure, only nil and false represent the values of logical falsity in conditional tests - anything else is logical truth.")))

                        (instruction 'ins-logical-falsity-and-truth
                                     (run-pre-tests? false)
                                     (initial-code "\n;;Write your code under this comment, it will fill the blank.\n")
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-make-the-code-return-true-with-logical-falsity-and-truth
                                                      (text
                                                        (p "Enter only " (bold "enough to fill in the blank")
                                                           ", do not retype the whole problem.")
                                                        (code "(= #_blank (if-not false 1 0))")
                                                        (code "(= #_blank (if-not nil 1 0))")
                                                        (code "(= #_blank (if true 1 0))")
                                                        (code "(= #_blank (if [] 1 0))")
                                                        (code "(= #_blank (if [0] 1 0))")
                                                        (code "(= #_blank (if 0 1 0))")
                                                        (code "(= #_blank (if 1 1 0))"))
                                                      (testing
                                                        (is (fills-the-blank? :_ (= :_ (if-not false 1 0))))
                                                        (is (fills-the-blank? :_ (= :_ (if-not nil 1 0))))
                                                        (is (fills-the-blank? :_ (= :_ (if true 1 0))))
                                                        (is (fills-the-blank? :_ (= :_ (if [] 1 0))))
                                                        (is (fills-the-blank? :_ (= :_ (if [0] 1 0))))
                                                        (is (fills-the-blank? :_ (= :_ (if 0 1 0))))
                                                        (is (fills-the-blank? :_ (= :_ (if 1 1 0)))))))
                        'logical-falsity-and-truth)


               (subject 'subj-subset-and-superset
                        "Subset and Superset"

                        (learn
                          (text
                            (p "Set A is a subset of set B, or equivalently B is a superset of A, if A is " (bold "contained")
                               " inside B. A and B may coincide.")))

                        (instruction 'ins-subset-and-superset
                                     (run-pre-tests? false)
                                     (initial-code "\n;;Write your code under this comment, it will fill the blank.\n")
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-make-the-code-return-true-with-subset-and-superset
                                                      (text
                                                        (p "Enter only " (bold "enough to fill in the blank")
                                                           ", do not retype the whole problem.")
                                                        (code "(clojure.set/superset? #_blank #{2})")
                                                        (code "(clojure.set/subset? #{1} #_blank)")
                                                        (code "(clojure.set/superset? #_blank #{1 2})")
                                                        (code "(clojure.set/subset? #{1 2} #_blank)"))
                                                      (testing
                                                        (is (fills-the-blank? :_ (clojure.set/superset? :_ #{2})))
                                                        (is (fills-the-blank? :_ (clojure.set/subset? #{1} :_)))
                                                        (is (fills-the-blank? :_ (clojure.set/superset? :_ #{1 2})))
                                                        (is (fills-the-blank? :_ (clojure.set/subset? #{1 2} :_))))))
                        'subset-and-superset)


               (subject 'subj-intro-to-destructuring
                        "Intro to Destructuring"

                        (learn
                          (text
                            (p "Let bindings and function parameter lists support destructuring.")))

                        (instruction 'ins-intro-to-destructuring
                                     (run-pre-tests? false)
                                     (initial-code "\n;;Write your code under this comment, it will fill the blank.\n")
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-make-the-code-return-true-with-intro-to-destructuring
                                                      (text
                                                        (p "Enter only " (bold "enough to fill in the blank")
                                                           ", do not retype the whole problem.")
                                                        (code "(= (let [[a b c d e] [0 1 2 3 4]] [c e]) #_blank)"))
                                                      (testing
                                                        (is (fills-the-blank? :_ (= (let [[a b c d e] [0 1 2 3 4]] [c e]) :_))))))
                        'intro-to-destructuring)


               (subject 'subj-map-defaults
                        "Map Defaults"

                        (learn
                          (text
                            (p "When retrieving values from a map, you can specify default values in case the key is not found:")
                            (code (= 2 (:foo {:bar 0, :baz 1} 2)))
                            (p (str "However, what if you want the map itself to contain the default values?"
                                    " Write an anonymous function which takes a default value and a sequence of keys and constructs a map."))
                            (code ";Anonymous function example\n(fn [arg-1 arg-2] <function body>)")))

                        (instruction 'ins-map-defaults
                                     (run-pre-tests? false)
                                     (initial-code "\n;;Write your code under this comment, it will fill the blank.\n")
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-make-the-code-return-true-with-map-defaults
                                                      (text
                                                        (p "Enter only " (bold "enough to fill in the blank")
                                                           ", do not retype the whole problem.")
                                                        (code "(= (#_blank 0 [:a :b :c]) {:a 0 :b 0 :c 0})")
                                                        (code "(= (#_blank \"x\" [1 2 3]) {1 \"x\" 2 \"x\" 3 \"x\"})")
                                                        (code "(= (#_blank [:a :b] [:foo :bar]) {:foo [:a :b] :bar [:a :b]})"))
                                                      (testing
                                                        (is (fills-the-blank? :_ (= (:_ 0 [:a :b :c]) {:a 0 :b 0 :c 0})))
                                                        (is (fills-the-blank? :_ (= (:_ "x" [1 2 3]) {1 "x" 2 "x" 3 "x"})))
                                                        (is (fills-the-blank? :_ (= (:_ [:a :b] [:foo :bar]) {:foo [:a :b] :bar [:a :b]}))))))
                        'map-defaults)


               (subject 'subj-intro-to-some
                        "Intro to some"

                        (learn
                          (text
                            (p "The some function takes a predicate function and a collection. It returns the first logical true value of (predicate x) where x is an item in the collection.")))

                        (instruction 'ins-intro-to-some
                                     (run-pre-tests? false)
                                     (initial-code "\n;;Write your code under this comment, it will fill the blank.\n")
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-intro-to-some
                                                      (text
                                                        (p "Enter only " (bold "enough to fill in the blank")
                                                           ", do not retype the whole problem.")
                                                        (code "(= #_blank (some #{2 7 6} [5 6 7 8]))")
                                                        (code "(= #_blank (some #(when (even? %) %) [5 6 7 8]))"))
                                                      (testing
                                                        (is (fills-the-blank? :_ (= :_ (some #{2 7 6} [5 6 7 8]))))
                                                        (is (fills-the-blank? :_ (= :_ (some #(when (even? %) %) [5 6 7 8])))))))
                        'intro-to-some)))


(defcoursetest my-test-1
               [ch-problems sub-ch-elementary subj-nothing-but-the-truth ins-nothing-but-the-truth sub-ins-make-the-code-return-true]
               true)


(defcoursetest my-test-2
               [ch-problems sub-ch-elementary subj-simple-math ins-simple-math sub-ins-make-the-code-return-true-with-4]
               4)


(defcoursetest my-test-3
               [ch-problems sub-ch-elementary subj-intro-to-strings ins-intro-to-strings sub-ins-make-the-code-return-true-with-str-uppercase]
               "HELLO WORLD")


(defcoursetest my-test-4
               [ch-problems sub-ch-elementary subj-intro-to-lists ins-intro-to-lists sub-ins-make-the-code-return-true-with-list]
               (list :a :b :c))


(defcoursetest my-test-5
               [ch-problems sub-ch-elementary subj-lists-conj ins-lists-conj sub-ins-make-the-code-return-true-with-lists-conj]
               '(1 2 3 4))


(defcoursetest my-test-6
               [ch-problems sub-ch-elementary subj-intro-to-vectors ins-intro-to-vectors sub-ins-make-the-code-return-true-with-vector]
               [:a :b :c])


(defcoursetest my-test-7
               [ch-problems sub-ch-elementary subj-vector-conj ins-intro-to-vectors sub-ins-make-the-code-return-true-with-vectors-conj]
               [1 2 3 4])


(defcoursetest my-test-8
               [ch-problems sub-ch-elementary subj-intro-to-sets ins-intro-to-sets sub-ins-make-the-code-return-true-with-sets]
               #{:a :b :c :d})


(defcoursetest my-test-9
               [ch-problems sub-ch-elementary subj-sets-conj ins-sets-conj sub-ins-make-the-code-return-true-with-sets-conj]
               2)


(defcoursetest my-test-10
               [ch-problems sub-ch-elementary subj-intro-to-maps ins-sets-conj sub-ins-make-the-code-return-true-with-maps]
               20)


(defcoursetest my-test-11
               [ch-problems sub-ch-elementary subj-maps-conj ins-maps-conj sub-ins-make-the-code-return-true-with-map-conj]
               [:b 2])


(defcoursetest my-test-12
               [ch-problems sub-ch-elementary subj-intro-to-seqs ins-intro-to-seqs sub-ins-make-the-code-return-true-with-seq-first]
               3)


(defcoursetest my-test-13
               [ch-problems sub-ch-elementary subj-sequences-rest ins-sequences-rest sub-ins-make-the-code-return-true-with-sequences-rest]
               [20 30 40])


(defcoursetest my-test-14
               [ch-problems sub-ch-elementary subj-intro-to-functions ins-intro-to-functions sub-ins-make-the-code-return-true-with-fn-1]
               8)


(defcoursetest my-test-15
               [ch-problems sub-ch-elementary subj-double-down ins-double-down sub-ins-make-the-code-return-true-with-double-down-1]
               (partial * 2))


(defcoursetest my-test-16
               [ch-problems sub-ch-elementary subj-hello-world ins-hello-world sub-ins-make-the-code-return-true-with-hello-world]
               (fn [x] (str "Hello, " x "!")))


(defcoursetest my-test-17
               [ch-problems sub-ch-elementary subj-sequences-map ins-sequences-map sub-ins-make-the-code-return-true-with-sequences-map]
               '(6 7 8))


(defcoursetest my-test-18
               [ch-problems sub-ch-elementary subj-sequences-filter ins-sequences-filter sub-ins-make-the-code-return-true-with-sequences-filter]
               '(6 7))


(defcoursetest my-test-19
               [ch-problems sub-ch-elementary subj-local-bindings ins-local-bindings sub-ins-make-the-code-return-true-with-local-bindings]
               7)


(defcoursetest my-test-20
               [ch-problems sub-ch-elementary subj-regular-expressions ins-regular-expressions sub-ins-make-the-code-return-true-with-regular-expressions]
               "ABC")


(defcoursetest my-test-21
               [ch-problems sub-ch-elementary subj-intro-to-reduce ins-intro-to-reduce sub-ins-make-the-code-return-true-with-reduce]
               (fn [& args]
                 (if (= 0 (count args))
                   0
                   (+ (first args) (nth args 1)))))


(defcoursetest my-test-22
               [ch-problems sub-ch-elementary subj-simple-recursion ins-simple-recursion sub-ins-make-the-code-return-true-with-simple-recursion]
               '(5 4 3 2 1))


(defcoursetest my-test-23
               [ch-problems sub-ch-elementary subj-rearranging-code ins-rearranging-code sub-ins-make-the-code-return-true-with-rearranging-code]
               count)


(defcoursetest my-test-24
               [ch-problems sub-ch-elementary subj-recurring-theme ins-recurring-theme sub-ins-make-the-code-return-true-with-recurring-theme]
               '(7 6 5 4 3))


(defcoursetest my-test-25
               [ch-problems sub-ch-elementary subj-rearranging-code-2 ins-rearranging-code-2 sub-ins-make-the-code-return-true-with-rearranging-code-2]
               reduce)



(defcoursetest my-test-26
               [ch-problems sub-ch-elementary subj-a-nil-key ins-a-nil-key sub-ins-make-the-code-return-true-with-a-nil-key]
               (fn [v m]
                 (and (= (m v) nil) (contains? m v))))


(defcoursetest my-test-27
               [ch-problems sub-ch-elementary subj-for-the-win ins-for-the-win sub-ins-make-the-code-return-true-with-for-the-win]
               '(1 5 9 13 17 21 25 29 33 37))



(defcoursetest my-test-28
               [ch-problems sub-ch-elementary subj-logical-falsity-and-truth ins-logical-falsity-and-truth sub-ins-make-the-code-return-true-with-logical-falsity-and-truth]
               1)



(defcoursetest my-test-29
               [ch-problems sub-ch-elementary subj-subset-and-superset ins-subset-and-superset sub-ins-make-the-code-return-true-with-subset-and-superset]
               #{1 2 3})



(defcoursetest my-test-30
               [ch-problems sub-ch-elementary subj-intro-to-destructuring ins-intro-to-destructuring sub-ins-make-the-code-return-true-with-intro-to-destructuring]
               [2 4])


(defcoursetest my-test-31
               [ch-problems sub-ch-elementary subj-map-defaults ins-map-defaults sub-ins-make-the-code-return-true-with-map-defaults]
               (fn [def-val seq-key]
                 (into (hash-map) (map #(assoc {} % def-val) seq-key))))


(defcoursetest my-test-32
               [ch-problems sub-ch-elementary subj-intro-to-some ins-intro-to-some sub-ins-intro-to-some]
               6)