package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.RunnableC1319m;
import com.whoop.android.R;
import java.util.WeakHashMap;
import kr.C22788g;
import kr.C22789h;
import kr.C22791j;
import p184h5.AbstractC16901p0;
import p257jq.AbstractC21885a;

/* JADX INFO: renamed from: com.google.android.material.timepicker.e */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC5072e extends ConstraintLayout {

    /* JADX INFO: renamed from: w */
    public final RunnableC1319m f21361w;

    /* JADX INFO: renamed from: x */
    public int f21362x;

    /* JADX INFO: renamed from: y */
    public final C22788g f21363y;

    public AbstractC5072e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        C22788g c22788g = new C22788g();
        this.f21363y = c22788g;
        C22789h c22789h = new C22789h(0.5f);
        C22791j c22791jM66029e = c22788g.f89748w.f89710a.m66029e();
        c22791jM66029e.f89757e = c22789h;
        c22791jM66029e.f89758f = c22789h;
        c22791jM66029e.f89759g = c22789h;
        c22791jM66029e.f89760h = c22789h;
        c22788g.setShapeAppearanceModel(c22791jM66029e.m66021a());
        this.f21363y.m66011m(ColorStateList.valueOf(-1));
        C22788g c22788g2 = this.f21363y;
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        setBackground(c22788g2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC21885a.f84528E, R.attr.materialClockStyle, 0);
        this.f21362x = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f21361w = new RunnableC1319m(this, 12);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i13, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i13, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC1319m runnableC1319m = this.f21361w;
            handler.removeCallbacks(runnableC1319m);
            handler.post(runnableC1319m);
        }
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo15913f();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        mo15913f();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC1319m runnableC1319m = this.f21361w;
            handler.removeCallbacks(runnableC1319m);
            handler.post(runnableC1319m);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i13) {
        this.f21363y.m66011m(ColorStateList.valueOf(i13));
    }
}
