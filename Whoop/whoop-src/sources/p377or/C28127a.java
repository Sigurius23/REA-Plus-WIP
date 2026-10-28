package p377or;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import ng3.C26702o;
import p287kq.AbstractC22766a;

/* JADX INFO: renamed from: or.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C28127a extends C26702o {

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f113765x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C28127a(int i13) {
        super(9, false);
        this.f113765x = i13;
    }

    @Override // ng3.C26702o
    /* JADX INFO: renamed from: p */
    public final void mo79417p(TabLayout tabLayout, View view, View view2, float f13, Drawable drawable) {
        float fSin;
        float fCos;
        switch (this.f113765x) {
            case 0:
                RectF rectFM79408k = C26702o.m79408k(tabLayout, view);
                RectF rectFM79408k2 = C26702o.m79408k(tabLayout, view2);
                if (rectFM79408k.left < rectFM79408k2.left) {
                    double d3 = (((double) f13) * 3.141592653589793d) / 2.0d;
                    fSin = (float) (1.0d - Math.cos(d3));
                    fCos = (float) Math.sin(d3);
                } else {
                    double d14 = (((double) f13) * 3.141592653589793d) / 2.0d;
                    fSin = (float) Math.sin(d14);
                    fCos = (float) (1.0d - Math.cos(d14));
                }
                drawable.setBounds(AbstractC22766a.m65971c(fSin, (int) rectFM79408k.left, (int) rectFM79408k2.left), drawable.getBounds().top, AbstractC22766a.m65971c(fCos, (int) rectFM79408k.right, (int) rectFM79408k2.right), drawable.getBounds().bottom);
                break;
            default:
                if (f13 >= 0.5f) {
                    view = view2;
                }
                RectF rectFM79408k3 = C26702o.m79408k(tabLayout, view);
                float fM65970b = f13 < 0.5f ? AbstractC22766a.m65970b(1.0f, 0.0f, 0.0f, 0.5f, f13) : AbstractC22766a.m65970b(0.0f, 1.0f, 0.5f, 1.0f, f13);
                drawable.setBounds((int) rectFM79408k3.left, drawable.getBounds().top, (int) rectFM79408k3.right, drawable.getBounds().bottom);
                drawable.setAlpha((int) (fM65970b * 255.0f));
                break;
        }
    }
}
