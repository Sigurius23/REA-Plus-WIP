package u71;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import l83.C23454a0;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import t01.C33259e;

/* JADX INFO: renamed from: u71.i */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lu71/j;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "c", "(Landroidx/compose/ui/Modifier;Lu71/j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34575i {
    /* JADX INFO: renamed from: c */
    public static final void m109349c(Modifier modifier, C34576j viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(688168330);
        if ((i13 & 48) == 0) {
            i15 = (c28655q.m87157i(viewState) ? 32 : 16) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 4;
        if (i16 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 145) != 144)) {
            if ((i14 & 1) != 0) {
                modifier = C2314t.f9131w;
            }
            if (i16 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C34569c(2);
                    c28655q.m87172p0(objM87133R);
                }
                function1 = (Function1) objM87133R;
            }
            AbstractC34578l type = viewState.getType();
            if (AbstractC22676k.m65745e(type, AbstractC34578l.b.f145598a)) {
                c28655q.m87150e0(-95191653);
                AbstractC34573g.m109335r(viewState, function1, c28655q, (i15 >> 3) & 126, 0);
                c28655q.m87173q(false);
            } else if (AbstractC22676k.m65745e(type, AbstractC34578l.a.f145597a)) {
                c28655q.m87150e0(-95188676);
                AbstractC34568b.m109299c(viewState, function1, c28655q, (i15 >> 3) & 126, 0);
                c28655q.m87173q(false);
            } else {
                if (!AbstractC22676k.m65745e(type, AbstractC34578l.c.f145599a)) {
                    throw AbstractC11895b.m32003v(-95193505, c28655q, false);
                }
                c28655q.m87150e0(-95185668);
                AbstractC34570d.m109304c(viewState, function1, c28655q, (i15 >> 3) & 126, 0);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        Modifier modifier2 = modifier;
        Function1 function2 = function1;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33259e(modifier2, viewState, function2, i13, i14, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m109350d(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m109351e(Modifier modifier, C34576j c34576j, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m109349c(modifier, c34576j, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
