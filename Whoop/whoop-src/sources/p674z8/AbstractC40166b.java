package p674z8;

import android.os.SystemClock;
import java.util.ArrayList;
import p398p9.C28982f;
import p607x8.AbstractC38065t;
import p690zr.C41060w0;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: z8.b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC40166b implements InterfaceC40170f {

    /* JADX INFO: renamed from: w */
    public final boolean f173328w;

    /* JADX INFO: renamed from: x */
    public final ArrayList f173329x = new ArrayList(1);

    /* JADX INFO: renamed from: y */
    public int f173330y;

    /* JADX INFO: renamed from: z */
    public C40171g f173331z;

    public AbstractC40166b(boolean z4) {
        this.f173328w = z4;
    }

    /* JADX INFO: renamed from: a */
    public final void m128883a(int i13) {
        C40171g c40171g = this.f173331z;
        int i14 = AbstractC38065t.f163031a;
        for (int i15 = 0; i15 < this.f173330y; i15++) {
            InterfaceC40178n interfaceC40178n = (InterfaceC40178n) this.f173329x.get(i15);
            boolean z4 = this.f173328w;
            C28982f c28982f = (C28982f) interfaceC40178n;
            synchronized (c28982f) {
                C41060w0 c41060w0 = C28982f.f117223p;
                if (z4 && (c40171g.f173350h & 8) != 8) {
                    c28982f.f117238i += (long) i13;
                }
            }
        }
    }

    @Override // p674z8.InterfaceC40170f
    public final void addTransferListener(InterfaceC40178n interfaceC40178n) {
        interfaceC40178n.getClass();
        ArrayList arrayList = this.f173329x;
        if (arrayList.contains(interfaceC40178n)) {
            return;
        }
        arrayList.add(interfaceC40178n);
        this.f173330y++;
    }

    /* JADX INFO: renamed from: b */
    public final void m128884b() {
        C40171g c40171g = this.f173331z;
        int i13 = AbstractC38065t.f163031a;
        for (int i14 = 0; i14 < this.f173330y; i14++) {
            InterfaceC40178n interfaceC40178n = (InterfaceC40178n) this.f173329x.get(i14);
            boolean z4 = this.f173328w;
            C28982f c28982f = (C28982f) interfaceC40178n;
            synchronized (c28982f) {
                try {
                    C41060w0 c41060w0 = C28982f.f117223p;
                    if (z4 && (c40171g.f173350h & 8) != 8) {
                        AbstractC35849g.m113807i(c28982f.f117236g > 0);
                        c28982f.f117233d.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        int i15 = (int) (jElapsedRealtime - c28982f.f117237h);
                        c28982f.f117239j += (long) i15;
                        long j7 = c28982f.f117240k;
                        long j13 = c28982f.f117238i;
                        c28982f.f117240k = j7 + j13;
                        if (i15 > 0) {
                            c28982f.f117235f.m88010a((j13 * 8000.0f) / i15, (int) Math.sqrt(j13));
                            if (c28982f.f117239j >= 2000 || c28982f.f117240k >= 524288) {
                                c28982f.f117241l = (long) c28982f.f117235f.m88011b();
                            }
                            c28982f.m88004b(i15, c28982f.f117238i, c28982f.f117241l);
                            c28982f.f117237h = jElapsedRealtime;
                            c28982f.f117238i = 0L;
                        }
                        c28982f.f117236g--;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        this.f173331z = null;
    }

    /* JADX INFO: renamed from: d */
    public final void m128885d() {
        for (int i13 = 0; i13 < this.f173330y; i13++) {
            ((InterfaceC40178n) this.f173329x.get(i13)).getClass();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m128886h(C40171g c40171g) {
        this.f173331z = c40171g;
        for (int i13 = 0; i13 < this.f173330y; i13++) {
            InterfaceC40178n interfaceC40178n = (InterfaceC40178n) this.f173329x.get(i13);
            boolean z4 = this.f173328w;
            C28982f c28982f = (C28982f) interfaceC40178n;
            synchronized (c28982f) {
                try {
                    C41060w0 c41060w0 = C28982f.f117223p;
                    if (z4 && (c40171g.f173350h & 8) != 8) {
                        if (c28982f.f117236g == 0) {
                            c28982f.f117233d.getClass();
                            c28982f.f117237h = SystemClock.elapsedRealtime();
                        }
                        c28982f.f117236g++;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }
}
