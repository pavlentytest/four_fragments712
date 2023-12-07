package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class MyDialog : DialogFragment() {
    // onCreateView()
    override fun onCreateDialog(savedInstanceState: Bundle?) =
        AlertDialog.Builder(requireContext())
            .setMessage("Что-то напишем!")
            .setPositiveButton("Ok") { _,_ -> }
            .setNegativeButton("Cancel") { _,_ -> }
            .create()

    companion object {
        const val TAG = "MyDialog"
    }
}