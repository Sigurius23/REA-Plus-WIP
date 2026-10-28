package p700bd1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import b91.InterfaceC2887b;
import java.util.Locale;
import kd1.C22396h;
import l83.C23454a0;
import p000.C24827m;
import p026b2.C2314t;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25297f;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import x81.C38072d;

/* JADX INFO: renamed from: bd1.x */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J3\u0010\f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0017¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lbd1/x;", "Lm91/f;", "Lbd1/y;", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "modifier", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "b", "(Landroidx/compose/ui/Modifier;Lbd1/y;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "design-showcase_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C3106x implements InterfaceC25297f<C3107y> {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m8922c(C3106x c3106x, Modifier modifier, C3107y c3107y, Function1 function1, int i13, Composer composer, int i14) {
        c3106x.Compose(modifier, c3107y, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    @Override // p720m91.InterfaceC25297f
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void Compose(Modifier modifier, C3107y itemState, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        long jM95624D;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(itemState, "itemState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(814165281);
        if ((i13 & 48) == 0) {
            i14 = i13 | ((i13 & 64) == 0 ? c28655q2.m87153g(itemState) : c28655q2.m87157i(itemState) ? 32 : 16);
        } else {
            i14 = i13;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 17) != 16)) {
            C22396h<C2886a> c22396hM8924a = itemState.m8924a();
            C2886a c2886aM64455a = c22396hM8924a.m64455a();
            String name = c22396hM8924a.getName();
            Object type = c22396hM8924a.getType();
            if (AbstractC22676k.m65745e(type, InterfaceC2887b.d.f11504a) || AbstractC22676k.m65745e(type, InterfaceC2887b.g.f11507a) || AbstractC22676k.m65745e(type, InterfaceC2887b.h.f11508a) || AbstractC22676k.m65745e(type, InterfaceC2887b.c.f11503a)) {
                name = name.toUpperCase(Locale.ROOT);
                AbstractC22676k.m65749i(name, "toUpperCase(...)");
            }
            if (AbstractC22676k.m65745e(type, InterfaceC2887b.g.f11507a) || AbstractC22676k.m65745e(type, InterfaceC2887b.c.f11503a)) {
                c28655q2.m87150e0(728802099);
                long jM51541c = C17919x.m51541c(0.5f, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getBrandWhite());
                c28655q2.m87173q(false);
                jM95624D = jM51541c;
            } else {
                c28655q2.m87150e0(728803915);
                jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q2, C38072d.f163054b, false);
            }
            C2314t c2314t = C2314t.f9131w;
            AbstractC30795n.m94707h(name, AbstractC1099a.m3396r(c2314t, 16, 0.0f, 2), jM95624D, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM64455a, null, c28655q2, 48, C2886a.f11498d << 18, 196600);
            c28655q = c28655q2;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(8, c2314t));
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C24827m(this, modifier, itemState, onViewEvent, i13, 25);
        }
    }
}
