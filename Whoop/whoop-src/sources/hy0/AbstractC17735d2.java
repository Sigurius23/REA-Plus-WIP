package hy0;

import a01.C0086f;
import android.content.Context;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import coil.compose.AsyncImagePainter;
import l83.C23454a0;
import l83.InterfaceC23457c;
import mh.C25540h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p026b2.C2314t;
import p095dp.AbstractC12240d;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p635y2.C39102j;
import p635y2.InterfaceC39105k;
import p715kotlin.Metadata;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: hy0.d2 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "imageUrl", "contentDescription", "", "placeholderResId", "Ly2/k;", "contentScale", "Ll83/a0;", "b", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ly2/k;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17735d2 {
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0096 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0098  */
    /* JADX WARN: Code duplicated, block: B:57:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:71:0x010b  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    @InterfaceC23457c
    /* JADX INFO: renamed from: b */
    public static final void m50825b(Modifier modifier, String str, String str2, Integer num, InterfaceC39105k interfaceC39105k, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Integer num2;
        int i16;
        int i17;
        boolean z4;
        Integer num3;
        InterfaceC39105k interfaceC39105k2;
        C28677v1 c28677v1M87180u;
        Modifier modifier3;
        Integer num4;
        InterfaceC39105k interfaceC39105k3;
        C25540h c25540h;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1416696655);
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
            i15 |= c28655q.m87153g(str) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87153g(str2) ? 256 : 128;
        }
        int i19 = i14 & 8;
        if (i19 == 0) {
            if ((i13 & 3072) == 0) {
                num2 = num;
                i15 |= c28655q.m87153g(num2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    if (c28655q.m87153g(interfaceC39105k)) {
                        i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i17;
                }
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    if (i18 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i19 != 0) {
                        num4 = null;
                    } else {
                        num4 = num2;
                    }
                    if (i16 != 0) {
                        interfaceC39105k3 = C39102j.f168200b;
                    } else {
                        interfaceC39105k3 = interfaceC39105k;
                    }
                    int i24 = i15 >> 3;
                    c28655q.m87152f0(604400716);
                    c25540h = new C25540h((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b));
                    c25540h.f100079c = str;
                    if (num4 != null) {
                        int iIntValue = num4.intValue();
                        c25540h.f100094r = Integer.valueOf(iIntValue);
                        c25540h.f100096t = Integer.valueOf(iIntValue);
                        c25540h.f100095s = Integer.valueOf(iIntValue);
                    }
                    AsyncImagePainter asyncImagePainterM34054T = AbstractC12240d.m34054T(c25540h.m75117a(), c28655q, 8);
                    c28655q.m87173q(false);
                    AbstractC29125c.m88522c(asyncImagePainterM34054T, str2, modifier3, null, interfaceC39105k3, 0.0f, null, c28655q, (i24 & 112) | ((i15 << 6) & 896) | (i15 & 57344), 104);
                    num3 = num4;
                    modifier2 = modifier3;
                    interfaceC39105k2 = interfaceC39105k3;
                } else {
                    c28655q.m87138X();
                    num3 = num2;
                    interfaceC39105k2 = interfaceC39105k;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0086f(modifier2, str, (Object) str2, (Object) num3, (Object) interfaceC39105k2, i13, i14, 27);
                }
            }
            i15 |= 24576;
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i18 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                if (i19 != 0) {
                    num4 = null;
                } else {
                    num4 = num2;
                }
                if (i16 != 0) {
                    interfaceC39105k3 = C39102j.f168200b;
                } else {
                    interfaceC39105k3 = interfaceC39105k;
                }
                int i25 = i15 >> 3;
                c28655q.m87152f0(604400716);
                c25540h = new C25540h((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b));
                c25540h.f100079c = str;
                if (num4 != null) {
                    int iIntValue2 = num4.intValue();
                    c25540h.f100094r = Integer.valueOf(iIntValue2);
                    c25540h.f100096t = Integer.valueOf(iIntValue2);
                    c25540h.f100095s = Integer.valueOf(iIntValue2);
                }
                AsyncImagePainter asyncImagePainterM34054T2 = AbstractC12240d.m34054T(c25540h.m75117a(), c28655q, 8);
                c28655q.m87173q(false);
                AbstractC29125c.m88522c(asyncImagePainterM34054T2, str2, modifier3, null, interfaceC39105k3, 0.0f, null, c28655q, (i25 & 112) | ((i15 << 6) & 896) | (i15 & 57344), 104);
                num3 = num4;
                modifier2 = modifier3;
                interfaceC39105k2 = interfaceC39105k3;
            } else {
                c28655q.m87138X();
                num3 = num2;
                interfaceC39105k2 = interfaceC39105k;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0086f(modifier2, str, (Object) str2, (Object) num3, (Object) interfaceC39105k2, i13, i14, 27);
            }
        }
        i15 |= 3072;
        num2 = num;
        i16 = i14 & 16;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                if (c28655q.m87153g(interfaceC39105k)) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i18 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                if (i19 != 0) {
                    num4 = null;
                } else {
                    num4 = num2;
                }
                if (i16 != 0) {
                    interfaceC39105k3 = C39102j.f168200b;
                } else {
                    interfaceC39105k3 = interfaceC39105k;
                }
                int i26 = i15 >> 3;
                c28655q.m87152f0(604400716);
                c25540h = new C25540h((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b));
                c25540h.f100079c = str;
                if (num4 != null) {
                    int iIntValue3 = num4.intValue();
                    c25540h.f100094r = Integer.valueOf(iIntValue3);
                    c25540h.f100096t = Integer.valueOf(iIntValue3);
                    c25540h.f100095s = Integer.valueOf(iIntValue3);
                }
                AsyncImagePainter asyncImagePainterM34054T3 = AbstractC12240d.m34054T(c25540h.m75117a(), c28655q, 8);
                c28655q.m87173q(false);
                AbstractC29125c.m88522c(asyncImagePainterM34054T3, str2, modifier3, null, interfaceC39105k3, 0.0f, null, c28655q, (i26 & 112) | ((i15 << 6) & 896) | (i15 & 57344), 104);
                num3 = num4;
                modifier2 = modifier3;
                interfaceC39105k2 = interfaceC39105k3;
            } else {
                c28655q.m87138X();
                num3 = num2;
                interfaceC39105k2 = interfaceC39105k;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0086f(modifier2, str, (Object) str2, (Object) num3, (Object) interfaceC39105k2, i13, i14, 27);
            }
        }
        i15 |= 24576;
        if ((i15 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i18 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            if (i19 != 0) {
                num4 = null;
            } else {
                num4 = num2;
            }
            if (i16 != 0) {
                interfaceC39105k3 = C39102j.f168200b;
            } else {
                interfaceC39105k3 = interfaceC39105k;
            }
            int i27 = i15 >> 3;
            c28655q.m87152f0(604400716);
            c25540h = new C25540h((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b));
            c25540h.f100079c = str;
            if (num4 != null) {
                int iIntValue4 = num4.intValue();
                c25540h.f100094r = Integer.valueOf(iIntValue4);
                c25540h.f100096t = Integer.valueOf(iIntValue4);
                c25540h.f100095s = Integer.valueOf(iIntValue4);
            }
            AsyncImagePainter asyncImagePainterM34054T4 = AbstractC12240d.m34054T(c25540h.m75117a(), c28655q, 8);
            c28655q.m87173q(false);
            AbstractC29125c.m88522c(asyncImagePainterM34054T4, str2, modifier3, null, interfaceC39105k3, 0.0f, null, c28655q, (i27 & 112) | ((i15 << 6) & 896) | (i15 & 57344), 104);
            num3 = num4;
            modifier2 = modifier3;
            interfaceC39105k2 = interfaceC39105k3;
        } else {
            c28655q.m87138X();
            num3 = num2;
            interfaceC39105k2 = interfaceC39105k;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0086f(modifier2, str, (Object) str2, (Object) num3, (Object) interfaceC39105k2, i13, i14, 27);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m50826c(Modifier modifier, String str, String str2, Integer num, InterfaceC39105k interfaceC39105k, int i13, int i14, Composer composer, int i15) {
        m50825b(modifier, str, str2, num, interfaceC39105k, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
