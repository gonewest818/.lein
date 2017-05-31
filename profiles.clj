{:user
  {:plugins
   [
    ;; [cider/cider-nrepl "0.14.0"] ; nrepl auto-loaded by cider now
    [lein-pprint "1.1.2"]    
    [jonase/eastwood "0.2.3"]
    [lein-ancient "0.6.10"]
    [lein-bikeshed "0.4.1"]
    [lein-kibit "0.1.3" :exclusions [org.clojure/clojure
                                     org.clojure/tools.cli
                                     org.clojure/tools.namespace]]]
   :repl-options
   {:init (do (set! *print-length* 500)
              (set! *print-level* 10))}
   :dependencies
   [[org.clojure/tools.trace "0.7.9"]]}}
