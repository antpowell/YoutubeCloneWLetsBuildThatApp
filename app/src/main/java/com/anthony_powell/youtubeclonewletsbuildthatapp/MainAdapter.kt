package com.anthony_powell.youtubeclonewletsbuildthatapp

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.video_row.view.*

/**
 * Created by anthonypowell on 1/10/18.
 */
class MainAdapter: RecyclerView.Adapter<CustomViewHolder>(){

    var videoTitles = listOf<String>("First", "Second", "Third", "Repeat", "Again", "Try", "And", "Hold")

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): CustomViewHolder {
        var layoutInflater = LayoutInflater.from(parent?.context)
        var cellForRow = layoutInflater.inflate(R.layout.video_row, parent, false)
        return CustomViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: CustomViewHolder?, position: Int) {
        val videoTitle = videoTitles.get(position)
        holder?.v?.textView_video_title?.text = videoTitle
    }


    override fun getItemCount(): Int {
        return videoTitles.count()
    }

}

class CustomViewHolder(var v: View): RecyclerView.ViewHolder(v){

}