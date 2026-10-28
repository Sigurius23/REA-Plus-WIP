package p206i0;

/* JADX INFO: renamed from: i0.m */
/* JADX INFO: loaded from: classes5.dex */
public final class C17835m implements InterfaceC17836n {

    /* JADX INFO: renamed from: b */
    public static final C17835m f69347b = new C17835m(0);

    /* JADX INFO: renamed from: c */
    public static final C17835m f69348c = new C17835m(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f69349a;

    public /* synthetic */ C17835m(int i13) {
        this.f69349a = i13;
    }

    @Override // p206i0.InterfaceC17836n
    /* JADX INFO: renamed from: a */
    public final int mo51269a(int i13, int i14, int i15, int i16) {
        switch (this.f69349a) {
            case 0:
                return (((i13 - i15) - i16) / 2) - (i14 / 2);
            default:
                return 0;
        }
    }

    public final String toString() {
        switch (this.f69349a) {
            case 0:
                return "Center";
            default:
                return "Start";
        }
    }
}
