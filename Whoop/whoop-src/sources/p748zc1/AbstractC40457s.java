package p748zc1;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import d11.C11476k;
import d41.AbstractC11679e;
import d41.AbstractC11683i;
import d41.AbstractC11684j;
import d41.EnumC11681g;
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
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: zc1.s */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Ll83/a0;", "b", "(Landroidx/compose/runtime/Composer;I)V", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40457s {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final void m130796b(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1572130556);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            TextResource textResourceM21278l = AbstractC8693b.m21278l("A cat was the Mayor of an Alaskan town for 20 years");
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
            float f13 = 4;
            C23010x c23010xM73381n = AbstractC25012a.m73381n(f13, f13, C2299e.f9111N, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM73381n);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC22399k.m64473c("Text - Small", c28655q, 6);
            EnumC11681g enumC11681g = EnumC11681g.SMALL;
            AbstractC22403o.c cVar = new AbstractC22403o.c("https://placekitten.com/1000/800", 0, 0, 0, 14, null);
            C38072d c38072d = C38072d.f163053a;
            DefaultConstructorMarker defaultConstructorMarker = null;
            TextResource textResource = null;
            AbstractC11683i abstractC11683i = null;
            AbstractC11684j.c cVar2 = new AbstractC11684j.c(null, cVar, null, Integer.valueOf(AbstractC25012a.m73369b(c38072d)), AbstractC8693b.m21278l("Cat Facts"), AbstractC8693b.m21278l("Aug 19, 2022"), textResourceM21278l, textResource, abstractC11683i, 389, defaultConstructorMarker);
            int i14 = (AbstractC11684j.c.f37770j << 9) | 24624;
            AbstractC11679e.m31124q(null, enumC11681g, null, cVar2, false, null, c28655q, i14, 37);
            AbstractC22399k.m64473c("Text - Large", c28655q, 6);
            EnumC11681g enumC11681g2 = EnumC11681g.LARGE;
            int i15 = 388;
            String str = "id";
            AbstractC11679e.m31124q(null, enumC11681g2, null, new AbstractC11684j.c(str, new AbstractC22403o.c("https://placekitten.com/1000/800", 0, 0, 0, 14, null), null, Integer.valueOf(AbstractC25012a.m73369b(c38072d)), AbstractC8693b.m21278l("Cat Facts"), AbstractC8693b.m21278l("Aug 19, 2022"), textResourceM21278l, textResource, abstractC11683i, i15, defaultConstructorMarker), false, null, c28655q, i14, 37);
            AbstractC22399k.m64473c("Text - Full Width", c28655q, 6);
            EnumC11681g enumC11681g3 = EnumC11681g.FULLWIDTH;
            String str2 = "id";
            AbstractC11679e.m31124q(null, enumC11681g3, null, new AbstractC11684j.c(str2, new AbstractC22403o.c("https://placekitten.com/1000/800", 0, 0, 0, 14, null), null, Integer.valueOf(AbstractC25012a.m73369b(c38072d)), AbstractC8693b.m21278l("Cat Facts"), AbstractC8693b.m21278l("Aug 19, 2022"), textResourceM21278l, textResource, abstractC11683i, i15, defaultConstructorMarker), false, null, c28655q, i14, 37);
            AbstractC22399k.m64473c("Text - No Date and No Icon - Small", c28655q, 6);
            int i16 = 429;
            AbstractC11679e.m31124q(null, enumC11681g, null, new AbstractC11684j.c(null, new AbstractC22403o.c("https://placekitten.com/1000/800", 0, 0, 0, 14, null), null, null, AbstractC8693b.m21278l("Cat Facts"), 0 == true ? 1 : 0, textResourceM21278l, textResource, abstractC11683i, i16, defaultConstructorMarker), false, null, c28655q, i14, 37);
            AbstractC22399k.m64473c("Text - No Date and No Icon - Large", c28655q, 6);
            AbstractC11679e.m31124q(null, enumC11681g2, null, new AbstractC11684j.c(null, new AbstractC22403o.c("https://placekitten.com/1000/800", 0, 0, 0, 14, 0 == true ? 1 : 0), null, null, AbstractC8693b.m21278l("Cat Facts"), 0 == true ? 1 : 0, textResourceM21278l, textResource, abstractC11683i, i16, defaultConstructorMarker), false, null, c28655q, i14, 37);
            AbstractC22399k.m64473c("Text - No Date and No Icon - Full Width", c28655q, 6);
            AbstractC11679e.m31124q(null, enumC11681g3, null, new AbstractC11684j.c(null, new AbstractC22403o.c("https://placekitten.com/1000/800", 0, 0, 0, 14, 0 == true ? 1 : 0), null, null, AbstractC8693b.m21278l("Cat Facts"), 0 == true ? 1 : 0, textResourceM21278l, textResource, abstractC11683i, i16, defaultConstructorMarker), false, null, c28655q, i14, 37);
            AbstractC22399k.m64473c("Video - Small", c28655q, 6);
            AbstractC11684j.d dVar = new AbstractC11684j.d(new AbstractC22403o.c("https://placekitten.com/1000/800", 0, 0, 0, 14, 0 == true ? 1 : 0), AbstractC8693b.m21278l("Cat Facts"), null, textResourceM21278l, null, 20, null);
            int i17 = (AbstractC11684j.d.f37780f << 9) | 24624;
            AbstractC11679e.m31124q(null, enumC11681g, null, dVar, false, null, c28655q, i17, 37);
            AbstractC22399k.m64473c("Video - Large", c28655q, 6);
            AbstractC11679e.m31124q(null, enumC11681g2, null, new AbstractC11684j.d(new AbstractC22403o.c("https://placekitten.com/1000/800", 0, 0, 0, 14, null), AbstractC8693b.m21278l("Cat Facts"), null, textResourceM21278l, null, 20, null), false, null, c28655q, i17, 37);
            AbstractC22399k.m64473c("Video - Full Width", c28655q, 6);
            AbstractC11679e.m31124q(null, enumC11681g3, null, new AbstractC11684j.d(new AbstractC22403o.c("https://placekitten.com/1000/800", 0, 0, 0, 14, null), AbstractC8693b.m21278l("Cat Facts"), null, textResourceM21278l, null, 20, null), false, null, c28655q, i17, 37);
            AbstractC22399k.m64473c("Discover - Small", c28655q, 6);
            AbstractC11684j.a aVar = AbstractC11684j.a.f37766a;
            int i18 = AbstractC11684j.a.f37767b << 9;
            int i19 = i18 | 24624;
            AbstractC11679e.m31124q(null, enumC11681g, null, aVar, false, null, c28655q, i19, 37);
            AbstractC22399k.m64473c("Discover - Large", c28655q, 6);
            AbstractC11679e.m31124q(null, enumC11681g2, null, aVar, false, null, c28655q, i19, 37);
            AbstractC22399k.m64473c("Discover - Full Width", c28655q, 6);
            AbstractC11679e.m31124q(null, enumC11681g3, null, aVar, false, null, c28655q, i19, 37);
            AbstractC22399k.m64473c("Stress Colors", c28655q, 6);
            C11476k c11476k = new C11476k(EnumC39333f.RECOVERY, 0.0f, 2, null);
            int i24 = (C11476k.f36889c << 6) | 24624 | i18;
            AbstractC11679e.m31124q(null, enumC11681g2, c11476k, aVar, false, null, c28655q, i24, 33);
            AbstractC11679e.m31124q(null, enumC11681g2, new C11476k(EnumC39333f.ACCENT_POSITIVE_TREND, 0.0f, 2, null), aVar, false, null, c28655q, i24, 33);
            AbstractC11679e.m31124q(null, enumC11681g2, new C11476k(EnumC39333f.ACCENT_NEGATIVE_TREND, 0.0f, 2, null), aVar, false, null, c28655q, i24, 33);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40363j(i13, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m130797c(int i13, Composer composer, int i14) {
        m130796b(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
