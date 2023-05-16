package com.android.testmvvm.test3;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.android.testmvvm.R;
import com.squareup.picasso.Picasso;

public class ImageBindingAdapter {


    @BindingAdapter(value = {"netImage"}, requireAll = false)
    public static void setImage(ImageView imageView, String url) {

        if (url != null && !"".equals(imageView)) {
            /*Glide.with(imageView.getContext())
                    .load(url)
                    .override(300,300)
                    .centerCrop()
                    .into(imageView);*/
            Picasso.get().load(url).placeholder(R.drawable.ic_launcher_background).into(imageView);

        }

    }
}