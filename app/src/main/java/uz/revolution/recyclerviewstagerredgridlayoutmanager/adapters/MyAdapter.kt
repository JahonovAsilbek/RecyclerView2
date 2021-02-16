package uz.revolution.recyclerviewstagerredgridlayoutmanager.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_image.view.*
import uz.revolution.recyclerviewstagerredgridlayoutmanager.R
import uz.revolution.recyclerviewstagerredgridlayoutmanager.models.ImageModel

class MyAdapter(var imageList: ArrayList<ImageModel>) : RecyclerView.Adapter<MyAdapter.ImageViewHolder>() {

    inner class ImageViewHolder(var itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun onBind(imageModel: ImageModel) {
            itemView.image_view.setImageResource(imageModel.image)
            itemView.image_url.text = imageModel.url
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val view =
                LayoutInflater.from(parent.context).inflate(R.layout.item_image, parent, false)

        return ImageViewHolder(view)

    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.onBind(imageList[position])
    }

    override fun getItemCount(): Int {
        return imageList.size
    }
}