package ud3;

import androidx.room.AbstractC1772c1;
import ne3.AbstractC26604b;
import ne3.C26621j0;
import ne3.InterfaceC26620j;
import ne3.InterfaceC26633p0;
import sh.C32476b;
import wd3.AbstractC37172f;
import xd3.C38221d;
import yb3.C39412p;

/* JADX INFO: renamed from: ud3.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C34806d extends AbstractC34799a1 {

    /* JADX INFO: renamed from: E */
    public final String f146543E;

    /* JADX INFO: renamed from: F */
    public final C26621j0 f146544F;

    /* JADX INFO: renamed from: y */
    public final C38221d f146545y;

    /* JADX INFO: renamed from: z */
    public final String f146546z;

    public C34806d(C38221d c38221d, String str, String str2) {
        this.f146545y = c38221d;
        this.f146546z = str;
        this.f146543E = str2;
        this.f146544F = AbstractC26604b.m79158c(new C32476b((InterfaceC26633p0) c38221d.f163826y.get(1), this));
    }

    @Override // ud3.AbstractC34799a1
    /* JADX INFO: renamed from: d1 */
    public final InterfaceC26620j mo1940d1() {
        return this.f146544F;
    }

    @Override // ud3.AbstractC34799a1
    /* JADX INFO: renamed from: i */
    public final long mo1941i() {
        String str = this.f146543E;
        if (str == null) {
            return -1L;
        }
        byte[] bArr = AbstractC37172f.f158958a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @Override // ud3.AbstractC34799a1
    /* JADX INFO: renamed from: k */
    public final C34818h0 mo1942k() {
        String str = this.f146546z;
        if (str == null) {
            return null;
        }
        C39412p c39412p = C34818h0.f146589e;
        return AbstractC1772c1.m5373J(str);
    }
}
