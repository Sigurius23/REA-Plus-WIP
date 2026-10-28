package p700bd1;

import a01.C0085e;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4353o;
import e93.AbstractC12889b;
import f31.AbstractC14046c;
import f31.C14044a;
import java.util.List;
import l83.C23454a0;
import p026b2.C2314t;
import p208i2.C17919x;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p490t0.AbstractC33253j;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import x81.C38072d;

/* JADX INFO: renamed from: bd1.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010\u0007\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"", "Li2/x;", "colors", "selectedColor", "Lkotlin/Function1;", "Ll83/a0;", "onColorSelected", "b", "(Ljava/util/List;Li2/x;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3087e {

    /* JADX INFO: renamed from: bd1.e$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC4353o {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f12128w;

        public a(Function1 function1) {
            this.f12128w = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: e */
        public static final C23454a0 m8849e(Function1 function1, long j7) {
            function1.invoke(new C17919x(j7));
            return C23454a0.f92919a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public static final C23454a0 m8850f(long j7, Composer composer, int i13) {
            C28655q c28655q = (C28655q) composer;
            if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC1099a.m3394p(1 * 8, AbstractC1099a.m3384f(AbstractC1102d.m3411h(4 * 10.0f, C2314t.f9131w), false, 1.0f)), j7, AbstractC33253j.f138651a), c28655q, 0);
            } else {
                c28655q.m87138X();
            }
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: d */
        public final void m8851d(InterfaceC1103a RadioGroup, final long j7, C14044a state, Composer composer, int i13) {
            int i14;
            long jM95628d;
            AbstractC22676k.m65750j(RadioGroup, "$this$RadioGroup");
            AbstractC22676k.m65750j(state, "state");
            if ((i13 & 48) == 0) {
                i14 = (((C28655q) composer).m87151f(j7) ? 32 : 16) | i13;
            } else {
                i14 = i13;
            }
            if ((i13 & 384) == 0) {
                i14 |= (i13 & 512) == 0 ? ((C28655q) composer).m87153g(state) : ((C28655q) composer).m87157i(state) ? 256 : 128;
            }
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i14 & 1, (i14 & 1169) != 1168)) {
                c28655q.m87138X();
                return;
            }
            if (state.getIsSelected()) {
                c28655q.m87150e0(-1724926112);
                c28655q.m87173q(false);
                jM95628d = C17919x.f69632i;
            } else {
                c28655q.m87150e0(-1724885967);
                jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            }
            long j13 = jM95628d;
            Modifier modifierM3394p = AbstractC1099a.m3394p(2 * 8, AbstractC1102d.m3409f(1.0f, C2314t.f9131w));
            boolean zM87153g = c28655q.m87153g(this.f12128w) | ((i14 & 112) == 32);
            final Function1 function1 = this.f12128w;
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new InterfaceC4339a() { // from class: bd1.c
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        return AbstractC3087e.a.m8849e(function1, j7);
                    }
                };
                c28655q.m87172p0(objM87133R);
            }
            AbstractC12889b.m36263b(AbstractC1092a.m3362g(modifierM3394p, false, null, null, (InterfaceC4339a) objM87133R, 15), AbstractC33253j.m105489e(1 * 4), j13, null, 0.0f, AbstractC37817c.m121344e(-1336913539, c28655q, new InterfaceC4351m() { // from class: bd1.d
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC3087e.a.m8850f(j7, (Composer) obj, iIntValue);
                }
            }), c28655q, 1572864, 56);
        }

        @Override // c93.InterfaceC4353o
        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            m8851d((InterfaceC1103a) obj, ((C17919x) obj2).f69639a, (C14044a) obj3, (Composer) obj4, ((Number) obj5).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m8845b(List<C17919x> colors, C17919x c17919x, Function1 onColorSelected, Composer composer, int i13, int i14) {
        int i15;
        C17919x c17919x2;
        AbstractC22676k.m65750j(colors, "colors");
        AbstractC22676k.m65750j(onColorSelected, "onColorSelected");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2099791832);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(colors) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(c17919x) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onColorSelected) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C17919x c17919x3 = i16 != 0 ? null : c17919x;
            AbstractC14046c.m39965e(colors, c17919x3, null, null, null, AbstractC37817c.m121344e(-1577853952, c28655q, new a(onColorSelected)), c28655q, (i15 & 14) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | (i15 & 112), 28);
            c17919x2 = c17919x3;
        } else {
            c28655q.m87138X();
            c17919x2 = c17919x;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0085e(colors, c17919x2, onColorSelected, i13, i14, 17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m8846c(List list, C17919x c17919x, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m8845b(list, c17919x, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
