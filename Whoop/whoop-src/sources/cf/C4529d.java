package cf;

/* JADX INFO: renamed from: cf.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C4529d extends AbstractC4530e {

    /* JADX INFO: renamed from: d */
    public static final C4529d f18261d = new C4529d(1, 0);

    /* JADX INFO: renamed from: e */
    public static final C4529d f18262e = new C4529d(3, 1);

    /* JADX INFO: renamed from: f */
    public static final C4529d f18263f = new C4529d(12, 2);

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f18264c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4529d(int i13, int i14) {
        super(i13);
        this.f18264c = i14;
    }

    @Override // cf.AbstractC4530e
    public String toString() {
        switch (this.f18264c) {
            case 0:
                return "LogRequest";
            case 1:
                return "LogRequestWithBody";
            case 2:
                return "LogResponseWithBody";
            default:
                return super.toString();
        }
    }
}
