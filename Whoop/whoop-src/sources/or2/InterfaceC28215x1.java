package or2;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39397a;

/* JADX INFO: renamed from: or2.x1 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0002*\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010À\u0006\u0003"}, m65681d2 = {"Lor2/x1;", "", "", "bytes", "Ljava/util/UUID;", "b", "([B)Ljava/util/UUID;", "c", "(Ljava/util/UUID;)[B", "a", "()Ljava/util/UUID;", "", "name", "d", "(Ljava/lang/String;)Ljava/util/UUID;", "e", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC28215x1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f113994a;

    /* JADX INFO: renamed from: or2.x1$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m65681d2 = {"Lor2/x1$a;", "", "<init>", "()V", "Ljava/util/UUID;", "b", "Ljava/util/UUID;", "NAMESPACE", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ Companion f113994a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private static final UUID NAMESPACE;

        static {
            UUID uuidFromString = UUID.fromString("01e7ec72-09ae-50ea-9912-a866422d6069");
            AbstractC22676k.m65749i(uuidFromString, "fromString(...)");
            NAMESPACE = uuidFromString;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: b */
    private default UUID m85403b(byte[] bytes) {
        long j7 = 0;
        long j13 = 0;
        for (int i13 = 0; i13 < 8; i13++) {
            j13 = (j13 << 8) | ((long) (bytes[i13] & 255));
        }
        for (int i14 = 8; i14 < 16; i14++) {
            j7 = (j7 << 8) | ((long) (bytes[i14] & 255));
        }
        return new UUID(j13, j7);
    }

    /* JADX INFO: renamed from: c */
    private default byte[] m85404c(UUID uuid) {
        byte[] bArr = new byte[16];
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        for (int i13 = 0; i13 < 8; i13++) {
            bArr[i13] = (byte) (255 & (mostSignificantBits >> ((7 - i13) * 8)));
        }
        for (int i14 = 8; i14 < 16; i14++) {
            bArr[i14] = (byte) ((leastSignificantBits >> ((15 - i14) * 8)) & 255);
        }
        return bArr;
    }

    /* JADX INFO: renamed from: a */
    UUID mo85405a();

    /* JADX INFO: renamed from: d */
    default UUID mo85406d(String name) {
        AbstractC22676k.m65750j(name, "name");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(m85404c(Companion.NAMESPACE));
            byte[] bytes = name.getBytes(AbstractC39397a.f169546a);
            AbstractC22676k.m65749i(bytes, "getBytes(...)");
            messageDigest.update(bytes);
            byte[] bArrDigest = messageDigest.digest();
            byte b = (byte) (bArrDigest[6] & 15);
            bArrDigest[6] = b;
            bArrDigest[6] = (byte) (b | 80);
            byte b6 = (byte) (bArrDigest[8] & 63);
            bArrDigest[8] = b6;
            bArrDigest[8] = (byte) (b6 | (-128));
            return m85403b(bArrDigest);
        } catch (NoSuchAlgorithmException e5) {
            throw new RuntimeException("Cannot generate UUID v5 without SHA-1", e5);
        }
    }

    /* JADX INFO: renamed from: e */
    default UUID mo85407e(String name) {
        AbstractC22676k.m65750j(name, "name");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
            messageDigest.update(m85404c(Companion.NAMESPACE));
            byte[] bytes = name.getBytes(AbstractC39397a.f169546a);
            AbstractC22676k.m65749i(bytes, "getBytes(...)");
            messageDigest.update(bytes);
            byte[] bArrDigest = messageDigest.digest();
            byte b = (byte) (bArrDigest[6] & 15);
            bArrDigest[6] = b;
            bArrDigest[6] = (byte) (b | (-128));
            byte b6 = (byte) (bArrDigest[8] & 63);
            bArrDigest[8] = b6;
            bArrDigest[8] = (byte) (b6 | (-128));
            return m85403b(bArrDigest);
        } catch (NoSuchAlgorithmException e5) {
            throw new RuntimeException("Cannot generate UUID v8 without SHA-512", e5);
        }
    }
}
