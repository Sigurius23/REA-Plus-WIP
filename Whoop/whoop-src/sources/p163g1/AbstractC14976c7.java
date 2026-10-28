package p163g1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b11.C2275b;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import fq0.C14682a;
import java.util.Set;
import l83.C23454a0;
import p007a6.C0438l0;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p389p0.C28539n0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p634y1.AbstractC39038k;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: g1.c7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC14976c7 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f55960a = 0;

    /* JADX INFO: renamed from: a */
    public static final void m43096a(final C14949a2 c14949a2, Modifier modifier, final Set set, final Function1 function1, final Function3 function3, final C37816b c37816b, Composer composer, final int i13, final int i14) {
        Modifier modifier2;
        int i15;
        final Modifier modifier3;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-9746411);
        int i16 = i13 | (c28655q.m87153g(c14949a2) ? 4 : 2);
        int i17 = i14 & 2;
        if (i17 != 0) {
            i15 = i16 | 48;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i15 = i16 | (c28655q.m87153g(modifier2) ? 32 : 16);
        }
        if (c28655q.m87135U(i15 & 1, (74899 & i15) != 74898)) {
            Modifier modifier4 = i17 != 0 ? C2314t.f9131w : modifier2;
            AbstractC22953f.m66714a(modifier4, null, false, AbstractC37817c.m121344e(-1281726977, c28655q, new C14965b7(set, function1, c14949a2, function3, c37816b)), c28655q, ((i15 >> 3) & 14) | 3072, 6);
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m(modifier3, set, function1, function3, c37816b, i13, i14) { // from class: g1.z6

                /* JADX INFO: renamed from: E */
                public final /* synthetic */ Function3 f57124E;

                /* JADX INFO: renamed from: F */
                public final /* synthetic */ C37816b f57125F;

                /* JADX INFO: renamed from: G */
                public final /* synthetic */ int f57126G;

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ Modifier f57128x;

                /* JADX INFO: renamed from: y */
                public final /* synthetic */ Set f57129y;

                /* JADX INFO: renamed from: z */
                public final /* synthetic */ Function1 f57130z;

                {
                    this.f57126G = i14;
                }

                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM87244L = AbstractC28683x.m87244L(224641);
                    AbstractC14976c7.m43096a(this.f57127w, this.f57128x, this.f57129y, this.f57130z, this.f57124E, this.f57125F, (Composer) obj, iM87244L, this.f57126G);
                    return C23454a0.f92919a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final C14949a2 m43097b(Function1 function1, C28655q c28655q) {
        EnumC14960b2 enumC14960b2 = EnumC14960b2.f55823w;
        Object[] objArr = new Object[0];
        C28539n0 c28539n0 = new C28539n0(10, new C14682a(16), new C2275b(function1, 4));
        boolean zM87149e = c28655q.m87149e(enumC14960b2.ordinal()) | c28655q.m87153g(function1);
        Object objM87133R = c28655q.m87133R();
        if (zM87149e || objM87133R == C28635l.f115821a) {
            objM87133R = new C0438l0(function1);
            c28655q.m87172p0(objM87133R);
        }
        return (C14949a2) AbstractC39038k.m124458d(objArr, c28539n0, (InterfaceC4339a) objM87133R, c28655q, 0);
    }
}
