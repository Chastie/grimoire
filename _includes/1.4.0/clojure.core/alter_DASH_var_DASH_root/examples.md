### Example 0
[permalink](#example-0)

{% highlight clojure %}
{% raw %}
(defn sqr [n]
  "Squares a number"
  (* n n))

user=> (sqr 5)
25

user=> (alter-var-root
         (var sqr)                     ; var to alter
         (fn [f]                       ; fn to apply to the var's value
           #(do (println "Squaring" %) ; returns a new fn wrapping old fn
                (f %))))

user=> (sqr 5)
Squaring 5
25
{% endraw %}
{% endhighlight %}


