package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class Guideline extends View {

    /* JADX INFO: renamed from: w */
    public boolean f4996w;

    public Guideline(Context context) {
        super(context);
        this.f4996w = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z4) {
        this.f4996w = z4;
    }

    public void setGuidelineBegin(int i13) {
        C1141d c1141d = (C1141d) getLayoutParams();
        if (this.f4996w && c1141d.f5038a == i13) {
            return;
        }
        c1141d.f5038a = i13;
        setLayoutParams(c1141d);
    }

    public void setGuidelineEnd(int i13) {
        C1141d c1141d = (C1141d) getLayoutParams();
        if (this.f4996w && c1141d.f5040b == i13) {
            return;
        }
        c1141d.f5040b = i13;
        setLayoutParams(c1141d);
    }

    public void setGuidelinePercent(float f13) {
        C1141d c1141d = (C1141d) getLayoutParams();
        if (this.f4996w && c1141d.f5042c == f13) {
            return;
        }
        c1141d.f5042c = f13;
        setLayoutParams(c1141d);
    }

    @Override // android.view.View
    public void setVisibility(int i13) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4996w = true;
        super.setVisibility(8);
    }
}
