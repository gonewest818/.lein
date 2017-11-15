{:user
  {:plugins
   [[lein-pprint "1.1.2"     :exclusions [org.clojure/clojure]]    
    [jonase/eastwood "0.2.5" :exclusions [org.clojure/clojure]]
    [lein-ancient "0.6.14"   :exclusions [org.clojure/clojure]]
    [lein-bikeshed "0.5.0"   :exclusions [org.clojure/clojure]]
    [lein-kibit "0.1.5"      :exclusions [org.clojure/clojure
                                          org.clojure/tools.cli
                                          org.clojure/tools.namespace]]]
   :repl-options
   {:init (do (set! *print-length* 500)
              (set! *print-level* 10))}
   :dependencies
   [[org.clojure/tools.trace "0.7.9"]]}

 :repl
 {:plugins
  [[cider/cider-nrepl "0.15.1"]]
  :dependencies
  [[org.clojure/tools.nrepl "0.2.13"]]}}
