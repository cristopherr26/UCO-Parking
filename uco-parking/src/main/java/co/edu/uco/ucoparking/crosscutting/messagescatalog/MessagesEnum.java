package co.edu.uco.ucoparking.crosscutting.messagescatalog;

import co.edu.uco.ucoparking.crosscutting.helper.TextHelper;

public enum MessagesEnum {
	
	USER_ERROR_TRYING_TO_ADD_NEW_VEHICLE("Problema al registrar el vehículo", "No pudimos completar el registro del nuevo vehículo en este momento. Por favor, verifica que todos los datos de la placa y el tipo de vehículo sean correctos e intenta de nuevo. Si el problema persiste, contacta al administrador del parqueadero."),
	TECHNICAL_ERROR_TRYING_TO_ADD_NEW_VEHICLE("Error en el flujo de persistencia/validación de AddVehicleUseCase", "e produjo una excepción inesperada al intentar procesar la entidad VehicleDomain durante la ejecución del caso de uso 'AddNewVehicle'. El fallo ocurrió antes de la persistencia en la capa de infraestructura."),
	TECHNICAL_ERROR_STRING_LENGTH_VALUE("Error tratando de llevar a cabo la operación", "No se recibieron los parametros requeridos para ejecutar la regla StringLengthValueIsValidRule"),
	USER_ERROR_TRYING_TO_MAKE_AN_OPERATION("Error tratando de llevar a cabo la operación", "Se ha presentado un error tratando de llevar a cabo la operación esperada"),
	TECHNICAL_ERROR_WRONG_STRING_LENGTH_VALUE("No fueron ingresados todos los parametros", "Se requerían 5 parametros y llegó una cantidad menor a esta requeridos para ejecutar la regla StringLengthValueIsValidRule"),
	USER_ERROR_WRONG_LENGTH("El dato ingresado tiene una longitud incorrecta",  "El siguiente dato debe tener una longituda de: " ),
	TECHNICAL_ERROR_WRONG_LENGTH("El dato ingresado tiene una longitud incorrecta", "La regla StringLengthValueIsValidRule fallo ya que el siguiente dato debe tener la siguiente longitud: "),
	TECHNICAL_ERROR_STRING_FORMAT_VALUE("Error tratando de llevar a cabo la operación", "No se recibieron los parametros requeridos para ejecutar la regla StringFormatValueIsValidRule"),
	TECHNICAL_ERROR_WRONG_STRING_FORMAT_VALUE("No fueron ingresados todos los parametros", "Se requerían 4 parametros y llegó una cantidad menor a esta requeridos para ejecutar la regla StringFormatValueIsValidRule"),
	USER_ERROR_WRONG_FORMAT("El dato ingresado tiene un formato incorrecto",  "El siguiente dato NO cumple con los caracteres estipulados para este campo: " ),
	TECHNICAL_ERROR_WRONG_FORMAT("El dato ingresado tiene un formato incorrecto", "La regla StringFormatValueIsValidRule fallo ya que el siguiente dato debe contener solo los siguientes caracteres:  "),
	TECHNICAL_ERROR_VALUE_VEHICLE_IS_NOT_PRESENT("Error tratando de llevar a cabo la operación", "No se recibieron los parametros requeridos para ejecutar el validator ValidateDataUserConsistencyForRegisterNewInformation"),
	TECHNICAL_ERROR_WRONG_VEHICLE_LENGTH_VALUE_IS_NOT_PRESENT("No fueron ingresados todos los parametros", "Se requería 1 parametro y llegó una cantidad menor a esta requerida para ejecutar el validator ValidateDataUserConsistencyForRegisterNewInformation"),
	TECHNICAL_ERROR_VALUE_IS_NOT_PRESENT("Error tratando de llevar a cabo la operación", "No se recibieron los parametros requeridos para ejecutar la regla StringIsPresentRule"),
	TECHNICAL_ERROR_WRONG_STRING_LENGTH_IS_PRESENT("No fueron ingresados todos los parametros", "Se requerían 3 parametros y llegó una cantidad menor a esta requeridos para ejecutar la regla StringIsPresentRule"),
	USER_ERROR_INCOMPLETE_PARAMETERS("No se enviaron todos los datos necesarios", "El dato es necesario para llevar a cabo la operación: "),
	TECHNICAL_ERROR_INCOMPLETE_PARAMETERS("No se enviaron todos los datos necesarios", "La regla StringValueIsPresent falló porque el siguiente dato requerido para llevar a cabo la operación está vacío: "),
	TECHNICAL_ERROR_UUID_IS_DEFAULT("UUID por defecto", "La operacion no pudo ser llevada a cabo, ya que en el el siguiente dato fue ingresado el uuid por defecto: "),
	TECHNICAL_ERROR_PLATE_IS_NOT_PRESENT("No se pasaron datos para validar la placa", "El valor de la placa llegó nulo, por lo que no se puede continuar"),
	VEHICLE_SUCESSFULLY_REGISTERED("Éxito vehículo creado", "El vehículo se ha registrado correctamente en el sistema.");

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

