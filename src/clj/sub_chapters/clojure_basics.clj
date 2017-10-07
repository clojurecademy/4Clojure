(ns clj.sub-chapters.clojure-basics
  (:require [clojurecademy.dsl.core :refer :all]
            [clojurecademy.dsl.test :refer :all]))

(def sub-ch-clojure-basics
  (sub-chapter 'sub-ch-clojure-basics
               "Clojure Basics"

               (subject 'subj-what-is-clojure?
                        "What is Clojure?"

                        (learn
                          (text
                            (p "Clojure is a " (italic "dynamic") ", " (italic "general-purpose") " programming language,
                                          combining the approachability and interactive development of a scripting language with an efficient and robust infrastructure for "
                               (bold "multithreaded programming") ".")
                            (p "Clojure is a " (italic "compiled language") ", yet remains completely " (hi "dynamic") " – every feature supported by Clojure is supported at runtime.")
                            (p "Clojure is designed to be a hosted language, sharing the "
                               (hi "JVM type system") ", " (hi "GC") ", " (hi "threads") " etc. It compiles all functions to " (italic "JVM bytecode")
                               ". Clojure is a great Java library consumer, offering the dot-target-member notation for calls to Java.")
                            (p "It is a dialect of " (bold "Lisp programming language") " and has compilers that make it possible to be run on " (hi "Java") ", " (hi "JavaScript") " and "
                               (hi ".Net") " runtime environments.")
                            (p "Clojure shares with Lisp the " (hi "code-as-data") " philosophy" (link "(homoiconicity)" "https://en.wikipedia.org/wiki/Homoiconicity") " and a powerful "
                               (bold "macro system") ".")
                            (p "Clojure is predominantly a " (italic "functional programming language") ", and features a rich set of "
                               (italic "immutable, persistent data structures") "."))))


               (subject 'subj-about-clojure-syntax
                        "About Clojure Syntax"

                        (learn
                          (text
                            (p "The syntax for Clojure is like Lisp and is very simple: code is made up of expressions which are evaluated to some value.")
                            (p "Expressions are written as " (bold "lists") ", using " (bold "prefix notation") ".
                                                      The " (bold "first element") " in the list is the name of a " (bold "function") ", the name of a " (bold "macro") ", a "
                               (bold "lambda expression") " or the name of a " (bold "special operator") ". The remainder of the list are " (italic "the arguments") ".")
                            (p "In the following example " (hi "println") " is the function and " (hi "\"Hello, World\"") " is the argument")
                            (code (println "Hello, World"))
                            (p "Clojure has very elegant and simple syntax, Java equivalent would be like this: ")
                            (code "clike" "public class HelloWorld {\n    public static void main(String[] args) {\n        System.out.println(\"Hello, World\");\n    }\n}")))

                        (instruction 'ins-clojure-helloworld
                                     (run-pre-tests? false)
                                     (initial-code (println "Hello, World"))
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-clojure-syntax
                                                      (text (p "Please click the Run button to execute the code.")
                                                            (p "Note: You can use " (bold "Cmd/Ctrl/Alt") "(based on your OS) + " (bold "Enter") " combination to run the code."))
                                                      (testing (is (form-used? (println "Hello, World"))))))
                        'clojure-syntax)


               (subject 'subj-lets-do-some-math
                        "Let's do some math"
                        (learn (text (p "We are going to evaluate some math expressions please follow the instructions below.")))

                        (instruction 'ins-math-operations
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-addition
                                                      (text (p "We are going to add 3 numbers with " (hi "+") " operator.")
                                                            (p "Please copy and paste the following code and click Run.")
                                                            (code (+ 1 2 3)))
                                                      (testing (is (form-used? (+ 1 2 3)) "Apparently you did not copy and paste properly.Please check copy paste order.")))

                                     (sub-instruction 'sub-ins-print-addition
                                                      (text (p "We did not see anything in the " (hi "console") " because we did not " (bold "print") " the result out.")
                                                            (p "Please also copy and paste the following code under the previous code then we will see the result.")
                                                            (code (println (+ 1 2 3))))
                                                      (testing (is (form-used? (println (+ 1 2 3))) "Apparently you did not copy and paste properly.Please check copy paste order.")))

                                     (sub-instruction 'sub-ins-nested-expressions
                                                      (text (p "We can construct nested structures like this")
                                                            (code (+ 5 (* 5 (- 7 2 1))))
                                                            (p "Please print this code under the previous code that prints: " (hi "(+ 1 2 3)")))
                                                      (testing (is (form-used? (println (+ 5 (* 5 (- 7 2 1)))))
                                                                   "Apparently you did not copy and paste properly.Please check copy paste order."))))
                        'math-operations)


               (subject 'subj-using-let
                        "Using let function"

                        (learn
                          (text
                            (p "When you want some lexically-scoped named values to use in a section of your code, you can use the " (hi "let") " expression")
                            (code "(let [width     10\n      height    20\n      thickness 2]\n  (println \"hello from inside the `let`.\")\n  (* width height thickness))")
                            (p "The first thing inside the let is a binding " (hi "vector")
                               ". In it, you specify the local names you'd like to make available inside the let, along with their values.")
                            (p "These local names are symbols that refer directly to the values you set them to.")
                            (p "You can " (bold "re-set") " the symbols in the binding vector multiple times (building it up into the value you need),
                                                       if you find it useful here is the example which returns 5.")
                            (code "(let [x 2\n      x (* x x)\n      x (+ x 1)]\n  x)")))

                        (instruction 'ins-using-let
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :only-use-one-fn? true)

                                     (sub-instruction 'sub-ins-write-some-let
                                                      (text (p "Write some " (hi "let") " function example."))
                                                      (testing (is (let-used? (first (all-forms))) "Apparently you did not use let function."))))
                        'let-fn-example)


               (subject 'subj-scalars
                        "Scalars"

                        (learn
                          (text
                            (p "Clojure has support for the following kinds of scalar values:" (hi "nil, true, false"))
                            (p (hi "nil") " is like Python's None, or Java's null. It's just another value. Incidentally,
                                      there's no \"undefined\" value in Clojure --- if you try to use a symbol which you haven't defined,
                                      then it's undefined and the compiler will let you know about it.")))

                        (instruction 'ins-scalars
                                     (run-pre-tests? false)
                                     (initial-code (str "\n\n(println \"Scalars: \\n\")\n\n\n"
                                                        "(println \"Type of 1 is: \" (type 1) \"\\n\")\n\n\n"
                                                        "(println \"Type of 1.2 is: \" (type 1.2) \"\\n\")\n\n\n"
                                                        "(println \"Type of 1N is: \" (type 1N) \"\\n\")\n\n\n"
                                                        "(println \"Type of 1.5M is: \" (type 1.5M) \"\\n\")\n\n\n"
                                                        "(println \"Type of 1.2e4 is: \" (type 1.2e4) \"\\n\")\n\n\n"
                                                        "(println \"Type of 1/3 is: \" (type 1/3) \"\\n\")\n\n\n"
                                                        "(println \"Type of \\\"HEY!\\\" is: \" (type \"HEY!\") \"\\n\")\n\n\n"
                                                        "(println \"Type of \\\\a is: \" (type \\a) \"\\n\")\n\n\n"
                                                        "(println \"Type of :my-keyword is: \" (type :my-keyword) \"\\n\")\n\n\n"
                                                        "(println \"Type of 'my-s is: \" (type 'my-s) \"\\n\")"))
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-click-run
                                                      (text (p "Please click Run and see the results."))
                                                      (testing (is (true? true)))))
                        'scalars-example)


               (subject 'subj-data-structures
                        "Basic Data Structures"

                        (learn
                          (text
                            (p "There are functions for creating the various data structures without using the usual literal syntax.")
                            (code (str "(list 1 2 3)            ; ⇒ '(1 2 3)\n"
                                       "(vector 1 2 3)          ; ⇒ [1 2 3]\n"
                                       "(hash-map :a 1 :b 2)    ; ⇒ {:a 1 :b 2}\n"
                                       "(hash-set :a :b :c)     ; ⇒ #{:a :b :c}"))
                            (p "And there are various functions for converting between vectors, sets, lists and maps:")
                            (code (str "(def my-vec [1 2 3])\n(set my-vec)                   ; ⇒ #{1 2 3}\n\n(def my-list '(1 2 3))\n"
                                       "(vec my-list)                   ; ⇒ [1 2 3]\n\n"
                                       "(def my-map {:a 1 :b 2})\n(vec my-map)                   ; ⇒ [[:a 1] [:b 2]]\n"
                                       "(flatten (vec my-map))         ; ⇒ (:a 1 :b 2)\n"
                                       "(set my-map)                   ; ⇒ #{[:b 2] [:a 1]}\n\n"
                                       "(def my-set #{:a :b :c :d})\n(vec my-set)                   ; ⇒ [:a :c :b :d]\n\n"
                                       ";; And for fun:\n(zipmap [:a :b :c] [1 2 3])    ; ⇒ {:c 3 :b 2 :a 1}\n"
                                       "(apply hash-map [:a 1 :b 2])   ; ⇒ {:a 1 :b 2}"))))

                        (instruction 'ins-ds
                                     (run-pre-tests? false)
                                     (initial-code (str "\n;; Vectors\n(def v [:a :b :c])\n(nth v 1)             ; ⇒ :b\n"
                                                        "(v 1)                 ; ⇒ :b  (same)\n"
                                                        "(first v)             ; ⇒ :a\n(rest v)              ; ⇒ (:b :c)\n"
                                                        "(next v)              ; ⇒ (:b :c)\n"
                                                        "(last v)              ; ⇒ :c\n\n;; Lists\n;; Same as vectors, but can't index.\n\n"
                                                        ";; Maps\n(def m {:a 1 :b 2})\n(get m :a)            ; ⇒ 1\n"
                                                        "(m :a)                ; ⇒ 1       (same)\n(:a m)                ; ⇒ 1       (same!)\n"
                                                        "(get m :x 44)         ; ⇒ 44      (if no :x, 44 is the default)\n"
                                                        "(keys m)              ; ⇒ (:a :b)\n(vals m)              ; ⇒ (1 2)\n"
                                                        ";; Grab a key or a val from a single map entry:\n"
                                                        "(key (first m))       ; ⇒ :a\n(val (first m))       ; ⇒ 1\n"
                                                        ";; Of course, note that maps are not ordered.\n\n"
                                                        ";; Sets\n(def s #{:a :b :c})\n(s :a)                ; ⇒ :a\n(s :z)                ; ⇒ nil"))
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-print-code
                                                      (text (p "Add " (hi "println") " to print the results of codes and play with them couple of times to get the idea of what they are doing."))
                                                      (testing (is (fn-used? println) "Apparently you did not use println function."))))
                        'data-structures-example)


               (subject 'subj-data-structures-2
                        "Basic Data Structures"

                        (learn
                          (text
                            (p "Data structures in Clojure are actually " (hi "immutable") " --- you can't change them.For now,
                                      just note that data structures can't be mutated, but we can get a new modified copy of a data structure:")))

                        (instruction 'ins-ds
                                     (run-pre-tests? false)
                                     (initial-code (str "\n;; Vectors\n(def v   [:a :b :c])\n(def li '(:a :b :c))\n"
                                                        "(conj v  :d)          ; ⇒ [:a :b :c :d]\n"
                                                        "(conj li :d)          ; ⇒ (:d :a :b :c)\n\n"
                                                        "v   ; ⇒ is still [:a :b :c]\nli  ; ⇒ is still (:a :b :c)\n\n"
                                                        ";; Maps\n(def m {:a 1 :b 2})\n"
                                                        "(assoc m :c 3)        ; ⇒ {:a 1 :c 3 :b 2}\n(dissoc m :b)         ; ⇒ {:a 1}\n\n"
                                                        "m   ; ⇒ is still {:a 1 :b 2}\n\n"
                                                        ";; Sets\n(def s #{:a :b})\n(conj s :c)           ; ⇒ #{:a :c :b}\n"
                                                        "(disj s :a)           ; ⇒ #{:b}\n\ns   ; ⇒ is still #{:a :b}"))
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-print-code
                                                      (text (p "Add " (hi "println") " to print the results of codes and play with them couple of times to get the idea of what they are doing."))
                                                      (testing (is (fn-used? println) "Apparently you did not use println function."))))
                        'data-structures-example)


               (subject 'subj-strings
                        "Strings"
                        (learn
                          (text
                            (p "There are a number of functions for working with strings. Here are some examples of a few of them:")
                            (code (str "(str \"hi\" \"there\")\n;; ⇒ \"hithere\"\n\n(count \"hello\")\n"
                                       ";; ⇒ 5\n\n(require '[clojure.string :as str])\n"
                                       ";; ⇒ nil\n\n(str/split \"hello there\" #\" \")\n"
                                       ";; ⇒ [\"hello\" \"there\"]\n\n"
                                       "(str/join [\"hello\" \"there\"])\n"
                                       ";; ⇒ \"hellothere\"\n\n"
                                       "(str/replace \"hello there\" \"ll\" \"LL\")\n"
                                       ";; ⇒ \"heLLo there\""))
                            (p "Incidentally, since strings are sequential, any function that works on sequentials works on strings. For example:\n\n")
                            (code (str "(first \"hello\")\n;; ⇒ \\h\n\n"
                                       "(last \"hello\")\n;; ⇒ \\o\n\n"
                                       "(rest \"hello\")\n;; ⇒ (\\e \\l \\l \\o)\n\n"
                                       "(nth \"hello\" 1)\n;; ⇒ \\e\n\n"
                                       "(doseq [letter \"hello\"] (println letter))\n"
                                       ";; h\n;; e\n;; l\n;; l\n;; o\n;; ⇒ nil"))))

                        (instruction 'ins-strings
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-replace-ns-and-join-2-strings
                                                      (text (p "Replace ns(namespace) in the editor with the following ns to be able to use " (hi "clojure.string") " namespace:")
                                                            (code "(ns string-example\n  (:require [clojure.string :as str]))")
                                                            (p "Now join 2 strings with join function by using clojure string ns."))
                                                      (testing (is (str-join-used? (all-forms)) "Apparently you did not use str/join function properly."))))
                        'string-example)


               (subject 'subj-control-structures
                        "Control Structures"

                        (learn
                          (text
                            (p "Clojure has most of the usual control structures you'd expect to find, for example: "
                               (hi "if") ", " (hi "and") ", " (hi "or") ", and " (hi "cond") ".")
                            (p "Note that they are all expressions in Clojure, and evaluate to something. So, for example,
                                      this " (hi "if") "(special operator) expression:")
                            (code "(if motor-turning?\n  \"yes\"\n  \"no\")")
                            (p "Evaluates to either the value " (bold "yes") " or the value " (bold "no") ".\n\n
                                     Looping is handled by either using one of the various built-in functions such as "
                               (hi "map") ", " (hi "filter") ", " (hi "reduce") ", " (hi "for") ", etc., or else it's handled by manually using "
                               (hi "loop") " and using recursion. We'll get to these shortly.\n\n
                                        Incidentally, looping is something that is required far less in Clojure than in imperative languages like Python and Java.
                                         The functions that Clojure provides often makes looping unnecessary. For example, where in Python you might do something like this:")
                            (code "python" "specific_stuff = []\nfor i in my_items:\n    if is_what_i_want(i):\n        specific_stuff.append(i)")
                            (p "in Clojure you lose the loop and it becomes:\n\n")
                            (code (def specific-stuff (filter what-i-want? my-items)))
                            (p "In " (hi "(if <test> <then-this> <otherwise-this>)")
                               " (and in " (hi "and") ", " (hi "or") ", " (hi "cond") ", etc. expressions),
                                         Clojure checks if the " (hi "<test>") " evaluates to something that looks either true or false.
                                         Clojure takes a very simple approach here: " (hi "nil") " and " (hi "false") " are falsey; everything else is truthy.")
                            (p "This means that zero, the empty string, and empty core data structures are all true:\n\n")
                            (code "(if   0 :t :f)  ; ⇒ :t\n(if  \"\" :t :f)  ; ⇒ :t\n(if  [] :t :f)  ; ⇒ :t\n(if  {} :t :f)  ; ⇒ :t\n(if #{} :t :f)  ; ⇒ :t")
                            (p "If you want to check if one of those is empty, you could use the " (hi "empty?")
                               " function, though, the docs recommend using this idiom:\n\n")
                            (code "(if (seq my-stuff)\n  \"still has stuff left\"\n  \"all gone\")")
                            (p "You'll often check for equality using " (hi "=")
                               " (and likewise inequality using " (hi "not=") "), for example:\n\n")
                            (p (hi "=") " recursively checks equality of nested data structures
                                      (and considers lists and vectors containing the same values in the same order as equal), for example:")
                            (code "(= {:a  [1 2 3] :b #{:x :y} :c {:foo 1 :bar 2}}\n   {:a '(1 2 3) :b #{:y :x} :c {:bar 2 :foo 1}})\n;; ⇒ true")
                            (p "There's also a double-equals function " (hi "==") " that is more forgiving across various types of numbers:\n\n")
                            (code "(= 4 4.0)\n;; ⇒ false\n(== 4 4.0)\n;; ⇒ true")
                            (p "See the docs for " (link "=" "http://clojuredocs.org/clojure_core/clojure.core/=")
                               " and " (link "==" "http://clojuredocs.org/clojure_core/clojure.core/==") " for more info.\n\n")
                            (p (italic "Predicates") " are functions that take one or more arguments and return a true or false value.
                                     They usually are named with a trailing question mark, for example, " (hi "even?")
                               ", " (hi "odd?") ", " (hi "nil?") ", etc. Though, some names don't have the question mark,
                                         such as " (hi ">") ", " (hi ">=") ", " (hi "<") ", " (hi "<=") ", " (hi "=") ", " (hi "==") ", and " (hi "not=") ".")))

                        (instruction 'ins-control-structures
                                     (run-pre-tests? false)
                                     (initial-code :none)
                                     (rule :no-rule? true)
                                     (sub-instruction 'sub-ins-write-example-uses-if-fn
                                                      (text (p "Write your example code that uses if function."))
                                                      (testing (is (if-used? (all-forms)) "Apparently you did not use if function properly."))))
                        'control-structures)


               (subject 'subj-functions
                        "Functions"

                        (learn
                          (text
                            (code (def the-answer 42))
                            (p "The thing being defined here (behind the scenes) is officially called a Var. The symbol "
                               (hi "the-answer") " refers to that var which itself refers to the value 42:")
                            (p "the-answer (a symbol) → a var → 42 (a value).\n\n")
                            (p "When Clojure sees " (hi "the-answer") ", it automatically looks up the var,
                                      then from there finds and returns the value 42.\n\nRecall that locals don't involve vars at all: those symbols refer directly to their values.\n\n")
                            (p "You can create a function using " (hi "fn") ", and give it a name using " (hi "def") ":\n\n")
                            (code "(def my-func\n  (fn [a b]\n    (println \"adding them!\")\n    (+ a b)))")
                            (p "As you might guess, this actually creates the symbol " (hi "my-func") " which refers to a var which itself refers to the function (which is a value).
                                     Call it:")
                            (code "(my-func 10 20)   ; Returns/evaluates-to 30")
                            (p "But for creating " (bold "top-level") " functions, it's more convenient to use " (hi "defn") " (which uses def under the hood):\n\n")
                            (code "(defn my-func\n  \"Docstring goes here.\"\n  [a b]\n  (println \"adding them!\")\n  (+ a b))")
                            (p "The function parameters (" (hi "a") " and " (hi "b") ") are present in a vector (just like with the "
                               (hi "let") " expression, except we don't include values for them).")
                            (p "Inside " (hi "my-func") " you can do a sequence of operations if you like
                                     (for example, our " (hi "println") " call) --- just like in a " (hi "let")
                               " --- but the value of the last expression is what the function call as a whole will evaluate to.")
                            (p "Function definitions (using " (hi "defn") ") should only go at the " (bold "top-level") ".")
                            (p (bold "Use always ") (hi "defn") (bold " when you create a function."))
                            (p "Functions can return data structures instead of just scalars:\n\n")
                            (code "(defn foo\n  [x]\n  [x (+ x 2) (* x 2)])")
                            (p "and you can of course pass them data structures as well:")
                            (code "(defn bar\n  [x]\n  (println x))\n\n(bar {:a 1 :b 2})\n(bar [1 2 3])")
                            (p "To define a function to take, say, two or more arguments:\n\n")
                            (code "(defn baz\n  [a b & the-rest]\n  (println a)\n  (println b)\n  (println the-rest))")
                            (p "Any additional args you pass beyond the first two get packaged into a sequence assigned to "
                               (hi "the-rest") ". To have that function take zero or more arguments, change the parameter vector to just " (hi "[& the-rest]") ".")
                            (p "Let's say you like to write his functions in a top-down fashion:")
                            (code (str ";; BROKEN pseudocode(NOT ACTUAL CODE)\n\n(do-it)\n\n"
                                       "(defn do-it\n  []\n  (... (my-func-a ...)))\n\n"
                                       "(defn my-func-a\n  [...]\n  (... (my-func-b ...)))\n\n"
                                       "(defn my-func-b ...)"))
                            (p "but Clojure doesn't like that because it wants to have at least heard about a function before you write a call to it.
                                     To let Clojure know about a function's existence, use " (hi "declare"))
                            (code (str ";; pseudocode(NOT ACTUAL CODE)\n\n(declare do-it)\n\n(do-it)\n\n"
                                       "(declare my-func-a)\n\n(defn do-it\n  []\n(... (my-func-a ...)))\n\n"
                                       "(declare my-func-b)\n\n"
                                       "(defn my-func-a\n  [...]\n  (... (my-func-b ...)))\n\n(defn my-func-b ...)"))))

                        (instruction 'ins-functions
                                     (run-pre-tests? true)
                                     (initial-code :none)
                                     (rule :no-rule? true)

                                     (sub-instruction 'sub-ins-my-subtraction
                                                      (text (p "Write a function called " (hi "my-subtraction") " that takes 2 arguments and subtracts those 2 arguments."))
                                                      (testing (is (= 1 (my-subtraction 2 1)))
                                                               (is (= -2 (my-subtraction 3 5)))
                                                               (is (= 6 (my-subtraction 6 0)))))

                                     (sub-instruction 'sub-ins-my-multi
                                                      (text (p "Write a function called " (hi "my-multi") " that takes 2 arguments and multiplies those arguments."))
                                                      (testing (is (= 2 (my-multi 2 1)))
                                                               (is (= 0 (my-multi 3 0)))
                                                               (is (= -3 (my-multi 3 -1)))
                                                               (is (= 1 (my-multi 1 1)))
                                                               (is (= 4 (my-multi 2 2))))))
                        'functions)))


(defcoursetest my-test
               [ch-intro-to-clojure sub-ch-clojure-basics subj-about-clojure-syntax ins-clojure-helloworld sub-ins-clojure-syntax]
               (println "Hello, World"))


(defcoursetest my-test-2
               [ch-intro-to-clojure sub-ch-clojure-basics subj-lets-do-some-math ins-math-operations sub-ins-addition]
               (+ 1 2 3))


(defcoursetest my-test-4
               [ch-intro-to-clojure sub-ch-clojure-basics subj-lets-do-some-math ins-math-operations sub-ins-print-addition]
               (+ 1 2 3)
               (println (+ 1 2 3)))


(defcoursetest my-test-5
               [ch-intro-to-clojure sub-ch-clojure-basics subj-lets-do-some-math ins-math-operations sub-ins-nested-expressions]
               (+ 1 2 3)
               (println (+ 1 2 3))
               (println (+ 5 (* 5 (- 7 2 1)))))


(defcoursetest my-test-6
               [ch-intro-to-clojure sub-ch-clojure-basics subj-using-let ins-using-let sub-ins-write-some-let]
               (let [a 1]
                 a))


(defcoursetest my-test-7
               [ch-intro-to-clojure sub-ch-clojure-basics subj-scalars ins-scalars sub-ins-click-run]
               (let [a 1]
                 a))


(defcoursetest my-test-8
               [ch-intro-to-clojure sub-ch-clojure-basics subj-data-structures ins-ds sub-ins-print-code]
               (println (vec '(1 2 3))))


(defcoursetest my-test-9
               [ch-intro-to-clojure sub-ch-clojure-basics subj-data-structures-2 ins-ds sub-ins-print-code]
               (println (assoc {:a 1} :b 2)))


(defcoursetest my-test-10
               [ch-intro-to-clojure sub-ch-clojure-basics subj-strings ins-strings sub-ins-replace-ns-and-join-2-strings]
               (ns string-example
                 (:require [clojure.string :as str]))
               (str/join ["sel" "man"]))


(defcoursetest my-test-12
               [ch-intro-to-clojure sub-ch-clojure-basics subj-control-structures ins-control-structures sub-ins-write-example-uses-if-fn]
               (if (> 1 0)
                 (println "Love me")
                 (println "Hate me")))


(defcoursetest my-test-13
               [ch-intro-to-clojure sub-ch-clojure-basics subj-functions ins-functions sub-ins-my-subtraction]
               (defn my-subtraction
                 [a b]
                 (- a b)))


(defcoursetest my-test-14
               [ch-intro-to-clojure sub-ch-clojure-basics subj-functions ins-functions sub-ins-my-multi]
               (defn my-subtraction
                 [a b]
                 (- a b))
               (defn my-multi
                 [a b]
                 (* a b)))