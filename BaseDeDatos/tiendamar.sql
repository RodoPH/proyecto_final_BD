-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-04-2017 a las 21:14:01
-- Versión del servidor: 10.1.21-MariaDB
-- Versión de PHP: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `tiendamar`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `articulos`
--

CREATE TABLE `articulos` (
  `id_art` int(100) NOT NULL,
  `codigo` varchar(10) DEFAULT NULL,
  `descripcion` varchar(100) DEFAULT NULL,
  `unidad` varchar(15) DEFAULT NULL,
  `precio_u` float DEFAULT NULL,
  `precio_Mmay` float DEFAULT NULL,
  `precioMay` float DEFAULT NULL,
  `existencia` int(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `id_cliente` int(11) NOT NULL,
  `nombre_cliente` varchar(50) DEFAULT NULL,
  `AP_cliente` varchar(40) DEFAULT NULL,
  `AM_cliente` varchar(40) DEFAULT NULL,
  `tel_movil_cliente` varchar(15) DEFAULT NULL,
  `ciudad_cliente` varchar(40) DEFAULT NULL,
  `calle_cliente` varchar(40) DEFAULT NULL,
  `colonia_cliente` varchar(40) DEFAULT NULL,
  `numExt_cliente` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `concentrado`
--

CREATE TABLE `concentrado` (
  `id_concentrado` int(11) NOT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `total` float DEFAULT NULL,
  `id_articulo` int(11) DEFAULT NULL,
  `id_cliente` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleados`
--

CREATE TABLE `empleados` (
  `id_empleado` int(11) NOT NULL,
  `nombre` text,
  `apellidos` varchar(80) DEFAULT NULL,
  `telefono_emp` text,
  `sueldo` float DEFAULT NULL,
  `fecha` varchar(30) DEFAULT NULL,
  `prestamo` float DEFAULT NULL,
  `totalSemana` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `empleados`
--

INSERT INTO `empleados` (`id_empleado`, `nombre`, `apellidos`, `telefono_emp`, `sueldo`, `fecha`, `prestamo`, `totalSemana`) VALUES
(8, 'MARIELY', 'GALVAN ANTONIO', '2351080572', 15000, '24/3/2017   2:55:34', 10000, 5000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id_usr` int(11) NOT NULL,
  `usr` varchar(35) DEFAULT NULL,
  `nombre_usr` varchar(40) DEFAULT NULL,
  `apellidoP_usr` varchar(40) DEFAULT NULL,
  `apellidoM_usr` varchar(40) DEFAULT NULL,
  `contraseña_usr` varchar(40) DEFAULT NULL,
  `fecha` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id_usr`, `usr`, `nombre_usr`, `apellidoP_usr`, `apellidoM_usr`, `contraseña_usr`, `fecha`) VALUES
(1, 'rodoPH', 'RODOLFO', 'PASTRANA', 'HUERTA', 'holaMundo', '21/2/2017   0:34:30');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `articulos`
--
ALTER TABLE `articulos`
  ADD PRIMARY KEY (`id_art`);

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`id_cliente`);

--
-- Indices de la tabla `concentrado`
--
ALTER TABLE `concentrado`
  ADD PRIMARY KEY (`id_concentrado`),
  ADD KEY `id_articulo` (`id_articulo`),
  ADD KEY `id_cliente` (`id_cliente`);

--
-- Indices de la tabla `empleados`
--
ALTER TABLE `empleados`
  ADD PRIMARY KEY (`id_empleado`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id_usr`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `articulos`
--
ALTER TABLE `articulos`
  MODIFY `id_art` int(100) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
  MODIFY `id_cliente` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `concentrado`
--
ALTER TABLE `concentrado`
  MODIFY `id_concentrado` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `empleados`
--
ALTER TABLE `empleados`
  MODIFY `id_empleado` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id_usr` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `concentrado`
--
ALTER TABLE `concentrado`
  ADD CONSTRAINT `concentrado_ibfk_1` FOREIGN KEY (`id_articulo`) REFERENCES `articulos` (`id_art`),
  ADD CONSTRAINT `concentrado_ibfk_2` FOREIGN KEY (`id_cliente`) REFERENCES `clientes` (`id_cliente`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
