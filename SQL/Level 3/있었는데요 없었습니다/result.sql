-- 코드를 입력하세요
SELECT
    ao.ANIMAL_ID,
    ao.NAME
FROM ANIMAL_INS AS ai
INNER JOIN ANIMAL_OUTS AS ao 
    ON ai.ANIMAL_ID = ao.ANIMAL_ID
WHERE 
    ao.DATETIME <= ai.DATETIME
ORDER BY ai.DATETIME