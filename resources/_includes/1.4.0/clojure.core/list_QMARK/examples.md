### Example 0
[permalink](#example-0)

{% highlight clojure %}
{% raw %}
user=> (list? '(1 2 3))
true
user=> (list? (list 1 2))
true
user=> (list? 0)
false
user=> (list? {})
false
user=> (list? [])
false
user=> (list? (range 10))
false
{% endraw %}
{% endhighlight %}


