package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: renamed from: androidx.recyclerview.widget.v1 */
/* JADX INFO: loaded from: classes5.dex */
public class C1744v1 extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a */
    public AbstractC1717o2 f6891a;

    /* JADX INFO: renamed from: b */
    public final Rect f6892b;

    /* JADX INFO: renamed from: c */
    public boolean f6893c;

    /* JADX INFO: renamed from: d */
    public boolean f6894d;

    public C1744v1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6892b = new Rect();
        this.f6893c = true;
        this.f6894d = false;
    }

    public C1744v1(int i13, int i14) {
        super(i13, i14);
        this.f6892b = new Rect();
        this.f6893c = true;
        this.f6894d = false;
    }

    public C1744v1(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f6892b = new Rect();
        this.f6893c = true;
        this.f6894d = false;
    }

    public C1744v1(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f6892b = new Rect();
        this.f6893c = true;
        this.f6894d = false;
    }

    public C1744v1(C1744v1 c1744v1) {
        super((ViewGroup.LayoutParams) c1744v1);
        this.f6892b = new Rect();
        this.f6893c = true;
        this.f6894d = false;
    }
}
