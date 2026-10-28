package p251jg;

import com.squareup.wire.AbstractC5583n;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: jg.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C21660m extends AbstractC5583n {

    /* JADX INFO: renamed from: c */
    public final String f83174c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21660m(String value) {
        super(18);
        AbstractC22676k.m65750j(value, "value");
        this.f83174c = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C21660m) && AbstractC22676k.m65745e(this.f83174c, ((C21660m) obj).f83174c);
    }

    public final int hashCode() {
        return this.f83174c.hashCode();
    }

    @Override // com.squareup.wire.AbstractC5583n
    public final String toString() {
        return AbstractC25012a.m73377j(new StringBuilder("Name(value="), this.f83174c, ')');
    }
}
