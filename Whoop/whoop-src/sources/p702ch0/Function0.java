package p702ch0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import l83.C23454a0;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p043c4.C3948a0;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p291l0.C23016z;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p701ce2.C4494b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import se.AbstractC32411b;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: ch0.i1, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a1\u0010\u0006\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lkotlin/Function0;", "Ll83/a0;", "onDismiss", "Lkotlin/Function1;", "Ll0/y;", "content", "c", "(Lc93/a;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class Function0 {
    /* JADX INFO: renamed from: c */
    public static final void m14387c(InterfaceC4339a onDismiss, Function3 content, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(onDismiss, "onDismiss");
        AbstractC22676k.m65750j(content, "content");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(19682479);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(onDismiss) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(content) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            AbstractC32411b.m101089d(onDismiss, new C3948a0(3), AbstractC37817c.m121344e(942198470, c28655q, new C4630j0(3, onDismiss, content)), c28655q, (i14 & 14) | 432);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4494b(onDismiss, content, i13, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m14388d(InterfaceC4339a interfaceC4339a, Function3 function3, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Modifier modifierM94757f = AbstractC30802r.m94757f(C2314t.f9131w, 1.0f);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM94757f);
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
            AbstractC6719b.m20143d(null, AbstractC6721d.Companion.m20172c(AbstractC6721d.INSTANCE, AbstractC8693b.m21267a(), null, null, 6, null), null, interfaceC4339a, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 53);
            function3.invoke(C23016z.f90757a, c28655q, 6);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m14389e(InterfaceC4339a interfaceC4339a, Function3 function3, int i13, Composer composer, int i14) {
        m14387c(interfaceC4339a, function3, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
