package Logic;

public class MainLogic {
	String season, type, soil;
	int i, j=0;
	String[] result;
	public String[] getResult() {
		if(season.equals("kharif")){
			if(type.equals("cereals")){
				result[0] = "Rice"; 
				result[1] = "Jowar"; 
				result[2] = "Bajra"; 
				result[3] = "Maize"; 
				result[4] = "Small Millets"; 
				return result;
			}
			if(type.equals("pulses")){
				result[0] = "Tur"; 
				result[1] = "Moong"; 
				result[2] = "Moth"; 
				result[3] = "Urad"; 
				result[4] = "Chowla"; 
				return result;
			}
			if(type.equals("oil seeds")){
				result[0] = "GroundNut"; 
				result[1] = "Caster Seed"; 
				result[2] = "Seasumsum"; 
				result[3] = "Soyabean"; 
				return result;
			}
			if(type.equals("cash crops")){
				result[0] = "Cotton"; 
				result[1] = "Guar"; 
				result[2] = "Sugarcane"; 
				result[3] = "Sanhemp"; 
				result[4] = "Chillies"; 
				return result;
			}
		}
		
		if(season.equals("Rabi")){
			if(type.equals("cereals")){
				result[0] = "Wheat"; 
				result[1] = "Barely"; 
				result[2] = "Millets"; 
				return result;
			}
			if(type.equals("pulses")){
				result[0] = "Gram"; 
				result[1] = "Masoor"; 
				result[2] = "Matar"; 
				result[3] = "Sunflower"; 
				result[4] = "Batla"; 
				return result;
			}
			if(type.equals("oil seeds")){
				result[0] = "Caster Seeds";
				result[1] = "Tarameera";
				result[2] = "Rape & Muster";
				result[3] = "Lineseed";
				return result;
			}
		}	
		return result;
	}
}
