### Example 0
[permalink](#example-0)

{% highlight clojure %}
{% raw %}
user=> (int 1)
1

user=> (int 1M)
1

user=> (int 1.2)
1

user=> (int \1)
49

user=> (int \a)
97

user=> (int "1")
java.lang.ClassCastException: ...
{% endraw %}
{% endhighlight %}


