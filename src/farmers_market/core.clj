(ns farmers-market.core
  (:require [farmers-market.logic.product :as product])
  (:gen-class))

(def quit "0")
(def add-product "1")
(def list-products "2")
(defn show-menu []
      (println (str "[" add-product "] to add some products"))
      (println (str "[" list-products "] to show the products"))
      (println (str "[" quit "] to quit"))
      (println "entry your option: "))
(defn -main [& args]
  (loop []
        (show-menu)
        (let [option (read-line)]
             (cond
               (= option quit) (println "thank you for your visit!")
               (= option add-product) (product/add)
               (= option list-products) (product/show)
               :else (println "invalid option. try again!\n"))
             (when (not= option "0")
                   (recur)))))
