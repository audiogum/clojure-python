(defproject audiogum/clojure-python "0.4.2-1-SNAPSHOT"
  :description "Improve seamlessness of Clojure Jython interop."
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.python/jython-standalone "2.7.1"]]
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :profiles {:dev {:dependencies [[midje "1.8.3"]]}}
  :plugins [[lein-midje "2.0.0"]])
