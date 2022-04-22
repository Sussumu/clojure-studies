(+ 1 2)

(+ 3/4 2/4) ; ratios are a thing, evaluating this returns 5/4

"string" ; ofc

; (7 + 3 * 4 + 5) / 10
(/ (+ 7 (* 3 4) 5) 10)

(def mystring "test 123")

(defn log [x]
  (println x))

(log mystring)

(defn multipleLog [x & optional]
  (println x optional))

(multipleLog "tada")
(multipleLog "obligatory" "optional1" "optional2")

;; apply invokes a function with zero or more fixed arguments and
;; draws the rest of them from a final sequence

(apply multipleLog "hey" '("hello" "world")) ; ' stops evaluation

;; 1) Define a function greet that takes no arguments and prints "Hello". 
;; Replace the ___ with the implementation: (defn greet [] _)

(defn greet []
  (println "Hello"))

(greet)

;; 2) Redefine greet using def, first with the fn special form and then 
;; with the #() reader macro.

(def greet (fn [])
  (println "Hey"))

(greet)

(def greet #(println "Hola"))

(greet)

;; 3) Define a function greeting which:
;;    Given no arguments, returns "Hello, World!"
;;    Given one argument x, returns "Hello, x!"
;;    Given two arguments x and y, returns "x, y!"

(defn greeting []
  (println "Hello, World!"))

(defn greeting [x]
  (println (str "Hello, " x)))

(defn greeting [x y]
  (println (str x y "!")))

(greeting "Hi, " "Kato")

;; 4) Define a function do-nothing which takes a single argument x 
;; and returns it, unchanged.

(defn do-nothing [x] x)

(do-nothing 123)

