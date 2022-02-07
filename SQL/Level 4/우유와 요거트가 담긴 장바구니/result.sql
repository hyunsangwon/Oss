SELECT
    CART_ID
FROM CART_PRODUCTS
WHERE name IN ('Milk', 'Yogurt')
GROUP BY cart_id
HAVING GROUP_CONCAT(DISTINCT(name)) = 'Milk,Yogurt'

-- GROUP_CONCAT : 그룹별로 데이터를 Concatenate 하는 방법.