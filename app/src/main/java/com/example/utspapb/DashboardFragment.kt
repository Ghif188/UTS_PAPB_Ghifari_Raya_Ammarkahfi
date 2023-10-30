package com.example.utspapb

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.utspapb.databinding.ActivityMain2Binding
import com.example.utspapb.databinding.FragmentDashboardBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DashboardFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DashboardFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private lateinit var binding: FragmentDashboardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val view = binding.root
        val usernameAkun = activity?.intent?.extras?.getString("Username")
        binding.username.text = usernameAkun
        val intentToThirdActivity =
            Intent(activity, MainActivity3::class.java)
        binding.poster1.setOnClickListener{
            val extras = Bundle()
            extras.putString("NamaFilm", binding.nama1.text.toString())
            extras.putString("RateFilm", binding.rate1.text.toString())
            extras.putString("DirectorFilm", "Ghifari1")
            extras.putString("StoryFilm", "Halo ini film 1")
            intentToThirdActivity.putExtras(extras)
            startActivity(intentToThirdActivity)
        }
        binding.poster2.setOnClickListener{
            val extras = Bundle()
            extras.putString("NamaFilm", binding.nama2.text.toString())
            extras.putString("RateFilm", binding.rate2.text.toString())
            extras.putString("DirectorFilm", "Ghifari2")
            extras.putString("StoryFilm", "Halo ini film 2")
            intentToThirdActivity.putExtras(extras)
            startActivity(intentToThirdActivity)
        }
        binding.poster3.setOnClickListener{
            val extras = Bundle()
            extras.putString("NamaFilm", binding.nama3.text.toString())
            extras.putString("RateFilm", binding.rate3.text.toString())
            extras.putString("DirectorFilm", "Ghifari3")
            extras.putString("StoryFilm", "Halo ini film 3")
            intentToThirdActivity.putExtras(extras)
            startActivity(intentToThirdActivity)
        }
        binding.poster4.setOnClickListener{
            val extras = Bundle()
            extras.putString("NamaFilm", binding.nama4.text.toString())
            extras.putString("RateFilm", binding.rate4.text.toString())
            extras.putString("DirectorFilm", "Ghifari4")
            extras.putString("StoryFilm", "Halo ini film 4")
            intentToThirdActivity.putExtras(extras)
            startActivity(intentToThirdActivity)
        }
        binding.poster5.setOnClickListener{
            val extras = Bundle()
            extras.putString("NamaFilm", binding.nama5.text.toString())
            extras.putString("RateFilm", binding.rate5.text.toString())
            extras.putString("DirectorFilm", "Ghifari5")
            extras.putString("StoryFilm", "Halo ini film 5")
            intentToThirdActivity.putExtras(extras)
            startActivity(intentToThirdActivity)
        }
        binding.poster6.setOnClickListener{
            val extras = Bundle()
            extras.putString("NamaFilm", binding.nama6.text.toString())
            extras.putString("RateFilm", binding.rate6.text.toString())
            extras.putString("DirectorFilm", "Ghifari6")
            extras.putString("StoryFilm", "Halo ini film 6")
            intentToThirdActivity.putExtras(extras)
            startActivity(intentToThirdActivity)
        }
        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment DashboardFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            DashboardFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}