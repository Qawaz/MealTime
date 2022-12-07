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
package com.kanyideveloper.addmeal.data.repository

import com.kanyideveloper.addmeal.domain.repository.SaveMealRepository
import com.kanyideveloper.core_database.MealTimeDatabase
import com.kanyideveloper.core_database.model.Meal

class SaveMealRepositoryImpl(
    private val mealTimeDatabase: MealTimeDatabase
) : SaveMealRepository {
    override suspend fun saveMeal(meal: Meal) {
        mealTimeDatabase.mealDao.insertMeal(meal)
    }
}
