package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C1144g {

    /* JADX INFO: renamed from: a */
    public final int f5088a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f5089b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final int f5090c;

    /* JADX INFO: renamed from: d */
    public final C1153p f5091d;

    public C1144g(Context context, XmlResourceParser xmlResourceParser) {
        this.f5090c = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1156s.f5230h);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i13 = 0; i13 < indexCount; i13++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i13);
            if (index == 0) {
                this.f5088a = typedArrayObtainStyledAttributes.getResourceId(index, this.f5088a);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f5090c);
                this.f5090c = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    C1153p c1153p = new C1153p();
                    this.f5091d = c1153p;
                    c1153p.m3647d(context, resourceId);
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
