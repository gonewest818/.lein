{:user
  {:plugins
   [[lein-pprint "1.2.0"     :exclusions [org.clojure/clojure]]
    [jonase/eastwood "0.2.5" :exclusions [org.clojure/clojure]]
    [lein-ancient "0.6.15"   :exclusions [org.clojure/clojure]]
    [lein-bikeshed "0.5.1"   :exclusions [org.clojure/clojure]]
    [lein-kibit "0.1.6"      :exclusions [org.clojure/clojure
                                          org.clojure/tools.cli
                                          org.clojure/tools.namespace]]
    [lein-sysutils "0.2.0"]]

   :repl-options
   {:init (do (set! *print-length* 500)
              (set! *print-level* 10))}

   :dependencies
   [[org.clojure/tools.trace "0.7.9"]
    [criterium "0.4.4"]]}

;;; note: CIDER injects its own dependencies these days
;; :repl
;; {:plugins
;;  [[cider/cider-nrepl "0.17.0-SNAPSHOT"]]
;;  :dependencies
;;  [[org.clojure/tools.nrepl "0.2.13"]]}

}
