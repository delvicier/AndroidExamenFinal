package com.example.conoce_quito

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.example.conoce_quito.databinding.ActivityMaps3Binding

class Basilica : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMaps3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMaps3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        val basilica = LatLng(-0.21489232440235895, -78.50741878183567)
        mMap.addMarker(MarkerOptions().position(basilica).title("Basilica del Voto Nacional"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(basilica))
        mMap.animateCamera(
            CameraUpdateFactory.newLatLngZoom(basilica,18f),
            4000,
            null)
    }
}