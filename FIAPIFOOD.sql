INSERT INTO t_restaurante (
    cd_restaurante,
    nm_restaurante,
    nr_cnpj,
    vl_pedido_min
) VALUES (
seq_rest.nextval, 'Churras do bom', 74185296387, 25
);

INSERT INTO "T_PRATO" (
CD_PRATO, NM_PRATO, DESC_PRATO, VL_PRATO, CD_RESTAURANTE, CD_TIPO_COMIDA, CD_ESTILO_COZINHA) 
VALUES ('2', 'burger bolado', 'Hamburger de 180g, pão biroche, queijo azul, costela desfiada, molho bbq', '35', '14', '2', '3')

select * from t_estilo_cozinha;

select * from t_restaurante;

select * from t_tipo_comida;

select * from t_prato;

DELETE * FROM t_restaurante

create or replace procedure sp_insert_restaurante(
p_nome in t_restaurante.nm_restaurante%type,
p_cpnj in t_restaurante.nr_cnpj%type,
p_pedido_min in t_restaurante.vl_pedido_min%type)
is begin

insert into t_restaurante values (seq_rest.nextval, p_nome, p_cnpj, p_pedido_min);

commit;

end;