(ns clj.helpers
  (:require [clojure.string :as str]))


(defn let-used?
  [code]
  (and (= 'let (first code))
       (vector? (second code))))


(defn if-used?
  [codes]
  ((complement not-any?) #(= (first %) 'if) (filter list? codes)))


(defn str-join-used?
  [codes]
  ((complement not-any?) (fn [code]
                           (and (= 'str/join (first code))
                                (vector? (second code))
                                (= 2 (count (second code))))) (filter list? codes)))