CREATE TABLE IF NOT EXISTS messages (
  id                     VARCHAR(60)  DEFAULT RANDOM_UUID() PRIMARY KEY,
  data                   VARCHAR      NOT NULL,
  datetime               TIMESTAMP
);