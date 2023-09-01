package com.android.dmarketclonecoding

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import java.text.DecimalFormat

class Adapter(val mContext: Context, val mItems: MutableList<MyItem>) : BaseAdapter() {

    override fun getCount(): Int {
        return mItems.size
    }

    override fun getItem(position: Int): Any {
        return mItems[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    @SuppressLint("SetTextI18n")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var convertView = convertView
        if (convertView == null) convertView = LayoutInflater.from(parent?.context).inflate(R.layout.item_listview, parent, false)

        val item : MyItem = mItems[position]

        val iconImageView = convertView?.findViewById<View>(R.id.imageView) as ImageView
        val tv_title = convertView.findViewById<View>(R.id.itemTitle) as TextView
        val tv_region = convertView.findViewById<View>(R.id.itemRegion) as TextView
        val tv_price = convertView.findViewById<View>(R.id.itemPrice) as TextView
        val tv_LikeCount = convertView.findViewById<View>(R.id.textView5) as TextView
        val tv_ReplyCount = convertView.findViewById<View>(R.id.textView6) as TextView


        iconImageView.setImageResource(item.aIcon)
        tv_title.text = item.aTitle
        tv_region.text = item.aRegion
        tv_price.text = DecimalFormat("#,###").format(item.aPrice)+"원"
        tv_LikeCount.text = item.aLikeCount.toString()
        tv_ReplyCount.text = item.aReplyCount.toString()

        return convertView
    }
}