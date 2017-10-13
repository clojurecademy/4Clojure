(defproject for-clojure "0.1.0-SNAPSHOT"

  :description "FIXME: write description"

  :url "http://example.com/FIXME"

  :license {:name "MIT License"
            :url  "https://opensource.org/licenses/MIT"}

  :dependencies [[org.clojure/clojure "1.8.0"]
                 [clojurecademy "0.1.0"]]

  :plugins [[lein-clojurecademy "0.1.55"]]

  :eval-in :leiningen

  :clojurecademy {:course-map    clj.course/course-map
                  :helper-fns-ns clj.helpers}
  )