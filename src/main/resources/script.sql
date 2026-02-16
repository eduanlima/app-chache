CREATE TABLE IF NOT EXISTS tb_company (id INT PRIMARY KEY, name varchar(20));

CREATE OR REPLACE FUNCTION populaDB()
RETURNS VOID AS '
DECLARE
    cont INT := 1;
    f_registers INT := 0;
BEGIN
    SELECT COUNT(*) INTO f_registers FROM tb_company;
    IF f_registers = 0 THEN
        FOR cont IN 1..300000 LOOP
            INSERT INTO tb_company (id, name)
            VALUES (cont, CONCAT(''tb_company '', cont));
        END LOOP;
    END IF;
END;
'
LANGUAGE plpgsql;

SELECT populaDB();