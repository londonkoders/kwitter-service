DROP TABLE IF EXISTS users;

CREATE TABLE users (
  id INT AUTO_INCREMENT PRIMARY KEY,
  user_id VARCHAR(250) NOT NULL,
  password VARCHAR(250) NOT NULL,
  name VARCHAR(250) DEFAULT NULL
);

INSERT INTO users (id, user_id, password, name) VALUES
(10001, 'jihyun', 'test001', 'Jihyun Um'),
(10002, 'taeim', 'test002', 'Taeim Kwon'),
(10003, 'heath', 'test003', 'Heath Ryu'),
(10004, 'jung', 'test004', 'Jung Kim');
