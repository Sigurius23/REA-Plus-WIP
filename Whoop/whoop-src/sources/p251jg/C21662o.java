package p251jg;

import com.squareup.wire.AbstractC5583n;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: jg.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C21662o extends AbstractC5583n {

    /* JADX INFO: renamed from: c */
    public final String f83176c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21662o(String value) {
        super(18);
        AbstractC22676k.m65750j(value, "value");
        this.f83176c = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C21662o) && AbstractC22676k.m65745e(this.f83176c, ((C21662o) obj).f83176c);
    }

    public final int hashCode() {
        return this.f83176c.hashCode();
    }

    @Override // com.squareup.wire.AbstractC5583n
    public final String toString() {
        return AbstractC25012a.m73377j(new StringBuilder("Number(value="), this.f83176c, ')');
    }
}
