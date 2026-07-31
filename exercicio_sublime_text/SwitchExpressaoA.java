public class SwitchExpressaoA{
	public static void main(String[] args){
		String day = "Ter";

		String diaDaSemana = switch(day){

		case "Seg", "Ter", "Qua", "Qui", "Sex" -> "Dia Útil";
		case "Sab", "Dom" -> "Fim de semana";

		default -> "Desconhecido";
		
		};
		System.out.println(diaDaSemana);

	}
}