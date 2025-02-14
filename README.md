# Spring Boot Microservices Project

Nama: Salsabil Khoirunisa  
NIM: 221524058  
Tugas Mata Kuliah PPLBO

Proyek ini merupakan implementasi tutorial Spring Boot Microservices dari YouTube Programming Techie. Teknologi yang digunakan diantaranya MongoDB, MySQL, Docker, Flyway, Spring Boot, Kafka, dan Resilience4J.

## Struktur Proyek

Proyek ini terdiri dari beberapa layanan mikro yang diatur dalam direktori terpisah:

- `inventory-service`: Layanan untuk mengelola inventaris produk.
- `order-service`: Layanan untuk mengelola pesanan.
- `product-service-sabil`: Layanan untuk mengelola produk.

## Teknologi yang Digunakan

- **Spring Boot**: Framework untuk membangun aplikasi Java berbasis Spring.
- **MongoDB**: Database NoSQL yang digunakan oleh `product-service-sabil`.
- **MySQL**: Database relasional yang digunakan oleh `inventory-service` dan `order-service`.
- **Docker**: Platform untuk mengembangkan, mengirim, dan menjalankan aplikasi dalam kontainer.
- **Flyway**: Alat untuk migrasi database.
- **Kafka**: Platform streaming untuk membangun pipeline data real-time.
- **Resilience4J**: Library untuk membangun aplikasi yang tangguh dan fault-tolerant.
