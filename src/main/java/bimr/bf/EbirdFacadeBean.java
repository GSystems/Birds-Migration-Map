package bimr.bf;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import bimr.bf.transformer.MapTransformer;
import bimr.bfcl.EbirdFacade;
import bimr.bfcl.dto.EbirdRequestDTO;
import bimr.bfcl.dto.EbirdResponseDTO;
import bimr.df.EbirdRepo;
import bimr.util.EbirdsEnum;

/**
 * @author GLK
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class EbirdFacadeBean implements EbirdFacade {

	@Inject
	private EbirdRepo repo;

	@Override
	public void persistEbirdData(EbirdResponseDTO response) {
		repo.insertEbirdData(MapTransformer.toEbirdResponseFromDTO(response).getEbirdData());
	}

	@Override
	public EbirdResponseDTO retrieveEbirdNotableObservationsInRegion() {
		return retrieveEbirdDataFromApi(getRequest(EbirdsEnum.RECENT_NOTABLE_OBSERVATIONS_IN_REGION.getCode()));
	}

	@Override
	public EbirdResponseDTO retrieveEbirdNearbyNotableObservations() {
		return retrieveEbirdDataFromApi(getRequest(EbirdsEnum.RECENT_NEARBY_NOTABLE_OBSERVATIONS.getCode()));
	}

	@Override
	public EbirdResponseDTO retrieveEbirdNotableObservationsAtHotspots() {
		return retrieveEbirdDataFromApi(getRequest(EbirdsEnum.RECENT_NOTABLE_OBSERVATIONS_AT_HOTSPOTS.getCode()));
	}

	@Override
	public EbirdResponseDTO retrieveEbirdObservationsOfSpeciesAtHotspots() {
		return retrieveEbirdDataFromApi(getRequest(EbirdsEnum.RECENT_OBSERVATIONS_OF_SPECIES_AT_HOTSPOTS.getCode()));
	}

	@Override
	public EbirdResponseDTO retrieveEbirdHotspotSightingsSummary() {
		return retrieveEbirdDataFromApi(getRequest(EbirdsEnum.HOTSPOT_SIGHTINGS_SUMMARY_API_REQUEST_URI.getCode()));
	}

	private EbirdResponseDTO retrieveEbirdDataFromApi(EbirdRequestDTO request) {
		return MapTransformer.fromEbirdResponseToDTO(repo.retrieveEbirdData(MapTransformer.toEbirdRequestFromDTO(request)));
	}

	private EbirdRequestDTO getRequest(String uri) {
		EbirdRequestDTO request = new EbirdRequestDTO();
		request.setRequestUriPattern(uri);
		return request;
	}
}
