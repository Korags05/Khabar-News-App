package com.loc.newsapp.domain.manager

import kotlinx.coroutines.flow.Flow

interface LocalUserManager {
    suspend fun SaveAppEntry()

    fun readAppEntry(): Flow<Boolean>
}