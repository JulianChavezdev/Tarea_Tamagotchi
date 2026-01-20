# 🥚 Tamagotchi Kata

Implementación de una mascota virtual basada en la lógica clásica de 1996, diseñada como un ejercicio de gestión de estados y lógica condicional.

## 📊 Atributos Iniciales

Todos los atributos comienzan con una puntuación base de **4**.

| Atributo | Descripción |
| :--- | :--- |
| **Hunger** (Hambre) | Aumenta al jugar, disminuye al comer. |
| **Energy** (Energía) | Disminuye al realizar acciones, aumenta al dormir. |
| **Mood** (Humor) | Aumenta al jugar. |

---

## 🛠 Interfaz de la Clase (API)

Según los requerimientos, la clase `Tamagotchi` debe exponer **únicamente** tres métodos públicos. Todos retornan un `String` con el estado visual y no aceptan parámetros.

| Método | Efecto en Atributos |
| :--- | :--- |
| `play()` | Hunger +1, Mood +1, Energy -1 |
| `eat()` | Hunger -2, Energy -1 |
| `sleep()` | Energy +2 |

---

## 🎭 Lógica de Estados (Jerarquía de Prioridad)

El método de retorno de estado debe evaluar las condiciones en el siguiente orden estricto para evitar conflictos visuales:

1. **Dormido** `(-_-) zZZ`: Cuando la energía llega a **0** o se ejecuta el método `sleep()`.
2. **Cansado** `(-_-)`: Cuando la energía es **menor a 3**.
3. **Enfadado** `ఠ_ఠ`: Cuando el humor es **menor a 2**.
4. **Contento** `:-)`: Cuando el humor es **mayor a 8**.
5. **Normal** `:-|`: En cualquier otro caso.

---

## ⚠️ Notas de Implementación (Análisis de Caso)

Para que este código funcione de forma robusta y no como un prototipo mediocre, considera lo siguiente:

- **Encapsulamiento:** Los atributos `hunger`, `energy` y `mood` deben ser privados (`#private` en JS o `private` en TS/Java).
- **Límites (Clamping):** Aunque la kata no lo pida explícitamente, un buen desarrollador evita que el hambre sea negativa o que la energía suba al infinito.
- **Estado de Sueño:** La acción `sleep()` es una orden directa; el retorno debe ser el estado de dormido independientemente de los otros valores en ese instante.

---

## 🚀 Ejemplo de Uso

```javascript
const tamagotchi = new Tamagotchi();

tamagotchi.play(); // Retorna ":-|"
tamagotchi.eat();  // Retorna ":-|"
// ... tras varias acciones ...
tamagotchi.play(); // Si Energy < 3 -> Retorna "(-_-)"
