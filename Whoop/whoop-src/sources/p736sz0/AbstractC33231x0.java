package p736sz0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.C1104b;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.layout.AbstractC1131a;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4353o;
import f31.AbstractC14046c;
import f31.C14044a;
import h02.C16561a0;
import hy0.AbstractC17722a1;
import java.util.List;
import kd1.C22411w;
import l83.C23454a0;
import m83.AbstractC25265s;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p088dc.AbstractC11895b;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.C22961h;
import p390p1.AbstractC28683x;
import p390p1.C28621h1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28593a1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p411q2.InterfaceC29805a;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p635y2.InterfaceC39147y;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q12.C29802c;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: sz0.x0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aO\u0010\f\u001a\u00020\n2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010²\u0006\u000e\u0010\u000e\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000f\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"", "Lsz0/u0;", "options", "", "initialSelectedIndex", "Landroidx/compose/ui/Modifier;", "modifier", "", "testTag", "Lkotlin/Function1;", "Ll83/a0;", "onSelected", "e", "(Ljava/util/List;ILandroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "selectedIndex", "minHeight", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33231x0 {
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a  */
    /* JADX WARN: Code duplicated, block: B:57:0x009d  */
    /* JADX WARN: Code duplicated, block: B:58:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:66:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:73:0x0123  */
    /* JADX WARN: Code duplicated, block: B:74:0x0127  */
    /* JADX WARN: Code duplicated, block: B:77:0x013a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0148  */
    /* JADX WARN: Code duplicated, block: B:82:0x0156  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public static final void m105420e(final List<C33223u0> options, int i13, Modifier modifier, String str, final Function1 onSelected, Composer composer, int i14, int i15) {
        int i16;
        Modifier modifier2;
        int i17;
        String str2;
        int i18;
        boolean z4;
        C28655q c28655q;
        String str3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier3;
        String str4;
        boolean z13;
        Object objM87133R;
        C28676v0 c28676v0;
        Modifier modifierM3599a;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Object objM87133R2;
        int i19;
        AbstractC22676k.m65750j(options, "options");
        AbstractC22676k.m65750j(onSelected, "onSelected");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-126285669);
        if ((i14 & 6) == 0) {
            i16 = (c28655q2.m87157i(options) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= c28655q2.m87149e(i13) ? 32 : 16;
        }
        int i24 = i15 & 4;
        if (i24 == 0) {
            if ((i14 & 384) == 0) {
                modifier2 = modifier;
                i16 |= c28655q2.m87153g(modifier2) ? 256 : 128;
            }
            i17 = i15 & 8;
            if (i17 != 0) {
                if ((i14 & 3072) == 0) {
                    str2 = str;
                    if (c28655q2.m87153g(str2)) {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i16 |= i18;
                }
                if ((i14 & 24576) == 0) {
                    if (c28655q2.m87157i(onSelected)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i16 |= i19;
                }
                if ((i16 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i16 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i24 != 0) {
                        modifier3 = c2314t;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i17 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    final InterfaceC29805a interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                    final float size = 1.0f / options.size();
                    if ((i16 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = c28655q2.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (z13 || objM87133R == c28676v0) {
                        objM87133R = AbstractC31061c.m95646v(i13, c28655q2);
                    }
                    final InterfaceC28593a1 interfaceC28593a1 = (InterfaceC28593a1) objM87133R;
                    Modifier modifierM3394p = AbstractC1099a.m3394p(((float) 0.5d) * 8, AbstractC1092a.m3358c(AbstractC1102d.m3409f(1.0f, c2314t), C38072d.f163053a.m121949b(c28655q2, 6).getBlack30(), C22411w.f87680a.m64535a().m64090c()));
                    if (str4 == null) {
                        modifierM3599a = modifier3;
                    } else {
                        modifierM3599a = AbstractC1136a.m3599a(modifier3, str4);
                    }
                    Modifier modifierMo3471e = modifierM3394p.mo3471e(modifierM3599a);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierMo3471e);
                    InterfaceC0221l.f734a.getClass();
                    final String str5 = str4;
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC11895b.m32005x(0, c28655q2);
                    }
                    final InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    List listM74093D1 = AbstractC25265s.m74093D1(AbstractC37056f.m118950B(options));
                    Integer numValueOf = Integer.valueOf(m105421f(interfaceC28593a1));
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                    C22961h c22961h = AbstractC22977m.f90654e;
                    C2306l c2306l = C2299e.f9108K;
                    C37816b c37816bM121344e = AbstractC37817c.m121344e(56018977, c28655q2, new InterfaceC4353o() { // from class: sz0.v0
                        @Override // c93.InterfaceC4353o
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                            int iIntValue = ((Integer) obj5).intValue();
                            return AbstractC33231x0.m105425j(size, str5, options, interfaceC29805a, interfaceC28593a1, onSelected, interfaceC28601c1, (InterfaceC1103a) obj, ((Integer) obj2).intValue(), (C14044a) obj3, (Composer) obj4, iIntValue);
                        }
                    });
                    modifier2 = modifier3;
                    AbstractC14046c.m39965e(listM74093D1, numValueOf, modifierM3409f, c22961h, c2306l, c37816bM121344e, c28655q2, 224640, 0);
                    c28655q = c28655q2;
                    c28655q.m87173q(true);
                    str3 = str5;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    str3 = str2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C33229w0(i13, i14, i15, modifier2, str3, options, onSelected);
                }
            }
            i16 |= 3072;
            str2 = str;
            if ((i14 & 24576) == 0) {
                if (c28655q2.m87157i(onSelected)) {
                    i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i16 |= i19;
            }
            if ((i16 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i16 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i24 != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier2;
                }
                if (i17 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                final InterfaceC29805a interfaceC29805a2 = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                final float size2 = 1.0f / options.size();
                if ((i16 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                if (z13) {
                    objM87133R = AbstractC31061c.m95646v(i13, c28655q2);
                } else {
                    objM87133R = AbstractC31061c.m95646v(i13, c28655q2);
                }
                final InterfaceC28593a1 interfaceC28593a2 = (InterfaceC28593a1) objM87133R;
                Modifier modifierM3394p2 = AbstractC1099a.m3394p(((float) 0.5d) * 8, AbstractC1092a.m3358c(AbstractC1102d.m3409f(1.0f, c2314t), C38072d.f163053a.m121949b(c28655q2, 6).getBlack30(), C22411w.f87680a.m64535a().m64090c()));
                if (str4 == null) {
                    modifierM3599a = modifier3;
                } else {
                    modifierM3599a = AbstractC1136a.m3599a(modifier3, str4);
                }
                Modifier modifierMo3471e2 = modifierM3394p2.mo3471e(modifierM3599a);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e2);
                InterfaceC0221l.f734a.getClass();
                final String str6 = str4;
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC11895b.m32005x(0, c28655q2);
                }
                final InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                List listM74093D2 = AbstractC25265s.m74093D1(AbstractC37056f.m118950B(options));
                Integer numValueOf2 = Integer.valueOf(m105421f(interfaceC28593a2));
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                C22961h c22961h2 = AbstractC22977m.f90654e;
                C2306l c2306l2 = C2299e.f9108K;
                C37816b c37816bM121344e2 = AbstractC37817c.m121344e(56018977, c28655q2, new InterfaceC4353o() { // from class: sz0.v0
                    @Override // c93.InterfaceC4353o
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                        int iIntValue = ((Integer) obj5).intValue();
                        return AbstractC33231x0.m105425j(size2, str6, options, interfaceC29805a2, interfaceC28593a2, onSelected, interfaceC28601c2, (InterfaceC1103a) obj, ((Integer) obj2).intValue(), (C14044a) obj3, (Composer) obj4, iIntValue);
                    }
                });
                modifier2 = modifier3;
                AbstractC14046c.m39965e(listM74093D2, numValueOf2, modifierM3409f2, c22961h2, c2306l2, c37816bM121344e2, c28655q2, 224640, 0);
                c28655q = c28655q2;
                c28655q.m87173q(true);
                str3 = str6;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                str3 = str2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C33229w0(i13, i14, i15, modifier2, str3, options, onSelected);
            }
        }
        i16 |= 384;
        modifier2 = modifier;
        i17 = i15 & 8;
        if (i17 != 0) {
            if ((i14 & 3072) == 0) {
                str2 = str;
                if (c28655q2.m87153g(str2)) {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i16 |= i18;
            }
            if ((i14 & 24576) == 0) {
                if (c28655q2.m87157i(onSelected)) {
                    i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i16 |= i19;
            }
            if ((i16 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i16 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i24 != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier2;
                }
                if (i17 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                final InterfaceC29805a interfaceC29805a3 = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                final float size3 = 1.0f / options.size();
                if ((i16 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                if (z13) {
                    objM87133R = AbstractC31061c.m95646v(i13, c28655q2);
                } else {
                    objM87133R = AbstractC31061c.m95646v(i13, c28655q2);
                }
                final InterfaceC28593a1 interfaceC28593a3 = (InterfaceC28593a1) objM87133R;
                Modifier modifierM3394p3 = AbstractC1099a.m3394p(((float) 0.5d) * 8, AbstractC1092a.m3358c(AbstractC1102d.m3409f(1.0f, c2314t), C38072d.f163053a.m121949b(c28655q2, 6).getBlack30(), C22411w.f87680a.m64535a().m64090c()));
                if (str4 == null) {
                    modifierM3599a = modifier3;
                } else {
                    modifierM3599a = AbstractC1136a.m3599a(modifier3, str4);
                }
                Modifier modifierMo3471e3 = modifierM3394p3.mo3471e(modifierM3599a);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e3);
                InterfaceC0221l.f734a.getClass();
                final String str7 = str4;
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N3);
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC11895b.m32005x(0, c28655q2);
                }
                final InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) objM87133R2;
                List listM74093D3 = AbstractC25265s.m74093D1(AbstractC37056f.m118950B(options));
                Integer numValueOf3 = Integer.valueOf(m105421f(interfaceC28593a3));
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
                C22961h c22961h3 = AbstractC22977m.f90654e;
                C2306l c2306l3 = C2299e.f9108K;
                C37816b c37816bM121344e3 = AbstractC37817c.m121344e(56018977, c28655q2, new InterfaceC4353o() { // from class: sz0.v0
                    @Override // c93.InterfaceC4353o
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                        int iIntValue = ((Integer) obj5).intValue();
                        return AbstractC33231x0.m105425j(size3, str7, options, interfaceC29805a3, interfaceC28593a3, onSelected, interfaceC28601c3, (InterfaceC1103a) obj, ((Integer) obj2).intValue(), (C14044a) obj3, (Composer) obj4, iIntValue);
                    }
                });
                modifier2 = modifier3;
                AbstractC14046c.m39965e(listM74093D3, numValueOf3, modifierM3409f3, c22961h3, c2306l3, c37816bM121344e3, c28655q2, 224640, 0);
                c28655q = c28655q2;
                c28655q.m87173q(true);
                str3 = str7;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                str3 = str2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C33229w0(i13, i14, i15, modifier2, str3, options, onSelected);
            }
        }
        i16 |= 3072;
        str2 = str;
        if ((i14 & 24576) == 0) {
            if (c28655q2.m87157i(onSelected)) {
                i19 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i19 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i16 |= i19;
        }
        if ((i16 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i16 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i24 != 0) {
                modifier3 = c2314t;
            } else {
                modifier3 = modifier2;
            }
            if (i17 != 0) {
                str4 = null;
            } else {
                str4 = str2;
            }
            final InterfaceC29805a interfaceC29805a4 = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
            final float size4 = 1.0f / options.size();
            if ((i16 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R = c28655q2.m87133R();
            c28676v0 = C28635l.f115821a;
            if (z13) {
                objM87133R = AbstractC31061c.m95646v(i13, c28655q2);
            } else {
                objM87133R = AbstractC31061c.m95646v(i13, c28655q2);
            }
            final InterfaceC28593a1 interfaceC28593a4 = (InterfaceC28593a1) objM87133R;
            Modifier modifierM3394p4 = AbstractC1099a.m3394p(((float) 0.5d) * 8, AbstractC1092a.m3358c(AbstractC1102d.m3409f(1.0f, c2314t), C38072d.f163053a.m121949b(c28655q2, 6).getBlack30(), C22411w.f87680a.m64535a().m64090c()));
            if (str4 == null) {
                modifierM3599a = modifier3;
            } else {
                modifierM3599a = AbstractC1136a.m3599a(modifier3, str4);
            }
            Modifier modifierMo3471e4 = modifierM3394p4.mo3471e(modifierM3599a);
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e4);
            InterfaceC0221l.f734a.getClass();
            final String str8 = str4;
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N4);
            objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC11895b.m32005x(0, c28655q2);
            }
            final InterfaceC28601c1 interfaceC28601c4 = (InterfaceC28601c1) objM87133R2;
            List listM74093D4 = AbstractC25265s.m74093D1(AbstractC37056f.m118950B(options));
            Integer numValueOf4 = Integer.valueOf(m105421f(interfaceC28593a4));
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t);
            C22961h c22961h4 = AbstractC22977m.f90654e;
            C2306l c2306l4 = C2299e.f9108K;
            C37816b c37816bM121344e4 = AbstractC37817c.m121344e(56018977, c28655q2, new InterfaceC4353o() { // from class: sz0.v0
                @Override // c93.InterfaceC4353o
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    int iIntValue = ((Integer) obj5).intValue();
                    return AbstractC33231x0.m105425j(size4, str8, options, interfaceC29805a4, interfaceC28593a4, onSelected, interfaceC28601c4, (InterfaceC1103a) obj, ((Integer) obj2).intValue(), (C14044a) obj3, (Composer) obj4, iIntValue);
                }
            });
            modifier2 = modifier3;
            AbstractC14046c.m39965e(listM74093D4, numValueOf4, modifierM3409f4, c22961h4, c2306l4, c37816bM121344e4, c28655q2, 224640, 0);
            c28655q = c28655q2;
            c28655q.m87173q(true);
            str3 = str8;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            str3 = str2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33229w0(i13, i14, i15, modifier2, str3, options, onSelected);
        }
    }

    /* JADX INFO: renamed from: f */
    private static final int m105421f(InterfaceC28593a1 interfaceC28593a1) {
        return ((C28621h1) interfaceC28593a1).m87024x();
    }

    /* JADX INFO: renamed from: g */
    private static final void m105422g(InterfaceC28593a1 interfaceC28593a1, int i13) {
        ((C28621h1) interfaceC28593a1).m87025y(i13);
    }

    /* JADX INFO: renamed from: h */
    private static final int m105423h(InterfaceC28601c1 interfaceC28601c1) {
        return ((Number) interfaceC28601c1.getValue()).intValue();
    }

    /* JADX INFO: renamed from: i */
    private static final void m105424i(InterfaceC28601c1 interfaceC28601c1, int i13) {
        interfaceC28601c1.setValue(Integer.valueOf(i13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m105425j(float f13, String str, List list, InterfaceC29805a interfaceC29805a, InterfaceC28593a1 interfaceC28593a1, Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC1103a RadioGroup, int i13, C14044a state, Composer composer, int i14) {
        int i15;
        AbstractC22676k.m65750j(RadioGroup, "$this$RadioGroup");
        AbstractC22676k.m65750j(state, "state");
        if ((i14 & 6) == 0) {
            i15 = (((C28655q) composer).m87153g(RadioGroup) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= ((C28655q) composer).m87149e(i13) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= ((C28655q) composer).m87153g(state) ? 256 : 128;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i15 & 1, (i15 & 1171) != 1170)) {
            float fMo733e0 = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo733e0(m105423h(interfaceC28601c1));
            Modifier modifierM3599a = C2314t.f9131w;
            Modifier modifierM3432c = ((C1104b) RadioGroup).m3432c(f13, AbstractC1102d.m3405b(modifierM3599a, 0.0f, fMo733e0, 1));
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C29802c(11, interfaceC28601c1);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3500d = AbstractC1131a.m3500d(modifierM3432c, (Function1) objM87133R);
            if (str != null) {
                modifierM3599a = AbstractC1136a.m3599a(modifierM3599a, str + "_" + i13);
            }
            Modifier modifierMo3471e = modifierM3500d.mo3471e(modifierM3599a);
            String strM105400b = ((C33223u0) list.get(i13)).getText();
            String strM105399a = ((C33223u0) list.get(i13)).getSubText();
            boolean isSelected = state.getIsSelected();
            boolean zM87157i = c28655q.m87157i(interfaceC29805a) | c28655q.m87153g(interfaceC28593a1) | ((i15 & 112) == 32) | c28655q.m87153g(function1);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new C16561a0(interfaceC29805a, i13, function1, interfaceC28593a1);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC17722a1.m50718d(modifierMo3471e, strM105400b, strM105399a, isSelected, (InterfaceC4339a) objM87133R2, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m105426k(InterfaceC28601c1 interfaceC28601c1, InterfaceC39147y it) {
        AbstractC22676k.m65750j(it, "it");
        if (((int) (it.mo3541n() & 4294967295L)) > m105423h(interfaceC28601c1)) {
            m105424i(interfaceC28601c1, (int) (it.mo3541n() & 4294967295L));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m105427l(InterfaceC29805a interfaceC29805a, int i13, Function1 function1, InterfaceC28593a1 interfaceC28593a1) {
        interfaceC29805a.mo7428a(0);
        m105422g(interfaceC28593a1, i13);
        function1.invoke(Integer.valueOf(i13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m105428m(List list, int i13, Modifier modifier, String str, Function1 function1, int i14, int i15, Composer composer, int i16) {
        m105420e(list, i13, modifier, str, function1, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }
}
