package com.example.multicontador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.multicontador.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    int contador1;
    int contador2;
    int contador3;
    int contador4;
    int sumtotal;
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador1++;
                sumtotal = 1 + sumtotal;
                binding.text2.setText(String.valueOf(contador1));
                binding.text1.setText(String.valueOf(sumtotal));
            }
        });

        binding.boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador2++;
                sumtotal = 1 + sumtotal;
                binding.text3.setText(String.valueOf(contador2));
                binding.text1.setText(String.valueOf(sumtotal));

            }
        });

        binding.boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador3++;
                sumtotal = 1 + sumtotal;

                binding.text4.setText(String.valueOf(contador3));
                binding.text1.setText(String.valueOf(sumtotal));

            }
        });

        binding.boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador4++;
                sumtotal = 1 + sumtotal;
                binding.text5.setText(String.valueOf(contador4));
                binding.text1.setText(String.valueOf(sumtotal));

            }
        });

        binding.botonr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sumtotal = sumtotal - contador1;
                contador1 = 0;
                binding.text2.setText(String.valueOf(contador1));
                binding.text1.setText(String.valueOf(sumtotal));
            }
        });

        binding.botonr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sumtotal = sumtotal - contador2;
                contador2 = 0;
                binding.text3.setText(String.valueOf(contador2));
                binding.text1.setText(String.valueOf(sumtotal));
            }
        });

        binding.botonr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sumtotal = sumtotal - contador3;
                contador3 = 0;
                binding.text4.setText(String.valueOf(contador3));
                binding.text1.setText(String.valueOf(sumtotal));
            }
        });

        binding.botonr4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sumtotal = sumtotal - contador4;
                contador4 = 0;
                binding.text5.setText(String.valueOf(contador4));
                binding.text1.setText(String.valueOf(sumtotal));
            }
        });

        binding.botonresetall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sumtotal = 0;
                contador1 = 0;
                contador2 = 0;
                contador3 = 0;
                contador4 = 0;
                binding.text1.setText(String.valueOf(sumtotal));
                binding.text2.setText(String.valueOf(sumtotal));
                binding.text3.setText(String.valueOf(sumtotal));
                binding.text4.setText(String.valueOf(sumtotal));
                binding.text5.setText(String.valueOf(sumtotal));

            }
        });
    }
}