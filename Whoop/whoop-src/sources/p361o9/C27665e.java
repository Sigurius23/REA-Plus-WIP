package p361o9;

import p516u8.C34610p;
import p607x8.AbstractC38065t;
import p658yr.InterfaceC39719f;

/* JADX INFO: renamed from: o9.e */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C27665e implements InterfaceC39719f {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C27677q f111341w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C27670j f111342x;

    public /* synthetic */ C27665e(C27677q c27677q, C27670j c27670j) {
        this.f111341w = c27677q;
        this.f111342x = c27670j;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0061 A[FALL_THROUGH] */
    @Override // p658yr.InterfaceC39719f
    public final boolean apply(Object obj) {
        C27672l c27672l;
        C27672l c27672l2;
        C34610p c34610p = (C34610p) obj;
        C27677q c27677q = this.f111341w;
        c27677q.getClass();
        if (this.f111342x.f111384y) {
            int i13 = c34610p.f145759D;
            if (i13 != -1 && i13 > 2) {
                String str = c34610p.f145783n;
                if (str != null) {
                    switch (str) {
                        case "audio/eac3-joc":
                        case "audio/ac3":
                        case "audio/ac4":
                        case "audio/eac3":
                            if (AbstractC38065t.f163031a >= 32 && (c27672l2 = c27677q.f111427h) != null && c27672l2.f111388b) {
                            }
                        default:
                            if (AbstractC38065t.f163031a >= 32) {
                                break;
                            }
                            return false;
                    }
                } else if (AbstractC38065t.f163031a >= 32 || (c27672l = c27677q.f111427h) == null || !c27672l.f111388b || !c27672l.m83665b() || !c27677q.f111427h.m83666c() || !c27677q.f111427h.m83664a(c27677q.f111428i, c34610p)) {
                    return false;
                }
            }
        }
        return true;
    }
}
