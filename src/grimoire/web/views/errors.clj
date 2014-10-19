(ns grimoire.web.views.errors
  (:require [clojure.java.io :as io]
            [grimoire.web.views :refer [site-config]]
	    [grimoire.web.layout :refer [layout]]
	    [ring.util.response :as response]))

(defn error-404 []
  (layout
   site-config
   (slurp (io/resource "404.html"))))

(defn error-unknown-group [groupid]
  (layout
   site-config
   [:h1 {:class "page-title"}
    [:a groupid]]
   [:p "Unknown group " (pr-str groupid)]
   [:p "If you found a broken link, please report the issue encountered on the github bugtracker."]))

(defn error-unknown-artifact [groupid artifactid]
  (let [s (format "%s/%s" groupid artifactid)]
    (layout
     site-config
     [:h1 {:class "page-title"}
      [:a s]]
     [:p "Unknown artifact " s]
     [:p "If you found a broken link, please report the issue encountered on the github bugtracker."])))

(defn error-unknown-version
  ([version]
     (error-unknown-version "org.clojure" "clojure" version))

  ([groupid artifactid version]
     (layout
      site-config
      [:h1 {:class "page-title"}
       [:a (format "[%s/%s \"%s\"]" groupid artifactid version)]]
      [:p "Unknown artifact version " (pr-str version)]
      [:p "If you found a broken link, please report the issue encountered on the github bugtracker."])))

(defn error-unknown-namespace
  ([version namespace]
     (error-unknown-namespace "org.clojure" "clojure" version namespace))

  ([groupid artifactid version namespace]
     (layout
      site-config
      [:h1 {:class "page-title"}
       [:a (format "[%s/%s \"%s\"]" groupid artifactid version)]]
      [:p "Unknown namespace identifier " (pr-str [version namespace])]
      [:p "If you found a broken link, please report the issue encountered on the github bugtracker."])))

(defn error-unknown-symbol
  ([version namespace symbol]
     (error-unknown-symbol "org.clojure" "clojure" version namespace symbol))

  ([groupid artifactid version namespace symbol]
     (layout
      site-config
      [:h1 {:class "page-title"}
       [:a (format "[%s/%s \"%s\"]" groupid artifactid version)]]
      [:p "Unknown symbol identifier " (format "%s/%s" namespace symbol)]
      [:p "If you found a broken link, please report the issue encountered on the github bugtracker."])))
