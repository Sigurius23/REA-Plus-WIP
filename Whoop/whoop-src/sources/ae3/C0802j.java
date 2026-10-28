package ae3;

import androidx.room.AbstractC1772c1;
import ne3.C26621j0;
import ne3.InterfaceC26620j;
import ud3.AbstractC34799a1;
import ud3.C34818h0;
import yb3.C39412p;

/* JADX INFO: renamed from: ae3.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C0802j extends AbstractC34799a1 {

    /* JADX INFO: renamed from: E */
    public final C26621j0 f2960E;

    /* JADX INFO: renamed from: y */
    public final String f2961y;

    /* JADX INFO: renamed from: z */
    public final long f2962z;

    public C0802j(String str, long j7, C26621j0 c26621j0) {
        this.f2961y = str;
        this.f2962z = j7;
        this.f2960E = c26621j0;
    }

    @Override // ud3.AbstractC34799a1
    /* JADX INFO: renamed from: d1 */
    public final InterfaceC26620j mo1940d1() {
        return this.f2960E;
    }

    @Override // ud3.AbstractC34799a1
    /* JADX INFO: renamed from: i */
    public final long mo1941i() {
        return this.f2962z;
    }

    @Override // ud3.AbstractC34799a1
    /* JADX INFO: renamed from: k */
    public final C34818h0 mo1942k() {
        String str = this.f2961y;
        if (str == null) {
            return null;
        }
        C39412p c39412p = C34818h0.f146589e;
        return AbstractC1772c1.m5373J(str);
    }
}
