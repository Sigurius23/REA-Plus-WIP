package p641y8;

import java.util.ArrayList;
import java.util.Arrays;
import p010a9.AbstractC0576a;

/* JADX INFO: renamed from: y8.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C39308c extends AbstractC0576a {

    /* JADX INFO: renamed from: E */
    public final ArrayList f169110E;

    /* JADX INFO: renamed from: y */
    public final long f169111y;

    /* JADX INFO: renamed from: z */
    public final ArrayList f169112z;

    public C39308c(int i13, long j7) {
        super(i13, 4);
        this.f169111y = j7;
        this.f169112z = new ArrayList();
        this.f169110E = new ArrayList();
    }

    /* JADX INFO: renamed from: o */
    public final C39308c m125272o(int i13) {
        ArrayList arrayList = this.f169110E;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            C39308c c39308c = (C39308c) arrayList.get(i14);
            if (c39308c.f2052x == i13) {
                return c39308c;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final C39309d m125273p(int i13) {
        ArrayList arrayList = this.f169112z;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            C39309d c39309d = (C39309d) arrayList.get(i14);
            if (c39309d.f2052x == i13) {
                return c39309d;
            }
        }
        return null;
    }

    @Override // p010a9.AbstractC0576a
    public final String toString() {
        return AbstractC0576a.m1493e(this.f2052x) + " leaves: " + Arrays.toString(this.f169112z.toArray()) + " containers: " + Arrays.toString(this.f169110E.toArray());
    }
}
