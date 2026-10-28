package sy0;

import am2.C1017f0;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.selection.AbstractC1112d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2611r1;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15680h;
import gy0.AbstractC16277f;
import ih0.AbstractC18489d0;
import java.io.IOException;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.C22994r1;
import p319m4.AbstractC25012a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: sy0.p */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aQ\u0010\f\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\tH\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lcom/whoop/design/util/TextResource;", "text", "Lsy0/k;", "whoopCheckboxType", "", "initialToggle", "isEnabled", "Li2/x;", "toggledColor", "Lkotlin/Function1;", "Ll83/a0;", "onToggle", "c", "(Lcom/whoop/design/util/TextResource;Lsy0/k;ZZJLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33093p {
    /* JADX WARN: Code duplicated, block: B:100:0x014b  */
    /* JADX WARN: Code duplicated, block: B:102:0x014f  */
    /* JADX WARN: Code duplicated, block: B:105:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:106:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:109:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:111:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:114:0x020c  */
    /* JADX WARN: Code duplicated, block: B:115:0x021f  */
    /* JADX WARN: Code duplicated, block: B:117:0x0282  */
    /* JADX WARN: Code duplicated, block: B:120:0x028e  */
    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0069  */
    /* JADX WARN: Code duplicated, block: B:35:0x006e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x007a  */
    /* JADX WARN: Code duplicated, block: B:40:0x007d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0084  */
    /* JADX WARN: Code duplicated, block: B:46:0x0088  */
    /* JADX WARN: Code duplicated, block: B:48:0x0090  */
    /* JADX WARN: Code duplicated, block: B:49:0x0093  */
    /* JADX WARN: Code duplicated, block: B:52:0x0099  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00dd A[PHI: r0 r6 r10
      0x00dd: PHI (r0v27 int) = (r0v13 int), (r0v13 int), (r0v28 int) binds: [B:80:0x00e9, B:72:0x00d9, B:73:0x00db] A[DONT_GENERATE, DONT_INLINE]
      0x00dd: PHI (r6v17 boolean) = (r6v3 boolean), (r6v2 boolean), (r6v2 boolean) binds: [B:80:0x00e9, B:72:0x00d9, B:73:0x00db] A[DONT_GENERATE, DONT_INLINE]
      0x00dd: PHI (r10v15 boolean) = (r10v4 boolean), (r10v2 boolean), (r10v2 boolean) binds: [B:80:0x00e9, B:72:0x00d9, B:73:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x00e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:85:0x0109  */
    /* JADX WARN: Code duplicated, block: B:87:0x0117  */
    /* JADX WARN: Code duplicated, block: B:89:0x0126  */
    /* JADX WARN: Code duplicated, block: B:92:0x0138  */
    /* JADX WARN: Code duplicated, block: B:93:0x013a  */
    /* JADX WARN: Code duplicated, block: B:96:0x0141  */
    /* JADX WARN: Code duplicated, block: B:97:0x0143  */
    /* JADX INFO: renamed from: c */
    public static final void m104849c(TextResource text, AbstractC33088k whoopCheckboxType, boolean z4, boolean z13, long j7, Function1 onToggle, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        int i15;
        boolean z14;
        int i16;
        boolean z15;
        int i17;
        long j13;
        boolean z16;
        boolean z17;
        boolean z18;
        long j14;
        C28677v1 c28677v1M87180u;
        long jM125430y;
        boolean z19;
        long jM95628d;
        long jM95624D;
        boolean z24;
        boolean z25;
        boolean z26;
        Object objM87133R;
        boolean z27;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C38072d c38072d;
        long jM125426w;
        int i18;
        int i19;
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(whoopCheckboxType, "whoopCheckboxType");
        AbstractC22676k.m65750j(onToggle, "onToggle");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1146862186);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(text) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(whoopCheckboxType) : c28655q.m87157i(whoopCheckboxType) ? 32 : 16;
        }
        int i24 = i14 & 4;
        if (i24 == 0) {
            if ((i13 & 384) == 0) {
                z14 = z4;
                i15 |= c28655q.m87155h(z14) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    z15 = z13;
                    if (c28655q.m87155h(z15)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                if ((i13 & 24576) == 0) {
                    if ((i14 & 16) == 0) {
                        j13 = j7;
                        if (c28655q.m87151f(j13)) {
                            i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                        }
                        i15 |= i19;
                    } else {
                        j13 = j7;
                    }
                    i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    i15 |= i19;
                } else {
                    j13 = j7;
                }
                if ((196608 & i13) == 0) {
                    if (c28655q.m87157i(onToggle)) {
                        i18 = 131072;
                    } else {
                        i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i18;
                }
                if ((74899 & i15) != 74898) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q.m87135U(i15 & 1, z16)) {
                    c28655q.m87140Z();
                    if ((i13 & 1) != 0 || c28655q.m87118C()) {
                        if (i24 != 0) {
                            z14 = false;
                        }
                        if (i16 != 0) {
                            z15 = true;
                        }
                        if ((i14 & 16) != 0) {
                            jM125430y = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                            i15 &= -57345;
                            z19 = z15;
                        }
                        c28655q.m87175r();
                        if (z14) {
                            c28655q.m87150e0(-1672024874);
                            c28655q.m87173q(false);
                            jM95628d = jM125430y;
                        } else {
                            c28655q.m87150e0(-1672023727);
                            jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
                        }
                        if (z14) {
                            c28655q.m87150e0(-1672021804);
                            jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, 6, false);
                        } else {
                            c28655q.m87150e0(-1672020716);
                            jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                        }
                        long j15 = jM95624D;
                        if ((458752 & i15) == 131072) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        if ((i15 & 896) == 256) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        z26 = z24 | z25;
                        objM87133R = c28655q.m87133R();
                        if (z26 || objM87133R == C28635l.f115821a) {
                            objM87133R = new C1017f0(onToggle, z14, 6);
                            c28655q.m87172p0(objM87133R);
                        }
                        C2314t c2314t = C2314t.f9131w;
                        z27 = z14;
                        boolean z28 = z19;
                        Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC15680h.m44112a(AbstractC1102d.m3428y(AbstractC1112d.m3448b(c2314t, z27, z19, null, (Function1) objM87133R, 12), null, false, 3), z28), jM95628d, AbstractC17918w0.f69621a);
                        float f13 = 4;
                        Modifier modifierM53364e = AbstractC18489d0.m53364e(AbstractC1099a.m3394p(((float) 2.5d) * 8, modifierM3358c), 1, f13);
                        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM53364e);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        int i25 = i15;
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                        c38072d = C38072d.f163053a;
                        C27430e c27430eM107874S = AbstractC34132o.m107874S(c38072d.m121951d().getAction().getCheckMark(), c28655q, 6);
                        String strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62249J);
                        Modifier modifierM3419p = AbstractC1102d.m3419p(5 * f13, c2314t);
                        if (z27) {
                            c28655q.m87150e0(76523928);
                            jM125426w = c38072d.m121949b(c28655q, 6).getBrandBlack();
                            c28655q.m87173q(false);
                        } else {
                            long jM73366B = AbstractC25012a.m73366B(c28655q, 76525016, c38072d, c28655q, 6);
                            c28655q.m87173q(false);
                            jM125426w = jM73366B;
                        }
                        AbstractC15005f3.m43108b(c27430eM107874S, strM92103Y, modifierM3419p, jM125426w, c28655q, 384, 0);
                        AbstractC18489d0.m53380u(f13, f13, c2314t, c28655q);
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(text, c28655q, i25 & 14), null, j15, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, whoopCheckboxType.getStyle(), null, c28655q, 0, 0, 196602);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        j14 = jM125430y;
                        z17 = z27;
                        z18 = z28;
                    } else {
                        c28655q.m87138X();
                        if ((i14 & 16) != 0) {
                            i15 &= -57345;
                        }
                    }
                    z19 = z15;
                    jM125430y = j13;
                    c28655q.m87175r();
                    if (z14) {
                        c28655q.m87150e0(-1672024874);
                        c28655q.m87173q(false);
                        jM95628d = jM125430y;
                    } else {
                        c28655q.m87150e0(-1672023727);
                        jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
                    }
                    if (z14) {
                        c28655q.m87150e0(-1672021804);
                        jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, 6, false);
                    } else {
                        c28655q.m87150e0(-1672020716);
                        jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                    }
                    long j16 = jM95624D;
                    if ((458752 & i15) == 131072) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    if ((i15 & 896) == 256) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    z26 = z24 | z25;
                    objM87133R = c28655q.m87133R();
                    if (z26) {
                        objM87133R = new C1017f0(onToggle, z14, 6);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C1017f0(onToggle, z14, 6);
                        c28655q.m87172p0(objM87133R);
                    }
                    C2314t c2314t2 = C2314t.f9131w;
                    z27 = z14;
                    boolean z29 = z19;
                    Modifier modifierM3358c2 = AbstractC1092a.m3358c(AbstractC15680h.m44112a(AbstractC1102d.m3428y(AbstractC1112d.m3448b(c2314t2, z27, z19, null, (Function1) objM87133R, 12), null, false, 3), z29), jM95628d, AbstractC17918w0.f69621a);
                    float f14 = 4;
                    Modifier modifierM53364e2 = AbstractC18489d0.m53364e(AbstractC1099a.m3394p(((float) 2.5d) * 8, modifierM3358c2), 1, f14);
                    C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM53364e2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    int i26 = i15;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a2);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                    c38072d = C38072d.f163053a;
                    C27430e c27430eM107874S2 = AbstractC34132o.m107874S(c38072d.m121951d().getAction().getCheckMark(), c28655q, 6);
                    String strM92103Y2 = AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62249J);
                    Modifier modifierM3419p2 = AbstractC1102d.m3419p(5 * f14, c2314t2);
                    if (z27) {
                        c28655q.m87150e0(76523928);
                        jM125426w = c38072d.m121949b(c28655q, 6).getBrandBlack();
                        c28655q.m87173q(false);
                    } else {
                        long jM73366B2 = AbstractC25012a.m73366B(c28655q, 76525016, c38072d, c28655q, 6);
                        c28655q.m87173q(false);
                        jM125426w = jM73366B2;
                    }
                    AbstractC15005f3.m43108b(c27430eM107874S2, strM92103Y2, modifierM3419p2, jM125426w, c28655q, 384, 0);
                    AbstractC18489d0.m53380u(f14, f14, c2314t2, c28655q);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(text, c28655q, i26 & 14), null, j16, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, whoopCheckboxType.getStyle(), null, c28655q, 0, 0, 196602);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    j14 = jM125430y;
                    z17 = z27;
                    z18 = z29;
                } else {
                    c28655q.m87138X();
                    z17 = z14;
                    z18 = z15;
                    j14 = j13;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2611r1(text, whoopCheckboxType, z17, z18, j14, onToggle, i13, i14);
                }
            }
            i15 |= 3072;
            z15 = z13;
            if ((i13 & 24576) == 0) {
                if ((i14 & 16) == 0) {
                    j13 = j7;
                    if (c28655q.m87151f(j13)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    }
                    i15 |= i19;
                } else {
                    j13 = j7;
                }
                i19 = DfuBaseService.ERROR_REMOTE_MASK;
                i15 |= i19;
            } else {
                j13 = j7;
            }
            if ((196608 & i13) == 0) {
                if (c28655q.m87157i(onToggle)) {
                    i18 = 131072;
                } else {
                    i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i18;
            }
            if ((74899 & i15) != 74898) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q.m87135U(i15 & 1, z16)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i24 != 0) {
                        z14 = false;
                    }
                    if (i16 != 0) {
                        z15 = true;
                    }
                    if ((i14 & 16) != 0) {
                        jM125430y = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                        i15 &= -57345;
                        z19 = z15;
                    } else {
                        z19 = z15;
                        jM125430y = j13;
                    }
                } else {
                    if (i24 != 0) {
                        z14 = false;
                    }
                    if (i16 != 0) {
                        z15 = true;
                    }
                    if ((i14 & 16) != 0) {
                        jM125430y = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                        i15 &= -57345;
                        z19 = z15;
                    } else {
                        z19 = z15;
                        jM125430y = j13;
                    }
                }
                c28655q.m87175r();
                if (z14) {
                    c28655q.m87150e0(-1672024874);
                    c28655q.m87173q(false);
                    jM95628d = jM125430y;
                } else {
                    c28655q.m87150e0(-1672023727);
                    jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
                }
                if (z14) {
                    c28655q.m87150e0(-1672021804);
                    jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, 6, false);
                } else {
                    c28655q.m87150e0(-1672020716);
                    jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                }
                long j17 = jM95624D;
                if ((458752 & i15) == 131072) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                if ((i15 & 896) == 256) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                z26 = z24 | z25;
                objM87133R = c28655q.m87133R();
                if (z26) {
                    objM87133R = new C1017f0(onToggle, z14, 6);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C1017f0(onToggle, z14, 6);
                    c28655q.m87172p0(objM87133R);
                }
                C2314t c2314t3 = C2314t.f9131w;
                z27 = z14;
                boolean z210 = z19;
                Modifier modifierM3358c3 = AbstractC1092a.m3358c(AbstractC15680h.m44112a(AbstractC1102d.m3428y(AbstractC1112d.m3448b(c2314t3, z27, z19, null, (Function1) objM87133R, 12), null, false, 3), z210), jM95628d, AbstractC17918w0.f69621a);
                float f15 = 4;
                Modifier modifierM53364e3 = AbstractC18489d0.m53364e(AbstractC1099a.m3394p(((float) 2.5d) * 8, modifierM3358c3), 1, f15);
                C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM53364e3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                int i27 = i15;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a3);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                c38072d = C38072d.f163053a;
                C27430e c27430eM107874S3 = AbstractC34132o.m107874S(c38072d.m121951d().getAction().getCheckMark(), c28655q, 6);
                String strM92103Y3 = AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62249J);
                Modifier modifierM3419p3 = AbstractC1102d.m3419p(5 * f15, c2314t3);
                if (z27) {
                    c28655q.m87150e0(76523928);
                    jM125426w = c38072d.m121949b(c28655q, 6).getBrandBlack();
                    c28655q.m87173q(false);
                } else {
                    long jM73366B3 = AbstractC25012a.m73366B(c28655q, 76525016, c38072d, c28655q, 6);
                    c28655q.m87173q(false);
                    jM125426w = jM73366B3;
                }
                AbstractC15005f3.m43108b(c27430eM107874S3, strM92103Y3, modifierM3419p3, jM125426w, c28655q, 384, 0);
                AbstractC18489d0.m53380u(f15, f15, c2314t3, c28655q);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(text, c28655q, i27 & 14), null, j17, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, whoopCheckboxType.getStyle(), null, c28655q, 0, 0, 196602);
                c28655q = c28655q;
                c28655q.m87173q(true);
                j14 = jM125430y;
                z17 = z27;
                z18 = z210;
            } else {
                c28655q.m87138X();
                z17 = z14;
                z18 = z15;
                j14 = j13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2611r1(text, whoopCheckboxType, z17, z18, j14, onToggle, i13, i14);
            }
        }
        i15 |= 384;
        z14 = z4;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                z15 = z13;
                if (c28655q.m87155h(z15)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            if ((i13 & 24576) == 0) {
                if ((i14 & 16) == 0) {
                    j13 = j7;
                    if (c28655q.m87151f(j13)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    }
                    i15 |= i19;
                } else {
                    j13 = j7;
                }
                i19 = DfuBaseService.ERROR_REMOTE_MASK;
                i15 |= i19;
            } else {
                j13 = j7;
            }
            if ((196608 & i13) == 0) {
                if (c28655q.m87157i(onToggle)) {
                    i18 = 131072;
                } else {
                    i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i18;
            }
            if ((74899 & i15) != 74898) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q.m87135U(i15 & 1, z16)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i24 != 0) {
                        z14 = false;
                    }
                    if (i16 != 0) {
                        z15 = true;
                    }
                    if ((i14 & 16) != 0) {
                        jM125430y = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                        i15 &= -57345;
                        z19 = z15;
                    } else {
                        z19 = z15;
                        jM125430y = j13;
                    }
                } else {
                    if (i24 != 0) {
                        z14 = false;
                    }
                    if (i16 != 0) {
                        z15 = true;
                    }
                    if ((i14 & 16) != 0) {
                        jM125430y = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                        i15 &= -57345;
                        z19 = z15;
                    } else {
                        z19 = z15;
                        jM125430y = j13;
                    }
                }
                c28655q.m87175r();
                if (z14) {
                    c28655q.m87150e0(-1672024874);
                    c28655q.m87173q(false);
                    jM95628d = jM125430y;
                } else {
                    c28655q.m87150e0(-1672023727);
                    jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
                }
                if (z14) {
                    c28655q.m87150e0(-1672021804);
                    jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, 6, false);
                } else {
                    c28655q.m87150e0(-1672020716);
                    jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                }
                long j18 = jM95624D;
                if ((458752 & i15) == 131072) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                if ((i15 & 896) == 256) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                z26 = z24 | z25;
                objM87133R = c28655q.m87133R();
                if (z26) {
                    objM87133R = new C1017f0(onToggle, z14, 6);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C1017f0(onToggle, z14, 6);
                    c28655q.m87172p0(objM87133R);
                }
                C2314t c2314t4 = C2314t.f9131w;
                z27 = z14;
                boolean z211 = z19;
                Modifier modifierM3358c4 = AbstractC1092a.m3358c(AbstractC15680h.m44112a(AbstractC1102d.m3428y(AbstractC1112d.m3448b(c2314t4, z27, z19, null, (Function1) objM87133R, 12), null, false, 3), z211), jM95628d, AbstractC17918w0.f69621a);
                float f16 = 4;
                Modifier modifierM53364e4 = AbstractC18489d0.m53364e(AbstractC1099a.m3394p(((float) 2.5d) * 8, modifierM3358c4), 1, f16);
                C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM53364e4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                int i28 = i15;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a4);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
                c38072d = C38072d.f163053a;
                C27430e c27430eM107874S4 = AbstractC34132o.m107874S(c38072d.m121951d().getAction().getCheckMark(), c28655q, 6);
                String strM92103Y4 = AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62249J);
                Modifier modifierM3419p4 = AbstractC1102d.m3419p(5 * f16, c2314t4);
                if (z27) {
                    c28655q.m87150e0(76523928);
                    jM125426w = c38072d.m121949b(c28655q, 6).getBrandBlack();
                    c28655q.m87173q(false);
                } else {
                    long jM73366B4 = AbstractC25012a.m73366B(c28655q, 76525016, c38072d, c28655q, 6);
                    c28655q.m87173q(false);
                    jM125426w = jM73366B4;
                }
                AbstractC15005f3.m43108b(c27430eM107874S4, strM92103Y4, modifierM3419p4, jM125426w, c28655q, 384, 0);
                AbstractC18489d0.m53380u(f16, f16, c2314t4, c28655q);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(text, c28655q, i28 & 14), null, j18, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, whoopCheckboxType.getStyle(), null, c28655q, 0, 0, 196602);
                c28655q = c28655q;
                c28655q.m87173q(true);
                j14 = jM125430y;
                z17 = z27;
                z18 = z211;
            } else {
                c28655q.m87138X();
                z17 = z14;
                z18 = z15;
                j14 = j13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2611r1(text, whoopCheckboxType, z17, z18, j14, onToggle, i13, i14);
            }
        }
        i15 |= 3072;
        z15 = z13;
        if ((i13 & 24576) == 0) {
            if ((i14 & 16) == 0) {
                j13 = j7;
                if (c28655q.m87151f(j13)) {
                    i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                }
                i15 |= i19;
            } else {
                j13 = j7;
            }
            i19 = DfuBaseService.ERROR_REMOTE_MASK;
            i15 |= i19;
        } else {
            j13 = j7;
        }
        if ((196608 & i13) == 0) {
            if (c28655q.m87157i(onToggle)) {
                i18 = 131072;
            } else {
                i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i15 |= i18;
        }
        if ((74899 & i15) != 74898) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (c28655q.m87135U(i15 & 1, z16)) {
            c28655q.m87140Z();
            if ((i13 & 1) != 0) {
                if (i24 != 0) {
                    z14 = false;
                }
                if (i16 != 0) {
                    z15 = true;
                }
                if ((i14 & 16) != 0) {
                    jM125430y = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                    i15 &= -57345;
                    z19 = z15;
                } else {
                    z19 = z15;
                    jM125430y = j13;
                }
            } else {
                if (i24 != 0) {
                    z14 = false;
                }
                if (i16 != 0) {
                    z15 = true;
                }
                if ((i14 & 16) != 0) {
                    jM125430y = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                    i15 &= -57345;
                    z19 = z15;
                } else {
                    z19 = z15;
                    jM125430y = j13;
                }
            }
            c28655q.m87175r();
            if (z14) {
                c28655q.m87150e0(-1672024874);
                c28655q.m87173q(false);
                jM95628d = jM125430y;
            } else {
                c28655q.m87150e0(-1672023727);
                jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
            }
            if (z14) {
                c28655q.m87150e0(-1672021804);
                jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, 6, false);
            } else {
                c28655q.m87150e0(-1672020716);
                jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
            }
            long j19 = jM95624D;
            if ((458752 & i15) == 131072) {
                z24 = true;
            } else {
                z24 = false;
            }
            if ((i15 & 896) == 256) {
                z25 = true;
            } else {
                z25 = false;
            }
            z26 = z24 | z25;
            objM87133R = c28655q.m87133R();
            if (z26) {
                objM87133R = new C1017f0(onToggle, z14, 6);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C1017f0(onToggle, z14, 6);
                c28655q.m87172p0(objM87133R);
            }
            C2314t c2314t5 = C2314t.f9131w;
            z27 = z14;
            boolean z212 = z19;
            Modifier modifierM3358c5 = AbstractC1092a.m3358c(AbstractC15680h.m44112a(AbstractC1102d.m3428y(AbstractC1112d.m3448b(c2314t5, z27, z19, null, (Function1) objM87133R, 12), null, false, 3), z212), jM95628d, AbstractC17918w0.f69621a);
            float f17 = 4;
            Modifier modifierM53364e5 = AbstractC18489d0.m53364e(AbstractC1099a.m3394p(((float) 2.5d) * 8, modifierM3358c5), 1, f17);
            C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM53364e5);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            int i29 = i15;
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a5);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m5);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N5);
            c38072d = C38072d.f163053a;
            C27430e c27430eM107874S5 = AbstractC34132o.m107874S(c38072d.m121951d().getAction().getCheckMark(), c28655q, 6);
            String strM92103Y5 = AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62249J);
            Modifier modifierM3419p5 = AbstractC1102d.m3419p(5 * f17, c2314t5);
            if (z27) {
                c28655q.m87150e0(76523928);
                jM125426w = c38072d.m121949b(c28655q, 6).getBrandBlack();
                c28655q.m87173q(false);
            } else {
                long jM73366B5 = AbstractC25012a.m73366B(c28655q, 76525016, c38072d, c28655q, 6);
                c28655q.m87173q(false);
                jM125426w = jM73366B5;
            }
            AbstractC15005f3.m43108b(c27430eM107874S5, strM92103Y5, modifierM3419p5, jM125426w, c28655q, 384, 0);
            AbstractC18489d0.m53380u(f17, f17, c2314t5, c28655q);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(text, c28655q, i29 & 14), null, j19, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, whoopCheckboxType.getStyle(), null, c28655q, 0, 0, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
            j14 = jM125430y;
            z17 = z27;
            z18 = z212;
        } else {
            c28655q.m87138X();
            z17 = z14;
            z18 = z15;
            j14 = j13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2611r1(text, whoopCheckboxType, z17, z18, j14, onToggle, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m104850d(Function1 function1, boolean z4, boolean z13) {
        function1.invoke(Boolean.valueOf(!z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m104851e(TextResource textResource, AbstractC33088k abstractC33088k, boolean z4, boolean z13, long j7, Function1 function1, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m104849c(textResource, abstractC33088k, z4, z13, j7, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
