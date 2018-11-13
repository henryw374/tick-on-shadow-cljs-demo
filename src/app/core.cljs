(ns app.core
  (:require [tick.alpha.api :as time]
            [tick.timezone]
            [tick.locale-en-us]))

(enable-console-print!)

(println (time/now))
(println (time/zone "Europe/Paris"))
(println (time/formatter "yyyy"))
