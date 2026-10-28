package p384ow;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import p596ww.C37653a;
import p596ww.C37654b;

/* JADX INFO: renamed from: ow.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C28415k extends AbstractC28430z {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f114610a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC28430z f114611b;

    public /* synthetic */ C28415k(AbstractC28430z abstractC28430z, int i13) {
        this.f114610a = i13;
        this.f114611b = abstractC28430z;
    }

    @Override // p384ow.AbstractC28430z
    /* JADX INFO: renamed from: b */
    public final Object mo86132b(C37653a c37653a) {
        switch (this.f114610a) {
            case 0:
                return new AtomicLong(((Number) this.f114611b.mo86132b(c37653a)).longValue());
            default:
                ArrayList arrayList = new ArrayList();
                c37653a.beginArray();
                while (c37653a.hasNext()) {
                    arrayList.add(Long.valueOf(((Number) this.f114611b.mo86132b(c37653a)).longValue()));
                }
                c37653a.endArray();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i13 = 0; i13 < size; i13++) {
                    atomicLongArray.set(i13, ((Long) arrayList.get(i13)).longValue());
                }
                return atomicLongArray;
        }
    }

    @Override // p384ow.AbstractC28430z
    /* JADX INFO: renamed from: c */
    public final void mo86133c(C37654b c37654b, Object obj) throws IOException {
        switch (this.f114610a) {
            case 0:
                this.f114611b.mo86133c(c37654b, Long.valueOf(((AtomicLong) obj).get()));
                break;
            default:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                c37654b.beginArray();
                int length = atomicLongArray.length();
                for (int i13 = 0; i13 < length; i13++) {
                    this.f114611b.mo86133c(c37654b, Long.valueOf(atomicLongArray.get(i13)));
                }
                c37654b.endArray();
                break;
        }
    }
}
