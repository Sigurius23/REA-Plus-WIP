package hy0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import kd1.C22411w;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p208i2.InterfaceC17869a1;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: hy0.v1 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lhy0/a2;", "trendType", "Li2/a1;", "shape", "Ly3/f;", "padding", "size", "shrinkIcon", "Ll83/a0;", "b", "(Lhy0/a2;Li2/a1;FFFLandroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17796v1 {
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0098  */
    /* JADX WARN: Code duplicated, block: B:57:0x009a  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b5 A[PHI: r0 r3 r8
      0x00b5: PHI (r0v23 i2.a1) = (r0v18 i2.a1), (r0v25 i2.a1) binds: [B:76:0x00d8, B:65:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x00b5: PHI (r3v10 float) = (r3v6 float), (r3v11 float) binds: [B:76:0x00d8, B:65:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x00b5: PHI (r8v8 float) = (r8v4 float), (r8v2 float) binds: [B:76:0x00d8, B:65:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00da  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:83:0x0113  */
    /* JADX WARN: Code duplicated, block: B:86:0x0134  */
    /* JADX WARN: Code duplicated, block: B:89:0x0141  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m51143b(final C17723a2 trendType, InterfaceC17869a1 interfaceC17869a1, float f13, float f14, float f15, Composer composer, final int i13, final int i14) {
        int i15;
        InterfaceC17869a1 interfaceC17869a2;
        float f16;
        int i16;
        float f17;
        int i17;
        int i18;
        float f18;
        int i19;
        boolean z4;
        final InterfaceC17869a1 interfaceC17869a3;
        final float f19;
        final float f24;
        final float f25;
        C28677v1 c28677v1M87180u;
        InterfaceC17869a1 interfaceC17869a1M64090c;
        float f26;
        float f27;
        Integer iconResource;
        Modifier modifierM3394p;
        AbstractC22676k.m65750j(trendType, "trendType");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-760155374);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(trendType) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            if ((i14 & 2) == 0) {
                interfaceC17869a2 = interfaceC17869a1;
                int i24 = c28655q.m87153g(interfaceC17869a2) ? 32 : 16;
                i15 |= i24;
            } else {
                interfaceC17869a2 = interfaceC17869a1;
            }
            i15 |= i24;
        } else {
            interfaceC17869a2 = interfaceC17869a1;
        }
        int i25 = i14 & 4;
        if (i25 == 0) {
            if ((i13 & 384) == 0) {
                f16 = f13;
                i15 |= c28655q.m87147d(f16) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    f17 = f14;
                    if (c28655q.m87147d(f17)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 16;
                if (i18 != 0) {
                    if ((i13 & 24576) == 0) {
                        f18 = f15;
                        if (c28655q.m87147d(f18)) {
                            i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i19;
                    }
                    if ((i15 & 9363) != 9362) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z4)) {
                        c28655q.m87140Z();
                        if ((i13 & 1) != 0 || c28655q.m87118C()) {
                            if ((i14 & 2) != 0) {
                                interfaceC17869a1M64090c = C22411w.f87680a.m64537c().m64090c();
                            } else {
                                interfaceC17869a1M64090c = interfaceC17869a2;
                            }
                            if (i25 != 0) {
                                f19 = 1 * 8;
                            } else {
                                f19 = f16;
                            }
                            if (i16 != 0) {
                                f17 = 4 * 3;
                            }
                            if (i18 != 0) {
                                f26 = Float.NaN;
                                f27 = f17;
                            }
                            c28655q.m87175r();
                            iconResource = trendType.getIconResource();
                            if (iconResource == null) {
                                c28655q.m87150e0(1574045597);
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(1574045598);
                                int iIntValue = iconResource.intValue();
                                long backgroundColor = trendType.getBackgroundColor();
                                modifierM3394p = C2314t.f9131w;
                                Modifier modifierM3419p = AbstractC1102d.m3419p(f27, AbstractC1099a.m3394p(f19, AbstractC1092a.m3358c(modifierM3394p, backgroundColor, interfaceC17869a1M64090c)));
                                if (!Float.isNaN(f26)) {
                                    modifierM3394p = AbstractC1099a.m3394p(f26, modifierM3394p);
                                }
                                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(iIntValue, c28655q, 6), AbstractC17808z1.m51180h(iIntValue, c28655q, 0), modifierM3419p.mo3471e(modifierM3394p), trendType.getIconColor(), c28655q, 0, 0);
                                c28655q.m87173q(false);
                            }
                            f25 = f26;
                            f24 = f27;
                            interfaceC17869a3 = interfaceC17869a1M64090c;
                        } else {
                            c28655q.m87138X();
                            interfaceC17869a1M64090c = interfaceC17869a2;
                            f19 = f16;
                        }
                        f27 = f17;
                        f26 = f18;
                        c28655q.m87175r();
                        iconResource = trendType.getIconResource();
                        if (iconResource == null) {
                            c28655q.m87150e0(1574045597);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(1574045598);
                            int iIntValue2 = iconResource.intValue();
                            long backgroundColor2 = trendType.getBackgroundColor();
                            modifierM3394p = C2314t.f9131w;
                            Modifier modifierM3419p2 = AbstractC1102d.m3419p(f27, AbstractC1099a.m3394p(f19, AbstractC1092a.m3358c(modifierM3394p, backgroundColor2, interfaceC17869a1M64090c)));
                            if (!Float.isNaN(f26)) {
                                modifierM3394p = AbstractC1099a.m3394p(f26, modifierM3394p);
                            }
                            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(iIntValue2, c28655q, 6), AbstractC17808z1.m51180h(iIntValue2, c28655q, 0), modifierM3419p2.mo3471e(modifierM3394p), trendType.getIconColor(), c28655q, 0, 0);
                            c28655q.m87173q(false);
                        }
                        f25 = f26;
                        f24 = f27;
                        interfaceC17869a3 = interfaceC17869a1M64090c;
                    } else {
                        c28655q.m87138X();
                        interfaceC17869a3 = interfaceC17869a2;
                        f19 = f16;
                        f24 = f17;
                        f25 = f18;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: hy0.u1
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue3 = ((Integer) obj2).intValue();
                                return AbstractC17796v1.m51144c(trendType, interfaceC17869a3, f19, f24, f25, i13, i14, (Composer) obj, iIntValue3);
                            }
                        };
                    }
                }
                i15 |= 24576;
                f18 = f15;
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28655q.m87140Z();
                    if ((i13 & 1) != 0) {
                        if ((i14 & 2) != 0) {
                            interfaceC17869a1M64090c = C22411w.f87680a.m64537c().m64090c();
                        } else {
                            interfaceC17869a1M64090c = interfaceC17869a2;
                        }
                        if (i25 != 0) {
                            f19 = 1 * 8;
                        } else {
                            f19 = f16;
                        }
                        if (i16 != 0) {
                            f17 = 4 * 3;
                        }
                        if (i18 != 0) {
                            f26 = Float.NaN;
                            f27 = f17;
                        } else {
                            f27 = f17;
                            f26 = f18;
                        }
                    } else {
                        if ((i14 & 2) != 0) {
                            interfaceC17869a1M64090c = C22411w.f87680a.m64537c().m64090c();
                        } else {
                            interfaceC17869a1M64090c = interfaceC17869a2;
                        }
                        if (i25 != 0) {
                            f19 = 1 * 8;
                        } else {
                            f19 = f16;
                        }
                        if (i16 != 0) {
                            f17 = 4 * 3;
                        }
                        if (i18 != 0) {
                            f26 = Float.NaN;
                            f27 = f17;
                        } else {
                            f27 = f17;
                            f26 = f18;
                        }
                    }
                    c28655q.m87175r();
                    iconResource = trendType.getIconResource();
                    if (iconResource == null) {
                        c28655q.m87150e0(1574045597);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1574045598);
                        int iIntValue3 = iconResource.intValue();
                        long backgroundColor3 = trendType.getBackgroundColor();
                        modifierM3394p = C2314t.f9131w;
                        Modifier modifierM3419p3 = AbstractC1102d.m3419p(f27, AbstractC1099a.m3394p(f19, AbstractC1092a.m3358c(modifierM3394p, backgroundColor3, interfaceC17869a1M64090c)));
                        if (!Float.isNaN(f26)) {
                            modifierM3394p = AbstractC1099a.m3394p(f26, modifierM3394p);
                        }
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(iIntValue3, c28655q, 6), AbstractC17808z1.m51180h(iIntValue3, c28655q, 0), modifierM3419p3.mo3471e(modifierM3394p), trendType.getIconColor(), c28655q, 0, 0);
                        c28655q.m87173q(false);
                    }
                    f25 = f26;
                    f24 = f27;
                    interfaceC17869a3 = interfaceC17869a1M64090c;
                } else {
                    c28655q.m87138X();
                    interfaceC17869a3 = interfaceC17869a2;
                    f19 = f16;
                    f24 = f17;
                    f25 = f18;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: hy0.u1
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue4 = ((Integer) obj2).intValue();
                            return AbstractC17796v1.m51144c(trendType, interfaceC17869a3, f19, f24, f25, i13, i14, (Composer) obj, iIntValue4);
                        }
                    };
                }
            }
            i15 |= 3072;
            f17 = f14;
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    f18 = f15;
                    if (c28655q.m87147d(f18)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28655q.m87140Z();
                    if ((i13 & 1) != 0) {
                        if ((i14 & 2) != 0) {
                            interfaceC17869a1M64090c = C22411w.f87680a.m64537c().m64090c();
                        } else {
                            interfaceC17869a1M64090c = interfaceC17869a2;
                        }
                        if (i25 != 0) {
                            f19 = 1 * 8;
                        } else {
                            f19 = f16;
                        }
                        if (i16 != 0) {
                            f17 = 4 * 3;
                        }
                        if (i18 != 0) {
                            f26 = Float.NaN;
                            f27 = f17;
                        } else {
                            f27 = f17;
                            f26 = f18;
                        }
                    } else {
                        if ((i14 & 2) != 0) {
                            interfaceC17869a1M64090c = C22411w.f87680a.m64537c().m64090c();
                        } else {
                            interfaceC17869a1M64090c = interfaceC17869a2;
                        }
                        if (i25 != 0) {
                            f19 = 1 * 8;
                        } else {
                            f19 = f16;
                        }
                        if (i16 != 0) {
                            f17 = 4 * 3;
                        }
                        if (i18 != 0) {
                            f26 = Float.NaN;
                            f27 = f17;
                        } else {
                            f27 = f17;
                            f26 = f18;
                        }
                    }
                    c28655q.m87175r();
                    iconResource = trendType.getIconResource();
                    if (iconResource == null) {
                        c28655q.m87150e0(1574045597);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1574045598);
                        int iIntValue4 = iconResource.intValue();
                        long backgroundColor4 = trendType.getBackgroundColor();
                        modifierM3394p = C2314t.f9131w;
                        Modifier modifierM3419p4 = AbstractC1102d.m3419p(f27, AbstractC1099a.m3394p(f19, AbstractC1092a.m3358c(modifierM3394p, backgroundColor4, interfaceC17869a1M64090c)));
                        if (!Float.isNaN(f26)) {
                            modifierM3394p = AbstractC1099a.m3394p(f26, modifierM3394p);
                        }
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(iIntValue4, c28655q, 6), AbstractC17808z1.m51180h(iIntValue4, c28655q, 0), modifierM3419p4.mo3471e(modifierM3394p), trendType.getIconColor(), c28655q, 0, 0);
                        c28655q.m87173q(false);
                    }
                    f25 = f26;
                    f24 = f27;
                    interfaceC17869a3 = interfaceC17869a1M64090c;
                } else {
                    c28655q.m87138X();
                    interfaceC17869a3 = interfaceC17869a2;
                    f19 = f16;
                    f24 = f17;
                    f25 = f18;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: hy0.u1
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue5 = ((Integer) obj2).intValue();
                            return AbstractC17796v1.m51144c(trendType, interfaceC17869a3, f19, f24, f25, i13, i14, (Composer) obj, iIntValue5);
                        }
                    };
                }
            }
            i15 |= 24576;
            f18 = f15;
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    if ((i14 & 2) != 0) {
                        interfaceC17869a1M64090c = C22411w.f87680a.m64537c().m64090c();
                    } else {
                        interfaceC17869a1M64090c = interfaceC17869a2;
                    }
                    if (i25 != 0) {
                        f19 = 1 * 8;
                    } else {
                        f19 = f16;
                    }
                    if (i16 != 0) {
                        f17 = 4 * 3;
                    }
                    if (i18 != 0) {
                        f26 = Float.NaN;
                        f27 = f17;
                    } else {
                        f27 = f17;
                        f26 = f18;
                    }
                } else {
                    if ((i14 & 2) != 0) {
                        interfaceC17869a1M64090c = C22411w.f87680a.m64537c().m64090c();
                    } else {
                        interfaceC17869a1M64090c = interfaceC17869a2;
                    }
                    if (i25 != 0) {
                        f19 = 1 * 8;
                    } else {
                        f19 = f16;
                    }
                    if (i16 != 0) {
                        f17 = 4 * 3;
                    }
                    if (i18 != 0) {
                        f26 = Float.NaN;
                        f27 = f17;
                    } else {
                        f27 = f17;
                        f26 = f18;
                    }
                }
                c28655q.m87175r();
                iconResource = trendType.getIconResource();
                if (iconResource == null) {
                    c28655q.m87150e0(1574045597);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1574045598);
                    int iIntValue5 = iconResource.intValue();
                    long backgroundColor5 = trendType.getBackgroundColor();
                    modifierM3394p = C2314t.f9131w;
                    Modifier modifierM3419p5 = AbstractC1102d.m3419p(f27, AbstractC1099a.m3394p(f19, AbstractC1092a.m3358c(modifierM3394p, backgroundColor5, interfaceC17869a1M64090c)));
                    if (!Float.isNaN(f26)) {
                        modifierM3394p = AbstractC1099a.m3394p(f26, modifierM3394p);
                    }
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(iIntValue5, c28655q, 6), AbstractC17808z1.m51180h(iIntValue5, c28655q, 0), modifierM3419p5.mo3471e(modifierM3394p), trendType.getIconColor(), c28655q, 0, 0);
                    c28655q.m87173q(false);
                }
                f25 = f26;
                f24 = f27;
                interfaceC17869a3 = interfaceC17869a1M64090c;
            } else {
                c28655q.m87138X();
                interfaceC17869a3 = interfaceC17869a2;
                f19 = f16;
                f24 = f17;
                f25 = f18;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: hy0.u1
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue6 = ((Integer) obj2).intValue();
                        return AbstractC17796v1.m51144c(trendType, interfaceC17869a3, f19, f24, f25, i13, i14, (Composer) obj, iIntValue6);
                    }
                };
            }
        }
        i15 |= 384;
        f16 = f13;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                f17 = f14;
                if (c28655q.m87147d(f17)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    f18 = f15;
                    if (c28655q.m87147d(f18)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28655q.m87140Z();
                    if ((i13 & 1) != 0) {
                        if ((i14 & 2) != 0) {
                            interfaceC17869a1M64090c = C22411w.f87680a.m64537c().m64090c();
                        } else {
                            interfaceC17869a1M64090c = interfaceC17869a2;
                        }
                        if (i25 != 0) {
                            f19 = 1 * 8;
                        } else {
                            f19 = f16;
                        }
                        if (i16 != 0) {
                            f17 = 4 * 3;
                        }
                        if (i18 != 0) {
                            f26 = Float.NaN;
                            f27 = f17;
                        } else {
                            f27 = f17;
                            f26 = f18;
                        }
                    } else {
                        if ((i14 & 2) != 0) {
                            interfaceC17869a1M64090c = C22411w.f87680a.m64537c().m64090c();
                        } else {
                            interfaceC17869a1M64090c = interfaceC17869a2;
                        }
                        if (i25 != 0) {
                            f19 = 1 * 8;
                        } else {
                            f19 = f16;
                        }
                        if (i16 != 0) {
                            f17 = 4 * 3;
                        }
                        if (i18 != 0) {
                            f26 = Float.NaN;
                            f27 = f17;
                        } else {
                            f27 = f17;
                            f26 = f18;
                        }
                    }
                    c28655q.m87175r();
                    iconResource = trendType.getIconResource();
                    if (iconResource == null) {
                        c28655q.m87150e0(1574045597);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1574045598);
                        int iIntValue6 = iconResource.intValue();
                        long backgroundColor6 = trendType.getBackgroundColor();
                        modifierM3394p = C2314t.f9131w;
                        Modifier modifierM3419p6 = AbstractC1102d.m3419p(f27, AbstractC1099a.m3394p(f19, AbstractC1092a.m3358c(modifierM3394p, backgroundColor6, interfaceC17869a1M64090c)));
                        if (!Float.isNaN(f26)) {
                            modifierM3394p = AbstractC1099a.m3394p(f26, modifierM3394p);
                        }
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(iIntValue6, c28655q, 6), AbstractC17808z1.m51180h(iIntValue6, c28655q, 0), modifierM3419p6.mo3471e(modifierM3394p), trendType.getIconColor(), c28655q, 0, 0);
                        c28655q.m87173q(false);
                    }
                    f25 = f26;
                    f24 = f27;
                    interfaceC17869a3 = interfaceC17869a1M64090c;
                } else {
                    c28655q.m87138X();
                    interfaceC17869a3 = interfaceC17869a2;
                    f19 = f16;
                    f24 = f17;
                    f25 = f18;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: hy0.u1
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue7 = ((Integer) obj2).intValue();
                            return AbstractC17796v1.m51144c(trendType, interfaceC17869a3, f19, f24, f25, i13, i14, (Composer) obj, iIntValue7);
                        }
                    };
                }
            }
            i15 |= 24576;
            f18 = f15;
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    if ((i14 & 2) != 0) {
                        interfaceC17869a1M64090c = C22411w.f87680a.m64537c().m64090c();
                    } else {
                        interfaceC17869a1M64090c = interfaceC17869a2;
                    }
                    if (i25 != 0) {
                        f19 = 1 * 8;
                    } else {
                        f19 = f16;
                    }
                    if (i16 != 0) {
                        f17 = 4 * 3;
                    }
                    if (i18 != 0) {
                        f26 = Float.NaN;
                        f27 = f17;
                    } else {
                        f27 = f17;
                        f26 = f18;
                    }
                } else {
                    if ((i14 & 2) != 0) {
                        interfaceC17869a1M64090c = C22411w.f87680a.m64537c().m64090c();
                    } else {
                        interfaceC17869a1M64090c = interfaceC17869a2;
                    }
                    if (i25 != 0) {
                        f19 = 1 * 8;
                    } else {
                        f19 = f16;
                    }
                    if (i16 != 0) {
                        f17 = 4 * 3;
                    }
                    if (i18 != 0) {
                        f26 = Float.NaN;
                        f27 = f17;
                    } else {
                        f27 = f17;
                        f26 = f18;
                    }
                }
                c28655q.m87175r();
                iconResource = trendType.getIconResource();
                if (iconResource == null) {
                    c28655q.m87150e0(1574045597);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1574045598);
                    int iIntValue7 = iconResource.intValue();
                    long backgroundColor7 = trendType.getBackgroundColor();
                    modifierM3394p = C2314t.f9131w;
                    Modifier modifierM3419p7 = AbstractC1102d.m3419p(f27, AbstractC1099a.m3394p(f19, AbstractC1092a.m3358c(modifierM3394p, backgroundColor7, interfaceC17869a1M64090c)));
                    if (!Float.isNaN(f26)) {
                        modifierM3394p = AbstractC1099a.m3394p(f26, modifierM3394p);
                    }
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(iIntValue7, c28655q, 6), AbstractC17808z1.m51180h(iIntValue7, c28655q, 0), modifierM3419p7.mo3471e(modifierM3394p), trendType.getIconColor(), c28655q, 0, 0);
                    c28655q.m87173q(false);
                }
                f25 = f26;
                f24 = f27;
                interfaceC17869a3 = interfaceC17869a1M64090c;
            } else {
                c28655q.m87138X();
                interfaceC17869a3 = interfaceC17869a2;
                f19 = f16;
                f24 = f17;
                f25 = f18;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: hy0.u1
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue8 = ((Integer) obj2).intValue();
                        return AbstractC17796v1.m51144c(trendType, interfaceC17869a3, f19, f24, f25, i13, i14, (Composer) obj, iIntValue8);
                    }
                };
            }
        }
        i15 |= 3072;
        f17 = f14;
        i18 = i14 & 16;
        if (i18 != 0) {
            if ((i13 & 24576) == 0) {
                f18 = f15;
                if (c28655q.m87147d(f18)) {
                    i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i19;
            }
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    if ((i14 & 2) != 0) {
                        interfaceC17869a1M64090c = C22411w.f87680a.m64537c().m64090c();
                    } else {
                        interfaceC17869a1M64090c = interfaceC17869a2;
                    }
                    if (i25 != 0) {
                        f19 = 1 * 8;
                    } else {
                        f19 = f16;
                    }
                    if (i16 != 0) {
                        f17 = 4 * 3;
                    }
                    if (i18 != 0) {
                        f26 = Float.NaN;
                        f27 = f17;
                    } else {
                        f27 = f17;
                        f26 = f18;
                    }
                } else {
                    if ((i14 & 2) != 0) {
                        interfaceC17869a1M64090c = C22411w.f87680a.m64537c().m64090c();
                    } else {
                        interfaceC17869a1M64090c = interfaceC17869a2;
                    }
                    if (i25 != 0) {
                        f19 = 1 * 8;
                    } else {
                        f19 = f16;
                    }
                    if (i16 != 0) {
                        f17 = 4 * 3;
                    }
                    if (i18 != 0) {
                        f26 = Float.NaN;
                        f27 = f17;
                    } else {
                        f27 = f17;
                        f26 = f18;
                    }
                }
                c28655q.m87175r();
                iconResource = trendType.getIconResource();
                if (iconResource == null) {
                    c28655q.m87150e0(1574045597);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1574045598);
                    int iIntValue8 = iconResource.intValue();
                    long backgroundColor8 = trendType.getBackgroundColor();
                    modifierM3394p = C2314t.f9131w;
                    Modifier modifierM3419p8 = AbstractC1102d.m3419p(f27, AbstractC1099a.m3394p(f19, AbstractC1092a.m3358c(modifierM3394p, backgroundColor8, interfaceC17869a1M64090c)));
                    if (!Float.isNaN(f26)) {
                        modifierM3394p = AbstractC1099a.m3394p(f26, modifierM3394p);
                    }
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(iIntValue8, c28655q, 6), AbstractC17808z1.m51180h(iIntValue8, c28655q, 0), modifierM3419p8.mo3471e(modifierM3394p), trendType.getIconColor(), c28655q, 0, 0);
                    c28655q.m87173q(false);
                }
                f25 = f26;
                f24 = f27;
                interfaceC17869a3 = interfaceC17869a1M64090c;
            } else {
                c28655q.m87138X();
                interfaceC17869a3 = interfaceC17869a2;
                f19 = f16;
                f24 = f17;
                f25 = f18;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: hy0.u1
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue9 = ((Integer) obj2).intValue();
                        return AbstractC17796v1.m51144c(trendType, interfaceC17869a3, f19, f24, f25, i13, i14, (Composer) obj, iIntValue9);
                    }
                };
            }
        }
        i15 |= 24576;
        f18 = f15;
        if ((i15 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28655q.m87140Z();
            if ((i13 & 1) != 0) {
                if ((i14 & 2) != 0) {
                    interfaceC17869a1M64090c = C22411w.f87680a.m64537c().m64090c();
                } else {
                    interfaceC17869a1M64090c = interfaceC17869a2;
                }
                if (i25 != 0) {
                    f19 = 1 * 8;
                } else {
                    f19 = f16;
                }
                if (i16 != 0) {
                    f17 = 4 * 3;
                }
                if (i18 != 0) {
                    f26 = Float.NaN;
                    f27 = f17;
                } else {
                    f27 = f17;
                    f26 = f18;
                }
            } else {
                if ((i14 & 2) != 0) {
                    interfaceC17869a1M64090c = C22411w.f87680a.m64537c().m64090c();
                } else {
                    interfaceC17869a1M64090c = interfaceC17869a2;
                }
                if (i25 != 0) {
                    f19 = 1 * 8;
                } else {
                    f19 = f16;
                }
                if (i16 != 0) {
                    f17 = 4 * 3;
                }
                if (i18 != 0) {
                    f26 = Float.NaN;
                    f27 = f17;
                } else {
                    f27 = f17;
                    f26 = f18;
                }
            }
            c28655q.m87175r();
            iconResource = trendType.getIconResource();
            if (iconResource == null) {
                c28655q.m87150e0(1574045597);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1574045598);
                int iIntValue9 = iconResource.intValue();
                long backgroundColor9 = trendType.getBackgroundColor();
                modifierM3394p = C2314t.f9131w;
                Modifier modifierM3419p9 = AbstractC1102d.m3419p(f27, AbstractC1099a.m3394p(f19, AbstractC1092a.m3358c(modifierM3394p, backgroundColor9, interfaceC17869a1M64090c)));
                if (!Float.isNaN(f26)) {
                    modifierM3394p = AbstractC1099a.m3394p(f26, modifierM3394p);
                }
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(iIntValue9, c28655q, 6), AbstractC17808z1.m51180h(iIntValue9, c28655q, 0), modifierM3419p9.mo3471e(modifierM3394p), trendType.getIconColor(), c28655q, 0, 0);
                c28655q.m87173q(false);
            }
            f25 = f26;
            f24 = f27;
            interfaceC17869a3 = interfaceC17869a1M64090c;
        } else {
            c28655q.m87138X();
            interfaceC17869a3 = interfaceC17869a2;
            f19 = f16;
            f24 = f17;
            f25 = f18;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: hy0.u1
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue10 = ((Integer) obj2).intValue();
                    return AbstractC17796v1.m51144c(trendType, interfaceC17869a3, f19, f24, f25, i13, i14, (Composer) obj, iIntValue10);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m51144c(C17723a2 c17723a2, InterfaceC17869a1 interfaceC17869a1, float f13, float f14, float f15, int i13, int i14, Composer composer, int i15) {
        m51143b(c17723a2, interfaceC17869a1, f13, f14, f15, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
