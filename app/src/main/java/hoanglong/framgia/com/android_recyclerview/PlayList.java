package hoanglong.framgia.com.android_recyclerview;

public class PlayList {
    private String mImageSong;
    private String mNameSong;

    PlayList(String imageSong, String nameSong) {
        this.mImageSong = imageSong;
        this.mNameSong = nameSong;
    }

    public String getImageSong() {
        return mImageSong;
    }

    public String getNameSong() {
        return mNameSong;
    }

}
