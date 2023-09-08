package com.makuta.jokes.core

import androidx.lifecycle.ViewModel
import com.makuta.jokes.net.Backend

open class CoreViewModel : ViewModel() {

    fun backend() = Backend.getInstance().getService()

}