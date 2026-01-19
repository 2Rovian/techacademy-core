# 🏫 Core Service — Gestão de Alunos e Turmas

Este repositório contém o **Core Service** do sistema de gestão escolar proposto no  
[Desafio Técnico Júnior da StralooHealth](https://github.com/straloohealth/Teste-T-cnico---N-vel-Junior-2026.1).

O Core Service é responsável pela **gestão de alunos e turmas**, além de atuar como **serviço orquestrador** no ecossistema de microserviços, realizando a comunicação com o serviço acadêmico para a geração de boletins escolares.

---

## 📌 Visão Geral

No contexto do desafio, o sistema foi dividido em dois serviços principais:

### 🧠 Core Service (este repositório)
Responsável por:
- Gestão de Alunos
- Gestão de Turmas
- Orquestração do domínio principal
- Comunicação com o Academic Service para geração de boletins

### 📚 Academic Service (repositório separado)
Responsável por:
- Gestão de Disciplinas
- Gestão de Notas dos alunos

---

## 🏗 Stack Tecnológica

- Java (Spring Boot)
- PostgreSQL

---

## 🏗 Arquitetura

- **Estilo arquitetural:** Microserviços com bancos de dados independentes  
- **Padrão adotado:** Arquitetura Hexagonal (Ports and Adapters)  

---

## 📦 Modelos de Dados (Objetos)

### 🎓 Student
```
{
  "id": 1,
  "name": "Alice Martins",
  "classroomId": 1,
  "registrationString": "REG-001"
}
```

### 📚 Classroom 
```
{
  "id": 1,
  "name": "Classroom A"
}
```

## 🎓 Student Controller
| Método | Endpoint             | Descrição             |
| ------ | -------------------- | --------------------- |
| GET    | `/api/students`      | Lista todos os alunos |
| GET    | `/api/students/{id}` | Busca aluno por ID    |
| POST   | `/api/students`      | Cria um novo aluno    |
| DELETE | `/api/students/{id}` | Remove um aluno       |

## 📚 Classroom Controller
| Método | Endpoint               | Descrição             |
| ------ | ---------------------- | --------------------- |
| GET    | `/api/classrooms`      | Lista todas as turmas |
| GET    | `/api/classrooms/{id}` | Busca turma por ID    |
| POST   | `/api/classrooms`      | Cria uma nova turma   |
| DELETE | `/api/classrooms/{id}` | Remove uma turma      |

## 🚀 Instalação

### 1️⃣ Crie uma pasta para o projeto e acesse-a
```
mkdir techacademy && cd techacademy
```

### 2️⃣ Clone o repositório do core-service

```
git clone https://github.com/2Rovian/techacademy-core
```

### 3️⃣ Clone o repositório do academic-service

```
git clone https://github.com/2Rovian/techacademy-academic
```

### 4️⃣ Renomeie os diretórios

```
mv techacademy-core core-service
```
```
mv techacademy-academic academic-service
```

### 5️⃣ Acesse o diretório do core-service
```
cd techacademy-core
```
### 6️⃣ Rode os containers
```
docker-compose up --build
```

## 🔌 Ports
- core-service: `http://localhost:8081`  
- academic-service: `http://localhost:8082`
