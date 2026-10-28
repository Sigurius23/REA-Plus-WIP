package p384ow;

/* JADX INFO: renamed from: ow.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C28413i {

    /* JADX INFO: renamed from: d */
    public static final C28413i f114605d = new C28413i("", "", false);

    /* JADX INFO: renamed from: a */
    public final String f114606a;

    /* JADX INFO: renamed from: b */
    public final String f114607b;

    /* JADX INFO: renamed from: c */
    public final boolean f114608c;

    static {
        new C28413i("\n", "  ", true);
    }

    public C28413i(String str, String str2, boolean z4) {
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f114606a = str;
        this.f114607b = str2;
        this.f114608c = z4;
    }
}
