
-- Modifiez vos requêtes INSERT INTO pour inclure les nouvelles colonnes
INSERT INTO address (id, creation, content, auteur, label, score, housenumber, street, postcode, citycode, x, y, city)
VALUES (1, CURRENT_TIMESTAMP(), '57 boulevard demorieux', 'Iheb Ben Jemaa', 'Sample Label', 0.75, '10', 'Example Street', '12345', '67890', 1.234, 5.678, 'Sample City');

INSERT INTO address (id, creation, content, auteur, label, score, housenumber, street, postcode, citycode, x, y, city)
VALUES (2, CURRENT_TIMESTAMP(), '51 allee du gamay, 34080 montpellier', 'Iheb', 'Another Label', 0.80, '20', 'Another Street', '54321', '09876', 9.876, 4.321, 'Another City');
