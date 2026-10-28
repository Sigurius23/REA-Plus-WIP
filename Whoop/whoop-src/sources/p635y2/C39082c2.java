package p635y2;

/* JADX INFO: renamed from: y2.c2 */
/* JADX INFO: loaded from: classes.dex */
public final class C39082c2 implements InterfaceC39078b2 {

    /* JADX INFO: renamed from: b */
    public final String f168137b;

    /* JADX INFO: renamed from: c */
    public final C39120p f168138c;

    /* JADX INFO: renamed from: d */
    public final C39120p f168139d;

    public C39082c2(String str) {
        this.f168137b = str;
        this.f168138c = new C39120p(str);
        this.f168139d = new C39120p(str.concat(" maximum"));
    }

    public final String toString() {
        return this.f168137b;
    }
}
