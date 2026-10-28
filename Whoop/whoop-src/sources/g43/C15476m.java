package g43;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;

/* JADX INFO: renamed from: g43.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C15476m {

    /* JADX INFO: renamed from: a */
    public final String f58128a;

    /* JADX INFO: renamed from: b */
    public final String f58129b;

    /* JADX INFO: renamed from: c */
    public final String f58130c;

    /* JADX INFO: renamed from: d */
    public final int f58131d;

    public C15476m(int i13, String str, String str2, String str3) {
        this.f58128a = str;
        this.f58129b = str2;
        this.f58130c = str3;
        this.f58131d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15476m)) {
            return false;
        }
        C15476m c15476m = (C15476m) obj;
        return this.f58128a.equals(c15476m.f58128a) && this.f58129b.equals(c15476m.f58129b) && this.f58130c.equals(c15476m.f58130c) && this.f58131d == c15476m.f58131d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f58131d) + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.f58128a.hashCode() * 31, 31, this.f58129b), 31, this.f58130c);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("StreamNotificationChannelInfo(id=", this.f58128a, ", name=", this.f58129b, ", description=");
        sbM32001t.append(this.f58130c);
        sbM32001t.append(", importance=");
        sbM32001t.append(this.f58131d);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
