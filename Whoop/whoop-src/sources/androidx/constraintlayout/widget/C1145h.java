package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C1145h {

    /* JADX INFO: renamed from: a */
    public final float f5092a;

    /* JADX INFO: renamed from: b */
    public final float f5093b;

    /* JADX INFO: renamed from: c */
    public final float f5094c;

    /* JADX INFO: renamed from: d */
    public final float f5095d;

    /* JADX INFO: renamed from: e */
    public final int f5096e;

    /* JADX INFO: renamed from: f */
    public final C1153p f5097f;

    public C1145h(Context context, XmlResourceParser xmlResourceParser) {
        this.f5092a = Float.NaN;
        this.f5093b = Float.NaN;
        this.f5094c = Float.NaN;
        this.f5095d = Float.NaN;
        this.f5096e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1156s.f5232j);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i13 = 0; i13 < indexCount; i13++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i13);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f5096e);
                this.f5096e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    C1153p c1153p = new C1153p();
                    this.f5097f = c1153p;
                    c1153p.m3647d(context, resourceId);
                }
            } else if (index == 1) {
                this.f5095d = typedArrayObtainStyledAttributes.getDimension(index, this.f5095d);
            } else if (index == 2) {
                this.f5093b = typedArrayObtainStyledAttributes.getDimension(index, this.f5093b);
            } else if (index == 3) {
                this.f5094c = typedArrayObtainStyledAttributes.getDimension(index, this.f5094c);
            } else if (index == 4) {
                this.f5092a = typedArrayObtainStyledAttributes.getDimension(index, this.f5092a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3626a(float f13, float f14) {
        float f15 = this.f5092a;
        if (!Float.isNaN(f15) && f13 < f15) {
            return false;
        }
        float f16 = this.f5093b;
        if (!Float.isNaN(f16) && f14 < f16) {
            return false;
        }
        float f17 = this.f5094c;
        if (!Float.isNaN(f17) && f13 > f17) {
            return false;
        }
        float f18 = this.f5095d;
        return Float.isNaN(f18) || f14 <= f18;
    }
}
