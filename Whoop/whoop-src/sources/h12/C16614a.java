package h12;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import yb3.AbstractC39397a;

/* JADX INFO: renamed from: h12.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lh12/a;", "", "Ljava/security/SecureRandom;", "secureRandom", "<init>", "(Ljava/security/SecureRandom;)V", "", "c", "()Ljava/lang/String;", "codeVerifier", "b", "(Ljava/lang/String;)Ljava/lang/String;", "Lh12/b;", "a", "()Lh12/b;", "Ljava/security/SecureRandom;", "oauth-integration_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C16614a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final SecureRandom secureRandom;

    public C16614a(SecureRandom secureRandom) {
        AbstractC22676k.m65750j(secureRandom, "secureRandom");
        this.secureRandom = secureRandom;
    }

    /* JADX INFO: renamed from: b */
    private final String m47178b(String codeVerifier) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = codeVerifier.getBytes(AbstractC39397a.f169549d);
        AbstractC22676k.m65749i(bytes, "getBytes(...)");
        String strEncodeToString = Base64.getUrlEncoder().withoutPadding().encodeToString(messageDigest.digest(bytes));
        AbstractC22676k.m65749i(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    /* JADX INFO: renamed from: c */
    private final String m47179c() {
        byte[] bArr = new byte[32];
        this.secureRandom.nextBytes(bArr);
        String strEncodeToString = Base64.getUrlEncoder().withoutPadding().encodeToString(bArr);
        AbstractC22676k.m65749i(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    /* JADX INFO: renamed from: a */
    public final C16615b m47180a() {
        String strM47179c = m47179c();
        return new C16615b(strM47179c, m47178b(strM47179c), null, 4, null);
    }

    public /* synthetic */ C16614a(SecureRandom secureRandom, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new SecureRandom() : secureRandom);
    }
}
