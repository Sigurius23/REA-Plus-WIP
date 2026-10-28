package ad1;

import a11.C0130h;
import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.recyclerview.widget.AbstractC1717o2;
import c93.InterfaceC4339a;
import d91.AbstractC11814b;
import l83.C23454a0;
import ny0.AbstractC27282u;
import ny0.EnumC27284v;
import p000.AbstractC11266d;
import p004a2.C0155d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.C2384h2;
import p031b9.AbstractC2875y;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28653p1;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wb3.AbstractC37056f;
import yc1.C39433c;

/* JADX INFO: renamed from: ad1.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lad1/b;", "Landroidx/recyclerview/widget/o2;", "Landroid/view/ViewGroup;", "parentView", "Lyc1/c;", "binding", "<init>", "(Landroid/view/ViewGroup;Lyc1/c;)V", "", "position", "Ll83/a0;", "d", "(I)V", "a", "Lyc1/c;", "getBinding", "()Lyc1/c;", "design-showcase_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C0751b extends AbstractC1717o2 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C39433c binding;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C0751b(ViewGroup viewGroup, C39433c c39433c, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 2) != 0) {
            c39433c = C39433c.m125949c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            AbstractC22676k.m65749i(c39433c, "inflate(...)");
        }
        this(viewGroup, c39433c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m1826e(int i13, Composer composer, int i14) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            EnumC27284v enumC27284v = EnumC27284v.TextMedium;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            String strM8295h = AbstractC2875y.m8295h(i13, "Button A");
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C0155d(17);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27282u.m82292h(modifierM3409f, enumC27284v, strM8295h, false, 0L, null, false, (InterfaceC4339a) objM87133R, c28655q, 12582966, 120);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3421r(c2314t, 0, 8));
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            String strM8295h2 = AbstractC2875y.m8295h(i13, "Button B");
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C0155d(18);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC27282u.m82292h(modifierM3409f2, enumC27284v, strM8295h2, false, 0L, null, false, (InterfaceC4339a) objM87133R2, c28655q, 12582966, 120);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m1827f() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m1828g() {
        return C23454a0.f92919a;
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: d */
    public final void m1829d(int position) {
        ComposeView composeView = this.binding.f169670b;
        AbstractC22676k.m65749i(composeView, "composeView");
        AbstractC11814b.m31673c(composeView, new C37816b(new C0130h(position, 15), true, -739261306));
        this.binding.f169671c.setText("Item " + position);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0751b(ViewGroup parentView, C39433c binding) {
        super(binding.getRoot());
        AbstractC22676k.m65750j(parentView, "parentView");
        AbstractC22676k.m65750j(binding, "binding");
        this.binding = binding;
        binding.f169670b.setViewCompositionStrategy(C2384h2.f9434x);
    }
}
