package p748zc1;

import al0.C0971f;
import android.content.Context;
import android.widget.Toast;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import c41.AbstractC4097q0;
import c41.AbstractC4125u0;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15673b0;
import i91.AbstractC18249c;
import kd1.AbstractC22399k;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p132f0.C13825t;
import p208i2.C17919x;
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
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: zc1.r0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Ll83/a0;", "e", "(Landroidx/compose/runtime/Composer;I)V", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40448r0 {
    /* JADX INFO: renamed from: e */
    public static final void m130735e(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-458309700);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            C2314t c2314t = C2314t.f9131w;
            float f13 = 1;
            Modifier modifierM3394p = AbstractC1099a.m3394p(8 * f13, AbstractC1102d.m3409f(1.0f, c2314t));
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
            AbstractC22399k.m64473c("Informational", c28655q, 6);
            float f14 = 4;
            float f15 = 2 * f14;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15, c2314t));
            C38072d c38072d = C38072d.f163053a;
            AbstractC4097q0.m12601p(null, new AbstractC4125u0.d(AbstractC25012a.m73365A(c38072d), AbstractC8693b.m21278l("LOW RECOVERY WITH GOOD SLEEP?"), AbstractC8693b.m21278l("Learn why your Recovery is in the RED, although your Sleep Performance is above 85%.")), 0L, null, null, c28655q, AbstractC4125u0.d.f16763d << 3, 29);
            float f16 = f14 * f14;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f16, c2314t));
            AbstractC22399k.m64473c("Generic Informational", c28655q, 6);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15, c2314t));
            Modifier modifierM52565c = AbstractC18249c.m52565c(c2314t, AbstractC18249c.m52570h(AbstractC15673b0.m43981E0()));
            long j7 = C17919x.f69636m;
            C13825t c13825t = new C13825t(f13, AbstractC15673b0.m43983F0());
            int customize = c38072d.m121951d().getAction().getCustomize();
            EnumC39333f enumC39333f = EnumC39333f.BLACK_30;
            TextResource textResourceM21278l = AbstractC8693b.m21278l("Enable Your Journal");
            EnumC39333f enumC39333f2 = EnumC39333f.BRAND_BLACK;
            AbstractC4097q0.m12601p(modifierM52565c, new AbstractC4125u0.c(customize, textResourceM21278l, AbstractC8693b.m21278l("Enable your journal to start tracking behaviors and see your recovery impacts"), enumC39333f, enumC39333f2, enumC39333f2), j7, c13825t, null, c28655q, (AbstractC4125u0.c.f16756g << 3) | 384, 16);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f16, c2314t));
            AbstractC22399k.m64473c("Error", c28655q, 6);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15, c2314t));
            AbstractC4125u0.b bVar = new AbstractC4125u0.b(c38072d.m121951d().getAction().getCustomize(), null, AbstractC8693b.m21278l("ALARM ON"), AbstractC8693b.m21278l("In The Green"), AbstractC8693b.m21278l("CHARGE YOUR WHOOP\nFOR 8:00 WAKEUP"), false, 34, null);
            int i14 = AbstractC4125u0.b.f16749g << 3;
            AbstractC4097q0.m12601p(null, bVar, 0L, null, null, c28655q, i14, 29);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15, c2314t));
            int customize2 = c38072d.m121951d().getAction().getCustomize();
            EnumC39333f enumC39333f3 = EnumC39333f.RECOVERY_HIGH_RECOVERY;
            AbstractC4097q0.m12601p(null, new AbstractC4125u0.b(customize2, enumC39333f3, AbstractC8693b.m21278l("ALARM ON"), AbstractC8693b.m21278l("In The Green"), AbstractC8693b.m21278l("CHARGE YOUR WHOOP\nFOR 8:00 WAKEUP"), true), 0L, null, null, c28655q, i14, 29);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15, c2314t));
            AbstractC4097q0.m12601p(null, new AbstractC4125u0.b(c38072d.m121951d().getAction().getCustomize(), null, AbstractC8693b.m21278l("ALARM ON"), AbstractC8693b.m21278l("100% Sleep Needed"), AbstractC8693b.m21278l("CHARGE YOUR WHOOP\nFOR 8:00 WAKEUP"), false, 34, null), 0L, null, null, c28655q, i14, 29);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f16, c2314t));
            AbstractC4097q0.m12601p(null, new AbstractC4125u0.b(c38072d.m121951d().getAction().getCustomize(), EnumC39333f.ACCENT_ACTION, AbstractC8693b.m21278l("ALARM ON"), AbstractC8693b.m21278l("100% Sleep Needed"), AbstractC8693b.m21278l("CHARGE YOUR WHOOP\nFOR 8:00 WAKEUP"), true), 0L, null, null, c28655q, i14, 29);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f16, c2314t));
            AbstractC22399k.m64473c("Text Link", c28655q, 6);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15, c2314t));
            AbstractC4125u0.e eVar = new AbstractC4125u0.e(c38072d.m121951d().getStrap().getStrap(), EnumC39333f.BRAND_WHITE, AbstractC8693b.m21278l("ALARM ON"), AbstractC8693b.m21278l("8:00am"), AbstractC8693b.m21278l("PLAN YOUR\nBEDTIME"));
            boolean zM87157i = c28655q.m87157i(context);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C0971f(context, 21);
                c28655q.m87172p0(objM87133R);
            }
            int i15 = AbstractC4125u0.e.f16767f << 3;
            AbstractC4097q0.m12601p(null, eVar, 0L, null, (InterfaceC4339a) objM87133R, c28655q, i15, 13);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15, c2314t));
            AbstractC4125u0.e eVar2 = new AbstractC4125u0.e(c38072d.m121951d().getVarious().getGoals(), EnumC39333f.WHITE_50, AbstractC8693b.m21278l("STRAIN COACH"), null, AbstractC8693b.m21278l("START ACTIVITY"), 8, null);
            boolean zM87157i2 = c28655q.m87157i(context);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C0971f(context, 22);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC4097q0.m12601p(null, eVar2, 0L, null, (InterfaceC4339a) objM87133R2, c28655q, i15, 13);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15, c2314t));
            AbstractC4125u0.e eVar3 = new AbstractC4125u0.e(AbstractC25012a.m73369b(c38072d), enumC39333f3, AbstractC8693b.m21278l("ALARM ON"), AbstractC8693b.m21278l("In The Green (8:00am)"), AbstractC8693b.m21278l("PLAN YOUR\nBEDTIME"));
            boolean zM87157i3 = c28655q.m87157i(context);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v0) {
                objM87133R3 = new C0971f(context, 23);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC4097q0.m12601p(null, eVar3, 0L, null, (InterfaceC4339a) objM87133R3, c28655q, i15, 13);
            AbstractC25012a.m73389v(c2314t, f16, c28655q, true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40363j(i13, 26);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m130736f(Context context) {
        Toast.makeText(context, "TEXT LINK - STRAP", 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m130737g(Context context) {
        Toast.makeText(context, "TEXT LINK - STRAIN", 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m130738h(Context context) {
        Toast.makeText(context, "TEXT LINK - SLEEP", 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m130739i(int i13, Composer composer, int i14) {
        m130735e(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
