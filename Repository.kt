package com.example.writeme.data

import com.example.writeme.R
import com.example.writeme.data.model.ContactName

class Repository {

    fun loadContact ():List<ContactName>{
        return listOf(

            ContactName(
                0,
                "Alexander",
                R.drawable.alexander,
                mutableListOf()

            ),
            ContactName(
                1,
                "Sargon",
                R.drawable.sargon,
                mutableListOf()

            ),
            ContactName(
                2,
                "CaoCao",
                R.drawable.caocao,
                mutableListOf()

            ),
            ContactName(
                3,
                "Guan",
                R.drawable.guan,
                mutableListOf()

            ),
            ContactName(
                4,
                "Richard",
                R.drawable.richard,
                mutableListOf()

            ),
            ContactName(
                5,
                "Charles",
                R.drawable.charles,
                mutableListOf()

            ),
            ContactName(
                6,
                "CjG",
                R.drawable.cjg,
                mutableListOf()

            ),
            ContactName(
                7,
                "Scipio",
                R.drawable.scipio,
                mutableListOf()

            ),
            ContactName(
                8,
                "Ethelfelda",
                R.drawable.ethelfelda,
                mutableListOf()

            ),
            ContactName(
                9,
                "Harald",
                R.drawable.harald,
                mutableListOf()

            )
        )
    }
}