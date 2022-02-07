SELECT 
  p.id,
  p.name,
  r.host_id
FROM (
    SELECT 
       HOST_ID,
       COUNT(*) AS cnt
    FROM PLACES
    GROUP BY host_id
    HAVING COUNT(*) >= 2
) AS r
INNER JOIN PLACES as p
ON r.HOST_ID = p.HOST_ID
ORDER BY p.id