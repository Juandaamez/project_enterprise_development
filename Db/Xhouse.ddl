
CREATE TABLE estudiantes (
    id_estudiante     INTEGER NOT NULL,
    codigo_u          INTEGER,
    nombres           VARCHAR (25 CHAR),
    apellidos         VARCHAR (25 CHAR),
    correo            VARCHAR (50),
    telefono          INTEGER,
    usuario_user_name INTEGER NOT NULL,
    doc               INTEGER
);

CREATE UNIQUE INDEX estudiantes__idx ON
    estudiantes (
        usuario_user_name
    ASC );

ALTER TABLE estudiantes ADD CONSTRAINT estudiantes_pk PRIMARY KEY ( id_estudiante );

CREATE TABLE house (
    id_house INTEGER NOT NULL,
    tipo     VARCHAR (20 CHAR),
    estado   VARCHAR (16 CHAR)
);

ALTER TABLE house ADD CONSTRAINT house_pk PRIMARY KEY ( id_house );

CREATE TABLE house_inventary (
    id_house_inventory 		   INTEGER NOT NULL;
    house_id_house                 INTEGER NOT NULL,
    tipo                           VARCHAR (20),
    nombre_articulo                VARCHAR (20),
    inventario_general_id_articulo INTEGER (20), 

);

ALTER TABLE house_inventary ADD CONSTRAINT house_inventary_pk PRIMARY KEY ( id_house_inventory );

CREATE TABLE inventario_general (
    id_articulo     INTEGER 
    nombre_articulo VARCHAR (20),
    estado          VARCHAR (20),
    accesorio1      VARCHAR (20),
    accesorio2      VARCHAR (20)
);

ALTER TABLE inventario_general ADD CONSTRAINT inventario_general_pk PRIMARY KEY ( id_articulo );

CREATE TABLE reservas (
    id_reservas       INTEGER NOT NULL,
    estado            VARCHAR (16 CHAR),
    house_id_house    INTEGER NOT NULL,
    tiempo            INTEGER,
    usuario_user_name INTEGER NOT NULL
);

ALTER TABLE reservas ADD CONSTRAINT reservas_pk PRIMARY KEY ( id_reservas );

CREATE TABLE usuario (
    user_name                 INTEGER NOT NULL,
    contraseña                VARCHAR  (16 CHAR),
    estudiantes_id_estudiante INTEGER NOT NULL
);

CREATE UNIQUE INDEX usuario__idx ON
    usuario (
        estudiantes_id_estudiante
    ASC );

ALTER TABLE usuario ADD CONSTRAINT usuario_pk PRIMARY KEY ( user_name );

ALTER TABLE estudiantes
    ADD CONSTRAINT estudiantes_usuario_fk FOREIGN KEY ( usuario_user_name )
        REFERENCES usuario ( user_name );

ALTER TABLE house_inventary
    ADD CONSTRAINT house_inventary_house_fk FOREIGN KEY ( house_id_house )
        REFERENCES house ( id_house );

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE house_inventary
    ADD CONSTRAINT house_inventary_inventario_general_fk FOREIGN KEY ( inventario_general_id_articulo )
        REFERENCES inventario_general ( id_articulo );

ALTER TABLE reservas
    ADD CONSTRAINT reservas_house_fk FOREIGN KEY ( house_id_house )
        REFERENCES house ( id_house );

ALTER TABLE reservas
    ADD CONSTRAINT reservas_usuario_fk FOREIGN KEY ( usuario_user_name )
        REFERENCES usuario ( user_name );

ALTER TABLE usuario
    ADD CONSTRAINT usuario_estudiantes_fk FOREIGN KEY ( estudiantes_id_estudiante )
        REFERENCES estudiantes ( id_estudiante );



