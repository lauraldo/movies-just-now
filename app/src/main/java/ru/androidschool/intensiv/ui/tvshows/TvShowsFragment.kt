package ru.androidschool.intensiv.ui.tvshows

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder
import ru.androidschool.intensiv.R
import ru.androidschool.intensiv.data.MockRepository
import ru.androidschool.intensiv.data.TvShow
import ru.androidschool.intensiv.databinding.TvShowsFragmentBinding

class TvShowsFragment : Fragment(R.layout.tv_shows_fragment) {

    private var _binding: TvShowsFragmentBinding? = null

    private val binding get() = _binding!!

    private val adapter by lazy {
        GroupAdapter<GroupieViewHolder>()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = TvShowsFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val tvShowsList = MockRepository.getTvShows().map {
            TvShowItem(it) { tvShow ->
                openTvShowDetails(tvShow)
            }
        }

        binding.tvShowsRecyclerView.adapter = adapter.apply { addAll(tvShowsList) }
    }

    private fun openTvShowDetails(tvShow: TvShow) {
        // TODO: Экран деталей сериала
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
