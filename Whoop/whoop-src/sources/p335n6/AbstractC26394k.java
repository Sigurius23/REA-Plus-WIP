package p335n6;

import java.util.ArrayList;
import m83.AbstractC25265s;
import yb3.AbstractC39415s;

/* JADX INFO: renamed from: n6.k */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC26394k implements InterfaceC26392i {

    /* JADX INFO: renamed from: a */
    public int f104848a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f104849b;

    public AbstractC26394k(int i13, int i14) {
        this.f104848a = (i14 & 1) != 0 ? Integer.MAX_VALUE : i13;
        this.f104849b = new ArrayList();
    }

    /* JADX INFO: renamed from: d */
    public final String m78106d() {
        return AbstractC39415s.m125908r(AbstractC25265s.m74110N0(this.f104849b, ",\n", null, null, null, 62), "  ");
    }
}
