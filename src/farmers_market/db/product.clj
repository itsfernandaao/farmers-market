(ns farmers-market.db.product)

(def product-db (atom nil))

(defn insert! [product]
      (swap! product-db conj product))

(defn clear! []
      (reset! product-db nil))

(defn show! []
      @product-db)