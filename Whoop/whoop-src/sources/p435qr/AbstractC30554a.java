package p435qr;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p408q.C29660d;

/* JADX INFO: renamed from: qr.a */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC30554a {

    /* JADX INFO: renamed from: a */
    public static final int[] f125745a = {R.attr.theme, com.whoop.android.R.attr.theme};

    /* JADX INFO: renamed from: b */
    public static final int[] f125746b = {com.whoop.android.R.attr.materialThemeOverlay};

    /* JADX INFO: renamed from: a */
    public static Context m93706a(Context context, AttributeSet attributeSet, int i13, int i14) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f125746b, i13, i14);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        boolean z4 = (context instanceof C29660d) && ((C29660d) context).f121217a == resourceId;
        if (resourceId == 0 || z4) {
            return context;
        }
        C29660d c29660d = new C29660d(context, resourceId);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f125745a);
        int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = typedArrayObtainStyledAttributes2.getResourceId(1, 0);
        typedArrayObtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            c29660d.getTheme().applyStyle(resourceId2, true);
        }
        return c29660d;
    }
}
