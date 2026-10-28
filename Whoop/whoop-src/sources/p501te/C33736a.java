package p501te;

import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: te.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C33736a {

    /* JADX INFO: renamed from: a */
    public final String f141116a;

    /* JADX INFO: renamed from: b */
    public final String f141117b;

    public C33736a(String value) {
        AbstractC22676k.m65750j(value, "value");
        this.f141116a = value;
        this.f141117b = "Early retry termination: ".concat(value);
    }

    /* JADX INFO: renamed from: a */
    public final String m106618a() {
        return this.f141117b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C33736a.class == obj.getClass() && AbstractC22676k.m65745e(this.f141116a, ((C33736a) obj).f141116a);
    }

    public final int hashCode() {
        return this.f141116a.hashCode() - 1056431119;
    }

    public final String toString() {
        return AbstractC25012a.m73376i(this.f141116a, "')", new StringBuilder("ClientErrorContext(key='Early retry termination', value='"));
    }
}
