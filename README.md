# Demo tick on shadow-cljs 

tick depends on cljsjs libraries and shadow-cljs cannot use these. So to get around that
this demo:

* depends on the underlying npm packages via package.json           
* depends on shadow-cljsjs

Note that `shadow-cljsjs` is the only solution untion https://clojure.atlassian.net/browse/CLJS-3138
is fixed since the js-joda locale package has a scoped name.

## Usage 

Clone this repo and run

`npm i && npx shadow-cljs node-repl`

at the repl

`(require '[tick.alpha.api :as t])`

`(t/today)`
