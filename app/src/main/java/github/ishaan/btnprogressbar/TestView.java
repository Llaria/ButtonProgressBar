package github.ishaan.btnprogressbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by sundi on 2017/12/1.
 */

public class TestView extends View {

    public TestView(Context context) {
        super(context);
    }

    public TestView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        TypedArray typedArray = context.obtainStyledAttributes(attrs,R.styleable.TestView);
        String one = typedArray.getString(R.styleable.TestView_attrOne);
        System.out.println("============" + one);
        for (int i = 0; i < attrs.getAttributeCount(); i++) {
            System.out.println(  attrs.getAttributeName(i) + " ====" + attrs.getAttributeValue(i));
        }
        typedArray.recycle();
    }

}
