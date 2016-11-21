package com.mycompany.model.implimentation;

import java.util.Random;

import com.mycompany.model.entity.User;

public class RandomGenerator {
	Random rand = new Random();
	String[] surNames = { "Jacinta f", "Shakita f", "Martine f", "Chloe f", "Joella f", "Carolann f", "Jayme f",
			"Pearl f", "Donnie m", "Dierdre f", "Galina f", "Clementina f", "Adrien f", "Maureen f", "Darby f",
			"Tabitha f", "Lupita f", "Chin f", "Max m", "Kip m", "Dusty m", "Daniel m", "Vance m", "Dale m", "Eddie m",
			"Reuben m", "Wyatt m", "Duane m", "Kirby m", "Elliot m", "Marquis m", "Cleveland m", "Loyd m", "Harrison m",
			"Jackie m", "Van m", "Woodrow m", "Paul m", "Mathew m", "Kent m", "Santiago m", "Ellis m", "Dewitt m",
			"Franklin m", "Stephan m", "Adolfo m", "Fredric m", "Connie m", "Lowell m", "Shirley m", "Floyd m",
			"Martin m", "Manuel m", "Major m", "Leigh m", "Brock m", "Alberto m", "Mohammad m", "Jesus m", "Brett m",
			"Rafael m", "Jerrell m", "Tanner m", "Billie m", "Bret m", "Cole m", "Kenny m", "Luigi m", "Edmundo m",
			"Manual m", "Kiera f", "Filomena f", "Dalene f", "Ouida f", "Candace f", "Yahaira f", "Gianna f",
			"Madalyn f", "Mellie f", "Maricela f", "Nella f", "Kaila f", "Beulah f", "Mariana f", "Leisa f",
			"Joellen f", "Venessa f", "Chu f", "Leida f", "Cira f", "Darby f", "Myrl f", "Alethia f", "Shemeka f",
			"Pamula f", "Tameika f", "Catherin f", "Loraine f", "Ardelia f", "Tran f", "Chandra f", "Jeane f",
			"Kerrie f", "Wilhelmina f", "Rosalina f", "Deb f", "Malika f", "Veta f", "Marylou f", "Marietta f",
			"Juliana f", "Nicolle f", "Justa f", "Rosalinda f", "Lexie f", "Trudy f", "Ebony f", "Casimira f",
			"Magen f", "Gia f" };

	String[] names = { "Copp", "Jacquemin", "Thoman", "Corry", "Byford", "Spiess", "Ciotti", "Herandez", "Mcilvaine",
			"Rhoades", "Schlager", "Schmitmeyer", "Cardon", "Skelton", "Tegeler", "Carollo", "Lusher", "Dedman",
			"Terlizzi", "Krider", "Moroz", "Banning", "Bolding", "Linn", "Rocha", "Hilts", "Kish", "Cheatham", "Rozman",
			"Wieland", "Wurst", "Effinger", "Batman", "Vogel", "Tindel", "Philippe", "Doxey", "Chasteen", "Garey",
			"Brannan", "Eck", "Suitt", "Perkin", "Mcgraw", "Styron", "Kimmons", "Stotz", "Chill", "Miltenberger",
			"Wasilewski", "Poirer", "Buckelew", "Speller", "Fiedler", "Moylan", "Clune", "Agustin", "Kiker", "Farina",
			"Parkhurst", "Brogden", "Thibeault", "Kilmer", "Deak", "Regalado", "Stitt", "Rodrick", "Hoy", "Kemper",
			"Calderwood", "Bloodsaw", "Hahn", "Mohr", "Haralson", "Santigo", "Mcdonough", "Tooker", "Molton", "Buchner",
			"Rotunno", "Wilton", "Pullin", "Coyle", "Piatt", "Willams", "Abad", "Bucci", "Lindauer", "Orosz",
			"Sternberg", "Dockstader", "Rester", "Swanger", "Avendano", "Lebeau", "Oxendine", "Saucier", "Mcglothlin",
			"Crampton", "Fairley", "Rue", "Haus", "Oberholtzer", "Most", "Lauder", "Mutch", "Mattoon", "Hans", "Chiu",
			"Leming", "Vreeland", "Kerley", "Aiken", "Holdridge", "Nave", "Koop", "Espada", "Monger", "Chancey",
			"Hosmer" };

	public User getRadomUser() {
		User randomUser = new User();
		randomUser.setName(names[rand.nextInt(120)]);
		String surName = surNames[rand.nextInt(120)];
		randomUser.setSurName(surName.split(" ")[0]);
		randomUser.setSexe(surName.split(" ")[1]);
//		randomUser.set
		return randomUser;
	}
}
