package l31;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import k71.C22241a0;
import l83.C23454a0;
import l83.C23465k;
import p026b2.C2314t;
import p208i2.C17919x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import wb3.AbstractC37056f;
import y01.AbstractC39019b;
import y01.C39020c;

/* JADX INFO: renamed from: l31.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0005¨\u0006\b"}, m65681d2 = {"Ll83/a0;", "b", "(Landroidx/compose/runtime/Composer;I)V", "Lcom/whoop/design/util/TextResource;", "a", "Lcom/whoop/design/util/TextResource;", "CARDIO", "MUSCULAR", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23310d {

    /* JADX INFO: renamed from: a */
    private static final TextResource f92359a = AbstractC8693b.m21278l("CARDIO");

    /* JADX INFO: renamed from: b */
    private static final TextResource f92360b = AbstractC8693b.m21278l("MUSCULAR");

    /* JADX INFO: renamed from: l31.d$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f92361w = new a();

        /* JADX INFO: renamed from: a */
        public final long m67399a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getStrainZone5();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m67399a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m67397b(Composer composer, int i13) {
        Float fValueOf = Float.valueOf(50.0f);
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1584143656);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C23465k c23465k = new C23465k(Float.valueOf(10.0f), Float.valueOf(90.0f));
            TextResource textResource = f92359a;
            TextResource textResource2 = f92360b;
            AbstractC39019b.m124414f(modifierM3409f, new C39020c(c23465k, textResource, textResource2, AbstractC8693b.m21278l("10%"), AbstractC8693b.m21278l("90%"), null, 0.0f, 96, null), c28655q, 6, 0);
            float f13 = 4;
            AbstractC18489d0.m53380u(f13, f13, c2314t, c28655q);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            C23465k c23465k2 = new C23465k(fValueOf, fValueOf);
            TextResource textResourceM21278l = AbstractC8693b.m21278l("50%");
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l("50%");
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = a.f92361w;
                c28655q.m87172p0(objM87133R);
            }
            AbstractC39019b.m124414f(modifierM3409f2, new C39020c(c23465k2, textResource, textResource2, textResourceM21278l, textResourceM21278l2, p745y81.Function1.m125323a((Function1) objM87133R), 0.0f, 64, null), c28655q, 6, 0);
            C23454a0 c23454a0 = C23454a0.f92919a;
            AbstractC37056f.m118959K(c23454a0, c23454a0, c23454a0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22241a0(i13, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m67398c(int i13, Composer composer, int i14) {
        m67397b(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
