package slode.elsloude.peoplelist

import android.app.ProgressDialog
import android.os.*
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONArray
import slode.elsloude.peoplelist.Data.Data
import slode.elsloude.peoplelist.Data.ListAdapter
import java.net.HttpURLConnection
import java.net.URL
import kotlin.String as String

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val url = "https://jsonplaceholder.typicode.com/"

//        DownloadFilesTask().execute(url)

        val people = listOf(
            Data("Иван"),
            Data("Светлана"),
            Data("Костя"),
            Data("Иван")
        )

        val listAdapterUsers = ListAdapter(people, object : ListAdapter.Callback {
            override fun onItemClicked(item: Data) {
                TODO("Not yet implemented")
            }
        })

        listAdapterUsers.adapter = listAdapterUsers
    }

//    inner class DownloadFilesTask: AsyncTask<String, String, String>() {
//
//        override fun onPreExecute() {
//            super.onPreExecute()
//        }
//
//        override fun doInBackground(vararg url: String?): String {
//            val res: String
//            val connection = URL(url[0]).openConnection()as HttpURLConnection
//            try {
//                connection.connect()
//                res = connection.inputStream.use { it.reader().use { reader->reader.readText() } }
//            }
//            finally {
//                connection.disconnect()
//            }
//            return res
//        }
//
//        override fun onPostExecute(result: String?) {
//            super.onPostExecute(result)
//            jsonRecult(result)
//        }
//
//        private fun jsonRecult(jsonString: String?) {
//            val jsonArray = JSONArray(jsonString)
//            val list = ArrayList<Data>()
//            var i = 0
//            while (i < jsonArray.length()) {
//                val jsonObject = jsonArray.getJSONObject(i)
//                list.add(Data(
//                        jsonObject.getString("name"))
//                )
//                i++
//            }
//        }
//    }
//
}