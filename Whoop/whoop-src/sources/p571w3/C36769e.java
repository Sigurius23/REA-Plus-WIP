package p571w3;

/* JADX INFO: renamed from: w3.e */
/* JADX INFO: loaded from: classes.dex */
public final class C36769e {

    /* JADX INFO: renamed from: b */
    public static final int f157337b = 66305;

    /* JADX INFO: renamed from: a */
    public final int f157338a;

    /* JADX INFO: renamed from: a */
    public static String m117878a(int i13) {
        String str;
        String str2;
        StringBuilder sb4 = new StringBuilder("LineBreak(strategy=");
        int i14 = i13 & 255;
        String str3 = "Invalid";
        if (i14 == 1) {
            str = "Strategy.Simple";
        } else if (i14 == 2) {
            str = "Strategy.HighQuality";
        } else if (i14 == 3) {
            str = "Strategy.Balanced";
        } else {
            str = i14 == 0 ? "Strategy.Unspecified" : "Invalid";
        }
        sb4.append((Object) str);
        sb4.append(", strictness=");
        int i15 = (i13 >> 8) & 255;
        if (i15 == 1) {
            str2 = "Strictness.None";
        } else if (i15 == 2) {
            str2 = "Strictness.Loose";
        } else if (i15 == 3) {
            str2 = "Strictness.Normal";
        } else if (i15 == 4) {
            str2 = "Strictness.Strict";
        } else {
            str2 = i15 == 0 ? "Strictness.Unspecified" : "Invalid";
        }
        sb4.append((Object) str2);
        sb4.append(", wordBreak=");
        int i16 = (i13 >> 16) & 255;
        if (i16 == 1) {
            str3 = "WordBreak.None";
        } else if (i16 == 2) {
            str3 = "WordBreak.Phrase";
        } else if (i16 == 0) {
            str3 = "WordBreak.Unspecified";
        }
        sb4.append((Object) str3);
        sb4.append(')');
        return sb4.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C36769e) {
            return this.f157338a == ((C36769e) obj).f157338a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f157338a);
    }

    public final String toString() {
        return m117878a(this.f157338a);
    }
}
