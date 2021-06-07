import com.example.testapi.network.model.Root
import com.example.testapi.utils.Constance
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.Url

interface ApiService {

    @GET
//    suspend fun getPhotos(): Response<List<Root>>
    suspend fun getPhotos(): Response<ResponseBody>

    @GET
    suspend fun downloadPhoto(@Url url: String): ResponseBody
}