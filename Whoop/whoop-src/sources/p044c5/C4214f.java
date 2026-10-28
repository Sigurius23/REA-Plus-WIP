package p044c5;

import io.sentry.internal.debugmeta.C20378c;
import java.util.ArrayList;
import p002a0.C0021f1;
import p167g5.InterfaceC15482a;

/* JADX INFO: renamed from: c5.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C4214f implements InterfaceC15482a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f17090a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f17091b;

    public /* synthetic */ C4214f(Object obj, int i13) {
        this.f17090a = i13;
        this.f17091b = obj;
    }

    @Override // p167g5.InterfaceC15482a
    public final void accept(Object obj) {
        switch (this.f17090a) {
            case 0:
                C4215g c4215g = (C4215g) obj;
                if (c4215g == null) {
                    c4215g = new C4215g(-3);
                }
                ((C20378c) this.f17091b).m56581D(c4215g);
                return;
            default:
                C4215g c4215g2 = (C4215g) obj;
                synchronized (AbstractC4216h.f17096c) {
                    try {
                        C0021f1 c0021f1 = AbstractC4216h.f17097d;
                        ArrayList arrayList = (ArrayList) c0021f1.get((String) this.f17091b);
                        if (arrayList == null) {
                            return;
                        }
                        c0021f1.remove((String) this.f17091b);
                        for (int i13 = 0; i13 < arrayList.size(); i13++) {
                            ((InterfaceC15482a) arrayList.get(i13)).accept(c4215g2);
                        }
                        return;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
        }
    }
}
