package ej1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import aw0.C2101a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import n71.C26436q;
import ny0.C27256h;
import p026b2.C2314t;
import p291l0.EnumC22935a1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: ej1.q */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lm91/u;", "item", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "d", "(Landroidx/compose/ui/Modifier;Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Landroidx/compose/ui/Modifier;Lm91/u;)Landroidx/compose/ui/Modifier;", "health_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13254q {
    /* JADX INFO: renamed from: d */
    public static final void m37258d(Modifier modifier, InterfaceC25312u item, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        Function1 function2;
        int i16;
        Function1 function3;
        AbstractC22676k.m65750j(item, "item");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-16552118);
        int i17 = i14 & 1;
        if (i17 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(item) ? 32 : 16;
        }
        int i18 = i14 & 4;
        if (i18 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            Modifier modifier3 = i17 != 0 ? C2314t.f9131w : modifier;
            if (i18 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C13251n(1);
                    c28655q.m87172p0(objM87133R);
                }
                int i19 = i15;
                function3 = (Function1) objM87133R;
                i16 = i19;
            } else {
                i16 = i15;
                function3 = function1;
            }
            int i24 = i16;
            AbstractC25303l.m74291r(item, AbstractC13255r.m37264b(), new C2101a(4, modifier3), function3, c28655q, ((i24 << 3) & 7168) | ((i24 >> 3) & 14) | (C25307p.f99300b << 3), 0);
            function2 = function3;
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
            function2 = function1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13253p(i13, i14, 0, modifier2, function2, item);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m37259e(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final Modifier m37260f(Modifier modifier, InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(239784410);
        c28655q.m87173q(false);
        return modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m37261g(Modifier modifier, InterfaceC25312u interfaceC25312u, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m37258d(modifier, interfaceC25312u, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    public static final Modifier m37262h(Modifier modifier, InterfaceC25312u item) {
        AbstractC22676k.m65750j(modifier, "<this>");
        AbstractC22676k.m65750j(item, "item");
        if (item instanceof C27256h) {
            return AbstractC1099a.m3388j(modifier, EnumC22935a1.f90538x);
        }
        return item instanceof C26436q ? modifier : AbstractC1099a.m3396r(modifier, 2 * 8, 0.0f, 2);
    }
}
