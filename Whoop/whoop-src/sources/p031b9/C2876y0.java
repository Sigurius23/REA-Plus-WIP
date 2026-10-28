package p031b9;

import android.util.Pair;
import java.io.IOException;
import live.hms.video.factories.RunnableC24150e;
import p171g9.InterfaceC15588e;
import p299l9.C23488c0;
import p299l9.C23527t;
import p299l9.C23537y;
import p299l9.InterfaceC23506i0;
import p607x8.C38063r;

/* JADX INFO: renamed from: b9.y0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2876y0 implements InterfaceC23506i0, InterfaceC15588e {

    /* JADX INFO: renamed from: w */
    public final C2816a1 f11430w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C2819b1 f11431x;

    public C2876y0(C2819b1 c2819b1, C2816a1 c2816a1) {
        this.f11431x = c2819b1;
        this.f11430w = c2816a1;
    }

    @Override // p299l9.InterfaceC23506i0
    /* JADX INFO: renamed from: a */
    public final void mo8314a(int i13, C23488c0 c23488c0, C23527t c23527t, C23537y c23537y) {
        Pair pairM8320g = m8320g(i13, c23488c0);
        if (pairM8320g != null) {
            ((C38063r) this.f11431x.f11038k).m121879c(new RunnableC2870v0(this, pairM8320g, c23527t, c23537y, 1));
        }
    }

    @Override // p299l9.InterfaceC23506i0
    /* JADX INFO: renamed from: b */
    public final void mo8315b(int i13, C23488c0 c23488c0, C23527t c23527t, C23537y c23537y, IOException iOException, boolean z4) {
        Pair pairM8320g = m8320g(i13, c23488c0);
        if (pairM8320g != null) {
            ((C38063r) this.f11431x.f11038k).m121879c(new RunnableC2874x0(this, pairM8320g, c23527t, c23537y, iOException, z4, 0));
        }
    }

    @Override // p299l9.InterfaceC23506i0
    /* JADX INFO: renamed from: c */
    public final void mo8316c(int i13, C23488c0 c23488c0, C23527t c23527t, C23537y c23537y) {
        Pair pairM8320g = m8320g(i13, c23488c0);
        if (pairM8320g != null) {
            ((C38063r) this.f11431x.f11038k).m121879c(new RunnableC2870v0(this, pairM8320g, c23527t, c23537y, 0));
        }
    }

    @Override // p299l9.InterfaceC23506i0
    /* JADX INFO: renamed from: d */
    public final void mo8317d(int i13, C23488c0 c23488c0, C23537y c23537y) {
        Pair pairM8320g = m8320g(i13, c23488c0);
        if (pairM8320g != null) {
            ((C38063r) this.f11431x.f11038k).m121879c(new RunnableC2872w0(this, pairM8320g, c23537y, 0));
        }
    }

    @Override // p299l9.InterfaceC23506i0
    /* JADX INFO: renamed from: e */
    public final void mo8318e(int i13, C23488c0 c23488c0, C23537y c23537y) {
        Pair pairM8320g = m8320g(i13, c23488c0);
        if (pairM8320g != null) {
            ((C38063r) this.f11431x.f11038k).m121879c(new RunnableC2872w0(this, pairM8320g, c23537y, 1));
        }
    }

    @Override // p299l9.InterfaceC23506i0
    /* JADX INFO: renamed from: f */
    public final void mo8319f(int i13, C23488c0 c23488c0, C23527t c23527t, C23537y c23537y, int i14) {
        Pair pairM8320g = m8320g(i13, c23488c0);
        if (pairM8320g != null) {
            ((C38063r) this.f11431x.f11038k).m121879c(new RunnableC24150e(this, pairM8320g, c23527t, c23537y, i14));
        }
    }

    /* JADX INFO: renamed from: g */
    public final Pair m8320g(int i13, C23488c0 c23488c0) {
        C23488c0 c23488c0M68053a;
        C2816a1 c2816a1 = this.f11430w;
        C23488c0 c23488c1 = null;
        if (c23488c0 != null) {
            int i14 = 0;
            while (true) {
                if (i14 >= c2816a1.f11017c.size()) {
                    c23488c0M68053a = null;
                    break;
                }
                if (((C23488c0) c2816a1.f11017c.get(i14)).f92979d == c23488c0.f92979d) {
                    Object obj = c23488c0.f92976a;
                    Object obj2 = c2816a1.f11016b;
                    int i15 = C2837h1.f11189k;
                    c23488c0M68053a = c23488c0.m68053a(Pair.create(obj2, obj));
                    break;
                }
                i14++;
            }
            if (c23488c0M68053a == null) {
                return null;
            }
            c23488c1 = c23488c0M68053a;
        }
        return Pair.create(Integer.valueOf(i13 + c2816a1.f11018d), c23488c1);
    }
}
