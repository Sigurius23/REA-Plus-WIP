package y11;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b21.AbstractC2331d;
import b21.AbstractC2333f;
import l83.C23454a0;
import l83.C23465k;
import no.nordicsemi.android.dfu.DfuBaseService;
import p026b2.C2314t;
import p077d0.AbstractC11343d2;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import t81.C33604j;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: y11.g */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aM\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "percent", "Li2/x;", "fillColor", "", "showAverage", "Ll83/k;", "averageRange", "Ll83/a0;", "b", "(Landroidx/compose/ui/Modifier;FJZLl83/k;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39054g {
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0098  */
    /* JADX WARN: Code duplicated, block: B:57:0x009a  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:70:0x00be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:79:0x00da  */
    /* JADX WARN: Code duplicated, block: B:80:0x00df  */
    /* JADX WARN: Code duplicated, block: B:82:0x0117  */
    /* JADX WARN: Code duplicated, block: B:85:0x0123  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m124501b(Modifier modifier, float f13, long j7, boolean z4, C23465k c23465k, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        float f14;
        long brandWhite;
        boolean z13;
        int i16;
        C23465k c23465k2;
        int i17;
        boolean z14;
        long j13;
        boolean z15;
        C23465k c23465k3;
        C28677v1 c28677v1M87180u;
        Modifier modifier3;
        Modifier modifier4;
        C23465k c23465k4;
        long j14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(918570941);
        int i18 = i14 & 1;
        if (i18 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            f14 = f13;
            i15 |= c28655q.m87147d(f14) ? 32 : 16;
        } else {
            f14 = f13;
        }
        if ((i13 & 384) == 0) {
            if ((i14 & 4) == 0) {
                brandWhite = j7;
                int i19 = c28655q.m87151f(brandWhite) ? 256 : 128;
                i15 |= i19;
            } else {
                brandWhite = j7;
            }
            i15 |= i19;
        } else {
            brandWhite = j7;
        }
        int i24 = i14 & 8;
        if (i24 == 0) {
            if ((i13 & 3072) == 0) {
                z13 = z4;
                i15 |= c28655q.m87155h(z13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    c23465k2 = c23465k;
                    if (c28655q.m87153g(c23465k2)) {
                        i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i17;
                }
                if ((i15 & 9363) != 9362) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    c28655q.m87140Z();
                    if ((i13 & 1) != 0 || c28655q.m87118C()) {
                        if (i18 != 0) {
                            modifier3 = C2314t.f9131w;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i14 & 4) != 0) {
                            brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                            i15 &= -897;
                        }
                        if (i24 != 0) {
                            z13 = true;
                        }
                        if (i16 != 0) {
                            modifier4 = modifier3;
                            c23465k4 = null;
                            j14 = brandWhite;
                        } else {
                            modifier4 = modifier3;
                        }
                        c28655q.m87175r();
                        boolean z16 = z13;
                        AbstractC2331d.m7185j(AbstractC11343d2.m30544f(Boolean.FALSE, "Horizontal Bar Graph", c28655q, 54, 0), modifier4, AbstractC2333f.m7193a(AbstractC37056f.m118958J(new C23465k(Float.valueOf(0.0f), Float.valueOf(f14)))), j14, z16, c23465k4, c28655q, (i15 << 3) & 523376, 0);
                        modifier2 = modifier4;
                        j13 = j14;
                        z15 = z16;
                        c23465k3 = c23465k4;
                    } else {
                        c28655q.m87138X();
                        if ((i14 & 4) != 0) {
                            i15 &= -897;
                        }
                        modifier4 = modifier2;
                    }
                    j14 = brandWhite;
                    c23465k4 = c23465k2;
                    c28655q.m87175r();
                    boolean z17 = z13;
                    AbstractC2331d.m7185j(AbstractC11343d2.m30544f(Boolean.FALSE, "Horizontal Bar Graph", c28655q, 54, 0), modifier4, AbstractC2333f.m7193a(AbstractC37056f.m118958J(new C23465k(Float.valueOf(0.0f), Float.valueOf(f14)))), j14, z17, c23465k4, c28655q, (i15 << 3) & 523376, 0);
                    modifier2 = modifier4;
                    j13 = j14;
                    z15 = z17;
                    c23465k3 = c23465k4;
                } else {
                    c28655q.m87138X();
                    j13 = brandWhite;
                    z15 = z13;
                    c23465k3 = c23465k2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C33604j(modifier2, f13, j13, z15, c23465k3, i13, i14);
                }
            }
            i15 |= 24576;
            c23465k2 = c23465k;
            if ((i15 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i18 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i14 & 4) != 0) {
                        brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                        i15 &= -897;
                    }
                    if (i24 != 0) {
                        z13 = true;
                    }
                    if (i16 != 0) {
                        modifier4 = modifier3;
                        c23465k4 = null;
                        j14 = brandWhite;
                    } else {
                        modifier4 = modifier3;
                        j14 = brandWhite;
                        c23465k4 = c23465k2;
                    }
                } else {
                    if (i18 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i14 & 4) != 0) {
                        brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                        i15 &= -897;
                    }
                    if (i24 != 0) {
                        z13 = true;
                    }
                    if (i16 != 0) {
                        modifier4 = modifier3;
                        c23465k4 = null;
                        j14 = brandWhite;
                    } else {
                        modifier4 = modifier3;
                        j14 = brandWhite;
                        c23465k4 = c23465k2;
                    }
                }
                c28655q.m87175r();
                boolean z18 = z13;
                AbstractC2331d.m7185j(AbstractC11343d2.m30544f(Boolean.FALSE, "Horizontal Bar Graph", c28655q, 54, 0), modifier4, AbstractC2333f.m7193a(AbstractC37056f.m118958J(new C23465k(Float.valueOf(0.0f), Float.valueOf(f14)))), j14, z18, c23465k4, c28655q, (i15 << 3) & 523376, 0);
                modifier2 = modifier4;
                j13 = j14;
                z15 = z18;
                c23465k3 = c23465k4;
            } else {
                c28655q.m87138X();
                j13 = brandWhite;
                z15 = z13;
                c23465k3 = c23465k2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C33604j(modifier2, f13, j13, z15, c23465k3, i13, i14);
            }
        }
        i15 |= 3072;
        z13 = z4;
        i16 = i14 & 16;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                c23465k2 = c23465k;
                if (c28655q.m87153g(c23465k2)) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            if ((i15 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i18 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i14 & 4) != 0) {
                        brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                        i15 &= -897;
                    }
                    if (i24 != 0) {
                        z13 = true;
                    }
                    if (i16 != 0) {
                        modifier4 = modifier3;
                        c23465k4 = null;
                        j14 = brandWhite;
                    } else {
                        modifier4 = modifier3;
                        j14 = brandWhite;
                        c23465k4 = c23465k2;
                    }
                } else {
                    if (i18 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i14 & 4) != 0) {
                        brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                        i15 &= -897;
                    }
                    if (i24 != 0) {
                        z13 = true;
                    }
                    if (i16 != 0) {
                        modifier4 = modifier3;
                        c23465k4 = null;
                        j14 = brandWhite;
                    } else {
                        modifier4 = modifier3;
                        j14 = brandWhite;
                        c23465k4 = c23465k2;
                    }
                }
                c28655q.m87175r();
                boolean z19 = z13;
                AbstractC2331d.m7185j(AbstractC11343d2.m30544f(Boolean.FALSE, "Horizontal Bar Graph", c28655q, 54, 0), modifier4, AbstractC2333f.m7193a(AbstractC37056f.m118958J(new C23465k(Float.valueOf(0.0f), Float.valueOf(f14)))), j14, z19, c23465k4, c28655q, (i15 << 3) & 523376, 0);
                modifier2 = modifier4;
                j13 = j14;
                z15 = z19;
                c23465k3 = c23465k4;
            } else {
                c28655q.m87138X();
                j13 = brandWhite;
                z15 = z13;
                c23465k3 = c23465k2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C33604j(modifier2, f13, j13, z15, c23465k3, i13, i14);
            }
        }
        i15 |= 24576;
        c23465k2 = c23465k;
        if ((i15 & 9363) != 9362) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i15 & 1, z14)) {
            c28655q.m87140Z();
            if ((i13 & 1) != 0) {
                if (i18 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                if ((i14 & 4) != 0) {
                    brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                    i15 &= -897;
                }
                if (i24 != 0) {
                    z13 = true;
                }
                if (i16 != 0) {
                    modifier4 = modifier3;
                    c23465k4 = null;
                    j14 = brandWhite;
                } else {
                    modifier4 = modifier3;
                    j14 = brandWhite;
                    c23465k4 = c23465k2;
                }
            } else {
                if (i18 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                if ((i14 & 4) != 0) {
                    brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                    i15 &= -897;
                }
                if (i24 != 0) {
                    z13 = true;
                }
                if (i16 != 0) {
                    modifier4 = modifier3;
                    c23465k4 = null;
                    j14 = brandWhite;
                } else {
                    modifier4 = modifier3;
                    j14 = brandWhite;
                    c23465k4 = c23465k2;
                }
            }
            c28655q.m87175r();
            boolean z110 = z13;
            AbstractC2331d.m7185j(AbstractC11343d2.m30544f(Boolean.FALSE, "Horizontal Bar Graph", c28655q, 54, 0), modifier4, AbstractC2333f.m7193a(AbstractC37056f.m118958J(new C23465k(Float.valueOf(0.0f), Float.valueOf(f14)))), j14, z110, c23465k4, c28655q, (i15 << 3) & 523376, 0);
            modifier2 = modifier4;
            j13 = j14;
            z15 = z110;
            c23465k3 = c23465k4;
        } else {
            c28655q.m87138X();
            j13 = brandWhite;
            z15 = z13;
            c23465k3 = c23465k2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33604j(modifier2, f13, j13, z15, c23465k3, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m124502c(Modifier modifier, float f13, long j7, boolean z4, C23465k c23465k, int i13, int i14, Composer composer, int i15) {
        m124501b(modifier, f13, j7, z4, c23465k, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
