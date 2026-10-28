package androidx.glance.appwidget.protobuf;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.a1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1369a1 {

    /* JADX INFO: renamed from: a */
    public final AbstractC1367a f5863a;

    /* JADX INFO: renamed from: b */
    public final String f5864b;

    /* JADX INFO: renamed from: c */
    public final Object[] f5865c;

    /* JADX INFO: renamed from: d */
    public final int f5866d;

    public C1369a1(AbstractC1367a abstractC1367a, String str, Object[] objArr) {
        this.f5863a = abstractC1367a;
        this.f5864b = str;
        this.f5865c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f5866d = cCharAt;
            return;
        }
        int i13 = cCharAt & 8191;
        int i14 = 13;
        int i15 = 1;
        while (true) {
            int i16 = i15 + 1;
            char cCharAt2 = str.charAt(i15);
            if (cCharAt2 < 55296) {
                this.f5866d = i13 | (cCharAt2 << i14);
                return;
            } else {
                i13 |= (cCharAt2 & 8191) << i14;
                i14 += 13;
                i15 = i16;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m4281a() {
        int i13 = this.f5866d;
        if ((i13 & 1) != 0) {
            return 1;
        }
        return (i13 & 4) == 4 ? 3 : 2;
    }
}
