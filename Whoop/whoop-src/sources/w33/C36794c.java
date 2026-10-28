package w33;

import io.getstream.video.android.core.filter.FilterObject;
import java.util.Set;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: w33.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C36794c extends FilterObject {

    /* JADX INFO: renamed from: a */
    public final String f157409a;

    /* JADX INFO: renamed from: b */
    public final Set f157410b;

    public C36794c(Set set) {
        super(null);
        this.f157409a = "cid";
        this.f157410b = set;
    }

    @Override // io.getstream.video.android.core.filter.FilterObject
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36794c)) {
            return false;
        }
        C36794c c36794c = (C36794c) obj;
        return AbstractC22676k.m65745e(this.f157409a, c36794c.f157409a) && AbstractC22676k.m65745e(this.f157410b, c36794c.f157410b);
    }

    @Override // io.getstream.video.android.core.filter.FilterObject
    public final int hashCode() {
        return this.f157410b.hashCode() + (this.f157409a.hashCode() * 31);
    }

    public final String toString() {
        return "InFilterObject(fieldName=" + this.f157409a + ", values=" + this.f157410b + ")";
    }
}
