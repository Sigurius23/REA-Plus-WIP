package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1268y0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC1197a f5510a;

    /* JADX INFO: renamed from: b */
    public final String f5511b;

    /* JADX INFO: renamed from: c */
    public final Object[] f5512c;

    /* JADX INFO: renamed from: d */
    public final int f5513d;

    public C1268y0(AbstractC1269z abstractC1269z, String str, Object[] objArr) {
        this.f5510a = abstractC1269z;
        this.f5511b = str;
        this.f5512c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f5513d = cCharAt;
            return;
        }
        int i13 = cCharAt & 8191;
        int i14 = 13;
        int i15 = 1;
        while (true) {
            int i16 = i15 + 1;
            char cCharAt2 = str.charAt(i15);
            if (cCharAt2 < 55296) {
                this.f5513d = i13 | (cCharAt2 << i14);
                return;
            } else {
                i13 |= (cCharAt2 & 8191) << i14;
                i14 += 13;
                i15 = i16;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m4019a() {
        int i13 = this.f5513d;
        if ((i13 & 1) != 0) {
            return 1;
        }
        return (i13 & 4) == 4 ? 3 : 2;
    }
}
