package gw;

/* JADX INFO: renamed from: gw.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C16255f extends C16250a {

    /* JADX INFO: renamed from: y */
    public final int f61803y;

    /* JADX INFO: renamed from: z */
    public static final C16255f f61802z = new C16255f("A128CBC-HS256", 256);

    /* JADX INFO: renamed from: E */
    public static final C16255f f61794E = new C16255f("A192CBC-HS384", 384);

    /* JADX INFO: renamed from: F */
    public static final C16255f f61795F = new C16255f("A256CBC-HS512", 512);

    /* JADX INFO: renamed from: G */
    public static final C16255f f61796G = new C16255f("A128CBC+HS256", 256);

    /* JADX INFO: renamed from: H */
    public static final C16255f f61797H = new C16255f("A256CBC+HS512", 512);

    /* JADX INFO: renamed from: I */
    public static final C16255f f61798I = new C16255f("A128GCM", 128);

    /* JADX INFO: renamed from: J */
    public static final C16255f f61799J = new C16255f("A192GCM", 192);

    /* JADX INFO: renamed from: K */
    public static final C16255f f61800K = new C16255f("A256GCM", 256);

    /* JADX INFO: renamed from: L */
    public static final C16255f f61801L = new C16255f("XC20P", 256);

    public C16255f(String str, int i13) {
        super(str);
        this.f61803y = i13;
    }
}
