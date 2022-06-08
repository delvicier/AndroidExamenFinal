package com.example.conoce_quito

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.example.conoce_quito.databinding.ActivityMaps4Binding

class Carolina : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMaps4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMaps4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        val carolina = LatLng(-0.18138739304080026, -78.48430372484077)
        mMap.addMarker(MarkerOptions().position(carolina).title("La Carolina"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(carolina))

        mMap.animateCamera(
            CameraUpdateFactory.newLatLngZoom(carolina,18f),
            4000,
            null)
    }
}