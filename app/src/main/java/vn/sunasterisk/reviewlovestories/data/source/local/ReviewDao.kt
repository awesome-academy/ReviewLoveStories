package vn.sunasterisk.reviewlovestories.data.source.local

import androidx.room.*
import vn.sunasterisk.reviewlovestories.data.model.Review

@Dao
interface ReviewDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertReview(review: Review)

    @Query("SELECT * FROM reviews")
    fun getAllReviews(): List<Review>

    @Update
    fun updateReview(review: Review)

    @Delete
    fun deleteReview(review: Review)
}
