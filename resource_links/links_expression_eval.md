> ## Expression eval in Java
- **Imports**</br>
  `import javax.script.ScriptEngine;`</br>
  `import javax.script.ScriptEngineManager;`</br>
  `import javax.script.ScriptException;`</br>
  > **simply** `import javax.scrip.*;`

- **Handle Exceptioin**</br>
  `throws ScriptException`
  > **simply** `public static void main(String[] args)` **throws ScriptException**
  
- **Usage**</br>
  `ScriptEngineManager manager = new ScriptEngineManager();`</br>
  `ScriptEngine engine = manager.getEngineByName("js");`</br>
  `Object result = engine.eval("4*5");`</br>
  `System.out.println(result);`</br>
  
- **Sample Example**</br>
  `class ExampleEval`</br>
  `{`</br>
      `public static void main(String[] args) throws ScriptException`</br>
      `{`</br>
          `ScriptEngineManager manager = new ScriptEngineManager();`</br>
          `ScriptEngine engine = manager.getEngineByName("js");`</br>
          ` Object result = null;`</br>
          `result = engine.eval("1 + 2;");`</br>
          `System.out.println(result);`</br>
      `}`</br>
  `}`</br>
