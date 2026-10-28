package ai;

import java.util.Map;
import p000.AbstractC30802r;
import p715kotlin.jvm.internal.AbstractC22676k;
import x43.AbstractC37978j;

/* JADX INFO: renamed from: ai.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C0896b {

    /* JADX INFO: renamed from: a */
    public final String f3282a;

    /* JADX INFO: renamed from: b */
    public final Map f3283b;

    public C0896b(String str, Map map) {
        this.f3282a = str;
        this.f3283b = AbstractC37978j.m121638W(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0896b)) {
            return false;
        }
        C0896b c0896b = (C0896b) obj;
        return AbstractC22676k.m65745e(this.f3282a, c0896b.f3282a) && AbstractC22676k.m65745e(this.f3283b, c0896b.f3283b);
    }

    public final int hashCode() {
        return this.f3283b.hashCode() + (this.f3282a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Key(key=");
        sb4.append(this.f3282a);
        sb4.append(", extras=");
        return AbstractC30802r.m94764m(sb4, this.f3283b, ')');
    }
}
