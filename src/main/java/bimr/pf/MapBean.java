package bimr.pf;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import bimr.bfcl.EbirdFacade;
import bimr.bfcl.TweetFacade;
import bimr.bfcl.dto.EbirdRequestDTO;
import bimr.rf.ebird.wrapper.EbirdRequestWrapper;
import bimr.util.EbirdsEnum;

/**
 * @author GLK
 */
@ManagedBean
@ViewScoped
public class MapBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private transient MapModel mapModel;

	@EJB
	private transient EbirdFacade ebirdFacade;

	@EJB
	private transient TweetFacade tweetFacade;

	@PostConstruct
	public void init() {
		mapModel = new MapModel();
		mapModel.setTweets(tweetFacade.retrieveTweetsFromDB());
	}

	public void retrieveEbirdNotableObservationsInRegion() {
		EbirdRequestDTO request = new EbirdRequestDTO();
		request.setRequestUriPattern(EbirdsEnum.RECENT_NOTABLE_OBSERVATIONS_IN_REGION.name());
		mapModel.setEbirdData(ebirdFacade.retrieveEbirdDataFromApi(request).getEbirdData());
	}
	
	public void retrieveEbirdNearbyNotableObservations() {
		EbirdRequestDTO request = new EbirdRequestDTO();
		request.setRequestUriPattern(EbirdsEnum.RECENT_NEARBY_NOTABLE_OBSERVATIONS.name());
		mapModel.setEbirdData(ebirdFacade.retrieveEbirdDataFromApi(request).getEbirdData());
	}
	
	public void retrieveEbirdNotableObservationsAtHotspots() {
		EbirdRequestDTO request = new EbirdRequestDTO();
		request.setRequestUriPattern(EbirdsEnum.RECENT_NOTABLE_OBSERVATIONS_AT_HOTSPOTS.name());
		mapModel.setEbirdData(ebirdFacade.retrieveEbirdDataFromApi(request).getEbirdData());
	}
	
	public void retrieveEbirdObservationsOfSpeciesAtHotspots() {
		EbirdRequestDTO request = new EbirdRequestDTO();
		request.setRequestUriPattern(EbirdsEnum.RECENT_OBSERVATIONS_OF_SPECIES_AT_HOTSPOTS.name());
		mapModel.setEbirdData(ebirdFacade.retrieveEbirdDataFromApi(request).getEbirdData());
	}
	
	public void retrieveEbirdHotspotSightingsSummary() {
		EbirdRequestDTO request = new EbirdRequestDTO();
		request.setRequestUriPattern(EbirdsEnum.HOTSPOT_SIGHTINGS_SUMMARY_API_REQUEST_URI.name());
		mapModel.setEbirdData(ebirdFacade.retrieveEbirdDataFromApi(request).getEbirdData());
	}

	public EbirdFacade getEbirdFacade() {
		return ebirdFacade;
	}

	public void setEbirdFacade(EbirdFacade ebirdFacade) {
		this.ebirdFacade = ebirdFacade;
	}

	public TweetFacade getTweetFacade() {
		return tweetFacade;
	}

	public void setTweetFacade(TweetFacade tweetFacade) {
		this.tweetFacade = tweetFacade;
	}

	public MapModel getMapModel() {
		return mapModel;
	}

	public void setMapModel(MapModel mapModel) {
		this.mapModel = mapModel;
	}

}