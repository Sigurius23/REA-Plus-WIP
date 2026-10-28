package ez0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.layout.AbstractC1131a;
import androidx.compose.runtime.Composer;
import az0.AbstractC2159b;
import ch.C4592m;
import ev2.C13698g;
import i91.AbstractC18247a;
import i91.AbstractC18249c;
import k91.C22302a;
import l83.C23454a0;
import l83.C23465k;
import m83.C25272z;
import no.nordicsemi.android.dfu.DfuBaseService;
import p026b2.C2314t;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p636y3.AbstractC39170b;
import p636y3.AbstractC39177i;
import p636y3.C39169a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import x81.C38072d;

/* JADX INFO: renamed from: ez0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aA\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Li91/a;", "background", "Lk91/a;", "roundedCorners", "", "fadeTop", "Ly3/f;", "extraBottom", "Ll83/a0;", "d", "(Landroidx/compose/ui/Modifier;Li91/a;Lk91/a;ZFLandroidx/compose/runtime/Composer;II)V", "extra", "f", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13758b {
    /* JADX WARN: Code duplicated, block: B:100:0x0174  */
    /* JADX WARN: Code duplicated, block: B:102:0x0180  */
    /* JADX WARN: Code duplicated, block: B:103:0x018f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0197  */
    /* JADX WARN: Code duplicated, block: B:107:0x019c  */
    /* JADX WARN: Code duplicated, block: B:110:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:113:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:54:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x0094  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:92:0x0105  */
    /* JADX WARN: Code duplicated, block: B:95:0x0122  */
    /* JADX WARN: Code duplicated, block: B:97:0x0125  */
    /* JADX WARN: Code duplicated, block: B:98:0x0132  */
    /* JADX INFO: renamed from: d */
    public static final void m39108d(Modifier modifier, AbstractC18247a abstractC18247a, C22302a c22302a, boolean z4, float f13, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        AbstractC18247a abstractC18247a2;
        C22302a c22302a2;
        boolean z13;
        int i16;
        float f14;
        int i17;
        boolean z14;
        Modifier modifier3;
        AbstractC18247a abstractC18247a3;
        C22302a c22302a3;
        boolean z15;
        float f15;
        C28677v1 c28677v1M87180u;
        AbstractC18247a abstractC18247aM52577o;
        C22302a c22302aM64093a;
        AbstractC18247a abstractC18247aM52570h;
        C22302a c22302aM64094b;
        Modifier modifierM39110f;
        long jM52573k;
        C17919x c17919x;
        long jM95628d;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1575605658);
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
            if ((i14 & 2) == 0) {
                abstractC18247a2 = abstractC18247a;
                int i19 = c28655q.m87153g(abstractC18247a2) ? 32 : 16;
                i15 |= i19;
            } else {
                abstractC18247a2 = abstractC18247a;
            }
            i15 |= i19;
        } else {
            abstractC18247a2 = abstractC18247a;
        }
        if ((i13 & 384) == 0) {
            if ((i14 & 4) == 0) {
                c22302a2 = c22302a;
                int i24 = c28655q.m87153g(c22302a2) ? 256 : 128;
                i15 |= i24;
            } else {
                c22302a2 = c22302a;
            }
            i15 |= i24;
        } else {
            c22302a2 = c22302a;
        }
        int i25 = i14 & 8;
        if (i25 == 0) {
            if ((i13 & 3072) == 0) {
                z13 = z4;
                i15 |= c28655q.m87155h(z13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    f14 = f13;
                    if (c28655q.m87147d(f14)) {
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
                        if ((i14 & 2) != 0) {
                            abstractC18247aM52577o = AbstractC18249c.m52577o(C38072d.f163053a.m121949b(c28655q, 6).getWhite10());
                            i15 &= -113;
                        } else {
                            abstractC18247aM52577o = abstractC18247a2;
                        }
                        if ((i14 & 4) != 0) {
                            c22302aM64093a = C22302a.INSTANCE.m64093a(1 * 4);
                            i15 &= -897;
                        } else {
                            c22302aM64093a = c22302a2;
                        }
                        if (i25 != 0) {
                            z13 = false;
                        }
                        if (i16 != 0) {
                            f14 = 0;
                        }
                    } else {
                        c28655q.m87138X();
                        if ((i14 & 2) != 0) {
                            i15 &= -113;
                        }
                        if ((i14 & 4) != 0) {
                            i15 &= -897;
                        }
                        modifier3 = modifier2;
                        abstractC18247aM52577o = abstractC18247a2;
                        c22302aM64093a = c22302a2;
                    }
                    c28655q.m87175r();
                    if (z13) {
                        c28655q.m87150e0(829731593);
                        jM52573k = AbstractC18249c.m52573k(abstractC18247aM52577o, c28655q, (i15 >> 3) & 14);
                        c17919x = new C17919x(jM52573k);
                        if (C17919x.m51542d(jM52573k, C17919x.f69637n)) {
                            c17919x = null;
                        }
                        if (c17919x == null) {
                            c28655q.m87150e0(1966431149);
                            jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
                        } else {
                            c28655q.m87150e0(1966428700);
                            c28655q.m87173q(false);
                            jM95628d = c17919x.f69639a;
                        }
                        abstractC18247aM52570h = AbstractC18249c.m52570h(C17909s.m51494l(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.m51541c(0.0f, jM95628d))), new C23465k(Float.valueOf(0.5f), new C17919x(jM95628d))}, 0.0f, 0.0f, 14));
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(830002626);
                        c28655q.m87173q(false);
                        abstractC18247aM52570h = abstractC18247aM52577o;
                    }
                    if (z13) {
                        c22302aM64094b = C22302a.INSTANCE.m64094b(c22302aM64093a.getBottomStart(), c22302aM64093a.getBottomEnd());
                    } else {
                        c22302aM64094b = c22302aM64093a;
                    }
                    if (Float.compare(f14, 0) > 0) {
                        modifierM39110f = m39110f(modifier3, f14);
                    } else {
                        modifierM39110f = modifier3;
                    }
                    AbstractC2159b.m6721b(modifierM39110f, abstractC18247aM52570h, c22302aM64094b, c28655q, 0, 0);
                    AbstractC18247a abstractC18247a4 = abstractC18247aM52577o;
                    c22302a3 = c22302aM64093a;
                    abstractC18247a3 = abstractC18247a4;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    abstractC18247a3 = abstractC18247a2;
                    c22302a3 = c22302a2;
                }
                z15 = z13;
                f15 = f14;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C13757a(modifier3, abstractC18247a3, c22302a3, z15, f15, i13, i14);
                }
            }
            i15 |= 24576;
            f14 = f13;
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
                    if ((i14 & 2) != 0) {
                        abstractC18247aM52577o = AbstractC18249c.m52577o(C38072d.f163053a.m121949b(c28655q, 6).getWhite10());
                        i15 &= -113;
                    } else {
                        abstractC18247aM52577o = abstractC18247a2;
                    }
                    if ((i14 & 4) != 0) {
                        c22302aM64093a = C22302a.INSTANCE.m64093a(1 * 4);
                        i15 &= -897;
                    } else {
                        c22302aM64093a = c22302a2;
                    }
                    if (i25 != 0) {
                        z13 = false;
                    }
                    if (i16 != 0) {
                        f14 = 0;
                    }
                } else {
                    if (i18 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i14 & 2) != 0) {
                        abstractC18247aM52577o = AbstractC18249c.m52577o(C38072d.f163053a.m121949b(c28655q, 6).getWhite10());
                        i15 &= -113;
                    } else {
                        abstractC18247aM52577o = abstractC18247a2;
                    }
                    if ((i14 & 4) != 0) {
                        c22302aM64093a = C22302a.INSTANCE.m64093a(1 * 4);
                        i15 &= -897;
                    } else {
                        c22302aM64093a = c22302a2;
                    }
                    if (i25 != 0) {
                        z13 = false;
                    }
                    if (i16 != 0) {
                        f14 = 0;
                    }
                }
                c28655q.m87175r();
                if (z13) {
                    c28655q.m87150e0(829731593);
                    jM52573k = AbstractC18249c.m52573k(abstractC18247aM52577o, c28655q, (i15 >> 3) & 14);
                    c17919x = new C17919x(jM52573k);
                    if (C17919x.m51542d(jM52573k, C17919x.f69637n)) {
                        c17919x = null;
                    }
                    if (c17919x == null) {
                        c28655q.m87150e0(1966431149);
                        jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
                    } else {
                        c28655q.m87150e0(1966428700);
                        c28655q.m87173q(false);
                        jM95628d = c17919x.f69639a;
                    }
                    abstractC18247aM52570h = AbstractC18249c.m52570h(C17909s.m51494l(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.m51541c(0.0f, jM95628d))), new C23465k(Float.valueOf(0.5f), new C17919x(jM95628d))}, 0.0f, 0.0f, 14));
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(830002626);
                    c28655q.m87173q(false);
                    abstractC18247aM52570h = abstractC18247aM52577o;
                }
                if (z13) {
                    c22302aM64094b = C22302a.INSTANCE.m64094b(c22302aM64093a.getBottomStart(), c22302aM64093a.getBottomEnd());
                } else {
                    c22302aM64094b = c22302aM64093a;
                }
                if (Float.compare(f14, 0) > 0) {
                    modifierM39110f = m39110f(modifier3, f14);
                } else {
                    modifierM39110f = modifier3;
                }
                AbstractC2159b.m6721b(modifierM39110f, abstractC18247aM52570h, c22302aM64094b, c28655q, 0, 0);
                AbstractC18247a abstractC18247a5 = abstractC18247aM52577o;
                c22302a3 = c22302aM64093a;
                abstractC18247a3 = abstractC18247a5;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                abstractC18247a3 = abstractC18247a2;
                c22302a3 = c22302a2;
            }
            z15 = z13;
            f15 = f14;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13757a(modifier3, abstractC18247a3, c22302a3, z15, f15, i13, i14);
            }
        }
        i15 |= 3072;
        z13 = z4;
        i16 = i14 & 16;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                f14 = f13;
                if (c28655q.m87147d(f14)) {
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
                    if ((i14 & 2) != 0) {
                        abstractC18247aM52577o = AbstractC18249c.m52577o(C38072d.f163053a.m121949b(c28655q, 6).getWhite10());
                        i15 &= -113;
                    } else {
                        abstractC18247aM52577o = abstractC18247a2;
                    }
                    if ((i14 & 4) != 0) {
                        c22302aM64093a = C22302a.INSTANCE.m64093a(1 * 4);
                        i15 &= -897;
                    } else {
                        c22302aM64093a = c22302a2;
                    }
                    if (i25 != 0) {
                        z13 = false;
                    }
                    if (i16 != 0) {
                        f14 = 0;
                    }
                } else {
                    if (i18 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i14 & 2) != 0) {
                        abstractC18247aM52577o = AbstractC18249c.m52577o(C38072d.f163053a.m121949b(c28655q, 6).getWhite10());
                        i15 &= -113;
                    } else {
                        abstractC18247aM52577o = abstractC18247a2;
                    }
                    if ((i14 & 4) != 0) {
                        c22302aM64093a = C22302a.INSTANCE.m64093a(1 * 4);
                        i15 &= -897;
                    } else {
                        c22302aM64093a = c22302a2;
                    }
                    if (i25 != 0) {
                        z13 = false;
                    }
                    if (i16 != 0) {
                        f14 = 0;
                    }
                }
                c28655q.m87175r();
                if (z13) {
                    c28655q.m87150e0(829731593);
                    jM52573k = AbstractC18249c.m52573k(abstractC18247aM52577o, c28655q, (i15 >> 3) & 14);
                    c17919x = new C17919x(jM52573k);
                    if (C17919x.m51542d(jM52573k, C17919x.f69637n)) {
                        c17919x = null;
                    }
                    if (c17919x == null) {
                        c28655q.m87150e0(1966431149);
                        jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
                    } else {
                        c28655q.m87150e0(1966428700);
                        c28655q.m87173q(false);
                        jM95628d = c17919x.f69639a;
                    }
                    abstractC18247aM52570h = AbstractC18249c.m52570h(C17909s.m51494l(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.m51541c(0.0f, jM95628d))), new C23465k(Float.valueOf(0.5f), new C17919x(jM95628d))}, 0.0f, 0.0f, 14));
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(830002626);
                    c28655q.m87173q(false);
                    abstractC18247aM52570h = abstractC18247aM52577o;
                }
                if (z13) {
                    c22302aM64094b = C22302a.INSTANCE.m64094b(c22302aM64093a.getBottomStart(), c22302aM64093a.getBottomEnd());
                } else {
                    c22302aM64094b = c22302aM64093a;
                }
                if (Float.compare(f14, 0) > 0) {
                    modifierM39110f = m39110f(modifier3, f14);
                } else {
                    modifierM39110f = modifier3;
                }
                AbstractC2159b.m6721b(modifierM39110f, abstractC18247aM52570h, c22302aM64094b, c28655q, 0, 0);
                AbstractC18247a abstractC18247a6 = abstractC18247aM52577o;
                c22302a3 = c22302aM64093a;
                abstractC18247a3 = abstractC18247a6;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                abstractC18247a3 = abstractC18247a2;
                c22302a3 = c22302a2;
            }
            z15 = z13;
            f15 = f14;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13757a(modifier3, abstractC18247a3, c22302a3, z15, f15, i13, i14);
            }
        }
        i15 |= 24576;
        f14 = f13;
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
                if ((i14 & 2) != 0) {
                    abstractC18247aM52577o = AbstractC18249c.m52577o(C38072d.f163053a.m121949b(c28655q, 6).getWhite10());
                    i15 &= -113;
                } else {
                    abstractC18247aM52577o = abstractC18247a2;
                }
                if ((i14 & 4) != 0) {
                    c22302aM64093a = C22302a.INSTANCE.m64093a(1 * 4);
                    i15 &= -897;
                } else {
                    c22302aM64093a = c22302a2;
                }
                if (i25 != 0) {
                    z13 = false;
                }
                if (i16 != 0) {
                    f14 = 0;
                }
            } else {
                if (i18 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                if ((i14 & 2) != 0) {
                    abstractC18247aM52577o = AbstractC18249c.m52577o(C38072d.f163053a.m121949b(c28655q, 6).getWhite10());
                    i15 &= -113;
                } else {
                    abstractC18247aM52577o = abstractC18247a2;
                }
                if ((i14 & 4) != 0) {
                    c22302aM64093a = C22302a.INSTANCE.m64093a(1 * 4);
                    i15 &= -897;
                } else {
                    c22302aM64093a = c22302a2;
                }
                if (i25 != 0) {
                    z13 = false;
                }
                if (i16 != 0) {
                    f14 = 0;
                }
            }
            c28655q.m87175r();
            if (z13) {
                c28655q.m87150e0(829731593);
                jM52573k = AbstractC18249c.m52573k(abstractC18247aM52577o, c28655q, (i15 >> 3) & 14);
                c17919x = new C17919x(jM52573k);
                if (C17919x.m51542d(jM52573k, C17919x.f69637n)) {
                    c17919x = null;
                }
                if (c17919x == null) {
                    c28655q.m87150e0(1966431149);
                    jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
                } else {
                    c28655q.m87150e0(1966428700);
                    c28655q.m87173q(false);
                    jM95628d = c17919x.f69639a;
                }
                abstractC18247aM52570h = AbstractC18249c.m52570h(C17909s.m51494l(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.m51541c(0.0f, jM95628d))), new C23465k(Float.valueOf(0.5f), new C17919x(jM95628d))}, 0.0f, 0.0f, 14));
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(830002626);
                c28655q.m87173q(false);
                abstractC18247aM52570h = abstractC18247aM52577o;
            }
            if (z13) {
                c22302aM64094b = C22302a.INSTANCE.m64094b(c22302aM64093a.getBottomStart(), c22302aM64093a.getBottomEnd());
            } else {
                c22302aM64094b = c22302aM64093a;
            }
            if (Float.compare(f14, 0) > 0) {
                modifierM39110f = m39110f(modifier3, f14);
            } else {
                modifierM39110f = modifier3;
            }
            AbstractC2159b.m6721b(modifierM39110f, abstractC18247aM52570h, c22302aM64094b, c28655q, 0, 0);
            AbstractC18247a abstractC18247a7 = abstractC18247aM52577o;
            c22302a3 = c22302aM64093a;
            abstractC18247a3 = abstractC18247a7;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            abstractC18247a3 = abstractC18247a2;
            c22302a3 = c22302a2;
        }
        z15 = z13;
        f15 = f14;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13757a(modifier3, abstractC18247a3, c22302a3, z15, f15, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m39109e(Modifier modifier, AbstractC18247a abstractC18247a, C22302a c22302a, boolean z4, float f13, int i13, int i14, Composer composer, int i15) {
        m39108d(modifier, abstractC18247a, c22302a, z4, f13, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: f */
    private static final Modifier m39110f(Modifier modifier, float f13) {
        return AbstractC1131a.m3498b(modifier, new C13698g(f13, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final InterfaceC39130s0 m39111g(float f13, InterfaceC39133t0 layout, InterfaceC39124q0 measurable, C39169a c39169a) {
        AbstractC22676k.m65750j(layout, "$this$layout");
        AbstractC22676k.m65750j(measurable, "measurable");
        int iMo724F = layout.mo724F(f13);
        long j7 = c39169a.f168407a;
        int iM124765i = C39169a.m124761e(j7) ? C39169a.m124765i(j7) : C39169a.m124767k(j7);
        int iM124764h = (C39169a.m124760d(j7) ? C39169a.m124764h(j7) : C39169a.m124766j(j7)) + iMo724F;
        if (iM124765i < 0) {
            iM124765i = 0;
        }
        if (iM124764h < 0) {
            iM124764h = 0;
        }
        if (!((iM124764h >= 0) & (iM124765i >= 0))) {
            AbstractC39177i.m124789a("width and height must be >= 0");
        }
        AbstractC39104j1 abstractC39104j1Mo448T = measurable.mo448T(AbstractC39170b.m124776h(iM124765i, iM124765i, iM124764h, iM124764h));
        return layout.mo86822W(abstractC39104j1Mo448T.f168211w, abstractC39104j1Mo448T.f168212x, C25272z.f99163w, new C4592m(abstractC39104j1Mo448T, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m39112h(AbstractC39104j1 abstractC39104j1, AbstractC39101i1 layout) {
        AbstractC22676k.m65750j(layout, "$this$layout");
        layout.m124632f(abstractC39104j1, 0, 0, 0.0f);
        return C23454a0.f92919a;
    }
}
