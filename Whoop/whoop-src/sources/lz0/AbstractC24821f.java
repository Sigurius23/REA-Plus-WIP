package lz0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4351m;
import gb1.AbstractC15673b0;
import ge3.AbstractC15751g;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: lz0.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001aQ\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "currentProgress", "totalSteps", "Li2/t;", "background", "Li2/x;", "unfilledBackground", "", "addBorders", "Ly3/f;", "height", "Ll83/a0;", "b", "(Landroidx/compose/ui/Modifier;IILi2/t;JZFLandroidx/compose/runtime/Composer;II)V", "", "d", "(II)F", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC24821f {
    /* JADX WARN: Code duplicated, block: B:101:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:104:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:107:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0090  */
    /* JADX WARN: Code duplicated, block: B:57:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:60:0x009e  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cd A[PHI: r1 r4 r5 r8
      0x00cd: PHI (r1v35 androidx.compose.ui.Modifier) = (r1v17 androidx.compose.ui.Modifier), (r1v37 androidx.compose.ui.Modifier) binds: [B:87:0x00f0, B:73:0x00c8] A[DONT_GENERATE, DONT_INLINE]
      0x00cd: PHI (r4v7 i2.t) = (r4v4 i2.t), (r4v2 i2.t) binds: [B:87:0x00f0, B:73:0x00c8] A[DONT_GENERATE, DONT_INLINE]
      0x00cd: PHI (r5v23 long) = (r5v4 long), (r5v2 long) binds: [B:87:0x00f0, B:73:0x00c8] A[DONT_GENERATE, DONT_INLINE]
      0x00cd: PHI (r8v13 boolean) = (r8v5 boolean), (r8v3 boolean) binds: [B:87:0x00f0, B:73:0x00c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:81:0x00db  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:91:0x0129  */
    /* JADX WARN: Code duplicated, block: B:92:0x0157  */
    /* JADX WARN: Code duplicated, block: B:95:0x018c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0190  */
    /* JADX WARN: Code duplicated, block: B:99:0x01a3  */
    /* JADX INFO: renamed from: b */
    public static final void m72736b(Modifier modifier, final int i13, int i14, AbstractC17911t abstractC17911t, long j7, boolean z4, float f13, Composer composer, final int i15, final int i16) {
        int i17;
        final int i18;
        final AbstractC17911t abstractC17911tM43983F0;
        final long black30;
        boolean z13;
        int i19;
        float f14;
        int i24;
        boolean z14;
        final boolean z15;
        final Modifier modifier2;
        final float f15;
        C28677v1 c28677v1M87180u;
        int i25;
        C2314t c2314t;
        Modifier modifier3;
        int i26;
        float f16;
        float f17;
        boolean z16;
        Modifier modifierM3395q;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i27;
        int i28;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(842623224);
        if ((i15 & 48) == 0) {
            i17 = (c28655q.m87149e(i13) ? 32 : 16) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 384) == 0) {
            i18 = i14;
            i17 |= c28655q.m87149e(i18) ? 256 : 128;
        } else {
            i18 = i14;
        }
        if ((i15 & 3072) == 0) {
            if ((i16 & 8) == 0) {
                abstractC17911tM43983F0 = abstractC17911t;
                if (c28655q.m87153g(abstractC17911tM43983F0)) {
                    i28 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i17 |= i28;
            } else {
                abstractC17911tM43983F0 = abstractC17911t;
            }
            i28 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            i17 |= i28;
        } else {
            abstractC17911tM43983F0 = abstractC17911t;
        }
        if ((i15 & 24576) == 0) {
            if ((i16 & 16) == 0) {
                black30 = j7;
                if (c28655q.m87151f(black30)) {
                    i27 = DfuBaseService.ERROR_CONNECTION_MASK;
                }
                i17 |= i27;
            } else {
                black30 = j7;
            }
            i27 = DfuBaseService.ERROR_REMOTE_MASK;
            i17 |= i27;
        } else {
            black30 = j7;
        }
        int i29 = i16 & 32;
        if (i29 == 0) {
            if ((196608 & i15) == 0) {
                z13 = z4;
                i17 |= c28655q.m87155h(z13) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i19 = i16 & 64;
            if (i19 != 0) {
                if ((1572864 & i15) == 0) {
                    f14 = f13;
                    if (c28655q.m87147d(f14)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i17 |= i24;
                }
                if ((599185 & i17) != 599184) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i17 & 1, z14)) {
                    c28655q.m87140Z();
                    i25 = i15 & 1;
                    c2314t = C2314t.f9131w;
                    if (i25 != 0 || c28655q.m87118C()) {
                        if ((i16 & 1) != 0) {
                            modifier3 = c2314t;
                        } else {
                            modifier3 = modifier;
                        }
                        if ((i16 & 8) != 0) {
                            abstractC17911tM43983F0 = AbstractC15673b0.m43983F0();
                        }
                        if ((i16 & 16) != 0) {
                            black30 = C38072d.f163053a.m121949b(c28655q, 6).getBlack30();
                        }
                        if (i29 != 0) {
                            z13 = true;
                        }
                        if (i19 != 0) {
                            i26 = 4;
                            f14 = ((float) 2.5d) * 4;
                        }
                        c28655q.m87175r();
                        float fM72738d = m72738d(i13, i14);
                        f16 = i26;
                        float f18 = 1 * f16;
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f18, c2314t));
                        modifier = modifier3;
                        f17 = ((float) 2.5d) * f16;
                        Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3414k(f14, c2314t)), AbstractC33253j.m105489e(f17)), black30, AbstractC17918w0.f69621a);
                        if (z13) {
                            c28655q.m87150e0(-1494686425);
                            float f19 = ((float) 0.5d) * f16;
                            modifierM3395q = AbstractC1099a.m3395q(AbstractC15751g.m44455h(c2314t, ((float) 0.25d) * f16, C38072d.f163053a.m121949b(c28655q, 6).getBlack50(), AbstractC33253j.m105489e(f17)), f19, f19);
                            z16 = false;
                            c28655q.m87173q(false);
                        } else {
                            z16 = false;
                            c28655q.m87150e0(-1494430086);
                            c28655q.m87173q(false);
                            modifierM3395q = c2314t;
                        }
                        Modifier modifierMo3471e = modifierM3358c.mo3471e(modifierM3395q);
                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, z16);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
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
                        AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC37056f.m118994r(AbstractC1102d.m3409f(fM72738d, AbstractC1102d.m3406c(1.0f, c2314t)), AbstractC33253j.m105489e(f18)), abstractC17911tM43983F0, null, 0.0f, 6), c28655q, 0);
                        c28655q.m87173q(true);
                        z15 = z13;
                        black30 = black30;
                    } else {
                        c28655q.m87138X();
                        modifier3 = modifier;
                    }
                    i26 = 4;
                    c28655q.m87175r();
                    float fM72738d2 = m72738d(i13, i14);
                    f16 = i26;
                    float f110 = 1 * f16;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f110, c2314t));
                    modifier = modifier3;
                    f17 = ((float) 2.5d) * f16;
                    Modifier modifierM3358c2 = AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3414k(f14, c2314t)), AbstractC33253j.m105489e(f17)), black30, AbstractC17918w0.f69621a);
                    if (z13) {
                        c28655q.m87150e0(-1494686425);
                        float f111 = ((float) 0.5d) * f16;
                        modifierM3395q = AbstractC1099a.m3395q(AbstractC15751g.m44455h(c2314t, ((float) 0.25d) * f16, C38072d.f163053a.m121949b(c28655q, 6).getBlack50(), AbstractC33253j.m105489e(f17)), f111, f111);
                        z16 = false;
                        c28655q.m87173q(false);
                    } else {
                        z16 = false;
                        c28655q.m87150e0(-1494430086);
                        c28655q.m87173q(false);
                        modifierM3395q = c2314t;
                    }
                    Modifier modifierMo3471e2 = modifierM3358c2.mo3471e(modifierM3395q);
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, z16);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierMo3471e2);
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
                    AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC37056f.m118994r(AbstractC1102d.m3409f(fM72738d2, AbstractC1102d.m3406c(1.0f, c2314t)), AbstractC33253j.m105489e(f110)), abstractC17911tM43983F0, null, 0.0f, 6), c28655q, 0);
                    c28655q.m87173q(true);
                    z15 = z13;
                    black30 = black30;
                } else {
                    c28655q.m87138X();
                    z15 = z13;
                }
                modifier2 = modifier;
                f15 = f14;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: lz0.e
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC24821f.m72737c(modifier2, i13, i18, abstractC17911tM43983F0, black30, z15, f15, i15, i16, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i17 |= 1572864;
            f14 = f13;
            if ((599185 & i17) != 599184) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i17 & 1, z14)) {
                c28655q.m87140Z();
                i25 = i15 & 1;
                c2314t = C2314t.f9131w;
                if (i25 != 0) {
                    if ((i16 & 1) != 0) {
                        modifier3 = c2314t;
                    } else {
                        modifier3 = modifier;
                    }
                    if ((i16 & 8) != 0) {
                        abstractC17911tM43983F0 = AbstractC15673b0.m43983F0();
                    }
                    if ((i16 & 16) != 0) {
                        black30 = C38072d.f163053a.m121949b(c28655q, 6).getBlack30();
                    }
                    if (i29 != 0) {
                        z13 = true;
                    }
                    if (i19 != 0) {
                        i26 = 4;
                        f14 = ((float) 2.5d) * 4;
                    } else {
                        i26 = 4;
                    }
                } else {
                    if ((i16 & 1) != 0) {
                        modifier3 = c2314t;
                    } else {
                        modifier3 = modifier;
                    }
                    if ((i16 & 8) != 0) {
                        abstractC17911tM43983F0 = AbstractC15673b0.m43983F0();
                    }
                    if ((i16 & 16) != 0) {
                        black30 = C38072d.f163053a.m121949b(c28655q, 6).getBlack30();
                    }
                    if (i29 != 0) {
                        z13 = true;
                    }
                    if (i19 != 0) {
                        i26 = 4;
                        f14 = ((float) 2.5d) * 4;
                    } else {
                        i26 = 4;
                    }
                }
                c28655q.m87175r();
                float fM72738d3 = m72738d(i13, i14);
                f16 = i26;
                float f112 = 1 * f16;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f112, c2314t));
                modifier = modifier3;
                f17 = ((float) 2.5d) * f16;
                Modifier modifierM3358c3 = AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3414k(f14, c2314t)), AbstractC33253j.m105489e(f17)), black30, AbstractC17918w0.f69621a);
                if (z13) {
                    c28655q.m87150e0(-1494686425);
                    float f113 = ((float) 0.5d) * f16;
                    modifierM3395q = AbstractC1099a.m3395q(AbstractC15751g.m44455h(c2314t, ((float) 0.25d) * f16, C38072d.f163053a.m121949b(c28655q, 6).getBlack50(), AbstractC33253j.m105489e(f17)), f113, f113);
                    z16 = false;
                    c28655q.m87173q(false);
                } else {
                    z16 = false;
                    c28655q.m87150e0(-1494430086);
                    c28655q.m87173q(false);
                    modifierM3395q = c2314t;
                }
                Modifier modifierMo3471e3 = modifierM3358c3.mo3471e(modifierM3395q);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, z16);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierMo3471e3);
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
                AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC37056f.m118994r(AbstractC1102d.m3409f(fM72738d3, AbstractC1102d.m3406c(1.0f, c2314t)), AbstractC33253j.m105489e(f112)), abstractC17911tM43983F0, null, 0.0f, 6), c28655q, 0);
                c28655q.m87173q(true);
                z15 = z13;
                black30 = black30;
            } else {
                c28655q.m87138X();
                z15 = z13;
            }
            modifier2 = modifier;
            f15 = f14;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: lz0.e
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC24821f.m72737c(modifier2, i13, i18, abstractC17911tM43983F0, black30, z15, f15, i15, i16, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i17 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        z13 = z4;
        i19 = i16 & 64;
        if (i19 != 0) {
            if ((1572864 & i15) == 0) {
                f14 = f13;
                if (c28655q.m87147d(f14)) {
                    i24 = 1048576;
                } else {
                    i24 = 524288;
                }
                i17 |= i24;
            }
            if ((599185 & i17) != 599184) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i17 & 1, z14)) {
                c28655q.m87140Z();
                i25 = i15 & 1;
                c2314t = C2314t.f9131w;
                if (i25 != 0) {
                    if ((i16 & 1) != 0) {
                        modifier3 = c2314t;
                    } else {
                        modifier3 = modifier;
                    }
                    if ((i16 & 8) != 0) {
                        abstractC17911tM43983F0 = AbstractC15673b0.m43983F0();
                    }
                    if ((i16 & 16) != 0) {
                        black30 = C38072d.f163053a.m121949b(c28655q, 6).getBlack30();
                    }
                    if (i29 != 0) {
                        z13 = true;
                    }
                    if (i19 != 0) {
                        i26 = 4;
                        f14 = ((float) 2.5d) * 4;
                    } else {
                        i26 = 4;
                    }
                } else {
                    if ((i16 & 1) != 0) {
                        modifier3 = c2314t;
                    } else {
                        modifier3 = modifier;
                    }
                    if ((i16 & 8) != 0) {
                        abstractC17911tM43983F0 = AbstractC15673b0.m43983F0();
                    }
                    if ((i16 & 16) != 0) {
                        black30 = C38072d.f163053a.m121949b(c28655q, 6).getBlack30();
                    }
                    if (i29 != 0) {
                        z13 = true;
                    }
                    if (i19 != 0) {
                        i26 = 4;
                        f14 = ((float) 2.5d) * 4;
                    } else {
                        i26 = 4;
                    }
                }
                c28655q.m87175r();
                float fM72738d4 = m72738d(i13, i14);
                f16 = i26;
                float f114 = 1 * f16;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f114, c2314t));
                modifier = modifier3;
                f17 = ((float) 2.5d) * f16;
                Modifier modifierM3358c4 = AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3414k(f14, c2314t)), AbstractC33253j.m105489e(f17)), black30, AbstractC17918w0.f69621a);
                if (z13) {
                    c28655q.m87150e0(-1494686425);
                    float f115 = ((float) 0.5d) * f16;
                    modifierM3395q = AbstractC1099a.m3395q(AbstractC15751g.m44455h(c2314t, ((float) 0.25d) * f16, C38072d.f163053a.m121949b(c28655q, 6).getBlack50(), AbstractC33253j.m105489e(f17)), f115, f115);
                    z16 = false;
                    c28655q.m87173q(false);
                } else {
                    z16 = false;
                    c28655q.m87150e0(-1494430086);
                    c28655q.m87173q(false);
                    modifierM3395q = c2314t;
                }
                Modifier modifierMo3471e4 = modifierM3358c4.mo3471e(modifierM3395q);
                InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, z16);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierMo3471e4);
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
                AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC37056f.m118994r(AbstractC1102d.m3409f(fM72738d4, AbstractC1102d.m3406c(1.0f, c2314t)), AbstractC33253j.m105489e(f114)), abstractC17911tM43983F0, null, 0.0f, 6), c28655q, 0);
                c28655q.m87173q(true);
                z15 = z13;
                black30 = black30;
            } else {
                c28655q.m87138X();
                z15 = z13;
            }
            modifier2 = modifier;
            f15 = f14;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: lz0.e
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC24821f.m72737c(modifier2, i13, i18, abstractC17911tM43983F0, black30, z15, f15, i15, i16, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i17 |= 1572864;
        f14 = f13;
        if ((599185 & i17) != 599184) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i17 & 1, z14)) {
            c28655q.m87140Z();
            i25 = i15 & 1;
            c2314t = C2314t.f9131w;
            if (i25 != 0) {
                if ((i16 & 1) != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier;
                }
                if ((i16 & 8) != 0) {
                    abstractC17911tM43983F0 = AbstractC15673b0.m43983F0();
                }
                if ((i16 & 16) != 0) {
                    black30 = C38072d.f163053a.m121949b(c28655q, 6).getBlack30();
                }
                if (i29 != 0) {
                    z13 = true;
                }
                if (i19 != 0) {
                    i26 = 4;
                    f14 = ((float) 2.5d) * 4;
                } else {
                    i26 = 4;
                }
            } else {
                if ((i16 & 1) != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier;
                }
                if ((i16 & 8) != 0) {
                    abstractC17911tM43983F0 = AbstractC15673b0.m43983F0();
                }
                if ((i16 & 16) != 0) {
                    black30 = C38072d.f163053a.m121949b(c28655q, 6).getBlack30();
                }
                if (i29 != 0) {
                    z13 = true;
                }
                if (i19 != 0) {
                    i26 = 4;
                    f14 = ((float) 2.5d) * 4;
                } else {
                    i26 = 4;
                }
            }
            c28655q.m87175r();
            float fM72738d5 = m72738d(i13, i14);
            f16 = i26;
            float f116 = 1 * f16;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f116, c2314t));
            modifier = modifier3;
            f17 = ((float) 2.5d) * f16;
            Modifier modifierM3358c5 = AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3414k(f14, c2314t)), AbstractC33253j.m105489e(f17)), black30, AbstractC17918w0.f69621a);
            if (z13) {
                c28655q.m87150e0(-1494686425);
                float f117 = ((float) 0.5d) * f16;
                modifierM3395q = AbstractC1099a.m3395q(AbstractC15751g.m44455h(c2314t, ((float) 0.25d) * f16, C38072d.f163053a.m121949b(c28655q, 6).getBlack50(), AbstractC33253j.m105489e(f17)), f117, f117);
                z16 = false;
                c28655q.m87173q(false);
            } else {
                z16 = false;
                c28655q.m87150e0(-1494430086);
                c28655q.m87173q(false);
                modifierM3395q = c2314t;
            }
            Modifier modifierMo3471e5 = modifierM3358c5.mo3471e(modifierM3395q);
            InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(C2299e.f9114w, z16);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierMo3471e5);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d5);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m5);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N5);
            AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC37056f.m118994r(AbstractC1102d.m3409f(fM72738d5, AbstractC1102d.m3406c(1.0f, c2314t)), AbstractC33253j.m105489e(f116)), abstractC17911tM43983F0, null, 0.0f, 6), c28655q, 0);
            c28655q.m87173q(true);
            z15 = z13;
            black30 = black30;
        } else {
            c28655q.m87138X();
            z15 = z13;
        }
        modifier2 = modifier;
        f15 = f14;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: lz0.e
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC24821f.m72737c(modifier2, i13, i18, abstractC17911tM43983F0, black30, z15, f15, i15, i16, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m72737c(Modifier modifier, int i13, int i14, AbstractC17911t abstractC17911t, long j7, boolean z4, float f13, int i15, int i16, Composer composer, int i17) {
        m72736b(modifier, i13, i14, abstractC17911t, j7, z4, f13, composer, AbstractC28683x.m87244L(i15 | 1), i16);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: d */
    public static final float m72738d(int i13, int i14) {
        if (i13 >= i14) {
            return 1.0f;
        }
        if (i13 <= 0) {
            return 0.0f;
        }
        return i13 / i14;
    }
}
