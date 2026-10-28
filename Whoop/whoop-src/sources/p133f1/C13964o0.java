package p133f1;

import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p181h2.C16617b;
import p510u0.EnumC34315f0;

/* JADX INFO: renamed from: f1.o0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13964o0 {

    /* JADX INFO: renamed from: a */
    public final EnumC34315f0 f49783a;

    /* JADX INFO: renamed from: b */
    public final long f49784b;

    /* JADX INFO: renamed from: c */
    public final EnumC13961n0 f49785c;

    /* JADX INFO: renamed from: d */
    public final boolean f49786d;

    public C13964o0(EnumC34315f0 enumC34315f0, long j7, EnumC13961n0 enumC13961n0, boolean z4) {
        this.f49783a = enumC34315f0;
        this.f49784b = j7;
        this.f49785c = enumC13961n0;
        this.f49786d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13964o0)) {
            return false;
        }
        C13964o0 c13964o0 = (C13964o0) obj;
        return this.f49783a == c13964o0.f49783a && C16617b.m47187c(this.f49784b, c13964o0.f49784b) && this.f49785c == c13964o0.f49785c && this.f49786d == c13964o0.f49786d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f49786d) + ((this.f49785c.hashCode() + AbstractC11266d.m30451e(this.f49783a.hashCode() * 31, this.f49784b, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("SelectionHandleInfo(handle=");
        sb4.append(this.f49783a);
        sb4.append(", position=");
        sb4.append((Object) C16617b.m47194j(this.f49784b));
        sb4.append(", anchor=");
        sb4.append(this.f49785c);
        sb4.append(", visible=");
        return AbstractC2875y.m8305r(sb4, this.f49786d, ')');
    }
}
