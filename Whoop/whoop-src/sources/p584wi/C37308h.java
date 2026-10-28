package p584wi;

/* JADX INFO: renamed from: wi.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C37308h {

    /* JADX INFO: renamed from: a */
    public final String f159522a;

    /* JADX INFO: renamed from: b */
    public final float f159523b;

    /* JADX INFO: renamed from: c */
    public final float f159524c;

    public C37308h(String str, float f13, float f14) {
        this.f159522a = str;
        this.f159524c = f14;
        this.f159523b = f13;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m119485a(String str) {
        String str2 = this.f159522a;
        if (str2.equalsIgnoreCase(str)) {
            return true;
        }
        return str2.endsWith("\r") && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str);
    }
}
