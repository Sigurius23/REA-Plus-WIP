package sa3;

import p410q1.AbstractC29771j0;
import wa3.InterfaceC37014q;

/* JADX INFO: renamed from: sa3.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C32329c extends AbstractC29771j0 {

    /* JADX INFO: renamed from: d */
    public final InterfaceC37014q[] f133784d;

    /* JADX WARN: Illegal instructions before constructor call */
    public C32329c(int i13, InterfaceC37014q[] interfaceC37014qArr) {
        if (interfaceC37014qArr == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter 'enumEntries' of kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField.bitWidth must not be null");
        }
        int i14 = 1;
        int length = interfaceC37014qArr.length - 1;
        if (length != 0) {
            for (int i15 = 31; i15 >= 0; i15--) {
                if (((1 << i15) & length) != 0) {
                    i14 = 1 + i15;
                }
            }
            throw new IllegalStateException("Empty enum: " + interfaceC37014qArr.getClass());
        }
        super(i13, i14, 1, (byte) 0);
        this.f133784d = interfaceC37014qArr;
    }

    @Override // p410q1.AbstractC29771j0
    /* JADX INFO: renamed from: e */
    public final Object mo91233e(int i13) {
        int i14 = (1 << this.f121777c) - 1;
        int i15 = this.f121776b;
        int i16 = (i13 & (i14 << i15)) >> i15;
        for (InterfaceC37014q interfaceC37014q : this.f133784d) {
            if (interfaceC37014q.mo92274a() == i16) {
                return interfaceC37014q;
            }
        }
        return null;
    }
}
