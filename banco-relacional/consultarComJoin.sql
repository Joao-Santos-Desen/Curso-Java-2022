select e.nome as estado, c.nome as cidade, e.regiao as regiao from estados e, cidades c
where e.id = c.estado_id;

select c.nome as cidade, e.nome as estado, regiao as regiao from estados e inner join cidades c on e.id = c.estado_id