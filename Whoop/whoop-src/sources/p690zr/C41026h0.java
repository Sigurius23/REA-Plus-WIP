package p690zr;

/* JADX INFO: renamed from: zr.h0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C41026h0 {

    /* JADX INFO: renamed from: a */
    public final Object f176999a;

    /* JADX INFO: renamed from: b */
    public final Object f177000b;

    /* JADX INFO: renamed from: c */
    public final Object f177001c;

    public C41026h0(Object obj, Object obj2, Object obj3) {
        this.f176999a = obj;
        this.f177000b = obj2;
        this.f177001c = obj3;
    }

    /* JADX INFO: renamed from: a */
    public final IllegalArgumentException m133260a() {
        StringBuilder sb4 = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f176999a;
        sb4.append(obj);
        sb4.append("=");
        sb4.append(this.f177000b);
        sb4.append(" and ");
        sb4.append(obj);
        sb4.append("=");
        sb4.append(this.f177001c);
        return new IllegalArgumentException(sb4.toString());
    }
}
