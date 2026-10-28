package zm2;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import com.whoop.appconfiguration.TabConfiguration;
import com.whoop.data.repositories.FeatureFlagChecker;
import l83.C23454a0;
import p026b2.C2314t;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p713jm0.Function1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import vm2.C36159d;
import wk0.AbstractC37336b;
import x30.C37894h1;
import x81.AbstractC38073e;
import zi1.C40670c0;

/* JADX INFO: renamed from: zm2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lvm2/d;", "appNavigator", "Landroidx/compose/ui/Modifier;", "modifier", "Ll83/a0;", "c", "(Lvm2/d;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_prodStandardRelease"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40896a {
    /* JADX INFO: renamed from: c */
    public static final void m132551c(C36159d appNavigator, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        AbstractC22676k.m65750j(appNavigator, "appNavigator");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(507155467);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(appNavigator) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            modifier2 = i16 != 0 ? C2314t.f9131w : modifier;
            FeatureFlagChecker featureFlagChecker = (FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p());
            boolean z4 = featureFlagChecker.isFeatureEnabled("aix-coach-bar-fab") && featureFlagChecker.isFeatureEnabled("aix-coach-bar-home");
            boolean zIsFeatureEnabled = featureFlagChecker.isFeatureEnabled("aix-voice-realtime");
            String strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC37336b.f159683n);
            boolean zM87157i = c28655q.m87157i(appNavigator);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C37894h1(appNavigator, 19);
                c28655q.m87172p0(objM87133R);
            }
            Function1.m61617d((p715kotlin.jvm.functions.Function1) objM87133R, modifier2, z4, zIsFeatureEnabled, strM92103Y, c28655q, i15 & 112, 0);
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40670c0(appNavigator, i13, modifier2, i14, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m132552d(C36159d c36159d, TabConfiguration tab) {
        AbstractC22676k.m65750j(tab, "tab");
        c36159d.m115096L0(tab);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m132553e(C36159d c36159d, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m132551c(c36159d, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
