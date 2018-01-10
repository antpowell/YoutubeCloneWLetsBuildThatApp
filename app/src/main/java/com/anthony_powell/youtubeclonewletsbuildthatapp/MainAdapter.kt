package com.anthony_powell.youtubeclonewletsbuildthatapp

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by anthonypowell on 1/10/18.
 */
class MainAdapter: RecyclerView.Adapter<CustomViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): CustomViewHolder {
        var layoutInflater = LayoutInflater.from(parent?.context)
        var cellForRow = layoutInflater.inflate(R.layout.video_row, parent, false)
        return CustomViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: CustomViewHolder?, position: Int) {
    }


    override fun getItemCount(): Int {
        return 15
    }

}

class CustomViewHolder(v: View): RecyclerView.ViewHolder(v){

}