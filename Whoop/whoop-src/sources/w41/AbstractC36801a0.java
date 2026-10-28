package w41;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import bi.AbstractC3269g;
import com.google.android.gms.common.util.VisibleForTesting;
import com.whoop.design.util.AbstractC8693b;
import eu.C13619j0;
import l83.C23454a0;
import o73.C27648a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28677v1;
import p481s6.AbstractC32229a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p734sl0.C32627j2;
import x81.C38072d;

/* JADX INFO: renamed from: w41.a0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lw41/z$b;", "mapState", "Ll83/a0;", "b", "(Lw41/z$b;Landroidx/compose/runtime/Composer;I)V", "Landroid/content/Context;", "context", "", "drawableRes", "Landroid/graphics/Bitmap;", "d", "(Landroid/content/Context;I)Landroid/graphics/Bitmap;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36801a0 {
    /* JADX INFO: renamed from: b */
    public static final void m117937b(AbstractC36826z.b mapState, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(mapState, "mapState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1167517429);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87157i(mapState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
            AbstractC3269g.m9502f(C38072d.f163053a.m121949b(c28655q2, 6).getStrain(), AbstractC36802b.m117942c(mapState), c28655q2, 0);
            C13619j0 c13619j0 = new C13619j0(AbstractC36816p.m118031a(mapState.getStartLatLng()));
            C28674u2 c28674u2 = AndroidCompositionLocals_androidKt.f4976b;
            c28655q = c28655q2;
            C27648a.m83585h(c13619j0, 0.0f, 0L, AbstractC32229a.m100258e(m117939d((Context) c28655q2.m87161k(c28674u2), mapState.getStartIcon())), 0L, AbstractC8693b.m21274h(mapState.getStartMarkerText(), c28655q2, 0), false, null, null, null, null, c28655q, 8);
            C27648a.m83585h(new C13619j0(AbstractC36816p.m118031a(mapState.getFinishLatLng())), 0.0f, 0L, AbstractC32229a.m100258e(m117939d((Context) c28655q.m87161k(c28674u2), mapState.getFinishIcon())), 0L, AbstractC8693b.m21274h(mapState.getFinishMarkerText(), c28655q, 0), false, null, null, null, null, c28655q, 8);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32627j2(mapState, i13, 25);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m117938c(AbstractC36826z.b bVar, int i13, Composer composer, int i14) {
        m117937b(bVar, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: d */
    public static final Bitmap m117939d(Context context, int i13) {
        AbstractC22676k.m65750j(context, "context");
        Drawable drawable = context.getResources().getDrawable(i13, null);
        AbstractC22676k.m65749i(drawable, "getDrawable(...)");
        Canvas canvas = new Canvas();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        AbstractC22676k.m65749i(bitmapCreateBitmap, "createBitmap(...)");
        canvas.setBitmap(bitmapCreateBitmap);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }
}
