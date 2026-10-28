package p251jg;

import com.squareup.wire.AbstractC5583n;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: jg.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C21663p extends AbstractC5583n {

    /* JADX INFO: renamed from: c */
    public final String f83177c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21663p(String value) {
        super(18);
        AbstractC22676k.m65750j(value, "value");
        this.f83177c = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C21663p) && AbstractC22676k.m65745e(this.f83177c, ((C21663p) obj).f83177c);
    }

    public final int hashCode() {
        return this.f83177c.hashCode();
    }

    @Override // com.squareup.wire.AbstractC5583n
    public final String toString() {
        return AbstractC25012a.m73377j(new StringBuilder("String(value="), this.f83177c, ')');
    }
}
