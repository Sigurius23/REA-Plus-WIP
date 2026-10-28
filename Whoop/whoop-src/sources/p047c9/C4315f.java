package p047c9;

import java.util.HashMap;
import ng3.C26701n;
import p299l9.C23488c0;
import p607x8.C38059n;
import p607x8.InterfaceC38049d;
import p607x8.InterfaceC38051f;
import qa.C30096a;
import qa.C30108m;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: c9.f */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C4315f implements InterfaceC38051f, InterfaceC38049d {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ long f17511w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f17512x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f17513y;

    public /* synthetic */ C4315f(C4310a c4310a, int i13, long j7, long j13) {
        this.f17513y = c4310a;
        this.f17512x = i13;
        this.f17511w = j7;
    }

    @Override // p607x8.InterfaceC38049d
    public void accept(Object obj) {
        C30108m c30108m = (C30108m) this.f17513y;
        C30096a c30096a = (C30096a) obj;
        AbstractC35849g.m113808j(c30108m.f122854h);
        byte[] bArrM79402h = C26701n.m79402h(c30096a.f122818a, c30096a.f122820c);
        C38059n c38059n = c30108m.f122849c;
        c38059n.getClass();
        c38059n.m121844D(bArrM79402h.length, bArrM79402h);
        c30108m.f122847a.mo36176d(c38059n, bArrM79402h.length, 0);
        long j7 = c30096a.f122819b;
        long j13 = this.f17511w;
        if (j7 == -9223372036854775807L) {
            AbstractC35849g.m113807i(c30108m.f122854h.f145788s == Long.MAX_VALUE);
        } else {
            long j14 = c30108m.f122854h.f145788s;
            j13 = j14 == Long.MAX_VALUE ? j13 + j7 : j7 + j14;
        }
        c30108m.f122847a.mo36174b(j13, this.f17512x | 1, bArrM79402h.length, 0, null);
    }

    @Override // p607x8.InterfaceC38051f
    /* JADX INFO: renamed from: invoke */
    public void mo134038invoke(Object obj) {
        C4310a c4310a = (C4310a) this.f17513y;
        C4321l c4321l = (C4321l) ((InterfaceC4311b) obj);
        HashMap map = c4321l.f17552h;
        HashMap map2 = c4321l.f17553i;
        C23488c0 c23488c0 = c4310a.f17498d;
        if (c23488c0 != null) {
            String strM13608c = c4321l.f17547c.m13608c(c4310a.f17496b, c23488c0);
            Long l7 = (Long) map2.get(strM13608c);
            Long l12 = (Long) map.get(strM13608c);
            map2.put(strM13608c, Long.valueOf((l7 == null ? 0L : l7.longValue()) + this.f17511w));
            map.put(strM13608c, Long.valueOf((l12 != null ? l12.longValue() : 0L) + ((long) this.f17512x)));
        }
    }

    public /* synthetic */ C4315f(C30108m c30108m, long j7, int i13) {
        this.f17513y = c30108m;
        this.f17511w = j7;
        this.f17512x = i13;
    }
}
