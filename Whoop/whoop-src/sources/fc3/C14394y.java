package fc3;

import ec3.C13096w1;
import ec3.InterfaceC13037f2;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: fc3.y */
/* JADX INFO: loaded from: classes5.dex */
public final class C14394y extends C13096w1 implements InterfaceC13037f2 {
    @Override // ec3.InterfaceC13037f2
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.f45253H;
            AbstractC22676k.m65747g(objArr);
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.f45254I + ((long) ((int) ((m36623o() + ((long) this.f45256K)) - this.f45254I)))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }

    /* JADX INFO: renamed from: v */
    public final void m41043v(int i13) {
        synchronized (this) {
            Object[] objArr = this.f45253H;
            AbstractC22676k.m65747g(objArr);
            mo36564a(Integer.valueOf(((Number) objArr[((int) ((this.f45254I + ((long) ((int) ((m36623o() + ((long) this.f45256K)) - this.f45254I)))) - 1)) & (objArr.length - 1)]).intValue() + i13));
        }
    }
}
