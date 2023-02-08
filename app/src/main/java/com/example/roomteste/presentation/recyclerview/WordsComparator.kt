package com.example.roomteste.presentation.recyclerview

import androidx.recyclerview.widget.DiffUtil
import com.example.roomteste.room.Word

class WordsComparator: DiffUtil.ItemCallback<Word>() {
    override fun areItemsTheSame(oldItem: Word, newItem: Word): Boolean {
        return oldItem === newItem
    }

    override fun areContentsTheSame(oldItem: Word, newItem: Word): Boolean {
        return oldItem.word == newItem.word
    }
}