package h12;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: h12.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\t¨\u0006\u0016"}, m65681d2 = {"Lh12/b;", "", "", "codeVerifier", "codeChallenge", "codeChallengeMethod", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "getCodeChallengeMethod", "oauth-integration_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C16615b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String codeVerifier;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String codeChallenge;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String codeChallengeMethod;

    public C16615b(String codeVerifier, String codeChallenge, String codeChallengeMethod) {
        AbstractC22676k.m65750j(codeVerifier, "codeVerifier");
        AbstractC22676k.m65750j(codeChallenge, "codeChallenge");
        AbstractC22676k.m65750j(codeChallengeMethod, "codeChallengeMethod");
        this.codeVerifier = codeVerifier;
        this.codeChallenge = codeChallenge;
        this.codeChallengeMethod = codeChallengeMethod;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCodeChallenge() {
        return this.codeChallenge;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCodeVerifier() {
        return this.codeVerifier;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C16615b)) {
            return false;
        }
        C16615b c16615b = (C16615b) other;
        return AbstractC22676k.m65745e(this.codeVerifier, c16615b.codeVerifier) && AbstractC22676k.m65745e(this.codeChallenge, c16615b.codeChallenge) && AbstractC22676k.m65745e(this.codeChallengeMethod, c16615b.codeChallengeMethod);
    }

    public int hashCode() {
        return this.codeChallengeMethod.hashCode() + AbstractC11266d.m30450d(this.codeVerifier.hashCode() * 31, 31, this.codeChallenge);
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.codeChallengeMethod, ")", AbstractC11895b.m32001t("PkceParams(codeVerifier=", this.codeVerifier, ", codeChallenge=", this.codeChallenge, ", codeChallengeMethod="));
    }

    public /* synthetic */ C16615b(String str, String str2, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i13 & 4) != 0 ? "S256" : str3);
    }
}
