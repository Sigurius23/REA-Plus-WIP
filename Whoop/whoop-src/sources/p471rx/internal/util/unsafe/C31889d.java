package p471rx.internal.util.unsafe;

/* JADX INFO: renamed from: rx.internal.util.unsafe.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C31889d extends AbstractC31893h {
    public C31889d(int i13) {
        super(i13);
        Math.min(i13 / 4, AbstractC31891f.f132400F.intValue());
    }

    /* JADX INFO: renamed from: e */
    public final long m99139e() {
        return AbstractC31895j.f132402a.getLongVolatile(this, AbstractC31890e.f132399H);
    }

    /* JADX INFO: renamed from: f */
    public final long m99140f() {
        return AbstractC31895j.f132402a.getLongVolatile(this, AbstractC31894i.f132401G);
    }

    /* JADX INFO: renamed from: g */
    public final void m99141g(long j7) {
        AbstractC31895j.f132402a.putOrderedLong(this, AbstractC31890e.f132399H, j7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return m99140f() == m99139e();
    }

    /* JADX INFO: renamed from: j */
    public final void m99142j(long j7) {
        AbstractC31895j.f132402a.putOrderedLong(this, AbstractC31894i.f132401G, j7);
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null elements not allowed");
        }
        long j7 = this.producerIndex;
        long jM99138a = m99138a(j7);
        Object[] objArr = this.f132398x;
        if (AbstractC31886a.m99136c(objArr, jM99138a) != null) {
            return false;
        }
        AbstractC31886a.m99137d(objArr, jM99138a, obj);
        m99142j(j7 + 1);
        return true;
    }

    @Override // java.util.Queue
    public final Object peek() {
        return AbstractC31886a.m99136c(this.f132398x, m99138a(this.consumerIndex));
    }

    @Override // java.util.Queue, p471rx.internal.util.unsafe.InterfaceC31888c
    public final Object poll() {
        long j7 = this.consumerIndex;
        long jM99138a = m99138a(j7);
        Object[] objArr = this.f132398x;
        Object objM99136c = AbstractC31886a.m99136c(objArr, jM99138a);
        if (objM99136c == null) {
            return null;
        }
        AbstractC31886a.m99137d(objArr, jM99138a, null);
        m99141g(j7 + 1);
        return objM99136c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        long jM99139e = m99139e();
        while (true) {
            long jM99140f = m99140f();
            long jM99139e2 = m99139e();
            if (jM99139e == jM99139e2) {
                return (int) (jM99140f - jM99139e2);
            }
            jM99139e = jM99139e2;
        }
    }
}
