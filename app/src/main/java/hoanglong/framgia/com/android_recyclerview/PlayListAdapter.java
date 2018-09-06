package hoanglong.framgia.com.android_recyclerview;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.InputStream;
import java.util.ArrayList;

public class PlayListAdapter extends RecyclerView.Adapter<PlayListAdapter.MyAdapter> {

    private ArrayList<PlayList> mPlayList;

    PlayListAdapter(ArrayList<PlayList> playList) {
        this.mPlayList = playList;
    }

    @NonNull
    @Override
    public MyAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_playlist, parent, false);
        return new MyAdapter(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter holder, int position) {
        holder.mTextViewNameSong.setText(mPlayList.get(position).getNameSong());
        new DownloadImageTask(holder.mImageViewAvatar)
                .execute(mPlayList.get(position).getImageSong());
    }

    @Override
    public int getItemCount() {
        return mPlayList.size();
    }

    class MyAdapter extends RecyclerView.ViewHolder {

        ImageView mImageViewAvatar;
        TextView mTextViewNameSong;

        MyAdapter(@NonNull View itemView) {
            super(itemView);
            mImageViewAvatar = itemView.findViewById(R.id.iv_avatar);
            mTextViewNameSong = itemView.findViewById(R.id.tv_song);
        }
    }

    @SuppressLint("StaticFieldLeak")
    private class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
        ImageView bmImage;

        DownloadImageTask(ImageView bmImage) {
            this.bmImage = bmImage;
        }

        protected Bitmap doInBackground(String... urls) {
            String mUrl = urls[0];
            Bitmap mIcon = null;
            try {
                InputStream in = new java.net.URL(mUrl).openStream();
                mIcon = BitmapFactory.decodeStream(in);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return mIcon;
        }

        protected void onPostExecute(Bitmap result) {
            bmImage.setImageBitmap(result);
        }
    }
}
