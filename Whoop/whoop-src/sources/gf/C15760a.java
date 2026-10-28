package gf;

import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: gf.a */
/* JADX INFO: loaded from: classes.dex */
public final class C15760a {

    /* JADX INFO: renamed from: a */
    public final String f59423a;

    public C15760a(String str) {
        this.f59423a = str;
        if (AbstractC39414r.m125890i0(str)) {
            throw new IllegalArgumentException("AttributeKey name must not be blank");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15760a) && AbstractC22676k.m65745e(this.f59423a, ((C15760a) obj).f59423a);
    }

    public final int hashCode() {
        return this.f59423a.hashCode();
    }

    public final String toString() {
        return AbstractC25012a.m73377j(new StringBuilder("AttributeKey("), this.f59423a, ')');
    }
}
