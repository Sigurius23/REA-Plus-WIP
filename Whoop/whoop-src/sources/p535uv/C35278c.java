package p535uv;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p513u4.AbstractC34523k;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: uv.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C35278c extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public static final C35278c f150156w = new C35278c(1);

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context it = (Context) obj;
        AbstractC22676k.m65750j(it, "it");
        C35277b c35277b = new C35277b(it, null);
        Resources resources = c35277b.getResources();
        ThreadLocal threadLocal = AbstractC34523k.f145117a;
        Drawable drawable = resources.getDrawable(2131232288, null);
        if (drawable != null) {
            c35277b.setImageDrawable(drawable);
        }
        float f13 = c35277b.getContext().getResources().getDisplayMetrics().density;
        c35277b.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        c35277b.setLogoGravity(8388691);
        int i13 = (int) (4 * f13);
        ViewGroup.LayoutParams layoutParams = c35277b.getLayoutParams();
        AbstractC22676k.m65748h(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.setMargins(i13, i13, i13, i13);
        layoutParams2.setMarginStart(i13);
        layoutParams2.setMarginEnd(i13);
        return c35277b;
    }
}
