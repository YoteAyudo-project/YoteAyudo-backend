INSERT INTO categories (id, name) VALUES (1, 'Mascotas');
INSERT INTO categories (id, name) VALUES (2, 'Crianza');
INSERT INTO categories (id, name) VALUES (3, 'Mayores');
INSERT INTO categories (id, name) VALUES (4, 'Guitarra');
INSERT INTO categories (id, name) VALUES (5, 'Inglés');

INSERT INTO users (id, username, email, password, created_at, updated_at) VALUES (1, 'Maria', 'Maria@example.com', '1234', NOW(), NOW());
INSERT INTO users (id, username, email, password, created_at, updated_at) VALUES (2, 'Giaco', 'Giaco@example.com', '1234', NOW(), NOW());
INSERT INTO users (id, username, email, password, created_at, updated_at) VALUES (3, 'Lilith', 'Lilith@example.com', '1234', NOW(), NOW());

INSERT INTO posts (id, title, content, created_at, updated_at, user_id, category_id) VALUES (1, 'Post 1', 'Content of Post 1', NOW(), NOW(), 1, 1);
INSERT INTO posts (id, title, content, created_at, updated_at, user_id, category_id) VALUES (2, 'Post 2', 'Content of Post 2', NOW(), NOW(), 2, 2);
INSERT INTO posts (id, title, content, created_at, updated_at, user_id, category_id) VALUES (3, 'Post 3', 'Content of Post 3', NOW(), NOW(), 3, 3);