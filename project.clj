(defproject com.clojars.olimsaidov/lein-wsimport "1.1.0"
  :description "JAX-WS import plugin for Clojure projects"
  :url "https://github.com/olimsaidov/lein-wsimport"
  :dependencies [[com.sun.xml.ws/jaxws-tools "2.2.8"]]
  :profiles { :dev { :dependencies [[midje "1.9.4"]]}}
  :plugins [[lein-midje "3.1.2"]
            [lein-clojars "0.9.1"]]
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :eval-in-leiningen true)
