(ns app.core
  (:require [tick.alpha.api :as t]
            [tick.timezone]
            [tick.locale-en-us]))

(enable-console-print!)

(println (t/now))
(println (t/zone "Europe/Paris"))
(println (t/formatter "yyyy"))

(comment 
  
  (require '[tick.alpha.api :as t])
  
  )
