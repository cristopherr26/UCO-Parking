package co.edu.uco.ucoparking.crosscutting.mapper;

public interface DTOMapper <T, D> {
	
	T toDTO(D domain);
	
	D toDomain(T dto);

}
