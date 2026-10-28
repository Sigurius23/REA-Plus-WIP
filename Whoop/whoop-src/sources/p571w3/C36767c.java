package p571w3;

import p208i2.AbstractC17911t;
import p208i2.C17919x;
import p448r3.AbstractC30895a;

/* JADX INFO: renamed from: w3.c */
/* JADX INFO: loaded from: classes.dex */
public final class C36767c implements InterfaceC36779o {

    /* JADX INFO: renamed from: a */
    public final long f157335a;

    public C36767c(long j7) {
        this.f157335a = j7;
        if (j7 != 16) {
            return;
        }
        AbstractC30895a.m95015a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // p571w3.InterfaceC36779o
    /* JADX INFO: renamed from: a */
    public final float mo117874a() {
        return C17919x.m51543e(this.f157335a);
    }

    @Override // p571w3.InterfaceC36779o
    /* JADX INFO: renamed from: b */
    public final long mo117875b() {
        return this.f157335a;
    }

    @Override // p571w3.InterfaceC36779o
    /* JADX INFO: renamed from: c */
    public final AbstractC17911t mo117876c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C36767c) && C17919x.m51542d(this.f157335a, ((C36767c) obj).f157335a);
    }

    public final int hashCode() {
        int i13 = C17919x.f69638o;
        return Long.hashCode(this.f157335a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) C17919x.m51548j(this.f157335a)) + ')';
    }
}
