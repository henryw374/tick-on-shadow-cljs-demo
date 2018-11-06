# Demo tick on shadow-cljs 

tick depends on cljsjs libraries and shadow-cljs cannot use these. So to get around that
this demo:

* depends on the underlying npm packages via package.json
* includes all of tick cljs dependencies in shadow-cljs.edn
* uses a little shim to create the namespaces that tick expects

## Usage 

Clone this repo and run

`npm i && shadow-cljs watch app`

## TODO

If someone knows of a better solution please get in touch