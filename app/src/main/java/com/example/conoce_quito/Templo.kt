package com.example.conoce_quito

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.example.conoce_quito.databinding.ActivityMaps2Binding

class Templo : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMaps2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMaps2Binding.inflate(layoutInflater)
        setContentView(binding.root)


        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }


    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        val temploSol = LatLng(0.02323379081892627, -78.48109044279109)
        mMap.addMarker(MarkerOptions().position(temploSol).title("Templo del Sol"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(temploSol))
        mMap.animateCamera(
            CameraUpdateFactory.newLatLngZoom(temploSol,18f),
            4000,
            null)
    }
}