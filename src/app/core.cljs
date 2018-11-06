(ns app.core
  (:require [tick.alpha.api :as time]))

(enable-console-print!)

(println (time/now))
