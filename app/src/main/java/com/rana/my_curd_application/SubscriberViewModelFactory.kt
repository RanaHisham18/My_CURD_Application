package com.rana.my_curd_application

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.rana.my_curd_application.database.SubscriberRepository
import com.rana.my_curd_application.SubscriberViewModel as SubscriberViewModel1

class SubscriberViewModelFactory(
    private val repository: SubscriberRepository
): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(SubscriberViewModel1::class.java)){
            return SubscriberViewModel1(repository) as T
        }
        throw IllegalArgumentException("Unknown View Model class")
    }

}