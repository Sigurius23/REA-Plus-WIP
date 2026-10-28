package p133f1;

import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p571w3.EnumC36774j;

/* JADX INFO: renamed from: f1.t */
/* JADX INFO: loaded from: classes5.dex */
public final class C13978t {

    /* JADX INFO: renamed from: a */
    public final EnumC36774j f49871a;

    /* JADX INFO: renamed from: b */
    public final int f49872b;

    /* JADX INFO: renamed from: c */
    public final long f49873c;

    public C13978t(EnumC36774j enumC36774j, int i13, long j7) {
        this.f49871a = enumC36774j;
        this.f49872b = i13;
        this.f49873c = j7;
    }

    /* JADX INFO: renamed from: a */
    public final int m39790a() {
        return this.f49872b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13978t)) {
            return false;
        }
        C13978t c13978t = (C13978t) obj;
        return this.f49871a == c13978t.f49871a && this.f49872b == c13978t.f49872b && this.f49873c == c13978t.f49873c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f49873c) + AbstractC11266d.m30448b(this.f49872b, this.f49871a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("AnchorInfo(direction=");
        sb4.append(this.f49871a);
        sb4.append(", offset=");
        sb4.append(this.f49872b);
        sb4.append(", selectableId=");
        return AbstractC2875y.m8302o(sb4, this.f49873c, ')');
    }
}
