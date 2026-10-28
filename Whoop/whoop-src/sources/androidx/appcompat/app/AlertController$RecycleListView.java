package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import p290l.AbstractC22932a;

/* JADX INFO: loaded from: classes5.dex */
public class AlertController$RecycleListView extends ListView {

    /* JADX INFO: renamed from: w */
    public final int f4216w;

    /* JADX INFO: renamed from: x */
    public final int f4217x;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC22932a.f90527t);
        this.f4217x = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f4216w = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
