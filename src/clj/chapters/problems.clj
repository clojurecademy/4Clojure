(ns clj.chapters.problems
  (:require [clojurecademy.dsl.core :refer :all]
            [data.sub-chapters.elementary :refer [sub-ch-elementary]]
            [data.sub-chapters.easy :refer [sub-ch-easy]]))


(def problems
  (chapter 'ch-problems
           "Problems"
           sub-ch-elementary
           sub-ch-easy))

