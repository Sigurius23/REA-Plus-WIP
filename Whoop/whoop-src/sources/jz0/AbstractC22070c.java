package jz0;

import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import jn2.C21806a;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p040c0.AbstractC3760m1;
import p040c0.AbstractC3788w0;
import p040c0.InterfaceC3747i0;
import p077d0.AbstractC11352g;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.C22994r1;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p602x1.AbstractC37817c;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: jz0.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a=\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\t\u0010\n\u001a+\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a%\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"", "numItems", "selectedItemIndex", "Landroidx/compose/ui/Modifier;", "modifier", "Li2/x;", "color", "selectedColor", "Ll83/a0;", "d", "(IILandroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "Ljz0/d;", "state", "f", "(Ljz0/d;JJLandroidx/compose/runtime/Composer;II)V", "itemIndex", "i", "(III)Ljz0/d;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22070c {
    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:35:0x005e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x006a  */
    /* JADX WARN: Code duplicated, block: B:43:0x006e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0076  */
    /* JADX WARN: Code duplicated, block: B:46:0x0079  */
    /* JADX WARN: Code duplicated, block: B:49:0x007f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x008a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0093  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:80:0x0115  */
    /* JADX WARN: Code duplicated, block: B:81:0x0119  */
    /* JADX WARN: Code duplicated, block: B:86:0x013a  */
    /* JADX WARN: Code duplicated, block: B:89:0x014b A[LOOP:0: B:88:0x0149->B:89:0x014b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:91:0x016a  */
    /* JADX WARN: Code duplicated, block: B:94:0x0176  */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final void m63138d(int i13, int i14, Modifier modifier, long j7, long j13, Composer composer, int i15, int i16) {
        Modifier modifier2;
        long jM125372X0;
        long jM125430y;
        boolean z4;
        Modifier modifier3;
        long j14;
        long j15;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        long j16;
        long j17;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i17;
        int i18;
        int i19;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(902768169);
        int i24 = (i15 & 6) == 0 ? (c28655q.m87149e(i13) ? 4 : 2) | i15 : i15;
        if ((i15 & 48) == 0) {
            i24 |= c28655q.m87149e(i14) ? 32 : 16;
        }
        int i25 = i16 & 4;
        if (i25 == 0) {
            if ((i15 & 384) == 0) {
                modifier2 = modifier;
                i24 |= c28655q.m87153g(modifier2) ? 256 : 128;
            }
            if ((i15 & 3072) == 0) {
                if ((i16 & 8) == 0) {
                    jM125372X0 = j7;
                    if (c28655q.m87151f(jM125372X0)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    }
                    i24 |= i19;
                } else {
                    jM125372X0 = j7;
                }
                i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                i24 |= i19;
            } else {
                jM125372X0 = j7;
            }
            if ((i15 & 24576) == 0) {
                if ((i16 & 16) == 0) {
                    jM125430y = j13;
                    if (c28655q.m87151f(jM125430y)) {
                        i18 = DfuBaseService.ERROR_CONNECTION_MASK;
                    }
                    i24 |= i18;
                } else {
                    jM125430y = j13;
                }
                i18 = DfuBaseService.ERROR_REMOTE_MASK;
                i24 |= i18;
            } else {
                jM125430y = j13;
            }
            if ((i24 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i24 & 1, z4)) {
                c28655q.m87140Z();
                if ((i15 & 1) != 0 || c28655q.m87118C()) {
                    if (i25 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if ((i16 & 8) != 0) {
                        i24 &= -7169;
                        jM125372X0 = C38072d.f163053a.m121949b(c28655q, 6).getWhite20();
                    }
                    if ((i16 & 16) != 0) {
                        jM125430y = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                        i24 &= -57345;
                    }
                } else {
                    c28655q.m87138X();
                    if ((i16 & 8) != 0) {
                        i24 &= -7169;
                    }
                    if ((i16 & 16) != 0) {
                        i24 &= -57345;
                    }
                    modifier4 = modifier2;
                }
                j16 = jM125430y;
                j17 = jM125372X0;
                c28655q.m87175r();
                Modifier modifierM3429z = AbstractC1102d.m3429z(modifier4, C2299e.f9111N, 2);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3429z);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
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
                c28655q.m87150e0(-1231888497);
                for (i17 = 0; i17 < i13; i17++) {
                    m63140f(m63143i(i13, i17, i14), j17, j16, c28655q, (i24 >> 6) & MessageListItemViewType.GIPHY, 0);
                }
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                modifier3 = modifier4;
                j14 = j17;
                j15 = j16;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                j14 = jM125372X0;
                j15 = jM125430y;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C22068a(i13, i14, modifier3, j14, j15, i15, i16);
            }
        }
        i24 |= 384;
        modifier2 = modifier;
        if ((i15 & 3072) == 0) {
            if ((i16 & 8) == 0) {
                jM125372X0 = j7;
                if (c28655q.m87151f(jM125372X0)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i24 |= i19;
            } else {
                jM125372X0 = j7;
            }
            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            i24 |= i19;
        } else {
            jM125372X0 = j7;
        }
        if ((i15 & 24576) == 0) {
            if ((i16 & 16) == 0) {
                jM125430y = j13;
                if (c28655q.m87151f(jM125430y)) {
                    i18 = DfuBaseService.ERROR_CONNECTION_MASK;
                }
                i24 |= i18;
            } else {
                jM125430y = j13;
            }
            i18 = DfuBaseService.ERROR_REMOTE_MASK;
            i24 |= i18;
        } else {
            jM125430y = j13;
        }
        if ((i24 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i24 & 1, z4)) {
            c28655q.m87140Z();
            if ((i15 & 1) != 0) {
                if (i25 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if ((i16 & 8) != 0) {
                    i24 &= -7169;
                    jM125372X0 = C38072d.f163053a.m121949b(c28655q, 6).getWhite20();
                }
                if ((i16 & 16) != 0) {
                    jM125430y = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                    i24 &= -57345;
                }
            } else {
                if (i25 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if ((i16 & 8) != 0) {
                    i24 &= -7169;
                    jM125372X0 = C38072d.f163053a.m121949b(c28655q, 6).getWhite20();
                }
                if ((i16 & 16) != 0) {
                    jM125430y = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                    i24 &= -57345;
                }
            }
            j16 = jM125430y;
            j17 = jM125372X0;
            c28655q.m87175r();
            Modifier modifierM3429z2 = AbstractC1102d.m3429z(modifier4, C2299e.f9111N, 2);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3429z2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
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
            c28655q.m87150e0(-1231888497);
            while (i17 < i13) {
                m63140f(m63143i(i13, i17, i14), j17, j16, c28655q, (i24 >> 6) & MessageListItemViewType.GIPHY, 0);
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
            modifier3 = modifier4;
            j14 = j17;
            j15 = j16;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            j14 = jM125372X0;
            j15 = jM125430y;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22068a(i13, i14, modifier3, j14, j15, i15, i16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m63139e(int i13, int i14, Modifier modifier, long j7, long j13, int i15, int i16, Composer composer, int i17) {
        m63138d(i13, i14, modifier, j7, j13, composer, AbstractC28683x.m87244L(i15 | 1), i16);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: f */
    private static final void m63140f(final C22071d c22071d, long j7, long j13, Composer composer, final int i13, final int i14) {
        int i15;
        final long jM125372X0;
        final long jM125430y;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1094649776);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(c22071d) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            if ((i14 & 2) == 0) {
                jM125372X0 = j7;
                int i16 = c28655q.m87151f(jM125372X0) ? 32 : 16;
                i15 |= i16;
            } else {
                jM125372X0 = j7;
            }
            i15 |= i16;
        } else {
            jM125372X0 = j7;
        }
        if ((i13 & 384) == 0) {
            if ((i14 & 4) == 0) {
                jM125430y = j13;
                int i17 = c28655q.m87151f(jM125430y) ? 256 : 128;
                i15 |= i17;
            } else {
                jM125430y = j13;
            }
            i15 |= i17;
        } else {
            jM125430y = j13;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            c28655q.m87140Z();
            if ((i13 & 1) == 0 || c28655q.m87118C()) {
                if ((i14 & 2) != 0) {
                    jM125372X0 = C38072d.f163053a.m121949b(c28655q, 6).getWhite20();
                }
                if ((i14 & 4) != 0) {
                    jM125430y = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                }
            } else {
                c28655q.m87138X();
            }
            c28655q.m87175r();
            AbstractC1090b.m3351f(c22071d.getType() != EnumC22072e.Hidden, null, AbstractC3788w0.m11577e(null, 3).m11562a(AbstractC3788w0.m11575c(null, 9)), AbstractC3788w0.m11578f(null, 3).m11563a(AbstractC3788w0.m11583k(null, 9)), null, AbstractC37817c.m121344e(-188017674, c28655q, new C21806a(c22071d.getType().getSizeDp(), c22071d.getIsSelected() ? jM125430y : jM125372X0)), c28655q, 200064, 18);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: jz0.b
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC22070c.m63142h(c22071d, jM125372X0, jM125430y, i13, i14, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m63141g(float f13, long j7, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC1102d.m3419p(((C39174f) AbstractC11352g.m30587a(f13, null, null, composer, 0, 14).getValue()).f168413w, AbstractC1099a.m3396r(C2314t.f9131w, ((float) 0.5d) * 8, 0.0f, 2)), ((C17919x) AbstractC3760m1.m11569a(j7, null, null, composer, 0, 14).getValue()).f69639a, AbstractC33253j.f138651a), composer, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m63142h(C22071d c22071d, long j7, long j13, int i13, int i14, Composer composer, int i15) {
        m63140f(c22071d, j7, j13, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:106:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:69:0x0096  */
    /* JADX WARN: Code duplicated, block: B:73:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:77:0x00a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:81:0x00b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:85:0x00b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:88:0x00bf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:90:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:91:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:94:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:98:0x00d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x00d8  */
    /* JADX INFO: renamed from: i */
    public static final C22071d m63143i(int i13, int i14, int i15) {
        EnumC22072e enumC22072e;
        boolean z4 = i15 >= 0 && i15 < 2;
        boolean z13 = i15 == 2;
        boolean z14 = 3 <= i15 && i15 < i13 + (-3);
        boolean z15 = i15 == i13 + (-3);
        int i16 = i13 - 2;
        boolean z16 = i16 <= i15 && i15 < i13;
        boolean z17 = i15 == i14;
        if (i14 < 0 || i14 >= i13) {
            enumC22072e = EnumC22072e.Hidden;
        } else if (i13 <= 5) {
            enumC22072e = EnumC22072e.Enabled;
        } else if (z4 && i14 <= 3) {
            enumC22072e = EnumC22072e.Enabled;
        } else if (z4 && i14 == 4) {
            enumC22072e = EnumC22072e.Fading6;
        } else if (z4 && i14 == 5) {
            enumC22072e = EnumC22072e.Fading4;
        } else if (z13 && i14 == 0) {
            enumC22072e = EnumC22072e.Fading6;
        } else if (z13 && 1 <= i14 && i14 < 4) {
            enumC22072e = EnumC22072e.Enabled;
        } else if (z13 && i14 == 4) {
            enumC22072e = EnumC22072e.Fading6;
        } else if (z13 && i14 == 5) {
            enumC22072e = EnumC22072e.Fading4;
        } else if (z14 && i14 == i15 - 3) {
            enumC22072e = EnumC22072e.Fading4;
        } else if (z14 && i14 == i15 - 2) {
            enumC22072e = EnumC22072e.Fading6;
        } else if (z14) {
            int i17 = i15 - 1;
            if (i14 <= i15 + 1 && i17 <= i14) {
                enumC22072e = EnumC22072e.Enabled;
            } else if (!z14 && i14 == i15 + 2) {
                enumC22072e = EnumC22072e.Fading6;
            } else if (!z14 && i14 == i15 + 3) {
                enumC22072e = EnumC22072e.Fading4;
            } else if (!z15 && i14 == i13 - 6) {
                enumC22072e = EnumC22072e.Fading4;
            } else if (!z15 && i14 == i13 - 5) {
                enumC22072e = EnumC22072e.Fading6;
            } else if (z15) {
                int i18 = i13 - 4;
                if (i14 > i16 && i18 <= i14) {
                    enumC22072e = EnumC22072e.Enabled;
                } else if (!z15 && i14 == i13 - 1) {
                    enumC22072e = EnumC22072e.Fading6;
                } else if (!z16 && i14 == i13 - 6) {
                    enumC22072e = EnumC22072e.Fading4;
                } else if (!z16 && i14 == i13 - 5) {
                    enumC22072e = EnumC22072e.Fading6;
                } else if (z16 || i14 < i13 - 4) {
                    enumC22072e = EnumC22072e.Hidden;
                } else {
                    enumC22072e = EnumC22072e.Enabled;
                }
            } else if (!z15) {
                if (!z16) {
                    if (!z16) {
                        if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (!z16) {
                    if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (z16) {
                    enumC22072e = EnumC22072e.Hidden;
                } else {
                    enumC22072e = EnumC22072e.Hidden;
                }
            } else if (!z16) {
                if (!z16) {
                    if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (z16) {
                    enumC22072e = EnumC22072e.Hidden;
                } else {
                    enumC22072e = EnumC22072e.Hidden;
                }
            } else if (!z16) {
                if (z16) {
                    enumC22072e = EnumC22072e.Hidden;
                } else {
                    enumC22072e = EnumC22072e.Hidden;
                }
            } else if (z16) {
                enumC22072e = EnumC22072e.Hidden;
            } else {
                enumC22072e = EnumC22072e.Hidden;
            }
        } else if (!z14) {
            if (!z14) {
                if (!z15) {
                    if (!z15) {
                        if (z15) {
                            int i19 = i13 - 4;
                            if (i14 > i16) {
                                if (!z15) {
                                    if (!z16) {
                                        if (!z16) {
                                            if (z16) {
                                                enumC22072e = EnumC22072e.Hidden;
                                            } else {
                                                enumC22072e = EnumC22072e.Hidden;
                                            }
                                        } else if (z16) {
                                            enumC22072e = EnumC22072e.Hidden;
                                        } else {
                                            enumC22072e = EnumC22072e.Hidden;
                                        }
                                    } else if (!z16) {
                                        if (z16) {
                                            enumC22072e = EnumC22072e.Hidden;
                                        } else {
                                            enumC22072e = EnumC22072e.Hidden;
                                        }
                                    } else if (z16) {
                                        enumC22072e = EnumC22072e.Hidden;
                                    } else {
                                        enumC22072e = EnumC22072e.Hidden;
                                    }
                                } else if (!z16) {
                                    if (!z16) {
                                        if (z16) {
                                            enumC22072e = EnumC22072e.Hidden;
                                        } else {
                                            enumC22072e = EnumC22072e.Hidden;
                                        }
                                    } else if (z16) {
                                        enumC22072e = EnumC22072e.Hidden;
                                    } else {
                                        enumC22072e = EnumC22072e.Hidden;
                                    }
                                } else if (!z16) {
                                    if (z16) {
                                        enumC22072e = EnumC22072e.Hidden;
                                    } else {
                                        enumC22072e = EnumC22072e.Hidden;
                                    }
                                } else if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (!z15) {
                                if (!z16) {
                                    if (!z16) {
                                        if (z16) {
                                            enumC22072e = EnumC22072e.Hidden;
                                        } else {
                                            enumC22072e = EnumC22072e.Hidden;
                                        }
                                    } else if (z16) {
                                        enumC22072e = EnumC22072e.Hidden;
                                    } else {
                                        enumC22072e = EnumC22072e.Hidden;
                                    }
                                } else if (!z16) {
                                    if (z16) {
                                        enumC22072e = EnumC22072e.Hidden;
                                    } else {
                                        enumC22072e = EnumC22072e.Hidden;
                                    }
                                } else if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (!z16) {
                                if (!z16) {
                                    if (z16) {
                                        enumC22072e = EnumC22072e.Hidden;
                                    } else {
                                        enumC22072e = EnumC22072e.Hidden;
                                    }
                                } else if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (!z16) {
                                if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (!z15) {
                            if (!z16) {
                                if (!z16) {
                                    if (z16) {
                                        enumC22072e = EnumC22072e.Hidden;
                                    } else {
                                        enumC22072e = EnumC22072e.Hidden;
                                    }
                                } else if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (!z16) {
                                if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (!z16) {
                            if (!z16) {
                                if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (!z16) {
                            if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (z15) {
                        int i110 = i13 - 4;
                        if (i14 > i16) {
                            if (!z15) {
                                if (!z16) {
                                    if (!z16) {
                                        if (z16) {
                                            enumC22072e = EnumC22072e.Hidden;
                                        } else {
                                            enumC22072e = EnumC22072e.Hidden;
                                        }
                                    } else if (z16) {
                                        enumC22072e = EnumC22072e.Hidden;
                                    } else {
                                        enumC22072e = EnumC22072e.Hidden;
                                    }
                                } else if (!z16) {
                                    if (z16) {
                                        enumC22072e = EnumC22072e.Hidden;
                                    } else {
                                        enumC22072e = EnumC22072e.Hidden;
                                    }
                                } else if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (!z16) {
                                if (!z16) {
                                    if (z16) {
                                        enumC22072e = EnumC22072e.Hidden;
                                    } else {
                                        enumC22072e = EnumC22072e.Hidden;
                                    }
                                } else if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (!z16) {
                                if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (!z15) {
                            if (!z16) {
                                if (!z16) {
                                    if (z16) {
                                        enumC22072e = EnumC22072e.Hidden;
                                    } else {
                                        enumC22072e = EnumC22072e.Hidden;
                                    }
                                } else if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (!z16) {
                                if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (!z16) {
                            if (!z16) {
                                if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (!z16) {
                            if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (!z15) {
                        if (!z16) {
                            if (!z16) {
                                if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (!z16) {
                            if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (!z16) {
                        if (!z16) {
                            if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (!z16) {
                        if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (!z15) {
                    if (z15) {
                        int i111 = i13 - 4;
                        if (i14 > i16) {
                            if (!z15) {
                                if (!z16) {
                                    if (!z16) {
                                        if (z16) {
                                            enumC22072e = EnumC22072e.Hidden;
                                        } else {
                                            enumC22072e = EnumC22072e.Hidden;
                                        }
                                    } else if (z16) {
                                        enumC22072e = EnumC22072e.Hidden;
                                    } else {
                                        enumC22072e = EnumC22072e.Hidden;
                                    }
                                } else if (!z16) {
                                    if (z16) {
                                        enumC22072e = EnumC22072e.Hidden;
                                    } else {
                                        enumC22072e = EnumC22072e.Hidden;
                                    }
                                } else if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (!z16) {
                                if (!z16) {
                                    if (z16) {
                                        enumC22072e = EnumC22072e.Hidden;
                                    } else {
                                        enumC22072e = EnumC22072e.Hidden;
                                    }
                                } else if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (!z16) {
                                if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (!z15) {
                            if (!z16) {
                                if (!z16) {
                                    if (z16) {
                                        enumC22072e = EnumC22072e.Hidden;
                                    } else {
                                        enumC22072e = EnumC22072e.Hidden;
                                    }
                                } else if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (!z16) {
                                if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (!z16) {
                            if (!z16) {
                                if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (!z16) {
                            if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (!z15) {
                        if (!z16) {
                            if (!z16) {
                                if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (!z16) {
                            if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (!z16) {
                        if (!z16) {
                            if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (!z16) {
                        if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (z15) {
                    int i112 = i13 - 4;
                    if (i14 > i16) {
                        if (!z15) {
                            if (!z16) {
                                if (!z16) {
                                    if (z16) {
                                        enumC22072e = EnumC22072e.Hidden;
                                    } else {
                                        enumC22072e = EnumC22072e.Hidden;
                                    }
                                } else if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (!z16) {
                                if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (!z16) {
                            if (!z16) {
                                if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (!z16) {
                            if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (!z15) {
                        if (!z16) {
                            if (!z16) {
                                if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (!z16) {
                            if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (!z16) {
                        if (!z16) {
                            if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (!z16) {
                        if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (!z15) {
                    if (!z16) {
                        if (!z16) {
                            if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (!z16) {
                        if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (!z16) {
                    if (!z16) {
                        if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (!z16) {
                    if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (z16) {
                    enumC22072e = EnumC22072e.Hidden;
                } else {
                    enumC22072e = EnumC22072e.Hidden;
                }
            } else if (!z15) {
                if (!z15) {
                    if (z15) {
                        int i113 = i13 - 4;
                        if (i14 > i16) {
                            if (!z15) {
                                if (!z16) {
                                    if (!z16) {
                                        if (z16) {
                                            enumC22072e = EnumC22072e.Hidden;
                                        } else {
                                            enumC22072e = EnumC22072e.Hidden;
                                        }
                                    } else if (z16) {
                                        enumC22072e = EnumC22072e.Hidden;
                                    } else {
                                        enumC22072e = EnumC22072e.Hidden;
                                    }
                                } else if (!z16) {
                                    if (z16) {
                                        enumC22072e = EnumC22072e.Hidden;
                                    } else {
                                        enumC22072e = EnumC22072e.Hidden;
                                    }
                                } else if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (!z16) {
                                if (!z16) {
                                    if (z16) {
                                        enumC22072e = EnumC22072e.Hidden;
                                    } else {
                                        enumC22072e = EnumC22072e.Hidden;
                                    }
                                } else if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (!z16) {
                                if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (!z15) {
                            if (!z16) {
                                if (!z16) {
                                    if (z16) {
                                        enumC22072e = EnumC22072e.Hidden;
                                    } else {
                                        enumC22072e = EnumC22072e.Hidden;
                                    }
                                } else if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (!z16) {
                                if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (!z16) {
                            if (!z16) {
                                if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (!z16) {
                            if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (!z15) {
                        if (!z16) {
                            if (!z16) {
                                if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (!z16) {
                            if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (!z16) {
                        if (!z16) {
                            if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (!z16) {
                        if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (z15) {
                    int i114 = i13 - 4;
                    if (i14 > i16) {
                        if (!z15) {
                            if (!z16) {
                                if (!z16) {
                                    if (z16) {
                                        enumC22072e = EnumC22072e.Hidden;
                                    } else {
                                        enumC22072e = EnumC22072e.Hidden;
                                    }
                                } else if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (!z16) {
                                if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (!z16) {
                            if (!z16) {
                                if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (!z16) {
                            if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (!z15) {
                        if (!z16) {
                            if (!z16) {
                                if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (!z16) {
                            if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (!z16) {
                        if (!z16) {
                            if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (!z16) {
                        if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (!z15) {
                    if (!z16) {
                        if (!z16) {
                            if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (!z16) {
                        if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (!z16) {
                    if (!z16) {
                        if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (!z16) {
                    if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (z16) {
                    enumC22072e = EnumC22072e.Hidden;
                } else {
                    enumC22072e = EnumC22072e.Hidden;
                }
            } else if (!z15) {
                if (z15) {
                    int i115 = i13 - 4;
                    if (i14 > i16) {
                        if (!z15) {
                            if (!z16) {
                                if (!z16) {
                                    if (z16) {
                                        enumC22072e = EnumC22072e.Hidden;
                                    } else {
                                        enumC22072e = EnumC22072e.Hidden;
                                    }
                                } else if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (!z16) {
                                if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (!z16) {
                            if (!z16) {
                                if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (!z16) {
                            if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (!z15) {
                        if (!z16) {
                            if (!z16) {
                                if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (!z16) {
                            if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (!z16) {
                        if (!z16) {
                            if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (!z16) {
                        if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (!z15) {
                    if (!z16) {
                        if (!z16) {
                            if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (!z16) {
                        if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (!z16) {
                    if (!z16) {
                        if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (!z16) {
                    if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (z16) {
                    enumC22072e = EnumC22072e.Hidden;
                } else {
                    enumC22072e = EnumC22072e.Hidden;
                }
            } else if (z15) {
                int i116 = i13 - 4;
                if (i14 > i16) {
                    if (!z15) {
                        if (!z16) {
                            if (!z16) {
                                if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (!z16) {
                            if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (!z16) {
                        if (!z16) {
                            if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (!z16) {
                        if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (!z15) {
                    if (!z16) {
                        if (!z16) {
                            if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (!z16) {
                        if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (!z16) {
                    if (!z16) {
                        if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (!z16) {
                    if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (z16) {
                    enumC22072e = EnumC22072e.Hidden;
                } else {
                    enumC22072e = EnumC22072e.Hidden;
                }
            } else if (!z15) {
                if (!z16) {
                    if (!z16) {
                        if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (!z16) {
                    if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (z16) {
                    enumC22072e = EnumC22072e.Hidden;
                } else {
                    enumC22072e = EnumC22072e.Hidden;
                }
            } else if (!z16) {
                if (!z16) {
                    if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (z16) {
                    enumC22072e = EnumC22072e.Hidden;
                } else {
                    enumC22072e = EnumC22072e.Hidden;
                }
            } else if (!z16) {
                if (z16) {
                    enumC22072e = EnumC22072e.Hidden;
                } else {
                    enumC22072e = EnumC22072e.Hidden;
                }
            } else if (z16) {
                enumC22072e = EnumC22072e.Hidden;
            } else {
                enumC22072e = EnumC22072e.Hidden;
            }
        } else if (!z14) {
            if (!z15) {
                if (!z15) {
                    if (z15) {
                        int i117 = i13 - 4;
                        if (i14 > i16) {
                            if (!z15) {
                                if (!z16) {
                                    if (!z16) {
                                        if (z16) {
                                            enumC22072e = EnumC22072e.Hidden;
                                        } else {
                                            enumC22072e = EnumC22072e.Hidden;
                                        }
                                    } else if (z16) {
                                        enumC22072e = EnumC22072e.Hidden;
                                    } else {
                                        enumC22072e = EnumC22072e.Hidden;
                                    }
                                } else if (!z16) {
                                    if (z16) {
                                        enumC22072e = EnumC22072e.Hidden;
                                    } else {
                                        enumC22072e = EnumC22072e.Hidden;
                                    }
                                } else if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (!z16) {
                                if (!z16) {
                                    if (z16) {
                                        enumC22072e = EnumC22072e.Hidden;
                                    } else {
                                        enumC22072e = EnumC22072e.Hidden;
                                    }
                                } else if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (!z16) {
                                if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (!z15) {
                            if (!z16) {
                                if (!z16) {
                                    if (z16) {
                                        enumC22072e = EnumC22072e.Hidden;
                                    } else {
                                        enumC22072e = EnumC22072e.Hidden;
                                    }
                                } else if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (!z16) {
                                if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (!z16) {
                            if (!z16) {
                                if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (!z16) {
                            if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (!z15) {
                        if (!z16) {
                            if (!z16) {
                                if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (!z16) {
                            if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (!z16) {
                        if (!z16) {
                            if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (!z16) {
                        if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (z15) {
                    int i118 = i13 - 4;
                    if (i14 > i16) {
                        if (!z15) {
                            if (!z16) {
                                if (!z16) {
                                    if (z16) {
                                        enumC22072e = EnumC22072e.Hidden;
                                    } else {
                                        enumC22072e = EnumC22072e.Hidden;
                                    }
                                } else if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (!z16) {
                                if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (!z16) {
                            if (!z16) {
                                if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (!z16) {
                            if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (!z15) {
                        if (!z16) {
                            if (!z16) {
                                if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (!z16) {
                            if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (!z16) {
                        if (!z16) {
                            if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (!z16) {
                        if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (!z15) {
                    if (!z16) {
                        if (!z16) {
                            if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (!z16) {
                        if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (!z16) {
                    if (!z16) {
                        if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (!z16) {
                    if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (z16) {
                    enumC22072e = EnumC22072e.Hidden;
                } else {
                    enumC22072e = EnumC22072e.Hidden;
                }
            } else if (!z15) {
                if (z15) {
                    int i119 = i13 - 4;
                    if (i14 > i16) {
                        if (!z15) {
                            if (!z16) {
                                if (!z16) {
                                    if (z16) {
                                        enumC22072e = EnumC22072e.Hidden;
                                    } else {
                                        enumC22072e = EnumC22072e.Hidden;
                                    }
                                } else if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (!z16) {
                                if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (!z16) {
                            if (!z16) {
                                if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (!z16) {
                            if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (!z15) {
                        if (!z16) {
                            if (!z16) {
                                if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (!z16) {
                            if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (!z16) {
                        if (!z16) {
                            if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (!z16) {
                        if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (!z15) {
                    if (!z16) {
                        if (!z16) {
                            if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (!z16) {
                        if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (!z16) {
                    if (!z16) {
                        if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (!z16) {
                    if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (z16) {
                    enumC22072e = EnumC22072e.Hidden;
                } else {
                    enumC22072e = EnumC22072e.Hidden;
                }
            } else if (z15) {
                int i1110 = i13 - 4;
                if (i14 > i16) {
                    if (!z15) {
                        if (!z16) {
                            if (!z16) {
                                if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (!z16) {
                            if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (!z16) {
                        if (!z16) {
                            if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (!z16) {
                        if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (!z15) {
                    if (!z16) {
                        if (!z16) {
                            if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (!z16) {
                        if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (!z16) {
                    if (!z16) {
                        if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (!z16) {
                    if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (z16) {
                    enumC22072e = EnumC22072e.Hidden;
                } else {
                    enumC22072e = EnumC22072e.Hidden;
                }
            } else if (!z15) {
                if (!z16) {
                    if (!z16) {
                        if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (!z16) {
                    if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (z16) {
                    enumC22072e = EnumC22072e.Hidden;
                } else {
                    enumC22072e = EnumC22072e.Hidden;
                }
            } else if (!z16) {
                if (!z16) {
                    if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (z16) {
                    enumC22072e = EnumC22072e.Hidden;
                } else {
                    enumC22072e = EnumC22072e.Hidden;
                }
            } else if (!z16) {
                if (z16) {
                    enumC22072e = EnumC22072e.Hidden;
                } else {
                    enumC22072e = EnumC22072e.Hidden;
                }
            } else if (z16) {
                enumC22072e = EnumC22072e.Hidden;
            } else {
                enumC22072e = EnumC22072e.Hidden;
            }
        } else if (!z15) {
            if (!z15) {
                if (z15) {
                    int i1111 = i13 - 4;
                    if (i14 > i16) {
                        if (!z15) {
                            if (!z16) {
                                if (!z16) {
                                    if (z16) {
                                        enumC22072e = EnumC22072e.Hidden;
                                    } else {
                                        enumC22072e = EnumC22072e.Hidden;
                                    }
                                } else if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (!z16) {
                                if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (!z16) {
                            if (!z16) {
                                if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (!z16) {
                            if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (!z15) {
                        if (!z16) {
                            if (!z16) {
                                if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (!z16) {
                            if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (!z16) {
                        if (!z16) {
                            if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (!z16) {
                        if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (!z15) {
                    if (!z16) {
                        if (!z16) {
                            if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (!z16) {
                        if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (!z16) {
                    if (!z16) {
                        if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (!z16) {
                    if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (z16) {
                    enumC22072e = EnumC22072e.Hidden;
                } else {
                    enumC22072e = EnumC22072e.Hidden;
                }
            } else if (z15) {
                int i1112 = i13 - 4;
                if (i14 > i16) {
                    if (!z15) {
                        if (!z16) {
                            if (!z16) {
                                if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (!z16) {
                            if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (!z16) {
                        if (!z16) {
                            if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (!z16) {
                        if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (!z15) {
                    if (!z16) {
                        if (!z16) {
                            if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (!z16) {
                        if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (!z16) {
                    if (!z16) {
                        if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (!z16) {
                    if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (z16) {
                    enumC22072e = EnumC22072e.Hidden;
                } else {
                    enumC22072e = EnumC22072e.Hidden;
                }
            } else if (!z15) {
                if (!z16) {
                    if (!z16) {
                        if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (!z16) {
                    if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (z16) {
                    enumC22072e = EnumC22072e.Hidden;
                } else {
                    enumC22072e = EnumC22072e.Hidden;
                }
            } else if (!z16) {
                if (!z16) {
                    if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (z16) {
                    enumC22072e = EnumC22072e.Hidden;
                } else {
                    enumC22072e = EnumC22072e.Hidden;
                }
            } else if (!z16) {
                if (z16) {
                    enumC22072e = EnumC22072e.Hidden;
                } else {
                    enumC22072e = EnumC22072e.Hidden;
                }
            } else if (z16) {
                enumC22072e = EnumC22072e.Hidden;
            } else {
                enumC22072e = EnumC22072e.Hidden;
            }
        } else if (!z15) {
            if (z15) {
                int i1113 = i13 - 4;
                if (i14 > i16) {
                    if (!z15) {
                        if (!z16) {
                            if (!z16) {
                                if (z16) {
                                    enumC22072e = EnumC22072e.Hidden;
                                } else {
                                    enumC22072e = EnumC22072e.Hidden;
                                }
                            } else if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (!z16) {
                            if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (!z16) {
                        if (!z16) {
                            if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (!z16) {
                        if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (!z15) {
                    if (!z16) {
                        if (!z16) {
                            if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (!z16) {
                        if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (!z16) {
                    if (!z16) {
                        if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (!z16) {
                    if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (z16) {
                    enumC22072e = EnumC22072e.Hidden;
                } else {
                    enumC22072e = EnumC22072e.Hidden;
                }
            } else if (!z15) {
                if (!z16) {
                    if (!z16) {
                        if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (!z16) {
                    if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (z16) {
                    enumC22072e = EnumC22072e.Hidden;
                } else {
                    enumC22072e = EnumC22072e.Hidden;
                }
            } else if (!z16) {
                if (!z16) {
                    if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (z16) {
                    enumC22072e = EnumC22072e.Hidden;
                } else {
                    enumC22072e = EnumC22072e.Hidden;
                }
            } else if (!z16) {
                if (z16) {
                    enumC22072e = EnumC22072e.Hidden;
                } else {
                    enumC22072e = EnumC22072e.Hidden;
                }
            } else if (z16) {
                enumC22072e = EnumC22072e.Hidden;
            } else {
                enumC22072e = EnumC22072e.Hidden;
            }
        } else if (z15) {
            int i1114 = i13 - 4;
            if (i14 > i16) {
                if (!z15) {
                    if (!z16) {
                        if (!z16) {
                            if (z16) {
                                enumC22072e = EnumC22072e.Hidden;
                            } else {
                                enumC22072e = EnumC22072e.Hidden;
                            }
                        } else if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (!z16) {
                        if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (!z16) {
                    if (!z16) {
                        if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (!z16) {
                    if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (z16) {
                    enumC22072e = EnumC22072e.Hidden;
                } else {
                    enumC22072e = EnumC22072e.Hidden;
                }
            } else if (!z15) {
                if (!z16) {
                    if (!z16) {
                        if (z16) {
                            enumC22072e = EnumC22072e.Hidden;
                        } else {
                            enumC22072e = EnumC22072e.Hidden;
                        }
                    } else if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (!z16) {
                    if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (z16) {
                    enumC22072e = EnumC22072e.Hidden;
                } else {
                    enumC22072e = EnumC22072e.Hidden;
                }
            } else if (!z16) {
                if (!z16) {
                    if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (z16) {
                    enumC22072e = EnumC22072e.Hidden;
                } else {
                    enumC22072e = EnumC22072e.Hidden;
                }
            } else if (!z16) {
                if (z16) {
                    enumC22072e = EnumC22072e.Hidden;
                } else {
                    enumC22072e = EnumC22072e.Hidden;
                }
            } else if (z16) {
                enumC22072e = EnumC22072e.Hidden;
            } else {
                enumC22072e = EnumC22072e.Hidden;
            }
        } else if (!z15) {
            if (!z16) {
                if (!z16) {
                    if (z16) {
                        enumC22072e = EnumC22072e.Hidden;
                    } else {
                        enumC22072e = EnumC22072e.Hidden;
                    }
                } else if (z16) {
                    enumC22072e = EnumC22072e.Hidden;
                } else {
                    enumC22072e = EnumC22072e.Hidden;
                }
            } else if (!z16) {
                if (z16) {
                    enumC22072e = EnumC22072e.Hidden;
                } else {
                    enumC22072e = EnumC22072e.Hidden;
                }
            } else if (z16) {
                enumC22072e = EnumC22072e.Hidden;
            } else {
                enumC22072e = EnumC22072e.Hidden;
            }
        } else if (!z16) {
            if (!z16) {
                if (z16) {
                    enumC22072e = EnumC22072e.Hidden;
                } else {
                    enumC22072e = EnumC22072e.Hidden;
                }
            } else if (z16) {
                enumC22072e = EnumC22072e.Hidden;
            } else {
                enumC22072e = EnumC22072e.Hidden;
            }
        } else if (!z16) {
            if (z16) {
                enumC22072e = EnumC22072e.Hidden;
            } else {
                enumC22072e = EnumC22072e.Hidden;
            }
        } else if (z16) {
            enumC22072e = EnumC22072e.Hidden;
        } else {
            enumC22072e = EnumC22072e.Hidden;
        }
        return new C22071d(z17, enumC22072e);
    }
}
