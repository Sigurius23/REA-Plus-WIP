package zq0;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import ih0.AbstractC18489d0;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25297f;
import w41.AbstractC36811k;
import w41.AbstractC36826z;
import w41.C36815o;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: zq0.a0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J3\u0010\f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0017¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lzq0/a0;", "Lm91/f;", "Lw41/o;", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "modifier", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "c", "(Landroidx/compose/ui/Modifier;Lw41/o;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "community-everyday-stats_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40956a0 implements InterfaceC25297f<C36815o> {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m132901d(C40956a0 c40956a0, Modifier modifier, C36815o c36815o, Function1 function1, int i13, Composer composer, int i14) {
        c40956a0.Compose(modifier, c36815o, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m132902e(C40956a0 c40956a0, Modifier modifier, C36815o c36815o, Function1 function1, int i13, Composer composer, int i14) {
        c40956a0.Compose(modifier, c36815o, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    @Override // p720m91.InterfaceC25297f
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void Compose(final Modifier modifier, final C36815o itemState, final Function1 onViewEvent, Composer composer, final int i13) {
        int i14;
        C28677v1 c28677v1M87180u;
        InterfaceC4351m interfaceC4351m;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(itemState, "itemState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1656566565);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87153g(modifier) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(itemState) : c28655q.m87157i(itemState) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            AbstractC36826z mapState = itemState.getMapState();
            if (mapState == null) {
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u == null) {
                    return;
                }
                final int i15 = 0;
                interfaceC4351m = new InterfaceC4351m(this) { // from class: zq0.z

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ C40956a0 f176886x;

                    {
                        this.f176886x = this;
                    }

                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i15) {
                            case 0:
                                int iIntValue = ((Integer) obj2).intValue();
                                return C40956a0.m132901d(this.f176886x, modifier, itemState, onViewEvent, i13, (Composer) obj, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj2).intValue();
                                return C40956a0.m132902e(this.f176886x, modifier, itemState, onViewEvent, i13, (Composer) obj, iIntValue2);
                        }
                    }
                };
            } else {
                float f13 = 4;
                Modifier modifierM53364e = AbstractC18489d0.m53364e(AbstractC1102d.m3411h(69 * f13, AbstractC1102d.m3409f(1.0f, modifier)), 2, f13);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                int iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM53364e);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                C0209i c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                AbstractC36811k.m117998l(mapState, AbstractC1102d.m3407d(1.0f, C2314t.f9131w), false, null, false, c28655q, AbstractC36826z.f157519a | 432, 24);
                c28655q.m87173q(true);
            }
            c28677v1M87180u.f115982d = interfaceC4351m;
        }
        c28655q.m87138X();
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final int i16 = 1;
            interfaceC4351m = new InterfaceC4351m(this) { // from class: zq0.z

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ C40956a0 f176886x;

                {
                    this.f176886x = this;
                }

                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    switch (i16) {
                        case 0:
                            int iIntValue = ((Integer) obj2).intValue();
                            return C40956a0.m132901d(this.f176886x, modifier, itemState, onViewEvent, i13, (Composer) obj, iIntValue);
                        default:
                            int iIntValue2 = ((Integer) obj2).intValue();
                            return C40956a0.m132902e(this.f176886x, modifier, itemState, onViewEvent, i13, (Composer) obj, iIntValue2);
                    }
                }
            };
            c28677v1M87180u.f115982d = interfaceC4351m;
        }
    }
}
