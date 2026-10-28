package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.n */
/* JADX INFO: loaded from: classes5.dex */
public final class C1151n {

    /* JADX INFO: renamed from: a */
    public int f5199a;

    /* JADX INFO: renamed from: b */
    public int f5200b;

    /* JADX INFO: renamed from: c */
    public float f5201c;

    /* JADX INFO: renamed from: d */
    public float f5202d;

    /* JADX INFO: renamed from: a */
    public final void m3636a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1156s.f5229g);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i13 = 0; i13 < indexCount; i13++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i13);
            if (index == 1) {
                this.f5201c = typedArrayObtainStyledAttributes.getFloat(index, this.f5201c);
            } else if (index == 0) {
                int i14 = typedArrayObtainStyledAttributes.getInt(index, this.f5199a);
                this.f5199a = i14;
                this.f5199a = C1153p.f5217d[i14];
            } else if (index == 4) {
                this.f5200b = typedArrayObtainStyledAttributes.getInt(index, this.f5200b);
            } else if (index == 3) {
                this.f5202d = typedArrayObtainStyledAttributes.getFloat(index, this.f5202d);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
