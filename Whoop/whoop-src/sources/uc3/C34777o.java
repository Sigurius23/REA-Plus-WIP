package uc3;

import c93.InterfaceC4339a;
import p715kotlin.jvm.internal.AbstractC22676k;
import r12.C30856a;

/* JADX INFO: renamed from: uc3.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C34777o implements InterfaceC34773k {

    /* JADX INFO: renamed from: a */
    public final C30856a f146447a;

    /* JADX INFO: renamed from: b */
    public final String f146448b;

    public C34777o(C30856a c30856a, String whatThisExpects) {
        AbstractC22676k.m65750j(whatThisExpects, "whatThisExpects");
        this.f146447a = c30856a;
        this.f146448b = whatThisExpects;
    }

    @Override // uc3.InterfaceC34773k
    /* JADX INFO: renamed from: a */
    public final Object mo109777a(InterfaceC34764b interfaceC34764b, String str, int i13) {
        if (i13 >= str.length()) {
            return Integer.valueOf(i13);
        }
        final char cCharAt = str.charAt(i13);
        C30856a c30856a = this.f146447a;
        if (cCharAt == '-') {
            c30856a.invoke(interfaceC34764b, Boolean.TRUE);
            return Integer.valueOf(i13 + 1);
        }
        if (cCharAt != '+') {
            return new C34769g(i13, new InterfaceC4339a() { // from class: uc3.n
                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    return "Expected " + this.f146445w.f146448b + " but got " + cCharAt;
                }
            });
        }
        c30856a.invoke(interfaceC34764b, Boolean.FALSE);
        return Integer.valueOf(i13 + 1);
    }

    public final String toString() {
        return this.f146448b;
    }
}
