package gv1;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import cy1.C11186b;
import gp1.C16065a;
import l83.C23454a0;
import p026b2.C2314t;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30792k;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: gv1.k */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"", "urlInput", "Lkotlin/Function1;", "Ll83/a0;", "onUrlInputChange", "Lgv1/l;", "onConfirm", "d", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "lottie-tester_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC16237k {
    /* JADX INFO: renamed from: d */
    public static final void m46001d(String urlInput, Function1 onUrlInputChange, Function1 onConfirm, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(urlInput, "urlInput");
        AbstractC22676k.m65750j(onUrlInputChange, "onUrlInputChange");
        AbstractC22676k.m65750j(onConfirm, "onConfirm");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-784202899);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(urlInput) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onUrlInputChange) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onConfirm) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            AbstractC16240n.m46014e("Please, enter the URL you want to override", !AbstractC39414r.m125890i0(urlInput), onConfirm, AbstractC37817c.m121344e(1133777766, c28655q, new C16235i(urlInput, onUrlInputChange)), c28655q, (i14 & 896) | 3078);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11186b(urlInput, onUrlInputChange, onConfirm, i13, 29);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m46002e(String str, Function1 function1, EnumC16238l unused$var$, Composer composer, int i13) {
        AbstractC22676k.m65750j(unused$var$, "$unused$var$");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            TextResource textResourceM21278l = AbstractC8693b.m21278l(str);
            TextResource textResourceM21267a = AbstractC8693b.m21267a();
            float f13 = 4;
            C33252i c33252iM105489e = AbstractC33253j.m105489e(f13 * f13);
            InterfaceC4351m interfaceC4351mM45936b = C16228b.f61663a.m45936b();
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C16065a(17);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            int i14 = TextResource.$stable;
            AbstractC30792k.m94678l(modifierM3409f, textResourceM21278l, null, null, null, null, interfaceC4351mM45936b, null, textResourceM21267a, false, false, null, 0L, false, 5, 0, 0, false, null, false, false, 0, false, null, null, c33252iM105489e, null, null, null, null, interfaceC4339a, function1, c28655q, (i14 << 3) | 1572870 | (i14 << 24), 24576, 0, 6, 1040170684, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m46003f() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m46004g(String str, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m46001d(str, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
