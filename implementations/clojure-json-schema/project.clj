(defproject bowtie-json-schema "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.11.0"]
                 [org.clojure/data.json "2.4.0"]
                 [org.clojure/tools.namespace "1.3.0"]
                 [luposlip/json-schema "0.3.4"]]
  :main bowtie-json-schema.core
  :profiles {:uberjar {:aot :all}})
