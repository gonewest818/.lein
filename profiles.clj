{:user
  {:plugins
   [[lein-pprint "1.3.2"      :exclusions [org.clojure/clojure]]
    [jonase/eastwood "0.3.10" :exclusions [org.clojure/clojure]]
    [lein-ancient "0.6.15"    :exclusions [org.clojure/clojure]]
    [lein-bikeshed "0.5.2"    :exclusions [org.clojure/clojure]]
    [lein-kibit "0.1.8"       :exclusions [org.clojure/clojure
                                           org.clojure/tools.cli
                                           org.clojure/tools.namespace]]]

   :repl-options
   {:init (do (set! *print-length* 500)
              (set! *print-level* 10))}

   :dependencies
   [[org.clojure/tools.trace "0.7.10"]
    [hashp "0.1.1"]
    [criterium "0.4.5"]]

   :injections
   [(require 'hashp.core)]}}

