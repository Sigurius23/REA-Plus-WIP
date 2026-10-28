package com.whoop.domain.model;

import com.whoop.service.network.model.UserState;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\n\u0010\f\u001a\u00020\rH\u0096\u0080\u0004J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m65681d2 = {"Lcom/whoop/domain/model/Session;", "", "authToken", "Lcom/whoop/domain/model/AuthToken;", UserState.Sources.USER, "Lcom/whoop/domain/model/User;", "<init>", "(Lcom/whoop/domain/model/AuthToken;Lcom/whoop/domain/model/User;)V", "getAuthToken", "()Lcom/whoop/domain/model/AuthToken;", "getUser", "()Lcom/whoop/domain/model/User;", "toString", "", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class Session {
    private final AuthToken authToken;
    private final User user;

    public Session(AuthToken authToken, User user) {
        AbstractC22676k.m65750j(authToken, "authToken");
        AbstractC22676k.m65750j(user, "user");
        this.authToken = authToken;
        this.user = user;
    }

    public static /* synthetic */ Session copy$default(Session session, AuthToken authToken, User user, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            authToken = session.authToken;
        }
        if ((i13 & 2) != 0) {
            user = session.user;
        }
        return session.copy(authToken, user);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AuthToken getAuthToken() {
        return this.authToken;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    public final Session copy(AuthToken authToken, User user) {
        AbstractC22676k.m65750j(authToken, "authToken");
        AbstractC22676k.m65750j(user, "user");
        return new Session(authToken, user);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Session)) {
            return false;
        }
        Session session = (Session) other;
        return AbstractC22676k.m65745e(this.authToken, session.authToken) && AbstractC22676k.m65745e(this.user, session.user);
    }

    public final AuthToken getAuthToken() {
        return this.authToken;
    }

    public final User getUser() {
        return this.user;
    }

    public int hashCode() {
        return this.user.hashCode() + (this.authToken.hashCode() * 31);
    }

    public String toString() {
        return AbstractC2875y.m8296i(this.user.getId(), "Session (", ")");
    }
}
