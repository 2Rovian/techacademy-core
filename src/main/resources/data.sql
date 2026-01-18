INSERT INTO tb_classrooms (id, name) VALUES
                                         (1, 'Classroom A'),
                                         (2, 'Classroom B'),
                                         (3, 'Classroom C'),
                                         (4, 'Classroom D');


INSERT INTO tb_students (id, name, classroom_id, registration_string) VALUES
-- Classroom A
(1, 'Alice Martins', 1, 'REG-001'),
(2, 'Bob Santos', 1, 'REG-002'),
(3, 'Carla Nogueira', 1, 'REG-003'),

-- Classroom B
(4, 'Daniel Costa', 2, 'REG-004'),
(5, 'Eduarda Lima', 2, 'REG-005'),
(6, 'Felipe Rocha', 2, 'REG-006'),

-- Classroom C
(7, 'Gabriela Alves', 3, 'REG-007'),
(8, 'Henrique Souza', 3, 'REG-008'),

-- Classroom D
(9, 'Isabela Pires', 4, 'REG-009'),
(10, 'João Ribeiro', 4, 'REG-010');
