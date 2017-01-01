(require 'cljs.build.api)

(cljs.build.api/build
  "src"
  {:optimizations :advanced
   :output-to "out/main.js"})

(System/exit 0)
