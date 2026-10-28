package p748zc1;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import c41.C4002c3;
import c41.EnumC4009d3;
import com.whoop.design.util.AbstractC8693b;
import java.util.List;
import kd1.AbstractC22403o;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.AbstractC25303l;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: zc1.n4 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\"\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m65681d2 = {"Ll83/a0;", "c", "(Landroidx/compose/runtime/Composer;I)V", "", "Lc41/c3;", "a", "Ljava/util/List;", "listItemTileSamples", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40412n4 {

    /* JADX INFO: renamed from: a */
    private static final List<C4002c3> f174369a;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        String str = null;
        String str2 = null;
        C4002c3 c4002c3 = new C4002c3(EnumC4009d3.ARTICLE, new AbstractC22403o.c("https://cdn1.sph.harvard.edu/wp-content/uploads/sites/30/2019/09/aqua-beverage-clean-1615011.jpg", 0, 0, 0, 14, defaultConstructorMarker), AbstractC8693b.m21278l("The title for this tile is limited to three lines, if longer it will truncate"), AbstractC8693b.m21278l("MARCH 2023"), str, str2, 48, defaultConstructorMarker);
        int i13 = 0;
        String str3 = null;
        String str4 = null;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        String str5 = null;
        String str6 = null;
        f174369a = AbstractC37056f.m118959K(c4002c3, new C4002c3(EnumC4009d3.PODCAST, new AbstractC22403o.c("https://cdn1.sph.harvard.edu/wp-content/uploads/sites/30/2019/09/aqua-beverage-clean-1615011.jpg", 0, 0, i13, 14, null), AbstractC8693b.m21278l("The title for this tile is limited to three lines, if longer it will truncate"), AbstractC8693b.m21278l("MARCH 2023"), str3, str4, 48, null), new C4002c3(EnumC4009d3.VIDEO, new AbstractC22403o.c("https://cdn1.sph.harvard.edu/wp-content/uploads/sites/30/2019/09/aqua-beverage-clean-1615011.jpg", i13, 0, 0, 14, defaultConstructorMarker2), AbstractC8693b.m21278l("The title for this tile is limited to three lines, if longer it will truncate. This title is very long, and it should eventually truncate with an ellipsis"), AbstractC8693b.m21278l("MARCH 2023"), str5, str6, 48, defaultConstructorMarker2));
    }

    /* JADX INFO: renamed from: c */
    public static final void m130443c(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1970580280);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            float f13 = 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(2 * f13, C2314t.f9131w);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(3 * f13), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            c28655q.m87150e0(73224985);
            for (C4002c3 c4002c3 : f174369a) {
                boolean zM87157i = c28655q.m87157i(context);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == C28635l.f115821a) {
                    objM87133R = new C40401m4(context, 0);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC25303l.m74291r(c4002c3, null, null, (Function1) objM87133R, c28655q, C4002c3.f16276g, 6);
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40461s3(i13, 17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m130444d(Context context, Object it) {
        AbstractC22676k.m65750j(it, "it");
        Toast.makeText(context, "List Item Tile Clicked", 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m130445e(int i13, Composer composer, int i14) {
        m130443c(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
