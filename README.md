# Weapon Management System – Desafio de Arquitetura em Java

Desenvolva um sistema orientado a objetos em *Java* que modele a seguinte situação:
Uma *pessoa* possui *uma ou mais armas*, e cada arma pode (ou não) possuir um **carregador* com **munição**.

O sistema deve permitir:
- 🔄 *Recarregar* a arma (se aplicável).
- 🎯 *Atirar* (se houver munição disponível).
- 📦 *Guardar* a arma.

⚙ *Regras e requisitos obrigatórios:*
🔫 *Arma:
- Deve ser capaz de:
  * 🔄 *Recarregar* (somente se houver **munição compatível**).
  * 🎯 *Atirar* (somente se houver **munição carregada**).
  * 📦 **Ser guardada**.

- Cada arma deve aceitar apenas o tipo correto de **munição**.
- Nem toda arma é **recarregável**.

📦 *Carregador:*
- Deve estar *logicamente carregado* para permitir o disparo.
- Ter *capacidade máxima de munições* definida:
  * Fuzil -> 30 munições.
  * Pistola -> 12 munições.
  * Arco e flecha -> 0 (**não possui carregador**).
- Não deve saber qual *arma* o utiliza.

💥 *Munição:*
- O tipo de munição deve ser representado por um **ENUM**.

👤 *Pessoa:*
- Pode possuir **uma ou mais armas**.
- Não deve ser conhecida internamente pela **arma**.

🔧 *Requisitos técnicos obrigatórios:*
Seu código deve aplicar:
* ✅ **Princípios SOLID**.
* ✅ **Polimorfismo**.
* ✅ **Herança**.
* ✅ **Encapsulamento**.
* ✅ **Generics**.

⛔ *Restrições:*
X Não use *frameworks externos* - apenas **Java puro**.
X Não acople *classes diretamente* - use **abstrações**.
X Não resolva o problema apenas com *condicionais (if/instanceof)* espalhadas.

📦 *Entrega esperada:*
* 📁 Código **Java completo**, organizado em pacotes claros.
* 📝 Comentários explicativos apenas onde necessário.

🚀 *Observação final:*
Lembre-se: este desafio não é apenas sobre fazer funcionar — é sobre provar que você entende design limpo e arquitetura robusta.
Porque, no final das contas, quem não se aprimora... pode ser substituído por uma LLM.
