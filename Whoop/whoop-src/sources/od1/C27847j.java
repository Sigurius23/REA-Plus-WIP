package od1;

import com.whoop.domain.model.AuthMaterial;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: od1.j */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\n\u0010\b\"\u0004\b\u0013\u0010\u0014R$\u0010\u001b\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0011\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Lod1/j;", "", "<init>", "()V", "Ll83/a0;", "d", "", "toString", "()Ljava/lang/String;", "", "a", "I", "c", "()I", "g", "(I)V", "provisionalUserId", "b", "Ljava/lang/String;", "e", "(Ljava/lang/String;)V", "accessToken", "Lcom/whoop/domain/model/AuthMaterial;", "Lcom/whoop/domain/model/AuthMaterial;", "()Lcom/whoop/domain/model/AuthMaterial;", "f", "(Lcom/whoop/domain/model/AuthMaterial;)V", "pendingAuthMaterial", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27847j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int provisionalUserId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String accessToken;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private AuthMaterial pendingAuthMaterial;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AuthMaterial getPendingAuthMaterial() {
        return this.pendingAuthMaterial;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getProvisionalUserId() {
        return this.provisionalUserId;
    }

    /* JADX INFO: renamed from: d */
    public final void m83955d() {
        InterfaceC34116n.INSTANCE.m107848a("PendingUserSession").mo85228t("reset", new AbstractC30556a.a[0]);
        this.provisionalUserId = 0;
        this.accessToken = null;
        this.pendingAuthMaterial = null;
    }

    /* JADX INFO: renamed from: e */
    public final void m83956e(String str) {
        this.accessToken = str;
    }

    /* JADX INFO: renamed from: f */
    public final void m83957f(AuthMaterial authMaterial) {
        this.pendingAuthMaterial = authMaterial;
    }

    /* JADX INFO: renamed from: g */
    public final void m83958g(int i13) {
        this.provisionalUserId = i13;
    }

    public String toString() {
        return AbstractC2875y.m8296i(this.provisionalUserId, "PendingUserSessionRepository(provisionalUserId=", ")");
    }
}
