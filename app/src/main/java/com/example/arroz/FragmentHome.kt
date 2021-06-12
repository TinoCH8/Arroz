package com.example.arroz

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.arroz.adapters.AdapterArroz
import com.example.arroz.conexion.Conexion
import com.example.arroz.models.Arroz

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentHome.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentHome : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

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
        var view= inflater.inflate(R.layout.fragment_home, container, false)


        var conexion = Conexion(view.context)
        var db = conexion.writableDatabase

        //db.execSQL("insert into arroz (nombre, imagen) values('arroz 1','arroz.png')")
        //db.execSQL("insert into favoritos (nombre, imagen) values('Mexico','mexicon.png')")

        var recyclerView = view.findViewById<RecyclerView>(R.id.recyclerViewArroz)
        recyclerView.layoutManager = LinearLayoutManager(view.context, LinearLayoutManager.VERTICAL, false)

        var arroz=ArrayList<Arroz>()
        var respuesta = db.rawQuery("select * from arroz", null)
        if (respuesta.moveToFirst()){
            do {
                Log.e("DATO",respuesta.getString(1) )
                arroz.add(Arroz(respuesta.getString(1), respuesta.getString(2)))
            }while (respuesta.moveToNext())
        }else{
            Log.e("DATO", "SIN DATOS" )
        }







        //arroz.add(Arroz("Arroz1", "arroz.png"))
       // arroz.add(Arroz("Arroz2", "arroz.png"))

        val adapter = AdapterArroz(arroz)
        recyclerView.adapter = adapter



        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FragmentHome.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FragmentHome().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}