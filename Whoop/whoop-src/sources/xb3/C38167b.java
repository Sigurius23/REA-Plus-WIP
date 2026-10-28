package xb3;

import java.util.Iterator;
import m83.C25241d0;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: xb3.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C38167b implements InterfaceC38174i, InterfaceC38168c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC38174i f163462a;

    /* JADX INFO: renamed from: b */
    public final int f163463b;

    public C38167b(InterfaceC38174i sequence, int i13) {
        AbstractC22676k.m65750j(sequence, "sequence");
        this.f163462a = sequence;
        this.f163463b = i13;
        if (i13 < 0) {
            throw new IllegalArgumentException(AbstractC31061c.m95639o("count must be non-negative, but was ", i13, '.').toString());
        }
    }

    @Override // xb3.InterfaceC38168c
    /* JADX INFO: renamed from: a */
    public final InterfaceC38174i mo122265a(int i13) {
        int i14 = this.f163463b + i13;
        return i14 < 0 ? new C38167b(this, i13) : new C38167b(this.f163462a, i14);
    }

    @Override // xb3.InterfaceC38168c
    /* JADX INFO: renamed from: b */
    public final InterfaceC38174i mo122266b(int i13) {
        int i14 = this.f163463b;
        int i15 = i14 + i13;
        return i15 < 0 ? new C38182q(this, i13) : new C38181p(this.f163462a, i14, i15);
    }

    @Override // xb3.InterfaceC38174i
    public final Iterator iterator() {
        return new C25241d0(this);
    }
}
