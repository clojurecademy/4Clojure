(ns clj.chapters.problems
  (:require [clojurecademy.dsl.core :refer :all]
            [clj.sub-chapters.elementary :refer [sub-ch-elementary]]
            [clj.sub-chapters.easy :refer [sub-ch-easy]]))


(def problems
  (chapter 'ch-problems
           "Problems"
           sub-ch-elementary
           sub-ch-easy))

