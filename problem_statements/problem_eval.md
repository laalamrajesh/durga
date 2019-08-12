> ## Take a `string` as input. String contains some alphabets from `a` to `z`. And numbers from `0` to `9`. And operators `+`,`-`,`*`,`/`. Asume that `a=1`, `b=2` ... `z=26`. 1) Output string must replace characters with associate numbers. 2) Output the result of expression. [Hint : `eval`].


> Test case 0 :</br>
  `8c7+z7*2`</br>

> Output :</br>
`837+267*2`</br>
`1371`</br>

**Explanation**

- given `string` is `8c7z72`
- `string` contains alphabets `c` and `z`, which values are `c=3` and `z=26`
- replace `characters` with their respective `values`. return `string`
- after evaluating `837+267*2`, we get `1371` as output.
