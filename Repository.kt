package com.example.writeme.data

import com.example.writeme.R
import com.example.writeme.data.model.ContactName

class Repository {

    fun loadContact ():List<ContactName>{
        return listOf(

            ContactName(
                "Alexander",
                R.drawable.alexander

            ),
            ContactName(
                "Sargon",
                R.drawable.sargon

            ),
            ContactName(
                "CaoCao",
                R.drawable.caocao

            ),
            ContactName(
                "Guan",
                R.drawable.guan

            ),
            ContactName(
                "Richard",
                R.drawable.richard

            ),
            ContactName(
                "Charles",
                R.drawable.charles

            ),
            ContactName(
                "CjG",
                R.drawable.cjg

            ),
            ContactName(
                "Scipio",
                R.drawable.scipio

            ),
            ContactName(
                "Ethelfelda",
                R.drawable.ethelfelda

            ),
            ContactName(
                "Harald",
                R.drawable.harald

            )
        )
    }
}