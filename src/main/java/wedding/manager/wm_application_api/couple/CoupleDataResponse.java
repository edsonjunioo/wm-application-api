package wedding.manager.wm_application_api.couple;

public record CoupleDataResponse(

        Long id,

        String fianceName,

        String fianceeName
) {

    public CoupleDataResponse(Couple couple) {
        this(couple.getId(), couple.getFianceName(), couple.getFianceeName());
    }
}
