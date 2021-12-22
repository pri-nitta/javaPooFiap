-- SCRIPT DE CRIACAO DO SISTEMA DE IMPLANTAÇÃO DE PROJETOS

/*
-- exclusão das tabelas e respectivos relacionamentos
--Ele vai excluir primeiro os relacionamentos
DROP TABLE T_SIP_DEPARTAMENTO CASCADE CONSTRAINTS;
DROP TABLE T_SIP_FUNCIONARIO CASCADE CONSTRAINTS;
*/

CREATE TABLE t_sip_departamento (
    cd_depto  NUMBER(2) NOT NULL,
    nm_depto  VARCHAR2(30) NOT NULL
);

ALTER TABLE t_sip_departamento ADD CONSTRAINT pk_sip_departamento PRIMARY KEY ( cd_depto );

ALTER TABLE t_sip_departamento ADD CONSTRAINT un_sip_depto_nome UNIQUE ( nm_depto );

CREATE TABLE t_sip_funcionario (
    nr_matricula    NUMBER(5) NOT NULL,
    nm_funcionario  VARCHAR2(60) NOT NULL,
    cd_depto        NUMBER(2) NOT NULL,
    dt_nascimento   DATE NULL,
    dt_admissao     DATE NOT NULL,
    vl_salario      NUMBER(7, 2) NOT NULL,
    ds_endereco     VARCHAR2(80) NOT NULL
);

ALTER TABLE t_sip_funcionario ADD CONSTRAINT pk_sip_funcionario PRIMARY KEY ( nr_matricula );

ALTER TABLE t_sip_funcionario ADD CONSTRAINT ck_sip_func_salario CHECK ( vl_salario >= 937 );

-- CHAVE ESTRANGENRIA - RELACIONAMENTO ENTRE FUNCIONARIO E DEPTO
-- só depois de toda a construção
ALTER TABLE t_sip_funcionario
    ADD CONSTRAINT fk_sip_depto_func FOREIGN KEY ( cd_depto )
        REFERENCES t_sip_departamento ( cd_depto );