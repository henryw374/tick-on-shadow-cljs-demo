*Note*: This demo is only relevant for Tick versions 0.4.24-alpha and earlier. For versions 0.4.25-alpha and later, just add the tick dependency and it will just work. Note that Tick versions 0.4.25-alpha and up require minimum Clojurescript version of 1.10.741

# Demo tick (versions up to 0.4.24-alpha) on shadow-cljs 

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
