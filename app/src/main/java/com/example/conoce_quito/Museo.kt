package com.example.conoce_quito

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.example.conoce_quito.databinding.ActivityMapsBinding

class Museo : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        val yaku = LatLng(-0.218227, -78.520223)
        mMap.addMarker(MarkerOptions().position(yaku).title("Museo del Agua"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(yaku))

        mMap.animateCamera(
            CameraUpdateFactory.newLatLngZoom(yaku,18f),
            4000,
            null)
    }
}