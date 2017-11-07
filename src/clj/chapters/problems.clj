(ns clj.chapters.problems
  (:require [clojurecademy.dsl.core :refer :all]
            [clj.sub-chapters.elementary :refer [sub-ch-elementary]]
            [clj.sub-chapters.easy :refer [sub-ch-easy]]
            [clj.sub-chapters.medium :refer [sub-ch-medium]]))


(def problems
  (chapter 'ch-problems
           "Problems"
           sub-ch-elementary
           sub-ch-easy
           sub-ch-medium))

