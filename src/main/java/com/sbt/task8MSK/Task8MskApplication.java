package com.sbt.task8MSK;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Task8MskApplication {

	// TODO проименовать все ID в таблицах как ID?
	// TODO не забыть валидацию
	// TODO батчи, получение с пагинацией и фильтрацией
	// Механизм перевода в просоченный
	// Решить, какие cascade использовать
	public static void main(String[] args) {
		SpringApplication.run(Task8MskApplication.class, args);
	}

}
