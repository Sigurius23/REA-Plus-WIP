package p219ig;

import p194hg.InterfaceC17243d;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ig.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C18460e implements InterfaceC17243d {

    /* JADX INFO: renamed from: a */
    public final String f71885a;

    /* JADX INFO: renamed from: b */
    public final String f71886b;

    public C18460e(String str, String str2) {
        this.f71885a = str;
        this.f71886b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18460e)) {
            return false;
        }
        C18460e c18460e = (C18460e) obj;
        return AbstractC22676k.m65745e(this.f71885a, c18460e.f71885a) && AbstractC22676k.m65745e(this.f71886b, c18460e.f71886b);
    }

    public final int hashCode() {
        return this.f71886b.hashCode() + (this.f71885a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("QueryLiteral(key=");
        sb4.append(this.f71885a);
        sb4.append(", value=");
        return AbstractC25012a.m73377j(sb4, this.f71886b, ')');
    }
}
