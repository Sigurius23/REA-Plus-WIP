package lj0;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lj0.g */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0003\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0004*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m65681d2 = {"Llj0/f;", "c", "(Llj0/f;)Llj0/f;", "b", "", "a", "(Llj0/f;)I", "total", "connectivity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC24468g {
    /* JADX INFO: renamed from: a */
    public static final int m71202a(C24467f c24467f) {
        AbstractC22676k.m65750j(c24467f, "<this>");
        return c24467f.getImuStreamDataPacketCount() + c24467f.getInvalidPacketCount();
    }

    /* JADX INFO: renamed from: b */
    public static final C24467f m71203b(C24467f c24467f) {
        AbstractC22676k.m65750j(c24467f, "<this>");
        return C24467f.m71198b(c24467f, 0, c24467f.getImuStreamDataPacketCount() + 1, 1, null);
    }

    /* JADX INFO: renamed from: c */
    public static final C24467f m71204c(C24467f c24467f) {
        AbstractC22676k.m65750j(c24467f, "<this>");
        return C24467f.m71198b(c24467f, c24467f.getInvalidPacketCount() + 1, 0, 2, null);
    }
}
