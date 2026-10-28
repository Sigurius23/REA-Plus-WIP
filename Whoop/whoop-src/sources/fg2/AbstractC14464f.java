package fg2;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import d30.C11558r;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import ny0.AbstractC27292z;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p133f1.C13998z1;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.C39102j;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import vf2.AbstractC35949a;
import vf2.AbstractC35950b;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: fg2.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a3\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "coachPhoneNumber", "Lkotlin/Function0;", "Ll83/a0;", "onTextWhoop", "d", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "Landroid/content/Context;", "context", "phoneNumber", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Landroid/content/Context;Ljava/lang/String;)V", "sms_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC14464f {
    /* JADX WARN: Code duplicated, block: B:102:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:51:0x0085  */
    /* JADX WARN: Code duplicated, block: B:53:0x008b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:68:0x010f  */
    /* JADX WARN: Code duplicated, block: B:71:0x011b  */
    /* JADX WARN: Code duplicated, block: B:73:0x011e  */
    /* JADX WARN: Code duplicated, block: B:77:0x0167  */
    /* JADX WARN: Code duplicated, block: B:80:0x0170  */
    /* JADX WARN: Code duplicated, block: B:81:0x0172  */
    /* JADX WARN: Code duplicated, block: B:84:0x023a  */
    /* JADX WARN: Code duplicated, block: B:86:0x023e  */
    /* JADX WARN: Code duplicated, block: B:89:0x024b  */
    /* JADX WARN: Code duplicated, block: B:90:0x024d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0256  */
    /* JADX WARN: Code duplicated, block: B:97:0x0260  */
    /* JADX WARN: Code duplicated, block: B:99:0x029e  */
    /* JADX INFO: renamed from: d */
    public static final void m41225d(Modifier modifier, String str, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        String str2;
        int i16;
        InterfaceC4339a interfaceC4339a2;
        int i17;
        int i18;
        boolean z4;
        Modifier modifier3;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        String str3;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a4;
        Context context;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        float f13;
        String str4;
        InterfaceC4339a interfaceC4339a5;
        float f14;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objM87133R;
        String str5;
        InterfaceC4339a interfaceC4339a6;
        Object objM87133R2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1952951992);
        int i19 = i14 & 1;
        if (i19 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        int i24 = i14 & 2;
        if (i24 == 0) {
            if ((i13 & 48) == 0) {
                str2 = str;
                i15 |= c28655q.m87153g(str2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q.m87157i(interfaceC4339a2)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i15;
                if ((i18 & 147) != 146) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i18 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i19 != 0) {
                        modifier4 = c2314t;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i24 != 0) {
                        str3 = "";
                    } else {
                        str3 = str2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C13998z1(13);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                    float f15 = 8;
                    float f16 = 2 * f15;
                    Modifier modifierM3394p = AbstractC1099a.m3394p(f16, AbstractC1102d.m3407d(1.0f, modifier4));
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 48);
                    Modifier modifier5 = modifier4;
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
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f13 = Float.MAX_VALUE;
                    } else {
                        f13 = 1.0f;
                    }
                    AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(f13, true));
                    str4 = str3;
                    interfaceC4339a5 = interfaceC4339a4;
                    AbstractC29125c.m88522c(AbstractC29125c.m88500I(AbstractC35949a.f153052a, c28655q, 0), null, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f16, 0.0f, 2), null, C39102j.f168202d, 0.0f, null, c28655q, 25008, 104);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f14 = Float.MAX_VALUE;
                    } else {
                        f14 = 1.0f;
                    }
                    AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(f14, true));
                    String strM21273g = AbstractC8693b.m21273g(AbstractC35950b.f153088h, c28655q, 0);
                    C38072d c38072d = C38072d.f163053a;
                    int i25 = C38072d.f163054b;
                    C2886a c2886aM8418P = c38072d.m121952e(c28655q, i25).getT3();
                    long jM125430y = c38072d.m121949b(c28655q, i25).getBrandWhite();
                    int i26 = C2886a.f11498d << 18;
                    AbstractC30795n.m94707h(strM21273g, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P, null, c28655q, 0, i26, 196602);
                    AbstractC30795n.m94707h(AbstractC8693b.m21273g(AbstractC35950b.f153086f, c28655q, 0), AbstractC1099a.m3398t(c2314t, 0.0f, f16, 0.0f, 0.0f, 13), c38072d.m121949b(c28655q, i25).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i25).getB1(), null, c28655q, 48, i26, 196600);
                    Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 5 * f15, 0.0f, 0.0f, 13);
                    TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC35950b.f153081a);
                    if ((i18 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean zM87157i = c28655q.m87157i(context) | z13;
                    if ((i18 & 112) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = zM87157i | z14;
                    objM87133R = c28655q.m87133R();
                    if (!z15 || objM87133R == c28676v0) {
                        str5 = str4;
                        interfaceC4339a6 = interfaceC4339a5;
                        objM87133R = new C11558r(interfaceC4339a6, context, str5, 14);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        str5 = str4;
                        interfaceC4339a6 = interfaceC4339a5;
                    }
                    InterfaceC4339a interfaceC4339a7 = interfaceC4339a6;
                    AbstractC27292z.m82343j(modifierM3398t, false, false, null, null, null, c8688bM21277k, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R, c28655q, (TextResource.C8688b.f25889c << 18) | 6, 0, 8126);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    modifier3 = modifier5;
                    str2 = str5;
                    interfaceC4339a3 = interfaceC4339a7;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    interfaceC4339a3 = interfaceC4339a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C14463e(i13, i14, 0, modifier3, interfaceC4339a3, str2);
                }
            }
            i15 |= 384;
            interfaceC4339a2 = interfaceC4339a;
            i18 = i15;
            if ((i18 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i18 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i19 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                if (i24 != 0) {
                    str3 = "";
                } else {
                    str3 = str2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C13998z1(13);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                float f17 = 8;
                float f18 = 2 * f17;
                Modifier modifierM3394p2 = AbstractC1099a.m3394p(f18, AbstractC1102d.m3407d(1.0f, modifier4));
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 48);
                Modifier modifier6 = modifier4;
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
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f13 = Float.MAX_VALUE;
                } else {
                    f13 = 1.0f;
                }
                AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(f13, true));
                str4 = str3;
                interfaceC4339a5 = interfaceC4339a4;
                AbstractC29125c.m88522c(AbstractC29125c.m88500I(AbstractC35949a.f153052a, c28655q, 0), null, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f18, 0.0f, 2), null, C39102j.f168202d, 0.0f, null, c28655q, 25008, 104);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f14 = Float.MAX_VALUE;
                } else {
                    f14 = 1.0f;
                }
                AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(f14, true));
                String strM21273g2 = AbstractC8693b.m21273g(AbstractC35950b.f153088h, c28655q, 0);
                C38072d c38072d2 = C38072d.f163053a;
                int i27 = C38072d.f163054b;
                C2886a c2886aM8418P2 = c38072d2.m121952e(c28655q, i27).getT3();
                long jM125430y2 = c38072d2.m121949b(c28655q, i27).getBrandWhite();
                int i28 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM21273g2, null, jM125430y2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P2, null, c28655q, 0, i28, 196602);
                AbstractC30795n.m94707h(AbstractC8693b.m21273g(AbstractC35950b.f153086f, c28655q, 0), AbstractC1099a.m3398t(c2314t, 0.0f, f18, 0.0f, 0.0f, 13), c38072d2.m121949b(c28655q, i27).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i27).getB1(), null, c28655q, 48, i28, 196600);
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, 0.0f, 5 * f17, 0.0f, 0.0f, 13);
                TextResource.C8688b c8688bM21277k2 = AbstractC8693b.m21277k(AbstractC35950b.f153081a);
                if ((i18 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean zM87157i2 = c28655q.m87157i(context) | z13;
                if ((i18 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = zM87157i2 | z14;
                objM87133R = c28655q.m87133R();
                if (z15) {
                    str5 = str4;
                    interfaceC4339a6 = interfaceC4339a5;
                    objM87133R = new C11558r(interfaceC4339a6, context, str5, 14);
                    c28655q.m87172p0(objM87133R);
                } else {
                    str5 = str4;
                    interfaceC4339a6 = interfaceC4339a5;
                    objM87133R = new C11558r(interfaceC4339a6, context, str5, 14);
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC4339a interfaceC4339a8 = interfaceC4339a6;
                AbstractC27292z.m82343j(modifierM3398t2, false, false, null, null, null, c8688bM21277k2, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R, c28655q, (TextResource.C8688b.f25889c << 18) | 6, 0, 8126);
                c28655q = c28655q;
                c28655q.m87173q(true);
                modifier3 = modifier6;
                str2 = str5;
                interfaceC4339a3 = interfaceC4339a8;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C14463e(i13, i14, 0, modifier3, interfaceC4339a3, str2);
            }
        }
        i15 |= 48;
        str2 = str;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                if (c28655q.m87157i(interfaceC4339a2)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i15;
            if ((i18 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i18 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i19 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                if (i24 != 0) {
                    str3 = "";
                } else {
                    str3 = str2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C13998z1(13);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                float f19 = 8;
                float f110 = 2 * f19;
                Modifier modifierM3394p3 = AbstractC1099a.m3394p(f110, AbstractC1102d.m3407d(1.0f, modifier4));
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 48);
                Modifier modifier7 = modifier4;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3394p3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f13 = Float.MAX_VALUE;
                } else {
                    f13 = 1.0f;
                }
                AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(f13, true));
                str4 = str3;
                interfaceC4339a5 = interfaceC4339a4;
                AbstractC29125c.m88522c(AbstractC29125c.m88500I(AbstractC35949a.f153052a, c28655q, 0), null, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f110, 0.0f, 2), null, C39102j.f168202d, 0.0f, null, c28655q, 25008, 104);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f14 = Float.MAX_VALUE;
                } else {
                    f14 = 1.0f;
                }
                AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(f14, true));
                String strM21273g3 = AbstractC8693b.m21273g(AbstractC35950b.f153088h, c28655q, 0);
                C38072d c38072d3 = C38072d.f163053a;
                int i29 = C38072d.f163054b;
                C2886a c2886aM8418P3 = c38072d3.m121952e(c28655q, i29).getT3();
                long jM125430y3 = c38072d3.m121949b(c28655q, i29).getBrandWhite();
                int i210 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM21273g3, null, jM125430y3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P3, null, c28655q, 0, i210, 196602);
                AbstractC30795n.m94707h(AbstractC8693b.m21273g(AbstractC35950b.f153086f, c28655q, 0), AbstractC1099a.m3398t(c2314t, 0.0f, f110, 0.0f, 0.0f, 13), c38072d3.m121949b(c28655q, i29).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q, i29).getB1(), null, c28655q, 48, i210, 196600);
                Modifier modifierM3398t3 = AbstractC1099a.m3398t(c2314t, 0.0f, 5 * f19, 0.0f, 0.0f, 13);
                TextResource.C8688b c8688bM21277k3 = AbstractC8693b.m21277k(AbstractC35950b.f153081a);
                if ((i18 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean zM87157i3 = c28655q.m87157i(context) | z13;
                if ((i18 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = zM87157i3 | z14;
                objM87133R = c28655q.m87133R();
                if (z15) {
                    str5 = str4;
                    interfaceC4339a6 = interfaceC4339a5;
                    objM87133R = new C11558r(interfaceC4339a6, context, str5, 14);
                    c28655q.m87172p0(objM87133R);
                } else {
                    str5 = str4;
                    interfaceC4339a6 = interfaceC4339a5;
                    objM87133R = new C11558r(interfaceC4339a6, context, str5, 14);
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC4339a interfaceC4339a9 = interfaceC4339a6;
                AbstractC27292z.m82343j(modifierM3398t3, false, false, null, null, null, c8688bM21277k3, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R, c28655q, (TextResource.C8688b.f25889c << 18) | 6, 0, 8126);
                c28655q = c28655q;
                c28655q.m87173q(true);
                modifier3 = modifier7;
                str2 = str5;
                interfaceC4339a3 = interfaceC4339a9;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C14463e(i13, i14, 0, modifier3, interfaceC4339a3, str2);
            }
        }
        i15 |= 384;
        interfaceC4339a2 = interfaceC4339a;
        i18 = i15;
        if ((i18 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i18 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i19 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            if (i24 != 0) {
                str3 = "";
            } else {
                str3 = str2;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C13998z1(13);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            float f111 = 8;
            float f112 = 2 * f111;
            Modifier modifierM3394p4 = AbstractC1099a.m3394p(f112, AbstractC1102d.m3407d(1.0f, modifier4));
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 48);
            Modifier modifier8 = modifier4;
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3394p4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f13 = Float.MAX_VALUE;
            } else {
                f13 = 1.0f;
            }
            AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(f13, true));
            str4 = str3;
            interfaceC4339a5 = interfaceC4339a4;
            AbstractC29125c.m88522c(AbstractC29125c.m88500I(AbstractC35949a.f153052a, c28655q, 0), null, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f112, 0.0f, 2), null, C39102j.f168202d, 0.0f, null, c28655q, 25008, 104);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f14 = Float.MAX_VALUE;
            } else {
                f14 = 1.0f;
            }
            AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(f14, true));
            String strM21273g4 = AbstractC8693b.m21273g(AbstractC35950b.f153088h, c28655q, 0);
            C38072d c38072d4 = C38072d.f163053a;
            int i211 = C38072d.f163054b;
            C2886a c2886aM8418P4 = c38072d4.m121952e(c28655q, i211).getT3();
            long jM125430y4 = c38072d4.m121949b(c28655q, i211).getBrandWhite();
            int i212 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21273g4, null, jM125430y4, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P4, null, c28655q, 0, i212, 196602);
            AbstractC30795n.m94707h(AbstractC8693b.m21273g(AbstractC35950b.f153086f, c28655q, 0), AbstractC1099a.m3398t(c2314t, 0.0f, f112, 0.0f, 0.0f, 13), c38072d4.m121949b(c28655q, i211).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q, i211).getB1(), null, c28655q, 48, i212, 196600);
            Modifier modifierM3398t4 = AbstractC1099a.m3398t(c2314t, 0.0f, 5 * f111, 0.0f, 0.0f, 13);
            TextResource.C8688b c8688bM21277k4 = AbstractC8693b.m21277k(AbstractC35950b.f153081a);
            if ((i18 & 896) == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean zM87157i4 = c28655q.m87157i(context) | z13;
            if ((i18 & 112) == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = zM87157i4 | z14;
            objM87133R = c28655q.m87133R();
            if (z15) {
                str5 = str4;
                interfaceC4339a6 = interfaceC4339a5;
                objM87133R = new C11558r(interfaceC4339a6, context, str5, 14);
                c28655q.m87172p0(objM87133R);
            } else {
                str5 = str4;
                interfaceC4339a6 = interfaceC4339a5;
                objM87133R = new C11558r(interfaceC4339a6, context, str5, 14);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a10 = interfaceC4339a6;
            AbstractC27292z.m82343j(modifierM3398t4, false, false, null, null, null, c8688bM21277k4, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R, c28655q, (TextResource.C8688b.f25889c << 18) | 6, 0, 8126);
            c28655q = c28655q;
            c28655q.m87173q(true);
            modifier3 = modifier8;
            str2 = str5;
            interfaceC4339a3 = interfaceC4339a10;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C14463e(i13, i14, 0, modifier3, interfaceC4339a3, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m41226e() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m41227f(InterfaceC4339a interfaceC4339a, Context context, String str) {
        interfaceC4339a.invoke();
        m41229h(context, str);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m41228g(Modifier modifier, String str, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m41225d(modifier, str, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    private static final void m41229h(Context context, String str) {
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + str));
        intent.putExtra("sms_body", context.getString(AbstractC35950b.f153085e));
        context.startActivity(intent);
    }
}
