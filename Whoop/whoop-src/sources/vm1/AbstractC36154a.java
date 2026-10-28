package vm1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gy0.AbstractC16272a;
import l83.C23454a0;
import p088dc.AbstractC11895b;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p733ry2.C31918g;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import t80.C33592b;
import ve.C35916a;

/* JADX INFO: renamed from: vm1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lvm1/b;", "viewState", "Lkotlin/Function0;", "Ll83/a0;", "onErrorCtaPress", "d", "(Lvm1/b;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "home_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36154a {
    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:24:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0069  */
    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:40:0x0101  */
    /* JADX WARN: Code duplicated, block: B:42:0x0107  */
    /* JADX WARN: Code duplicated, block: B:45:0x012a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0137  */
    /* JADX WARN: Code duplicated, block: B:54:0x0171  */
    /* JADX WARN: Code duplicated, block: B:56:0x0179  */
    /* JADX WARN: Code duplicated, block: B:59:0x0183  */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final void m115002d(AbstractC36155b viewState, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC4339a interfaceC4339a2;
        boolean z4;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a4;
        InterfaceC4339a interfaceC4339a5;
        int i16;
        boolean z13;
        Object objM87133R;
        InterfaceC4339a interfaceC4339a6;
        InterfaceC4339a interfaceC4339a7;
        Object objM87133R2;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1154711960);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87153g(viewState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 == 0) {
            if ((i13 & 48) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                i15 |= c28655q.m87157i(interfaceC4339a2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C35916a(16);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                if (viewState instanceof AbstractC36155b.b) {
                    c28655q.m87150e0(1631101104);
                    AbstractC33199m0.m105214F(new AbstractC33208p0.e(((AbstractC36155b.b) viewState).getProcessingText(), AbstractC16272a.f61891A3), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.e.f138475g | (TextResource.$stable << 3), 0, 4092);
                    c28655q.m87173q(false);
                    interfaceC4339a7 = interfaceC4339a4;
                } else {
                    interfaceC4339a5 = interfaceC4339a4;
                    i16 = i15;
                    if (viewState instanceof AbstractC36155b.c) {
                        c28655q.m87150e0(1631421489);
                        AbstractC36155b.c cVar = (AbstractC36155b.c) viewState;
                        interfaceC4339a7 = interfaceC4339a5;
                        AbstractC33199m0.m105214F(new AbstractC33208p0.h(cVar.getTitle(), 0L, null, 6, null), cVar.getDescription(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                        c28655q.m87173q(false);
                    } else {
                        if (viewState instanceof AbstractC36155b.a) {
                            throw AbstractC11895b.m32003v(1576635466, c28655q, false);
                        }
                        c28655q.m87150e0(1631680773);
                        AbstractC36155b.a aVar = (AbstractC36155b.a) viewState;
                        AbstractC33208p0.b bVar = new AbstractC33208p0.b(aVar.getTitle(), false, null, 6, null);
                        TextResource textResourceM115007b = aVar.getDescription();
                        TextResource textResourceM115006a = aVar.getCtaText();
                        z13 = (i16 & 112) == 32;
                        objM87133R = c28655q.m87133R();
                        if (!z13 || objM87133R == c28676v0) {
                            interfaceC4339a6 = interfaceC4339a5;
                            objM87133R = new C31918g(interfaceC4339a6, 15);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            interfaceC4339a6 = interfaceC4339a5;
                        }
                        int i18 = AbstractC33208p0.b.f138467h;
                        int i19 = TextResource.$stable;
                        interfaceC4339a7 = interfaceC4339a6;
                        AbstractC33199m0.m105214F(bVar, textResourceM115007b, null, textResourceM115006a, (InterfaceC4339a) objM87133R, false, false, null, null, null, false, false, c28655q, i18 | (i19 << 3) | (i19 << 9), 0, 4068);
                        c28655q.m87173q(false);
                    }
                }
                interfaceC4339a3 = interfaceC4339a7;
            } else {
                c28655q.m87138X();
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C33592b(viewState, i13, interfaceC4339a3, i14, 16);
            }
        }
        i15 |= 48;
        interfaceC4339a2 = interfaceC4339a;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C35916a(16);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            if (viewState instanceof AbstractC36155b.b) {
                c28655q.m87150e0(1631101104);
                AbstractC33199m0.m105214F(new AbstractC33208p0.e(((AbstractC36155b.b) viewState).getProcessingText(), AbstractC16272a.f61891A3), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.e.f138475g | (TextResource.$stable << 3), 0, 4092);
                c28655q.m87173q(false);
                interfaceC4339a7 = interfaceC4339a4;
            } else {
                interfaceC4339a5 = interfaceC4339a4;
                i16 = i15;
                if (viewState instanceof AbstractC36155b.c) {
                    c28655q.m87150e0(1631421489);
                    AbstractC36155b.c cVar2 = (AbstractC36155b.c) viewState;
                    interfaceC4339a7 = interfaceC4339a5;
                    AbstractC33199m0.m105214F(new AbstractC33208p0.h(cVar2.getTitle(), 0L, null, 6, null), cVar2.getDescription(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                    c28655q.m87173q(false);
                } else {
                    if (viewState instanceof AbstractC36155b.a) {
                        throw AbstractC11895b.m32003v(1576635466, c28655q, false);
                    }
                    c28655q.m87150e0(1631680773);
                    AbstractC36155b.a aVar2 = (AbstractC36155b.a) viewState;
                    AbstractC33208p0.b bVar2 = new AbstractC33208p0.b(aVar2.getTitle(), false, null, 6, null);
                    TextResource textResourceM115007b2 = aVar2.getDescription();
                    TextResource textResourceM115006a2 = aVar2.getCtaText();
                    if ((i16 & 112) == 32) {
                    }
                    objM87133R = c28655q.m87133R();
                    if (z13) {
                        interfaceC4339a6 = interfaceC4339a5;
                        objM87133R = new C31918g(interfaceC4339a6, 15);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        interfaceC4339a6 = interfaceC4339a5;
                        objM87133R = new C31918g(interfaceC4339a6, 15);
                        c28655q.m87172p0(objM87133R);
                    }
                    int i110 = AbstractC33208p0.b.f138467h;
                    int i111 = TextResource.$stable;
                    interfaceC4339a7 = interfaceC4339a6;
                    AbstractC33199m0.m105214F(bVar2, textResourceM115007b2, null, textResourceM115006a2, (InterfaceC4339a) objM87133R, false, false, null, null, null, false, false, c28655q, i110 | (i111 << 3) | (i111 << 9), 0, 4068);
                    c28655q.m87173q(false);
                }
            }
            interfaceC4339a3 = interfaceC4339a7;
        } else {
            c28655q.m87138X();
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33592b(viewState, i13, interfaceC4339a3, i14, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m115003e() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m115004f(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m115005g(AbstractC36155b abstractC36155b, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m115002d(abstractC36155b, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
