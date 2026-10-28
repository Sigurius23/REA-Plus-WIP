package a00;

import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a00.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C0068c implements InterfaceC0069d {

    /* JADX INFO: renamed from: a */
    public final InterfaceC41211c f207a;

    public C0068c(InterfaceC41211c error) {
        AbstractC22676k.m65750j(error, "error");
        this.f207a = error;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0068c) && AbstractC22676k.m65745e(this.f207a, ((C0068c) obj).f207a);
    }

    public final int hashCode() {
        return this.f207a.hashCode();
    }

    public final String toString() {
        return "Failed(error=" + this.f207a + ")";
    }
}
