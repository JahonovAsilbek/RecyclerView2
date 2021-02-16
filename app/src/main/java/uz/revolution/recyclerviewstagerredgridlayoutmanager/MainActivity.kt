package uz.revolution.recyclerviewstagerredgridlayoutmanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import uz.revolution.recyclerviewstagerredgridlayoutmanager.adapters.MyAdapter
import uz.revolution.recyclerviewstagerredgridlayoutmanager.models.ImageModel

class MainActivity : AppCompatActivity() {

    var imageList:ArrayList<ImageModel>?=null
    var adapter:MyAdapter?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadData()
        adapter = imageList?.let { MyAdapter(it) }
        rv.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
//        gridlayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() { @Override public int getSpanSize(int position) { if (position == 1) { return 4; // the item in position now takes up 4 spans } return 1; } }); }
        rv.setHasFixedSize(true)

        rv.adapter=adapter
    }

    private fun loadData() {
        imageList = ArrayList()

        for (i in 0..100) {
            imageList?.add(ImageModel(R.drawable.a1,"www.google.com"))
            imageList?.add(ImageModel(R.drawable.a2,"www.google.com"))
            imageList?.add(ImageModel(R.drawable.a3,"www.google.com"))
            imageList?.add(ImageModel(R.drawable.a4,"www.google.com"))
            imageList?.add(ImageModel(R.drawable.a5,"www.google.com"))
            imageList?.add(ImageModel(R.drawable.a6,"www.google.com"))
            imageList?.add(ImageModel(R.drawable.a7,"www.google.com"))
            imageList?.add(ImageModel(R.drawable.a8,"www.google.com"))
        }
    }
}