package MyAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.love_shayri.MainActivity;
import com.example.love_shayri.R;

public class MyAdapter extends BaseAdapter {

    MainActivity mainActivity;

    int[] imgArr;

    String[] title;

    public MyAdapter(MainActivity mainActivity, String[] title, int[] imgArr) {

        this.mainActivity=mainActivity;
        this.imgArr=imgArr;
        this.title=title;
    }

    @Override
    public int getCount() {
        return title.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        view=LayoutInflater.from(mainActivity).inflate(R.layout.activity_main_item,viewGroup,false );
        ImageView imageView = view.findViewById(R.id.activity_main_item_imgView);
        TextView txt1=view.findViewById(R.id.activity_main_item_txt1);
        imageView.setImageResource(imgArr[position]);
        txt1.setText(title[position]);
        return view;
    }
}
