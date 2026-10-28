package bq0;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: bq0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0010\u0010\t¨\u0006\u0015"}, m65681d2 = {"Lbq0/a;", "", "", "userId", "", "chatToken", "<init>", "(ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getUserId", "b", "Ljava/lang/String;", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3545a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int userId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String chatToken;

    public C3545a(int i13, String chatToken) {
        AbstractC22676k.m65750j(chatToken, "chatToken");
        this.userId = i13;
        this.chatToken = chatToken;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getChatToken() {
        return this.chatToken;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3545a)) {
            return false;
        }
        C3545a c3545a = (C3545a) other;
        return this.userId == c3545a.userId && AbstractC22676k.m65745e(this.chatToken, c3545a.chatToken);
    }

    public int hashCode() {
        return this.chatToken.hashCode() + (Integer.hashCode(this.userId) * 31);
    }

    public String toString() {
        return AbstractC30007c.m91838h(this.userId, "ChatTokenResponse(userId=", ", chatToken=", this.chatToken, ")");
    }
}
