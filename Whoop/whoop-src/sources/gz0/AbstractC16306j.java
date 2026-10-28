package gz0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4339a;
import d21.C11507e;
import f01.C13849c0;
import g40.C15369i3;
import gb1.AbstractC15673b0;
import ge3.AbstractC15751g;
import gw1.C16268a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17894k0;
import p208i2.C17909s;
import p208i2.C17919x;
import p208i2.InterfaceC17869a1;
import p291l0.AbstractC22989q;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: gz0.j */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aQ\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001aA\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001aA\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0003¢\u0006\u0004\b\u0011\u0010\u0010\u001aA\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0003¢\u0006\u0004\b\u0012\u0010\u0010\u001a\u000f\u0010\u0013\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a%\u0010\u0019\u001a\u00020\u0015*\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lo2/e;", "image", "Ly3/f;", "iconSize", "Lgz0/h;", "backgroundType", "", "isClickable", "", "contentDescription", "Lkotlin/Function0;", "Ll83/a0;", "onClick", "r", "(Lo2/e;FLgz0/h;ZLjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "A", "(Lo2/e;FZLjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "s", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "p", "(Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "width", "Li2/a1;", "shape", "J", "(Landroidx/compose/ui/Modifier;FLi2/a1;)Landroidx/compose/ui/Modifier;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC16306j {

    /* JADX INFO: renamed from: gz0.j$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f62606a;

        static {
            int[] iArr = new int[EnumC16302h.values().length];
            try {
                iArr[EnumC16302h.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC16302h.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC16302h.GLOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f62606a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x009a  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:69:0x0103  */
    /* JADX WARN: Code duplicated, block: B:72:0x010d  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: A */
    private static final void m46249A(C27430e c27430e, float f13, boolean z4, String str, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC4339a interfaceC4339a2;
        boolean z13;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a4;
        Modifier modifierM3362g;
        boolean z14;
        Object objM87133R;
        Object objM87133R2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1697974658);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(c27430e) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87147d(f13) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87155h(z4) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87153g(str) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i16 = i14 & 16;
        if (i16 == 0) {
            if ((i13 & 24576) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                i15 |= c28655q.m87157i(interfaceC4339a2) ? 16384 : DfuBaseService.ERROR_REMOTE_MASK;
            }
            if ((i15 & 9363) != 9362) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C16268a(25);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                long jM125430y = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                c28655q.m87150e0(-333915331);
                modifierM3362g = C2314t.f9131w;
                if (z4) {
                    c28655q.m87150e0(1352681563);
                    z14 = (57344 & i15) == 16384;
                    objM87133R = c28655q.m87133R();
                    if (z14 || objM87133R == c28676v0) {
                        objM87133R = new C15369i3(interfaceC4339a4, 9);
                        c28655q.m87172p0(objM87133R);
                    }
                    modifierM3362g = AbstractC1092a.m3362g(modifierM3362g, false, null, null, (InterfaceC4339a) objM87133R, 15);
                } else {
                    c28655q.m87150e0(1352682470);
                }
                c28655q.m87173q(false);
                Modifier modifier = modifierM3362g;
                c28655q.m87173q(false);
                AbstractC15005f3.m43108b(c27430e, str, AbstractC1102d.m3419p(f13, modifier), jM125430y, c28655q, (i15 & 14) | ((i15 >> 6) & 112), 0);
                interfaceC4339a3 = interfaceC4339a4;
            } else {
                c28655q.m87138X();
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C16304i(c27430e, f13, z4, str, interfaceC4339a3, i13, i14, 0);
            }
        }
        i15 |= 24576;
        interfaceC4339a2 = interfaceC4339a;
        if ((i15 & 9363) != 9362) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i15 & 1, z13)) {
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C16268a(25);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            long jM125430y2 = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
            c28655q.m87150e0(-333915331);
            modifierM3362g = C2314t.f9131w;
            if (z4) {
                c28655q.m87150e0(1352681563);
                if ((57344 & i15) == 16384) {
                }
                objM87133R = c28655q.m87133R();
                if (z14) {
                    objM87133R = new C15369i3(interfaceC4339a4, 9);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C15369i3(interfaceC4339a4, 9);
                    c28655q.m87172p0(objM87133R);
                }
                modifierM3362g = AbstractC1092a.m3362g(modifierM3362g, false, null, null, (InterfaceC4339a) objM87133R, 15);
            } else {
                c28655q.m87150e0(1352682470);
            }
            c28655q.m87173q(false);
            Modifier modifier2 = modifierM3362g;
            c28655q.m87173q(false);
            AbstractC15005f3.m43108b(c27430e, str, AbstractC1102d.m3419p(f13, modifier2), jM125430y2, c28655q, (i15 & 14) | ((i15 >> 6) & 112), 0);
            interfaceC4339a3 = interfaceC4339a4;
        } else {
            c28655q.m87138X();
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C16304i(c27430e, f13, z4, str, interfaceC4339a3, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m46250B() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m46251C(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m46252D(C27430e c27430e, float f13, boolean z4, String str, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m46249A(c27430e, f13, z4, str, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m46253E() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m46254F(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m46255G(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m46256H(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m46257I(C27430e c27430e, float f13, EnumC16302h enumC16302h, boolean z4, String str, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m46276r(c27430e, f13, enumC16302h, z4, str, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: J */
    public static final Modifier m46258J(Modifier aiCoachGradientBorder, float f13, InterfaceC17869a1 shape) {
        AbstractC22676k.m65750j(aiCoachGradientBorder, "$this$aiCoachGradientBorder");
        AbstractC22676k.m65750j(shape, "shape");
        return AbstractC15751g.m44456i(f13, aiCoachGradientBorder, AbstractC15673b0.m43972A(), shape);
    }

    /* JADX INFO: renamed from: p */
    private static final void m46274p(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1161868551);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            long jM51517e = AbstractC17918w0.m51517e(4283487743L);
            AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC1102d.m3419p(25 * 4, C2314t.f9131w), C17909s.m51489g(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.9f, jM51517e)), new C17919x(C17919x.m51541c(0.6f, jM51517e)), new C17919x(C17919x.m51541c(0.5f, jM51517e)), new C17919x(C17919x.m51541c(0.35f, jM51517e)), new C17919x(C17919x.m51541c(0.15f, jM51517e)), new C17919x(C17919x.m51541c(0.06f, jM51517e)), new C17919x(C17919x.f69636m)), 0L, 140.0f, 10), null, 0.0f, 6), c28655q, 6);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13849c0((byte) 0, i13, 12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m46275q(int i13, Composer composer, int i14) {
        m46274p(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0120  */
    /* JADX WARN: Code duplicated, block: B:103:0x0127 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:104:0x0129  */
    /* JADX WARN: Code duplicated, block: B:106:0x014b  */
    /* JADX WARN: Code duplicated, block: B:108:0x0154  */
    /* JADX WARN: Code duplicated, block: B:111:0x0162  */
    /* JADX WARN: Code duplicated, block: B:114:0x0169 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:115:0x016b  */
    /* JADX WARN: Code duplicated, block: B:117:0x018c  */
    /* JADX WARN: Code duplicated, block: B:120:0x019a  */
    /* JADX WARN: Code duplicated, block: B:123:0x01a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:124:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:127:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:130:0x01da  */
    /* JADX WARN: Code duplicated, block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x0085  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:58:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x009d  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:91:0x0100  */
    /* JADX WARN: Code duplicated, block: B:94:0x010e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0111 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x0113  */
    /* JADX INFO: renamed from: r */
    public static final void m46276r(C27430e image, float f13, EnumC16302h enumC16302h, boolean z4, String str, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        float f14;
        int i16;
        int iOrdinal;
        int i17;
        int i18;
        boolean z13;
        int i19;
        int i24;
        String str2;
        int i25;
        int i26;
        InterfaceC4339a interfaceC4339a2;
        int i27;
        boolean z14;
        EnumC16302h enumC16302h2;
        float f15;
        boolean z15;
        String str3;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        float f16;
        EnumC16302h enumC16302h3;
        int i28;
        boolean z16;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a4;
        int i29;
        boolean z17;
        Object objM87133R;
        String str4;
        Object objM87133R2;
        Object objM87133R3;
        Object objM87133R4;
        AbstractC22676k.m65750j(image, "image");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1315167417);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(image) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i34 = i14 & 2;
        if (i34 == 0) {
            if ((i13 & 48) == 0) {
                f14 = f13;
                i15 |= c28655q.m87147d(f14) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                i15 |= 384;
            } else if ((i13 & 384) == 0) {
                if (enumC16302h == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = enumC16302h.ordinal();
                }
                if (c28655q.m87149e(iOrdinal)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    z13 = z4;
                    if (c28655q.m87155h(z13)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        str2 = str;
                        if (c28655q.m87153g(str2)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    i26 = i14 & 32;
                    if (i26 != 0) {
                        if ((196608 & i13) == 0) {
                            interfaceC4339a2 = interfaceC4339a;
                            if (c28655q.m87157i(interfaceC4339a2)) {
                                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                            } else {
                                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                            }
                            i15 |= i27;
                        }
                        if ((i15 & 74899) != 74898) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c28655q.m87135U(i15 & 1, z14)) {
                            if (i34 != 0) {
                                f16 = 5 * 4;
                            } else {
                                f16 = f14;
                            }
                            if (i16 != 0) {
                                enumC16302h3 = EnumC16302h.NONE;
                            } else {
                                enumC16302h3 = enumC16302h;
                            }
                            i28 = i15;
                            if (i18 != 0) {
                                z16 = false;
                            } else {
                                z16 = z13;
                            }
                            if (i24 != 0) {
                                str2 = null;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i26 != 0) {
                                objM87133R4 = c28655q.m87133R();
                                if (objM87133R4 == c28676v0) {
                                    objM87133R4 = new C16268a(22);
                                    c28655q.m87172p0(objM87133R4);
                                }
                                interfaceC4339a4 = (InterfaceC4339a) objM87133R4;
                            } else {
                                interfaceC4339a4 = interfaceC4339a2;
                            }
                            i29 = a.f62606a[enumC16302h3.ordinal()];
                            if (i29 != 1) {
                                c28655q.m87150e0(1155514159);
                                z17 = (i28 & 458752) == 131072;
                                objM87133R = c28655q.m87133R();
                                if (z17 || objM87133R == c28676v0) {
                                    objM87133R = new C15369i3(interfaceC4339a4, 5);
                                    c28655q.m87172p0(objM87133R);
                                }
                                int i35 = i28 & 126;
                                int i36 = i28 >> 3;
                                int i37 = i35 | (i36 & 896) | (i36 & 7168);
                                str4 = str2;
                                m46249A(image, f16, z16, str4, (InterfaceC4339a) objM87133R, c28655q, i37, 0);
                                c28655q.m87173q(false);
                            } else if (i29 != 2) {
                                c28655q.m87150e0(1155518610);
                                z17 = (i28 & 458752) == 131072;
                                objM87133R2 = c28655q.m87133R();
                                if (z17 || objM87133R2 == c28676v0) {
                                    objM87133R2 = new C15369i3(interfaceC4339a4, 6);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                int i38 = i28 & 126;
                                int i39 = i28 >> 3;
                                int i44 = i38 | (i39 & 896) | (i39 & 7168);
                                str4 = str2;
                                m46277s(image, f16, z16, str4, (InterfaceC4339a) objM87133R2, c28655q, i44, 0);
                                c28655q.m87173q(false);
                            } else {
                                if (i29 == 3) {
                                    throw AbstractC11895b.m32003v(1155512180, c28655q, false);
                                }
                                c28655q.m87150e0(1155523055);
                                z17 = (i28 & 458752) == 131072;
                                objM87133R3 = c28655q.m87133R();
                                if (z17 || objM87133R3 == c28676v0) {
                                    objM87133R3 = new C15369i3(interfaceC4339a4, 7);
                                    c28655q.m87172p0(objM87133R3);
                                }
                                int i45 = i28 & 126;
                                int i46 = i28 >> 3;
                                int i47 = i45 | (i46 & 896) | (i46 & 7168);
                                str4 = str2;
                                m46281w(image, f16, z16, str4, (InterfaceC4339a) objM87133R3, c28655q, i47, 0);
                                c28655q.m87173q(false);
                            }
                            z15 = z16;
                            interfaceC4339a3 = interfaceC4339a4;
                            f15 = f16;
                            str3 = str4;
                            enumC16302h2 = enumC16302h3;
                        } else {
                            c28655q.m87138X();
                            enumC16302h2 = enumC16302h;
                            f15 = f14;
                            z15 = z13;
                            str3 = str2;
                            interfaceC4339a3 = interfaceC4339a2;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new C11507e(image, f15, enumC16302h2, z15, str3, interfaceC4339a3, i13, i14);
                        }
                    }
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    interfaceC4339a2 = interfaceC4339a;
                    if ((i15 & 74899) != 74898) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z14)) {
                        if (i34 != 0) {
                            f16 = 5 * 4;
                        } else {
                            f16 = f14;
                        }
                        if (i16 != 0) {
                            enumC16302h3 = EnumC16302h.NONE;
                        } else {
                            enumC16302h3 = enumC16302h;
                        }
                        i28 = i15;
                        if (i18 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if (i24 != 0) {
                            str2 = null;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i26 != 0) {
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C16268a(22);
                                c28655q.m87172p0(objM87133R4);
                            }
                            interfaceC4339a4 = (InterfaceC4339a) objM87133R4;
                        } else {
                            interfaceC4339a4 = interfaceC4339a2;
                        }
                        i29 = a.f62606a[enumC16302h3.ordinal()];
                        if (i29 != 1) {
                            c28655q.m87150e0(1155514159);
                            if ((i28 & 458752) == 131072) {
                            }
                            objM87133R = c28655q.m87133R();
                            if (z17) {
                                objM87133R = new C15369i3(interfaceC4339a4, 5);
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = new C15369i3(interfaceC4339a4, 5);
                                c28655q.m87172p0(objM87133R);
                            }
                            int i310 = i28 & 126;
                            int i311 = i28 >> 3;
                            int i312 = i310 | (i311 & 896) | (i311 & 7168);
                            str4 = str2;
                            m46249A(image, f16, z16, str4, (InterfaceC4339a) objM87133R, c28655q, i312, 0);
                            c28655q.m87173q(false);
                        } else if (i29 != 2) {
                            c28655q.m87150e0(1155518610);
                            if ((i28 & 458752) == 131072) {
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (z17) {
                                objM87133R2 = new C15369i3(interfaceC4339a4, 6);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C15369i3(interfaceC4339a4, 6);
                                c28655q.m87172p0(objM87133R2);
                            }
                            int i313 = i28 & 126;
                            int i314 = i28 >> 3;
                            int i48 = i313 | (i314 & 896) | (i314 & 7168);
                            str4 = str2;
                            m46277s(image, f16, z16, str4, (InterfaceC4339a) objM87133R2, c28655q, i48, 0);
                            c28655q.m87173q(false);
                        } else {
                            if (i29 == 3) {
                                throw AbstractC11895b.m32003v(1155512180, c28655q, false);
                            }
                            c28655q.m87150e0(1155523055);
                            if ((i28 & 458752) == 131072) {
                            }
                            objM87133R3 = c28655q.m87133R();
                            if (z17) {
                                objM87133R3 = new C15369i3(interfaceC4339a4, 7);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C15369i3(interfaceC4339a4, 7);
                                c28655q.m87172p0(objM87133R3);
                            }
                            int i49 = i28 & 126;
                            int i410 = i28 >> 3;
                            int i411 = i49 | (i410 & 896) | (i410 & 7168);
                            str4 = str2;
                            m46281w(image, f16, z16, str4, (InterfaceC4339a) objM87133R3, c28655q, i411, 0);
                            c28655q.m87173q(false);
                        }
                        z15 = z16;
                        interfaceC4339a3 = interfaceC4339a4;
                        f15 = f16;
                        str3 = str4;
                        enumC16302h2 = enumC16302h3;
                    } else {
                        c28655q.m87138X();
                        enumC16302h2 = enumC16302h;
                        f15 = f14;
                        z15 = z13;
                        str3 = str2;
                        interfaceC4339a3 = interfaceC4339a2;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C11507e(image, f15, enumC16302h2, z15, str3, interfaceC4339a3, i13, i14);
                    }
                }
                i15 |= 24576;
                str2 = str;
                i26 = i14 & 32;
                if (i26 != 0) {
                    if ((196608 & i13) == 0) {
                        interfaceC4339a2 = interfaceC4339a;
                        if (c28655q.m87157i(interfaceC4339a2)) {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i27;
                    }
                    if ((i15 & 74899) != 74898) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z14)) {
                        if (i34 != 0) {
                            f16 = 5 * 4;
                        } else {
                            f16 = f14;
                        }
                        if (i16 != 0) {
                            enumC16302h3 = EnumC16302h.NONE;
                        } else {
                            enumC16302h3 = enumC16302h;
                        }
                        i28 = i15;
                        if (i18 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if (i24 != 0) {
                            str2 = null;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i26 != 0) {
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C16268a(22);
                                c28655q.m87172p0(objM87133R4);
                            }
                            interfaceC4339a4 = (InterfaceC4339a) objM87133R4;
                        } else {
                            interfaceC4339a4 = interfaceC4339a2;
                        }
                        i29 = a.f62606a[enumC16302h3.ordinal()];
                        if (i29 != 1) {
                            c28655q.m87150e0(1155514159);
                            if ((i28 & 458752) == 131072) {
                            }
                            objM87133R = c28655q.m87133R();
                            if (z17) {
                                objM87133R = new C15369i3(interfaceC4339a4, 5);
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = new C15369i3(interfaceC4339a4, 5);
                                c28655q.m87172p0(objM87133R);
                            }
                            int i315 = i28 & 126;
                            int i316 = i28 >> 3;
                            int i317 = i315 | (i316 & 896) | (i316 & 7168);
                            str4 = str2;
                            m46249A(image, f16, z16, str4, (InterfaceC4339a) objM87133R, c28655q, i317, 0);
                            c28655q.m87173q(false);
                        } else if (i29 != 2) {
                            c28655q.m87150e0(1155518610);
                            if ((i28 & 458752) == 131072) {
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (z17) {
                                objM87133R2 = new C15369i3(interfaceC4339a4, 6);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C15369i3(interfaceC4339a4, 6);
                                c28655q.m87172p0(objM87133R2);
                            }
                            int i318 = i28 & 126;
                            int i319 = i28 >> 3;
                            int i412 = i318 | (i319 & 896) | (i319 & 7168);
                            str4 = str2;
                            m46277s(image, f16, z16, str4, (InterfaceC4339a) objM87133R2, c28655q, i412, 0);
                            c28655q.m87173q(false);
                        } else {
                            if (i29 == 3) {
                                throw AbstractC11895b.m32003v(1155512180, c28655q, false);
                            }
                            c28655q.m87150e0(1155523055);
                            if ((i28 & 458752) == 131072) {
                            }
                            objM87133R3 = c28655q.m87133R();
                            if (z17) {
                                objM87133R3 = new C15369i3(interfaceC4339a4, 7);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C15369i3(interfaceC4339a4, 7);
                                c28655q.m87172p0(objM87133R3);
                            }
                            int i413 = i28 & 126;
                            int i414 = i28 >> 3;
                            int i415 = i413 | (i414 & 896) | (i414 & 7168);
                            str4 = str2;
                            m46281w(image, f16, z16, str4, (InterfaceC4339a) objM87133R3, c28655q, i415, 0);
                            c28655q.m87173q(false);
                        }
                        z15 = z16;
                        interfaceC4339a3 = interfaceC4339a4;
                        f15 = f16;
                        str3 = str4;
                        enumC16302h2 = enumC16302h3;
                    } else {
                        c28655q.m87138X();
                        enumC16302h2 = enumC16302h;
                        f15 = f14;
                        z15 = z13;
                        str3 = str2;
                        interfaceC4339a3 = interfaceC4339a2;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C11507e(image, f15, enumC16302h2, z15, str3, interfaceC4339a3, i13, i14);
                    }
                }
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                interfaceC4339a2 = interfaceC4339a;
                if ((i15 & 74899) != 74898) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    if (i34 != 0) {
                        f16 = 5 * 4;
                    } else {
                        f16 = f14;
                    }
                    if (i16 != 0) {
                        enumC16302h3 = EnumC16302h.NONE;
                    } else {
                        enumC16302h3 = enumC16302h;
                    }
                    i28 = i15;
                    if (i18 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if (i24 != 0) {
                        str2 = null;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i26 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C16268a(22);
                            c28655q.m87172p0(objM87133R4);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R4;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    i29 = a.f62606a[enumC16302h3.ordinal()];
                    if (i29 != 1) {
                        c28655q.m87150e0(1155514159);
                        if ((i28 & 458752) == 131072) {
                        }
                        objM87133R = c28655q.m87133R();
                        if (z17) {
                            objM87133R = new C15369i3(interfaceC4339a4, 5);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C15369i3(interfaceC4339a4, 5);
                            c28655q.m87172p0(objM87133R);
                        }
                        int i3110 = i28 & 126;
                        int i3111 = i28 >> 3;
                        int i3112 = i3110 | (i3111 & 896) | (i3111 & 7168);
                        str4 = str2;
                        m46249A(image, f16, z16, str4, (InterfaceC4339a) objM87133R, c28655q, i3112, 0);
                        c28655q.m87173q(false);
                    } else if (i29 != 2) {
                        c28655q.m87150e0(1155518610);
                        if ((i28 & 458752) == 131072) {
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z17) {
                            objM87133R2 = new C15369i3(interfaceC4339a4, 6);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C15369i3(interfaceC4339a4, 6);
                            c28655q.m87172p0(objM87133R2);
                        }
                        int i3113 = i28 & 126;
                        int i3114 = i28 >> 3;
                        int i416 = i3113 | (i3114 & 896) | (i3114 & 7168);
                        str4 = str2;
                        m46277s(image, f16, z16, str4, (InterfaceC4339a) objM87133R2, c28655q, i416, 0);
                        c28655q.m87173q(false);
                    } else {
                        if (i29 == 3) {
                            throw AbstractC11895b.m32003v(1155512180, c28655q, false);
                        }
                        c28655q.m87150e0(1155523055);
                        if ((i28 & 458752) == 131072) {
                        }
                        objM87133R3 = c28655q.m87133R();
                        if (z17) {
                            objM87133R3 = new C15369i3(interfaceC4339a4, 7);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C15369i3(interfaceC4339a4, 7);
                            c28655q.m87172p0(objM87133R3);
                        }
                        int i417 = i28 & 126;
                        int i418 = i28 >> 3;
                        int i419 = i417 | (i418 & 896) | (i418 & 7168);
                        str4 = str2;
                        m46281w(image, f16, z16, str4, (InterfaceC4339a) objM87133R3, c28655q, i419, 0);
                        c28655q.m87173q(false);
                    }
                    z15 = z16;
                    interfaceC4339a3 = interfaceC4339a4;
                    f15 = f16;
                    str3 = str4;
                    enumC16302h2 = enumC16302h3;
                } else {
                    c28655q.m87138X();
                    enumC16302h2 = enumC16302h;
                    f15 = f14;
                    z15 = z13;
                    str3 = str2;
                    interfaceC4339a3 = interfaceC4339a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C11507e(image, f15, enumC16302h2, z15, str3, interfaceC4339a3, i13, i14);
                }
            }
            i15 |= 3072;
            z13 = z4;
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    str2 = str;
                    if (c28655q.m87153g(str2)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 32;
                if (i26 != 0) {
                    if ((196608 & i13) == 0) {
                        interfaceC4339a2 = interfaceC4339a;
                        if (c28655q.m87157i(interfaceC4339a2)) {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i27;
                    }
                    if ((i15 & 74899) != 74898) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z14)) {
                        if (i34 != 0) {
                            f16 = 5 * 4;
                        } else {
                            f16 = f14;
                        }
                        if (i16 != 0) {
                            enumC16302h3 = EnumC16302h.NONE;
                        } else {
                            enumC16302h3 = enumC16302h;
                        }
                        i28 = i15;
                        if (i18 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if (i24 != 0) {
                            str2 = null;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i26 != 0) {
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C16268a(22);
                                c28655q.m87172p0(objM87133R4);
                            }
                            interfaceC4339a4 = (InterfaceC4339a) objM87133R4;
                        } else {
                            interfaceC4339a4 = interfaceC4339a2;
                        }
                        i29 = a.f62606a[enumC16302h3.ordinal()];
                        if (i29 != 1) {
                            c28655q.m87150e0(1155514159);
                            if ((i28 & 458752) == 131072) {
                            }
                            objM87133R = c28655q.m87133R();
                            if (z17) {
                                objM87133R = new C15369i3(interfaceC4339a4, 5);
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = new C15369i3(interfaceC4339a4, 5);
                                c28655q.m87172p0(objM87133R);
                            }
                            int i3115 = i28 & 126;
                            int i3116 = i28 >> 3;
                            int i3117 = i3115 | (i3116 & 896) | (i3116 & 7168);
                            str4 = str2;
                            m46249A(image, f16, z16, str4, (InterfaceC4339a) objM87133R, c28655q, i3117, 0);
                            c28655q.m87173q(false);
                        } else if (i29 != 2) {
                            c28655q.m87150e0(1155518610);
                            if ((i28 & 458752) == 131072) {
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (z17) {
                                objM87133R2 = new C15369i3(interfaceC4339a4, 6);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C15369i3(interfaceC4339a4, 6);
                                c28655q.m87172p0(objM87133R2);
                            }
                            int i3118 = i28 & 126;
                            int i3119 = i28 >> 3;
                            int i4110 = i3118 | (i3119 & 896) | (i3119 & 7168);
                            str4 = str2;
                            m46277s(image, f16, z16, str4, (InterfaceC4339a) objM87133R2, c28655q, i4110, 0);
                            c28655q.m87173q(false);
                        } else {
                            if (i29 == 3) {
                                throw AbstractC11895b.m32003v(1155512180, c28655q, false);
                            }
                            c28655q.m87150e0(1155523055);
                            if ((i28 & 458752) == 131072) {
                            }
                            objM87133R3 = c28655q.m87133R();
                            if (z17) {
                                objM87133R3 = new C15369i3(interfaceC4339a4, 7);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C15369i3(interfaceC4339a4, 7);
                                c28655q.m87172p0(objM87133R3);
                            }
                            int i4111 = i28 & 126;
                            int i4112 = i28 >> 3;
                            int i4113 = i4111 | (i4112 & 896) | (i4112 & 7168);
                            str4 = str2;
                            m46281w(image, f16, z16, str4, (InterfaceC4339a) objM87133R3, c28655q, i4113, 0);
                            c28655q.m87173q(false);
                        }
                        z15 = z16;
                        interfaceC4339a3 = interfaceC4339a4;
                        f15 = f16;
                        str3 = str4;
                        enumC16302h2 = enumC16302h3;
                    } else {
                        c28655q.m87138X();
                        enumC16302h2 = enumC16302h;
                        f15 = f14;
                        z15 = z13;
                        str3 = str2;
                        interfaceC4339a3 = interfaceC4339a2;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C11507e(image, f15, enumC16302h2, z15, str3, interfaceC4339a3, i13, i14);
                    }
                }
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                interfaceC4339a2 = interfaceC4339a;
                if ((i15 & 74899) != 74898) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    if (i34 != 0) {
                        f16 = 5 * 4;
                    } else {
                        f16 = f14;
                    }
                    if (i16 != 0) {
                        enumC16302h3 = EnumC16302h.NONE;
                    } else {
                        enumC16302h3 = enumC16302h;
                    }
                    i28 = i15;
                    if (i18 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if (i24 != 0) {
                        str2 = null;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i26 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C16268a(22);
                            c28655q.m87172p0(objM87133R4);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R4;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    i29 = a.f62606a[enumC16302h3.ordinal()];
                    if (i29 != 1) {
                        c28655q.m87150e0(1155514159);
                        if ((i28 & 458752) == 131072) {
                        }
                        objM87133R = c28655q.m87133R();
                        if (z17) {
                            objM87133R = new C15369i3(interfaceC4339a4, 5);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C15369i3(interfaceC4339a4, 5);
                            c28655q.m87172p0(objM87133R);
                        }
                        int i31110 = i28 & 126;
                        int i31111 = i28 >> 3;
                        int i31112 = i31110 | (i31111 & 896) | (i31111 & 7168);
                        str4 = str2;
                        m46249A(image, f16, z16, str4, (InterfaceC4339a) objM87133R, c28655q, i31112, 0);
                        c28655q.m87173q(false);
                    } else if (i29 != 2) {
                        c28655q.m87150e0(1155518610);
                        if ((i28 & 458752) == 131072) {
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z17) {
                            objM87133R2 = new C15369i3(interfaceC4339a4, 6);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C15369i3(interfaceC4339a4, 6);
                            c28655q.m87172p0(objM87133R2);
                        }
                        int i31113 = i28 & 126;
                        int i31114 = i28 >> 3;
                        int i4114 = i31113 | (i31114 & 896) | (i31114 & 7168);
                        str4 = str2;
                        m46277s(image, f16, z16, str4, (InterfaceC4339a) objM87133R2, c28655q, i4114, 0);
                        c28655q.m87173q(false);
                    } else {
                        if (i29 == 3) {
                            throw AbstractC11895b.m32003v(1155512180, c28655q, false);
                        }
                        c28655q.m87150e0(1155523055);
                        if ((i28 & 458752) == 131072) {
                        }
                        objM87133R3 = c28655q.m87133R();
                        if (z17) {
                            objM87133R3 = new C15369i3(interfaceC4339a4, 7);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C15369i3(interfaceC4339a4, 7);
                            c28655q.m87172p0(objM87133R3);
                        }
                        int i4115 = i28 & 126;
                        int i4116 = i28 >> 3;
                        int i4117 = i4115 | (i4116 & 896) | (i4116 & 7168);
                        str4 = str2;
                        m46281w(image, f16, z16, str4, (InterfaceC4339a) objM87133R3, c28655q, i4117, 0);
                        c28655q.m87173q(false);
                    }
                    z15 = z16;
                    interfaceC4339a3 = interfaceC4339a4;
                    f15 = f16;
                    str3 = str4;
                    enumC16302h2 = enumC16302h3;
                } else {
                    c28655q.m87138X();
                    enumC16302h2 = enumC16302h;
                    f15 = f14;
                    z15 = z13;
                    str3 = str2;
                    interfaceC4339a3 = interfaceC4339a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C11507e(image, f15, enumC16302h2, z15, str3, interfaceC4339a3, i13, i14);
                }
            }
            i15 |= 24576;
            str2 = str;
            i26 = i14 & 32;
            if (i26 != 0) {
                if ((196608 & i13) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q.m87157i(interfaceC4339a2)) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i27;
                }
                if ((i15 & 74899) != 74898) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    if (i34 != 0) {
                        f16 = 5 * 4;
                    } else {
                        f16 = f14;
                    }
                    if (i16 != 0) {
                        enumC16302h3 = EnumC16302h.NONE;
                    } else {
                        enumC16302h3 = enumC16302h;
                    }
                    i28 = i15;
                    if (i18 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if (i24 != 0) {
                        str2 = null;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i26 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C16268a(22);
                            c28655q.m87172p0(objM87133R4);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R4;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    i29 = a.f62606a[enumC16302h3.ordinal()];
                    if (i29 != 1) {
                        c28655q.m87150e0(1155514159);
                        if ((i28 & 458752) == 131072) {
                        }
                        objM87133R = c28655q.m87133R();
                        if (z17) {
                            objM87133R = new C15369i3(interfaceC4339a4, 5);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C15369i3(interfaceC4339a4, 5);
                            c28655q.m87172p0(objM87133R);
                        }
                        int i31115 = i28 & 126;
                        int i31116 = i28 >> 3;
                        int i31117 = i31115 | (i31116 & 896) | (i31116 & 7168);
                        str4 = str2;
                        m46249A(image, f16, z16, str4, (InterfaceC4339a) objM87133R, c28655q, i31117, 0);
                        c28655q.m87173q(false);
                    } else if (i29 != 2) {
                        c28655q.m87150e0(1155518610);
                        if ((i28 & 458752) == 131072) {
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z17) {
                            objM87133R2 = new C15369i3(interfaceC4339a4, 6);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C15369i3(interfaceC4339a4, 6);
                            c28655q.m87172p0(objM87133R2);
                        }
                        int i31118 = i28 & 126;
                        int i31119 = i28 >> 3;
                        int i4118 = i31118 | (i31119 & 896) | (i31119 & 7168);
                        str4 = str2;
                        m46277s(image, f16, z16, str4, (InterfaceC4339a) objM87133R2, c28655q, i4118, 0);
                        c28655q.m87173q(false);
                    } else {
                        if (i29 == 3) {
                            throw AbstractC11895b.m32003v(1155512180, c28655q, false);
                        }
                        c28655q.m87150e0(1155523055);
                        if ((i28 & 458752) == 131072) {
                        }
                        objM87133R3 = c28655q.m87133R();
                        if (z17) {
                            objM87133R3 = new C15369i3(interfaceC4339a4, 7);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C15369i3(interfaceC4339a4, 7);
                            c28655q.m87172p0(objM87133R3);
                        }
                        int i4119 = i28 & 126;
                        int i41110 = i28 >> 3;
                        int i41111 = i4119 | (i41110 & 896) | (i41110 & 7168);
                        str4 = str2;
                        m46281w(image, f16, z16, str4, (InterfaceC4339a) objM87133R3, c28655q, i41111, 0);
                        c28655q.m87173q(false);
                    }
                    z15 = z16;
                    interfaceC4339a3 = interfaceC4339a4;
                    f15 = f16;
                    str3 = str4;
                    enumC16302h2 = enumC16302h3;
                } else {
                    c28655q.m87138X();
                    enumC16302h2 = enumC16302h;
                    f15 = f14;
                    z15 = z13;
                    str3 = str2;
                    interfaceC4339a3 = interfaceC4339a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C11507e(image, f15, enumC16302h2, z15, str3, interfaceC4339a3, i13, i14);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            interfaceC4339a2 = interfaceC4339a;
            if ((i15 & 74899) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i34 != 0) {
                    f16 = 5 * 4;
                } else {
                    f16 = f14;
                }
                if (i16 != 0) {
                    enumC16302h3 = EnumC16302h.NONE;
                } else {
                    enumC16302h3 = enumC16302h;
                }
                i28 = i15;
                if (i18 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                if (i24 != 0) {
                    str2 = null;
                }
                c28676v0 = C28635l.f115821a;
                if (i26 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C16268a(22);
                        c28655q.m87172p0(objM87133R4);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R4;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                i29 = a.f62606a[enumC16302h3.ordinal()];
                if (i29 != 1) {
                    c28655q.m87150e0(1155514159);
                    if ((i28 & 458752) == 131072) {
                    }
                    objM87133R = c28655q.m87133R();
                    if (z17) {
                        objM87133R = new C15369i3(interfaceC4339a4, 5);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C15369i3(interfaceC4339a4, 5);
                        c28655q.m87172p0(objM87133R);
                    }
                    int i311110 = i28 & 126;
                    int i311111 = i28 >> 3;
                    int i311112 = i311110 | (i311111 & 896) | (i311111 & 7168);
                    str4 = str2;
                    m46249A(image, f16, z16, str4, (InterfaceC4339a) objM87133R, c28655q, i311112, 0);
                    c28655q.m87173q(false);
                } else if (i29 != 2) {
                    c28655q.m87150e0(1155518610);
                    if ((i28 & 458752) == 131072) {
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z17) {
                        objM87133R2 = new C15369i3(interfaceC4339a4, 6);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C15369i3(interfaceC4339a4, 6);
                        c28655q.m87172p0(objM87133R2);
                    }
                    int i311113 = i28 & 126;
                    int i311114 = i28 >> 3;
                    int i41112 = i311113 | (i311114 & 896) | (i311114 & 7168);
                    str4 = str2;
                    m46277s(image, f16, z16, str4, (InterfaceC4339a) objM87133R2, c28655q, i41112, 0);
                    c28655q.m87173q(false);
                } else {
                    if (i29 == 3) {
                        throw AbstractC11895b.m32003v(1155512180, c28655q, false);
                    }
                    c28655q.m87150e0(1155523055);
                    if ((i28 & 458752) == 131072) {
                    }
                    objM87133R3 = c28655q.m87133R();
                    if (z17) {
                        objM87133R3 = new C15369i3(interfaceC4339a4, 7);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C15369i3(interfaceC4339a4, 7);
                        c28655q.m87172p0(objM87133R3);
                    }
                    int i41113 = i28 & 126;
                    int i41114 = i28 >> 3;
                    int i41115 = i41113 | (i41114 & 896) | (i41114 & 7168);
                    str4 = str2;
                    m46281w(image, f16, z16, str4, (InterfaceC4339a) objM87133R3, c28655q, i41115, 0);
                    c28655q.m87173q(false);
                }
                z15 = z16;
                interfaceC4339a3 = interfaceC4339a4;
                f15 = f16;
                str3 = str4;
                enumC16302h2 = enumC16302h3;
            } else {
                c28655q.m87138X();
                enumC16302h2 = enumC16302h;
                f15 = f14;
                z15 = z13;
                str3 = str2;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C11507e(image, f15, enumC16302h2, z15, str3, interfaceC4339a3, i13, i14);
            }
        }
        i15 |= 48;
        f14 = f13;
        i16 = i14 & 4;
        if (i16 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            if (enumC16302h == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = enumC16302h.ordinal();
            }
            if (c28655q.m87149e(iOrdinal)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i15 |= i17;
        }
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                z13 = z4;
                if (c28655q.m87155h(z13)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    str2 = str;
                    if (c28655q.m87153g(str2)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 32;
                if (i26 != 0) {
                    if ((196608 & i13) == 0) {
                        interfaceC4339a2 = interfaceC4339a;
                        if (c28655q.m87157i(interfaceC4339a2)) {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i27;
                    }
                    if ((i15 & 74899) != 74898) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z14)) {
                        if (i34 != 0) {
                            f16 = 5 * 4;
                        } else {
                            f16 = f14;
                        }
                        if (i16 != 0) {
                            enumC16302h3 = EnumC16302h.NONE;
                        } else {
                            enumC16302h3 = enumC16302h;
                        }
                        i28 = i15;
                        if (i18 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if (i24 != 0) {
                            str2 = null;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i26 != 0) {
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C16268a(22);
                                c28655q.m87172p0(objM87133R4);
                            }
                            interfaceC4339a4 = (InterfaceC4339a) objM87133R4;
                        } else {
                            interfaceC4339a4 = interfaceC4339a2;
                        }
                        i29 = a.f62606a[enumC16302h3.ordinal()];
                        if (i29 != 1) {
                            c28655q.m87150e0(1155514159);
                            if ((i28 & 458752) == 131072) {
                            }
                            objM87133R = c28655q.m87133R();
                            if (z17) {
                                objM87133R = new C15369i3(interfaceC4339a4, 5);
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = new C15369i3(interfaceC4339a4, 5);
                                c28655q.m87172p0(objM87133R);
                            }
                            int i311115 = i28 & 126;
                            int i311116 = i28 >> 3;
                            int i311117 = i311115 | (i311116 & 896) | (i311116 & 7168);
                            str4 = str2;
                            m46249A(image, f16, z16, str4, (InterfaceC4339a) objM87133R, c28655q, i311117, 0);
                            c28655q.m87173q(false);
                        } else if (i29 != 2) {
                            c28655q.m87150e0(1155518610);
                            if ((i28 & 458752) == 131072) {
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (z17) {
                                objM87133R2 = new C15369i3(interfaceC4339a4, 6);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C15369i3(interfaceC4339a4, 6);
                                c28655q.m87172p0(objM87133R2);
                            }
                            int i311118 = i28 & 126;
                            int i311119 = i28 >> 3;
                            int i41116 = i311118 | (i311119 & 896) | (i311119 & 7168);
                            str4 = str2;
                            m46277s(image, f16, z16, str4, (InterfaceC4339a) objM87133R2, c28655q, i41116, 0);
                            c28655q.m87173q(false);
                        } else {
                            if (i29 == 3) {
                                throw AbstractC11895b.m32003v(1155512180, c28655q, false);
                            }
                            c28655q.m87150e0(1155523055);
                            if ((i28 & 458752) == 131072) {
                            }
                            objM87133R3 = c28655q.m87133R();
                            if (z17) {
                                objM87133R3 = new C15369i3(interfaceC4339a4, 7);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C15369i3(interfaceC4339a4, 7);
                                c28655q.m87172p0(objM87133R3);
                            }
                            int i41117 = i28 & 126;
                            int i41118 = i28 >> 3;
                            int i41119 = i41117 | (i41118 & 896) | (i41118 & 7168);
                            str4 = str2;
                            m46281w(image, f16, z16, str4, (InterfaceC4339a) objM87133R3, c28655q, i41119, 0);
                            c28655q.m87173q(false);
                        }
                        z15 = z16;
                        interfaceC4339a3 = interfaceC4339a4;
                        f15 = f16;
                        str3 = str4;
                        enumC16302h2 = enumC16302h3;
                    } else {
                        c28655q.m87138X();
                        enumC16302h2 = enumC16302h;
                        f15 = f14;
                        z15 = z13;
                        str3 = str2;
                        interfaceC4339a3 = interfaceC4339a2;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C11507e(image, f15, enumC16302h2, z15, str3, interfaceC4339a3, i13, i14);
                    }
                }
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                interfaceC4339a2 = interfaceC4339a;
                if ((i15 & 74899) != 74898) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    if (i34 != 0) {
                        f16 = 5 * 4;
                    } else {
                        f16 = f14;
                    }
                    if (i16 != 0) {
                        enumC16302h3 = EnumC16302h.NONE;
                    } else {
                        enumC16302h3 = enumC16302h;
                    }
                    i28 = i15;
                    if (i18 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if (i24 != 0) {
                        str2 = null;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i26 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C16268a(22);
                            c28655q.m87172p0(objM87133R4);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R4;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    i29 = a.f62606a[enumC16302h3.ordinal()];
                    if (i29 != 1) {
                        c28655q.m87150e0(1155514159);
                        if ((i28 & 458752) == 131072) {
                        }
                        objM87133R = c28655q.m87133R();
                        if (z17) {
                            objM87133R = new C15369i3(interfaceC4339a4, 5);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C15369i3(interfaceC4339a4, 5);
                            c28655q.m87172p0(objM87133R);
                        }
                        int i3111110 = i28 & 126;
                        int i3111111 = i28 >> 3;
                        int i3111112 = i3111110 | (i3111111 & 896) | (i3111111 & 7168);
                        str4 = str2;
                        m46249A(image, f16, z16, str4, (InterfaceC4339a) objM87133R, c28655q, i3111112, 0);
                        c28655q.m87173q(false);
                    } else if (i29 != 2) {
                        c28655q.m87150e0(1155518610);
                        if ((i28 & 458752) == 131072) {
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z17) {
                            objM87133R2 = new C15369i3(interfaceC4339a4, 6);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C15369i3(interfaceC4339a4, 6);
                            c28655q.m87172p0(objM87133R2);
                        }
                        int i3111113 = i28 & 126;
                        int i3111114 = i28 >> 3;
                        int i411110 = i3111113 | (i3111114 & 896) | (i3111114 & 7168);
                        str4 = str2;
                        m46277s(image, f16, z16, str4, (InterfaceC4339a) objM87133R2, c28655q, i411110, 0);
                        c28655q.m87173q(false);
                    } else {
                        if (i29 == 3) {
                            throw AbstractC11895b.m32003v(1155512180, c28655q, false);
                        }
                        c28655q.m87150e0(1155523055);
                        if ((i28 & 458752) == 131072) {
                        }
                        objM87133R3 = c28655q.m87133R();
                        if (z17) {
                            objM87133R3 = new C15369i3(interfaceC4339a4, 7);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C15369i3(interfaceC4339a4, 7);
                            c28655q.m87172p0(objM87133R3);
                        }
                        int i411111 = i28 & 126;
                        int i411112 = i28 >> 3;
                        int i411113 = i411111 | (i411112 & 896) | (i411112 & 7168);
                        str4 = str2;
                        m46281w(image, f16, z16, str4, (InterfaceC4339a) objM87133R3, c28655q, i411113, 0);
                        c28655q.m87173q(false);
                    }
                    z15 = z16;
                    interfaceC4339a3 = interfaceC4339a4;
                    f15 = f16;
                    str3 = str4;
                    enumC16302h2 = enumC16302h3;
                } else {
                    c28655q.m87138X();
                    enumC16302h2 = enumC16302h;
                    f15 = f14;
                    z15 = z13;
                    str3 = str2;
                    interfaceC4339a3 = interfaceC4339a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C11507e(image, f15, enumC16302h2, z15, str3, interfaceC4339a3, i13, i14);
                }
            }
            i15 |= 24576;
            str2 = str;
            i26 = i14 & 32;
            if (i26 != 0) {
                if ((196608 & i13) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q.m87157i(interfaceC4339a2)) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i27;
                }
                if ((i15 & 74899) != 74898) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    if (i34 != 0) {
                        f16 = 5 * 4;
                    } else {
                        f16 = f14;
                    }
                    if (i16 != 0) {
                        enumC16302h3 = EnumC16302h.NONE;
                    } else {
                        enumC16302h3 = enumC16302h;
                    }
                    i28 = i15;
                    if (i18 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if (i24 != 0) {
                        str2 = null;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i26 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C16268a(22);
                            c28655q.m87172p0(objM87133R4);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R4;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    i29 = a.f62606a[enumC16302h3.ordinal()];
                    if (i29 != 1) {
                        c28655q.m87150e0(1155514159);
                        if ((i28 & 458752) == 131072) {
                        }
                        objM87133R = c28655q.m87133R();
                        if (z17) {
                            objM87133R = new C15369i3(interfaceC4339a4, 5);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C15369i3(interfaceC4339a4, 5);
                            c28655q.m87172p0(objM87133R);
                        }
                        int i3111115 = i28 & 126;
                        int i3111116 = i28 >> 3;
                        int i3111117 = i3111115 | (i3111116 & 896) | (i3111116 & 7168);
                        str4 = str2;
                        m46249A(image, f16, z16, str4, (InterfaceC4339a) objM87133R, c28655q, i3111117, 0);
                        c28655q.m87173q(false);
                    } else if (i29 != 2) {
                        c28655q.m87150e0(1155518610);
                        if ((i28 & 458752) == 131072) {
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z17) {
                            objM87133R2 = new C15369i3(interfaceC4339a4, 6);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C15369i3(interfaceC4339a4, 6);
                            c28655q.m87172p0(objM87133R2);
                        }
                        int i3111118 = i28 & 126;
                        int i3111119 = i28 >> 3;
                        int i411114 = i3111118 | (i3111119 & 896) | (i3111119 & 7168);
                        str4 = str2;
                        m46277s(image, f16, z16, str4, (InterfaceC4339a) objM87133R2, c28655q, i411114, 0);
                        c28655q.m87173q(false);
                    } else {
                        if (i29 == 3) {
                            throw AbstractC11895b.m32003v(1155512180, c28655q, false);
                        }
                        c28655q.m87150e0(1155523055);
                        if ((i28 & 458752) == 131072) {
                        }
                        objM87133R3 = c28655q.m87133R();
                        if (z17) {
                            objM87133R3 = new C15369i3(interfaceC4339a4, 7);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C15369i3(interfaceC4339a4, 7);
                            c28655q.m87172p0(objM87133R3);
                        }
                        int i411115 = i28 & 126;
                        int i411116 = i28 >> 3;
                        int i411117 = i411115 | (i411116 & 896) | (i411116 & 7168);
                        str4 = str2;
                        m46281w(image, f16, z16, str4, (InterfaceC4339a) objM87133R3, c28655q, i411117, 0);
                        c28655q.m87173q(false);
                    }
                    z15 = z16;
                    interfaceC4339a3 = interfaceC4339a4;
                    f15 = f16;
                    str3 = str4;
                    enumC16302h2 = enumC16302h3;
                } else {
                    c28655q.m87138X();
                    enumC16302h2 = enumC16302h;
                    f15 = f14;
                    z15 = z13;
                    str3 = str2;
                    interfaceC4339a3 = interfaceC4339a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C11507e(image, f15, enumC16302h2, z15, str3, interfaceC4339a3, i13, i14);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            interfaceC4339a2 = interfaceC4339a;
            if ((i15 & 74899) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i34 != 0) {
                    f16 = 5 * 4;
                } else {
                    f16 = f14;
                }
                if (i16 != 0) {
                    enumC16302h3 = EnumC16302h.NONE;
                } else {
                    enumC16302h3 = enumC16302h;
                }
                i28 = i15;
                if (i18 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                if (i24 != 0) {
                    str2 = null;
                }
                c28676v0 = C28635l.f115821a;
                if (i26 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C16268a(22);
                        c28655q.m87172p0(objM87133R4);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R4;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                i29 = a.f62606a[enumC16302h3.ordinal()];
                if (i29 != 1) {
                    c28655q.m87150e0(1155514159);
                    if ((i28 & 458752) == 131072) {
                    }
                    objM87133R = c28655q.m87133R();
                    if (z17) {
                        objM87133R = new C15369i3(interfaceC4339a4, 5);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C15369i3(interfaceC4339a4, 5);
                        c28655q.m87172p0(objM87133R);
                    }
                    int i31111110 = i28 & 126;
                    int i31111111 = i28 >> 3;
                    int i31111112 = i31111110 | (i31111111 & 896) | (i31111111 & 7168);
                    str4 = str2;
                    m46249A(image, f16, z16, str4, (InterfaceC4339a) objM87133R, c28655q, i31111112, 0);
                    c28655q.m87173q(false);
                } else if (i29 != 2) {
                    c28655q.m87150e0(1155518610);
                    if ((i28 & 458752) == 131072) {
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z17) {
                        objM87133R2 = new C15369i3(interfaceC4339a4, 6);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C15369i3(interfaceC4339a4, 6);
                        c28655q.m87172p0(objM87133R2);
                    }
                    int i31111113 = i28 & 126;
                    int i31111114 = i28 >> 3;
                    int i411118 = i31111113 | (i31111114 & 896) | (i31111114 & 7168);
                    str4 = str2;
                    m46277s(image, f16, z16, str4, (InterfaceC4339a) objM87133R2, c28655q, i411118, 0);
                    c28655q.m87173q(false);
                } else {
                    if (i29 == 3) {
                        throw AbstractC11895b.m32003v(1155512180, c28655q, false);
                    }
                    c28655q.m87150e0(1155523055);
                    if ((i28 & 458752) == 131072) {
                    }
                    objM87133R3 = c28655q.m87133R();
                    if (z17) {
                        objM87133R3 = new C15369i3(interfaceC4339a4, 7);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C15369i3(interfaceC4339a4, 7);
                        c28655q.m87172p0(objM87133R3);
                    }
                    int i411119 = i28 & 126;
                    int i4111110 = i28 >> 3;
                    int i4111111 = i411119 | (i4111110 & 896) | (i4111110 & 7168);
                    str4 = str2;
                    m46281w(image, f16, z16, str4, (InterfaceC4339a) objM87133R3, c28655q, i4111111, 0);
                    c28655q.m87173q(false);
                }
                z15 = z16;
                interfaceC4339a3 = interfaceC4339a4;
                f15 = f16;
                str3 = str4;
                enumC16302h2 = enumC16302h3;
            } else {
                c28655q.m87138X();
                enumC16302h2 = enumC16302h;
                f15 = f14;
                z15 = z13;
                str3 = str2;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C11507e(image, f15, enumC16302h2, z15, str3, interfaceC4339a3, i13, i14);
            }
        }
        i15 |= 3072;
        z13 = z4;
        i24 = i14 & 16;
        if (i24 != 0) {
            if ((i13 & 24576) == 0) {
                str2 = str;
                if (c28655q.m87153g(str2)) {
                    i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i25 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i25;
            }
            i26 = i14 & 32;
            if (i26 != 0) {
                if ((196608 & i13) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q.m87157i(interfaceC4339a2)) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i27;
                }
                if ((i15 & 74899) != 74898) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    if (i34 != 0) {
                        f16 = 5 * 4;
                    } else {
                        f16 = f14;
                    }
                    if (i16 != 0) {
                        enumC16302h3 = EnumC16302h.NONE;
                    } else {
                        enumC16302h3 = enumC16302h;
                    }
                    i28 = i15;
                    if (i18 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if (i24 != 0) {
                        str2 = null;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i26 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C16268a(22);
                            c28655q.m87172p0(objM87133R4);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R4;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    i29 = a.f62606a[enumC16302h3.ordinal()];
                    if (i29 != 1) {
                        c28655q.m87150e0(1155514159);
                        if ((i28 & 458752) == 131072) {
                        }
                        objM87133R = c28655q.m87133R();
                        if (z17) {
                            objM87133R = new C15369i3(interfaceC4339a4, 5);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C15369i3(interfaceC4339a4, 5);
                            c28655q.m87172p0(objM87133R);
                        }
                        int i31111115 = i28 & 126;
                        int i31111116 = i28 >> 3;
                        int i31111117 = i31111115 | (i31111116 & 896) | (i31111116 & 7168);
                        str4 = str2;
                        m46249A(image, f16, z16, str4, (InterfaceC4339a) objM87133R, c28655q, i31111117, 0);
                        c28655q.m87173q(false);
                    } else if (i29 != 2) {
                        c28655q.m87150e0(1155518610);
                        if ((i28 & 458752) == 131072) {
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z17) {
                            objM87133R2 = new C15369i3(interfaceC4339a4, 6);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C15369i3(interfaceC4339a4, 6);
                            c28655q.m87172p0(objM87133R2);
                        }
                        int i31111118 = i28 & 126;
                        int i31111119 = i28 >> 3;
                        int i4111112 = i31111118 | (i31111119 & 896) | (i31111119 & 7168);
                        str4 = str2;
                        m46277s(image, f16, z16, str4, (InterfaceC4339a) objM87133R2, c28655q, i4111112, 0);
                        c28655q.m87173q(false);
                    } else {
                        if (i29 == 3) {
                            throw AbstractC11895b.m32003v(1155512180, c28655q, false);
                        }
                        c28655q.m87150e0(1155523055);
                        if ((i28 & 458752) == 131072) {
                        }
                        objM87133R3 = c28655q.m87133R();
                        if (z17) {
                            objM87133R3 = new C15369i3(interfaceC4339a4, 7);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C15369i3(interfaceC4339a4, 7);
                            c28655q.m87172p0(objM87133R3);
                        }
                        int i4111113 = i28 & 126;
                        int i4111114 = i28 >> 3;
                        int i4111115 = i4111113 | (i4111114 & 896) | (i4111114 & 7168);
                        str4 = str2;
                        m46281w(image, f16, z16, str4, (InterfaceC4339a) objM87133R3, c28655q, i4111115, 0);
                        c28655q.m87173q(false);
                    }
                    z15 = z16;
                    interfaceC4339a3 = interfaceC4339a4;
                    f15 = f16;
                    str3 = str4;
                    enumC16302h2 = enumC16302h3;
                } else {
                    c28655q.m87138X();
                    enumC16302h2 = enumC16302h;
                    f15 = f14;
                    z15 = z13;
                    str3 = str2;
                    interfaceC4339a3 = interfaceC4339a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C11507e(image, f15, enumC16302h2, z15, str3, interfaceC4339a3, i13, i14);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            interfaceC4339a2 = interfaceC4339a;
            if ((i15 & 74899) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i34 != 0) {
                    f16 = 5 * 4;
                } else {
                    f16 = f14;
                }
                if (i16 != 0) {
                    enumC16302h3 = EnumC16302h.NONE;
                } else {
                    enumC16302h3 = enumC16302h;
                }
                i28 = i15;
                if (i18 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                if (i24 != 0) {
                    str2 = null;
                }
                c28676v0 = C28635l.f115821a;
                if (i26 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C16268a(22);
                        c28655q.m87172p0(objM87133R4);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R4;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                i29 = a.f62606a[enumC16302h3.ordinal()];
                if (i29 != 1) {
                    c28655q.m87150e0(1155514159);
                    if ((i28 & 458752) == 131072) {
                    }
                    objM87133R = c28655q.m87133R();
                    if (z17) {
                        objM87133R = new C15369i3(interfaceC4339a4, 5);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C15369i3(interfaceC4339a4, 5);
                        c28655q.m87172p0(objM87133R);
                    }
                    int i311111110 = i28 & 126;
                    int i311111111 = i28 >> 3;
                    int i311111112 = i311111110 | (i311111111 & 896) | (i311111111 & 7168);
                    str4 = str2;
                    m46249A(image, f16, z16, str4, (InterfaceC4339a) objM87133R, c28655q, i311111112, 0);
                    c28655q.m87173q(false);
                } else if (i29 != 2) {
                    c28655q.m87150e0(1155518610);
                    if ((i28 & 458752) == 131072) {
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z17) {
                        objM87133R2 = new C15369i3(interfaceC4339a4, 6);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C15369i3(interfaceC4339a4, 6);
                        c28655q.m87172p0(objM87133R2);
                    }
                    int i311111113 = i28 & 126;
                    int i311111114 = i28 >> 3;
                    int i4111116 = i311111113 | (i311111114 & 896) | (i311111114 & 7168);
                    str4 = str2;
                    m46277s(image, f16, z16, str4, (InterfaceC4339a) objM87133R2, c28655q, i4111116, 0);
                    c28655q.m87173q(false);
                } else {
                    if (i29 == 3) {
                        throw AbstractC11895b.m32003v(1155512180, c28655q, false);
                    }
                    c28655q.m87150e0(1155523055);
                    if ((i28 & 458752) == 131072) {
                    }
                    objM87133R3 = c28655q.m87133R();
                    if (z17) {
                        objM87133R3 = new C15369i3(interfaceC4339a4, 7);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C15369i3(interfaceC4339a4, 7);
                        c28655q.m87172p0(objM87133R3);
                    }
                    int i4111117 = i28 & 126;
                    int i4111118 = i28 >> 3;
                    int i4111119 = i4111117 | (i4111118 & 896) | (i4111118 & 7168);
                    str4 = str2;
                    m46281w(image, f16, z16, str4, (InterfaceC4339a) objM87133R3, c28655q, i4111119, 0);
                    c28655q.m87173q(false);
                }
                z15 = z16;
                interfaceC4339a3 = interfaceC4339a4;
                f15 = f16;
                str3 = str4;
                enumC16302h2 = enumC16302h3;
            } else {
                c28655q.m87138X();
                enumC16302h2 = enumC16302h;
                f15 = f14;
                z15 = z13;
                str3 = str2;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C11507e(image, f15, enumC16302h2, z15, str3, interfaceC4339a3, i13, i14);
            }
        }
        i15 |= 24576;
        str2 = str;
        i26 = i14 & 32;
        if (i26 != 0) {
            if ((196608 & i13) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                if (c28655q.m87157i(interfaceC4339a2)) {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i27;
            }
            if ((i15 & 74899) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i34 != 0) {
                    f16 = 5 * 4;
                } else {
                    f16 = f14;
                }
                if (i16 != 0) {
                    enumC16302h3 = EnumC16302h.NONE;
                } else {
                    enumC16302h3 = enumC16302h;
                }
                i28 = i15;
                if (i18 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                if (i24 != 0) {
                    str2 = null;
                }
                c28676v0 = C28635l.f115821a;
                if (i26 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C16268a(22);
                        c28655q.m87172p0(objM87133R4);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R4;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                i29 = a.f62606a[enumC16302h3.ordinal()];
                if (i29 != 1) {
                    c28655q.m87150e0(1155514159);
                    if ((i28 & 458752) == 131072) {
                    }
                    objM87133R = c28655q.m87133R();
                    if (z17) {
                        objM87133R = new C15369i3(interfaceC4339a4, 5);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C15369i3(interfaceC4339a4, 5);
                        c28655q.m87172p0(objM87133R);
                    }
                    int i311111115 = i28 & 126;
                    int i311111116 = i28 >> 3;
                    int i311111117 = i311111115 | (i311111116 & 896) | (i311111116 & 7168);
                    str4 = str2;
                    m46249A(image, f16, z16, str4, (InterfaceC4339a) objM87133R, c28655q, i311111117, 0);
                    c28655q.m87173q(false);
                } else if (i29 != 2) {
                    c28655q.m87150e0(1155518610);
                    if ((i28 & 458752) == 131072) {
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z17) {
                        objM87133R2 = new C15369i3(interfaceC4339a4, 6);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C15369i3(interfaceC4339a4, 6);
                        c28655q.m87172p0(objM87133R2);
                    }
                    int i311111118 = i28 & 126;
                    int i311111119 = i28 >> 3;
                    int i41111110 = i311111118 | (i311111119 & 896) | (i311111119 & 7168);
                    str4 = str2;
                    m46277s(image, f16, z16, str4, (InterfaceC4339a) objM87133R2, c28655q, i41111110, 0);
                    c28655q.m87173q(false);
                } else {
                    if (i29 == 3) {
                        throw AbstractC11895b.m32003v(1155512180, c28655q, false);
                    }
                    c28655q.m87150e0(1155523055);
                    if ((i28 & 458752) == 131072) {
                    }
                    objM87133R3 = c28655q.m87133R();
                    if (z17) {
                        objM87133R3 = new C15369i3(interfaceC4339a4, 7);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C15369i3(interfaceC4339a4, 7);
                        c28655q.m87172p0(objM87133R3);
                    }
                    int i41111111 = i28 & 126;
                    int i41111112 = i28 >> 3;
                    int i41111113 = i41111111 | (i41111112 & 896) | (i41111112 & 7168);
                    str4 = str2;
                    m46281w(image, f16, z16, str4, (InterfaceC4339a) objM87133R3, c28655q, i41111113, 0);
                    c28655q.m87173q(false);
                }
                z15 = z16;
                interfaceC4339a3 = interfaceC4339a4;
                f15 = f16;
                str3 = str4;
                enumC16302h2 = enumC16302h3;
            } else {
                c28655q.m87138X();
                enumC16302h2 = enumC16302h;
                f15 = f14;
                z15 = z13;
                str3 = str2;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C11507e(image, f15, enumC16302h2, z15, str3, interfaceC4339a3, i13, i14);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        interfaceC4339a2 = interfaceC4339a;
        if ((i15 & 74899) != 74898) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i15 & 1, z14)) {
            if (i34 != 0) {
                f16 = 5 * 4;
            } else {
                f16 = f14;
            }
            if (i16 != 0) {
                enumC16302h3 = EnumC16302h.NONE;
            } else {
                enumC16302h3 = enumC16302h;
            }
            i28 = i15;
            if (i18 != 0) {
                z16 = false;
            } else {
                z16 = z13;
            }
            if (i24 != 0) {
                str2 = null;
            }
            c28676v0 = C28635l.f115821a;
            if (i26 != 0) {
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C16268a(22);
                    c28655q.m87172p0(objM87133R4);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R4;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            i29 = a.f62606a[enumC16302h3.ordinal()];
            if (i29 != 1) {
                c28655q.m87150e0(1155514159);
                if ((i28 & 458752) == 131072) {
                }
                objM87133R = c28655q.m87133R();
                if (z17) {
                    objM87133R = new C15369i3(interfaceC4339a4, 5);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C15369i3(interfaceC4339a4, 5);
                    c28655q.m87172p0(objM87133R);
                }
                int i3111111110 = i28 & 126;
                int i3111111111 = i28 >> 3;
                int i3111111112 = i3111111110 | (i3111111111 & 896) | (i3111111111 & 7168);
                str4 = str2;
                m46249A(image, f16, z16, str4, (InterfaceC4339a) objM87133R, c28655q, i3111111112, 0);
                c28655q.m87173q(false);
            } else if (i29 != 2) {
                c28655q.m87150e0(1155518610);
                if ((i28 & 458752) == 131072) {
                }
                objM87133R2 = c28655q.m87133R();
                if (z17) {
                    objM87133R2 = new C15369i3(interfaceC4339a4, 6);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C15369i3(interfaceC4339a4, 6);
                    c28655q.m87172p0(objM87133R2);
                }
                int i3111111113 = i28 & 126;
                int i3111111114 = i28 >> 3;
                int i41111114 = i3111111113 | (i3111111114 & 896) | (i3111111114 & 7168);
                str4 = str2;
                m46277s(image, f16, z16, str4, (InterfaceC4339a) objM87133R2, c28655q, i41111114, 0);
                c28655q.m87173q(false);
            } else {
                if (i29 == 3) {
                    throw AbstractC11895b.m32003v(1155512180, c28655q, false);
                }
                c28655q.m87150e0(1155523055);
                if ((i28 & 458752) == 131072) {
                }
                objM87133R3 = c28655q.m87133R();
                if (z17) {
                    objM87133R3 = new C15369i3(interfaceC4339a4, 7);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C15369i3(interfaceC4339a4, 7);
                    c28655q.m87172p0(objM87133R3);
                }
                int i41111115 = i28 & 126;
                int i41111116 = i28 >> 3;
                int i41111117 = i41111115 | (i41111116 & 896) | (i41111116 & 7168);
                str4 = str2;
                m46281w(image, f16, z16, str4, (InterfaceC4339a) objM87133R3, c28655q, i41111117, 0);
                c28655q.m87173q(false);
            }
            z15 = z16;
            interfaceC4339a3 = interfaceC4339a4;
            f15 = f16;
            str3 = str4;
            enumC16302h2 = enumC16302h3;
        } else {
            c28655q.m87138X();
            enumC16302h2 = enumC16302h;
            f15 = f14;
            z15 = z13;
            str3 = str2;
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11507e(image, f15, enumC16302h2, z15, str3, interfaceC4339a3, i13, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:57:0x0179  */
    /* JADX WARN: Code duplicated, block: B:59:0x0188  */
    /* JADX WARN: Code duplicated, block: B:60:0x018a  */
    /* JADX WARN: Code duplicated, block: B:64:0x0193  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:70:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:71:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:76:0x020c  */
    /* JADX WARN: Code duplicated, block: B:78:0x0233  */
    /* JADX WARN: Code duplicated, block: B:81:0x023d  */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: s */
    private static final void m46277s(C27430e c27430e, float f13, boolean z4, String str, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC4339a interfaceC4339a2;
        boolean z13;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a4;
        int i16;
        Modifier modifierM3357b;
        boolean z14;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z15;
        Object objM87133R;
        Object objM87133R2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(280114721);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(c27430e) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87147d(f13) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87155h(z4) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87153g(str) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i17 = i14 & 16;
        if (i17 == 0) {
            if ((i13 & 24576) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                i15 |= c28655q.m87157i(interfaceC4339a2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            if ((i15 & 9363) != 9362) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C16268a(24);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                float f14 = 3 * 4;
                C33252i c33252iM105489e = AbstractC33253j.m105489e(f14);
                c28655q.m87150e0(-1392656676);
                C17909s c17909s = AbstractC17911t.f69612b;
                C38072d c38072d = C38072d.f163053a;
                i16 = i15;
                C17894k0 c17894k0M51486d = C17909s.m51486d(c17909s, AbstractC37056f.m118959K(new C17919x(c38072d.m121949b(c28655q, 6).getWhite20()), new C17919x(c38072d.m121949b(c28655q, 6).getTransparent()), new C17919x(c38072d.m121949b(c28655q, 6).getTransparent())), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), 8);
                C2314t c2314t = C2314t.f9131w;
                modifierM3357b = AbstractC1092a.m3357b(AbstractC15751g.m44456i(1, c2314t, c17894k0M51486d, c33252iM105489e), C17909s.m51486d(c17909s, AbstractC37056f.m118959K(new C17919x(c38072d.m121949b(c28655q, 6).getWhite20()), new C17919x(c38072d.m121949b(c28655q, 6).getWhite10()), new C17919x(c38072d.m121949b(c28655q, 6).getWhite5())), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), 8), c33252iM105489e, 0.0f, 4);
                if (z4) {
                    c28655q.m87150e0(-1760390028);
                    if ((i16 & 57344) == 16384) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z15 || objM87133R == c28676v0) {
                        objM87133R = new C15369i3(interfaceC4339a4, 8);
                        c28655q.m87172p0(objM87133R);
                    }
                    modifierM3357b = AbstractC1092a.m3362g(modifierM3357b, false, null, null, (InterfaceC4339a) objM87133R, 15);
                    z14 = false;
                } else {
                    z14 = false;
                    c28655q.m87150e0(-1760389121);
                }
                c28655q.m87173q(z14);
                Modifier modifier = modifierM3357b;
                c28655q.m87173q(z14);
                Modifier modifierM3394p = AbstractC1099a.m3394p(f14, modifier);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, z14);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
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
                AbstractC15005f3.m43108b(c27430e, str, AbstractC1102d.m3419p(f13, c2314t), c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, (i16 & 14) | ((i16 >> 6) & 112), 0);
                c28655q.m87173q(true);
                interfaceC4339a3 = interfaceC4339a4;
            } else {
                c28655q.m87138X();
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C16304i(c27430e, f13, z4, str, interfaceC4339a3, i13, i14, 2);
            }
        }
        i15 |= 24576;
        interfaceC4339a2 = interfaceC4339a;
        if ((i15 & 9363) != 9362) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i15 & 1, z13)) {
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C16268a(24);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            float f15 = 3 * 4;
            C33252i c33252iM105489e2 = AbstractC33253j.m105489e(f15);
            c28655q.m87150e0(-1392656676);
            C17909s c17909s2 = AbstractC17911t.f69612b;
            C38072d c38072d2 = C38072d.f163053a;
            i16 = i15;
            C17894k0 c17894k0M51486d2 = C17909s.m51486d(c17909s2, AbstractC37056f.m118959K(new C17919x(c38072d2.m121949b(c28655q, 6).getWhite20()), new C17919x(c38072d2.m121949b(c28655q, 6).getTransparent()), new C17919x(c38072d2.m121949b(c28655q, 6).getTransparent())), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), 8);
            C2314t c2314t2 = C2314t.f9131w;
            modifierM3357b = AbstractC1092a.m3357b(AbstractC15751g.m44456i(1, c2314t2, c17894k0M51486d2, c33252iM105489e2), C17909s.m51486d(c17909s2, AbstractC37056f.m118959K(new C17919x(c38072d2.m121949b(c28655q, 6).getWhite20()), new C17919x(c38072d2.m121949b(c28655q, 6).getWhite10()), new C17919x(c38072d2.m121949b(c28655q, 6).getWhite5())), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), 8), c33252iM105489e2, 0.0f, 4);
            if (z4) {
                c28655q.m87150e0(-1760390028);
                if ((i16 & 57344) == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z15) {
                    objM87133R = new C15369i3(interfaceC4339a4, 8);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C15369i3(interfaceC4339a4, 8);
                    c28655q.m87172p0(objM87133R);
                }
                modifierM3357b = AbstractC1092a.m3362g(modifierM3357b, false, null, null, (InterfaceC4339a) objM87133R, 15);
                z14 = false;
            } else {
                z14 = false;
                c28655q.m87150e0(-1760389121);
            }
            c28655q.m87173q(z14);
            Modifier modifier2 = modifierM3357b;
            c28655q.m87173q(z14);
            Modifier modifierM3394p2 = AbstractC1099a.m3394p(f15, modifier2);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, z14);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3394p2);
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
            AbstractC15005f3.m43108b(c27430e, str, AbstractC1102d.m3419p(f13, c2314t2), c38072d2.m121949b(c28655q, 6).getBrandWhite(), c28655q, (i16 & 14) | ((i16 >> 6) & 112), 0);
            c28655q.m87173q(true);
            interfaceC4339a3 = interfaceC4339a4;
        } else {
            c28655q.m87138X();
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C16304i(c27430e, f13, z4, str, interfaceC4339a3, i13, i14, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m46278t() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m46279u(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m46280v(C27430e c27430e, float f13, boolean z4, String str, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m46277s(c27430e, f13, z4, str, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:66:0x0119  */
    /* JADX WARN: Code duplicated, block: B:68:0x0128  */
    /* JADX WARN: Code duplicated, block: B:69:0x012a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0133  */
    /* JADX WARN: Code duplicated, block: B:76:0x0153  */
    /* JADX WARN: Code duplicated, block: B:79:0x017b  */
    /* JADX WARN: Code duplicated, block: B:80:0x017f  */
    /* JADX WARN: Code duplicated, block: B:85:0x019c  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: w */
    private static final void m46281w(C27430e c27430e, float f13, boolean z4, String str, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC4339a interfaceC4339a2;
        boolean z13;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a4;
        int iHashCode;
        int i16;
        C0213j c0213j;
        C0209i c0209i;
        Modifier modifierM3358c;
        boolean z14;
        int iHashCode2;
        boolean z15;
        Object objM87133R;
        Object objM87133R2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1015096553);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(c27430e) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87147d(f13) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87155h(z4) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87153g(str) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i17 = i14 & 16;
        if (i17 == 0) {
            if ((i13 & 24576) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                i15 |= c28655q.m87157i(interfaceC4339a2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            if ((i15 & 9363) != 9362) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C16268a(23);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                float f14 = 3 * 4;
                C33252i c33252iM105489e = AbstractC33253j.m105489e(f14);
                C2307m c2307m = C2299e.f9102E;
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
                InterfaceC0221l.f734a.getClass();
                i16 = i15;
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                m46274p(c28655q, 0);
                c28655q.m87150e0(-861037460);
                Modifier modifierM46258J = m46258J(c2314t, (float) 1.5d, c33252iM105489e);
                C38072d c38072d = C38072d.f163053a;
                modifierM3358c = AbstractC1092a.m3358c(modifierM46258J, c38072d.m121949b(c28655q, 6).getBackgroundDarkStd(), c33252iM105489e);
                if (z4) {
                    c28655q.m87150e0(-1025852066);
                    if ((i16 & 57344) == 16384) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z15 || objM87133R == c28676v0) {
                        objM87133R = new C15369i3(interfaceC4339a4, 4);
                        c28655q.m87172p0(objM87133R);
                    }
                    modifierM3358c = AbstractC1092a.m3362g(modifierM3358c, false, null, null, (InterfaceC4339a) objM87133R, 15);
                    z14 = false;
                } else {
                    z14 = false;
                    c28655q.m87150e0(-1025851159);
                }
                c28655q.m87173q(z14);
                Modifier modifier = modifierM3358c;
                c28655q.m87173q(z14);
                Modifier modifierM3394p = AbstractC1099a.m3394p(f14, modifier);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, z14);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3394p);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                AbstractC15005f3.m43108b(c27430e, str, AbstractC1102d.m3419p(f13, c2314t), c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, (i16 & 14) | ((i16 >> 6) & 112), 0);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                interfaceC4339a3 = interfaceC4339a4;
            } else {
                c28655q.m87138X();
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C16304i(c27430e, f13, z4, str, interfaceC4339a3, i13, i14, 1);
            }
        }
        i15 |= 24576;
        interfaceC4339a2 = interfaceC4339a;
        if ((i15 & 9363) != 9362) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i15 & 1, z13)) {
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C16268a(23);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            float f15 = 3 * 4;
            C33252i c33252iM105489e2 = AbstractC33253j.m105489e(f15);
            C2307m c2307m2 = C2299e.f9102E;
            InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m2, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t2);
            InterfaceC0221l.f734a.getClass();
            i16 = i15;
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r0M66763d3);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N3);
            m46274p(c28655q, 0);
            c28655q.m87150e0(-861037460);
            Modifier modifierM46258J2 = m46258J(c2314t2, (float) 1.5d, c33252iM105489e2);
            C38072d c38072d2 = C38072d.f163053a;
            modifierM3358c = AbstractC1092a.m3358c(modifierM46258J2, c38072d2.m121949b(c28655q, 6).getBackgroundDarkStd(), c33252iM105489e2);
            if (z4) {
                c28655q.m87150e0(-1025852066);
                if ((i16 & 57344) == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z15) {
                    objM87133R = new C15369i3(interfaceC4339a4, 4);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C15369i3(interfaceC4339a4, 4);
                    c28655q.m87172p0(objM87133R);
                }
                modifierM3358c = AbstractC1092a.m3362g(modifierM3358c, false, null, null, (InterfaceC4339a) objM87133R, 15);
                z14 = false;
            } else {
                z14 = false;
                c28655q.m87150e0(-1025851159);
            }
            c28655q.m87173q(z14);
            Modifier modifier2 = modifierM3358c;
            c28655q.m87173q(z14);
            Modifier modifierM3394p2 = AbstractC1099a.m3394p(f15, modifier2);
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m2, z14);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3394p2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
            AbstractC15005f3.m43108b(c27430e, str, AbstractC1102d.m3419p(f13, c2314t2), c38072d2.m121949b(c28655q, 6).getBrandWhite(), c28655q, (i16 & 14) | ((i16 >> 6) & 112), 0);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            interfaceC4339a3 = interfaceC4339a4;
        } else {
            c28655q.m87138X();
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C16304i(c27430e, f13, z4, str, interfaceC4339a3, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m46282x() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m46283y(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m46284z(C27430e c27430e, float f13, boolean z4, String str, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m46281w(c27430e, f13, z4, str, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
