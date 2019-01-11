<?php
/**
 * The base configuration for WordPress
 *
 * The wp-config.php creation script uses this file during the
 * installation. You don't have to use the web site, you can
 * copy this file to "wp-config.php" and fill in the values.
 *
 * This file contains the following configurations:
 *
 * * MySQL settings
 * * Secret keys
 * * Database table prefix
 * * ABSPATH
 *
 * @link https://codex.wordpress.org/Editing_wp-config.php
 *
 * @package WordPress
 */

// ** MySQL settings - You can get this info from your web host ** //
/** The name of the database for WordPress */
define('DB_NAME', 'elektricisti');

/** MySQL database username */
define('DB_USER', 'root');

/** MySQL database password */
define('DB_PASSWORD', 'root');

/** MySQL hostname */
define('DB_HOST', 'localhost');

/** Database Charset to use in creating database tables. */
define('DB_CHARSET', 'utf8mb4');

/** The Database Collate type. Don't change this if in doubt. */
define('DB_COLLATE', '');

/**#@+
 * Authentication Unique Keys and Salts.
 *
 * Change these to different unique phrases!
 * You can generate these using the {@link https://api.wordpress.org/secret-key/1.1/salt/ WordPress.org secret-key service}
 * You can change these at any point in time to invalidate all existing cookies. This will force all users to have to log in again.
 *
 * @since 2.6.0
 */
define('AUTH_KEY',         '*Mg:YCPM}1,r>MHo,M)Sf[?i3*$PU,#RKwt.lz+7e9UGx3s>v_ _Pb)zx]k~/rg;');
define('SECURE_AUTH_KEY',  '&%zLx^UAXdV5c7Vpz![tdc?88 -lQ%[_Zs;l?Ca||yHd}y<S35O45vF~e5LR&qo/');
define('LOGGED_IN_KEY',    '@-L{]FF|XI@l~7$sO(zM+4]#;<*Vw|nV=4cNyaD@YxB<4#9SR{u#@f^oMQVlsaA9');
define('NONCE_KEY',        '[mX|,3Llvx@tf(k!yD[3t-kl)^WqfT@R9$w8[Yfc-i<,5uu_ohAU.^&;9u!f4B]H');
define('AUTH_SALT',        'vqc/*_5lL4S5Y]` jP.SFaO8uAm6Zr[Q!=N2S<NQxd+<5eF2%$k*9E1N:P^OmpzW');
define('SECURE_AUTH_SALT', 'x%8M@.HB$T`y}:h!5nshKqK_4L+lX%+9}_N+TC<t|naJZH^`>N/S9BZ1E_XTxK4$');
define('LOGGED_IN_SALT',   'A psoQ0&@aj+gceu/z,Pny}F@6s{-^[/%!,,Icm|ElhOR _|*8v8Ome(_qd}(B[:');
define('NONCE_SALT',       '::w~IXe|CL6L=Vb=DXcRAS5&EkyZ)a{gpgx:)PW(HArL8om6gLGWv0)J!ieFgkJ+');

/**#@-*/

/**
 * WordPress Database Table prefix.
 *
 * You can have multiple installations in one database if you give each
 * a unique prefix. Only numbers, letters, and underscores please!
 */
$table_prefix  = 'wp_';

/**
 * For developers: WordPress debugging mode.
 *
 * Change this to true to enable the display of notices during development.
 * It is strongly recommended that plugin and theme developers use WP_DEBUG
 * in their development environments.
 *
 * For information on other constants that can be used for debugging,
 * visit the Codex.
 *
 * @link https://codex.wordpress.org/Debugging_in_WordPress
 */
define('WP_DEBUG', false);

/* That's all, stop editing! Happy blogging. */

/** Absolute path to the WordPress directory. */
if ( !defined('ABSPATH') )
	define('ABSPATH', dirname(__FILE__) . '/');

/** Sets up WordPress vars and included files. */
require_once(ABSPATH . 'wp-settings.php');
