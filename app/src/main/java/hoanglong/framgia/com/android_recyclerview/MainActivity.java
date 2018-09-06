package hoanglong.framgia.com.android_recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerViewPlayList;
    private ArrayList<PlayList> mListPlayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerViewPlayList = findViewById(R.id.rv_playlist);
        setData();
        setUpRecyclerView();
    }

    private void setUpRecyclerView() {
        mRecyclerViewPlayList.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        mRecyclerViewPlayList.setLayoutManager(mLayoutManager);
        PlayListAdapter mPlayListAdapter = new PlayListAdapter(mListPlayList);
        mRecyclerViewPlayList.setAdapter(mPlayListAdapter);
        LayoutAnimationController animation = AnimationUtils.loadLayoutAnimation(getApplicationContext(), R.anim.layout_animation_fall_down);
        mRecyclerViewPlayList.setLayoutAnimation(animation);
    }

    private void setData() {
        mListPlayList = new ArrayList<>();

        PlayList playList1 = new PlayList("https://109cdf7de.vws.vegacdn.vn/kv0puCNE4oNNfn7YhOpK/1/v1/artists/s2/0/0/2/2117.jpg", "Người lạ ơi");
        PlayList playList2 = new PlayList("https://109cdf7de.vws.vegacdn.vn/kv0puCNE4oNNfn7YhOpK/1/v1/artists/s2/0/0/36/37204.jpg", "Chạm đáy nỗi đau");
        PlayList playList3 = new PlayList("https://109cdf7de.vws.vegacdn.vn/kv0puCNE4oNNfn7YhOpK/1/v1/artists/s2/0/0/26/27592.jpg", "Tìm lại bầu trời");
        PlayList playList4 = new PlayList("https://109cdf7de.vws.vegacdn.vn/kv0puCNE4oNNfn7YhOpK/1/v1/artists/s2/0/0/3/3349.jpg", "Nơi tình yêu bắt đầu");
        PlayList playList5 = new PlayList("https://109cdf7de.vws.vegacdn.vn/jXitUPK9cvjCkkVYrFPL/200x200x1525690529/v1/album/s0/0/21/889/22930433.jpg", "Đừng như thói quen");
        PlayList playList6 = new PlayList("https://109cdf7de.vws.vegacdn.vn/kv0puCNE4oNNfn7YhOpK/1529037018/v1/videos/img/s2/0/0/53/54380.jpg", "Đừng quên tên anh");
        PlayList playList7 = new PlayList("https://109cdf7de.vws.vegacdn.vn/kv0puCNE4oNNfn7YhOpK/1/v1/artists/s2/0/0/2/2117.jpg", "Người lạ ơi");
        PlayList playList8 = new PlayList("https://109cdf7de.vws.vegacdn.vn/kv0puCNE4oNNfn7YhOpK/1/v1/artists/s2/0/0/36/37204.jpg", "Chạm đáy nỗi đau");
        PlayList playList9 = new PlayList("https://109cdf7de.vws.vegacdn.vn/kv0puCNE4oNNfn7YhOpK/1/v1/artists/s2/0/0/26/27592.jpg", "Tìm lại bầu trời");
        PlayList playList10 = new PlayList("https://109cdf7de.vws.vegacdn.vn/kv0puCNE4oNNfn7YhOpK/1/v1/artists/s2/0/0/3/3349.jpg", "Nơi tình yêu bắt đầu");
        PlayList playList11 = new PlayList("https://109cdf7de.vws.vegacdn.vn/jXitUPK9cvjCkkVYrFPL/200x200x1525690529/v1/album/s0/0/21/889/22930433.jpg", "Đừng như thói quen");
        PlayList playList12 = new PlayList("https://109cdf7de.vws.vegacdn.vn/kv0puCNE4oNNfn7YhOpK/1529037018/v1/videos/img/s2/0/0/53/54380.jpg", "Đừng quên tên anh");


        mListPlayList.add(playList1);
        mListPlayList.add(playList2);
        mListPlayList.add(playList3);
        mListPlayList.add(playList4);
        mListPlayList.add(playList5);
        mListPlayList.add(playList6);
        mListPlayList.add(playList7);
        mListPlayList.add(playList8);
        mListPlayList.add(playList9);
        mListPlayList.add(playList10);
        mListPlayList.add(playList11);
        mListPlayList.add(playList12);
    }
}
