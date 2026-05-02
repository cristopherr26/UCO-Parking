package co.edu.uco.ucoparking.crosscutting.messagescatalog;

import co.edu.uco.ucoparking.crosscutting.helper.TextHelper;

public enum MessagesEnum {
	
	USER_ERROR_TRYING_TO_ADD_NEW_VEHICLE("Problema al registrar el vehículo", "No pudimos completar el registro del nuevo vehículo en este momento. Por favor, verifica que todos los datos de la placa y el tipo de vehículo sean correctos e intenta de nuevo. Si el problema persiste, contacta al administrador del parqueadero."),
	TECHNICAL_ERROR_TRYING_TO_ADD_NEW_VEHICLE("Error en el flujo de persistencia/validación de AddVehicleUseCase", "e produjo una excepción inesperada al intentar procesar la entidad VehicleDomain durante la ejecución del caso de uso 'AddNewVehicle'. El fallo ocurrió antes de la persistencia en la capa de infraestructura.");
	
	private String title;
	private String content;
	
	
	private MessagesEnum(final String title, final String content) {
		setTitle(title);
		setContent(content);
	}


	public String getTitle() {
		return title;
	}


	private void setTitle(final String title) {
		this.title = TextHelper.getDefaultWithTrim(title);
	}


	public String getContent() {
		return content;
	}


	private void setContent(final String content) {
		this.content = TextHelper.getDefaultWithTrim(content);
	}
	
}

