package p309lo;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.CopyOnWriteArraySet;
import p085d9.C11799p;
import p516u8.C34606n;
import p607x8.C38053h;
import p607x8.C38054i;
import p607x8.InterfaceC38052g;

/* JADX INFO: renamed from: lo.g */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C24549g implements Handler.Callback {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f95818w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f95819x;

    public /* synthetic */ C24549g(Object obj, int i13) {
        this.f95818w = i13;
        this.f95819x = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f95818w) {
            case 0:
                C11799p c11799p = (C11799p) this.f95819x;
                for (C24552j c24552j : (CopyOnWriteArraySet) c11799p.f38304e) {
                    InterfaceC24551i interfaceC24551i = (InterfaceC24551i) c11799p.f38303d;
                    if (!c24552j.f95823d && c24552j.f95822c) {
                        C24548f c24548fM71593b = c24552j.f95821b.m71593b();
                        c24552j.f95821b = new C24547e(0);
                        c24552j.f95822c = false;
                        interfaceC24551i.mo71596a(c24552j.f95820a, c24548fM71593b);
                    }
                    if (((C24564v) c11799p.f38302c).f95865a.hasMessages(0)) {
                        break;
                    }
                }
                break;
            default:
                C38054i c38054i = (C38054i) this.f95819x;
                for (C38053h c38053h : c38054i.f162998d) {
                    InterfaceC38052g interfaceC38052g = c38054i.f162997c;
                    if (!c38053h.f162994d && c38053h.f162993c) {
                        C34606n c34606nM71594c = c38053h.f162992b.m71594c();
                        c38053h.f162992b = new C24547e(1);
                        c38053h.f162993c = false;
                        interfaceC38052g.mo1654a(c38053h.f162991a, c34606nM71594c);
                    }
                    if (c38054i.f162996b.f163026a.hasMessages(1)) {
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
