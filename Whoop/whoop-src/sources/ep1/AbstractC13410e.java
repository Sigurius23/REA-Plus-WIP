package ep1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.core.app.NotificationCompat;
import az1.C2161b;
import bf0.C3195g;
import c31.AbstractC3926j;
import c31.C3927k;
import c31.EnumC3919c;
import c31.EnumC3920d;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import cp1.C11016c;
import gb1.AbstractC15673b0;
import gz0.EnumC16313m0;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27282u;
import ny0.EnumC27284v;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: ep1.e */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\u000b\u001a\u00020\t2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u000e\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lcp1/c;", NotificationCompat.CATEGORY_PROGRESS, "Lcom/whoop/design/util/TextResource;", "buttonText", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "Lkotlin/Function0;", "Ll83/a0;", "onClick", "c", "(Lcp1/c;Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;ZLc93/a;Landroidx/compose/runtime/Composer;II)V", "Lc31/k;", "f", "(Lcp1/c;Z)Lc31/k;", "hormonal-insights_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13410e {
    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0072  */
    /* JADX WARN: Code duplicated, block: B:40:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x007e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0081  */
    /* JADX WARN: Code duplicated, block: B:47:0x008a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0090  */
    /* JADX WARN: Code duplicated, block: B:50:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x009c  */
    /* JADX WARN: Code duplicated, block: B:55:0x009e  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:73:0x0101  */
    /* JADX WARN: Code duplicated, block: B:76:0x0113  */
    /* JADX WARN: Code duplicated, block: B:77:0x0115  */
    /* JADX WARN: Code duplicated, block: B:80:0x011c  */
    /* JADX WARN: Code duplicated, block: B:82:0x0120  */
    /* JADX WARN: Code duplicated, block: B:84:0x013a  */
    /* JADX WARN: Code duplicated, block: B:86:0x0179  */
    /* JADX WARN: Code duplicated, block: B:89:0x0184  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static final void m37926c(C11016c c11016c, TextResource buttonText, Modifier modifier, boolean z4, InterfaceC4339a onClick, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        boolean z13;
        int i17;
        boolean z14;
        Modifier modifier3;
        boolean z15;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        boolean z16;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z17;
        Object objM87133R;
        int i18;
        AbstractC22676k.m65750j(buttonText, "buttonText");
        AbstractC22676k.m65750j(onClick, "onClick");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(835654093);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(c11016c) : c28655q.m87157i(c11016c) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(buttonText) : c28655q.m87157i(buttonText) ? 32 : 16;
        }
        int i19 = i14 & 4;
        if (i19 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    z13 = z4;
                    if (c28655q.m87155h(z13)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                if ((i13 & 24576) == 0) {
                    if (c28655q.m87157i(onClick)) {
                        i18 = 16384;
                    } else {
                        i18 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i18;
                }
                if ((i15 & 9363) != 9362) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    if (i19 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i16 != 0) {
                        z16 = true;
                    } else {
                        z16 = z13;
                    }
                    if (c11016c != null) {
                        c28655q.m87150e0(1340842851);
                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier4);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                        C3927k c3927kM37929f = m37929f(c11016c, z16);
                        if ((i15 & 57344) == 16384) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R = c28655q.m87133R();
                        if (z17 || objM87133R == C28635l.f115821a) {
                            objM87133R = new C2161b(onClick, 19);
                            c28655q.m87172p0(objM87133R);
                        }
                        AbstractC3926j.m11931e(c3927kM37929f, (Function1) objM87133R, c28655q, C3927k.f16020r, 0);
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                        modifier3 = modifier4;
                    } else {
                        c28655q.m87150e0(1341007492);
                        int i24 = ((i15 >> 6) & 14) | 48 | (i15 & 7168) | ((i15 << 9) & 29360128);
                        modifier3 = modifier4;
                        AbstractC27282u.m82292h(modifier3, EnumC27284v.TextLarge, AbstractC8693b.m21274h(buttonText, c28655q, TextResource.$stable | ((i15 >> 3) & 14)), z16, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getSleepLightSleep(), null, false, onClick, c28655q, i24, 96);
                        c28655q.m87173q(false);
                    }
                    z15 = z16;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    z15 = z13;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3195g(c11016c, buttonText, modifier3, z15, onClick, i13, i14, 6);
                }
            }
            i15 |= 3072;
            z13 = z4;
            if ((i13 & 24576) == 0) {
                if (c28655q.m87157i(onClick)) {
                    i18 = 16384;
                } else {
                    i18 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i18;
            }
            if ((i15 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i19 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i16 != 0) {
                    z16 = true;
                } else {
                    z16 = z13;
                }
                if (c11016c != null) {
                    c28655q.m87150e0(1340842851);
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifier4);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                    C3927k c3927kM37929f2 = m37929f(c11016c, z16);
                    if ((i15 & 57344) == 16384) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z17) {
                        objM87133R = new C2161b(onClick, 19);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C2161b(onClick, 19);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC3926j.m11931e(c3927kM37929f2, (Function1) objM87133R, c28655q, C3927k.f16020r, 0);
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                    modifier3 = modifier4;
                } else {
                    c28655q.m87150e0(1341007492);
                    int i25 = ((i15 >> 6) & 14) | 48 | (i15 & 7168) | ((i15 << 9) & 29360128);
                    modifier3 = modifier4;
                    AbstractC27282u.m82292h(modifier3, EnumC27284v.TextLarge, AbstractC8693b.m21274h(buttonText, c28655q, TextResource.$stable | ((i15 >> 3) & 14)), z16, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getSleepLightSleep(), null, false, onClick, c28655q, i25, 96);
                    c28655q.m87173q(false);
                }
                z15 = z16;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3195g(c11016c, buttonText, modifier3, z15, onClick, i13, i14, 6);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                z13 = z4;
                if (c28655q.m87155h(z13)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q.m87157i(onClick)) {
                    i18 = 16384;
                } else {
                    i18 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i18;
            }
            if ((i15 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i19 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i16 != 0) {
                    z16 = true;
                } else {
                    z16 = z13;
                }
                if (c11016c != null) {
                    c28655q.m87150e0(1340842851);
                    InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifier4);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d3);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                    C3927k c3927kM37929f3 = m37929f(c11016c, z16);
                    if ((i15 & 57344) == 16384) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z17) {
                        objM87133R = new C2161b(onClick, 19);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C2161b(onClick, 19);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC3926j.m11931e(c3927kM37929f3, (Function1) objM87133R, c28655q, C3927k.f16020r, 0);
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                    modifier3 = modifier4;
                } else {
                    c28655q.m87150e0(1341007492);
                    int i26 = ((i15 >> 6) & 14) | 48 | (i15 & 7168) | ((i15 << 9) & 29360128);
                    modifier3 = modifier4;
                    AbstractC27282u.m82292h(modifier3, EnumC27284v.TextLarge, AbstractC8693b.m21274h(buttonText, c28655q, TextResource.$stable | ((i15 >> 3) & 14)), z16, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getSleepLightSleep(), null, false, onClick, c28655q, i26, 96);
                    c28655q.m87173q(false);
                }
                z15 = z16;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3195g(c11016c, buttonText, modifier3, z15, onClick, i13, i14, 6);
            }
        }
        i15 |= 3072;
        z13 = z4;
        if ((i13 & 24576) == 0) {
            if (c28655q.m87157i(onClick)) {
                i18 = 16384;
            } else {
                i18 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i18;
        }
        if ((i15 & 9363) != 9362) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i15 & 1, z14)) {
            if (i19 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            if (i16 != 0) {
                z16 = true;
            } else {
                z16 = z13;
            }
            if (c11016c != null) {
                c28655q.m87150e0(1340842851);
                InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifier4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d4);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
                C3927k c3927kM37929f4 = m37929f(c11016c, z16);
                if ((i15 & 57344) == 16384) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z17) {
                    objM87133R = new C2161b(onClick, 19);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C2161b(onClick, 19);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC3926j.m11931e(c3927kM37929f4, (Function1) objM87133R, c28655q, C3927k.f16020r, 0);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
                modifier3 = modifier4;
            } else {
                c28655q.m87150e0(1341007492);
                int i27 = ((i15 >> 6) & 14) | 48 | (i15 & 7168) | ((i15 << 9) & 29360128);
                modifier3 = modifier4;
                AbstractC27282u.m82292h(modifier3, EnumC27284v.TextLarge, AbstractC8693b.m21274h(buttonText, c28655q, TextResource.$stable | ((i15 >> 3) & 14)), z16, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getSleepLightSleep(), null, false, onClick, c28655q, i27, 96);
                c28655q.m87173q(false);
            }
            z15 = z16;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            z15 = z13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3195g(c11016c, buttonText, modifier3, z15, onClick, i13, i14, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m37927d(InterfaceC4339a interfaceC4339a, EnumC3919c it) {
        AbstractC22676k.m65750j(it, "it");
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m37928e(C11016c c11016c, TextResource textResource, Modifier modifier, boolean z4, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m37926c(c11016c, textResource, modifier, z4, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: f */
    private static final C3927k m37929f(C11016c c11016c, boolean z4) {
        if (!c11016c.m29575d()) {
            return new C3927k(EnumC3920d.PROGRESS, c11016c.getText(), null, null, null, null, c11016c.getMaxScreenCount(), c11016c.getScreenCount(), null, z4, false, null, AbstractC15673b0.m43985G0(), null, null, null, null, 126268, null);
        }
        return new C3927k(EnumC3920d.FILLED, c11016c.getText(), null, null, null, EnumC16313m0.CHECKMARK, 0, 0, null, z4, false, EnumC39333f.ACCENT_POSITIVE_TREND, null, EnumC39333f.BRAND_BLACK, null, null, null, 120284, null);
    }
}
