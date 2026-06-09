# Teste de IMC — versão modificada

Aplicativo Android (Kotlin) de cálculo de IMC, baseado no projeto da disciplina de
Programação de Dispositivos Móveis. Esta versão atende à atividade de modificação da
tela de resultado.

## Alterações feitas

1. **Exibe todas as informações do cálculo** — além da classificação, a tela de
   resultado agora mostra o **IMC**, o **Peso** e a **Altura** usados no cálculo.
2. **Cor dos componentes alterada** — o tema foi trocado de roxo (`#5D1049`) para
   laranja (`#E08E45`), refletindo na AppBar e no botão *Voltar*.
3. **IMC arredondado para 2 casas decimais** — exibido no formato brasileiro
   (ex.: `19,54`) em vez do valor longo (`28.228388`).

## Onde as mudanças foram aplicadas

| Arquivo | Mudança |
|---|---|
| `res/values/colors.xml` | Paleta roxa → laranja |
| `res/values/strings.xml` | Rótulos `Seu IMC`, `Seu Peso`, `Sua Altura` |
| `res/layout/activity_resultado2.xml` | Corrigidos IDs duplicados; campos de IMC, Peso e Altura |
| `java/com/example/imc/IMC.kt` | Método `imcFormatado()` (2 casas decimais, vírgula) |
| `java/com/example/imc/ResultadoActivity.kt` | Exibe IMC formatado + Peso + Altura; botão Voltar |

## Como rodar

O projeto usa **Android Gradle Plugin 8.5.2**, **Gradle 8.9** e **Kotlin 1.9.24**,
o que exige um **JDK na faixa 17–21** para compilar.

1. Abrir a pasta no **Android Studio**.
2. Garantir que o **Gradle JDK** está em 17–21:
   *Settings → Build, Execution, Deployment → Build Tools → Gradle → Gradle JDK*
   → selecionar **jbr-21** (ou *Embedded JDK*).
3. Clicar em **Sync Now** e aguardar o Gradle sincronizar.
4. Selecionar um emulador ou dispositivo e executar (▶).

### Pela linha de comando

```bash
# É necessário um JDK 17–21 no JAVA_HOME (o JBR do Android Studio serve):
export JAVA_HOME="/Applications/Android Studio.app/Contents/jbr/Contents/Home"
./gradlew assembleDebug
```
# imc-kotlin
