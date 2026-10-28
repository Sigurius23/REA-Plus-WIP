package p251jg;

import com.squareup.wire.AbstractC5583n;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: jg.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C21656i extends AbstractC5583n {

    /* JADX INFO: renamed from: c */
    public final boolean f83170c;

    public C21656i(boolean z4) {
        super(18);
        this.f83170c = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C21656i) && this.f83170c == ((C21656i) obj).f83170c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f83170c);
    }

    @Override // com.squareup.wire.AbstractC5583n
    public final String toString() {
        return AbstractC2875y.m8305r(new StringBuilder("Bool(value="), this.f83170c, ')');
    }
}
