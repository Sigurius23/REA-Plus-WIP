package p547v8;

import java.util.Objects;
import p088dc.AbstractC11895b;
import p607x8.AbstractC38065t;

/* JADX INFO: renamed from: v8.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C35787d {

    /* JADX INFO: renamed from: e */
    public static final C35787d f152193e = new C35787d(-1, -1, -1);

    /* JADX INFO: renamed from: a */
    public final int f152194a;

    /* JADX INFO: renamed from: b */
    public final int f152195b;

    /* JADX INFO: renamed from: c */
    public final int f152196c;

    /* JADX INFO: renamed from: d */
    public final int f152197d;

    public C35787d(int i13, int i14, int i15) {
        this.f152194a = i13;
        this.f152195b = i14;
        this.f152196c = i15;
        this.f152197d = AbstractC38065t.m121893G(i15) ? AbstractC38065t.m121925r(i15) * i14 : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35787d)) {
            return false;
        }
        C35787d c35787d = (C35787d) obj;
        return this.f152194a == c35787d.f152194a && this.f152195b == c35787d.f152195b && this.f152196c == c35787d.f152196c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f152194a), Integer.valueOf(this.f152195b), Integer.valueOf(this.f152196c));
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("AudioFormat[sampleRate=");
        sb4.append(this.f152194a);
        sb4.append(", channelCount=");
        sb4.append(this.f152195b);
        sb4.append(", encoding=");
        return AbstractC11895b.m31999r(sb4, this.f152196c, ']');
    }
}
