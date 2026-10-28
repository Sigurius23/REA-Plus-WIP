package kd1;

import androidx.compose.animation.AbstractC1090b;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import aw0.C2108h;
import c93.InterfaceC4351m;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p040c0.AbstractC3730c1;
import p040c0.AbstractC3736e1;
import p040c0.AbstractC3788w0;
import p040c0.InterfaceC3747i0;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: kd1.d0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"", "isVisible", "Lc0/c1;", "enterAnimation", "Lc0/e1;", "exitAnimation", "Lkotlin/Function0;", "Ll83/a0;", "content", "c", "(ZLc0/c1;Lc0/e1;Lc93/m;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22391d0 {
    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static final void m64437c(boolean z4, AbstractC3730c1 abstractC3730c1, AbstractC3736e1 abstractC3736e1, InterfaceC4351m content, Composer composer, int i13, int i14) {
        int i15;
        AbstractC3730c1 abstractC3730c2;
        int i16;
        AbstractC3736e1 abstractC3736e2;
        int i17;
        boolean z13;
        AbstractC3736e1 abstractC3736e3;
        C28677v1 c28677v1M87180u;
        AbstractC3730c1 abstractC3730c1M11577e;
        AbstractC3736e1 abstractC3736e1M11578f;
        int i18;
        AbstractC22676k.m65750j(content, "content");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1190341217);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i19 = i14 & 2;
        if (i19 == 0) {
            if ((i13 & 48) == 0) {
                abstractC3730c2 = abstractC3730c1;
                i15 |= c28655q.m87153g(abstractC3730c2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    abstractC3736e2 = abstractC3736e1;
                    if (c28655q.m87153g(abstractC3736e2)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                if ((i13 & 3072) == 0) {
                    if (c28655q.m87157i(content)) {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i18;
                }
                if ((i15 & 1171) != 1170) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q.m87135U(i15 & 1, z13)) {
                    if (i19 != 0) {
                        abstractC3730c1M11577e = AbstractC3788w0.m11577e(null, 3);
                    } else {
                        abstractC3730c1M11577e = abstractC3730c2;
                    }
                    if (i16 != 0) {
                        abstractC3736e1M11578f = AbstractC3788w0.m11578f(null, 3);
                    } else {
                        abstractC3736e1M11578f = abstractC3736e2;
                    }
                    C37816b c37816bM121344e = AbstractC37817c.m121344e(377844537, c28655q, new C22389c0(0, content));
                    int i24 = (i15 & 14) | ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    int i25 = i15 << 3;
                    AbstractC3730c1 abstractC3730c3 = abstractC3730c1M11577e;
                    AbstractC1090b.m3351f(z4, null, abstractC3730c3, abstractC3736e1M11578f, null, c37816bM121344e, c28655q, i24 | (i25 & 896) | (i25 & 7168), 18);
                    abstractC3730c2 = abstractC3730c3;
                    abstractC3736e3 = abstractC3736e1M11578f;
                } else {
                    c28655q.m87138X();
                    abstractC3736e3 = abstractC3736e2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2108h(z4, abstractC3730c2, abstractC3736e3, content, i13, i14);
                }
            }
            i15 |= 384;
            abstractC3736e2 = abstractC3736e1;
            if ((i13 & 3072) == 0) {
                if (c28655q.m87157i(content)) {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i18;
            }
            if ((i15 & 1171) != 1170) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                if (i19 != 0) {
                    abstractC3730c1M11577e = AbstractC3788w0.m11577e(null, 3);
                } else {
                    abstractC3730c1M11577e = abstractC3730c2;
                }
                if (i16 != 0) {
                    abstractC3736e1M11578f = AbstractC3788w0.m11578f(null, 3);
                } else {
                    abstractC3736e1M11578f = abstractC3736e2;
                }
                C37816b c37816bM121344e2 = AbstractC37817c.m121344e(377844537, c28655q, new C22389c0(0, content));
                int i26 = (i15 & 14) | ProfileVerifier.CompilationStatus.f6515xf2722a21;
                int i27 = i15 << 3;
                AbstractC3730c1 abstractC3730c4 = abstractC3730c1M11577e;
                AbstractC1090b.m3351f(z4, null, abstractC3730c4, abstractC3736e1M11578f, null, c37816bM121344e2, c28655q, i26 | (i27 & 896) | (i27 & 7168), 18);
                abstractC3730c2 = abstractC3730c4;
                abstractC3736e3 = abstractC3736e1M11578f;
            } else {
                c28655q.m87138X();
                abstractC3736e3 = abstractC3736e2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2108h(z4, abstractC3730c2, abstractC3736e3, content, i13, i14);
            }
        }
        i15 |= 48;
        abstractC3730c2 = abstractC3730c1;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                abstractC3736e2 = abstractC3736e1;
                if (c28655q.m87153g(abstractC3736e2)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i13 & 3072) == 0) {
                if (c28655q.m87157i(content)) {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i18;
            }
            if ((i15 & 1171) != 1170) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                if (i19 != 0) {
                    abstractC3730c1M11577e = AbstractC3788w0.m11577e(null, 3);
                } else {
                    abstractC3730c1M11577e = abstractC3730c2;
                }
                if (i16 != 0) {
                    abstractC3736e1M11578f = AbstractC3788w0.m11578f(null, 3);
                } else {
                    abstractC3736e1M11578f = abstractC3736e2;
                }
                C37816b c37816bM121344e3 = AbstractC37817c.m121344e(377844537, c28655q, new C22389c0(0, content));
                int i28 = (i15 & 14) | ProfileVerifier.CompilationStatus.f6515xf2722a21;
                int i29 = i15 << 3;
                AbstractC3730c1 abstractC3730c5 = abstractC3730c1M11577e;
                AbstractC1090b.m3351f(z4, null, abstractC3730c5, abstractC3736e1M11578f, null, c37816bM121344e3, c28655q, i28 | (i29 & 896) | (i29 & 7168), 18);
                abstractC3730c2 = abstractC3730c5;
                abstractC3736e3 = abstractC3736e1M11578f;
            } else {
                c28655q.m87138X();
                abstractC3736e3 = abstractC3736e2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2108h(z4, abstractC3730c2, abstractC3736e3, content, i13, i14);
            }
        }
        i15 |= 384;
        abstractC3736e2 = abstractC3736e1;
        if ((i13 & 3072) == 0) {
            if (c28655q.m87157i(content)) {
                i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i18;
        }
        if ((i15 & 1171) != 1170) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i15 & 1, z13)) {
            if (i19 != 0) {
                abstractC3730c1M11577e = AbstractC3788w0.m11577e(null, 3);
            } else {
                abstractC3730c1M11577e = abstractC3730c2;
            }
            if (i16 != 0) {
                abstractC3736e1M11578f = AbstractC3788w0.m11578f(null, 3);
            } else {
                abstractC3736e1M11578f = abstractC3736e2;
            }
            C37816b c37816bM121344e4 = AbstractC37817c.m121344e(377844537, c28655q, new C22389c0(0, content));
            int i210 = (i15 & 14) | ProfileVerifier.CompilationStatus.f6515xf2722a21;
            int i211 = i15 << 3;
            AbstractC3730c1 abstractC3730c6 = abstractC3730c1M11577e;
            AbstractC1090b.m3351f(z4, null, abstractC3730c6, abstractC3736e1M11578f, null, c37816bM121344e4, c28655q, i210 | (i211 & 896) | (i211 & 7168), 18);
            abstractC3730c2 = abstractC3730c6;
            abstractC3736e3 = abstractC3736e1M11578f;
        } else {
            c28655q.m87138X();
            abstractC3736e3 = abstractC3736e2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2108h(z4, abstractC3730c2, abstractC3736e3, content, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m64438d(InterfaceC4351m interfaceC4351m, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        interfaceC4351m.invoke(composer, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m64439e(boolean z4, AbstractC3730c1 abstractC3730c1, AbstractC3736e1 abstractC3736e1, InterfaceC4351m interfaceC4351m, int i13, int i14, Composer composer, int i15) {
        m64437c(z4, abstractC3730c1, abstractC3736e1, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
