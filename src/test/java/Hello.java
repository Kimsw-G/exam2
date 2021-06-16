import com.koreait.spring2.model.SearchDTO;
import com.koreait.spring2.service.ApartService;

public class Hello {



    public static void main(String[] args) {
        SearchDTO searchDTO = new SearchDTO();
        searchDTO.setDeal_year(2015);
        searchDTO.setDeal_month(7);
        searchDTO.setOuter_code(27110);

        ApartService apartService = new ApartService();
        apartService.saveData(searchDTO);
    }
}
