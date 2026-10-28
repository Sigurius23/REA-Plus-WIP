package vg;

import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: vg.j */
/* JADX INFO: loaded from: classes.dex */
public final class C35963j {

    /* JADX INFO: renamed from: a */
    public final EnumC35964k f153133a;

    /* JADX INFO: renamed from: b */
    public final String f153134b;

    public C35963j(EnumC35964k enumC35964k, String str) {
        this.f153133a = enumC35964k;
        this.f153134b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35963j)) {
            return false;
        }
        C35963j c35963j = (C35963j) obj;
        return this.f153133a == c35963j.f153133a && AbstractC22676k.m65745e(this.f153134b, c35963j.f153134b);
    }

    public final int hashCode() {
        int iHashCode = this.f153133a.hashCode() * 31;
        String str = this.f153134b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("OperatingSystem(family=");
        sb4.append(this.f153133a);
        sb4.append(", version=");
        return AbstractC25012a.m73377j(sb4, this.f153134b, ')');
    }
}
