package p734sl0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import hy0.AbstractC17726b1;
import ih0.AbstractC18489d0;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import o72.C27640a;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p208i2.C17919x;
import p291l0.C22994r1;
import p315m0.AbstractC24868a;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import wk0.AbstractC37335a;
import x81.C38072d;

/* JADX INFO: renamed from: sl0.i1 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aC\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lcom/whoop/design/util/TextResource;", "chatMessage", "Lkd1/o;", "icon", "Lkotlin/Function0;", "Ll83/a0;", "onClick", "onDeleteClicked", "f", "(Lcom/whoop/design/util/TextResource;Lkd1/o;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32621i1 {
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x0094  */
    /* JADX WARN: Code duplicated, block: B:56:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:74:0x0109  */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public static final void m101861f(TextResource chatMessage, AbstractC22403o abstractC22403o, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC4339a interfaceC4339a3;
        int i16;
        InterfaceC4339a interfaceC4339a4;
        int i17;
        boolean z4;
        AbstractC22403o abstractC22403o2;
        InterfaceC4339a interfaceC4339a5;
        InterfaceC4339a interfaceC4339a6;
        C28677v1 c28677v1M87180u;
        AbstractC22403o abstractC22403o3;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a7;
        InterfaceC4339a interfaceC4339a8;
        Object objM87133R;
        Object objM87133R2;
        AbstractC22676k.m65750j(chatMessage, "chatMessage");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1065548093);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(chatMessage) : c28655q.m87157i(chatMessage) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(abstractC22403o) : c28655q.m87157i(abstractC22403o) ? 32 : 16;
        }
        int i19 = i14 & 4;
        if (i19 == 0) {
            if ((i13 & 384) == 0) {
                interfaceC4339a3 = interfaceC4339a;
                i15 |= c28655q.m87157i(interfaceC4339a3) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    interfaceC4339a4 = interfaceC4339a2;
                    if (c28655q.m87157i(interfaceC4339a4)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    if (i18 != 0) {
                        abstractC22403o3 = null;
                    } else {
                        abstractC22403o3 = abstractC22403o;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i19 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C32581a1(1);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a7 = interfaceC4339a3;
                    }
                    if (i16 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C32581a1(2);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a8 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a8 = interfaceC4339a4;
                    }
                    float f13 = 4;
                    C2314t c2314t = C2314t.f9131w;
                    AbstractC17726b1.m50792j(AbstractC1102d.m3411h(12 * f13, c2314t), AbstractC11895b.m31987f(3, f13, c2314t, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandPrimary()), null, interfaceC4339a8, AbstractC37817c.m121344e(-154170204, c28655q, new C32625j0(interfaceC4339a7, abstractC22403o3, chatMessage, 1)), c28655q, (i15 & 7168) | 24582, 4);
                    abstractC22403o2 = abstractC22403o3;
                    interfaceC4339a5 = interfaceC4339a7;
                    interfaceC4339a6 = interfaceC4339a8;
                } else {
                    c28655q.m87138X();
                    abstractC22403o2 = abstractC22403o;
                    interfaceC4339a5 = interfaceC4339a3;
                    interfaceC4339a6 = interfaceC4339a4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C27640a(chatMessage, abstractC22403o2, interfaceC4339a5, interfaceC4339a6, i13, i14, 27);
                }
            }
            i15 |= 3072;
            interfaceC4339a4 = interfaceC4339a2;
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i18 != 0) {
                    abstractC22403o3 = null;
                } else {
                    abstractC22403o3 = abstractC22403o;
                }
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C32581a1(1);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a7 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a7 = interfaceC4339a3;
                }
                if (i16 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C32581a1(2);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a8 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a8 = interfaceC4339a4;
                }
                float f14 = 4;
                C2314t c2314t2 = C2314t.f9131w;
                AbstractC17726b1.m50792j(AbstractC1102d.m3411h(12 * f14, c2314t2), AbstractC11895b.m31987f(3, f14, c2314t2, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandPrimary()), null, interfaceC4339a8, AbstractC37817c.m121344e(-154170204, c28655q, new C32625j0(interfaceC4339a7, abstractC22403o3, chatMessage, 1)), c28655q, (i15 & 7168) | 24582, 4);
                abstractC22403o2 = abstractC22403o3;
                interfaceC4339a5 = interfaceC4339a7;
                interfaceC4339a6 = interfaceC4339a8;
            } else {
                c28655q.m87138X();
                abstractC22403o2 = abstractC22403o;
                interfaceC4339a5 = interfaceC4339a3;
                interfaceC4339a6 = interfaceC4339a4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C27640a(chatMessage, abstractC22403o2, interfaceC4339a5, interfaceC4339a6, i13, i14, 27);
            }
        }
        i15 |= 384;
        interfaceC4339a3 = interfaceC4339a;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                interfaceC4339a4 = interfaceC4339a2;
                if (c28655q.m87157i(interfaceC4339a4)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i18 != 0) {
                    abstractC22403o3 = null;
                } else {
                    abstractC22403o3 = abstractC22403o;
                }
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C32581a1(1);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a7 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a7 = interfaceC4339a3;
                }
                if (i16 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C32581a1(2);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a8 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a8 = interfaceC4339a4;
                }
                float f15 = 4;
                C2314t c2314t3 = C2314t.f9131w;
                AbstractC17726b1.m50792j(AbstractC1102d.m3411h(12 * f15, c2314t3), AbstractC11895b.m31987f(3, f15, c2314t3, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandPrimary()), null, interfaceC4339a8, AbstractC37817c.m121344e(-154170204, c28655q, new C32625j0(interfaceC4339a7, abstractC22403o3, chatMessage, 1)), c28655q, (i15 & 7168) | 24582, 4);
                abstractC22403o2 = abstractC22403o3;
                interfaceC4339a5 = interfaceC4339a7;
                interfaceC4339a6 = interfaceC4339a8;
            } else {
                c28655q.m87138X();
                abstractC22403o2 = abstractC22403o;
                interfaceC4339a5 = interfaceC4339a3;
                interfaceC4339a6 = interfaceC4339a4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C27640a(chatMessage, abstractC22403o2, interfaceC4339a5, interfaceC4339a6, i13, i14, 27);
            }
        }
        i15 |= 3072;
        interfaceC4339a4 = interfaceC4339a2;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i18 != 0) {
                abstractC22403o3 = null;
            } else {
                abstractC22403o3 = abstractC22403o;
            }
            c28676v0 = C28635l.f115821a;
            if (i19 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C32581a1(1);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC4339a7 = (InterfaceC4339a) objM87133R2;
            } else {
                interfaceC4339a7 = interfaceC4339a3;
            }
            if (i16 != 0) {
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C32581a1(2);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC4339a8 = (InterfaceC4339a) objM87133R;
            } else {
                interfaceC4339a8 = interfaceC4339a4;
            }
            float f16 = 4;
            C2314t c2314t4 = C2314t.f9131w;
            AbstractC17726b1.m50792j(AbstractC1102d.m3411h(12 * f16, c2314t4), AbstractC11895b.m31987f(3, f16, c2314t4, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandPrimary()), null, interfaceC4339a8, AbstractC37817c.m121344e(-154170204, c28655q, new C32625j0(interfaceC4339a7, abstractC22403o3, chatMessage, 1)), c28655q, (i15 & 7168) | 24582, 4);
            abstractC22403o2 = abstractC22403o3;
            interfaceC4339a5 = interfaceC4339a7;
            interfaceC4339a6 = interfaceC4339a8;
        } else {
            c28655q.m87138X();
            abstractC22403o2 = abstractC22403o;
            interfaceC4339a5 = interfaceC4339a3;
            interfaceC4339a6 = interfaceC4339a4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27640a(chatMessage, abstractC22403o2, interfaceC4339a5, interfaceC4339a6, i13, i14, 27);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m101862g() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m101863h() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m101864i(InterfaceC4339a interfaceC4339a, AbstractC22403o abstractC22403o, TextResource textResource, Composer composer, int i13) {
        C23454a0 c23454a0;
        C28655q c28655q = (C28655q) composer;
        boolean zM87135U = c28655q.m87135U(i13 & 1, (i13 & 3) != 2);
        C23454a0 c23454a1 = C23454a0.f92919a;
        if (!zM87135U) {
            c28655q.m87138X();
            return c23454a1;
        }
        boolean zM87153g = c28655q.m87153g(interfaceC4339a);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            objM87133R = new C32579a(interfaceC4339a, 7);
            c28655q.m87172p0(objM87133R);
        }
        C2314t c2314t = C2314t.f9131w;
        Modifier modifierM3362g = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15);
        C38072d c38072d = C38072d.f163053a;
        int i14 = C38072d.f163054b;
        float f13 = 4;
        float f14 = 8;
        Modifier modifierM3394p = AbstractC1099a.m3394p(((float) 1.5d) * f14, AbstractC1102d.m3407d(1.0f, AbstractC31061c.m95629e(modifierM3362g, 3, f13, c38072d.m121949b(c28655q, i14).getWhite10())));
        C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q(1, f14, C2299e.f9108K, c28655q, 54);
        int iHashCode = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j = C0217k.f724b;
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M53376q);
        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
        C0209i c0209i = C0217k.f732j;
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
        }
        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
        if (abstractC22403o == null) {
            c28655q.m87150e0(457462945);
            c28655q.m87173q(false);
            c23454a0 = null;
        } else {
            c28655q.m87150e0(457462946);
            AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(abstractC22403o, null, null, c28655q, AbstractC22403o.f87638a, 3);
            c28655q = c28655q;
            AbstractC15005f3.m43107a(abstractC26165aM64500i, null, null, c38072d.m121949b(c28655q, i14).getWhite30(), c28655q, 48, 4);
            c28655q.m87173q(false);
            c23454a0 = c23454a1;
        }
        if (c23454a0 == null) {
            c28655q.m87150e0(457682457);
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(AbstractC37335a.f159602d, c28655q, 6), null, null, C17919x.f69637n, c28655q, 3120, 4);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(-1232169045);
            c28655q.m87173q(false);
        }
        if (((double) r11) <= 0.0d) {
            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
        }
        C28655q c28655q2 = c28655q;
        AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource, c28655q, TextResource.$stable), new LayoutWeightElement(1.0f, true), c38072d.m121949b(c28655q, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, c38072d.m121952e(c28655q, i14).getB1(), null, c28655q2, 0, (C2886a.f11498d << 18) | 3120, 186360);
        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward(), c28655q2, 6), null, AbstractC1102d.m3419p(f13 * f13, c2314t), C17919x.f69637n, c28655q2, 3504, 0);
        c28655q2.m87173q(true);
        return c23454a1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m101865j(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m101866k(TextResource textResource, AbstractC22403o abstractC22403o, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, int i14, Composer composer, int i15) {
        m101861f(textResource, abstractC22403o, interfaceC4339a, interfaceC4339a2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
