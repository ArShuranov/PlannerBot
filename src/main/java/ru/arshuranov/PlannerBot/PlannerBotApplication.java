package ru.arshuranov.PlannerBot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.arshuranov.PlannerBot.model.Reminder;

import java.time.LocalDate;
import java.time.LocalTime;

@SpringBootApplication
public class PlannerBotApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlannerBotApplication.class, args);

		/*Reminder reminder = new Reminder(1, 2023, 2, 20);
		System.out.println(reminder);
		LocalDate localDate = LocalDate.of(reminder.getDay(), reminder.getMonth(), reminder.getYear());
		System.out.println(localDate);
		System.out.println(localDate.getDayOfWeek().toString());
		LocalTime localTime = LocalTime.of(14,15);
		System.out.println(localTime);*/

	}

}
