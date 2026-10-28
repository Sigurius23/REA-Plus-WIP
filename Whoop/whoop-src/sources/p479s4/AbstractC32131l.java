package p479s4;

import a30.C0307l0;
import a81.C0556g;
import android.content.Context;
import android.os.Process;
import android.view.View;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.core.app.AppOpsManagerCompat;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4351m;
import com.stripe.android.uicore.elements.IdentifierSpec;
import d40.AbstractC11673r;
import ec3.InterfaceC13037f2;
import ed3.C13117a;
import g40.C15342e0;
import g40.C15399o1;
import g40.C15435v2;
import g40.C15440w2;
import g40.InterfaceC15367i1;
import h20.C16671i1;
import h20.C16689l1;
import h20.EnumC16683k1;
import in.C18715c;
import io.sentry.config.AbstractC20301a;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import l83.C23454a0;
import l83.C23467m;
import l83.C23468n;
import live.hms.video.factories.C24148c;
import no.nordicsemi.android.dfu.DfuBaseService;
import o73.C27648a;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p031b9.C2817b;
import p088dc.AbstractC11894a;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p291l0.InterfaceC22974l;
import p345nn.C26857h;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p408q.C29662f;
import p460rg.AbstractC31366a;
import p460rg.AbstractC31375j;
import p463rj.AbstractC31479j;
import p477s2.AbstractC32069a;
import p477s2.AbstractC32072d;
import p478s3.AbstractC32098d;
import p479s4.AbstractC32131l;
import p499t9.C33647p;
import p505ts.AbstractC34132o;
import p520ud.C34785f;
import p550vd.AbstractC35903f;
import p588wm.InterfaceC37368j;
import p598wy.InterfaceC37689b;
import p599wz.C37718g0;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import rs.AbstractC31780b;
import s30.AbstractC32103e;
import sc3.AbstractC32398l;
import so.C32800q;
import t20.C33321b;
import t20.C33326g;
import te0.AbstractC33745d;
import tg2.C33795i;
import ug.C34913b;
import ug.EnumC34931t;
import v00.C35459c0;
import wb3.AbstractC37056f;
import x30.AbstractC37891g1;
import x30.C37874b;
import x30.C37877c;
import x30.C37883e;
import x30.C37885e1;
import x30.C37897i1;
import x30.C37901k;
import x30.C37912n1;
import x30.C37923r0;
import x30.C37924r1;
import x30.C37936x;
import x43.AbstractC37978j;
import x63.InterfaceC38034f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: s4.l */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC32131l implements InterfaceC37689b {
    /* JADX INFO: renamed from: a */
    public static final void m100069a(InterfaceC13037f2 hiddenIdentifiersFlow, InterfaceC13037f2 enabledFlow, InterfaceC13037f2 elementsFlow, InterfaceC13037f2 lastTextFieldIdentifierFlow, Modifier modifier, Composer composer, int i13) {
        Modifier modifier2;
        AbstractC22676k.m65750j(hiddenIdentifiersFlow, "hiddenIdentifiersFlow");
        AbstractC22676k.m65750j(enabledFlow, "enabledFlow");
        AbstractC22676k.m65750j(elementsFlow, "elementsFlow");
        AbstractC22676k.m65750j(lastTextFieldIdentifierFlow, "lastTextFieldIdentifierFlow");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1475980057);
        int i14 = i13 | (c28655q.m87157i(hiddenIdentifiersFlow) ? 4 : 2) | (c28655q.m87157i(enabledFlow) ? 32 : 16) | (c28655q.m87157i(elementsFlow) ? 256 : 128) | (c28655q.m87157i(lastTextFieldIdentifierFlow) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) | 24576;
        if ((i14 & 9363) == 9362 && c28655q.m87121F()) {
            c28655q.m87138X();
            modifier2 = modifier;
        } else {
            InterfaceC28601c1 interfaceC28601c1M83597t = C27648a.m83597t(hiddenIdentifiersFlow, c28655q, i14 & 14);
            InterfaceC28601c1 interfaceC28601c1M83597t2 = C27648a.m83597t(enabledFlow, c28655q, (i14 >> 3) & 14);
            InterfaceC28601c1 interfaceC28601c1M83597t3 = C27648a.m83597t(elementsFlow, c28655q, (i14 >> 6) & 14);
            InterfaceC28601c1 interfaceC28601c1M83597t4 = C27648a.m83597t(lastTextFieldIdentifierFlow, c28655q, (i14 >> 9) & 14);
            Set set = (Set) interfaceC28601c1M83597t.getValue();
            boolean zBooleanValue = ((Boolean) interfaceC28601c1M83597t2.getValue()).booleanValue();
            List list = (List) interfaceC28601c1M83597t3.getValue();
            IdentifierSpec identifierSpec = (IdentifierSpec) interfaceC28601c1M83597t4.getValue();
            int i15 = (IdentifierSpec.$stable << 9) | 24576;
            C2314t c2314t = C2314t.f9131w;
            m100070b(set, zBooleanValue, list, identifierSpec, c2314t, c28655q, i15, 0);
            modifier2 = c2314t;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0556g(hiddenIdentifiersFlow, enabledFlow, elementsFlow, lastTextFieldIdentifierFlow, modifier2, i13, 21);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0183 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0096 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:54:0x009c  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:67:0x0101  */
    /* JADX WARN: Code duplicated, block: B:71:0x011c  */
    /* JADX WARN: Code duplicated, block: B:73:0x012d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0132  */
    /* JADX WARN: Code duplicated, block: B:82:0x014a  */
    /* JADX WARN: Code duplicated, block: B:84:0x0152  */
    /* JADX WARN: Code duplicated, block: B:86:0x015b  */
    /* JADX WARN: Code duplicated, block: B:87:0x015d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0196  */
    /* JADX WARN: Code duplicated, block: B:96:0x0139 A[EDGE_INSN: B:96:0x0139->B:79:0x0139 BREAK  A[LOOP:0: B:69:0x0115->B:98:0x0115], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0115 A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m100070b(Set hiddenIdentifiers, boolean z4, List elements, IdentifierSpec identifierSpec, Modifier modifier, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        Float f13;
        InterfaceC22974l interfaceC22974lM66746i;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        ArrayList arrayList;
        Iterator it;
        int i16;
        int i17;
        boolean z13;
        Object next;
        InterfaceC15367i1 interfaceC15367i1;
        C28677v1 c28677v1M87180u;
        IdentifierSpec identifierSpec2 = identifierSpec;
        AbstractC22676k.m65750j(hiddenIdentifiers, "hiddenIdentifiers");
        AbstractC22676k.m65750j(elements, "elements");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1527302195);
        int i18 = (i13 & 6) == 0 ? (c28655q.m87157i(hiddenIdentifiers) ? 4 : 2) | i13 : i13;
        boolean z14 = z4;
        if ((i13 & 48) == 0) {
            i18 |= c28655q.m87155h(z14) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i18 |= c28655q.m87157i(elements) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i18 |= (i13 & 4096) == 0 ? c28655q.m87153g(identifierSpec2) : c28655q.m87157i(identifierSpec2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i19 = i14 & 16;
        if (i19 == 0) {
            if ((i13 & 24576) == 0) {
                modifier2 = modifier;
                i18 |= c28655q.m87153g(modifier2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 = i18;
            if ((i15 & 9363) == 9362 || !c28655q.m87121F()) {
                if (i19 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                f13 = (Float) c28655q.m87161k(AbstractC11673r.f37714f);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier3);
                if (f13 != null) {
                    interfaceC22974lM66746i = AbstractC22977m.m66746i(f13.floatValue());
                } else {
                    interfaceC22974lM66746i = AbstractC22977m.f90652c;
                }
                C23010x c23010xM66775a = AbstractC23007w.m66775a(interfaceC22974lM66746i, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
                arrayList = new ArrayList();
                it = elements.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    next = it.next();
                    interfaceC15367i1 = (InterfaceC15367i1) next;
                    if (hiddenIdentifiers.contains(interfaceC15367i1.mo43547a()) && !(interfaceC15367i1 instanceof C37923r0)) {
                        arrayList.add(next);
                    }
                }
                c28655q.m87150e0(-1230439477);
                i16 = 0;
                for (Object obj : arrayList) {
                    i17 = i16 + 1;
                    if (i16 < 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    InterfaceC15367i1 interfaceC15367i2 = (InterfaceC15367i1) obj;
                    int size = arrayList.size() - 1;
                    if (f13 != null) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    m100071c(interfaceC15367i2, i16, size, z14, z13, hiddenIdentifiers, identifierSpec2, c28655q, ((i15 << 9) & 3670016) | ((i15 << 6) & 7168) | ((i15 << 15) & 458752) | (IdentifierSpec.$stable << 18));
                    z14 = z4;
                    identifierSpec2 = identifierSpec;
                    i16 = i17;
                }
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                modifier2 = modifier3;
            } else {
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C33795i(hiddenIdentifiers, elements, identifierSpec, modifier2, z4, i13, i14, 1);
            }
        }
        i18 |= 24576;
        modifier2 = modifier;
        i15 = i18;
        if ((i15 & 9363) == 9362) {
            if (i19 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            f13 = (Float) c28655q.m87161k(AbstractC11673r.f37714f);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, modifier3);
            if (f13 != null) {
                interfaceC22974lM66746i = AbstractC22977m.m66746i(f13.floatValue());
            } else {
                interfaceC22974lM66746i = AbstractC22977m.f90652c;
            }
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(interfaceC22974lM66746i, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
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
            arrayList = new ArrayList();
            it = elements.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                    break;
                }
                next = it.next();
                interfaceC15367i1 = (InterfaceC15367i1) next;
                if (hiddenIdentifiers.contains(interfaceC15367i1.mo43547a()) && !(interfaceC15367i1 instanceof C37923r0)) {
                    arrayList.add(next);
                }
            }
            c28655q.m87150e0(-1230439477);
            i16 = 0;
            while (r16.hasNext()) {
                i17 = i16 + 1;
                if (i16 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                InterfaceC15367i1 interfaceC15367i3 = (InterfaceC15367i1) obj;
                int size2 = arrayList.size() - 1;
                if (f13 != null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                m100071c(interfaceC15367i3, i16, size2, z14, z13, hiddenIdentifiers, identifierSpec2, c28655q, ((i15 << 9) & 3670016) | ((i15 << 6) & 7168) | ((i15 << 15) & 458752) | (IdentifierSpec.$stable << 18));
                z14 = z4;
                identifierSpec2 = identifierSpec;
                i16 = i17;
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
            modifier2 = modifier3;
        } else {
            if (i19 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            f13 = (Float) c28655q.m87161k(AbstractC11673r.f37714f);
            Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, modifier3);
            if (f13 != null) {
                interfaceC22974lM66746i = AbstractC22977m.m66746i(f13.floatValue());
            } else {
                interfaceC22974lM66746i = AbstractC22977m.f90652c;
            }
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(interfaceC22974lM66746i, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3409f3);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a3);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
            arrayList = new ArrayList();
            it = elements.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                    break;
                }
                next = it.next();
                interfaceC15367i1 = (InterfaceC15367i1) next;
                if (hiddenIdentifiers.contains(interfaceC15367i1.mo43547a()) && !(interfaceC15367i1 instanceof C37923r0)) {
                    arrayList.add(next);
                }
            }
            c28655q.m87150e0(-1230439477);
            i16 = 0;
            while (r16.hasNext()) {
                i17 = i16 + 1;
                if (i16 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                InterfaceC15367i1 interfaceC15367i4 = (InterfaceC15367i1) obj;
                int size3 = arrayList.size() - 1;
                if (f13 != null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                m100071c(interfaceC15367i4, i16, size3, z14, z13, hiddenIdentifiers, identifierSpec2, c28655q, ((i15 << 9) & 3670016) | ((i15 << 6) & 7168) | ((i15 << 15) & 458752) | (IdentifierSpec.$stable << 18));
                z14 = z4;
                identifierSpec2 = identifierSpec;
                i16 = i17;
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
            modifier2 = modifier3;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33795i(hiddenIdentifiers, elements, identifierSpec, modifier2, z4, i13, i14, 1);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m100071c(final InterfaceC15367i1 interfaceC15367i1, final int i13, final int i14, final boolean z4, final boolean z13, final Set set, final IdentifierSpec identifierSpec, Composer composer, final int i15) {
        int i16;
        Set set2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1087363646);
        if ((i15 & 6) == 0) {
            i16 = (c28655q.m87157i(interfaceC15367i1) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= c28655q.m87149e(i13) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i16 |= c28655q.m87149e(i14) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= c28655q.m87155h(z4) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i15 & 24576) == 0) {
            i16 |= c28655q.m87155h(z13) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i15) == 0) {
            set2 = set;
            i16 |= c28655q.m87157i(set2) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        } else {
            set2 = set;
        }
        if ((1572864 & i15) == 0) {
            i16 |= (2097152 & i15) == 0 ? c28655q.m87153g(identifierSpec) : c28655q.m87157i(identifierSpec) ? 1048576 : 524288;
        }
        if ((599187 & i16) == 599186 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else if (interfaceC15367i1 instanceof C15440w2) {
            c28655q.m87150e0(-1312519891);
            float f13 = 8;
            float f14 = 0;
            int i17 = i16 >> 9;
            AbstractC22674j.m65730p(z4, (C15440w2) interfaceC15367i1, set2, identifierSpec, m100076j(z13, i13, i14, f13, f13, f14, f14), c28655q, (i17 & 7168) | (i17 & 14) | 64 | (i17 & 896) | (IdentifierSpec.$stable << 9), 0);
            c28655q.m87173q(false);
        } else {
            int i18 = i16;
            if (interfaceC15367i1 instanceof C15342e0) {
                c28655q.m87150e0(373317807);
                float f15 = 4;
                float f16 = 0;
                AbstractC37978j.m121643d(m100076j(z13, i13, i14, f15, f15, f16, f16), ((C15342e0) interfaceC15367i1).f57651b, z4, c28655q, ((i18 >> 3) & 896) | 64);
                c28655q.m87173q(false);
            } else if (interfaceC15367i1 instanceof C37924r1) {
                c28655q.m87150e0(373329671);
                float f17 = 8;
                float f18 = 0;
                AbstractC32103e.m99880b((C37924r1) interfaceC15367i1, m100076j(z13, i13, i14, f17, f17, f18, f18), c28655q, 8);
                c28655q.m87173q(false);
            } else if (interfaceC15367i1 instanceof C37897i1) {
                c28655q.m87150e0(-1311345642);
                float f19 = 4;
                float f24 = 0;
                AbstractC32072d.m99700i(z4, (C37897i1) interfaceC15367i1, m100076j(z13, i13, i14, f19, f19, f24, f24), c28655q, ((i18 >> 9) & 14) | 64);
                c28655q.m87173q(false);
            } else if (interfaceC15367i1 instanceof C37912n1) {
                c28655q.m87150e0(-1310964435);
                float f25 = 4;
                float f26 = 0;
                AbstractC32098d.m99837c(z4, (C37912n1) interfaceC15367i1, m100076j(z13, i13, i14, f25, f25, f26, f26), c28655q, ((i18 >> 9) & 14) | 64);
                c28655q.m87173q(false);
            } else if (interfaceC15367i1 instanceof C15435v2) {
                c28655q.m87150e0(373365017);
                float f27 = 4;
                float f28 = 0;
                AbstractC20301a.m56344l(((C15435v2) interfaceC15367i1).f58019b, m100076j(z13, i13, i14, f27, f27, f28, f28), c28655q, 8);
                c28655q.m87173q(false);
            } else if (interfaceC15367i1 instanceof C37877c) {
                c28655q.m87150e0(373376704);
                float f29 = 4;
                AbstractC31366a.m96461a(z4, (C37877c) interfaceC15367i1, m100076j(z13, i13, i14, 8, f29, f29, f29), c28655q, ((i18 >> 9) & 14) | 64);
                c28655q.m87173q(false);
            } else if (interfaceC15367i1 instanceof C37883e) {
                c28655q.m87150e0(373391471);
                float f34 = 8;
                float f35 = 0;
                AbstractC31375j.m96485a((C37883e) interfaceC15367i1, m100076j(z13, i13, i14, f34, f34, f35, f35), c28655q, 8);
                c28655q.m87173q(false);
            } else if (interfaceC15367i1 instanceof C37874b) {
                c28655q.m87150e0(373402372);
                float f36 = 8;
                float f37 = 0;
                AbstractC32398l.m100968a(m100076j(z13, i13, i14, f36, f36, f37, f37), c28655q, 0);
                c28655q.m87173q(false);
            } else if (interfaceC15367i1 instanceof C37885e1) {
                c28655q.m87150e0(373411977);
                C37885e1 c37885e1 = (C37885e1) interfaceC15367i1;
                float f38 = 0;
                AbstractC32069a.m99664b(c37885e1, m100076j(z13, i13, i14, c37885e1.f162230d, 8, f38, f38), c28655q, 8);
                c28655q.m87173q(false);
            } else if (interfaceC15367i1 instanceof C37936x) {
                c28655q.m87150e0(373424078);
                float f39 = 8;
                float f43 = 0;
                int i19 = i18 >> 9;
                AbstractC31780b.m98681b(z4, ((C37936x) interfaceC15367i1).f162403b, set, identifierSpec, m100076j(z13, i13, i14, f39, f39, f43, f43), c28655q, (i19 & 14) | 64 | (i19 & 896) | (IdentifierSpec.$stable << 9) | (i19 & 7168));
                c28655q.m87173q(false);
            } else if (interfaceC15367i1 instanceof C37901k) {
                c28655q.m87150e0(373439742);
                float f44 = 8;
                float f45 = 0;
                AbstractC31479j.m96922a(z4, (C37901k) interfaceC15367i1, identifierSpec, m100076j(z13, i13, i14, f44, f44, f45, f45), c28655q, ((i18 >> 9) & 14) | 64 | (IdentifierSpec.$stable << 6) | ((i18 >> 12) & 896));
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else if (interfaceC15367i1 instanceof C15399o1) {
                c28655q.m87150e0(373452570);
                AbstractC11894a.m31958g(z4, (C15399o1) interfaceC15367i1, null, null, null, 0.0f, 0.0f, null, null, 0.0f, null, c28655q, ((i18 >> 9) & 14) | 64, 0, 2044);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else if (interfaceC15367i1 instanceof AbstractC37891g1) {
                c28655q.m87150e0(373455002);
                int i24 = i18 >> 12;
                ((AbstractC37891g1) interfaceC15367i1).mo82070g(z4, set, identifierSpec, c28655q, ((i18 >> 9) & 14) | (i24 & 112) | (IdentifierSpec.$stable << 6) | (i24 & 896) | 4096);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1307731290);
                c28655q.m87173q(false);
            }
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: u30.d
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    AbstractC32131l.m100071c(interfaceC15367i1, i13, i14, z4, z13, set, identifierSpec, (Composer) obj, AbstractC28683x.m87244L(i15 | 1));
                    return C23454a0.f92919a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0036  */
    /* JADX INFO: renamed from: d */
    public static final boolean m100072d(C35459c0 c35459c0) {
        C37718g0 c37718g0;
        boolean z4;
        C0307l0 c0307l0 = c35459c0.f150995l0;
        if (c0307l0 != null && (c37718g0 = c0307l0.f1058w) != null && c37718g0.f161634h0.contains("INSTANT_DEBITS")) {
            C16689l1 c16689l1 = c35459c0.f150997x;
            boolean z13 = c16689l1.f64191y != EnumC16683k1.f64150x;
            if (c16689l1.f64186E) {
                C16671i1 c16671i1 = c35459c0.f150968K;
                String str = c16671i1 != null ? c16671i1.f64115x : null;
                if (str == null || AbstractC39414r.m125890i0(str)) {
                    z4 = false;
                } else {
                    z4 = true;
                }
            } else {
                z4 = false;
            }
            if (z13 || z4) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static int m100073e(Context context, String str) {
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strPermissionToOp = AppOpsManagerCompat.permissionToOp(str);
            if (strPermissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                if (((Process.myUid() == iMyUid && Objects.equals(context.getPackageName(), packageName)) ? AppOpsManagerCompat.checkOrNoteProxyOp(context, iMyUid, strPermissionToOp, packageName) : AppOpsManagerCompat.noteProxyOpNoThrow(context, strPermissionToOp, packageName)) != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    /* JADX INFO: renamed from: h */
    public static void m100074h(InterfaceC38034f interfaceC38034f) {
        interfaceC38034f.dispose();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: i */
    public static final C34785f m100075i(C2817b c2817b) {
        Object objM107888l;
        Object objM107888l2;
        Object objM107888l3;
        Object objM107888l4;
        C29662f c29662f = new C29662f(17, false);
        while (true) {
            C2817b c2817bM8017t = c2817b.m8017t();
            if (c2817bM8017t == null) {
                if (((String) c29662f.f121230x) == null) {
                    c29662f.f121230x = "";
                }
                if (((C34913b) c29662f.f121231y) == null) {
                    C33647p c33647p = C34913b.f147015x;
                    c29662f.f121231y = C33647p.m106271n(0, 0L);
                }
                if (((String) c29662f.f121232z) == null) {
                    c29662f.f121232z = "";
                }
                if (((String) c29662f.f121228E) == null) {
                    c29662f.f121228E = "";
                }
                return new C34785f(c29662f);
            }
            String strM8014q = c2817bM8017t.m8014q();
            switch (strM8014q.hashCode()) {
                case -532231901:
                    if (strM8014q.equals("SessionToken")) {
                        try {
                            objM107888l = AbstractC35903f.m114017l(c2817bM8017t);
                        } catch (Throwable th3) {
                            objM107888l = AbstractC34132o.m107888l(th3);
                        }
                        Throwable thM68037a = C23468n.m68037a(objM107888l);
                        if (thM68037a != null) {
                            objM107888l = AbstractC33745d.m106662u("expected (string: `com.amazonaws.sts#tokenType`)", thM68037a);
                        }
                        AbstractC34132o.m107864I(objM107888l);
                        c29662f.f121228E = (String) objM107888l;
                        break;
                    }
                    break;
                case 616582326:
                    if (strM8014q.equals("AccessKeyId")) {
                        try {
                            objM107888l2 = AbstractC35903f.m114017l(c2817bM8017t);
                        } catch (Throwable th4) {
                            objM107888l2 = AbstractC34132o.m107888l(th4);
                        }
                        Throwable thM68037a2 = C23468n.m68037a(objM107888l2);
                        if (thM68037a2 != null) {
                            objM107888l2 = AbstractC33745d.m106662u("expected (string: `com.amazonaws.sts#accessKeyIdType`)", thM68037a2);
                        }
                        AbstractC34132o.m107864I(objM107888l2);
                        c29662f.f121230x = (String) objM107888l2;
                        break;
                    }
                    break;
                case 1155999439:
                    if (strM8014q.equals("Expiration")) {
                        try {
                            objM107888l3 = AbstractC35903f.m114017l(c2817bM8017t);
                        } catch (Throwable th5) {
                            objM107888l3 = AbstractC34132o.m107888l(th5);
                        }
                        EnumC34931t enumC34931t = EnumC34931t.f147048w;
                        if (!(objM107888l3 instanceof C23467m)) {
                            try {
                                C33647p c33647p2 = C34913b.f147015x;
                                objM107888l3 = C33647p.m106272p((String) objM107888l3);
                            } catch (Throwable th6) {
                                objM107888l3 = AbstractC34132o.m107888l(th6);
                            }
                        }
                        Throwable thM68037a3 = C23468n.m68037a(objM107888l3);
                        if (thM68037a3 != null) {
                            objM107888l3 = AbstractC33745d.m106662u("expected (timestamp: `com.amazonaws.sts#dateType`)", thM68037a3);
                        }
                        AbstractC34132o.m107864I(objM107888l3);
                        c29662f.f121231y = (C34913b) objM107888l3;
                        break;
                    }
                    break;
                case 1364055403:
                    if (strM8014q.equals("SecretAccessKey")) {
                        try {
                            objM107888l4 = AbstractC35903f.m114017l(c2817bM8017t);
                        } catch (Throwable th7) {
                            objM107888l4 = AbstractC34132o.m107888l(th7);
                        }
                        Throwable thM68037a4 = C23468n.m68037a(objM107888l4);
                        if (thM68037a4 != null) {
                            objM107888l4 = AbstractC33745d.m106662u("expected (string: `com.amazonaws.sts#accessKeySecretType`)", thM68037a4);
                        }
                        AbstractC34132o.m107864I(objM107888l4);
                        c29662f.f121232z = (String) objM107888l4;
                        break;
                    }
                    break;
            }
            c2817bM8017t.m8009j();
        }
    }

    /* JADX INFO: renamed from: j */
    public static final Modifier m100076j(boolean z4, int i13, int i14, float f13, float f14, float f15, float f16) {
        C2314t c2314t = C2314t.f9131w;
        if (z4 || i14 == 0) {
            float f17 = 0;
            return AbstractC1099a.m3397s(c2314t, f15, f17, f16, f17);
        }
        if (i13 == 0) {
            return AbstractC1099a.m3397s(c2314t, f15, 0, f16, f14);
        }
        return i13 == i14 ? AbstractC1099a.m3397s(c2314t, f15, f13, f16, 0) : AbstractC1099a.m3397s(c2314t, f15, f13, f16, f14);
    }

    /* JADX INFO: renamed from: r */
    public static C18715c m100077r(InterfaceC37368j interfaceC37368j, boolean z4) {
        C24148c c24148c = z4 ? null : C26857h.f107175c;
        C13117a c13117a = new C13117a(10);
        C18715c c18715cM80180f0 = null;
        int i13 = 0;
        while (true) {
            try {
                interfaceC37368j.mo3103p(c13117a.f45381a, 0, 10);
                c13117a.m36689K(0);
                if (c13117a.m36679A() != 4801587) {
                    break;
                }
                c13117a.m36690L(3);
                int iM36713w = c13117a.m36713w();
                int i14 = iM36713w + 10;
                if (c18715cM80180f0 == null) {
                    byte[] bArr = new byte[i14];
                    System.arraycopy(c13117a.f45381a, 0, bArr, 0, 10);
                    interfaceC37368j.mo3103p(bArr, 10, iM36713w);
                    c18715cM80180f0 = new C26857h(c24148c).m80180f0(i14, bArr);
                } else {
                    interfaceC37368j.mo3096i(iM36713w);
                }
                i13 += i14;
            } catch (EOFException unused) {
            }
        }
        interfaceC37368j.mo3093e();
        interfaceC37368j.mo3096i(i13);
        if (c18715cM80180f0 == null || c18715cM80180f0.f73525w.length == 0) {
            return null;
        }
        return c18715cM80180f0;
    }

    /* JADX INFO: renamed from: s */
    public static C32800q m100078s(C13117a c13117a) {
        c13117a.m36690L(1);
        int iM36679A = c13117a.m36679A();
        long j7 = ((long) c13117a.f45382b) + ((long) iM36679A);
        int i13 = iM36679A / 18;
        long[] jArrCopyOf = new long[i13];
        long[] jArrCopyOf2 = new long[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            long jM36706p = c13117a.m36706p();
            if (jM36706p == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i14);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i14);
                break;
            }
            jArrCopyOf[i14] = jM36706p;
            jArrCopyOf2[i14] = c13117a.m36706p();
            c13117a.m36690L(2);
        }
        c13117a.m36690L((int) (j7 - ((long) c13117a.f45382b)));
        return new C32800q(jArrCopyOf, jArrCopyOf2);
    }

    /* JADX INFO: renamed from: u */
    public static final C33326g m100079u(C33326g c33326g, C33321b c33321b) {
        AbstractC22676k.m65750j(c33326g, "<this>");
        return C33326g.m105694b(c33326g, false, c33321b, 3);
    }

    /* JADX INFO: renamed from: f */
    public abstract int mo72284f(View view, int i13);

    /* JADX INFO: renamed from: g */
    public abstract int mo72285g(View view, int i13);

    /* JADX INFO: renamed from: k */
    public int mo72286k(View view) {
        return 0;
    }

    /* JADX INFO: renamed from: l */
    public int mo72287l() {
        return 0;
    }

    /* JADX INFO: renamed from: n */
    public void mo81151n(View view, int i13) {
    }

    /* JADX INFO: renamed from: o */
    public abstract void mo72288o(int i13);

    /* JADX INFO: renamed from: p */
    public abstract void mo72289p(View view, int i13, int i14);

    /* JADX INFO: renamed from: q */
    public abstract void mo72290q(View view, float f13, float f14);

    /* JADX INFO: renamed from: t */
    public abstract boolean mo72291t(View view, int i13);
}
