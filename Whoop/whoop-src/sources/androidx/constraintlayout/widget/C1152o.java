package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.o */
/* JADX INFO: loaded from: classes5.dex */
public final class C1152o {

    /* JADX INFO: renamed from: n */
    public static final SparseIntArray f5203n;

    /* JADX INFO: renamed from: a */
    public float f5204a;

    /* JADX INFO: renamed from: b */
    public float f5205b;

    /* JADX INFO: renamed from: c */
    public float f5206c;

    /* JADX INFO: renamed from: d */
    public float f5207d;

    /* JADX INFO: renamed from: e */
    public float f5208e;

    /* JADX INFO: renamed from: f */
    public float f5209f;

    /* JADX INFO: renamed from: g */
    public float f5210g;

    /* JADX INFO: renamed from: h */
    public int f5211h;

    /* JADX INFO: renamed from: i */
    public float f5212i;

    /* JADX INFO: renamed from: j */
    public float f5213j;

    /* JADX INFO: renamed from: k */
    public float f5214k;

    /* JADX INFO: renamed from: l */
    public boolean f5215l;

    /* JADX INFO: renamed from: m */
    public float f5216m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5203n = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    /* JADX INFO: renamed from: a */
    public final void m3637a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1156s.f5231i);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i13 = 0; i13 < indexCount; i13++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i13);
            switch (f5203n.get(index)) {
                case 1:
                    this.f5204a = typedArrayObtainStyledAttributes.getFloat(index, this.f5204a);
                    break;
                case 2:
                    this.f5205b = typedArrayObtainStyledAttributes.getFloat(index, this.f5205b);
                    break;
                case 3:
                    this.f5206c = typedArrayObtainStyledAttributes.getFloat(index, this.f5206c);
                    break;
                case 4:
                    this.f5207d = typedArrayObtainStyledAttributes.getFloat(index, this.f5207d);
                    break;
                case 5:
                    this.f5208e = typedArrayObtainStyledAttributes.getFloat(index, this.f5208e);
                    break;
                case 6:
                    this.f5209f = typedArrayObtainStyledAttributes.getDimension(index, this.f5209f);
                    break;
                case 7:
                    this.f5210g = typedArrayObtainStyledAttributes.getDimension(index, this.f5210g);
                    break;
                case 8:
                    this.f5212i = typedArrayObtainStyledAttributes.getDimension(index, this.f5212i);
                    break;
                case 9:
                    this.f5213j = typedArrayObtainStyledAttributes.getDimension(index, this.f5213j);
                    break;
                case 10:
                    this.f5214k = typedArrayObtainStyledAttributes.getDimension(index, this.f5214k);
                    break;
                case 11:
                    this.f5215l = true;
                    this.f5216m = typedArrayObtainStyledAttributes.getDimension(index, this.f5216m);
                    break;
                case 12:
                    this.f5211h = C1153p.m3640l(typedArrayObtainStyledAttributes, index, this.f5211h);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
