package ue1;

import androidx.compose.runtime.Composer;
import e93.AbstractC12889b;
import l83.C23454a0;
import l83.C23467m;
import p088dc.AbstractC11895b;
import p132f0.C13821r1;
import p390p1.AbstractC28683x;
import p390p1.C28624i0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28620h0;
import p40.C28827b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import so2.C32848f;

/* JADX INFO: renamed from: ue1.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lf0/r1;", "scrollState", "Lkotlin/Function1;", "", "Ll83/a0;", "fireEventWithScrollDepth", "c", "(Lf0/r1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "education_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34860c {

    /* JADX INFO: renamed from: ue1.c$a */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"ue1/c$a", "Lp1/h0;", "Ll83/a0;", "dispose", "()V", "runtime"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC28620h0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Function1 f146817a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC28601c1 f146818b;

        public a(Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
            this.f146817a = function1;
            this.f146818b = interfaceC28601c1;
        }

        @Override // p390p1.InterfaceC28620h0
        public void dispose() {
            this.f146817a.invoke(this.f146818b.getValue());
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m109947c(C13821r1 scrollState, Function1 fireEventWithScrollDepth, Composer composer, int i13) {
        int i14;
        Object objM107888l;
        AbstractC22676k.m65750j(scrollState, "scrollState");
        AbstractC22676k.m65750j(fireEventWithScrollDepth, "fireEventWithScrollDepth");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1488866324);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(scrollState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(fireEventWithScrollDepth) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11895b.m32005x(0, c28655q);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            try {
                objM107888l = Integer.valueOf(AbstractC12889b.m36258X((scrollState.f49318a.m87024x() / scrollState.f49321d.m87024x()) * 100));
            } catch (Throwable th3) {
                objM107888l = AbstractC34132o.m107888l(th3);
            }
            if (objM107888l instanceof C23467m) {
                objM107888l = null;
            }
            Integer num = (Integer) objM107888l;
            int iIntValue = num != null ? num.intValue() : 0;
            if (iIntValue > ((Number) interfaceC28601c1.getValue()).intValue()) {
                interfaceC28601c1.setValue(Integer.valueOf(iIntValue));
            }
            boolean z4 = (i14 & 112) == 32;
            Object objM87133R2 = c28655q.m87133R();
            if (z4 || objM87133R2 == c28676v0) {
                objM87133R2 = new C28827b(fireEventWithScrollDepth, interfaceC28601c1, 9);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87251e(C23454a0.f92919a, (Function1) objM87133R2, c28655q);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32848f(scrollState, fireEventWithScrollDepth, i13, 21);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final InterfaceC28620h0 m109948d(Function1 function1, InterfaceC28601c1 interfaceC28601c1, C28624i0 DisposableEffect) {
        AbstractC22676k.m65750j(DisposableEffect, "$this$DisposableEffect");
        return new a(function1, interfaceC28601c1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m109949e(C13821r1 c13821r1, Function1 function1, int i13, Composer composer, int i14) {
        m109947c(c13821r1, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
