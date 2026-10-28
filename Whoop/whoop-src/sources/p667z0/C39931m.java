package p667z0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p026b2.C2314t;
import p162g0.AbstractC14928e;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.jvm.functions.Function1;
import x30.C37888f1;
import x30.C37894h1;

/* JADX INFO: renamed from: z0.m */
/* JADX INFO: loaded from: classes5.dex */
public final class C39931m {

    /* JADX INFO: renamed from: a */
    public static final C39931m f172374a = new C39931m();

    /* JADX INFO: renamed from: a */
    public final void m128089a(Drawable drawable, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(257732500);
        int i14 = (c28655q.m87157i(drawable) ? 4 : 2) | i13;
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Modifier modifierM3419p = AbstractC1102d.m3419p(AbstractC14928e.f55638j, C2314t.f9131w);
            boolean zM87157i = c28655q.m87157i(drawable);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C37894h1(drawable, 10);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC22989q.m66760a(AbstractC1125a.m3478a(modifierM3419p, (Function1) objM87133R), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C37888f1(this, drawable, i13, 10);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m128090b(final Icon icon, Composer composer, final int i13) {
        C28677v1 c28677v1M87180u;
        InterfaceC4351m interfaceC4351m;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2116504409);
        int i14 = (c28655q.m87157i(icon) ? 4 : 2) | i13;
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            boolean zM87153g = c28655q.m87153g(icon) | c28655q.m87153g(context);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = icon.loadDrawable(context);
                c28655q.m87172p0(objM87133R);
            }
            Drawable drawable = (Drawable) objM87133R;
            if (drawable == null) {
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u == null) {
                    return;
                }
                final int i15 = 0;
                interfaceC4351m = new InterfaceC4351m(this, icon, i13, i15) { // from class: z0.l

                    /* JADX INFO: renamed from: w */
                    public final /* synthetic */ int f172371w;

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ C39931m f172372x;

                    /* JADX INFO: renamed from: y */
                    public final /* synthetic */ Icon f172373y;

                    {
                        this.f172371w = i15;
                        this.f172372x = this;
                    }

                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int i16 = this.f172371w;
                        Composer composer2 = (Composer) obj;
                        ((Integer) obj2).getClass();
                        switch (i16) {
                            case 0:
                                this.f172372x.m128090b(this.f172373y, composer2, AbstractC28683x.m87244L(49));
                                break;
                            default:
                                this.f172372x.m128090b(this.f172373y, composer2, AbstractC28683x.m87244L(49));
                                break;
                        }
                        return C23454a0.f92919a;
                    }
                };
            } else {
                m128089a(drawable, c28655q, 48);
            }
            c28677v1M87180u.f115982d = interfaceC4351m;
        }
        c28655q.m87138X();
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final int i16 = 1;
            interfaceC4351m = new InterfaceC4351m(this, icon, i13, i16) { // from class: z0.l

                /* JADX INFO: renamed from: w */
                public final /* synthetic */ int f172371w;

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ C39931m f172372x;

                /* JADX INFO: renamed from: y */
                public final /* synthetic */ Icon f172373y;

                {
                    this.f172371w = i16;
                    this.f172372x = this;
                }

                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int i17 = this.f172371w;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i17) {
                        case 0:
                            this.f172372x.m128090b(this.f172373y, composer2, AbstractC28683x.m87244L(49));
                            break;
                        default:
                            this.f172372x.m128090b(this.f172373y, composer2, AbstractC28683x.m87244L(49));
                            break;
                    }
                    return C23454a0.f92919a;
                }
            };
            c28677v1M87180u.f115982d = interfaceC4351m;
        }
    }
}
