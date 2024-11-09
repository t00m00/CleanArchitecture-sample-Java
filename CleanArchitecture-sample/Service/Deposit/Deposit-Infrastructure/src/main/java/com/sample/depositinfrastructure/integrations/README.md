## What is this?

* UseCase（Interactor）に該当する処理を行う。
    * ControllerとDomainのつなぎ役
* ここで Repository や Providers（外部通信、送信ポート）の呼び出しを行う
* 理想は Application 配下に配置するべきであるが、Providers を再利用して使用する関係上 Infrastructure で定義するにいたった。
    * もし、Providers を使い回さずにインターフェースの引数および、戻り値をDIPできれば Application に配置することが可能 

## 配置対象

* `RequestHandler` インターフェースの実装クラスを配置する
* Database のクラスや設定（resources配下になる？）