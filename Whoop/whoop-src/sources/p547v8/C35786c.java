package p547v8;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import p690zr.AbstractC41023g0;

/* JADX INFO: renamed from: v8.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C35786c {

    /* JADX INFO: renamed from: a */
    public final AbstractC41023g0 f152189a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f152190b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public ByteBuffer[] f152191c = new ByteBuffer[0];

    /* JADX INFO: renamed from: d */
    public boolean f152192d;

    public C35786c(AbstractC41023g0 abstractC41023g0) {
        this.f152189a = abstractC41023g0;
        C35787d c35787d = C35787d.f152193e;
        this.f152192d = false;
    }

    /* JADX INFO: renamed from: a */
    public final void m113432a() {
        ArrayList arrayList = this.f152190b;
        arrayList.clear();
        this.f152192d = false;
        int i13 = 0;
        while (true) {
            AbstractC41023g0 abstractC41023g0 = this.f152189a;
            if (i13 >= abstractC41023g0.size()) {
                break;
            }
            InterfaceC35788e interfaceC35788e = (InterfaceC35788e) abstractC41023g0.get(i13);
            interfaceC35788e.flush();
            if (interfaceC35788e.isActive()) {
                arrayList.add(interfaceC35788e);
            }
            i13++;
        }
        this.f152191c = new ByteBuffer[arrayList.size()];
        for (int i14 = 0; i14 <= m113433b(); i14++) {
            this.f152191c[i14] = ((InterfaceC35788e) arrayList.get(i14)).mo31606a();
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m113433b() {
        return this.f152191c.length - 1;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m113434c() {
        return this.f152192d && ((InterfaceC35788e) this.f152190b.get(m113433b())).mo31607d() && !this.f152191c[m113433b()].hasRemaining();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m113435d() {
        return !this.f152190b.isEmpty();
    }

    /* JADX INFO: renamed from: e */
    public final void m113436e(ByteBuffer byteBuffer) {
        boolean z4;
        for (boolean z13 = true; z13; z13 = z4) {
            z4 = false;
            for (int i13 = 0; i13 <= m113433b(); i13++) {
                if (!this.f152191c[i13].hasRemaining()) {
                    ArrayList arrayList = this.f152190b;
                    InterfaceC35788e interfaceC35788e = (InterfaceC35788e) arrayList.get(i13);
                    if (!interfaceC35788e.mo31607d()) {
                        ByteBuffer byteBuffer2 = i13 > 0 ? this.f152191c[i13 - 1] : byteBuffer.hasRemaining() ? byteBuffer : InterfaceC35788e.f152198a;
                        long jRemaining = byteBuffer2.remaining();
                        interfaceC35788e.mo31596b(byteBuffer2);
                        this.f152191c[i13] = interfaceC35788e.mo31606a();
                        z4 |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.f152191c[i13].hasRemaining();
                    } else if (!this.f152191c[i13].hasRemaining() && i13 < m113433b()) {
                        ((InterfaceC35788e) arrayList.get(i13 + 1)).mo113437c();
                    }
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35786c)) {
            return false;
        }
        AbstractC41023g0 abstractC41023g0 = ((C35786c) obj).f152189a;
        AbstractC41023g0 abstractC41023g1 = this.f152189a;
        if (abstractC41023g1.size() != abstractC41023g0.size()) {
            return false;
        }
        for (int i13 = 0; i13 < abstractC41023g1.size(); i13++) {
            if (abstractC41023g1.get(i13) != abstractC41023g0.get(i13)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f152189a.hashCode();
    }
}
