package p748zc1;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import c41.C4141w2;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import h32.C16829b;
import i81.AbstractC18215a;
import java.util.List;
import kd1.AbstractC22399k;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import v41.AbstractC35672j;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: zc1.h4 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Ll83/a0;", "g", "(Landroidx/compose/runtime/Composer;I)V", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40346h4 {
    /* JADX INFO: renamed from: g */
    public static final void m129893g(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-795697444);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
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
            AbstractC22399k.m64473c("10 Items", c28655q, 6);
            TextResource textResourceM21278l = AbstractC8693b.m21278l("Headline");
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l("Subheadline");
            List<C4141w2> listM52400a = AbstractC18215a.m52400a(c28655q, 0);
            boolean zM87157i = c28655q.m87157i(context);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C16829b(context, 25);
                c28655q.m87172p0(objM87133R);
            }
            int i14 = TextResource.$stable;
            int i15 = (i14 << 6) | (i14 << 9);
            AbstractC35672j.m112984d(null, null, textResourceM21278l, textResourceM21278l2, listM52400a, (Function1) objM87133R, c28655q, i15, 3);
            float f13 = 5 * 4;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
            AbstractC22399k.m64473c("4 Items", c28655q, 6);
            TextResource textResourceM21278l3 = AbstractC8693b.m21278l("Headline");
            TextResource textResourceM21278l4 = AbstractC8693b.m21278l("Subheadline");
            List<C4141w2> listSubList = AbstractC18215a.m52400a(c28655q, 0).subList(0, 4);
            boolean zM87157i2 = c28655q.m87157i(context);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C16829b(context, 26);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC35672j.m112984d(null, null, textResourceM21278l3, textResourceM21278l4, listSubList, (Function1) objM87133R2, c28655q, i15, 3);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
            AbstractC22399k.m64473c("1 Items", c28655q, 6);
            TextResource textResourceM21278l5 = AbstractC8693b.m21278l("Headline");
            TextResource textResourceM21278l6 = AbstractC8693b.m21278l("Subheadline");
            List<C4141w2> listSubList2 = AbstractC18215a.m52400a(c28655q, 0).subList(0, 1);
            boolean zM87157i3 = c28655q.m87157i(context);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v0) {
                objM87133R3 = new C16829b(context, 27);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC35672j.m112984d(null, null, textResourceM21278l5, textResourceM21278l6, listSubList2, (Function1) objM87133R3, c28655q, i15, 3);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
            AbstractC22399k.m64473c("Long headline", c28655q, 6);
            TextResource textResourceM21278l7 = AbstractC8693b.m21278l("Lorem ipsum dolor sit amet Lorem ipsum dolor sit amet");
            TextResource textResourceM21278l8 = AbstractC8693b.m21278l("Subheadline");
            List<C4141w2> listM52400a2 = AbstractC18215a.m52400a(c28655q, 0);
            boolean zM87157i4 = c28655q.m87157i(context);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i4 || objM87133R4 == c28676v0) {
                objM87133R4 = new C16829b(context, 28);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC35672j.m112984d(null, null, textResourceM21278l7, textResourceM21278l8, listM52400a2, (Function1) objM87133R4, c28655q, i15, 3);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
            AbstractC22399k.m64473c("Long subheadline", c28655q, 6);
            TextResource textResourceM21278l9 = AbstractC8693b.m21278l("Headline");
            TextResource textResourceM21278l10 = AbstractC8693b.m21278l("Lorem ipsum dolor sit amet Lorem ipsum dolor sit amet");
            List<C4141w2> listM52400a3 = AbstractC18215a.m52400a(c28655q, 0);
            boolean zM87157i5 = c28655q.m87157i(context);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i5 || objM87133R5 == c28676v0) {
                objM87133R5 = new C16829b(context, 29);
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC35672j.m112984d(null, null, textResourceM21278l9, textResourceM21278l10, listM52400a3, (Function1) objM87133R5, c28655q, i15, 3);
            AbstractC25012a.m73389v(c2314t, f13, c28655q, true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40461s3(i13, 13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m129894h(Context context, Object index) {
        AbstractC22676k.m65750j(index, "index");
        Toast.makeText(context, String.valueOf(index), 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m129895i(Context context, Object index) {
        AbstractC22676k.m65750j(index, "index");
        Toast.makeText(context, String.valueOf(index), 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m129896j(Context context, Object index) {
        AbstractC22676k.m65750j(index, "index");
        Toast.makeText(context, String.valueOf(index), 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m129897k(Context context, Object index) {
        AbstractC22676k.m65750j(index, "index");
        Toast.makeText(context, String.valueOf(index), 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m129898l(Context context, Object index) {
        AbstractC22676k.m65750j(index, "index");
        Toast.makeText(context, String.valueOf(index), 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m129899m(int i13, Composer composer, int i14) {
        m129893g(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
