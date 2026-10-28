package p733ry2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import cd0.C4435a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.view.edit.C9772c;
import j11.AbstractC21211n;
import l83.C23454a0;
import ny2.AbstractC27299a;
import p026b2.C2314t;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pj2.C29308g;
import q12.C29802c;
import qn0.C30515j;
import qz0.AbstractC30792k;
import rx0.C31901f;
import yw2.AbstractC39833e;

/* JADX INFO: renamed from: ry2.b, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Lkotlin/Function1;", "Lny2/a;", "Ll83/a0;", "onViewEvent", "g", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "whooplabs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class Function1 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public static final void m99285g(p715kotlin.jvm.functions.Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1601506184);
        int i15 = 2;
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87157i(onViewEvent) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z("");
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC39833e.f171741z, null, i15, 0 == true ? 1 : 0);
            TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC39833e.f171714A, 0 == true ? 1 : 0, i15, 0 == true ? 1 : 0);
            TextResource.C8688b c8688b3 = new TextResource.C8688b(AbstractC39833e.f171718c, 0 == true ? 1 : 0, i15, 0 == true ? 1 : 0);
            int i16 = i14 & 14;
            Object[] objArr = i16 == 4;
            Object objM87133R2 = c28655q2.m87133R();
            if (objArr != false || objM87133R2 == c28676v0) {
                objM87133R2 = new C30515j(onViewEvent, 11);
                c28655q2.m87172p0(objM87133R2);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
            boolean z4 = i16 == 4;
            Object objM87133R3 = c28655q2.m87133R();
            if (z4 || objM87133R3 == c28676v0) {
                objM87133R3 = new C29308g(onViewEvent, interfaceC28601c1, 5);
                c28655q2.m87172p0(objM87133R3);
            }
            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R3;
            C37816b c37816bM121344e = AbstractC37817c.m121344e(328780169, c28655q2, new C9772c(5, interfaceC28601c1));
            int i17 = TextResource.C8688b.f25889c;
            c28655q = c28655q2;
            AbstractC21211n.m59497o(null, c8688b, c8688b2, c8688b3, false, null, null, null, null, null, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a, null, interfaceC4339a2, null, c37816bM121344e, null, c28655q, (i17 << 3) | (i17 << 6) | (i17 << 9), 0, 1572864, 180355057);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4435a(onViewEvent, i13, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m99286h(p715kotlin.jvm.functions.Function1 function1) {
        function1.invoke(AbstractC27299a.j.f109332a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m99287i(p715kotlin.jvm.functions.Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
        function1.invoke(new AbstractC27299a.b((String) interfaceC28601c1.getValue()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m99288j(InterfaceC28601c1 interfaceC28601c1, Composer composer, int i13) {
        int i14 = 2;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Modifier modifierM3398t = AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 2 * 8, 0.0f, 0.0f, 13);
            TextResource textResourceM21278l = AbstractC8693b.m21278l((String) interfaceC28601c1.getValue());
            TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC39833e.f171727l, null, i14, 0 == true ? 1 : 0);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C31901f(4);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C29802c(9, interfaceC28601c1);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC30792k.m94678l(modifierM3398t, textResourceM21278l, null, null, null, null, null, null, c8688b, false, false, null, 0L, false, 1, 0, 0, false, null, false, false, 0, false, null, null, null, null, null, null, null, interfaceC4339a, (p715kotlin.jvm.functions.Function1) objM87133R2, c28655q, (TextResource.$stable << 3) | 6 | (TextResource.C8688b.f25889c << 24), 24576, 0, 54, 1073725180, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m99289k() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m99290l(InterfaceC28601c1 interfaceC28601c1, String it) {
        AbstractC22676k.m65750j(it, "it");
        interfaceC28601c1.setValue(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m99291m(p715kotlin.jvm.functions.Function1 function1, int i13, Composer composer, int i14) {
        m99285g(function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
