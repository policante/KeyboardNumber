# KeyboardNumber
Teclado numérico customizado

<img src="https://github.com/policante/KeyboardNumber/blob/master/resource/dialog1.png" width="170">
<img src="https://github.com/policante/KeyboardNumber/blob/master/resource/dialog2.png" width="170">
<img src="https://github.com/policante/KeyboardNumber/blob/master/resource/dialog3.png" width="170">
<img src="https://github.com/policante/KeyboardNumber/blob/master/resource/dialog4.png" width="170">

## Download
Adicione o repositório JitPack no seu build.gradle no final de repositories:
```
	allprojects {
		repositories {
			...
			maven { url "https://jitpack.io" }
		}
	}
```
e adicione a dependência
```
  dependencies {
	        compile 'com.github.policante:KeyboardNumber:master-SNAPSHOT'
	}
```

## Como usar

### KeyboardNumber

Para mostrar o KeyboardNumber, é só chamar:

``` java
        new KeyboardNumberPicker
                .Builder(TAG_KEYBOARD_NUMBER)
                .create()
                .show(getSupportFragmentManager(), TAG_DIALOG_FRAGMENT);
```

### Listener

Você pode implementar as seguintes interfaces na sua `Activity` ou `Fragment` pai:
 - *KeyboardNumberKeyListener*: Para capturar cada digito selecionado
 - *KeyboardNumberPickerHandler*: Para capturar as ações de salvar e cancelar
 - *KeyboardNumberFormatter*: Para formatar a string


## Styling
Você pode customizar as cores do layout de acordo com sua aplicação, somente alterar os seguintes atributs:

```java
    <attr name="knpDisplayTextColor" format="color"/>
    <attr name="knpDisplayBackgroundColor" format="color"/>
    <attr name="knpKeysTextColor" format="color"/>
    <attr name="knpKeysBackgroundColor" format="color"/>
    <attr name="knpBackgroundColor" format="color"/>
    <attr name="knpBackspaceTintColor" format="color"/>
    <attr name="knpBackspaceBackgroundColor" format="color"/>
```

Veja o projeto de exemplo para mais detalhes

## Contribuição

### Pull requests

Fique a vontade para contribuir no projeto, sugestões são bem-vindas 

## MIT License

Copyright (c) 2017 Rodrigo Martins

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
