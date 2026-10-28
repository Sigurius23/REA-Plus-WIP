package g40;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g40.x3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C15446x3 extends AbstractC15456z3 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC15361h1 f58035a;

    public C15446x3(C15355g1 c15355g1) {
        this.f58035a = c15355g1;
    }

    @Override // g40.AbstractC15456z3, g40.InterfaceC15421s3
    /* JADX INFO: renamed from: b */
    public final boolean mo43600b(boolean z4, boolean z13) {
        return this.f58035a != null;
    }

    @Override // g40.InterfaceC15421s3
    /* JADX INFO: renamed from: c */
    public final boolean mo43601c() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15446x3) && AbstractC22676k.m65745e(this.f58035a, ((C15446x3) obj).f58035a);
    }

    @Override // g40.AbstractC15456z3, g40.InterfaceC15421s3
    /* JADX INFO: renamed from: f */
    public final InterfaceC15361h1 mo43602f() {
        return this.f58035a;
    }

    public final int hashCode() {
        InterfaceC15361h1 interfaceC15361h1 = this.f58035a;
        if (interfaceC15361h1 == null) {
            return 0;
        }
        return interfaceC15361h1.hashCode();
    }

    public final String toString() {
        return "Full(validationMessage=" + this.f58035a + ")";
    }
}
