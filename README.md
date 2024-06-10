# OpenAPI Contract First Demo Project

## How to use

1. Подготовить спецификацию в [Swagger Editor](https://editor.swagger.io/)
2. Поместить файл со спецификацией в каталог с ресурсами
3. Настроить openapi generator плагин (для [maven](https://github.com/OpenAPITools/openapi-generator/tree/master/modules/openapi-generator-maven-plugin) 
или [gradle](https://github.com/OpenAPITools/openapi-generator/tree/master/modules/openapi-generator-gradle-plugin))
4. Сгеренировать на основании спецификации модели и интерфейсы контроллеров (mvn clean compile - для maven)
5. В application.yaml (application.properties) указать путь до файла спецификации для Swagger 
6. Создать реализацию контроллеров, интерфейсы которых были сгенерированы ранее плагином
7. Если сгенерированные плагином интерфейсы не импортируются, то:
   1. Добавить ComponentScan для пакета со сгенерированными плагином классами (и интерфейсами)
   2. Проверить, чтобы папка (main) с гененрируемыми классами были помечена как Generated Sources Root

## Docs
[Ссылка на документацию по спецификации Open Api](https://spec.openapis.org/oas/latest.html)