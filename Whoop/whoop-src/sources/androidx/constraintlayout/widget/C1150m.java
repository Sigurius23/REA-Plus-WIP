package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import p183h4.AbstractC16833a;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.m */
/* JADX INFO: loaded from: classes5.dex */
public final class C1150m {

    /* JADX INFO: renamed from: j */
    public static final SparseIntArray f5189j;

    /* JADX INFO: renamed from: a */
    public int f5190a;

    /* JADX INFO: renamed from: b */
    public int f5191b;

    /* JADX INFO: renamed from: c */
    public int f5192c;

    /* JADX INFO: renamed from: d */
    public float f5193d;

    /* JADX INFO: renamed from: e */
    public float f5194e;

    /* JADX INFO: renamed from: f */
    public float f5195f;

    /* JADX INFO: renamed from: g */
    public int f5196g;

    /* JADX INFO: renamed from: h */
    public String f5197h;

    /* JADX INFO: renamed from: i */
    public int f5198i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5189j = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    /* JADX INFO: renamed from: a */
    public final void m3635a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1156s.f5228f);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i13 = 0; i13 < indexCount; i13++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i13);
            switch (f5189j.get(index)) {
                case 1:
                    this.f5194e = typedArrayObtainStyledAttributes.getFloat(index, this.f5194e);
                    break;
                case 2:
                    this.f5192c = typedArrayObtainStyledAttributes.getInt(index, this.f5192c);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        String str = AbstractC16833a.f64693a[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f5190a = C1153p.m3640l(typedArrayObtainStyledAttributes, index, this.f5190a);
                    break;
                case 6:
                    this.f5191b = typedArrayObtainStyledAttributes.getInteger(index, this.f5191b);
                    break;
                case 7:
                    this.f5193d = typedArrayObtainStyledAttributes.getFloat(index, this.f5193d);
                    break;
                case 8:
                    this.f5196g = typedArrayObtainStyledAttributes.getInteger(index, this.f5196g);
                    break;
                case 9:
                    this.f5195f = typedArrayObtainStyledAttributes.getFloat(index, this.f5195f);
                    break;
                case 10:
                    int i14 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    if (i14 == 1) {
                        this.f5198i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    } else if (i14 == 3) {
                        String string = typedArrayObtainStyledAttributes.getString(index);
                        this.f5197h = string;
                        if (string.indexOf("/") > 0) {
                            this.f5198i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        }
                    } else {
                        typedArrayObtainStyledAttributes.getInteger(index, this.f5198i);
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
