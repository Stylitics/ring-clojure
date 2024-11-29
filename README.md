Relevant to https://www.notion.so/stylitics/Graaling-widget-api-943c84d186e94d0eaeba6bb7eb6757e8

The instructions for building a patched version of reitit are below. We need reitit to use a patched version of ring-core.

- Clone Stylitics’ fork: https://github.com/Stylitics/ring-clojure/ and `lein install` in ring-clojure/ring-core. This installs `ring/ring-core “1.12.2-patched-graal”`  which is [this PR](https://github.com/ring-clojure/ring/pull/447) on top of ring’s master.
    
- Clone Stylitics’ fork: https://github.com/Stylitics/reitit, and run `lein install` in reitit/modules/reitit-ring and `lein install` in reitit/modules/reitit, in that order. clj-widget-api uses the lib `metosin/reitit "0.7.1-patched-graal”` in the draft omnibus PR https://github.com/Stylitics/clj-widget-api/pull/662, so we lein install both reitit-ring and the parent `reitit`, so we can use all reitit’s libs.

To use the patched reitit, include it [from clojars](https://clojars.org/net.clojars.stylitics-graal/reitit). To update it ask Matt or another developer for the deploy keys and username and password. Once you have them the command is
```shell
CLOJARS_USERNAME=stylitics-graal CLOJARS_PASSWORD=the_password lein deploy clojars
```
I believe we only ring-core and reitit (not reitit-parent) on clojars, but I don't know how to delete things from clojars.



# Ring [![Build Status](https://github.com/ring-clojure/ring/actions/workflows/test.yml/badge.svg)](https://github.com/ring-clojure/ring/actions/workflows/test.yml)

Ring is a Clojure web applications library inspired by Python's WSGI
and Ruby's Rack. By abstracting the details of HTTP into a simple,
unified API, Ring allows web applications to be constructed of modular
components that can be shared among a variety of applications, web
servers, and web frameworks.

The [SPEC.md][1] file at the root of this distribution provides a
complete description of the Ring interface. The [Wiki][2] contains
more in-depth documentation on how to use Ring.

[1]: https://github.com/ring-clojure/ring/blob/master/SPEC.md
[2]: https://github.com/ring-clojure/ring/wiki

## Libraries

* `ring/ring` - meta-package containing all relevant dependencies
* `ring/ring-core` - core functions and middleware for Ring handlers,
  requests and responses
* `org.ring-clojure/ring-core-protocols` - contains only the protocols
  necessary for building Ring responses
* `org.ring-clojure/ring-websocket-protocols` - contains only the protocols
  necessary for WebSockets
* `ring/ring-devel` - functions for developing and debugging Ring
  applications
* `ring/ring-servlet` - construct legacy Java Servlets (≤ 4.0) from Ring
  handlers
* `org.ring-clojure/ring-jakarta-servlet` construct
  [Jakarta Servlets][3] (≥ 5.0) from Ring handlers
* `ring/ring-jetty-adapter` - a Ring adapter that uses an embedded
  [Jetty][4] web server

[3]: https://projects.eclipse.org/projects/ee4j.servlet
[4]: https://eclipse.dev/jetty/

## Installation

To include one of the above libraries, for instance `ring-core`, add
the following dependency to your `deps.edn` file:

    ring/ring-core {:mvn/version "1.12.2"}

Or to your Leiningen project file:

    [ring/ring-core "1.12.2"]

## Documentation

* [Wiki](https://github.com/ring-clojure/ring/wiki)
* [API docs](https://ring-clojure.github.io/ring/)

## Contributing

Please read [CONTRIBUTING.md][5] before submitting a pull request.

[5]: https://github.com/ring-clojure/ring/blob/master/CONTRIBUTING.md

## Thanks

This project borrows heavily from Ruby's Rack and Python's WSGI;
thanks to those communities for their work. Thanks also go to the many
individuals who have contributed to Ring's code and documentation over
the years.

## License

Copyright © 2009-2024 Mark McGranaghan, James Reeves & contributors.

Released under the MIT license.
