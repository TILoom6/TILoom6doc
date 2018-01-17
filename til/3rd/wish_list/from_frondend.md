# ほしいものリスト from フロントエンド

※ 認証系は度外視した要望

## REST API

### /wannatags

#### 前提

* レスポンスの MIME TYPE は`application/json`
* レスポンスの JSON の中身は`[{Wannatag}, {Wannatag}]`

#### GET

##### Options

| option     | description                                                                                                                                                        | value example      | request line                                    |     |
| ---------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------ | ----------------------------------------------- | --- |
| [compare]  | キー`postDate`の比較方法.<br>`postDate`とセットで使う.<br>older: 与えられた`postDate`より古いもの<br>newer: 与えられた`postDate`より新しい<br>デフォルトは`older`. | `older` or `newer` | /wannatags?compare=older&postDate=1516187707588 |     |  |
| [postDate] | レスポンスの基準になる投稿日時.<br>UNIX Time のタイムスタンプ(ミリ秒単位).<br>デフォルトは最新の postDate + 1.                                                     | 1234567890123      |                                                 |     |
| [limit]    | データ数.<br>デフォルトは無制限                                                                                                                                    | 20                 | /wannatags?limit=20                             |

##### Body

なし

##### Example

ある時点の投稿より古い Wannatag を 30 こ取得

```
/wannatags?compare=older&postDate=1516187707588&limit=30
or
/wannatags?postDate=1516187707588&limit=30
```

#### POST

##### Options

なし

##### Body

{wannatag}

##### Example

```
/wannatags
```

### /wannatag

#### DELETE

##### Options

なし

##### Example

```
/wannatag/<削除したいWannatagの投稿日時>
```
