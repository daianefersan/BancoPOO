package com.poo.banco;


import com.poo.banco.entities.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

@SpringBootApplication
public class BancoApplication {

	public static void main(String[] args)  {
		SpringApplication.run(BancoApplication.class, args);
		LocalDate localDate1 = LocalDate.of(2004, 10, 8);
		Date date1 = Date.from(localDate1.atStartOfDay(ZoneId.systemDefault()).toInstant());

		Adress adr1 = new Adress(1, "Rua doutor João Barcellos", 126, "Casa A", "Petrópolis",
				"Rio de Janeiro", "25615-171");

		Client client1 = new Client(Client.counterId,
				"Eduardo Cilento",
				"176.270.067-08",
				date1,
				"eduardo.cilento",
				"1245@!M",
				 adr1,// Endereço
				"eduardo@email.com",
				"(24)992568756"
		);

		client1.showRecord();



		CurrentAccount currentAccount1 = new CurrentAccount("Current", client1, "1000-0",
				CurrentAccount.counterId, 1000.0, new Date(), 'A', "Active");

		currentAccount1.showAccountData();
		currentAccount1.showBalance();

		LocalDate localDate2 = LocalDate.of(1973, 10, 23);
		Date date2 = Date.from(localDate1.atStartOfDay(ZoneId.systemDefault()).toInstant());
		Adress adr2 = new Adress(Adress.counterId, "Nogueira", 1172, "Casa C", "Petrópolis",
				"Rio de Janeiro", "25712-123");

		Manager generalManager1= new Manager(Manager.counterId, "Paulo Henrique",
				"765.234.543-09",
				date2,
				"PauloH123",
				"Paulh@1!",
				adr2,
				"pauloh@gmail.com",
				"(24) 992438712",
				"117523",
				new Date(),
				4000.0);
		generalManager1.doubleSalary();

		Adress adrAgency = new Adress(Adress.counterId, "Estrada União Industria", 11000,
				"Itaipava", "Petrópolis",
				"Rio de Janeiro", "25730-735");

		Agency agency1 = new Agency(Agency.counterId, "Banco do Brasil",
				"100-0", generalManager1, "(24) 2222-3200",
				adrAgency);

		System.out.println(generalManager1.toString());
	}

}
