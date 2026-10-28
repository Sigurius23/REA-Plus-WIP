package p141f9;

import java.util.Objects;

/* JADX INFO: renamed from: f9.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C14260b {

    /* JADX INFO: renamed from: a */
    public final String f52058a;

    /* JADX INFO: renamed from: b */
    public final String f52059b;

    /* JADX INFO: renamed from: c */
    public final int f52060c;

    /* JADX INFO: renamed from: d */
    public final int f52061d;

    public C14260b(String str, String str2, int i13, int i14) {
        this.f52058a = str;
        this.f52059b = str2;
        this.f52060c = i13;
        this.f52061d = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14260b)) {
            return false;
        }
        C14260b c14260b = (C14260b) obj;
        return this.f52060c == c14260b.f52060c && this.f52061d == c14260b.f52061d && Objects.equals(this.f52058a, c14260b.f52058a) && Objects.equals(this.f52059b, c14260b.f52059b);
    }

    public final int hashCode() {
        return Objects.hash(this.f52058a, this.f52059b, Integer.valueOf(this.f52060c), Integer.valueOf(this.f52061d));
    }
}
