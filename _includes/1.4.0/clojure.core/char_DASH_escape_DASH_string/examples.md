### Example 0
[permalink](#example-0)

{% highlight clojure %}
{% raw %}
;; simple examples

user=> (char-escape-string \newline)
"\\n"
user=> (char-escape-string \c) ; no escape sequence for 'c'
nil
user=> (char-escape-string \tab)
"\\t"
user=> (char-escape-string \backspace)
"\\b"
user=>{% endraw %}
{% endhighlight %}


