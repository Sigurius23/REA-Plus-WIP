package h01;

import a01.C0086f;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import ep1.C13421p;
import g40.C15369i3;
import gy0.AbstractC16277f;
import gz0.C16305i0;
import gz0.EnumC16313m0;
import h00.C16497d0;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27242b1;
import ny0.AbstractC27274q;
import ny0.C27270o;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p291l0.InterfaceC22973k1;
import p291l0.InterfaceC23001u;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.InterfaceC39332e;
import x81.C38072d;

/* JADX INFO: renamed from: h01.x */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a7\u0010\n\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a?\u0010\u0011\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000fH\u0001¢\u0006\u0004\b\u0011\u0010\u0012\"\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0017\u0010\u001b\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017¨\u0006\u001c"}, m65681d2 = {"Ll0/u;", "Landroidx/compose/ui/Modifier;", "modifier", "Ll0/k1;", "paddingValues", "Lgz0/m0;", "icon", "Ly81/e;", "color", "Ll83/a0;", "i", "(Ll0/u;Landroidx/compose/ui/Modifier;Ll0/k1;Lgz0/m0;Ly81/e;Landroidx/compose/runtime/Composer;II)V", "", "isExpanded", "isHealthFutureIA", "Lkotlin/Function0;", "onClick", "e", "(Ll0/u;Landroidx/compose/ui/Modifier;ZZLc93/a;Landroidx/compose/runtime/Composer;II)V", "Ly3/f;", "a", "F", "getIconVerticalPadding", "()F", "iconVerticalPadding", "b", "getIconEndPadding", "iconEndPadding", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC16557x {

    /* JADX INFO: renamed from: a */
    private static final float f63736a;

    /* JADX INFO: renamed from: b */
    private static final float f63737b;

    static {
        float f13 = 8;
        f63736a = ((float) 2.5d) * f13;
        f63737b = ((float) 0.5d) * f13;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:56:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00be  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:81:0x011c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0123 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x0125  */
    /* JADX WARN: Code duplicated, block: B:87:0x013d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0149  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public static final void m46850e(InterfaceC23001u interfaceC23001u, Modifier modifier, boolean z4, boolean z13, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        boolean z14;
        int i17;
        int i18;
        InterfaceC4339a interfaceC4339a2;
        int i19;
        boolean z15;
        Modifier modifier3;
        boolean z16;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        boolean z17;
        C28676v0 c28676v0;
        AbstractC27274q abstractC27274q;
        C16305i0 c16305i0M46425o;
        int iM46234l;
        boolean z18;
        Object objM87133R;
        Object objM87133R2;
        int i24;
        AbstractC22676k.m65750j(interfaceC23001u, "<this>");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-616103858);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(interfaceC23001u) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i25 = i14 & 1;
        if (i25 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if (c28655q.m87155h(z4)) {
                    i24 = 256;
                } else {
                    i24 = 128;
                }
                i15 |= i24;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    z14 = z13;
                    if (c28655q.m87155h(z14)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 24576) == 0) {
                        interfaceC4339a2 = interfaceC4339a;
                        if (c28655q.m87157i(interfaceC4339a2)) {
                            i19 = 16384;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i19;
                    }
                    if ((i15 & 9363) != 9362) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z15)) {
                        c2314t = C2314t.f9131w;
                        if (i25 != 0) {
                            modifier4 = c2314t;
                        } else {
                            modifier4 = modifier2;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        } else {
                            z17 = z14;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i18 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C16497d0(2);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                        } else {
                            interfaceC4339a3 = interfaceC4339a2;
                        }
                        if (z17) {
                            abstractC27274q = AbstractC27274q.c.f109140f;
                        } else {
                            abstractC27274q = AbstractC27274q.b.f109138f;
                        }
                        AbstractC27274q abstractC27274q2 = abstractC27274q;
                        c16305i0M46425o = C38072d.f163053a.m121951d().getTinyIcons();
                        if (z4) {
                            iM46234l = c16305i0M46425o.getUpArrow();
                        } else {
                            iM46234l = c16305i0M46425o.getDownArrow();
                        }
                        C27270o c27270o = new C27270o(abstractC27274q2, iM46234l, null, null, null, false, false, false, 0.0f, false, 1020, null);
                        String strM21273g = AbstractC8693b.m21273g(AbstractC16277f.f62376s1, c28655q, 0);
                        float f13 = f63737b;
                        Modifier modifierM3398t = AbstractC1099a.m3398t(modifier4, 0.0f, 0.0f, f13, f13, 3);
                        Modifier modifierMo3400a = interfaceC23001u.mo3400a(c2314t, C2299e.f9106I);
                        z18 = (i15 & 57344) == 16384;
                        objM87133R = c28655q.m87133R();
                        if (z18 || objM87133R == c28676v0) {
                            objM87133R = new C15369i3(interfaceC4339a3, 10);
                            c28655q.m87172p0(objM87133R);
                        }
                        AbstractC27242b1.m82092d(c27270o, strM21273g, modifierM3398t, modifierMo3400a, (InterfaceC4339a) objM87133R, c28655q, 0, 0);
                        z16 = z17;
                        modifier3 = modifier4;
                    } else {
                        c28655q.m87138X();
                        modifier3 = modifier2;
                        z16 = z14;
                        interfaceC4339a3 = interfaceC4339a2;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C13421p(interfaceC23001u, modifier3, z4, z16, interfaceC4339a3, i13, i14, 6);
                    }
                }
                i15 |= 24576;
                interfaceC4339a2 = interfaceC4339a;
                if ((i15 & 9363) != 9362) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c28655q.m87135U(i15 & 1, z15)) {
                    c2314t = C2314t.f9131w;
                    if (i25 != 0) {
                        modifier4 = c2314t;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i16 != 0) {
                        z17 = false;
                    } else {
                        z17 = z14;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C16497d0(2);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a3 = interfaceC4339a2;
                    }
                    if (z17) {
                        abstractC27274q = AbstractC27274q.c.f109140f;
                    } else {
                        abstractC27274q = AbstractC27274q.b.f109138f;
                    }
                    AbstractC27274q abstractC27274q3 = abstractC27274q;
                    c16305i0M46425o = C38072d.f163053a.m121951d().getTinyIcons();
                    if (z4) {
                        iM46234l = c16305i0M46425o.getUpArrow();
                    } else {
                        iM46234l = c16305i0M46425o.getDownArrow();
                    }
                    C27270o c27270o2 = new C27270o(abstractC27274q3, iM46234l, null, null, null, false, false, false, 0.0f, false, 1020, null);
                    String strM21273g2 = AbstractC8693b.m21273g(AbstractC16277f.f62376s1, c28655q, 0);
                    float f14 = f63737b;
                    Modifier modifierM3398t2 = AbstractC1099a.m3398t(modifier4, 0.0f, 0.0f, f14, f14, 3);
                    Modifier modifierMo3400a2 = interfaceC23001u.mo3400a(c2314t, C2299e.f9106I);
                    if ((i15 & 57344) == 16384) {
                    }
                    objM87133R = c28655q.m87133R();
                    if (z18) {
                        objM87133R = new C15369i3(interfaceC4339a3, 10);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C15369i3(interfaceC4339a3, 10);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC27242b1.m82092d(c27270o2, strM21273g2, modifierM3398t2, modifierMo3400a2, (InterfaceC4339a) objM87133R, c28655q, 0, 0);
                    z16 = z17;
                    modifier3 = modifier4;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    z16 = z14;
                    interfaceC4339a3 = interfaceC4339a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C13421p(interfaceC23001u, modifier3, z4, z16, interfaceC4339a3, i13, i14, 6);
                }
            }
            i15 |= 3072;
            z14 = z13;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q.m87157i(interfaceC4339a2)) {
                        i19 = 16384;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                if ((i15 & 9363) != 9362) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c28655q.m87135U(i15 & 1, z15)) {
                    c2314t = C2314t.f9131w;
                    if (i25 != 0) {
                        modifier4 = c2314t;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i16 != 0) {
                        z17 = false;
                    } else {
                        z17 = z14;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C16497d0(2);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a3 = interfaceC4339a2;
                    }
                    if (z17) {
                        abstractC27274q = AbstractC27274q.c.f109140f;
                    } else {
                        abstractC27274q = AbstractC27274q.b.f109138f;
                    }
                    AbstractC27274q abstractC27274q4 = abstractC27274q;
                    c16305i0M46425o = C38072d.f163053a.m121951d().getTinyIcons();
                    if (z4) {
                        iM46234l = c16305i0M46425o.getUpArrow();
                    } else {
                        iM46234l = c16305i0M46425o.getDownArrow();
                    }
                    C27270o c27270o3 = new C27270o(abstractC27274q4, iM46234l, null, null, null, false, false, false, 0.0f, false, 1020, null);
                    String strM21273g3 = AbstractC8693b.m21273g(AbstractC16277f.f62376s1, c28655q, 0);
                    float f15 = f63737b;
                    Modifier modifierM3398t3 = AbstractC1099a.m3398t(modifier4, 0.0f, 0.0f, f15, f15, 3);
                    Modifier modifierMo3400a3 = interfaceC23001u.mo3400a(c2314t, C2299e.f9106I);
                    if ((i15 & 57344) == 16384) {
                    }
                    objM87133R = c28655q.m87133R();
                    if (z18) {
                        objM87133R = new C15369i3(interfaceC4339a3, 10);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C15369i3(interfaceC4339a3, 10);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC27242b1.m82092d(c27270o3, strM21273g3, modifierM3398t3, modifierMo3400a3, (InterfaceC4339a) objM87133R, c28655q, 0, 0);
                    z16 = z17;
                    modifier3 = modifier4;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    z16 = z14;
                    interfaceC4339a3 = interfaceC4339a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C13421p(interfaceC23001u, modifier3, z4, z16, interfaceC4339a3, i13, i14, 6);
                }
            }
            i15 |= 24576;
            interfaceC4339a2 = interfaceC4339a;
            if ((i15 & 9363) != 9362) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q.m87135U(i15 & 1, z15)) {
                c2314t = C2314t.f9131w;
                if (i25 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                if (i16 != 0) {
                    z17 = false;
                } else {
                    z17 = z14;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C16497d0(2);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a3 = interfaceC4339a2;
                }
                if (z17) {
                    abstractC27274q = AbstractC27274q.c.f109140f;
                } else {
                    abstractC27274q = AbstractC27274q.b.f109138f;
                }
                AbstractC27274q abstractC27274q5 = abstractC27274q;
                c16305i0M46425o = C38072d.f163053a.m121951d().getTinyIcons();
                if (z4) {
                    iM46234l = c16305i0M46425o.getUpArrow();
                } else {
                    iM46234l = c16305i0M46425o.getDownArrow();
                }
                C27270o c27270o4 = new C27270o(abstractC27274q5, iM46234l, null, null, null, false, false, false, 0.0f, false, 1020, null);
                String strM21273g4 = AbstractC8693b.m21273g(AbstractC16277f.f62376s1, c28655q, 0);
                float f16 = f63737b;
                Modifier modifierM3398t4 = AbstractC1099a.m3398t(modifier4, 0.0f, 0.0f, f16, f16, 3);
                Modifier modifierMo3400a4 = interfaceC23001u.mo3400a(c2314t, C2299e.f9106I);
                if ((i15 & 57344) == 16384) {
                }
                objM87133R = c28655q.m87133R();
                if (z18) {
                    objM87133R = new C15369i3(interfaceC4339a3, 10);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C15369i3(interfaceC4339a3, 10);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC27242b1.m82092d(c27270o4, strM21273g4, modifierM3398t4, modifierMo3400a4, (InterfaceC4339a) objM87133R, c28655q, 0, 0);
                z16 = z17;
                modifier3 = modifier4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                z16 = z14;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13421p(interfaceC23001u, modifier3, z4, z16, interfaceC4339a3, i13, i14, 6);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        if ((i13 & 384) == 0) {
            if (c28655q.m87155h(z4)) {
                i24 = 256;
            } else {
                i24 = 128;
            }
            i15 |= i24;
        }
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                z14 = z13;
                if (c28655q.m87155h(z14)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q.m87157i(interfaceC4339a2)) {
                        i19 = 16384;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                if ((i15 & 9363) != 9362) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c28655q.m87135U(i15 & 1, z15)) {
                    c2314t = C2314t.f9131w;
                    if (i25 != 0) {
                        modifier4 = c2314t;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i16 != 0) {
                        z17 = false;
                    } else {
                        z17 = z14;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C16497d0(2);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a3 = interfaceC4339a2;
                    }
                    if (z17) {
                        abstractC27274q = AbstractC27274q.c.f109140f;
                    } else {
                        abstractC27274q = AbstractC27274q.b.f109138f;
                    }
                    AbstractC27274q abstractC27274q6 = abstractC27274q;
                    c16305i0M46425o = C38072d.f163053a.m121951d().getTinyIcons();
                    if (z4) {
                        iM46234l = c16305i0M46425o.getUpArrow();
                    } else {
                        iM46234l = c16305i0M46425o.getDownArrow();
                    }
                    C27270o c27270o5 = new C27270o(abstractC27274q6, iM46234l, null, null, null, false, false, false, 0.0f, false, 1020, null);
                    String strM21273g5 = AbstractC8693b.m21273g(AbstractC16277f.f62376s1, c28655q, 0);
                    float f17 = f63737b;
                    Modifier modifierM3398t5 = AbstractC1099a.m3398t(modifier4, 0.0f, 0.0f, f17, f17, 3);
                    Modifier modifierMo3400a5 = interfaceC23001u.mo3400a(c2314t, C2299e.f9106I);
                    if ((i15 & 57344) == 16384) {
                    }
                    objM87133R = c28655q.m87133R();
                    if (z18) {
                        objM87133R = new C15369i3(interfaceC4339a3, 10);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C15369i3(interfaceC4339a3, 10);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC27242b1.m82092d(c27270o5, strM21273g5, modifierM3398t5, modifierMo3400a5, (InterfaceC4339a) objM87133R, c28655q, 0, 0);
                    z16 = z17;
                    modifier3 = modifier4;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    z16 = z14;
                    interfaceC4339a3 = interfaceC4339a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C13421p(interfaceC23001u, modifier3, z4, z16, interfaceC4339a3, i13, i14, 6);
                }
            }
            i15 |= 24576;
            interfaceC4339a2 = interfaceC4339a;
            if ((i15 & 9363) != 9362) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q.m87135U(i15 & 1, z15)) {
                c2314t = C2314t.f9131w;
                if (i25 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                if (i16 != 0) {
                    z17 = false;
                } else {
                    z17 = z14;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C16497d0(2);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a3 = interfaceC4339a2;
                }
                if (z17) {
                    abstractC27274q = AbstractC27274q.c.f109140f;
                } else {
                    abstractC27274q = AbstractC27274q.b.f109138f;
                }
                AbstractC27274q abstractC27274q7 = abstractC27274q;
                c16305i0M46425o = C38072d.f163053a.m121951d().getTinyIcons();
                if (z4) {
                    iM46234l = c16305i0M46425o.getUpArrow();
                } else {
                    iM46234l = c16305i0M46425o.getDownArrow();
                }
                C27270o c27270o6 = new C27270o(abstractC27274q7, iM46234l, null, null, null, false, false, false, 0.0f, false, 1020, null);
                String strM21273g6 = AbstractC8693b.m21273g(AbstractC16277f.f62376s1, c28655q, 0);
                float f18 = f63737b;
                Modifier modifierM3398t6 = AbstractC1099a.m3398t(modifier4, 0.0f, 0.0f, f18, f18, 3);
                Modifier modifierMo3400a6 = interfaceC23001u.mo3400a(c2314t, C2299e.f9106I);
                if ((i15 & 57344) == 16384) {
                }
                objM87133R = c28655q.m87133R();
                if (z18) {
                    objM87133R = new C15369i3(interfaceC4339a3, 10);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C15369i3(interfaceC4339a3, 10);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC27242b1.m82092d(c27270o6, strM21273g6, modifierM3398t6, modifierMo3400a6, (InterfaceC4339a) objM87133R, c28655q, 0, 0);
                z16 = z17;
                modifier3 = modifier4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                z16 = z14;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13421p(interfaceC23001u, modifier3, z4, z16, interfaceC4339a3, i13, i14, 6);
            }
        }
        i15 |= 3072;
        z14 = z13;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 24576) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                if (c28655q.m87157i(interfaceC4339a2)) {
                    i19 = 16384;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i19;
            }
            if ((i15 & 9363) != 9362) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q.m87135U(i15 & 1, z15)) {
                c2314t = C2314t.f9131w;
                if (i25 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                if (i16 != 0) {
                    z17 = false;
                } else {
                    z17 = z14;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C16497d0(2);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a3 = interfaceC4339a2;
                }
                if (z17) {
                    abstractC27274q = AbstractC27274q.c.f109140f;
                } else {
                    abstractC27274q = AbstractC27274q.b.f109138f;
                }
                AbstractC27274q abstractC27274q8 = abstractC27274q;
                c16305i0M46425o = C38072d.f163053a.m121951d().getTinyIcons();
                if (z4) {
                    iM46234l = c16305i0M46425o.getUpArrow();
                } else {
                    iM46234l = c16305i0M46425o.getDownArrow();
                }
                C27270o c27270o7 = new C27270o(abstractC27274q8, iM46234l, null, null, null, false, false, false, 0.0f, false, 1020, null);
                String strM21273g7 = AbstractC8693b.m21273g(AbstractC16277f.f62376s1, c28655q, 0);
                float f19 = f63737b;
                Modifier modifierM3398t7 = AbstractC1099a.m3398t(modifier4, 0.0f, 0.0f, f19, f19, 3);
                Modifier modifierMo3400a7 = interfaceC23001u.mo3400a(c2314t, C2299e.f9106I);
                if ((i15 & 57344) == 16384) {
                }
                objM87133R = c28655q.m87133R();
                if (z18) {
                    objM87133R = new C15369i3(interfaceC4339a3, 10);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C15369i3(interfaceC4339a3, 10);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC27242b1.m82092d(c27270o7, strM21273g7, modifierM3398t7, modifierMo3400a7, (InterfaceC4339a) objM87133R, c28655q, 0, 0);
                z16 = z17;
                modifier3 = modifier4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                z16 = z14;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13421p(interfaceC23001u, modifier3, z4, z16, interfaceC4339a3, i13, i14, 6);
            }
        }
        i15 |= 24576;
        interfaceC4339a2 = interfaceC4339a;
        if ((i15 & 9363) != 9362) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (c28655q.m87135U(i15 & 1, z15)) {
            c2314t = C2314t.f9131w;
            if (i25 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            if (i16 != 0) {
                z17 = false;
            } else {
                z17 = z14;
            }
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C16497d0(2);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
            } else {
                interfaceC4339a3 = interfaceC4339a2;
            }
            if (z17) {
                abstractC27274q = AbstractC27274q.c.f109140f;
            } else {
                abstractC27274q = AbstractC27274q.b.f109138f;
            }
            AbstractC27274q abstractC27274q9 = abstractC27274q;
            c16305i0M46425o = C38072d.f163053a.m121951d().getTinyIcons();
            if (z4) {
                iM46234l = c16305i0M46425o.getUpArrow();
            } else {
                iM46234l = c16305i0M46425o.getDownArrow();
            }
            C27270o c27270o8 = new C27270o(abstractC27274q9, iM46234l, null, null, null, false, false, false, 0.0f, false, 1020, null);
            String strM21273g8 = AbstractC8693b.m21273g(AbstractC16277f.f62376s1, c28655q, 0);
            float f110 = f63737b;
            Modifier modifierM3398t8 = AbstractC1099a.m3398t(modifier4, 0.0f, 0.0f, f110, f110, 3);
            Modifier modifierMo3400a8 = interfaceC23001u.mo3400a(c2314t, C2299e.f9106I);
            if ((i15 & 57344) == 16384) {
            }
            objM87133R = c28655q.m87133R();
            if (z18) {
                objM87133R = new C15369i3(interfaceC4339a3, 10);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C15369i3(interfaceC4339a3, 10);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27242b1.m82092d(c27270o8, strM21273g8, modifierM3398t8, modifierMo3400a8, (InterfaceC4339a) objM87133R, c28655q, 0, 0);
            z16 = z17;
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            z16 = z14;
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13421p(interfaceC23001u, modifier3, z4, z16, interfaceC4339a3, i13, i14, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m46851f() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m46852g(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m46853h(InterfaceC23001u interfaceC23001u, Modifier modifier, boolean z4, boolean z13, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m46850e(interfaceC23001u, modifier, z4, z13, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0051  */
    /* JADX WARN: Code duplicated, block: B:25:0x0055  */
    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0060  */
    /* JADX WARN: Code duplicated, block: B:31:0x0066  */
    /* JADX WARN: Code duplicated, block: B:34:0x006c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0076  */
    /* JADX WARN: Code duplicated, block: B:37:0x0079  */
    /* JADX WARN: Code duplicated, block: B:41:0x0080  */
    /* JADX WARN: Code duplicated, block: B:43:0x0086  */
    /* JADX WARN: Code duplicated, block: B:44:0x008b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0091  */
    /* JADX WARN: Code duplicated, block: B:47:0x0094  */
    /* JADX WARN: Code duplicated, block: B:51:0x009e  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c2 A[PHI: r0 r7
      0x00c2: PHI (r0v16 int) = (r0v11 int), (r0v11 int), (r0v18 int) binds: [B:67:0x00cc, B:61:0x00be, B:62:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r7v13 androidx.compose.ui.Modifier) = (r7v4 androidx.compose.ui.Modifier), (r7v2 androidx.compose.ui.Modifier), (r7v2 androidx.compose.ui.Modifier) binds: [B:67:0x00cc, B:61:0x00be, B:62:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x00c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:70:0x010f  */
    /* JADX WARN: Code duplicated, block: B:73:0x011a  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: i */
    public static final void m46854i(InterfaceC23001u interfaceC23001u, Modifier modifier, InterfaceC22973k1 interfaceC22973k1, EnumC16313m0 icon, InterfaceC39332e color, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        InterfaceC22973k1 interfaceC22973k2;
        boolean z4;
        Modifier modifier3;
        InterfaceC22973k1 interfaceC22973k1M3381c;
        C28677v1 c28677v1M87180u;
        int i16;
        C2314t c2314t;
        int i17;
        Modifier modifier4;
        boolean zM87157i;
        int i18;
        int i19;
        AbstractC22676k.m65750j(interfaceC23001u, "<this>");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(color, "color");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1415480349);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(interfaceC23001u) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i24 = i14 & 1;
        if (i24 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if ((i14 & 2) == 0) {
                    interfaceC22973k2 = interfaceC22973k1;
                    int i25 = c28655q.m87153g(interfaceC22973k2) ? 256 : 128;
                    i15 |= i25;
                } else {
                    interfaceC22973k2 = interfaceC22973k1;
                }
                i15 |= i25;
            } else {
                interfaceC22973k2 = interfaceC22973k1;
            }
            if ((i13 & 3072) == 0) {
                if (c28655q.m87149e(icon.ordinal())) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            if ((i13 & 24576) == 0) {
                if ((32768 & i13) == 0) {
                    zM87157i = c28655q.m87153g(color);
                } else {
                    zM87157i = c28655q.m87157i(color);
                }
                if (zM87157i) {
                    i18 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i18 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i18;
            }
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                i16 = i13 & 1;
                c2314t = C2314t.f9131w;
                if (i16 != 0 || c28655q.m87118C()) {
                    if (i24 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i14 & 2) != 0) {
                        float f13 = f63736a;
                        interfaceC22973k1M3381c = AbstractC1099a.m3381c(0.0f, f13, f63737b, f13, 1);
                        Modifier modifier5 = modifier2;
                        i17 = i15 & (-897);
                        modifier4 = modifier5;
                    }
                    c28655q.m87175r();
                    float f14 = 4;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(icon.toWhoopIcon(), c28655q, 6), null, interfaceC23001u.mo3400a(AbstractC1102d.m3419p(f14 * f14, AbstractC1099a.m3393o(interfaceC22973k1M3381c, c2314t)), C2299e.f9116y).mo3471e(modifier4), color.mo134584toComposableColorWaAFU9c(c28655q, (i17 >> 12) & 14), c28655q, 48, 0);
                    modifier3 = modifier4;
                } else {
                    c28655q.m87138X();
                    if ((i14 & 2) != 0) {
                        i15 &= -897;
                    }
                }
                Modifier modifier6 = modifier2;
                i17 = i15;
                modifier4 = modifier6;
                interfaceC22973k1M3381c = interfaceC22973k2;
                c28655q.m87175r();
                float f15 = 4;
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(icon.toWhoopIcon(), c28655q, 6), null, interfaceC23001u.mo3400a(AbstractC1102d.m3419p(f15 * f15, AbstractC1099a.m3393o(interfaceC22973k1M3381c, c2314t)), C2299e.f9116y).mo3471e(modifier4), color.mo134584toComposableColorWaAFU9c(c28655q, (i17 >> 12) & 14), c28655q, 48, 0);
                modifier3 = modifier4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                interfaceC22973k1M3381c = interfaceC22973k2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0086f(interfaceC23001u, modifier3, interfaceC22973k1M3381c, icon, color, i13, i14);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        if ((i13 & 384) == 0) {
            if ((i14 & 2) == 0) {
                interfaceC22973k2 = interfaceC22973k1;
                if (c28655q.m87153g(interfaceC22973k2)) {
                }
                i15 |= i25;
            } else {
                interfaceC22973k2 = interfaceC22973k1;
            }
            i15 |= i25;
        } else {
            interfaceC22973k2 = interfaceC22973k1;
        }
        if ((i13 & 3072) == 0) {
            if (c28655q.m87149e(icon.ordinal())) {
                i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i19;
        }
        if ((i13 & 24576) == 0) {
            if ((32768 & i13) == 0) {
                zM87157i = c28655q.m87153g(color);
            } else {
                zM87157i = c28655q.m87157i(color);
            }
            if (zM87157i) {
                i18 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i18 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i18;
        }
        if ((i15 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28655q.m87140Z();
            i16 = i13 & 1;
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                if (i24 != 0) {
                    modifier2 = c2314t;
                }
                if ((i14 & 2) != 0) {
                    float f16 = f63736a;
                    interfaceC22973k1M3381c = AbstractC1099a.m3381c(0.0f, f16, f63737b, f16, 1);
                    Modifier modifier7 = modifier2;
                    i17 = i15 & (-897);
                    modifier4 = modifier7;
                } else {
                    Modifier modifier8 = modifier2;
                    i17 = i15;
                    modifier4 = modifier8;
                    interfaceC22973k1M3381c = interfaceC22973k2;
                }
            } else {
                if (i24 != 0) {
                    modifier2 = c2314t;
                }
                if ((i14 & 2) != 0) {
                    float f17 = f63736a;
                    interfaceC22973k1M3381c = AbstractC1099a.m3381c(0.0f, f17, f63737b, f17, 1);
                    Modifier modifier9 = modifier2;
                    i17 = i15 & (-897);
                    modifier4 = modifier9;
                } else {
                    Modifier modifier10 = modifier2;
                    i17 = i15;
                    modifier4 = modifier10;
                    interfaceC22973k1M3381c = interfaceC22973k2;
                }
            }
            c28655q.m87175r();
            float f18 = 4;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(icon.toWhoopIcon(), c28655q, 6), null, interfaceC23001u.mo3400a(AbstractC1102d.m3419p(f18 * f18, AbstractC1099a.m3393o(interfaceC22973k1M3381c, c2314t)), C2299e.f9116y).mo3471e(modifier4), color.mo134584toComposableColorWaAFU9c(c28655q, (i17 >> 12) & 14), c28655q, 48, 0);
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            interfaceC22973k1M3381c = interfaceC22973k2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0086f(interfaceC23001u, modifier3, interfaceC22973k1M3381c, icon, color, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m46855j(InterfaceC23001u interfaceC23001u, Modifier modifier, InterfaceC22973k1 interfaceC22973k1, EnumC16313m0 enumC16313m0, InterfaceC39332e interfaceC39332e, int i13, int i14, Composer composer, int i15) {
        m46854i(interfaceC23001u, modifier, interfaceC22973k1, enumC16313m0, interfaceC39332e, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
