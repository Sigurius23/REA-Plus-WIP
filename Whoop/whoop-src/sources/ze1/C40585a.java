package ze1;

import java.nio.ByteBuffer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ze1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011¨\u0006\u0014"}, m65681d2 = {"Lze1/a;", "", "<init>", "()V", "", "data", "", "uppercase", "", "a", "([BZ)[C", "", "c", "([BZ)Ljava/lang/String;", "Ljava/nio/ByteBuffer;", "b", "(Ljava/nio/ByteBuffer;)Ljava/lang/String;", "[C", "DIGITS_UPPER", "DIGITS_LOWER", "essentials_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40585a {

    /* JADX INFO: renamed from: a */
    public static final C40585a f174855a = new C40585a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final char[] DIGITS_UPPER = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final char[] DIGITS_LOWER = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    private C40585a() {
    }

    /* JADX INFO: renamed from: a */
    private final char[] m131612a(byte[] data, boolean uppercase) {
        char[] cArr = new char[data.length << 1];
        char[] cArr2 = uppercase ? DIGITS_UPPER : DIGITS_LOWER;
        int i13 = 0;
        for (byte b : data) {
            int i14 = i13 + 1;
            cArr[i13] = cArr2[(b & 240) >>> 4];
            i13 += 2;
            cArr[i14] = cArr2[b & 15];
        }
        return cArr;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m131613d(C40585a c40585a, byte[] bArr, boolean z4, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z4 = true;
        }
        return c40585a.m131615c(bArr, z4);
    }

    /* JADX INFO: renamed from: b */
    public final String m131614b(ByteBuffer data) {
        AbstractC22676k.m65750j(data, "data");
        byte[] bArrArray = data.array();
        AbstractC22676k.m65749i(bArrArray, "array(...)");
        return m131613d(this, bArrArray, false, 2, null);
    }

    /* JADX INFO: renamed from: c */
    public final String m131615c(byte[] data, boolean uppercase) {
        AbstractC22676k.m65750j(data, "data");
        return new String(m131612a(data, uppercase));
    }
}
