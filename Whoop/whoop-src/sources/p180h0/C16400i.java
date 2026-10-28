package p180h0;

import androidx.compose.foundation.gestures.FlingCancellationException;

/* JADX INFO: renamed from: h0.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C16400i implements InterfaceC16413k2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f63045a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f63046b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f63047c;

    public /* synthetic */ C16400i(int i13, Object obj, Object obj2) {
        this.f63045a = i13;
        this.f63046b = obj;
        this.f63047c = obj2;
    }

    @Override // p180h0.InterfaceC16413k2
    /* JADX INFO: renamed from: a */
    public final float mo29373a(float f13) {
        switch (this.f63045a) {
            case 0:
                C16410k c16410k = (C16410k) this.f63046b;
                float fM46614d = c16410k.f63069Z.m46614d(f13);
                float fM87022x = fM46614d - c16410k.f63069Z.f63154f.m87022x();
                ((C16430o) ((InterfaceC16356a) this.f63047c)).m46600b(fM46614d, 0.0f);
                return fM87022x;
            default:
                C16372c3 c16372c3 = (C16372c3) this.f63046b;
                boolean zBooleanValue = ((Boolean) c16372c3.f62943h.invoke()).booleanValue();
                if (Math.abs(f13) == 0.0f || zBooleanValue) {
                    return c16372c3.m46571d(c16372c3.m46574g(((C16360a3) this.f63047c).m46563a(2, c16372c3.m46572e(c16372c3.m46575h(f13)))));
                }
                throw new FlingCancellationException();
        }
    }
}
