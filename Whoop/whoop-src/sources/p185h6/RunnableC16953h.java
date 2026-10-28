package p185h6;

import java.util.ArrayList;
import java.util.List;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: h6.h */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC16953h implements Runnable {

    /* JADX INFO: renamed from: w */
    public final ArrayList f65075w;

    /* JADX INFO: renamed from: x */
    public final int f65076x;

    public RunnableC16953h(List list, int i13, Throwable th3) {
        AbstractC37056f.m118993q(list, "initCallbacks cannot be null");
        this.f65075w = new ArrayList(list);
        this.f65076x = i13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f65075w;
        int size = arrayList.size();
        int i13 = 0;
        if (this.f65076x != 1) {
            while (i13 < size) {
                ((AbstractC16952g) arrayList.get(i13)).mo47706a();
                i13++;
            }
        } else {
            while (i13 < size) {
                ((AbstractC16952g) arrayList.get(i13)).mo47707b();
                i13++;
            }
        }
    }
}
