# FizzBuzz

## お題

1から100までの数をプリントするプログラムを書け。ただし3の倍数のときは数の代わりに｢Fizz｣と、5の倍数のときは｢Buzz｣とプリントし、3と5両方の倍数の場合には｢FizzBuzz｣とプリントすること。

## TODO

- [x] 3の倍数のときは数の代わりに｢Fizz｣      ③
  - [x] 3の倍数じゃなかったら数字
  - [x] 3の倍数だったら数の代わりに｢Fizz｣
- [x] 5の倍数のときは｢Buzz｣
  - [x] 5の倍数じゃなかったら数字
  - [x] 5の倍数だったら数の代わりに｢Buzz｣
- [x] 3と5両方の倍数の場合には｢FizzBuzz｣
  - [x] 3と5両方の倍数だったら数の代わりに｢FizzBuzz｣
- [x] 1から100までの数にFizzBuzzを適用する  ①
- [ ] プリントする                        ② ❌しんどそうだからやらない

### ③

#### 最初のテストファイル名

* FizzBuzz？
  * 最終的にここにまとめたい
  * この規模だとテストをわけるイメージがわかない

#### 最初のテスト

* どこまでを見てテストするか
  * 不安の度合いによる
  * 最初の歩幅を決めるのもTDDのスキル

### 1から100までの数にFizzBuzzを適用する

* 配列まるごとassert？
* TODOをもう１段階細かくする？
  * [1, ..., 100]
  * FizzBuzz適用

#### memo

* いらんテストを削っても良いの？（3と6のテストとか）
  * 削っても自信が落ちない＆仕様のカバレッジが落ちないならOK（by よしおか）