package com.seda.basic_compose_affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(@StringRes val stringResourceId: Int,
                       @DrawableRes val imageResourceId: Int)