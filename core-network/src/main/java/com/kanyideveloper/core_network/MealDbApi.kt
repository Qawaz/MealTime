/*
 * Copyright 2022 Joel Kanyi.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.kanyideveloper.core_network

import com.kanyideveloper.core_network.model.CategoriesResponse
import com.kanyideveloper.core_network.model.MealDetailsResponse
import com.kanyideveloper.core_network.model.MealsResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface MealDbApi {
    @GET("categories.php")
    suspend fun getCategories(): CategoriesResponse

    @GET("filter.php?c={strCategory}")
    suspend fun getMeals(
        @Query("strCategory") category: String
    ): MealsResponse

    @GET("lookup.php?i={idMeal}")
    suspend fun getMealDetails(
        @Query("idMeal") mealId: Int
    ): MealDetailsResponse
}
