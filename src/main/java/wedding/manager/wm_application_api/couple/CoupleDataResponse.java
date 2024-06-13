package wedding.manager.wm_application_api.couple;

public record CoupleDataResponse(

        String fianceName,

        String fianceeName
) {

    public CoupleDataResponse(Couple couple) {
        this(couple.getFianceName(), couple.getFianceeName());
    }
}
