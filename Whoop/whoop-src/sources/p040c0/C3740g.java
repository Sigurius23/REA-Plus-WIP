package p040c0;

import java.util.Map;
import p002a0.C0057v0;
import p390p1.InterfaceC28620h0;
import p634y1.C39031d;
import p634y1.C39036i;
import p668z1.C39967p;

/* JADX INFO: renamed from: c0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C3740g implements InterfaceC28620h0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f15303a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f15304b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f15305c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f15306d;

    public /* synthetic */ C3740g(Object obj, Object obj2, Object obj3, int i13) {
        this.f15303a = i13;
        this.f15305c = obj;
        this.f15304b = obj2;
        this.f15306d = obj3;
    }

    @Override // p390p1.InterfaceC28620h0
    public final void dispose() {
        switch (this.f15303a) {
            case 0:
                C39967p c39967p = (C39967p) this.f15305c;
                Object obj = this.f15304b;
                c39967p.remove(obj);
                ((C3789x) this.f15306d).f15451e.m133k(obj);
                break;
            default:
                C39031d c39031d = (C39031d) this.f15305c;
                C0057v0 c0057v0 = c39031d.f167998x;
                Object obj2 = this.f15304b;
                Object objM133k = c0057v0.m133k(obj2);
                C39036i c39036i = (C39036i) this.f15306d;
                if (objM133k == c39036i) {
                    Map map = c39031d.f167997w;
                    Map mapMo7447e = c39036i.mo7447e();
                    if (!mapMo7447e.isEmpty()) {
                        map.put(obj2, mapMo7447e);
                    } else {
                        map.remove(obj2);
                    }
                }
                break;
        }
    }
}
