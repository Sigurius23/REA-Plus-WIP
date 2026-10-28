package sb2;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import l83.C23454a0;
import l83.InterfaceC23459e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p291l0.AbstractC22953f;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p705ea2.AbstractC12922s;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import pb2.AbstractC29058a;
import qb2.InterfaceC30185d;
import qb2.InterfaceC30186e;
import qn0.C30515j;
import s01.C32049e;

/* JADX INFO: renamed from: sb2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lqb2/e;", "viewState", "Lkotlin/Function1;", "Lqb2/d;", "Ll83/a0;", "onViewEvent", "Lpb2/a;", "onNavigationEvent", "d", "(Lqb2/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "settings_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32347a {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static final void m100680d(InterfaceC30186e viewState, Function1 onViewEvent, Function1 onNavigationEvent, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1064584228);
        int i15 = 2;
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q2.m87153g(viewState) : c28655q2.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(onViewEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(onNavigationEvent) ? 256 : 128;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 147) != 146)) {
            boolean z4 = viewState instanceof InterfaceC30186e.c;
            C2314t c2314t = C2314t.f9131w;
            if (z4) {
                c28655q2.m87150e0(-990018764);
                AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, AbstractC22953f.m66723l(c2314t), false, false, c28655q2, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 3580);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            } else {
                c28655q = c28655q2;
                if (viewState instanceof InterfaceC30186e.b) {
                    c28655q.m87150e0(-989775197);
                    AbstractC32349c.m100691c((InterfaceC30186e.b) viewState, onNavigationEvent, c28655q, ((i14 >> 3) & 112) | (i14 & 14));
                    c28655q.m87173q(false);
                } else {
                    if (!(viewState instanceof InterfaceC30186e.a)) {
                        throw AbstractC11895b.m32003v(-863221058, c28655q, false);
                    }
                    c28655q.m87150e0(-989609378);
                    AbstractC33208p0.b bVar = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC12922s.f44640y, null, i15, 0 == true ? 1 : 0), false, null, 6, null);
                    TextResource textResourceM21267a = AbstractC8693b.m21267a();
                    TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC12922s.f44562F, 0 == true ? 1 : 0, i15, 0 == true ? 1 : 0);
                    TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC12922s.f44571J0, 0 == true ? 1 : 0, i15, 0 == true ? 1 : 0);
                    Modifier modifierM66723l = AbstractC22953f.m66723l(c2314t);
                    boolean z13 = (i14 & 112) == 32;
                    Object objM87133R = c28655q.m87133R();
                    C28676v0 c28676v0 = C28635l.f115821a;
                    if (z13 || objM87133R == c28676v0) {
                        objM87133R = new C30515j(onViewEvent, 26);
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
                    boolean z14 = (i14 & 896) == 256;
                    Object objM87133R2 = c28655q.m87133R();
                    if (z14 || objM87133R2 == c28676v0) {
                        objM87133R2 = new C30515j(onNavigationEvent, 27);
                        c28655q.m87172p0(objM87133R2);
                    }
                    int i16 = 196608 | AbstractC33208p0.b.f138467h | (TextResource.$stable << 3);
                    int i17 = TextResource.C8688b.f25889c;
                    AbstractC33199m0.m105214F(bVar, textResourceM21267a, null, c8688b, interfaceC4339a, true, false, c8688b2, (InterfaceC4339a) objM87133R2, modifierM66723l, false, false, c28655q, i16 | (i17 << 9) | (i17 << 21), 0, 3140);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
            }
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32049e((Object) viewState, onViewEvent, (InterfaceC23459e) onNavigationEvent, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m100681e(Function1 function1) {
        function1.invoke(InterfaceC30185d.b.f123571a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m100682f(Function1 function1) {
        function1.invoke(AbstractC29058a.a.f117575a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m100683g(InterfaceC30186e interfaceC30186e, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m100680d(interfaceC30186e, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
