package dev.analuiza.learning.ui.main.state

import dev.analuiza.learning.model.BlogPost
import dev.analuiza.learning.model.User

data class MainViewState(
    var blogPosts: List<BlogPost>? = null,
    var user: User? = null
)
