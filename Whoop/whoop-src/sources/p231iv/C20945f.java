package p231iv;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import com.whoop.android.R;
import l83.C23454a0;
import p262jv.C21965b;
import p513u4.AbstractC34514b;
import p513u4.AbstractC34523k;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: iv.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C20945f extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: x */
    public static final C20945f f79136x;

    /* JADX INFO: renamed from: y */
    public static final C20945f f79137y;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f79138w;

    static {
        int i13 = 1;
        f79136x = new C20945f(i13, 0);
        f79137y = new C20945f(i13, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20945f(int i13, int i14) {
        super(i13);
        this.f79138w = i14;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f79138w) {
            case 0:
                Context it = (Context) obj;
                AbstractC22676k.m65750j(it, "it");
                C20948i c20948i = new C20948i(it, null, 0);
                Resources resources = c20948i.getResources();
                ThreadLocal threadLocal = AbstractC34523k.f145117a;
                Drawable drawableM109070f = AbstractC34514b.m109070f(resources, R.drawable.mapbox_attribution_selector, null);
                if (drawableM109070f != null) {
                    c20948i.setImageDrawable(drawableM109070f);
                }
                c20948i.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                c20948i.setContentDescription(it.getString(R.string.mapbox_attributionsDialogTitle));
                return c20948i;
            default:
                C21965b AttributionSettings = (C21965b) obj;
                AbstractC22676k.m65750j(AttributionSettings, "$this$AttributionSettings");
                return C23454a0.f92919a;
        }
    }
}
