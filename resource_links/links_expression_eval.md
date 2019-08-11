> ## Expression eval in Java

**Example Usage**</br>
`ScriptEngineManager manager = new ScriptEngineManager();`</br>
`ScriptEngine engine = manager.getEngineByName("js");`</br>
`Object result = engine.eval("4*5");`
