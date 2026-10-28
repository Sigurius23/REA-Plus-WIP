package h00;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import se.AbstractC32417h;

/* JADX INFO: renamed from: h00.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C16524r extends AbstractC32417h {

    /* JADX INFO: renamed from: a */
    public final String f63524a;

    public C16524r(String email) {
        AbstractC22676k.m65750j(email, "email");
        this.f63524a = email;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16524r) && AbstractC22676k.m65745e(this.f63524a, ((C16524r) obj).f63524a);
    }

    public final int hashCode() {
        return this.f63524a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("Email(email=", this.f63524a, ")");
    }
}
