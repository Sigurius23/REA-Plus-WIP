package ln1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.runtime.Composer;
import bm0.C3407j;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import java.util.List;
import l83.C23454a0;
import live.hms.video.media.capturers.camera.utils.C24174a;
import lj1.C24474b;
import ny0.AbstractC27292z;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0238p0;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p208i2.C17920x0;
import p208i2.InterfaceC17886g0;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: ln1.r */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"", "buttonText", "Lkotlin/Function0;", "Ll83/a0;", "onViewEvent", "f", "(Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "home-customization_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC24540r {
    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x006a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0097  */
    /* JADX WARN: Code duplicated, block: B:37:0x009b  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:51:0x0138  */
    /* JADX WARN: Code duplicated, block: B:52:0x013a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0143  */
    /* JADX WARN: Code duplicated, block: B:58:0x0173  */
    /* JADX WARN: Code duplicated, block: B:61:0x017d  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public static final void m71553f(String buttonText, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC4339a interfaceC4339a2;
        boolean z4;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Object objM87133R;
        Object objM87133R2;
        boolean z13;
        Object objM87133R3;
        Object objM87133R4;
        AbstractC22676k.m65750j(buttonText, "buttonText");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1598333440);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87153g(buttonText) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                i15 |= c28655q.m87157i(interfaceC4339a2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C24474b(13);
                        c28655q.m87172p0(objM87133R4);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R4;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
                Modifier modifierM95629e = AbstractC31061c.m95629e(AbstractC1102d.m3411h(100, AbstractC1102d.m3409f(1.0f, c2314t)), 16, 4, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getTransparent());
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C24174a(13);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierM3486a = AbstractC1127a.m3486a(modifierM95629e, (Function1) objM87133R);
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C24174a(14);
                    c28655q.m87172p0(objM87133R2);
                }
                Modifier modifierM3480c = AbstractC1125a.m3480c(modifierM3486a, (Function1) objM87133R2);
                float f13 = 8;
                AbstractC22989q.m66760a(AbstractC1099a.m3398t(modifierM3480c, 0.0f, 0.0f, 0.0f, 3 * f13, 7), c28655q, 0);
                Modifier modifierM3394p = AbstractC1099a.m3394p(1 * f13, AbstractC1102d.m3409f(1.0f, c2314t));
                TextResource textResourceM21278l = AbstractC8693b.m21278l(buttonText);
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R3 = c28655q.m87133R();
                if (z13 || objM87133R3 == c28676v0) {
                    objM87133R3 = new C24537o(interfaceC4339a4, 1);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC27292z.m82343j(modifierM3394p, false, false, null, null, null, textResourceM21278l, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R3, c28655q, (TextResource.$stable << 18) | 6, 0, 8126);
                c28655q.m87173q(true);
                interfaceC4339a3 = interfaceC4339a4;
            } else {
                c28655q.m87138X();
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3407j(i13, i14, 1, interfaceC4339a3, buttonText);
            }
        }
        i15 |= 48;
        interfaceC4339a2 = interfaceC4339a;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C24474b(13);
                    c28655q.m87172p0(objM87133R4);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R4;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t2);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
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
            Modifier modifierM95629e2 = AbstractC31061c.m95629e(AbstractC1102d.m3411h(100, AbstractC1102d.m3409f(1.0f, c2314t2)), 16, 4, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getTransparent());
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = new C24174a(13);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3486a2 = AbstractC1127a.m3486a(modifierM95629e2, (Function1) objM87133R);
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C24174a(14);
                c28655q.m87172p0(objM87133R2);
            }
            Modifier modifierM3480c2 = AbstractC1125a.m3480c(modifierM3486a2, (Function1) objM87133R2);
            float f14 = 8;
            AbstractC22989q.m66760a(AbstractC1099a.m3398t(modifierM3480c2, 0.0f, 0.0f, 0.0f, 3 * f14, 7), c28655q, 0);
            Modifier modifierM3394p2 = AbstractC1099a.m3394p(1 * f14, AbstractC1102d.m3409f(1.0f, c2314t2));
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(buttonText);
            if ((i15 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R3 = c28655q.m87133R();
            if (z13) {
                objM87133R3 = new C24537o(interfaceC4339a4, 1);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C24537o(interfaceC4339a4, 1);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC27292z.m82343j(modifierM3394p2, false, false, null, null, null, textResourceM21278l2, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R3, c28655q, (TextResource.$stable << 18) | 6, 0, 8126);
            c28655q.m87173q(true);
            interfaceC4339a3 = interfaceC4339a4;
        } else {
            c28655q.m87138X();
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3407j(i13, i14, 1, interfaceC4339a3, buttonText);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m71554g() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m71555h(InterfaceC17886g0 graphicsLayer) {
        AbstractC22676k.m65750j(graphicsLayer, "$this$graphicsLayer");
        ((C17920x0) graphicsLayer).m51551a(0.99f);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m71556i(InterfaceC22129c drawWithContent) {
        AbstractC22676k.m65750j(drawWithContent, "$this$drawWithContent");
        List listM118959K = AbstractC37056f.m118959K(new C17919x(C17919x.f69636m), new C17919x(C17919x.f69625b));
        ((C0238p0) drawWithContent).m728a();
        InterfaceC22131e.m63385u(drawWithContent, C17909s.m51493k(AbstractC17911t.f69612b, listM118959K, 0.0f, 0.0f, 14), 0L, 0L, 0.0f, null, 6, 62);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m71557j(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m71558k(String str, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m71553f(str, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
