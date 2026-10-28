package bs1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.util.TextResource;
import ds1.C12334d;
import ds1.C12341k;
import j11.AbstractC21211n;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: bs1.l */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a?\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lds1/k;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "noCompleteJournalCallback", "yesDismissJournalCallback", "e", "(Lds1/k;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "journal_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3593l {
    /* JADX INFO: renamed from: e */
    public static final void m10955e(C12341k viewState, Function1 noCompleteJournalCallback, Function1 yesDismissJournalCallback, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(noCompleteJournalCallback, "noCompleteJournalCallback");
        AbstractC22676k.m65750j(yesDismissJournalCallback, "yesDismissJournalCallback");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-2043725023);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(noCompleteJournalCallback) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(yesDismissJournalCallback) ? 256 : 128;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 147) != 146)) {
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            C12334d c12334dM34449h = viewState.getIsSuccess().getExitConfirmationDialog();
            if (c12334dM34449h.getShouldShowExitConfirmationDialog()) {
                c28655q2.m87150e0(844604059);
                TextResource textResourceM34441f = c12334dM34449h.getTitle();
                TextResource textResourceM34440e = c12334dM34449h.getSubText();
                TextResource textResourceM34436a = c12334dM34449h.getDoNotRemindText();
                TextResource textResourceM34437b = c12334dM34449h.getPrimaryActionText();
                TextResource textResourceM34438c = c12334dM34449h.getSecondaryActionText();
                boolean zBooleanValue = ((Boolean) interfaceC28601c1.getValue()).booleanValue();
                boolean z4 = (i14 & 896) == 256;
                Object objM87133R2 = c28655q2.m87133R();
                if (z4 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C3590i(yesDismissJournalCallback, interfaceC28601c1, 0);
                    c28655q2.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
                boolean z13 = (i14 & 112) == 32;
                Object objM87133R3 = c28655q2.m87133R();
                if (z13 || objM87133R3 == c28676v0) {
                    objM87133R3 = new C3590i(noCompleteJournalCallback, interfaceC28601c1, 1);
                    c28655q2.m87172p0(objM87133R3);
                }
                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R3;
                Object objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C3591j(0, interfaceC28601c1);
                    c28655q2.m87172p0(objM87133R4);
                }
                Function1 function1 = (Function1) objM87133R4;
                int i15 = TextResource.$stable;
                AbstractC21211n.m59497o(null, textResourceM34441f, textResourceM34440e, textResourceM34437b, false, null, null, null, null, textResourceM34438c, textResourceM34436a, zBooleanValue, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a, null, interfaceC4339a2, function1, null, null, c28655q2, (i15 << 3) | (i15 << 6) | (i15 << 9) | (i15 << 27), i15 | 384, 196614, 212853233);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            } else {
                c28655q = c28655q2;
                c28655q.m87150e0(845230817);
                c28655q.m87173q(false);
            }
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3592k(viewState, noCompleteJournalCallback, yesDismissJournalCallback, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m10956f(Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
        function1.invoke(interfaceC28601c1.getValue());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m10957g(Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
        function1.invoke(interfaceC28601c1.getValue());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m10958h(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m10959i(C12341k c12341k, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m10955e(c12341k, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
