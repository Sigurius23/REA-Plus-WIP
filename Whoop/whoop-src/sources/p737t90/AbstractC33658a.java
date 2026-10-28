package p737t90;

import androidx.compose.runtime.Composer;
import c03.C3815c;
import g80.C15565f;
import h80.InterfaceC17002b;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.C27239a1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p714k80.AbstractC22289r;
import p714k80.AbstractC22290s;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qc1.C30217a;

/* JADX INFO: renamed from: t90.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a]\u0010\f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lg80/f;", "viewState", "Lc03/c;", "whoopStatusViewState", "Lkotlin/Function1;", "Lj80/b;", "Ll83/a0;", "onViewEvent", "Ll80/o;", "onNavigationEvent", "Lh80/b;", "onAnalyticsEvent", "c", "(Lg80/f;Lc03/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "activation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33658a {
    /* JADX WARN: Code duplicated, block: B:47:0x008b  */
    /* JADX WARN: Code duplicated, block: B:48:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static final void m106300c(C15565f viewState, C3815c whoopStatusViewState, Function1 onViewEvent, Function1 onNavigationEvent, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        Function1 function4;
        Object objM87133R;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(whoopStatusViewState, "whoopStatusViewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-291453546);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(whoopStatusViewState) : c28655q.m87157i(whoopStatusViewState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87157i(onNavigationEvent) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i16 = i14 & 16;
        if (i16 == 0) {
            if ((i13 & 24576) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i16 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C30217a(17);
                        c28655q.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                } else {
                    function4 = function2;
                }
                if (viewState.getActivationState().getIsFullScreenLoading()) {
                    c28655q.m87150e0(1731638857);
                    AbstractC22290s.m64039c(c28655q, 0);
                    AbstractC22289r.m64035b(c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1731729191);
                    Function1.m106314g(onNavigationEvent, whoopStatusViewState, function4, onViewEvent, c28655q, ((i15 >> 9) & 14) | (C3815c.f15649d << 3) | (i15 & 112) | ((i15 >> 6) & 896) | ((i15 << 3) & 7168), 0);
                    c28655q.m87173q(false);
                }
                function3 = function4;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C27239a1(viewState, whoopStatusViewState, onViewEvent, onNavigationEvent, function3, i13, i14, 1);
            }
        }
        i15 |= 24576;
        function2 = function1;
        if ((i15 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i16 != 0) {
                objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C30217a(17);
                    c28655q.m87172p0(objM87133R);
                }
                function4 = (Function1) objM87133R;
            } else {
                function4 = function2;
            }
            if (viewState.getActivationState().getIsFullScreenLoading()) {
                c28655q.m87150e0(1731638857);
                AbstractC22290s.m64039c(c28655q, 0);
                AbstractC22289r.m64035b(c28655q, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1731729191);
                Function1.m106314g(onNavigationEvent, whoopStatusViewState, function4, onViewEvent, c28655q, ((i15 >> 9) & 14) | (C3815c.f15649d << 3) | (i15 & 112) | ((i15 >> 6) & 896) | ((i15 << 3) & 7168), 0);
                c28655q.m87173q(false);
            }
            function3 = function4;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27239a1(viewState, whoopStatusViewState, onViewEvent, onNavigationEvent, function3, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m106301d(InterfaceC17002b it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m106302e(C15565f c15565f, C3815c c3815c, Function1 function1, Function1 function2, Function1 function3, int i13, int i14, Composer composer, int i15) {
        m106300c(c15565f, c3815c, function1, function2, function3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
