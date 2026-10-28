package p717lq2;

import am0.C0998b;
import androidx.compose.animation.AbstractC1090b;
import androidx.compose.runtime.Composer;
import b30.C2476a1;
import l83.C23454a0;
import live.hms.video.media.capturers.camera.utils.C24174a;
import p040c0.AbstractC3788w0;
import p040c0.C3733d1;
import p040c0.InterfaceC3747i0;
import p077d0.AbstractC11348f;
import p077d0.C11347e2;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lq2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a+\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"", "height", "j", "(I)I", "", "isCurrentStep", "Lkotlin/Function1;", "Lc0/i0;", "Ll83/a0;", "content", "e", "(ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC24669a {
    /* JADX INFO: renamed from: e */
    public static final void m72061e(boolean z4, Function3 content, Composer composer, int i13) {
        int i14;
        boolean z13;
        AbstractC22676k.m65750j(content, "content");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(547489400);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(content) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C11347e2 c11347e2M30574v = AbstractC11348f.m30574v(1000, 0, null, 6);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C24174a(15);
                c28655q.m87172p0(objM87133R);
            }
            C3733d1 c3733d1M11562a = AbstractC3788w0.m11587o(c11347e2M30574v, (Function1) objM87133R).m11562a(AbstractC3788w0.m11577e(AbstractC11348f.m30574v(1000, 0, null, 6), 2));
            C11347e2 c11347e2M30574v2 = AbstractC11348f.m30574v(500, 0, null, 6);
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C24174a(16);
                c28655q.m87172p0(objM87133R2);
            }
            z13 = z4;
            AbstractC1090b.m3351f(z13, null, c3733d1M11562a, AbstractC3788w0.m11591s(c11347e2M30574v2, (Function1) objM87133R2).m11563a(AbstractC3788w0.m11578f(AbstractC11348f.m30574v(500, 0, null, 6), 2)), null, AbstractC37817c.m121344e(-571070128, c28655q, new C2476a1(content, 27)), c28655q, (i14 & 14) | 200064, 18);
        } else {
            z13 = z4;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0998b(z13, content, i13, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final int m72062f(int i13) {
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final int m72063g(int i13) {
        return m72066j(i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m72064h(Function3 function3, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        function3.invoke(AnimatedVisibility, composer, Integer.valueOf(i13 & 14));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m72065i(boolean z4, Function3 function3, int i13, Composer composer, int i14) {
        m72061e(z4, function3, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    public static final int m72066j(int i13) {
        return i13 / 3;
    }
}
