package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.c1 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC5130c1 {
    /* JADX INFO: renamed from: a */
    public abstract C5133d1 mo16151a(Object obj);

    /* JADX INFO: renamed from: b */
    public final boolean m16152b(Object obj, C5155l c5155l) throws InvalidProtocolBufferException {
        int i13 = c5155l.f21537b;
        int i14 = i13 >>> 3;
        int i15 = i13 & 7;
        if (i15 == 0) {
            c5155l.m16241w(0);
            ((C5133d1) obj).m16161d(i14 << 3, Long.valueOf(c5155l.f21536a.mo3847w()));
            return true;
        }
        if (i15 == 1) {
            c5155l.m16241w(1);
            ((C5133d1) obj).m16161d((i14 << 3) | 1, Long.valueOf(c5155l.f21536a.mo3844t()));
            return true;
        }
        if (i15 == 2) {
            ((C5133d1) obj).m16161d((i14 << 3) | 2, c5155l.m16224f());
            return true;
        }
        if (i15 != 3) {
            if (i15 == 4) {
                return false;
            }
            if (i15 != 5) {
                int i16 = InvalidProtocolBufferException.f21476x;
                throw new InvalidProtocolBufferException.InvalidWireTypeException();
            }
            c5155l.m16241w(5);
            ((C5133d1) obj).m16161d((i14 << 3) | 5, Integer.valueOf(c5155l.f21536a.mo3843s()));
            return true;
        }
        C5133d1 c5133d1M16158c = C5133d1.m16158c();
        int i17 = i14 << 3;
        int i18 = i17 | 4;
        while (c5155l.m16220b() != Integer.MAX_VALUE && m16152b(c5133d1M16158c, c5155l)) {
        }
        if (i18 != c5155l.f21537b) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        if (c5133d1M16158c.f21504e) {
            c5133d1M16158c.f21504e = false;
        }
        ((C5133d1) obj).m16161d(i17 | 3, c5133d1M16158c);
        return true;
    }
}
