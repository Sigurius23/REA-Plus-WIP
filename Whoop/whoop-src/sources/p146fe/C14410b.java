package p146fe;

import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: fe.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C14410b {

    /* JADX INFO: renamed from: a */
    public final String f52561a;

    /* JADX INFO: renamed from: b */
    public final String f52562b;

    /* JADX INFO: renamed from: c */
    public final String f52563c;

    /* JADX INFO: renamed from: d */
    public final Boolean f52564d;

    /* JADX INFO: renamed from: e */
    public final Boolean f52565e;

    /* JADX INFO: renamed from: f */
    public final String f52566f;

    public C14410b(String str, String str2, String str3, Boolean bool, Boolean bool2, String str4) {
        this.f52561a = str;
        this.f52562b = str2;
        this.f52563c = str3;
        this.f52564d = bool;
        this.f52565e = bool2;
        this.f52566f = str4;
    }

    /* JADX INFO: renamed from: a */
    public final String m41050a() {
        return this.f52562b;
    }

    /* JADX INFO: renamed from: b */
    public final String m41051b() {
        return this.f52563c;
    }

    /* JADX INFO: renamed from: c */
    public final Boolean m41052c() {
        return this.f52565e;
    }

    /* JADX INFO: renamed from: d */
    public final Boolean m41053d() {
        return this.f52564d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14410b)) {
            return false;
        }
        C14410b c14410b = (C14410b) obj;
        return AbstractC22676k.m65745e(this.f52561a, c14410b.f52561a) && AbstractC22676k.m65745e(this.f52562b, c14410b.f52562b) && AbstractC22676k.m65745e(this.f52563c, c14410b.f52563c) && AbstractC22676k.m65745e(this.f52564d, c14410b.f52564d) && AbstractC22676k.m65745e(this.f52565e, c14410b.f52565e) && AbstractC22676k.m65745e(this.f52566f, c14410b.f52566f);
    }

    public final int hashCode() {
        String str = this.f52561a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f52562b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f52563c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f52564d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f52565e;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str4 = this.f52566f;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("PartitionConfig(name=");
        sb4.append(this.f52561a);
        sb4.append(", dnsSuffix=");
        sb4.append(this.f52562b);
        sb4.append(", dualStackDnsSuffix=");
        sb4.append(this.f52563c);
        sb4.append(", supportsFIPS=");
        sb4.append(this.f52564d);
        sb4.append(", supportsDualStack=");
        sb4.append(this.f52565e);
        sb4.append(", implicitGlobalRegion=");
        return AbstractC25012a.m73377j(sb4, this.f52566f, ')');
    }

    public /* synthetic */ C14410b() {
        this(null, null, null, null, null, null);
    }
}
