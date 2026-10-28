package p027b3;

import java.util.List;
import p002a0.AbstractC0050s;
import p002a0.C0026h0;
import p209i3.C18030l;
import p209i3.C18034p;

/* JADX INFO: renamed from: b3.w2 */
/* JADX INFO: loaded from: classes.dex */
public final class C2459w2 {

    /* JADX INFO: renamed from: a */
    public final C18030l f9601a;

    /* JADX INFO: renamed from: b */
    public final C0026h0 f9602b;

    public C2459w2(C18034p c18034p, AbstractC0050s abstractC0050s) {
        this.f9601a = c18034p.f69989d;
        this.f9602b = new C0026h0(C18034p.m51776j(4, c18034p).size());
        List listM51776j = C18034p.m51776j(4, c18034p);
        int size = listM51776j.size();
        for (int i13 = 0; i13 < size; i13++) {
            C18034p c18034p2 = (C18034p) listM51776j.get(i13);
            if (abstractC0050s.m120a(c18034p2.f69992g)) {
                this.f9602b.m61a(c18034p2.f69992g);
            }
        }
    }
}
