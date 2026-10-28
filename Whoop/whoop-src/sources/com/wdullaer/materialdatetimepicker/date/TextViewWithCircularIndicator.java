package com.wdullaer.materialdatetimepicker.date;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.whoop.android.R;
import p479s4.AbstractC32122c;

/* JADX INFO: loaded from: classes6.dex */
public class TextViewWithCircularIndicator extends AppCompatTextView {
    public TextViewWithCircularIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        int color = AbstractC32122c.getColor(context, R.color.mdtp_accent_color);
        context.getResources().getString(R.string.mdtp_item_is_selected);
        paint.setFakeBoldText(true);
        paint.setAntiAlias(true);
        paint.setColor(color);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(255);
    }

    @Override // android.view.View
    @SuppressLint({"GetContentDescriptionOverride"})
    public CharSequence getContentDescription() {
        return getText();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        setSelected(false);
        super.onDraw(canvas);
    }
}
