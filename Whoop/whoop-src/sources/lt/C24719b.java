package lt;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: lt.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C24719b {

    /* JADX INFO: renamed from: a */
    public final String f96698a;

    /* JADX INFO: renamed from: b */
    public final Map f96699b;

    public C24719b(String str, Map map) {
        this.f96698a = str;
        this.f96699b = map;
    }

    /* JADX INFO: renamed from: a */
    public static C24719b m72379a(String str) {
        return new C24719b(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24719b)) {
            return false;
        }
        C24719b c24719b = (C24719b) obj;
        return this.f96698a.equals(c24719b.f96698a) && this.f96699b.equals(c24719b.f96699b);
    }

    public final int hashCode() {
        return this.f96699b.hashCode() + (this.f96698a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f96698a + ", properties=" + this.f96699b.values() + "}";
    }
}
