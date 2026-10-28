package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1211e1 {
    /* JADX INFO: renamed from: a */
    public abstract C1214f1 mo3795a(Object obj);

    /* JADX INFO: renamed from: b */
    public final boolean m3796b(int i13, C1233m c1233m, Object obj) throws InvalidProtocolBufferException {
        int i14 = c1233m.f5428b;
        int i15 = i14 >>> 3;
        int i16 = i14 & 7;
        if (i16 == 0) {
            c1233m.m3912w(0);
            ((C1214f1) obj).m3804c(i15 << 3, Long.valueOf(c1233m.f5427a.mo3847w()));
            return true;
        }
        if (i16 == 1) {
            c1233m.m3912w(1);
            ((C1214f1) obj).m3804c((i15 << 3) | 1, Long.valueOf(c1233m.f5427a.mo3844t()));
            return true;
        }
        if (i16 == 2) {
            ((C1214f1) obj).m3804c((i15 << 3) | 2, c1233m.m3894e());
            return true;
        }
        if (i16 != 3) {
            if (i16 == 4) {
                return false;
            }
            if (i16 != 5) {
                throw InvalidProtocolBufferException.m3744b();
            }
            c1233m.m3912w(5);
            ((C1214f1) obj).m3804c(5 | (i15 << 3), Integer.valueOf(c1233m.f5427a.mo3843s()));
            return true;
        }
        C1214f1 c1214f1 = new C1214f1(0, new int[8], new Object[8], true);
        int i17 = i15 << 3;
        int i18 = i17 | 4;
        int i19 = i13 + 1;
        if (i19 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (c1233m.m3890a() != Integer.MAX_VALUE && m3796b(i19, c1233m, c1214f1)) {
        }
        if (i18 != c1233m.f5428b) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        if (c1214f1.f5395e) {
            c1214f1.f5395e = false;
        }
        ((C1214f1) obj).m3804c(i17 | 3, c1214f1);
        return true;
    }
}
