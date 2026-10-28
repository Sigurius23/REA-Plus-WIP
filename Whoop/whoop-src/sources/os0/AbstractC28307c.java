package os0;

import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import d91.AbstractC11814b;
import j11.AbstractC21211n;
import j11.EnumC21213p;
import ks0.AbstractC22820a;
import l83.C23454a0;
import nr0.C27072e;
import oe2.C27878c;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p602x1.C37816b;
import p702ch0.C4651t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p717lq2.C24679k;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: os0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0006\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Landroidx/compose/ui/platform/ComposeView;", "Ll83/a0;", "j", "(Landroidx/compose/ui/platform/ComposeView;)V", "Lkotlin/Function0;", "onDismiss", "f", "(Lc93/a;Landroidx/compose/runtime/Composer;I)V", "connectivity-common-ui_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28307c {
    /* JADX INFO: renamed from: f */
    public static final void m85759f(InterfaceC4339a onDismiss, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(onDismiss, "onDismiss");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1240759150);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87157i(onDismiss) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
            EnumC21213p enumC21213p = EnumC21213p.LOTTIE;
            TextResource textResourceM21278l = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q2, AbstractC22820a.f89923d));
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q2, AbstractC22820a.f89921b));
            TextResource textResourceM21278l3 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q2, AbstractC22820a.f89922c));
            int i15 = i14 & 14;
            boolean z4 = i15 == 4;
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                objM87133R = new C24679k(onDismiss, 26);
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            boolean z13 = i15 == 4;
            Object objM87133R2 = c28655q2.m87133R();
            if (z13 || objM87133R2 == c28676v0) {
                objM87133R2 = new C24679k(onDismiss, 27);
                c28655q2.m87172p0(objM87133R2);
            }
            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
            int i16 = TextResource.$stable;
            c28655q = c28655q2;
            AbstractC21211n.m59497o(null, textResourceM21278l, textResourceM21278l2, textResourceM21278l3, true, null, null, null, null, null, null, false, false, enumC21213p, null, false, 0, null, null, null, false, null, interfaceC4339a, null, interfaceC4339a2, null, null, null, c28655q, (i16 << 3) | 24576 | (i16 << 6) | (i16 << 9), 3072, 0, 247455713);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4651t(i13, 14, onDismiss);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m85760g(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m85761h(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m85762i(InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m85759f(interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    public static final void m85763j(ComposeView composeView) {
        AbstractC22676k.m65750j(composeView, "<this>");
        composeView.setVisibility(0);
        AbstractC11814b.m31673c(composeView, new C37816b(new C27878c(composeView, 7), true, -1588311446));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m85764k(ComposeView composeView, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            boolean zM87157i = c28655q.m87157i(composeView);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C27072e(composeView, 17);
                c28655q.m87172p0(objM87133R);
            }
            m85759f((InterfaceC4339a) objM87133R, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m85765l(ComposeView composeView) {
        composeView.setVisibility(8);
        composeView.setContent(C28305a.f114121a.m85753b());
        return C23454a0.f92919a;
    }
}
