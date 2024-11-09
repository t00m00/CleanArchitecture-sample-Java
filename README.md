## What is this?

Java で Webサービスを開発する際、プロジェクト構成に制約を設けるためのサンプルプロジェクトである

## Detail

* Clean Architecture をベースにしたプロジェクト構成
* おおまかなプロジェクト構成は以下の通り
    * EndPoints
    * Application
    * Domain
    * Infrastructure
    * Providers
    * Shared
* パッケージを細分化することに依存の方向を限定する
    * 例えば、`Domain` パッケージは他のパッケージに依存しない
    * `Application` パッケージは `Domain` パッケージに依存するが、`Domain` パッケージは `Application` パッケージに依存しない
    * `EndPoints` パッケージは `Application` パッケージに依存するが、`Application` パッケージは `EndPoints` パッケージに依存しない
    * `Infrastructure` パッケージは `Application` パッケージに依存するが、`Application` パッケージは `Infrastructure` パッケージに依存しない
    * `Infrastructure` パッケージは `Providers` パッケージに依存する可能性があるが、`Providers` パッケージは `Infrastructure` パッケージに依存しない
    * `Providers` パッケージは `EndPoints` パッケージに依存する可能性があるが、`EndPoints` パッケージは `Providers` パッケージに依存しない
    * `Shared` パッケージは他のすべてのパッケージに依存される可能性がある
