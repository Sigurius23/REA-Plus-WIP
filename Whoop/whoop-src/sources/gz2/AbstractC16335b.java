package gz2;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.runtime.Composer;
import c51.C4231h;
import go1.C16016a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import mh.C25540h;
import p005a3.C0238p0;
import p026b2.C2314t;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p635y2.C39102j;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: gz2.b */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\"\u001a\u0010\f\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m65681d2 = {"Lkd1/o;", "image", "Landroidx/compose/ui/Modifier;", "modifier", "Ll83/a0;", "d", "(Lkd1/o;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Ly3/f;", "a", "F", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()F", "LANDING_BACKGROUND_HEIGHT", "whooplabs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC16335b {

    /* JADX INFO: renamed from: a */
    private static final float f62845a = 304;

    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x0092  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final void m46527d(AbstractC22403o image, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        Object objM87133R;
        C28676v0 c28676v0;
        AbstractC17911t abstractC17911t;
        Object objM87133R2;
        Object objM87133R3;
        AbstractC22676k.m65750j(image, "image");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1342809794);
        if ((i13 & 6) == 0) {
            i15 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(image) : c28655q.m87157i(image) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i16 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.f69625b), new C17919x(C17919x.f69636m)), 0.0f, 0.0f, 14);
                    c28655q.m87172p0(objM87133R);
                }
                abstractC17911t = (AbstractC17911t) objM87133R;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C16016a(19);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(image, null, (Function1) objM87133R2, c28655q, AbstractC22403o.f87638a | 384 | (i15 & 14), 1);
                Modifier modifierM3488c = AbstractC1127a.m3488c(AbstractC1102d.m3411h(f62845a, AbstractC1102d.m3409f(1.0f, modifier4)), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1, 458751);
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C4231h(abstractC17911t, 5);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC29125c.m88522c(abstractC26165aM64500i, null, AbstractC1125a.m3480c(modifierM3488c, (Function1) objM87133R3), null, C39102j.f168199a, 0.0f, null, c28655q, 24624, 104);
                c28655q = c28655q;
                modifier3 = modifier4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C16334a(image, modifier3, i13, i14, 0);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i16 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.f69625b), new C17919x(C17919x.f69636m)), 0.0f, 0.0f, 14);
                c28655q.m87172p0(objM87133R);
            }
            abstractC17911t = (AbstractC17911t) objM87133R;
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C16016a(19);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC26165a abstractC26165aM64500i2 = AbstractC22404p.m64500i(image, null, (Function1) objM87133R2, c28655q, AbstractC22403o.f87638a | 384 | (i15 & 14), 1);
            Modifier modifierM3488c2 = AbstractC1127a.m3488c(AbstractC1102d.m3411h(f62845a, AbstractC1102d.m3409f(1.0f, modifier4)), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1, 458751);
            objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C4231h(abstractC17911t, 5);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC29125c.m88522c(abstractC26165aM64500i2, null, AbstractC1125a.m3480c(modifierM3488c2, (Function1) objM87133R3), null, C39102j.f168199a, 0.0f, null, c28655q, 24624, 104);
            c28655q = c28655q;
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C16334a(image, modifier3, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m46528e(C25540h rememberImagePainter) {
        AbstractC22676k.m65750j(rememberImagePainter, "$this$rememberImagePainter");
        rememberImagePainter.m75119c(300);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m46529f(AbstractC17911t abstractC17911t, InterfaceC22129c drawWithContent) {
        AbstractC22676k.m65750j(drawWithContent, "$this$drawWithContent");
        ((C0238p0) drawWithContent).m728a();
        InterfaceC22131e.m63385u(drawWithContent, abstractC17911t, 0L, 0L, 0.0f, null, 6, 62);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m46530g(AbstractC22403o abstractC22403o, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m46527d(abstractC22403o, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    public static final float m46531h() {
        return f62845a;
    }
}
