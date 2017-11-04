# Fork / Pull の運用

詳しくは[こちら](http://kik.xii.jp/archives/179)

## 文言
- upstream : TILoom6のリポジトリ（fork元リポジトリ）
- origin : 自分のリモートリポジトリ
- local : 自分のローカルリポジトリ

## 手順
- upstreamプロジェクトの右上の「Fork」を押下
- 自分のリポジトリを選択（自分のリモートforkされoriginができる）
- 自分のリポジトリからローカルにclone（localができる）
- ローカルリポジトリでブランチ切って開発
- originにpush（masterじゃなくてブランチ）
- Pullrequest投げる

## upstreamの追従
下記コマンドでupstreamの更新内容に追従することができる

git remote add upstream https://github.com/TILoom6/hogehoge.git

