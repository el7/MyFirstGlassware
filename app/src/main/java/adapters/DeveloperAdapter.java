

import android.view.View;
import android.view.ViewGroup;

import com.google.android.glass.app.Card;
import com.google.android.glass.widget.CardBuilder;
import com.google.android.glass.widget.CardScrollAdapter;

import java.util.List;

public class DeveloperAdapter extends CardScrollAdapter {
    private List<CardBuilder> mCards;
    private List<DeveloperModel> mData;
    public DeveloperAdapter(List<CardBuilder> cards){
        this.mCards = cards;
    }
    @Override
    public int getCount() {
        return mCards.size();
    }
    @Override
    public Object getItem(int i) {
        return mCards.get(i);
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return mCards.get(i).getView();
    }
    @Override
    public int getPosition(Object o) {
        return this.mCards.indexOf(o);
    }
}
