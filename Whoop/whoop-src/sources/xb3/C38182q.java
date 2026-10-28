package xb3;

import java.util.Iterator;
import p184h5.C16907r0;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: xb3.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C38182q implements InterfaceC38174i, InterfaceC38168c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC38174i f163492a;

    /* JADX INFO: renamed from: b */
    public final int f163493b;

    public C38182q(InterfaceC38174i sequence, int i13) {
        AbstractC22676k.m65750j(sequence, "sequence");
        this.f163492a = sequence;
        this.f163493b = i13;
        if (i13 < 0) {
            throw new IllegalArgumentException(AbstractC31061c.m95639o("count must be non-negative, but was ", i13, '.').toString());
        }
    }

    @Override // xb3.InterfaceC38168c
    /* JADX INFO: renamed from: a */
    public final InterfaceC38174i mo122265a(int i13) {
        int i14 = this.f163493b;
        return i13 >= i14 ? C38169d.f163464a : new C38181p(this.f163492a, i13, i14);
    }

    @Override // xb3.InterfaceC38168c
    /* JADX INFO: renamed from: b */
    public final InterfaceC38174i mo122266b(int i13) {
        return i13 >= this.f163493b ? this : new C38182q(this.f163492a, i13);
    }

    @Override // xb3.InterfaceC38174i
    public final Iterator iterator() {
        return new C16907r0(this);
    }
}
