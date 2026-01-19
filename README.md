# 🏫 Core Service — Gestão de Alunos e Turmas

Este repositório contém o **Core Service** do sistema de gestão escolar proposto no  
[Desafio Técnico Júnior da StralooHealth](https://github.com/straloohealth/Teste-T-cnico---N-vel-Junior-2026.1).

O Core Service é responsável pela **gestão de alunos e turmas**, além de atuar como **serviço orquestrador** no ecossistema de microserviços, realizando a comunicação com o serviço acadêmico para a geração de boletins escolares.

[Repositório do microserviço de gestão de notas e boletim](https://github.com/2Rovian/techacademy-academic/)

---

## 📌 Visão Geral

No contexto do desafio, o sistema foi dividido em dois serviços principais:

### 🧠 Core Service (este repositório)
Responsável por:
- Gestão de Alunos
- Gestão de Turmas
- Orquestração do domínio principal

### 📚 Academic Service (repositório separado)
Responsável por:
- Gestão de Notas dos alunos
- Emissão de Boletins

---  

## 🏗 Stack 

- **Linguagem e framework:** Java 21 (Spring Boot)
- **Banco de dados:** PostgreSQL
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

## Dois Requisitos Funcionais
- Listar Turmas: Retornar todas as turmas cadastradas ( /api/classrooms )
```
[
  {
    "id": 1,
    "name": "Classroom A"
  },
  {
    "id": 2,
    "name": "Classroom B"
  },
  {
    "id": 3,
    "name": "Classroom C"
  }
]
```
- Listar Alunos de uma Turma: Dado o identificador de uma turma, retornar a lista de alunos vinculados. ( /api/students?classroomId={id} )
```
[
  {
    "id": 1,
    "name": "Alice Martins",
    "classroomId": 1,
    "registrationString": "REG-001"
  },
  {
    "id": 2,
    "name": "Bob Santos",
    "classroomId": 1,
    "registrationString": "REG-002"
  },
  {
    "id": 3,
    "name": "Carla Nogueira",
    "classroomId": 1,
    "registrationString": "REG-003"
  }
]
```

## 🎓 Student Controller
| Método | Endpoint             | Descrição             |
| ------ | -------------------- | --------------------- |
| GET    | `/api/students`      | Lista todos os alunos |
| GET    | `/api/students/{id}` | Busca aluno por ID    |
| GET    | `/api/students?classroomId={id}` | Busca aluno por identificador da turma    | 
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
