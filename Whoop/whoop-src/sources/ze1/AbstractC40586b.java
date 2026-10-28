package ze1;

import java.nio.ByteBuffer;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: ze1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0001*\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\b\u001a\u00020\u0001*\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\u0007\u001a\u0011\u0010\t\u001a\u00020\u0001*\u00020\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"", "", "e", "([B)Ljava/lang/String;", "c", "Ljava/nio/ByteBuffer;", "d", "(Ljava/nio/ByteBuffer;)Ljava/lang/String;", "b", "a", "(Ljava/lang/String;)Ljava/lang/String;", "essentials_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40586b {
    /* JADX INFO: renamed from: a */
    public static final String m131616a(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        return AbstractC25265s.m74110N0(AbstractC39414r.m125873S(str), "-", null, null, null, 62);
    }

    /* JADX INFO: renamed from: b */
    public static final String m131617b(ByteBuffer byteBuffer) {
        String strM131616a;
        return (byteBuffer == null || (strM131616a = m131616a(C40585a.f174855a.m131614b(byteBuffer))) == null) ? "null" : strM131616a;
    }

    /* JADX INFO: renamed from: c */
    public static final String m131618c(byte[] bArr) {
        String strM131616a;
        return (bArr == null || (strM131616a = m131616a(C40585a.m131613d(C40585a.f174855a, bArr, false, 2, null))) == null) ? "null" : strM131616a;
    }

    /* JADX INFO: renamed from: d */
    public static final String m131619d(ByteBuffer byteBuffer) {
        String strM131614b;
        return (byteBuffer == null || (strM131614b = C40585a.f174855a.m131614b(byteBuffer)) == null) ? "null" : strM131614b;
    }

    /* JADX INFO: renamed from: e */
    public static final String m131620e(byte[] bArr) {
        String strM131613d;
        return (bArr == null || (strM131613d = C40585a.m131613d(C40585a.f174855a, bArr, false, 2, null)) == null) ? "null" : strM131613d;
    }
}
