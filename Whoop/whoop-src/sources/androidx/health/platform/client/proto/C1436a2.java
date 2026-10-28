package androidx.health.platform.client.proto;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.a2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1436a2 {

    /* JADX INFO: renamed from: a */
    public final AbstractC1433a f6014a;

    /* JADX INFO: renamed from: b */
    public final String f6015b;

    /* JADX INFO: renamed from: c */
    public final Object[] f6016c;

    /* JADX INFO: renamed from: d */
    public final int f6017d;

    public C1436a2(AbstractC1433a abstractC1433a, String str, Object[] objArr) {
        this.f6014a = abstractC1433a;
        this.f6015b = str;
        this.f6016c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f6017d = cCharAt;
            return;
        }
        int i13 = cCharAt & 8191;
        int i14 = 13;
        int i15 = 1;
        while (true) {
            int i16 = i15 + 1;
            char cCharAt2 = str.charAt(i15);
            if (cCharAt2 < 55296) {
                this.f6017d = i13 | (cCharAt2 << i14);
                return;
            } else {
                i13 |= (cCharAt2 & 8191) << i14;
                i14 += 13;
                i15 = i16;
            }
        }
    }
}
