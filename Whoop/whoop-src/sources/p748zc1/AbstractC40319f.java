package p748zc1;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import c13.AbstractC3855a;
import c41.AbstractC4145x;
import c41.C4047j;
import c41.C4082o;
import c41.C4138w;
import c41.EnumC4033h;
import c41.EnumC4040i;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.ActivityDetailType;
import gz0.AbstractC16319p0;
import gz0.EnumC16313m0;
import h32.C16829b;
import kd1.AbstractC22399k;
import kd1.AbstractC22403o;
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
import p745y81.EnumC39333f;
import v41.C35658c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: zc1.f */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Ll83/a0;", "f", "(Landroidx/compose/runtime/Composer;I)V", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40319f {
    /* JADX INFO: renamed from: f */
    public static final void m129676f(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-263525692);
        boolean z4 = false;
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3394p = AbstractC1099a.m3394p(1 * 8, AbstractC1102d.m3409f(1.0f, c2314t));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
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
            AbstractC22399k.m64473c("Empty Pill - Button Type", c28655q, 6);
            int i14 = 2;
            float f13 = 4;
            float f14 = 2 * f13;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            C4047j c4047j = new C4047j();
            TextResource textResourceM21278l = AbstractC8693b.m21278l("TITLE");
            C4082o c4082o = new C4082o(true, null, new AbstractC22403o.a(AbstractC16319p0.m46430a().getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String().getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String()), null, null, 26, null);
            AbstractC4145x.a aVar = new AbstractC4145x.a(AbstractC8693b.m21278l("PROCESS"), "PROCESS Pressed", EnumC4040i.PROCESS_NOW, false, null, 24, null);
            ActivityDetailType activityDetailType = ActivityDetailType.SLEEP;
            C4138w c4138w = new C4138w(null, textResourceM21278l, c4082o, aVar, activityDetailType, null, null, null, false ? 1 : 0, null, false ? 1 : 0, false, null, null, 16353, null);
            boolean zM87157i = c28655q.m87157i(context);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            Object obj = objM87133R;
            if (zM87157i || objM87133R == c28676v0) {
                C16829b c16829b = new C16829b(context, 5);
                c28655q.m87172p0(c16829b);
                obj = c16829b;
            }
            int i15 = C4138w.f16823o | (C4047j.f16424a << 6);
            c4047j.Compose(c4138w, (Function1) obj, c28655q, i15);
            float f15 = f13 * f13;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15, c2314t));
            AbstractC22399k.m64473c("Empty Pill - Text Type", c28655q, 6);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            C4047j c4047j2 = new C4047j();
            C4138w c4138w2 = new C4138w(null, AbstractC8693b.m21278l("TITLE"), new C4082o(true, null, new AbstractC22403o.a(AbstractC3855a.m11817a()), null, null, 26, null), new AbstractC4145x.b(AbstractC8693b.m21278l("Pending"), z4, i14, null), activityDetailType, null, null, null, null, null, null, false, null, null, 16353, null);
            boolean zM87157i2 = c28655q.m87157i(context);
            Object objM87133R2 = c28655q.m87133R();
            Object obj2 = objM87133R2;
            if (zM87157i2 || objM87133R2 == c28676v0) {
                C16829b c16829b2 = new C16829b(context, 6);
                c28655q.m87172p0(c16829b2);
                obj2 = c16829b2;
            }
            c4047j2.Compose(c4138w2, (Function1) obj2, c28655q, i15);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15, c2314t));
            AbstractC22399k.m64473c("Icon + Text", c28655q, 6);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            C4047j c4047j3 = new C4047j();
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l("TITLE");
            EnumC39333f enumC39333f = EnumC39333f.STRAIN;
            C4138w c4138w3 = new C4138w(null, textResourceM21278l2, new C4082o(false, enumC39333f, new AbstractC22403o.a(AbstractC3855a.m11817a()), AbstractC8693b.m21278l("12.1"), null, 17, null), new AbstractC4145x.c(AbstractC8693b.m21278l("8:00am"), AbstractC8693b.m21278l("9:00am"), enumC39333f), activityDetailType, null, null, null, null, null, null, false, null, null, 16353, null);
            boolean zM87157i3 = c28655q.m87157i(context);
            Object objM87133R3 = c28655q.m87133R();
            Object obj3 = objM87133R3;
            if (zM87157i3 || objM87133R3 == c28676v0) {
                C16829b c16829b3 = new C16829b(context, 7);
                c28655q.m87172p0(c16829b3);
                obj3 = c16829b3;
            }
            c4047j3.Compose(c4138w3, (Function1) obj3, c28655q, i15);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15, c2314t));
            AbstractC22399k.m64473c("Icon + Icon", c28655q, 6);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            C4047j c4047j4 = new C4047j();
            TextResource textResourceM21278l3 = AbstractC8693b.m21278l("TITLE");
            EnumC39333f enumC39333f2 = EnumC39333f.SLEEP;
            C4138w c4138w4 = new C4138w(null, textResourceM21278l3, new C4082o(false, enumC39333f2, new AbstractC22403o.a(AbstractC16319p0.m46430a().getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String().getNap()), null, EnumC16313m0.NO_INTERNET, 9, null), new AbstractC4145x.c(AbstractC8693b.m21278l("Start"), AbstractC8693b.m21278l("End"), enumC39333f2), activityDetailType, null, null, null, null, null, null, false, null, null, 16353, null);
            boolean zM87157i4 = c28655q.m87157i(context);
            Object objM87133R4 = c28655q.m87133R();
            Object obj4 = objM87133R4;
            if (zM87157i4 || objM87133R4 == c28676v0) {
                C16829b c16829b4 = new C16829b(context, 8);
                c28655q.m87172p0(c16829b4);
                obj4 = c16829b4;
            }
            c4047j4.Compose(c4138w4, (Function1) obj4, c28655q, i15);
            AbstractC25012a.m73389v(c2314t, f15, c28655q, true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35658c(i13, 27);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m129677g(Context context, Object it) {
        AbstractC22676k.m65750j(it, "it");
        Toast.makeText(context, ((EnumC4033h) it).name(), 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m129678h(Context context, Object it) {
        AbstractC22676k.m65750j(it, "it");
        Toast.makeText(context, ((EnumC4033h) it).name(), 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m129679i(Context context, Object it) {
        AbstractC22676k.m65750j(it, "it");
        Toast.makeText(context, ((EnumC4033h) it).name(), 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m129680j(Context context, Object it) {
        AbstractC22676k.m65750j(it, "it");
        Toast.makeText(context, ((EnumC4033h) it).name(), 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m129681k(int i13, Composer composer, int i14) {
        m129676f(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
