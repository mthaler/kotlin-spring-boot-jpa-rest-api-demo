package com.mthaler.kotlindemo.repository

import com.mthaler.kotlindemo.model.Article
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

/**
 * Created by rajeevkumarsingh on 04/10/17.
 */

@Repository
interface ArticleRepository : JpaRepository<Article, Long>