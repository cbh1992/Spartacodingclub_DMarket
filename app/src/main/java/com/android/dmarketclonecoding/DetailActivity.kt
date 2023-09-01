package com.android.dmarketclonecoding

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.provider.SyncStateContract
import android.provider.SyncStateContract.Constants
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import com.android.dmarketclonecoding.databinding.ActivityDetailBinding
import com.android.dmarketclonecoding.databinding.ActivityMainBinding
import java.text.DecimalFormat

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    private val aLike = false
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)




        //MainActivity에서 받아온걸 구현

        var Image = findViewById<ImageView>(R.id.DetailImage)
        var Title = findViewById<TextView>(R.id.SellProductTitle)
        var Detail = findViewById<TextView>(R.id.SellProductDetail)
        var Name = findViewById<TextView>(R.id.SellerName)
        var Price = findViewById<TextView>(R.id.DetailPrice)
        var Region = findViewById<TextView>(R.id.SellerRegion)
        var Like = findViewById<ImageView>(R.id.LikeIcon)

        val image = intent.getIntExtra("image",0)
        val title = intent.getStringExtra("title")
        val detail = intent.getStringExtra("subscrib")
        val name = intent.getStringExtra("name")
        val price = intent.getIntExtra("price",0)
        val region = intent.getStringExtra("region")
        val like = intent.getStringExtra("like")

        //Image.setImageResource(image)  //실행시 이미지가 제대로 출력되지 않음
        Title.text="$title"
        Detail.text="$detail"
        Name.text="$name"
        Price.text= DecimalFormat("#,###").format(price)+"원"
        Region.text="$region"

        //백버튼 클릭시 효과
        val back = findViewById<ImageView>(R.id.BackButton)
        back.setOnClickListener { finish() }



    }
}