package p748zc1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15673b0;
import i21.AbstractC18001k;
import i21.C18000j;
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
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import t71.AbstractC33564a;
import t71.AbstractC33576m;
import t71.AbstractC33578o;
import t71.C33565b;
import t71.C33573j;
import t71.C33579p;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: zc1.a4 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Ll83/a0;", "b", "(Landroidx/compose/runtime/Composer;I)V", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40269a4 {
    /* JADX INFO: renamed from: b */
    public static final void m129320b(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-939879502);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 2;
            Modifier modifierM3394p = AbstractC1099a.m3394p(8 * f13, AbstractC15673b0.m44008S(c2314t));
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
            AbstractC22399k.m64473c("Sufficient tile state", c28655q, 6);
            float f14 = f13 * 4;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            List<C18000j> listSubList = AbstractC18001k.m51643b(c28655q, 0).subList(0, 4);
            TextResource textResourceM21278l = AbstractC8693b.m21278l("% Impact");
            C38072d c38072d = C38072d.f163053a;
            int iM46248z = c38072d.m121951d().getTinyIcons().getTriangleDown();
            EnumC39333f enumC39333f = EnumC39333f.ACCENT_NEGATIVE_TREND;
            EnumC39333f enumC39333f2 = EnumC39333f.ACCENT_NEGATIVE_TREND_15;
            C33565b c33565b = new C33565b(iM46248z, enumC39333f, AbstractC8693b.m21278l("Hurts"), enumC39333f, enumC39333f2);
            int iM46221A = c38072d.m121951d().getTinyIcons().getTriangleUp();
            EnumC39333f enumC39333f3 = EnumC39333f.ACCENT_POSITIVE_TREND;
            EnumC39333f enumC39333f4 = EnumC39333f.ACCENT_POSITIVE_TREND_15;
            int i14 = 1;
            DefaultConstructorMarker defaultConstructorMarker = null;
            C33573j c33573j = new C33573j(null, listSubList, textResourceM21278l, c33565b, new C33565b(iM46221A, enumC39333f3, AbstractC8693b.m21278l("Helps"), enumC39333f3, enumC39333f4), i14, defaultConstructorMarker);
            int i15 = C33573j.f140074f << 3;
            AbstractC33576m.m106038h(null, c33573j, null, c28655q, i15, 5);
            AbstractC22399k.m64473c("Insufficient tile state", c28655q, 6);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            AbstractC33578o.m106055d(null, new C33579p(null, AbstractC8693b.m21278l("NOT ENOUGH ANSWERS"), AbstractC8693b.m21278l("Log at least 5 yes's and 5 no's for each behavior to see how they impact ya Recovery."), AbstractC18001k.m51643b(c28655q, 0).subList(4, 6), i14, defaultConstructorMarker), null, c28655q, C33579p.f140093e << 3, 5);
            AbstractC22399k.m64473c("Empty State", c28655q, 6);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            AbstractC33564a.m105986e(null, new C33573j(null, AbstractC18001k.m51643b(c28655q, 0).subList(6, 9), AbstractC8693b.m21278l("% Impact"), new C33565b(c38072d.m121951d().getTinyIcons().getTriangleDown(), enumC39333f, AbstractC8693b.m21278l("Hurts"), enumC39333f, enumC39333f2), new C33565b(c38072d.m121951d().getTinyIcons().getTriangleUp(), enumC39333f3, AbstractC8693b.m21278l("Helps"), enumC39333f3, enumC39333f4), 1, null), c28655q, i15, 1);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40461s3(i13, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m129321c(int i13, Composer composer, int i14) {
        m129320b(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
