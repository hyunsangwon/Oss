-- 코드를 입력하세요
SELECT
    ANIMAL_ID,
    NAME,
    SEX_UPON_INTAKE
FROM ANIMAL_INS
WHERE NAME in ('Ella', 'Lucy', 'Pickle', 'Rogan', 'Sabrina', 'Mitty')
order by ANIMAL_ID

-- 문제는 루시와 엘라찾기 인데 다 찾아야 됨... ;;