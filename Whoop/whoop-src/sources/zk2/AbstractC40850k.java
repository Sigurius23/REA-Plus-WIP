package zk2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: zk2.k */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a#\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\"\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\"\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\r"}, m65681d2 = {"Lzk2/l;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "Ll83/a0;", "d", "(Lzk2/l;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Ly3/f;", "a", "F", "trackSessionLiveBottomContentToPagerSpacing", "b", "trackSessionLiveBottomContentMetricsTopSpacing", "track-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40850k {

    /* JADX INFO: renamed from: a */
    private static final float f176082a;

    /* JADX INFO: renamed from: b */
    private static final float f176083b;

    static {
        float f13 = 8;
        f176082a = ((float) 5.5d) * f13;
        f176083b = 2 * f13;
    }

    /* JADX INFO: renamed from: d */
    public static final void m132387d(final C40851l c40851l, Modifier modifier, Composer composer, final int i13, final int i14) {
        int i15;
        final Modifier modifier2;
        C28677v1 c28677v1M87180u;
        InterfaceC4351m interfaceC4351m;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-308379272);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(c40851l) ? 4 : 2) | i13;
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
            C2314t c2314t = C2314t.f9131w;
            final Modifier modifier3 = i16 != 0 ? c2314t : modifier;
            if (c40851l == null) {
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u == null) {
                    return;
                }
                final int i17 = 0;
                interfaceC4351m = new InterfaceC4351m() { // from class: zk2.j
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i17) {
                            case 0:
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC40850k.m132388e(c40851l, modifier3, i13, i14, (Composer) obj, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj2).intValue();
                                return AbstractC40850k.m132390g(c40851l, modifier3, i13, i14, (Composer) obj, iIntValue2);
                        }
                    }
                };
            } else {
                Modifier modifier4 = modifier3;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f176082a, c2314t));
                InterfaceC25312u interfaceC25312uM132391a = c40851l.getFooter();
                if (interfaceC25312uM132391a == null) {
                    c28655q.m87150e0(8419198);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(8419199);
                    AbstractC25303l.m74291r(interfaceC25312uM132391a, null, new C40840a(2), null, c28655q, 0, 10);
                    AbstractC30007c.m91851u(c2314t, f176083b, c28655q, false);
                }
                AbstractC40856q.m132411b(c40851l.getMetrics().m107180a(), AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, modifier4), 2 * 8, 0.0f, 2), c28655q, 0, 0);
                modifier2 = modifier4;
            }
            c28677v1M87180u.f115982d = interfaceC4351m;
        }
        c28655q.m87138X();
        modifier2 = modifier;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final int i18 = 1;
            interfaceC4351m = new InterfaceC4351m() { // from class: zk2.j
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    switch (i18) {
                        case 0:
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC40850k.m132388e(c40851l, modifier2, i13, i14, (Composer) obj, iIntValue);
                        default:
                            int iIntValue2 = ((Integer) obj2).intValue();
                            return AbstractC40850k.m132390g(c40851l, modifier2, i13, i14, (Composer) obj, iIntValue2);
                    }
                }
            };
            c28677v1M87180u.f115982d = interfaceC4351m;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m132388e(C40851l c40851l, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m132387d(c40851l, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final Modifier m132389f(InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-1303854148);
        Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 2 * 8, 0.0f, 2);
        c28655q.m87173q(false);
        return modifierM3396r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m132390g(C40851l c40851l, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m132387d(c40851l, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
