### Example 0
[permalink](#example-0)

{% highlight clojure %}
{% raw %}
user=> (assert true)
nil

user=> (assert false)
java.lang.AssertionError: Assert failed: false (NO_SOURCE_FILE:0)

user=> (assert nil)
java.lang.AssertionError: Assert failed: nil (NO_SOURCE_FILE:0)

user=> (assert 0)
nil

user=> (assert [1 2 3])
nil

user=> (assert "foo")
nil{% endraw %}
{% endhighlight %}


