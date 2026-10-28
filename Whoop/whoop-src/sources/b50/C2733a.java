package b50;

import android.os.Handler;
import kr.C22786e;
import p027b3.AbstractC2351b;
import u00.C34377e;
import z40.C40054a;
import z40.C40059f;
import z40.C40064k;
import z40.C40065l;

/* JADX INFO: renamed from: b50.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C2733a extends AbstractC2351b {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f10743d;

    /* JADX INFO: renamed from: e */
    public final C22786e f10744e;

    /* JADX INFO: renamed from: f */
    public final C40059f f10745f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C2735c f10746g;

    public C2733a(C2735c c2735c, C22786e c22786e, C40059f c40059f, Handler handler, C34377e c34377e, int i13) {
        this.f10743d = i13;
        this.f10746g = c2735c;
        this.f9291b = handler;
        this.f10744e = c22786e;
        this.f10745f = c40059f;
    }

    @Override // p027b3.AbstractC2351b
    /* JADX INFO: renamed from: F */
    public final void mo7247F() {
        switch (this.f10743d) {
            case 0:
                this.f10744e.getClass();
                this.f10745f.f172868c.stopBluetoothSco();
                this.f10746g.m7708e(C2734b.f10750e);
                break;
            default:
                this.f10744e.getClass();
                this.f10745f.f172868c.startBluetoothSco();
                this.f10746g.m7708e(C2734b.f10748c);
                break;
        }
    }

    @Override // p027b3.AbstractC2351b
    /* JADX INFO: renamed from: G */
    public final void mo7248G() {
        switch (this.f10743d) {
            case 0:
                this.f10746g.m7708e(C2734b.f10749d);
                break;
            default:
                C2734b c2734b = C2734b.f10749d;
                C2735c c2735c = this.f10746g;
                c2735c.m7708e(c2734b);
                C40064k c40064k = c2735c.f10762z;
                if (c40064k != null) {
                    C40065l c40065l = c40064k.f172878a;
                    if (c40065l.f172885f instanceof C40054a) {
                        c40065l.f172885f = null;
                    }
                    c40065l.m128410d(null);
                }
                break;
        }
    }
}
