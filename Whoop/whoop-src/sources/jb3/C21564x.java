package jb3;

import hc3.AbstractC17176i;
import java.util.List;
import m83.C25271y;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: jb3.x */
/* JADX INFO: loaded from: classes5.dex */
public final class C21564x {

    /* JADX INFO: renamed from: a */
    public final boolean f82702a;

    /* JADX INFO: renamed from: b */
    public final List f82703b = C25271y.f99162w;

    public C21564x(boolean z4) {
        this.f82702a = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21564x)) {
            return false;
        }
        C21564x c21564x = (C21564x) obj;
        return this.f82702a == c21564x.f82702a && AbstractC22676k.m65745e(this.f82703b, c21564x.f82703b);
    }

    public final int hashCode() {
        return this.f82703b.hashCode() + (Boolean.hashCode(this.f82702a) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("PreReleaseInfo(isInvisible=");
        sb4.append(this.f82702a);
        sb4.append(", poisoningFeatures=");
        return AbstractC17176i.m48506h(sb4, this.f82703b, ')');
    }
}
