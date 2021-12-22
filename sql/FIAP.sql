SELECT
    *
FROM
    t_sip_func;

INSERT INTO t_sip_func VALUES (
    006,
    'Maria Lucia',
    1,
    TO_DATE('12/03/1988', 'dd/mm/yyyy'),
    TO_DATE('01/07/2020', 'dd/mm/yyyy'),
    2000.00,
    'Av. xpto, 78'
);

INSERT INTO t_sip_func VALUES (
    005,
    'Ana Paula',
    2,
    TO_DATE('06/07/1995', 'dd/mm/yyyy'),
    TO_DATE('01/05/2018', 'dd/mm/yyyy'),
    1500.00,
    'Av. abc, 40'
);

INSERT INTO t_sip_func VALUES (
    004,
    'Mariana Vieira',
    1,
    TO_DATE('21/10/1989', 'dd/mm/yyyy'),
    TO_DATE('05/11/2019', 'dd/mm/yyyy'),
    3000.00,
    'Av. geyasnhd, 792'
);

INSERT INTO t_sip_func VALUES (
    003,
    'José Luis',
    1,
    TO_DATE('21/10/1983', 'dd/mm/yyyy'),
    TO_DATE('05/11/2021', 'dd/mm/yyyy'),
    7500.00,
    'Av. geiqlsdko, 9563'
);

UPDATE t_sip_func
SET
    vl_salario = vl_salario * 1.10;

-- atualizando varias colunas, campos separados por virgula

UPDATE t_sip_func
SET
    nm_func = 'Maria Lucia Santos',
    ds_endereco = 'Rua Augusto Olavo, 186',
    vl_salario = 5000.00
WHERE
    nr_matricula = 234

-- exclui sempre a linha inteira, e importantissimo ter o where
DELETE FROM t_sip_func
WHERE
    nr_matricula = 741;

-- consulta
-- asterisco não é uma boa prática
SELECT
    *
FROM
    t_sip_func
WHERE
        cd_depto = 1
    AND vl_salario >= 5000;
    
    select nm_func, vl_salario, cd_depto
    from t_sip_func
    where cd_depto =1;
    
    INSERT INTO t_sip_func VALUES (
    001,
    'Juliana ',
    1,
    TO_DATE('21/02/1980', 'dd/mm/yyyy'),
    TO_DATE('05/11/2017', 'dd/mm/yyyy'),
    10000.00,
    'Av. morumbi, 9563'
);

INSERT INTO t_sip_func VALUES (
    002,
    'Renata',
    1,
    TO_DATE('05/02/1978', 'dd/mm/yyyy'),
    TO_DATE('01/11/2015', 'dd/mm/yyyy'),
    13000.00,
    'Av. chucri zaidan, 786'
);

INSERT INTO t_sip_func VALUES (
    007,
    'Joao',
    2,
    TO_DATE('05/02/1979', 'dd/mm/yyyy'),
    TO_DATE('01/03/2016', 'dd/mm/yyyy'),
    20000.00,
    'Cd. fechado, 86'
);

select nm_func, cd_depto FROM t_sip_func ; SELECT DISTINCT CD_DEPTO FROM T_SIP_FUNC ; SELECT NR_MATRICULA , NM_FUNC
    FROM T_SIP_FUNC WHERE UPPER ( NM_FUNC ) = 'JULIANA' ; SELECT NR_MATRICULA , NM_FUNC FROM T_SIP_FUNC WHERE LOWER ( NM_FUNC ) =
    'juliana' ; SELECT NR_MATRICULA , NM_FUNC , DT_ADMISSAO FROM T_SIP_FUNC WHERE DT_ADMISSAO > = TO_DATE ( '01/01/2018' , 'dd/mm/yyyy' ) ;
    
    
    select * from t_sip_func where not cd_depto = 2;
    
    --between intervalos fechados, inclusive as extremidades
    
  SELECT * FROM t_sip_func;  
  
  SELECT nm_func FROM t_sip_func WHERE vl_salario BETWEEN 5000 AND 20000;
  
  SELECT nm_func FROM t_sip_func WHERE dt_admissao BETWEEN TO_DATE ('01/01/2019', 'dd/mm/yyyy') AND TO_DATE ('01/11/2021', 'dd/mm/yyyy');
  
  --IN equivalente a comparação a igualdade com o operador OR
   
   select NM_FUNC from T_SIP_FUNC where CD_DEPTO in (1,2);
   
   select NM_FUNC from T_SIP_FUNC where CD_DEPTO not in (2);
   
   select NM_FUNC, DT_ADMISSAO from T_SIP_FUNC where TO_CHAR (DT_ADMISSAO, 'yyyy') in (2019, 2020, 2021) ;
   
   select NM_FUNC, DT_ADMISSAO from T_SIP_FUNC where DT_NASCIMENTO is not null;
   
   SELECT nm_func FROM t_sip_func WHERE nm_func LIKE 'Ma%';
   
   SELECT nm_func FROM t_sip_func WHERE nm_func LIKE '_u%';
   
   SELECT nm_func FROM t_sip_func WHERE nm_func LIKE '%u%';
   
   SELECT nm_func FROM t_sip_func WHERE nm_func LIKE 'J%' AND dt_admissao > TO_DATE ('01/01/2014', 'dd/mm/yyyy') AND vl_salario > 5000;
   
      SELECT nm_func, dt_admissao, vl_salario FROM t_sip_func order by dt_admissao, vl_salario desc;
      
      SELECT nm_func, dt_admissao, vl_salario FROM t_sip_func order by 3, 1 desc;
      
      SELECT 'O funcionário ' || NM_FUNC || ' foi admitido em ' || DT_ADMISSAO AS TEXTO FROM T_SIP_FUNC ;
      
        SELECT nm_func, dt_admissao, vl_salario FROM t_sip_func where rownum < 4;
        
        SELECT nm_func, vl_salario FROM ( SELECT nm_func, vl_salario from t_sip_func order by vl_salario desc) where rownum <=3;
        
        select F. nr_matricula "matricula", F. nm_func "nome", D. nm_depto "depto" from t_sip_departamento D, t_sip_func F where D. cd_depto = F. cd_depto;
        
        select * from t_sip_departamento , t_sip_func;
        
        select nm_func, vl_salario, (vl_salario * 13) "Salario anual" from t_sip_func order by "Salario anual" desc;
        
        select F. nm_func, D. nm_depto from t_sip_departamento D natural join t_sip_func F;
        
    