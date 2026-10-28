package cf;

/* JADX INFO: renamed from: cf.c */
/* JADX INFO: loaded from: classes.dex */
public final class C4528c extends AbstractC4530e {

    /* JADX INFO: renamed from: d */
    public static final C4528c f18258d = new C4528c(0, 0);

    /* JADX INFO: renamed from: e */
    public static final C4528c f18259e = new C4528c(4, 1);

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f18260c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4528c(int i13, int i14) {
        super(i13);
        this.f18260c = i14;
    }

    @Override // cf.AbstractC4530e
    public final String toString() {
        switch (this.f18260c) {
            case 0:
                return "Default";
            default:
                return "LogResponse";
        }
    }
}
