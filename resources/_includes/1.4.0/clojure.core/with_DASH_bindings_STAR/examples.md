### Example 0
[permalink](#example-0)

{% highlight clojure %}
{% raw %}
user=> (let [f (fn [] *warn-on-reflection*)]
         (with-bindings* {#'*warn-on-reflection* true} f))
true{% endraw %}
{% endhighlight %}


