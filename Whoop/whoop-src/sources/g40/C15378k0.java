package g40;

import java.util.Comparator;
import p715kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: g40.k0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C15378k0 implements Comparator {

    /* JADX INFO: renamed from: w */
    public static final C15378k0 f57812w = new C15378k0();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i13;
        InterfaceC15361h1 interfaceC15361h1 = (InterfaceC15361h1) obj;
        InterfaceC15361h1 interfaceC15361h2 = (InterfaceC15361h1) obj2;
        int i14 = 2;
        if (interfaceC15361h1 instanceof C15349f1) {
            i13 = 0;
        } else if (interfaceC15361h1 instanceof C15355g1) {
            i13 = 1;
        } else {
            if (interfaceC15361h1 != null) {
                throw new NoWhenBranchMatchedException();
            }
            i13 = 2;
        }
        if (interfaceC15361h2 instanceof C15349f1) {
            i14 = 0;
        } else if (interfaceC15361h2 instanceof C15355g1) {
            i14 = 1;
        } else if (interfaceC15361h2 != null) {
            throw new NoWhenBranchMatchedException();
        }
        return i13 - i14;
    }
}
