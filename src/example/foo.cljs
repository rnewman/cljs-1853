(ns example.foo
  (:require
     [cljs.pprint]
     [cljs.nodejs :as nodejs]))

(enable-console-print!)

(defn -main [& args]
  (cljs.pprint/pprint "Hello, " 57))

