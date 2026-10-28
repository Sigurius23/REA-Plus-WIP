package lc0;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15673b0;
import ih1.C18522f;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import iy0.C21026a;
import jc0.C21604d;
import kw1.C22852c;
import l72.C23399f;
import l72.C23401h;
import l83.C23454a0;
import live.hms.video.error.ErrorCodes;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27271o0;
import ny0.C27256h;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p291l0.InterfaceC23013y;
import p292l1.C23196w3;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import v41.AbstractC35662e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: lc0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a9\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001a1\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0003¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Ljc0/d$b;", "bottomSheetData", "Ll1/w3;", "sheetState", "Lkotlin/Function0;", "Ll83/a0;", "onDismissRequest", "g", "(Landroidx/compose/ui/Modifier;Ljc0/d$b;Ll1/w3;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "k", "(Landroidx/compose/ui/Modifier;Ljc0/d$b;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "advanced-labs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23820b {
    /* JADX WARN: Code duplicated, block: B:43:0x0082  */
    /* JADX WARN: Code duplicated, block: B:44:0x0084  */
    /* JADX WARN: Code duplicated, block: B:47:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x008f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0093  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:53:0x009e  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    public static final void m69932g(Modifier modifier, C21604d.b bottomSheetData, C23196w3 sheetState, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        InterfaceC4339a interfaceC4339a2;
        boolean z4;
        C28655q c28655q;
        Modifier modifier3;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        InterfaceC4339a interfaceC4339a4;
        Object objM87133R;
        AbstractC22676k.m65750j(bottomSheetData, "bottomSheetData");
        AbstractC22676k.m65750j(sheetState, "sheetState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(662487330);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q2.m87153g(bottomSheetData) : c28655q2.m87157i(bottomSheetData) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87153g(sheetState) ? 256 : 128;
        }
        int i17 = i14 & 8;
        if (i17 == 0) {
            if ((i13 & 3072) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                i15 |= c28655q2.m87157i(interfaceC4339a2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                if (i16 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i17 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C23399f(10);
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                c28655q = c28655q2;
                AbstractC35662e.m112943g(modifier4, sheetState, null, null, null, null, interfaceC4339a4, null, false, null, AbstractC15673b0.m44030c0(), false, AbstractC37817c.m121344e(-36869624, c28655q2, new C18522f(13, bottomSheetData, interfaceC4339a4)), c28655q, (i15 & 14) | ((i15 >> 3) & 112) | ((i15 << 9) & 3670016), 384, ErrorCodes.TracksErrors.cPeerConnectionFactoryDisposed);
                modifier3 = modifier4;
                interfaceC4339a3 = interfaceC4339a4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C22852c((Object) modifier3, (Object) bottomSheetData, (Object) sheetState, (Object) interfaceC4339a3, i13, i14, 4);
            }
        }
        i15 |= 3072;
        interfaceC4339a2 = interfaceC4339a;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            if (i16 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            if (i17 != 0) {
                objM87133R = c28655q2.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C23399f(10);
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            c28655q = c28655q2;
            AbstractC35662e.m112943g(modifier4, sheetState, null, null, null, null, interfaceC4339a4, null, false, null, AbstractC15673b0.m44030c0(), false, AbstractC37817c.m121344e(-36869624, c28655q2, new C18522f(13, bottomSheetData, interfaceC4339a4)), c28655q, (i15 & 14) | ((i15 >> 3) & 112) | ((i15 << 9) & 3670016), 384, ErrorCodes.TracksErrors.cPeerConnectionFactoryDisposed);
            modifier3 = modifier4;
            interfaceC4339a3 = interfaceC4339a4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22852c((Object) modifier3, (Object) bottomSheetData, (Object) sheetState, (Object) interfaceC4339a3, i13, i14, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m69933h() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m69934i(C21604d.b bVar, InterfaceC4339a interfaceC4339a, InterfaceC23013y BottomSheetM3, Composer composer, int i13) {
        AbstractC22676k.m65750j(BottomSheetM3, "$this$BottomSheetM3");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            m69936k(null, bVar, interfaceC4339a, c28655q, C27256h.f109055z << 3, 1);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m69935j(Modifier modifier, C21604d.b bVar, C23196w3 c23196w3, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m69932g(modifier, bVar, c23196w3, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:49:0x0091  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:61:0x01af  */
    /* JADX WARN: Code duplicated, block: B:68:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:70:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:73:0x0200  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: k */
    private static final void m69936k(Modifier modifier, C21604d.b bVar, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        InterfaceC4339a interfaceC4339a2;
        boolean z4;
        C28655q c28655q;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        InterfaceC4339a interfaceC4339a5;
        boolean z13;
        Object objM87133R;
        InterfaceC4339a interfaceC4339a6;
        Object objM87133R2;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1124575929);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q2.m87153g(bVar) : c28655q2.m87157i(bVar) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 == 0) {
            if ((i13 & 384) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                i15 |= c28655q2.m87157i(interfaceC4339a2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i16 != 0) {
                    modifier2 = c2314t;
                }
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C23399f(11);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier2);
                float f13 = 8;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * f13), C2299e.f9110M, c28655q2, 6);
                Modifier modifier3 = modifier2;
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                interfaceC4339a5 = interfaceC4339a4;
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                int i18 = i15;
                String strM60744c = bVar.getTitle();
                C38072d c38072d = C38072d.f163053a;
                int i19 = C38072d.f163054b;
                C2886a c2886aM8418P = c38072d.m121952e(c28655q2, i19).getT3();
                long jM125430y = c38072d.m121949b(c28655q2, i19).getBrandWhite();
                int i24 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM60744c, modifierM3409f2, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P, null, c28655q2, 48, i24, 196600);
                AbstractC30795n.m94707h(bVar.getContent(), AbstractC1102d.m3409f(1.0f, c2314t), c38072d.m121949b(c28655q2, i19).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i19).getB1(), null, c28655q2, 48, i24, 196600);
                Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 2 * f13, 0.0f, 0.0f, 13);
                TextResource textResourceM82166x = bVar.getPrimaryButton().getTitle();
                z13 = (i18 & 896) == 256;
                objM87133R = c28655q2.m87133R();
                if (!z13 || objM87133R == c28676v0) {
                    interfaceC4339a6 = interfaceC4339a5;
                    objM87133R = new C21026a(interfaceC4339a6, 25);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    interfaceC4339a6 = interfaceC4339a5;
                }
                AbstractC27271o0.m82253b(modifierM3398t, false, textResourceM82166x, null, null, null, null, null, false, null, (InterfaceC4339a) objM87133R, c28655q2, (TextResource.$stable << 6) | 6, 0, MessageListItemViewType.POLL);
                c28655q2.m87173q(true);
                modifier2 = modifier3;
                c28655q = c28655q2;
                interfaceC4339a3 = interfaceC4339a6;
            } else {
                c28655q2.m87138X();
                c28655q = c28655q2;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C23401h(i13, i14, 3, modifier2, bVar, interfaceC4339a3);
            }
        }
        i15 |= 384;
        interfaceC4339a2 = interfaceC4339a;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier2 = c2314t;
            }
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C23399f(11);
                    c28655q2.m87172p0(objM87133R2);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, modifier2);
            float f14 = 8;
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * f14), C2299e.f9110M, c28655q2, 6);
            Modifier modifier4 = modifier2;
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3409f3);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
            interfaceC4339a5 = interfaceC4339a4;
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t);
            int i110 = i15;
            String strM60744c2 = bVar.getTitle();
            C38072d c38072d2 = C38072d.f163053a;
            int i111 = C38072d.f163054b;
            C2886a c2886aM8418P2 = c38072d2.m121952e(c28655q2, i111).getT3();
            long jM125430y2 = c38072d2.m121949b(c28655q2, i111).getBrandWhite();
            int i25 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM60744c2, modifierM3409f4, jM125430y2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P2, null, c28655q2, 48, i25, 196600);
            AbstractC30795n.m94707h(bVar.getContent(), AbstractC1102d.m3409f(1.0f, c2314t), c38072d2.m121949b(c28655q2, i111).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, i111).getB1(), null, c28655q2, 48, i25, 196600);
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 2 * f14, 0.0f, 0.0f, 13);
            TextResource textResourceM82166x2 = bVar.getPrimaryButton().getTitle();
            if ((i110 & 896) == 256) {
            }
            objM87133R = c28655q2.m87133R();
            if (z13) {
                interfaceC4339a6 = interfaceC4339a5;
                objM87133R = new C21026a(interfaceC4339a6, 25);
                c28655q2.m87172p0(objM87133R);
            } else {
                interfaceC4339a6 = interfaceC4339a5;
                objM87133R = new C21026a(interfaceC4339a6, 25);
                c28655q2.m87172p0(objM87133R);
            }
            AbstractC27271o0.m82253b(modifierM3398t2, false, textResourceM82166x2, null, null, null, null, null, false, null, (InterfaceC4339a) objM87133R, c28655q2, (TextResource.$stable << 6) | 6, 0, MessageListItemViewType.POLL);
            c28655q2.m87173q(true);
            modifier2 = modifier4;
            c28655q = c28655q2;
            interfaceC4339a3 = interfaceC4339a6;
        } else {
            c28655q2.m87138X();
            c28655q = c28655q2;
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23401h(i13, i14, 3, modifier2, bVar, interfaceC4339a3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m69937l() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m69938m(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m69939n(Modifier modifier, C21604d.b bVar, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m69936k(modifier, bVar, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
