package o52;

import com.mapbox.geojson.Point;
import java.util.Iterator;
import p470rv.C31833m;
import p470rv.InterfaceC31840t;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: o52.q */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C27573q implements InterfaceC31840t {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f111012a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f111013b;

    public /* synthetic */ C27573q(Object obj, int i13) {
        this.f111012a = i13;
        this.f111013b = obj;
    }

    @Override // p470rv.InterfaceC31840t
    /* JADX INFO: renamed from: a */
    public final void mo83270a(Point it) {
        switch (this.f111012a) {
            case 0:
                C27585w.m83317c0((C27585w) this.f111013b, it);
                break;
            default:
                C31833m c31833m = (C31833m) this.f111013b;
                AbstractC22676k.m65750j(it, "it");
                c31833m.f131882F = it;
                Iterator it3 = c31833m.f131883G.iterator();
                while (it3.hasNext()) {
                    ((InterfaceC31840t) it3.next()).mo83270a(it);
                }
                break;
        }
    }
}
