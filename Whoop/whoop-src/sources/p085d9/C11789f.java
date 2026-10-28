package p085d9;

/* JADX INFO: renamed from: d9.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C11789f {

    /* JADX INFO: renamed from: a */
    public boolean f38230a;

    /* JADX INFO: renamed from: b */
    public boolean f38231b;

    /* JADX INFO: renamed from: c */
    public boolean f38232c;

    /* JADX INFO: renamed from: a */
    public C11790g m31608a() {
        if (this.f38230a || !(this.f38231b || this.f38232c)) {
            return new C11790g(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }

    /* JADX INFO: renamed from: b */
    public boolean m31609b() {
        return (this.f38232c || this.f38231b) && this.f38230a;
    }
}
