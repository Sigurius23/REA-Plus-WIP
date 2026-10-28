package p112e9;

import android.os.Handler;
import android.os.Message;
import java.util.TreeMap;
import p086da.C11827b;
import p141f9.C14261c;
import p284ko.C22631o;
import p607x8.AbstractC38065t;

/* JADX INFO: renamed from: e9.p */
/* JADX INFO: loaded from: classes5.dex */
public final class C12877p implements Handler.Callback {

    /* JADX INFO: renamed from: F */
    public C14261c f44327F;

    /* JADX INFO: renamed from: G */
    public boolean f44328G;

    /* JADX INFO: renamed from: H */
    public boolean f44329H;

    /* JADX INFO: renamed from: I */
    public boolean f44330I;

    /* JADX INFO: renamed from: w */
    public final C22631o f44331w;

    /* JADX INFO: renamed from: x */
    public final C12865d f44332x;

    /* JADX INFO: renamed from: E */
    public final TreeMap f44326E = new TreeMap();

    /* JADX INFO: renamed from: z */
    public final Handler f44334z = AbstractC38065t.m121920m(this);

    /* JADX INFO: renamed from: y */
    public final C11827b f44333y = new C11827b(1);

    public C12877p(C14261c c14261c, C12865d c12865d, C22631o c22631o) {
        this.f44327F = c14261c;
        this.f44332x = c12865d;
        this.f44331w = c22631o;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (!this.f44330I) {
            if (message.what != 1) {
                return false;
            }
            C12875n c12875n = (C12875n) message.obj;
            long j7 = c12875n.f44319a;
            long j13 = c12875n.f44320b;
            Long lValueOf = Long.valueOf(j13);
            TreeMap treeMap = this.f44326E;
            Long l7 = (Long) treeMap.get(lValueOf);
            if (l7 == null) {
                treeMap.put(Long.valueOf(j13), Long.valueOf(j7));
                return true;
            }
            if (l7.longValue() > j7) {
                treeMap.put(Long.valueOf(j13), Long.valueOf(j7));
            }
        }
        return true;
    }
}
