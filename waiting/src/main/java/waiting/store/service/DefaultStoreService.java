package wating.store.service;


@Service
@Transactional
public class DefaultStoreService {

    StoreDao storeDao;
    UserDao userDao;


    /**
     * 전체 가게 조회
     */

    TODO: Pagenation 적용 여부


    public List<Store> getAllStore() {


    }

    /**
     * 가게 상세 조회
     */

    public List<Store> getStoreById(Long id) {
         return StoreDao.findById(id);
    }

    /**
     * 가게 등록
     */

    public Store registerStore() {
        Store store = new Store();
        store.setUser(Store.getUser());
        store.setName(Store.getName());
        store.setLicenseNo(Store.getLicenseNo());
        store.setAddress(Store.getAddress());
        store.setInfo(Store.getInfo());
        store.setContent(Store.getContent());
        store.setStoreNumber(Store.geStoreNumber());
        store.setMenu(Store.getMenu());
        Store.setWeekDayOpenTime(Store.getWeekDayOpenTime());
        Store.setWeekDayCloseTime(Store.getWeekDayCloseTime());
        Store.setWeekendOpenTime(Store.getWeekendOpenTime());
        Store.setWeekendCloseTime(Store.getWeekendCloseTime());

        ArrayList<AttachedFile> attachedFiles = new ArrayList<>();

        store.setAttachedFiles(attachedFiles);
        this.StoreService.add(store);
        return store;
    }





}