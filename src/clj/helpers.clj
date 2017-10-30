(ns clj.helpers
  (:require [clojure.string :as str]))


(defn let-used?
  [code]
  (and (= 'let (first code))
       (vector? (second code))))


(defn if-used?
  [codes]
  ((complement not-any?) #(= % 'if) (tree-seq seq? identity codes)))
