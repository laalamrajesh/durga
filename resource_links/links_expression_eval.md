> ## Expression eval in Java
- **Imports**</br>
  `import javax.script.ScriptEngine;`</br>
  `import javax.script.ScriptEngineManager;`</br>
  `import javax.script.ScriptException;`</br>
  > **simply** `import javax.scrip.*;`
  
- **Usage**</br>
  `ScriptEngineManager manager = new ScriptEngineManager();`</br>
  `ScriptEngine engine = manager.getEngineByName("js");`</br>
  `Object result = engine.eval("4*5");`
