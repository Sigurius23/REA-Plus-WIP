package p667z0;

import android.content.Context;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import c41.C4041i0;
import c93.InterfaceC4339a;
import e10.C12554k0;
import h00.C16521p0;
import p025b1.AbstractC2218i;
import p025b1.InterfaceC2215f;
import p026b2.C2314t;
import p043c4.AbstractC3975r;
import p043c4.C3966j0;
import p162g0.AbstractC14928e;
import p162g0.AbstractC14929f;
import p208i2.AbstractC17921y;
import p208i2.C17903p;
import p291l0.AbstractC22989q;
import p331n2.AbstractC26165a;
import p390p1.C28596b0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p530up.AbstractC35148d;
import p579wc.C37082e1;
import p601x0.C37792c;
import p601x0.InterfaceC37796g;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.C39102j;
import p664yy.C39850b0;
import p715kotlin.jvm.functions.Function1;
import pf.AbstractC29125c;
import u10.C34418f;
import vv2.C36537c;
import x30.C37888f1;
import yo1.C39689b;

/* JADX INFO: renamed from: z0.i */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC39927i {

    /* JADX INFO: renamed from: a */
    public static final C3966j0 f172364a = new C3966j0(true, 14);

    /* JADX INFO: renamed from: a */
    public static final void m128085a(InterfaceC37796g interfaceC37796g, C37792c c37792c, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1904307118);
        int i14 = (c28655q.m87153g(interfaceC37796g) ? 4 : 2) | i13 | (c28655q.m87157i(c37792c) ? 32 : 16);
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            c28655q.m87150e0(-1009462744);
            Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            c28655q.m87173q(false);
            boolean zM87157i = c28655q.m87157i(c37792c) | ((i14 & 14) == 4) | c28655q.m87157i(context);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C37082e1(c37792c, context, interfaceC37796g, 20);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC14929f.m43024b(null, null, (Function1) objM87133R, c28655q, 0, 3);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C37888f1(interfaceC37796g, c37792c, i13, 9);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m128086b(int i13, long j7, Composer composer, int i14) {
        int i15;
        int i16;
        C28677v1 c28677v1M87180u;
        C4041i0 c4041i0;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1240244237);
        if ((i14 & 6) == 0) {
            i15 = i13;
            i16 = i14 | (c28655q.m87149e(i15) ? 4 : 2);
        } else {
            i15 = i13;
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= c28655q.m87151f(j7) ? 32 : 16;
        }
        if (c28655q.m87135U(i16 & 1, (i16 & 19) != 18)) {
            Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            boolean zM87153g = ((i16 & 14) == 4) | c28655q.m87153g(context);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = Integer.valueOf(context.obtainStyledAttributes(new int[]{i15}).getResourceId(0, -1));
                c28655q.m87172p0(objM87133R);
            }
            int iIntValue = ((Number) objM87133R).intValue();
            if (iIntValue == -1) {
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u == null) {
                    return;
                } else {
                    c4041i0 = new C4041i0(i15, i14, j7, 4);
                }
            } else {
                AbstractC26165a abstractC26165aM88500I = AbstractC29125c.m88500I(iIntValue, c28655q, 0);
                boolean z4 = (i16 & 112) == 32;
                Object objM87133R2 = c28655q.m87133R();
                if (z4 || objM87133R2 == c28676v0) {
                    objM87133R2 = j7 == 16 ? null : new C17903p(j7, 5);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC22989q.m66760a(AbstractC1125a.m3481d(AbstractC1102d.m3419p(AbstractC14928e.f55638j, C2314t.f9131w), abstractC26165aM88500I, null, C39102j.f168200b, 0.0f, (AbstractC17921y) objM87133R2, 22), c28655q, 0);
            }
            c28677v1M87180u.f115982d = c4041i0;
        }
        c28655q.m87138X();
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c4041i0 = new C4041i0(i13, i14, j7, 5);
            c28677v1M87180u.f115982d = c4041i0;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m128087c(InterfaceC37796g interfaceC37796g, InterfaceC2215f interfaceC2215f, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2040393164);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(interfaceC37796g) : c28655q.m87157i(interfaceC37796g) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(interfaceC2215f) : c28655q.m87157i(interfaceC2215f) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 256 : 128;
        }
        boolean z4 = false;
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            boolean z13 = (i14 & 112) == 32 || ((i14 & 64) != 0 && c28655q.m87153g(interfaceC2215f));
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z13 || objM87133R == c28676v0) {
                objM87133R = new C39929k(new C12554k0(new C39689b(9, interfaceC2215f, interfaceC4339a), 17));
                c28655q.m87172p0(objM87133R);
            }
            C39929k c39929k = (C39929k) objM87133R;
            if ((i14 & 14) == 4 || ((i14 & 8) != 0 && c28655q.m87157i(interfaceC37796g))) {
                z4 = true;
            }
            Object objM87133R2 = c28655q.m87133R();
            if (z4 || objM87133R2 == c28676v0) {
                objM87133R2 = new C39850b0(interfaceC37796g, 2);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC3975r.m12004a(c39929k, (InterfaceC4339a) objM87133R2, f172364a, AbstractC37817c.m121344e(1315155414, c28655q, new C34418f(7, interfaceC2215f, interfaceC37796g)), c28655q, 3456, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36537c(interfaceC37796g, interfaceC2215f, interfaceC4339a, i13, 19);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m128088d(Modifier modifier, C37816b c37816b, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1392105195);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(c37816b) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C28596b0 c28596b0 = AbstractC2218i.f8839a;
            C37816b c37816b2 = AbstractC39926h.f172362a;
            AbstractC35148d.m111176g(modifier, c28596b0, c37816b, c28655q, ((i14 << 6) & 7168) | (i14 & 14) | 432);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C16521p0(modifier, c37816b, i13, 3);
        }
    }
}
