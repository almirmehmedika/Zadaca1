
public class Animals {

	
		 private String name;
		 private String sound;
		 private boolean wild;
		 private String habitats;
		 private String whatSheEat;
		 private Integer numberOfExtremities;
		
		public Animals(String name, String sound, boolean wild,
				String habitats, String whatSheEat, Integer numberOfExtremities) {
			super();
			this.name = name;
			this.sound = sound;
			this.wild = wild;
			this.habitats = habitats;
			this.whatSheEat = whatSheEat;
			this.numberOfExtremities = numberOfExtremities;
		}
		
		public String toString() {
				String s = "";
				s = s + "Name: " + name + "\n";
				s = s + "Sound: " + sound + "\n";
				s = s + "Wild: " + wild + "\n";
				s = s + "Habitats: " + habitats + "\n";
				s = s + "What she eat : " + whatSheEat + "\n";
				s = s + "Number of extremities: " + numberOfExtremities + "\n";
				return s;
		}
	}


