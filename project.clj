(defproject net.clojars.stylitics-graal/ring "1.12.2-patched-graal"
  :description "A Clojure web applications library."
  :url "https://github.com/ring-clojure/ring"
  :license {:name "The MIT License"
            :url "http://opensource.org/licenses/MIT"}
  ;; don't know if i need to deploy both ring and ring-core to stylitics-graal
  :deploy-repositories [["clojars" {:url "https://repo.clojars.org"
                                    :username :env/clojars_username
                                    :password :env/clojars_password
                                    :sign-releases false}]]
  :dependencies [[ring/ring-core "1.12.2-patched-graal"] ;; unsure
                 [ring/ring-devel "1.12.2"]
                 [ring/ring-jetty-adapter "1.12.2"]
                 [org.ring-clojure/ring-jakarta-servlet "1.12.2"]]
  :plugins [[lein-sub "0.3.0"]
            [lein-codox "0.10.8"]]
  :sub ["ring-core"
        "ring-devel"
        "ring-jetty-adapter"
        "ring-servlet"
        "ring-jakarta-servlet"]
  :codox {:output-path "codox"
          :source-uri "http://github.com/ring-clojure/ring/blob/{version}/{filepath}#L{line}"
          :source-paths ["ring-core/src"
                         "ring-devel/src"
                         "ring-jetty-adapter/src"
                         "ring-servlet/src"
                         "ring-jakarta-servlet/src"
                         "ring-websocket-protocols/src"]}
  :aliases {"test"     ["sub" "test"]
            "test-all" ["sub" "test-all"]
            "bench"    ["sub" "-s" "ring-bench" "run"]
            "codox"    ["with-profile" "+codox" "codox"]}
  :profiles
  {:codox {:dependencies [[javax.servlet/javax.servlet-api "3.1.0"]]}})
