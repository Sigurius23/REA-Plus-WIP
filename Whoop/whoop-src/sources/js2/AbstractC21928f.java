package js2;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c41.AbstractC4106r2;
import c41.C4092p2;
import c93.InterfaceC4339a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.models.modal.DialogButton;
import com.whoop.design.models.modal.DialogModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import fs2.InterfaceC14759l;
import fs2.InterfaceC14760m;
import g11.C15218b;
import gb1.AbstractC15673b0;
import gz0.EnumC16313m0;
import hs2.C17611e;
import hs2.InterfaceC17607a;
import hy0.C17749h0;
import j11.AbstractC21211n;
import j11.C21214q;
import jp1.C21860l;
import jp2.C21875f;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27292z;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p163g1.C15079m3;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p571w3.C36775k;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: js2.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a?\u0010\n\u001a\u00020\b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a5\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0003¢\u0006\u0004\b\f\u0010\r\u001a5\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0003¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u0011²\u0006\u000e\u0010\u0010\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lfs2/l;", "callState", "Lhs2/e$d;", "viewState", "Lfs2/m;", "videoCallUiProvider", "Lkotlin/Function1;", "Lhs2/a;", "Ll83/a0;", "onEvent", "E", "(Lfs2/l;Lhs2/e$d;Lfs2/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "o", "(Lhs2/e$d;Lfs2/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "s", "", "showPermissionsModal", "video-call_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21928f {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m62428A(C17611e.c cVar, Function1 function1) {
        C9598e c9598eM50163b;
        if (cVar != null && (c9598eM50163b = cVar.getDestination()) != null) {
            function1.invoke(new InterfaceC17607a.e(c9598eM50163b));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m62429B(InterfaceC28601c1 interfaceC28601c1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        m62456v(interfaceC28601c1, true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m62430C(Function1 function1) {
        function1.invoke(InterfaceC17607a.d.f68221a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m62431D(C17611e.d dVar, InterfaceC14760m interfaceC14760m, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m62453s(dVar, interfaceC14760m, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: E */
    public static final void m62432E(InterfaceC14759l interfaceC14759l, C17611e.d viewState, InterfaceC14760m videoCallUiProvider, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(videoCallUiProvider, "videoCallUiProvider");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-935092246);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(interfaceC14759l) : c28655q.m87157i(interfaceC14759l) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= (i13 & 512) == 0 ? c28655q.m87153g(videoCallUiProvider) : c28655q.m87157i(videoCallUiProvider) ? 256 : 128;
        }
        int i16 = i14 & 8;
        if (i16 != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87157i(function1) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 1171) != 1170)) {
            if (i16 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C21875f(5);
                    c28655q.m87172p0(objM87133R);
                }
                function1 = (Function1) objM87133R;
            }
            Function1 function3 = function1;
            if (interfaceC14759l instanceof InterfaceC14759l.a) {
                c28655q.m87150e0(-975475118);
                int i17 = i15 >> 3;
                m62449o(viewState, videoCallUiProvider, function3, c28655q, C9598e.f28134d | DialogModel.$stable | C4092p2.f16593v | C17749h0.f69004h | (i17 & 14) | (i17 & 112) | (i17 & 896), 0);
                c28655q.m87173q(false);
            } else if (interfaceC14759l instanceof InterfaceC14759l.e) {
                c28655q.m87150e0(-975471602);
                int i18 = i15 >> 3;
                m62453s(viewState, videoCallUiProvider, function3, c28655q, C9598e.f28134d | DialogModel.$stable | C4092p2.f16593v | C17749h0.f69004h | (i18 & 14) | (i18 & 112) | (i18 & 896), 0);
                c28655q.m87173q(false);
            } else {
                if (!(interfaceC14759l instanceof InterfaceC14759l.d) && !(interfaceC14759l instanceof InterfaceC14759l.b) && !(interfaceC14759l instanceof InterfaceC14759l.c) && !(interfaceC14759l instanceof InterfaceC14759l.f) && interfaceC14759l != null) {
                    throw AbstractC11895b.m32003v(-975476558, c28655q, false);
                }
                c28655q.m87150e0(-174633386);
                c28655q.m87173q(false);
            }
            function2 = function3;
        } else {
            c28655q.m87138X();
            function2 = function1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15079m3(interfaceC14759l, viewState, videoCallUiProvider, function2, i13, i14, 23);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m62433F(InterfaceC17607a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m62434G(InterfaceC14759l interfaceC14759l, C17611e.d dVar, InterfaceC14760m interfaceC14760m, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m62432E(interfaceC14759l, dVar, interfaceC14760m, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:55:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:64:0x0113  */
    /* JADX WARN: Code duplicated, block: B:67:0x011d  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: o */
    private static final void m62449o(C17611e.d dVar, InterfaceC14760m interfaceC14760m, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z13;
        Object objM87133R;
        Object objM87133R2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1708063315);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(dVar) : c28655q.m87157i(dVar) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(interfaceC14760m) : c28655q.m87157i(interfaceC14760m) ? 32 : 16;
        }
        int i16 = i14 & 4;
        if (i16 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C21875f(6);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                Modifier modifierM44028b0 = AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, C2314t.f9131w));
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM44028b0);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                z13 = (i15 & 896) == 256;
                objM87133R = c28655q.m87133R();
                if (z13 || objM87133R == c28676v0) {
                    objM87133R = new C21860l(function4, 10);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC14760m.mo42300b((InterfaceC4339a) objM87133R, dVar.getParticipants(), c28655q, ((i15 << 3) & 896) | (C17749h0.f69004h << 3));
                c28655q.m87173q(true);
                function3 = function4;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C21926d(dVar, interfaceC14760m, function3, i13, i14, 1);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C21875f(6);
                    c28655q.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            Modifier modifierM44028b1 = AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, C2314t.f9131w));
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM44028b1);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            if ((i15 & 896) == 256) {
            }
            objM87133R = c28655q.m87133R();
            if (z13) {
                objM87133R = new C21860l(function4, 10);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C21860l(function4, 10);
                c28655q.m87172p0(objM87133R);
            }
            interfaceC14760m.mo42300b((InterfaceC4339a) objM87133R, dVar.getParticipants(), c28655q, ((i15 << 3) & 896) | (C17749h0.f69004h << 3));
            c28655q.m87173q(true);
            function3 = function4;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21926d(dVar, interfaceC14760m, function3, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m62450p(InterfaceC17607a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m62451q(Function1 function1) {
        function1.invoke(InterfaceC17607a.f.f68224a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m62452r(C17611e.d dVar, InterfaceC14760m interfaceC14760m, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m62449o(dVar, interfaceC14760m, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0263  */
    /* JADX WARN: Code duplicated, block: B:103:0x0267  */
    /* JADX WARN: Code duplicated, block: B:105:0x026d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0270  */
    /* JADX WARN: Code duplicated, block: B:109:0x0296  */
    /* JADX WARN: Code duplicated, block: B:110:0x0299  */
    /* JADX WARN: Code duplicated, block: B:114:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:117:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:118:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:122:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:125:0x030e  */
    /* JADX WARN: Code duplicated, block: B:127:0x0320  */
    /* JADX WARN: Code duplicated, block: B:129:0x0345  */
    /* JADX WARN: Code duplicated, block: B:133:0x0375  */
    /* JADX WARN: Code duplicated, block: B:134:0x0377  */
    /* JADX WARN: Code duplicated, block: B:136:0x037a  */
    /* JADX WARN: Code duplicated, block: B:139:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:140:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:147:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:150:0x0419  */
    /* JADX WARN: Code duplicated, block: B:151:0x041d  */
    /* JADX WARN: Code duplicated, block: B:156:0x0438  */
    /* JADX WARN: Code duplicated, block: B:159:0x0519  */
    /* JADX WARN: Code duplicated, block: B:160:0x051b  */
    /* JADX WARN: Code duplicated, block: B:166:0x0529  */
    /* JADX WARN: Code duplicated, block: B:168:0x0559  */
    /* JADX WARN: Code duplicated, block: B:171:0x0563  */
    /* JADX WARN: Code duplicated, block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x0086  */
    /* JADX WARN: Code duplicated, block: B:49:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:70:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:73:0x010f  */
    /* JADX WARN: Code duplicated, block: B:77:0x0129  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:82:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:88:0x0215  */
    /* JADX WARN: Code duplicated, block: B:95:0x0245  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: s */
    private static final void m62453s(C17611e.d dVar, InterfaceC14760m interfaceC14760m, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        Context context;
        Function1 function5;
        InterfaceC28601c1 interfaceC28601c2;
        C28676v0 c28676v1;
        int i16;
        int i17;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C17611e.c cVarM50160a;
        String strM50161b;
        TextResource textResourceM21278l;
        Integer numValueOf;
        String strM50162a;
        String str;
        int i18;
        int i19;
        Object objM87133R2;
        boolean z13;
        boolean z14;
        Object objM87133R3;
        Function1 function6;
        C4092p2 c4092p2M50171d;
        Object objM87133R4;
        int i24;
        C28655q c28655q;
        boolean z15;
        boolean z16;
        int iHashCode2;
        int iHashCode3;
        C28655q c28655q2;
        boolean z17;
        Object[] objArr;
        Object objM87133R5;
        EnumC16313m0 enumC16313m0M50164c;
        String description;
        TextResource textResourceM21278l2;
        DialogButton primaryButton;
        TextResource textResourceM21278l3;
        DialogButton secondaryButton;
        TextResource textResourceM21278l4;
        Object objM87133R6;
        Object objM87133R7;
        boolean zM87157i;
        Object objM87133R8;
        String title;
        String title2;
        Object objM87133R9;
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(-696669374);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q3.m87153g(dVar) : c28655q3.m87157i(dVar) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q3.m87153g(interfaceC14760m) : c28655q3.m87157i(interfaceC14760m) ? 32 : 16;
        }
        int i25 = i14 & 4;
        if (i25 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q3.m87157i(function2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q3.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i25 != 0) {
                    objM87133R9 = c28655q3.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = new C21875f(7);
                        c28655q3.m87172p0(objM87133R9);
                    }
                    function4 = (Function1) objM87133R9;
                } else {
                    function4 = function2;
                }
                objM87133R = c28655q3.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q3.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                context = (Context) c28655q3.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                if (m62455u(interfaceC28601c1)) {
                    c28655q3.m87150e0(-1195006986);
                    DialogModel dialogModelM50172e = dVar.getWaitingRoom().getPermissionsModal();
                    TextResource textResourceM21278l5 = AbstractC8693b.m21278l(dialogModelM50172e.getTitle());
                    description = dialogModelM50172e.getDescription();
                    if (description != null) {
                        textResourceM21278l2 = AbstractC8693b.m21278l(description);
                    } else {
                        textResourceM21278l2 = null;
                    }
                    primaryButton = dialogModelM50172e.getPrimaryButton();
                    if (primaryButton != null || (title2 = primaryButton.getTitle()) == null) {
                        textResourceM21278l3 = null;
                    } else {
                        textResourceM21278l3 = AbstractC8693b.m21278l(title2);
                    }
                    secondaryButton = dialogModelM50172e.getSecondaryButton();
                    if (secondaryButton != null || (title = secondaryButton.getTitle()) == null) {
                        textResourceM21278l4 = null;
                    } else {
                        textResourceM21278l4 = AbstractC8693b.m21278l(title);
                    }
                    boolean showCloseButton = dialogModelM50172e.getShowCloseButton();
                    objM87133R6 = c28655q3.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C15218b(28, interfaceC28601c1);
                        c28655q3.m87172p0(objM87133R6);
                    }
                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R6;
                    objM87133R7 = c28655q3.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C15218b(29, interfaceC28601c1);
                        c28655q3.m87172p0(objM87133R7);
                    }
                    InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R7;
                    zM87157i = c28655q3.m87157i(context);
                    objM87133R8 = c28655q3.m87133R();
                    if (zM87157i || objM87133R8 == c28676v0) {
                        objM87133R8 = new C21214q(13, context, interfaceC28601c1);
                        c28655q3.m87172p0(objM87133R8);
                    }
                    int i26 = TextResource.$stable;
                    interfaceC28601c2 = interfaceC28601c1;
                    i17 = 256;
                    i16 = 0;
                    function5 = function4;
                    c28676v1 = c28676v0;
                    AbstractC21211n.m59497o(null, textResourceM21278l5, textResourceM21278l2, textResourceM21278l3, false, null, null, null, null, textResourceM21278l4, null, false, showCloseButton, null, null, false, 0, null, null, null, false, null, interfaceC4339a, interfaceC4339a2, (InterfaceC4339a) objM87133R8, null, null, null, c28655q3, (i26 << 3) | (i26 << 6) | (i26 << 9) | (i26 << 27), 805306368, 3456, 238546417);
                    c28655q3 = c28655q3;
                    c28655q3.m87173q(false);
                } else {
                    function5 = function4;
                    interfaceC28601c2 = interfaceC28601c1;
                    c28676v1 = c28676v0;
                    i16 = 0;
                    i17 = 256;
                    c28655q3.m87150e0(-1194074816);
                    c28655q3.m87173q(false);
                }
                c2314t = C2314t.f9131w;
                Modifier modifierM66725n = AbstractC22953f.m66725n(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t)));
                C22957g c22957g = AbstractC22977m.f90652c;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, C2299e.f9110M, c28655q3, i16);
                iHashCode = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierM66725n);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q3, c0209i2, c23010xM66775a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N);
                cVarM50160a = dVar.getWaitingRoom().getNavigationBar().getRightButton();
                strM50161b = dVar.getWaitingRoom().getNavigationBar().getTitle();
                if (strM50161b != null || (textResourceM21278l = AbstractC8693b.m21278l(strM50161b)) == null) {
                    textResourceM21278l = AbstractC8693b.m21278l("");
                }
                TextResource textResource = textResourceM21278l;
                C38072d c38072d = C38072d.f163053a;
                Integer numM38561h = AbstractC13673n.m38561h(c38072d);
                if (cVarM50160a != null || (enumC16313m0M50164c = cVarM50160a.getIcon()) == null) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(enumC16313m0M50164c.toWhoopIcon());
                }
                strM50162a = cVarM50160a != null ? cVarM50160a.getContentDescription() : null;
                if (strM50162a == null) {
                    str = "";
                } else {
                    str = strM50162a;
                }
                AbstractC6721d.a aVar = new AbstractC6721d.a(textResource, null, numM38561h, null, numValueOf, str, null, null, false, null, null, null, null, null, null, null, 65482, null);
                i18 = i15 & 896;
                if (i18 == i17) {
                    i19 = 1;
                } else {
                    i19 = i16;
                }
                objM87133R2 = c28655q3.m87133R();
                if (i19 == 0 || objM87133R2 == c28676v1) {
                    objM87133R2 = new C21860l(function5, 11);
                    c28655q3.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                boolean zM87157i2 = c28655q3.m87157i(cVarM50160a);
                int i27 = i15;
                if (i18 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z13 | zM87157i2;
                objM87133R3 = c28655q3.m87133R();
                if (z14 || objM87133R3 == c28676v1) {
                    objM87133R3 = new C21214q(cVarM50160a, function5, 14);
                    c28655q3.m87172p0(objM87133R3);
                }
                function6 = function5;
                AbstractC6719b.m20143d(null, aVar, null, interfaceC4339a3, (InterfaceC4339a) objM87133R3, null, c28655q3, AbstractC6721d.a.f25641r << 3, 37);
                c4092p2M50171d = dVar.getWaitingRoom().getPermissionsCallout();
                if (c4092p2M50171d == null) {
                    c28655q3.m87150e0(-1703318910);
                    c28655q3.m87173q(false);
                    c28655q = c28655q3;
                    i24 = 2;
                    z15 = true;
                } else {
                    c28655q3.m87150e0(-1703318909);
                    float f13 = 8;
                    Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1099a.m3396r(c2314t, 4 * f13, 0.0f, 2), 0.0f, 0.0f, 0.0f, 1 * f13, 7);
                    objM87133R4 = c28655q3.m87133R();
                    if (objM87133R4 == c28676v1) {
                        objM87133R4 = new C21927e(0, interfaceC28601c2);
                        c28655q3.m87172p0(objM87133R4);
                    }
                    C28655q c28655q4 = c28655q3;
                    i24 = 2;
                    c28655q = c28655q4;
                    z15 = true;
                    AbstractC4106r2.m12647f(modifierM3398t, c4092p2M50171d, (Function1) objM87133R4, c28655q, (C4092p2.f16593v << 3) | 390, 0);
                    c28655q.m87173q(false);
                }
                if (1.0f > 0.0d) {
                    z16 = z15;
                } else {
                    z16 = false;
                }
                if (!z16) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                float f14 = 8;
                Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC38963t7.m124374d(1.0f, 1.0f, z15), f14 * f14, 0.0f, i24);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3396r);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                interfaceC14760m.mo42299a(dVar.getParticipants().getLocalParticipant(), dVar.getArePermissionsEnabled(), c28655q, C17749h0.f69004h | ((i27 << 3) & 896));
                c28655q.m87173q(z15);
                float f15 = i24 * f14;
                float f16 = 6 * f14;
                Modifier modifierM3397s = AbstractC1099a.m3397s(AbstractC1102d.m3409f(1.0f, c2314t), f16, f15, f16, f15);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, C2299e.f9111N, c28655q, 48);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3397s);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                String strM50169b = dVar.getWaitingRoom().getHeader();
                int i28 = C38072d.f163054b;
                long jM125430y = c38072d.m121949b(c28655q, i28).getBrandWhite();
                C2886a c2886aM8419Q = c38072d.m121952e(c28655q, i28).getT4();
                C36775k c36775k = new C36775k(r14);
                int i29 = C2886a.f11498d << 18;
                c28655q2 = c28655q;
                z17 = z15;
                AbstractC30795n.m94707h(strM50169b, null, jM125430y, 0L, null, null, null, 0L, null, c36775k, 0L, 0, false, 0, 0, null, c2886aM8419Q, null, c28655q2, 0, i29, 196090);
                String strM50168a = dVar.getWaitingRoom().getDescription();
                long jM125385c1 = c38072d.m121949b(c28655q2, i28).getWhite70();
                C2886a c2886aM8421b = c38072d.m121952e(c28655q2, i28).getB2();
                float f17 = (z17 ? 1.0f : 0.0f) * f14;
                AbstractC30795n.m94707h(strM50168a, AbstractC1099a.m3398t(c2314t, 0.0f, f17, 0.0f, 0.0f, 13), jM125385c1, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c2886aM8421b, null, c28655q2, 48, i29, 196088);
                c28655q2.m87173q(z17);
                float f18 = ((float) 2.5d) * f14;
                Modifier modifierM3397s2 = AbstractC1099a.m3397s(AbstractC1102d.m3409f(1.0f, c2314t), f18, 5 * f14, f18, f17);
                TextResource textResourceM21278l6 = AbstractC8693b.m21278l(dVar.getWaitingRoom().getPrimaryButtonTitle());
                boolean zM50165a = dVar.getArePermissionsEnabled();
                if (i18 == 256) {
                    objArr = z17 ? 1 : 0;
                } else {
                    objArr = null;
                }
                objM87133R5 = c28655q2.m87133R();
                if (objArr == null || objM87133R5 == c28676v1) {
                    function3 = function6;
                    objM87133R5 = new C21860l(function3, 12);
                    c28655q2.m87172p0(objM87133R5);
                } else {
                    function3 = function6;
                }
                AbstractC27292z.m82343j(modifierM3397s2, zM50165a, false, null, null, null, textResourceM21278l6, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R5, c28655q2, TextResource.$stable << 18, 0, 8124);
                c28655q3 = c28655q2;
                c28655q3.m87173q(z17);
            } else {
                c28655q3.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q3.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C21926d(dVar, interfaceC14760m, function3, i13, i14, 0);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q3.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i25 != 0) {
                objM87133R9 = c28655q3.m87133R();
                if (objM87133R9 == c28676v0) {
                    objM87133R9 = new C21875f(7);
                    c28655q3.m87172p0(objM87133R9);
                }
                function4 = (Function1) objM87133R9;
            } else {
                function4 = function2;
            }
            objM87133R = c28655q3.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q3.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            context = (Context) c28655q3.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            if (m62455u(interfaceC28601c1)) {
                c28655q3.m87150e0(-1195006986);
                DialogModel dialogModelM50172e2 = dVar.getWaitingRoom().getPermissionsModal();
                TextResource textResourceM21278l7 = AbstractC8693b.m21278l(dialogModelM50172e2.getTitle());
                description = dialogModelM50172e2.getDescription();
                if (description != null) {
                    textResourceM21278l2 = AbstractC8693b.m21278l(description);
                } else {
                    textResourceM21278l2 = null;
                }
                primaryButton = dialogModelM50172e2.getPrimaryButton();
                if (primaryButton != null) {
                    textResourceM21278l3 = null;
                } else {
                    textResourceM21278l3 = null;
                }
                secondaryButton = dialogModelM50172e2.getSecondaryButton();
                if (secondaryButton != null) {
                    textResourceM21278l4 = null;
                } else {
                    textResourceM21278l4 = null;
                }
                boolean showCloseButton2 = dialogModelM50172e2.getShowCloseButton();
                objM87133R6 = c28655q3.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C15218b(28, interfaceC28601c1);
                    c28655q3.m87172p0(objM87133R6);
                }
                InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R6;
                objM87133R7 = c28655q3.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C15218b(29, interfaceC28601c1);
                    c28655q3.m87172p0(objM87133R7);
                }
                InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R7;
                zM87157i = c28655q3.m87157i(context);
                objM87133R8 = c28655q3.m87133R();
                if (zM87157i) {
                    objM87133R8 = new C21214q(13, context, interfaceC28601c1);
                    c28655q3.m87172p0(objM87133R8);
                } else {
                    objM87133R8 = new C21214q(13, context, interfaceC28601c1);
                    c28655q3.m87172p0(objM87133R8);
                }
                int i210 = TextResource.$stable;
                interfaceC28601c2 = interfaceC28601c1;
                i17 = 256;
                i16 = 0;
                function5 = function4;
                c28676v1 = c28676v0;
                AbstractC21211n.m59497o(null, textResourceM21278l7, textResourceM21278l2, textResourceM21278l3, false, null, null, null, null, textResourceM21278l4, null, false, showCloseButton2, null, null, false, 0, null, null, null, false, null, interfaceC4339a4, interfaceC4339a5, (InterfaceC4339a) objM87133R8, null, null, null, c28655q3, (i210 << 3) | (i210 << 6) | (i210 << 9) | (i210 << 27), 805306368, 3456, 238546417);
                c28655q3 = c28655q3;
                c28655q3.m87173q(false);
            } else {
                function5 = function4;
                interfaceC28601c2 = interfaceC28601c1;
                c28676v1 = c28676v0;
                i16 = 0;
                i17 = 256;
                c28655q3.m87150e0(-1194074816);
                c28655q3.m87173q(false);
            }
            c2314t = C2314t.f9131w;
            Modifier modifierM66725n2 = AbstractC22953f.m66725n(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t)));
            C22957g c22957g2 = AbstractC22977m.f90652c;
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g2, C2299e.f9110M, c28655q3, i16);
            iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q3.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q3, modifierM66725n2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q3, c0209i5, c23010xM66775a3);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q3, c0209i6, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q3.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q3, c0209i7, modifierM118962N4);
            cVarM50160a = dVar.getWaitingRoom().getNavigationBar().getRightButton();
            strM50161b = dVar.getWaitingRoom().getNavigationBar().getTitle();
            if (strM50161b != null) {
                textResourceM21278l = AbstractC8693b.m21278l("");
            } else {
                textResourceM21278l = AbstractC8693b.m21278l("");
            }
            TextResource textResource2 = textResourceM21278l;
            C38072d c38072d2 = C38072d.f163053a;
            Integer numM38561h2 = AbstractC13673n.m38561h(c38072d2);
            if (cVarM50160a != null) {
                numValueOf = null;
            } else {
                numValueOf = null;
            }
            if (cVarM50160a != null) {
            }
            if (strM50162a == null) {
                str = "";
            } else {
                str = strM50162a;
            }
            AbstractC6721d.a aVar2 = new AbstractC6721d.a(textResource2, null, numM38561h2, null, numValueOf, str, null, null, false, null, null, null, null, null, null, null, 65482, null);
            i18 = i15 & 896;
            if (i18 == i17) {
                i19 = 1;
            } else {
                i19 = i16;
            }
            objM87133R2 = c28655q3.m87133R();
            if (i19 == 0) {
                objM87133R2 = new C21860l(function5, 11);
                c28655q3.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C21860l(function5, 11);
                c28655q3.m87172p0(objM87133R2);
            }
            InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R2;
            boolean zM87157i3 = c28655q3.m87157i(cVarM50160a);
            int i211 = i15;
            if (i18 == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = z13 | zM87157i3;
            objM87133R3 = c28655q3.m87133R();
            if (z14) {
                objM87133R3 = new C21214q(cVarM50160a, function5, 14);
                c28655q3.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C21214q(cVarM50160a, function5, 14);
                c28655q3.m87172p0(objM87133R3);
            }
            function6 = function5;
            AbstractC6719b.m20143d(null, aVar2, null, interfaceC4339a6, (InterfaceC4339a) objM87133R3, null, c28655q3, AbstractC6721d.a.f25641r << 3, 37);
            c4092p2M50171d = dVar.getWaitingRoom().getPermissionsCallout();
            if (c4092p2M50171d == null) {
                c28655q3.m87150e0(-1703318910);
                c28655q3.m87173q(false);
                c28655q = c28655q3;
                i24 = 2;
                z15 = true;
            } else {
                c28655q3.m87150e0(-1703318909);
                float f19 = 8;
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(c2314t, 4 * f19, 0.0f, 2), 0.0f, 0.0f, 0.0f, 1 * f19, 7);
                objM87133R4 = c28655q3.m87133R();
                if (objM87133R4 == c28676v1) {
                    objM87133R4 = new C21927e(0, interfaceC28601c2);
                    c28655q3.m87172p0(objM87133R4);
                }
                C28655q c28655q5 = c28655q3;
                i24 = 2;
                c28655q = c28655q5;
                z15 = true;
                AbstractC4106r2.m12647f(modifierM3398t2, c4092p2M50171d, (Function1) objM87133R4, c28655q, (C4092p2.f16593v << 3) | 390, 0);
                c28655q.m87173q(false);
            }
            if (1.0f > 0.0d) {
                z16 = z15;
            } else {
                z16 = false;
            }
            if (!z16) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            float f110 = 8;
            Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC38963t7.m124374d(1.0f, 1.0f, z15), f110 * f110, 0.0f, i24);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3396r2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m5);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N5);
            interfaceC14760m.mo42299a(dVar.getParticipants().getLocalParticipant(), dVar.getArePermissionsEnabled(), c28655q, C17749h0.f69004h | ((i211 << 3) & 896));
            c28655q.m87173q(z15);
            float f111 = i24 * f110;
            float f112 = 6 * f110;
            Modifier modifierM3397s3 = AbstractC1099a.m3397s(AbstractC1102d.m3409f(1.0f, c2314t), f112, f111, f112, f111);
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g2, C2299e.f9111N, c28655q, 48);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3397s3);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m6);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N6);
            String strM50169b2 = dVar.getWaitingRoom().getHeader();
            int i212 = C38072d.f163054b;
            long jM125430y2 = c38072d2.m121949b(c28655q, i212).getBrandWhite();
            C2886a c2886aM8419Q2 = c38072d2.m121952e(c28655q, i212).getT4();
            C36775k c36775k2 = new C36775k(r14);
            int i213 = C2886a.f11498d << 18;
            c28655q2 = c28655q;
            z17 = z15;
            AbstractC30795n.m94707h(strM50169b2, null, jM125430y2, 0L, null, null, null, 0L, null, c36775k2, 0L, 0, false, 0, 0, null, c2886aM8419Q2, null, c28655q2, 0, i213, 196090);
            String strM50168a2 = dVar.getWaitingRoom().getDescription();
            long jM125385c2 = c38072d2.m121949b(c28655q2, i212).getWhite70();
            C2886a c2886aM8421b2 = c38072d2.m121952e(c28655q2, i212).getB2();
            float f113 = (z17 ? 1.0f : 0.0f) * f110;
            AbstractC30795n.m94707h(strM50168a2, AbstractC1099a.m3398t(c2314t, 0.0f, f113, 0.0f, 0.0f, 13), jM125385c2, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c2886aM8421b2, null, c28655q2, 48, i213, 196088);
            c28655q2.m87173q(z17);
            float f114 = ((float) 2.5d) * f110;
            Modifier modifierM3397s4 = AbstractC1099a.m3397s(AbstractC1102d.m3409f(1.0f, c2314t), f114, 5 * f110, f114, f113);
            TextResource textResourceM21278l8 = AbstractC8693b.m21278l(dVar.getWaitingRoom().getPrimaryButtonTitle());
            boolean zM50165a2 = dVar.getArePermissionsEnabled();
            if (i18 == 256) {
                objArr = z17 ? 1 : 0;
            } else {
                objArr = null;
            }
            objM87133R5 = c28655q2.m87133R();
            if (objArr == null) {
                function3 = function6;
                objM87133R5 = new C21860l(function3, 12);
                c28655q2.m87172p0(objM87133R5);
            } else {
                function3 = function6;
                objM87133R5 = new C21860l(function3, 12);
                c28655q2.m87172p0(objM87133R5);
            }
            AbstractC27292z.m82343j(modifierM3397s4, zM50165a2, false, null, null, null, textResourceM21278l8, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R5, c28655q2, TextResource.$stable << 18, 0, 8124);
            c28655q3 = c28655q2;
            c28655q3.m87173q(z17);
        } else {
            c28655q3.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q3.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21926d(dVar, interfaceC14760m, function3, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m62454t(InterfaceC17607a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: u */
    private static final boolean m62455u(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: v */
    private static final void m62456v(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m62457w(InterfaceC28601c1 interfaceC28601c1) {
        m62456v(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m62458x(InterfaceC28601c1 interfaceC28601c1) {
        m62456v(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m62459y(Context context, InterfaceC28601c1 interfaceC28601c1) {
        m62456v(interfaceC28601c1, false);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        intent.addFlags(268435456);
        context.startActivity(intent);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m62460z(Function1 function1) {
        function1.invoke(InterfaceC17607a.f.f68224a);
        return C23454a0.f92919a;
    }
}
