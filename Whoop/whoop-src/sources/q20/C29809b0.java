package q20;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: q20.b0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C29809b0 extends AbstractC29815e0 {

    /* JADX INFO: renamed from: b */
    public final C29813d0 f121865b;

    public C29809b0(C29813d0 c29813d0) {
        super(c29813d0);
        this.f121865b = c29813d0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29809b0) && AbstractC22676k.m65745e(this.f121865b, ((C29809b0) obj).f121865b);
    }

    public final int hashCode() {
        C29813d0 c29813d0 = this.f121865b;
        if (c29813d0 == null) {
            return 0;
        }
        return c29813d0.f121871a.hashCode();
    }

    public final String toString() {
        return "Reset(message=" + this.f121865b + ")";
    }
}
