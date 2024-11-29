(defproject net.clojars.stylitics-graal/ring-core "1.12.2-patched-graal"
  :description "Ring core libraries."
  :url "https://github.com/ring-clojure/ring"
  :scm {:dir ".."}
  :license {:name "The MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :deploy-repositories [["clojars" {:url "https://repo.clojars.org"
                                    :username :env/clojars_username
                                    :password :env/clojars_password
                                    :sign-releases false}]]
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.ring-clojure/ring-core-protocols "1.12.2"]
                 [org.ring-clojure/ring-websocket-protocols "1.12.2"]
                 [ring/ring-codec "1.2.0"]
                 [commons-io "2.16.1"]
                 [org.apache.commons/commons-fileupload2-core "2.0.0-M1"]
                 [crypto-random "1.2.1"]
                 [crypto-equality "1.0.1"]]
  :aliases {"test-all" ["with-profile" "default:+1.10:+1.11:+1.12" "test"]}
  :profiles
  {:dev  {:dependencies [[clj-time "0.15.2"]]}
   :1.10 {:dependencies [[org.clojure/clojure "1.10.3"]]}
   :1.11 {:dependencies [[org.clojure/clojure "1.11.2"]]}
   :1.12 {:dependencies [[org.clojure/clojure "1.12.0-alpha9"]]}})
