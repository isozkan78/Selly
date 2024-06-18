package com.example.ismailozkan.selly.ui

import androidx.lifecycle.ViewModel
import com.example.ismailozkan.selly.R
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

data class Product(val name: String, val painter: Int)

class MainViewModel : ViewModel() {

    private val _query = MutableStateFlow("")
    val query: StateFlow<String> = _query.asStateFlow()

    private val defaultProducts = listOf(
        Product("Product 1", painter = R.drawable.terlikimage),
        Product("Product 2", painter = R.drawable.terlikimage),
        Product("Product 3", painter = R.drawable.terlikimage)
    )

    private val _items = MutableStateFlow(defaultProducts)
    val items: StateFlow<List<Product>> = _items.asStateFlow()

    fun updateQuery(newQuery: String) {
        _query.value = newQuery
        performSearch()
    }

    fun performSearch() {
        _items.value = if (_query.value.isEmpty()) {
            defaultProducts
        } else {
            defaultProducts.filter {
                it.name.contains(_query.value, ignoreCase = true)
            }
        }
    }
}


