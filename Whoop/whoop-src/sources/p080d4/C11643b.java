package p080d4;

/* JADX INFO: renamed from: d4.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C11643b extends Throwable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f37607w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11643b(String str, int i13) {
        super(str);
        this.f37607w = i13;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        int i13 = this.f37607w;
        synchronized (this) {
            switch (i13) {
                case 0:
                    break;
                case 1:
                    break;
                default:
                    break;
            }
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11643b() {
        super("Failure occurred while trying to finish a future.");
        this.f37607w = 0;
    }
}
