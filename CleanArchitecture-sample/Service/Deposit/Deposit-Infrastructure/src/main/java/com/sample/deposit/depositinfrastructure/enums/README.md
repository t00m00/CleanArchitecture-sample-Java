## What is this?

* Anticorruptionレイヤーを表現
* Application ⇔ Providers
* Infrastructure ⇔ Providers
    * 基本的にApplicationでEnumを定義し使用するの、Infrastructureに閉じた列挙体を定義することは無い想定

## 配置対象

* Applicationの列挙体とProvidersの列挙体のMapperを配置する
* Providersの列挙体をInfrastructureレイヤーで引きまわす必要がある場合、Providersの列挙体に依存する範囲を最小限にするためにProvidersの列挙体に類似したInfrastructureに閉じた列挙体を配置する場合がある