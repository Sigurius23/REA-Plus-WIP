package e31;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import d62.C11736b;
import dx2.C12430a;
import e11.C12582b;
import gb1.AbstractC15679g;
import i91.AbstractC18249c;
import ih0.AbstractC18489d0;
import kd1.C22411w;
import l83.C23454a0;
import ny0.AbstractC27271o0;
import ny0.AbstractC27292z;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p078d1.C11456i;
import p163g1.AbstractC15005f3;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: e31.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Le31/c;", "state", "Lkotlin/Function0;", "Ll83/a0;", "primaryButtonClicked", "secondaryButtonClicked", "f", "(Le31/c;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/Modifier;", "modifier", "Lsz0/p0$b;", "type", "k", "(Landroidx/compose/ui/Modifier;Lsz0/p0$b;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC12610b {
    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x0086  */
    /* JADX WARN: Code duplicated, block: B:46:0x008a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0090  */
    /* JADX WARN: Code duplicated, block: B:50:0x009f  */
    /* JADX WARN: Code duplicated, block: B:53:0x00af  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:61:0x0137  */
    /* JADX WARN: Code duplicated, block: B:62:0x013b  */
    /* JADX WARN: Code duplicated, block: B:65:0x014e  */
    /* JADX WARN: Code duplicated, block: B:67:0x015c  */
    /* JADX WARN: Code duplicated, block: B:70:0x016c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0180  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:75:0x022f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0248  */
    /* JADX WARN: Code duplicated, block: B:79:0x0255  */
    /* JADX WARN: Code duplicated, block: B:81:0x0265  */
    /* JADX WARN: Code duplicated, block: B:82:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:86:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:87:0x02df  */
    /* JADX WARN: Code duplicated, block: B:90:0x0329  */
    /* JADX WARN: Code duplicated, block: B:91:0x0336  */
    /* JADX WARN: Code duplicated, block: B:93:0x037b  */
    /* JADX WARN: Code duplicated, block: B:96:0x0387  */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 9191. Try increasing type updates limit count.
    	at jadx.core.dex.visitors.typeinference.TypeUpdateInfo.requestUpdate(TypeUpdateInfo.java:61)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:298)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:119)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX INFO: renamed from: f */
    public static final void m35349f(C12611c state, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC4339a interfaceC4339a3;
        int i16;
        InterfaceC4339a interfaceC4339a4;
        int i17;
        boolean z4;
        InterfaceC4339a interfaceC4339a5;
        InterfaceC4339a interfaceC4339a6;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        Object obj;
        InterfaceC4339a interfaceC4339a7;
        InterfaceC4339a interfaceC4339a8;
        boolean z13;
        Object objM87133R;
        float f13;
        C38072d c38072d;
        float f14;
        float f15;
        int iHashCode;
        InterfaceC4339a interfaceC4339a9;
        C0209i c0209i;
        boolean zM21270d;
        C2314t c2314t;
        float f16;
        C38072d c38072d2;
        C2314t c2314t2;
        ?? r10;
        float f17;
        C28655q c28655q2;
        C28655q c28655q3;
        C28655q c28655q4;
        C12609a primaryButton;
        C28655q c28655q5;
        C12609a secondaryButton;
        InterfaceC4339a interfaceC4339a10;
        boolean z14;
        C28655q c28655q6;
        Object objM87133R2;
        Object objM87133R3;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q7 = (C28655q) composer;
        c28655q7.m87154g0(1138996777);
        if ((i13 & 6) == 0) {
            i15 = (c28655q7.m87153g(state) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 == 0) {
            if ((i13 & 48) == 0) {
                interfaceC4339a3 = interfaceC4339a;
                i15 |= c28655q7.m87157i(interfaceC4339a3) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    interfaceC4339a4 = interfaceC4339a2;
                    if (c28655q7.m87157i(interfaceC4339a4)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                if ((i15 & 147) != 146) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q7.m87135U(i15 & 1, z4)) {
                    obj = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R3 = c28655q7.m87133R();
                        if (objM87133R3 == obj) {
                            objM87133R3 = new C12430a(14);
                            c28655q7.m87172p0(objM87133R3);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R3;
                    } else {
                        interfaceC4339a7 = interfaceC4339a3;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q7.m87133R();
                        if (objM87133R2 == obj) {
                            objM87133R2 = new C12430a(15);
                            c28655q7.m87172p0(objM87133R2);
                        }
                        interfaceC4339a8 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a8 = interfaceC4339a4;
                    }
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, state.getModifier());
                    if ((i15 & 14) == 4) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = c28655q7.m87133R();
                    if (z13 || objM87133R == obj) {
                        objM87133R = new C11456i(state, 12);
                        c28655q7.m87172p0(objM87133R);
                    }
                    f13 = 4;
                    c38072d = C38072d.f163053a;
                    f14 = 3;
                    Modifier modifierM44107d = AbstractC15679g.m44107d(AbstractC1092a.m3362g(modifierM3409f, false, null, null, (InterfaceC4339a) objM87133R, 15), ((float) 0.5d) * f13, c38072d.m121949b(c28655q7, 6).getWhite10(), C22411w.f87680a.m64535a().m64090c(), 5, f14);
                    f15 = 6;
                    Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1099a.m3394p(8 * f15, modifierM44107d).mo3471e(state.getModifier()), "mini_arch_progress_modal");
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q7, 54);
                    iHashCode = Long.hashCode(c28655q7.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q7.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q7, modifierM3599a);
                    InterfaceC0221l.f734a.getClass();
                    interfaceC4339a9 = C0217k.f724b;
                    c28655q7.m87158i0();
                    if (c28655q7.f115903S) {
                        c28655q7.m87163l(interfaceC4339a9);
                    } else {
                        c28655q7.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q7, C0217k.f729g, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q7, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q7.f115903S || !AbstractC22676k.m65745e(c28655q7.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q7, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q7, C0217k.f726d, modifierM118962N);
                    if (state.getType() instanceof AbstractC33208p0.b) {
                        c28655q7.m87150e0(-1609235241);
                        m35354k(null, (AbstractC33208p0.b) state.getType(), c28655q7, 0, 1);
                        c28655q7.m87173q(false);
                    } else {
                        c28655q7.m87150e0(-1609174078);
                        AbstractC33199m0.m105210B(state.getType(), c28655q7, 0);
                        c28655q7.m87173q(false);
                    }
                    zM21270d = AbstractC8693b.m21270d(state.getType().getTitle());
                    c2314t = C2314t.f9131w;
                    if (zM21270d) {
                        AbstractC22953f.m66715b(c28655q7, AbstractC18489d0.m53365f(c28655q7, -1609074382, f15, f13, c2314t));
                        Modifier modifierM3599a2 = AbstractC1136a.m3599a(c2314t, "progress_modal_title_text");
                        String strM21274h = AbstractC8693b.m21274h(state.getType().getTitle(), c28655q7, 0);
                        C2886a c2886aM8436q = c38072d.m121952e(c28655q7, 6).getH3();
                        c38072d2 = c38072d;
                        c2314t2 = c2314t;
                        f16 = f13;
                        f17 = f14;
                        r10 = 0;
                        AbstractC30795n.m94707h(strM21274h, modifierM3599a2, c38072d.m121949b(c28655q7, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c2886aM8436q, null, c28655q7, 48, 0, 196088);
                        C28655q c28655q8 = c28655q7;
                        c28655q8.m87173q(false);
                        c28655q2 = c28655q8;
                    } else {
                        C28655q c28655q9 = c28655q7;
                        f16 = f13;
                        c38072d2 = c38072d;
                        c2314t2 = c2314t;
                        r10 = 0;
                        f17 = f14;
                        c28655q9.m87150e0(-1608708241);
                        c28655q9.m87173q(false);
                        c28655q2 = c28655q9;
                    }
                    if (state.getSupportText() == null) {
                        c28655q2.m87150e0(-1608667043);
                        c28655q2.m87173q(r10);
                        c28655q4 = c28655q2;
                    } else {
                        c28655q2.m87150e0(-1608667042);
                        if (AbstractC8693b.m21270d(state.getSupportText())) {
                            AbstractC22953f.m66715b(c28655q2, AbstractC18489d0.m53365f(c28655q2, -221482422, f17, f16, c2314t2));
                            C28655q c28655q10 = c28655q2;
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(state.getSupportText(), c28655q2, r10), null, c38072d2.m121949b(c28655q2, 6).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, 6).getB1(), null, c28655q10, 0, 0, 196090);
                            C28655q c28655q11 = c28655q10;
                            c28655q11.m87173q(r10);
                            c28655q3 = c28655q11;
                        } else {
                            c28655q2.m87150e0(-221158565);
                            c28655q2.m87173q(r10);
                            c28655q3 = c28655q2;
                        }
                        c28655q3.m87173q(r10);
                        c28655q4 = c28655q3;
                    }
                    primaryButton = state.getPrimaryButton();
                    if (primaryButton == null) {
                        c28655q4.m87150e0(-1608235957);
                        c28655q4.m87173q(r10);
                        interfaceC4339a5 = interfaceC4339a7;
                        c28655q5 = c28655q4;
                    } else {
                        c28655q4.m87150e0(-1608235956);
                        AbstractC18489d0.m53380u(2, f16, c2314t2, c28655q4);
                        C28655q c28655q12 = c28655q4;
                        InterfaceC4339a interfaceC4339a11 = interfaceC4339a7;
                        AbstractC27292z.m82343j(AbstractC1136a.m3599a(AbstractC1102d.m3409f(1.0f, c2314t2), "progress_modal_primary_button"), false, false, primaryButton.getIcon(), null, null, primaryButton.getText(), null, null, null, 0.0f, null, null, interfaceC4339a11, c28655q12, 6, (i15 << 6) & 7168, 8118);
                        interfaceC4339a5 = interfaceC4339a11;
                        C28655q c28655q13 = c28655q12;
                        c28655q13.m87173q(r10);
                        c28655q5 = c28655q13;
                    }
                    secondaryButton = state.getSecondaryButton();
                    if (secondaryButton == null) {
                        c28655q5.m87150e0(-1607722690);
                        c28655q5.m87173q(r10);
                        interfaceC4339a10 = interfaceC4339a8;
                        z14 = true;
                        c28655q6 = c28655q5;
                    } else {
                        c28655q5.m87150e0(-1607722689);
                        AbstractC18489d0.m53380u(1, f16, c2314t2, c28655q5);
                        C28655q c28655q14 = c28655q5;
                        interfaceC4339a10 = interfaceC4339a8;
                        z14 = true;
                        AbstractC27271o0.m82253b(AbstractC1136a.m3599a(AbstractC1102d.m3409f(1.0f, c2314t2), "progress_modal_secondary_button"), false, secondaryButton.getText(), null, null, null, secondaryButton.getEndIcon(), null, false, null, interfaceC4339a10, c28655q14, 196614, (i15 >> 6) & 14, 922);
                        C28655q c28655q15 = c28655q14;
                        c28655q15.m87173q(r10);
                        c28655q6 = c28655q15;
                    }
                    c28655q6.m87173q(z14);
                    interfaceC4339a6 = interfaceC4339a10;
                    c28655q = c28655q6;
                } else {
                    C28655q c28655q16 = c28655q7;
                    c28655q16.m87138X();
                    interfaceC4339a5 = interfaceC4339a3;
                    interfaceC4339a6 = interfaceC4339a4;
                    c28655q = c28655q16;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C12582b(i13, i14, 1, state, interfaceC4339a5, interfaceC4339a6);
                }
            }
            i15 |= 384;
            interfaceC4339a4 = interfaceC4339a2;
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q7.m87135U(i15 & 1, z4)) {
                obj = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R3 = c28655q7.m87133R();
                    if (objM87133R3 == obj) {
                        objM87133R3 = new C12430a(14);
                        c28655q7.m87172p0(objM87133R3);
                    }
                    interfaceC4339a7 = (InterfaceC4339a) objM87133R3;
                } else {
                    interfaceC4339a7 = interfaceC4339a3;
                }
                if (i16 != 0) {
                    objM87133R2 = c28655q7.m87133R();
                    if (objM87133R2 == obj) {
                        objM87133R2 = new C12430a(15);
                        c28655q7.m87172p0(objM87133R2);
                    }
                    interfaceC4339a8 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a8 = interfaceC4339a4;
                }
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, state.getModifier());
                if ((i15 & 14) == 4) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q7.m87133R();
                if (z13) {
                    objM87133R = new C11456i(state, 12);
                    c28655q7.m87172p0(objM87133R);
                } else {
                    objM87133R = new C11456i(state, 12);
                    c28655q7.m87172p0(objM87133R);
                }
                f13 = 4;
                c38072d = C38072d.f163053a;
                f14 = 3;
                Modifier modifierM44107d2 = AbstractC15679g.m44107d(AbstractC1092a.m3362g(modifierM3409f2, false, null, null, (InterfaceC4339a) objM87133R, 15), ((float) 0.5d) * f13, c38072d.m121949b(c28655q7, 6).getWhite10(), C22411w.f87680a.m64535a().m64090c(), 5, f14);
                f15 = 6;
                Modifier modifierM3599a3 = AbstractC1136a.m3599a(AbstractC1099a.m3394p(8 * f15, modifierM44107d2).mo3471e(state.getModifier()), "mini_arch_progress_modal");
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q7, 54);
                iHashCode = Long.hashCode(c28655q7.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q7.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q7, modifierM3599a3);
                InterfaceC0221l.f734a.getClass();
                interfaceC4339a9 = C0217k.f724b;
                c28655q7.m87158i0();
                if (c28655q7.f115903S) {
                    c28655q7.m87163l(interfaceC4339a9);
                } else {
                    c28655q7.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q7, C0217k.f729g, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q7, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q7.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q7, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q7, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q7, C0217k.f726d, modifierM118962N2);
                if (state.getType() instanceof AbstractC33208p0.b) {
                    c28655q7.m87150e0(-1609235241);
                    m35354k(null, (AbstractC33208p0.b) state.getType(), c28655q7, 0, 1);
                    c28655q7.m87173q(false);
                } else {
                    c28655q7.m87150e0(-1609174078);
                    AbstractC33199m0.m105210B(state.getType(), c28655q7, 0);
                    c28655q7.m87173q(false);
                }
                zM21270d = AbstractC8693b.m21270d(state.getType().getTitle());
                c2314t = C2314t.f9131w;
                if (zM21270d) {
                    AbstractC22953f.m66715b(c28655q7, AbstractC18489d0.m53365f(c28655q7, -1609074382, f15, f13, c2314t));
                    Modifier modifierM3599a4 = AbstractC1136a.m3599a(c2314t, "progress_modal_title_text");
                    String strM21274h2 = AbstractC8693b.m21274h(state.getType().getTitle(), c28655q7, 0);
                    C2886a c2886aM8436q2 = c38072d.m121952e(c28655q7, 6).getH3();
                    c38072d2 = c38072d;
                    c2314t2 = c2314t;
                    f16 = f13;
                    f17 = f14;
                    r10 = 0;
                    AbstractC30795n.m94707h(strM21274h2, modifierM3599a4, c38072d.m121949b(c28655q7, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c2886aM8436q2, null, c28655q7, 48, 0, 196088);
                    C28655q c28655q17 = c28655q7;
                    c28655q17.m87173q(false);
                    c28655q2 = c28655q17;
                } else {
                    C28655q c28655q18 = c28655q7;
                    f16 = f13;
                    c38072d2 = c38072d;
                    c2314t2 = c2314t;
                    r10 = 0;
                    f17 = f14;
                    c28655q18.m87150e0(-1608708241);
                    c28655q18.m87173q(false);
                    c28655q2 = c28655q18;
                }
                if (state.getSupportText() == null) {
                    c28655q2.m87150e0(-1608667043);
                    c28655q2.m87173q(r10);
                    c28655q4 = c28655q2;
                } else {
                    c28655q2.m87150e0(-1608667042);
                    if (AbstractC8693b.m21270d(state.getSupportText())) {
                        AbstractC22953f.m66715b(c28655q2, AbstractC18489d0.m53365f(c28655q2, -221482422, f17, f16, c2314t2));
                        C28655q c28655q19 = c28655q2;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(state.getSupportText(), c28655q2, r10), null, c38072d2.m121949b(c28655q2, 6).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, 6).getB1(), null, c28655q19, 0, 0, 196090);
                        C28655q c28655q110 = c28655q19;
                        c28655q110.m87173q(r10);
                        c28655q3 = c28655q110;
                    } else {
                        c28655q2.m87150e0(-221158565);
                        c28655q2.m87173q(r10);
                        c28655q3 = c28655q2;
                    }
                    c28655q3.m87173q(r10);
                    c28655q4 = c28655q3;
                }
                primaryButton = state.getPrimaryButton();
                if (primaryButton == null) {
                    c28655q4.m87150e0(-1608235957);
                    c28655q4.m87173q(r10);
                    interfaceC4339a5 = interfaceC4339a7;
                    c28655q5 = c28655q4;
                } else {
                    c28655q4.m87150e0(-1608235956);
                    AbstractC18489d0.m53380u(2, f16, c2314t2, c28655q4);
                    C28655q c28655q111 = c28655q4;
                    InterfaceC4339a interfaceC4339a12 = interfaceC4339a7;
                    AbstractC27292z.m82343j(AbstractC1136a.m3599a(AbstractC1102d.m3409f(1.0f, c2314t2), "progress_modal_primary_button"), false, false, primaryButton.getIcon(), null, null, primaryButton.getText(), null, null, null, 0.0f, null, null, interfaceC4339a12, c28655q111, 6, (i15 << 6) & 7168, 8118);
                    interfaceC4339a5 = interfaceC4339a12;
                    C28655q c28655q112 = c28655q111;
                    c28655q112.m87173q(r10);
                    c28655q5 = c28655q112;
                }
                secondaryButton = state.getSecondaryButton();
                if (secondaryButton == null) {
                    c28655q5.m87150e0(-1607722690);
                    c28655q5.m87173q(r10);
                    interfaceC4339a10 = interfaceC4339a8;
                    z14 = true;
                    c28655q6 = c28655q5;
                } else {
                    c28655q5.m87150e0(-1607722689);
                    AbstractC18489d0.m53380u(1, f16, c2314t2, c28655q5);
                    C28655q c28655q113 = c28655q5;
                    interfaceC4339a10 = interfaceC4339a8;
                    z14 = true;
                    AbstractC27271o0.m82253b(AbstractC1136a.m3599a(AbstractC1102d.m3409f(1.0f, c2314t2), "progress_modal_secondary_button"), false, secondaryButton.getText(), null, null, null, secondaryButton.getEndIcon(), null, false, null, interfaceC4339a10, c28655q113, 196614, (i15 >> 6) & 14, 922);
                    C28655q c28655q114 = c28655q113;
                    c28655q114.m87173q(r10);
                    c28655q6 = c28655q114;
                }
                c28655q6.m87173q(z14);
                interfaceC4339a6 = interfaceC4339a10;
                c28655q = c28655q6;
            } else {
                C28655q c28655q115 = c28655q7;
                c28655q115.m87138X();
                interfaceC4339a5 = interfaceC4339a3;
                interfaceC4339a6 = interfaceC4339a4;
                c28655q = c28655q115;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C12582b(i13, i14, 1, state, interfaceC4339a5, interfaceC4339a6);
            }
        }
        i15 |= 48;
        interfaceC4339a3 = interfaceC4339a;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                interfaceC4339a4 = interfaceC4339a2;
                if (c28655q7.m87157i(interfaceC4339a4)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q7.m87135U(i15 & 1, z4)) {
                obj = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R3 = c28655q7.m87133R();
                    if (objM87133R3 == obj) {
                        objM87133R3 = new C12430a(14);
                        c28655q7.m87172p0(objM87133R3);
                    }
                    interfaceC4339a7 = (InterfaceC4339a) objM87133R3;
                } else {
                    interfaceC4339a7 = interfaceC4339a3;
                }
                if (i16 != 0) {
                    objM87133R2 = c28655q7.m87133R();
                    if (objM87133R2 == obj) {
                        objM87133R2 = new C12430a(15);
                        c28655q7.m87172p0(objM87133R2);
                    }
                    interfaceC4339a8 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a8 = interfaceC4339a4;
                }
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, state.getModifier());
                if ((i15 & 14) == 4) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q7.m87133R();
                if (z13) {
                    objM87133R = new C11456i(state, 12);
                    c28655q7.m87172p0(objM87133R);
                } else {
                    objM87133R = new C11456i(state, 12);
                    c28655q7.m87172p0(objM87133R);
                }
                f13 = 4;
                c38072d = C38072d.f163053a;
                f14 = 3;
                Modifier modifierM44107d3 = AbstractC15679g.m44107d(AbstractC1092a.m3362g(modifierM3409f3, false, null, null, (InterfaceC4339a) objM87133R, 15), ((float) 0.5d) * f13, c38072d.m121949b(c28655q7, 6).getWhite10(), C22411w.f87680a.m64535a().m64090c(), 5, f14);
                f15 = 6;
                Modifier modifierM3599a5 = AbstractC1136a.m3599a(AbstractC1099a.m3394p(8 * f15, modifierM44107d3).mo3471e(state.getModifier()), "mini_arch_progress_modal");
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q7, 54);
                iHashCode = Long.hashCode(c28655q7.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q7.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q7, modifierM3599a5);
                InterfaceC0221l.f734a.getClass();
                interfaceC4339a9 = C0217k.f724b;
                c28655q7.m87158i0();
                if (c28655q7.f115903S) {
                    c28655q7.m87163l(interfaceC4339a9);
                } else {
                    c28655q7.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q7, C0217k.f729g, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q7, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q7.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q7, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q7, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q7, C0217k.f726d, modifierM118962N3);
                if (state.getType() instanceof AbstractC33208p0.b) {
                    c28655q7.m87150e0(-1609235241);
                    m35354k(null, (AbstractC33208p0.b) state.getType(), c28655q7, 0, 1);
                    c28655q7.m87173q(false);
                } else {
                    c28655q7.m87150e0(-1609174078);
                    AbstractC33199m0.m105210B(state.getType(), c28655q7, 0);
                    c28655q7.m87173q(false);
                }
                zM21270d = AbstractC8693b.m21270d(state.getType().getTitle());
                c2314t = C2314t.f9131w;
                if (zM21270d) {
                    AbstractC22953f.m66715b(c28655q7, AbstractC18489d0.m53365f(c28655q7, -1609074382, f15, f13, c2314t));
                    Modifier modifierM3599a6 = AbstractC1136a.m3599a(c2314t, "progress_modal_title_text");
                    String strM21274h3 = AbstractC8693b.m21274h(state.getType().getTitle(), c28655q7, 0);
                    C2886a c2886aM8436q3 = c38072d.m121952e(c28655q7, 6).getH3();
                    c38072d2 = c38072d;
                    c2314t2 = c2314t;
                    f16 = f13;
                    f17 = f14;
                    r10 = 0;
                    AbstractC30795n.m94707h(strM21274h3, modifierM3599a6, c38072d.m121949b(c28655q7, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c2886aM8436q3, null, c28655q7, 48, 0, 196088);
                    C28655q c28655q116 = c28655q7;
                    c28655q116.m87173q(false);
                    c28655q2 = c28655q116;
                } else {
                    C28655q c28655q117 = c28655q7;
                    f16 = f13;
                    c38072d2 = c38072d;
                    c2314t2 = c2314t;
                    r10 = 0;
                    f17 = f14;
                    c28655q117.m87150e0(-1608708241);
                    c28655q117.m87173q(false);
                    c28655q2 = c28655q117;
                }
                if (state.getSupportText() == null) {
                    c28655q2.m87150e0(-1608667043);
                    c28655q2.m87173q(r10);
                    c28655q4 = c28655q2;
                } else {
                    c28655q2.m87150e0(-1608667042);
                    if (AbstractC8693b.m21270d(state.getSupportText())) {
                        AbstractC22953f.m66715b(c28655q2, AbstractC18489d0.m53365f(c28655q2, -221482422, f17, f16, c2314t2));
                        C28655q c28655q118 = c28655q2;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(state.getSupportText(), c28655q2, r10), null, c38072d2.m121949b(c28655q2, 6).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, 6).getB1(), null, c28655q118, 0, 0, 196090);
                        C28655q c28655q119 = c28655q118;
                        c28655q119.m87173q(r10);
                        c28655q3 = c28655q119;
                    } else {
                        c28655q2.m87150e0(-221158565);
                        c28655q2.m87173q(r10);
                        c28655q3 = c28655q2;
                    }
                    c28655q3.m87173q(r10);
                    c28655q4 = c28655q3;
                }
                primaryButton = state.getPrimaryButton();
                if (primaryButton == null) {
                    c28655q4.m87150e0(-1608235957);
                    c28655q4.m87173q(r10);
                    interfaceC4339a5 = interfaceC4339a7;
                    c28655q5 = c28655q4;
                } else {
                    c28655q4.m87150e0(-1608235956);
                    AbstractC18489d0.m53380u(2, f16, c2314t2, c28655q4);
                    C28655q c28655q1110 = c28655q4;
                    InterfaceC4339a interfaceC4339a13 = interfaceC4339a7;
                    AbstractC27292z.m82343j(AbstractC1136a.m3599a(AbstractC1102d.m3409f(1.0f, c2314t2), "progress_modal_primary_button"), false, false, primaryButton.getIcon(), null, null, primaryButton.getText(), null, null, null, 0.0f, null, null, interfaceC4339a13, c28655q1110, 6, (i15 << 6) & 7168, 8118);
                    interfaceC4339a5 = interfaceC4339a13;
                    C28655q c28655q1111 = c28655q1110;
                    c28655q1111.m87173q(r10);
                    c28655q5 = c28655q1111;
                }
                secondaryButton = state.getSecondaryButton();
                if (secondaryButton == null) {
                    c28655q5.m87150e0(-1607722690);
                    c28655q5.m87173q(r10);
                    interfaceC4339a10 = interfaceC4339a8;
                    z14 = true;
                    c28655q6 = c28655q5;
                } else {
                    c28655q5.m87150e0(-1607722689);
                    AbstractC18489d0.m53380u(1, f16, c2314t2, c28655q5);
                    C28655q c28655q1112 = c28655q5;
                    interfaceC4339a10 = interfaceC4339a8;
                    z14 = true;
                    AbstractC27271o0.m82253b(AbstractC1136a.m3599a(AbstractC1102d.m3409f(1.0f, c2314t2), "progress_modal_secondary_button"), false, secondaryButton.getText(), null, null, null, secondaryButton.getEndIcon(), null, false, null, interfaceC4339a10, c28655q1112, 196614, (i15 >> 6) & 14, 922);
                    C28655q c28655q1113 = c28655q1112;
                    c28655q1113.m87173q(r10);
                    c28655q6 = c28655q1113;
                }
                c28655q6.m87173q(z14);
                interfaceC4339a6 = interfaceC4339a10;
                c28655q = c28655q6;
            } else {
                C28655q c28655q1114 = c28655q7;
                c28655q1114.m87138X();
                interfaceC4339a5 = interfaceC4339a3;
                interfaceC4339a6 = interfaceC4339a4;
                c28655q = c28655q1114;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C12582b(i13, i14, 1, state, interfaceC4339a5, interfaceC4339a6);
            }
        }
        i15 |= 384;
        interfaceC4339a4 = interfaceC4339a2;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q7.m87135U(i15 & 1, z4)) {
            obj = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R3 = c28655q7.m87133R();
                if (objM87133R3 == obj) {
                    objM87133R3 = new C12430a(14);
                    c28655q7.m87172p0(objM87133R3);
                }
                interfaceC4339a7 = (InterfaceC4339a) objM87133R3;
            } else {
                interfaceC4339a7 = interfaceC4339a3;
            }
            if (i16 != 0) {
                objM87133R2 = c28655q7.m87133R();
                if (objM87133R2 == obj) {
                    objM87133R2 = new C12430a(15);
                    c28655q7.m87172p0(objM87133R2);
                }
                interfaceC4339a8 = (InterfaceC4339a) objM87133R2;
            } else {
                interfaceC4339a8 = interfaceC4339a4;
            }
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, state.getModifier());
            if ((i15 & 14) == 4) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R = c28655q7.m87133R();
            if (z13) {
                objM87133R = new C11456i(state, 12);
                c28655q7.m87172p0(objM87133R);
            } else {
                objM87133R = new C11456i(state, 12);
                c28655q7.m87172p0(objM87133R);
            }
            f13 = 4;
            c38072d = C38072d.f163053a;
            f14 = 3;
            Modifier modifierM44107d4 = AbstractC15679g.m44107d(AbstractC1092a.m3362g(modifierM3409f4, false, null, null, (InterfaceC4339a) objM87133R, 15), ((float) 0.5d) * f13, c38072d.m121949b(c28655q7, 6).getWhite10(), C22411w.f87680a.m64535a().m64090c(), 5, f14);
            f15 = 6;
            Modifier modifierM3599a7 = AbstractC1136a.m3599a(AbstractC1099a.m3394p(8 * f15, modifierM44107d4).mo3471e(state.getModifier()), "mini_arch_progress_modal");
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q7, 54);
            iHashCode = Long.hashCode(c28655q7.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q7.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q7, modifierM3599a7);
            InterfaceC0221l.f734a.getClass();
            interfaceC4339a9 = C0217k.f724b;
            c28655q7.m87158i0();
            if (c28655q7.f115903S) {
                c28655q7.m87163l(interfaceC4339a9);
            } else {
                c28655q7.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q7, C0217k.f729g, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q7, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q7.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q7, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q7, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q7, C0217k.f726d, modifierM118962N4);
            if (state.getType() instanceof AbstractC33208p0.b) {
                c28655q7.m87150e0(-1609235241);
                m35354k(null, (AbstractC33208p0.b) state.getType(), c28655q7, 0, 1);
                c28655q7.m87173q(false);
            } else {
                c28655q7.m87150e0(-1609174078);
                AbstractC33199m0.m105210B(state.getType(), c28655q7, 0);
                c28655q7.m87173q(false);
            }
            zM21270d = AbstractC8693b.m21270d(state.getType().getTitle());
            c2314t = C2314t.f9131w;
            if (zM21270d) {
                AbstractC22953f.m66715b(c28655q7, AbstractC18489d0.m53365f(c28655q7, -1609074382, f15, f13, c2314t));
                Modifier modifierM3599a8 = AbstractC1136a.m3599a(c2314t, "progress_modal_title_text");
                String strM21274h4 = AbstractC8693b.m21274h(state.getType().getTitle(), c28655q7, 0);
                C2886a c2886aM8436q4 = c38072d.m121952e(c28655q7, 6).getH3();
                c38072d2 = c38072d;
                c2314t2 = c2314t;
                f16 = f13;
                f17 = f14;
                r10 = 0;
                AbstractC30795n.m94707h(strM21274h4, modifierM3599a8, c38072d.m121949b(c28655q7, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c2886aM8436q4, null, c28655q7, 48, 0, 196088);
                C28655q c28655q1115 = c28655q7;
                c28655q1115.m87173q(false);
                c28655q2 = c28655q1115;
            } else {
                C28655q c28655q1116 = c28655q7;
                f16 = f13;
                c38072d2 = c38072d;
                c2314t2 = c2314t;
                r10 = 0;
                f17 = f14;
                c28655q1116.m87150e0(-1608708241);
                c28655q1116.m87173q(false);
                c28655q2 = c28655q1116;
            }
            if (state.getSupportText() == null) {
                c28655q2.m87150e0(-1608667043);
                c28655q2.m87173q(r10);
                c28655q4 = c28655q2;
            } else {
                c28655q2.m87150e0(-1608667042);
                if (AbstractC8693b.m21270d(state.getSupportText())) {
                    AbstractC22953f.m66715b(c28655q2, AbstractC18489d0.m53365f(c28655q2, -221482422, f17, f16, c2314t2));
                    C28655q c28655q1117 = c28655q2;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(state.getSupportText(), c28655q2, r10), null, c38072d2.m121949b(c28655q2, 6).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, 6).getB1(), null, c28655q1117, 0, 0, 196090);
                    C28655q c28655q1118 = c28655q1117;
                    c28655q1118.m87173q(r10);
                    c28655q3 = c28655q1118;
                } else {
                    c28655q2.m87150e0(-221158565);
                    c28655q2.m87173q(r10);
                    c28655q3 = c28655q2;
                }
                c28655q3.m87173q(r10);
                c28655q4 = c28655q3;
            }
            primaryButton = state.getPrimaryButton();
            if (primaryButton == null) {
                c28655q4.m87150e0(-1608235957);
                c28655q4.m87173q(r10);
                interfaceC4339a5 = interfaceC4339a7;
                c28655q5 = c28655q4;
            } else {
                c28655q4.m87150e0(-1608235956);
                AbstractC18489d0.m53380u(2, f16, c2314t2, c28655q4);
                C28655q c28655q1119 = c28655q4;
                InterfaceC4339a interfaceC4339a14 = interfaceC4339a7;
                AbstractC27292z.m82343j(AbstractC1136a.m3599a(AbstractC1102d.m3409f(1.0f, c2314t2), "progress_modal_primary_button"), false, false, primaryButton.getIcon(), null, null, primaryButton.getText(), null, null, null, 0.0f, null, null, interfaceC4339a14, c28655q1119, 6, (i15 << 6) & 7168, 8118);
                interfaceC4339a5 = interfaceC4339a14;
                C28655q c28655q11110 = c28655q1119;
                c28655q11110.m87173q(r10);
                c28655q5 = c28655q11110;
            }
            secondaryButton = state.getSecondaryButton();
            if (secondaryButton == null) {
                c28655q5.m87150e0(-1607722690);
                c28655q5.m87173q(r10);
                interfaceC4339a10 = interfaceC4339a8;
                z14 = true;
                c28655q6 = c28655q5;
            } else {
                c28655q5.m87150e0(-1607722689);
                AbstractC18489d0.m53380u(1, f16, c2314t2, c28655q5);
                C28655q c28655q11111 = c28655q5;
                interfaceC4339a10 = interfaceC4339a8;
                z14 = true;
                AbstractC27271o0.m82253b(AbstractC1136a.m3599a(AbstractC1102d.m3409f(1.0f, c2314t2), "progress_modal_secondary_button"), false, secondaryButton.getText(), null, null, null, secondaryButton.getEndIcon(), null, false, null, interfaceC4339a10, c28655q11111, 196614, (i15 >> 6) & 14, 922);
                C28655q c28655q11112 = c28655q11111;
                c28655q11112.m87173q(r10);
                c28655q6 = c28655q11112;
            }
            c28655q6.m87173q(z14);
            interfaceC4339a6 = interfaceC4339a10;
            c28655q = c28655q6;
        } else {
            C28655q c28655q11113 = c28655q7;
            c28655q11113.m87138X();
            interfaceC4339a5 = interfaceC4339a3;
            interfaceC4339a6 = interfaceC4339a4;
            c28655q = c28655q11113;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C12582b(i13, i14, 1, state, interfaceC4339a5, interfaceC4339a6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m35350g() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m35351h() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m35352i(C12611c c12611c) {
        c12611c.getOnScrimClicked().invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m35353j(C12611c c12611c, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, int i14, Composer composer, int i15) {
        m35349f(c12611c, interfaceC4339a, interfaceC4339a2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    public static final void m35354k(Modifier modifier, AbstractC33208p0.b type, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        AbstractC22676k.m65750j(type, "type");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(517513098);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = i13 | (c28655q.m87153g(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(type) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier2 = c2314t;
            }
            float f13 = 4;
            int i17 = (i15 >> 3) & 14;
            Modifier modifierM3394p = AbstractC1099a.m3394p(((float) 1.5d) * f13, AbstractC18249c.m52567e(AbstractC1102d.m3419p(6 * f13, modifier2), AbstractC18249c.m52577o(C17919x.m51541c(0.1f, AbstractC33199m0.m105222N(type, c28655q, i17))), C22411w.f87680a.m64537c().m64090c(), null, 4, null));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(type.getIcon(), c28655q, 6), null, AbstractC1136a.m3599a(AbstractC1102d.m3419p(5 * f13, c2314t), "progress_modal_loading_default"), AbstractC33199m0.m105222N(type, c28655q, i17), c28655q, 432, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        Modifier modifier3 = modifier2;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11736b(modifier3, i13, type, i14, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m35355l(Modifier modifier, AbstractC33208p0.b bVar, int i13, int i14, Composer composer, int i15) {
        m35354k(modifier, bVar, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
