package com.vironit.shoppingcart.network

import com.vironit.shoppingcart.model.Product
import com.vironit.shoppingcart.model.ProductsListResponse
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface API {

    @GET("list")
    fun getProductsListAsync(): Deferred<Response<ProductsListResponse>>

    @GET("{product_id}/detail")
    fun getProductDetailsAsync(@Path("product_id") id: String): Deferred<Response<Product>>
}