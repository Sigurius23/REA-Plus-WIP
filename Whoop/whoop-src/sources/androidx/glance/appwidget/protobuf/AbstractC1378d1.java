package androidx.glance.appwidget.protobuf;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.d1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1378d1 {
    /* JADX INFO: renamed from: a */
    public abstract C1381e1 mo4324a(Object obj);

    /* JADX INFO: renamed from: b */
    public final boolean m4325b(int i13, C1403m c1403m, Object obj) throws InvalidProtocolBufferException {
        int i14 = c1403m.f5938b;
        int i15 = i14 >>> 3;
        int i16 = i14 & 7;
        if (i16 == 0) {
            c1403m.m4463v(0);
            ((C1381e1) obj).m4331d(i15 << 3, Long.valueOf(c1403m.f5937a.mo4356A()));
            return true;
        }
        if (i16 == 1) {
            c1403m.m4463v(1);
            ((C1381e1) obj).m4331d((i15 << 3) | 1, Long.valueOf(c1403m.f5937a.mo4382x()));
            return true;
        }
        if (i16 == 2) {
            ((C1381e1) obj).m4331d((i15 << 3) | 2, c1403m.m4446e());
            return true;
        }
        if (i16 != 3) {
            if (i16 == 4) {
                return false;
            }
            if (i16 != 5) {
                throw InvalidProtocolBufferException.m4263c();
            }
            c1403m.m4463v(5);
            ((C1381e1) obj).m4331d(5 | (i15 << 3), Integer.valueOf(c1403m.f5937a.mo4381w()));
            return true;
        }
        C1381e1 c1381e1M4328c = C1381e1.m4328c();
        int i17 = i15 << 3;
        int i18 = i17 | 4;
        int i19 = i13 + 1;
        if (i19 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (c1403m.m4442a() != Integer.MAX_VALUE && m4325b(i19, c1403m, c1381e1M4328c)) {
        }
        if (i18 != c1403m.f5938b) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        if (c1381e1M4328c.f5885e) {
            c1381e1M4328c.f5885e = false;
        }
        ((C1381e1) obj).m4331d(i17 | 3, c1381e1M4328c);
        return true;
    }
}
