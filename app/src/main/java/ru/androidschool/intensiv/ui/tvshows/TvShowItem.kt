package ru.androidschool.intensiv.ui.tvshows

import android.view.View
import com.squareup.picasso.Picasso
import com.xwray.groupie.viewbinding.BindableItem
import ru.androidschool.intensiv.R
import ru.androidschool.intensiv.data.TvShow
import ru.androidschool.intensiv.databinding.ItemTvShowBinding

class TvShowItem(
    private val content: TvShow,
    private val onClick: (tvShow: TvShow) -> Unit
) : BindableItem<ItemTvShowBinding>() {

    override fun getLayout(): Int = R.layout.item_tv_show

    override fun bind(vb: ItemTvShowBinding, position: Int) {
        vb.apply {
            titleTextView.text = content.title
            showRating.rating = content.rating
            container.setOnClickListener {
                onClick(content)
            }
        }

        // TODO Получать из модели
        Picasso.get()
            .load("https://m.media-amazon.com/images/M/MV5BYTk3MDljOWQtNGI2My00OTEzLTlhYjQtOTQ4ODM2MzUwY2IwXkEyXkFqcGdeQXVyNTIzOTk5ODM@._V1_.jpg")
            .into(vb.imagePreview)
    }

    override fun initializeViewBinding(v: View): ItemTvShowBinding = ItemTvShowBinding.bind(v)
}
