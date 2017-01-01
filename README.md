This is an example repo to show CLJS-1853.

## Steps

```
./build.sh
grep "Pretty printing" out/main.js
```

## Output

```
$ ./build.sh
$ grep "Pretty printing" out/main.js
Ec,"Pretty printing will try to avoid anything going beyond this column.\nSet it to nil to have pprint let the line be arbitrarily long. This will ignore all\nnon-mandatory newlines.",t(Rl)?Rl.Xa:null])),new Ac(function(){return $l},Uj,md([vh,Oh,Rh,di,hi,Oi,fj,hj,Gj,lk,vk,Fk],[!0,Xi,ah,"out/cljs/pprint.cljs",15,1,!0,646,649,Ec,"Mark circular structures (N.B. This is not yet used)",t($l)?$l.Xa:null])),new Ac(function(){return Zl},Ak,md([vh,Oh,Rh,di,hi,Oi,fj,hj,Gj,lk,vk,Fk],[!0,Xi,ej,"out/cljs/pprint.cljs",
```

### Expected

No output from `grep` — the docstrings for `cljs.pprint/*print-right-margin*` and others should not be included in the compiled output.

### Actual

The `:advanced`-optimized single-file JS output includes docstrings.
