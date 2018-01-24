# Wannatags のデータ仕様

## 文脈

* Server API でやりとりする時の Wannatag のデータフォーマットを決める

## データフォーマット

### GET リクエスト

* フォーマットは JSON
* トップレベルは配列
  * 配列の 1 要素が 1 コの Wannatag

#### Wannatag のデータフォーマット

```js
{
  wannnatagId: <Number>, // ユニークId。型は仮
  title: <String>,       // Wannatagのタイトル。最大 50 文字（仮）
  body: <String>,        // Wannatagの本文。最大 250 文字（仮）
  username: <String>,    // Wannatagのを書いた人（所有者）。最大文字数未定
  postDate: <Number>,    // 投稿日。UNIX時間（ミリ秒単位）
  isOwner: <Boolean>     // GETリクエストを送った人から見て所有者か（サーバー側で決める（仮））
}
```

#### Wannatags のデータフォーマット

※データ数が 0 の場合は空配列

```js
[
  {
    wannnatagId: <Number>,
    title: <String>,
    body: <String>,
    username: <String>,
    postDate: <Number>,
    isOwner: <Boolean>
  },
  {
    wannnatagId: <Number>,
    title: <String>,
    body: <String>,
    username: <String>,
    postDate: <Number>,
    isOwner: <Boolean>
  }
]
```

### POST リクエスト

* フォーマットは JSON
* トップレベルはオブジェクト

#### データフォーマット

```js
{
  title: <String>,       // [必須]Wannatagのタイトル。1文字以上
  body: <String>,        // [必須]Wannatagの本文。1文字以上
  username: <String>,    // [必須]Wannatagのを書いた人（所有者）。1文字以上
                         //      サーバー側にユーザー名を特定させた方が良い？
  userId: <Number???>    // 型は仮
}
```
