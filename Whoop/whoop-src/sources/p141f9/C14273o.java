package p141f9;

import java.util.List;

/* JADX INFO: renamed from: f9.o */
/* JADX INFO: loaded from: classes5.dex */
public final class C14273o extends AbstractC14272n {

    /* JADX INFO: renamed from: j */
    public final List f52121j;

    public C14273o(C14268j c14268j, long j7, long j13, long j14, long j15, List list, long j16, List list2, long j17, long j18) {
        super(c14268j, j7, j13, j14, j15, list, j16, j17, j18);
        this.f52121j = list2;
    }

    @Override // p141f9.AbstractC14272n
    /* JADX INFO: renamed from: d */
    public final long mo40757d(long j7) {
        return this.f52121j.size();
    }

    @Override // p141f9.AbstractC14272n
    /* JADX INFO: renamed from: h */
    public final C14268j mo40761h(C14269k c14269k, long j7) {
        return (C14268j) this.f52121j.get((int) (j7 - this.f52115d));
    }

    @Override // p141f9.AbstractC14272n
    /* JADX INFO: renamed from: i */
    public final boolean mo40762i() {
        return true;
    }
}
