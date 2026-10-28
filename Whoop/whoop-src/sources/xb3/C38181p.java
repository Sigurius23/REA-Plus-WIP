package xb3;

import java.util.Iterator;
import p002a0.C0053t0;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: xb3.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C38181p implements InterfaceC38174i, InterfaceC38168c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC38174i f163489a;

    /* JADX INFO: renamed from: b */
    public final int f163490b;

    /* JADX INFO: renamed from: c */
    public final int f163491c;

    public C38181p(InterfaceC38174i sequence, int i13, int i14) {
        AbstractC22676k.m65750j(sequence, "sequence");
        this.f163489a = sequence;
        this.f163490b = i13;
        this.f163491c = i14;
        if (i13 < 0) {
            throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "startIndex should be non-negative, but is ").toString());
        }
        if (i14 < 0) {
            throw new IllegalArgumentException(AbstractC2875y.m8295h(i14, "endIndex should be non-negative, but is ").toString());
        }
        if (i14 < i13) {
            throw new IllegalArgumentException(AbstractC2875y.m8294g(i14, i13, "endIndex should be not less than startIndex, but was ", " < ").toString());
        }
    }

    @Override // xb3.InterfaceC38168c
    /* JADX INFO: renamed from: a */
    public final InterfaceC38174i mo122265a(int i13) {
        int i14 = this.f163491c;
        int i15 = this.f163490b;
        return i13 >= i14 - i15 ? C38169d.f163464a : new C38181p(this.f163489a, i15 + i13, i14);
    }

    @Override // xb3.InterfaceC38168c
    /* JADX INFO: renamed from: b */
    public final InterfaceC38174i mo122266b(int i13) {
        int i14 = this.f163491c;
        int i15 = this.f163490b;
        return i13 >= i14 - i15 ? this : new C38181p(this.f163489a, i15, i13 + i15);
    }

    @Override // xb3.InterfaceC38174i
    public final Iterator iterator() {
        return new C0053t0(this);
    }
}
