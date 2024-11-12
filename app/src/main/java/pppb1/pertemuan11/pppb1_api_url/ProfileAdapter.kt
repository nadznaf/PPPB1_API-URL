package pppb1.pertemuan11.pppb1_api_url

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso
import pppb1.pertemuan11.pppb1_api_url.model.Data

class ProfileAdapter(private val context: Context, private val profileList: List<Data>) : BaseAdapter() {

    // Mengembalikan jumlah item dalam userList
    override fun getCount(): Int = profileList.size
    // Mengembalikan objek DataNew pada posisi tertentu di userList
    override fun getItem(position: Int): Any = profileList[position]
    // Mengembalikan ID unik dari item di userList pada posisi tertentu
    override fun getItemId(position: Int): Long = profileList[position].id.toLong()
    // membuat dan mengembalikan tampilan (view) setiap item di ListView
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.profile_item, parent, false)
        val profile = profileList[position]

        val ivAvatar = view.findViewById<ImageView>(R.id.profile_image)
        val tvName = view.findViewById<TextView>(R.id.name_text)
        val tvEmail = view.findViewById<TextView>(R.id.email_text)

        tvName.text = "${profile.first_name} ${profile.last_name}"
        tvEmail.text = profile.email
        Picasso.get().load(profile.avatar).into(ivAvatar)

        return view
    }
}