package com.satmatgroup.mewarpe.services_and_products

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.satmatgroup.mewarpe.R
import com.satmatgroup.mewarpe.model.BannerModel
import com.smarteist.autoimageslider.SliderViewAdapter

class SliderBannerAdapter(private val mSliderItems: List<SliderBannerModel>, context: Context) :
    SliderViewAdapter<SliderAdapterViewHolder>() {
    private var mContext: Context? = context

    override fun getCount(): Int {
        return mSliderItems.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?): SliderAdapterViewHolder {
        val inflate: View =
            LayoutInflater.from(parent!!.context).inflate(R.layout.slider_layout, null)
        return SliderAdapterViewHolder(inflate)
    }

    override fun onBindViewHolder(viewHolder: SliderAdapterViewHolder?, position: Int) {
        val sliderItem = mSliderItems[position]
        // Glide is use to load image
        // from url in your imageview.
        Glide.with(viewHolder!!.itemView)
            .load(sliderItem.image)
            .fitCenter()
            .into(viewHolder.imageViewBackground)
    }

}

class SliderAdapterViewHolder(itemView: View): SliderViewAdapter.ViewHolder(itemView) {
    var imageViewBackground: ImageView

    init {
        imageViewBackground = itemView.findViewById(R.id.myimage)
    }
}