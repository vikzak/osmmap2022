package ru.gb.myapplication.ui.home

import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.osmdroid.api.IMapController
import org.osmdroid.tileprovider.tilesource.TileSourceFactory
import org.osmdroid.views.MapView


internal var  myFlag : Boolean = false

class HomeViewModel : ViewModel() {

    var myFlag : Boolean = false

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text

    //private val _setMyCenter = MapView.

//    fun showMapMini (myFlag){
//        myFlag = false
//        return flag
//    }
}