INSERT INTO
`alumno` (`rut`, `nombre`, `correo`, `año_ingreso`)
VALUES
('10800466-5', 'Juan Carlos Herrera Cortés', 'jcarlosh2@gmail.com', '2015'),    -- ID: 1
('15942110-4', 'Pedro Armando Casas Ugarte', 'parmacasas23@gmail.com', '2014')  -- ID: 2

INSERT INTO
`facultad` (`nombre`)
VALUES
('Ingeniería'),
('Derecho')

INSERT INTO
`alumno_facultad` (`alumno_id`, `facultad_id`)
VALUES
(1,1),
(2,2)
