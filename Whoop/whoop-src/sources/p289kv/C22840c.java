package p289kv;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import com.whoop.android.R;
import jo.ViewOnClickListenerC21821j;
import p513u4.AbstractC34523k;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: kv.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C22840c extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public static final C22840c f90045w = new C22840c(1);

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context it = (Context) obj;
        AbstractC22676k.m65750j(it, "it");
        C22839b c22839b = new C22839b(it, null, 0);
        Resources resources = c22839b.getResources();
        ThreadLocal threadLocal = AbstractC34523k.f145117a;
        Drawable drawable = resources.getDrawable(2131232283, null);
        if (drawable != null) {
            c22839b.setCompassImage(drawable);
        }
        int dimensionPixelSize = c22839b.getResources().getDimensionPixelSize(R.dimen.compass_view_size);
        c22839b.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        c22839b.setOnClickListener(new ViewOnClickListenerC21821j(c22839b, 5));
        c22839b.setContentDescription(it.getString(R.string.mapbox_compassContentDescription));
        return c22839b;
    }
}
