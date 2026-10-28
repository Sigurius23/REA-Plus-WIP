package com.whoop.service.network.model;

import com.whoop.domain.model.Session;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m65681d2 = {"Lcom/whoop/service/network/model/LoginResult;", "", "session", "Lcom/whoop/domain/model/Session;", "needsProfileCompletion", "", "<init>", "(Lcom/whoop/domain/model/Session;Z)V", "getSession", "()Lcom/whoop/domain/model/Session;", "getNeedsProfileCompletion", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class LoginResult {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean needsProfileCompletion;
    private final Session session;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/service/network/model/LoginResult$Companion;", "", "<init>", "()V", "create", "Lcom/whoop/service/network/model/LoginResult;", "userSessionDto", "Lcom/whoop/service/network/model/UserSessionDto;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LoginResult create(UserSessionDto userSessionDto) {
            AbstractC22676k.m65750j(userSessionDto, "userSessionDto");
            return new LoginResult(userSessionDto.toSession(), userSessionDto.getNeedsProfileCompletion());
        }

        private Companion() {
        }
    }

    public LoginResult(Session session, boolean z4) {
        AbstractC22676k.m65750j(session, "session");
        this.session = session;
        this.needsProfileCompletion = z4;
    }

    public static /* synthetic */ LoginResult copy$default(LoginResult loginResult, Session session, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            session = loginResult.session;
        }
        if ((i13 & 2) != 0) {
            z4 = loginResult.needsProfileCompletion;
        }
        return loginResult.copy(session, z4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Session getSession() {
        return this.session;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getNeedsProfileCompletion() {
        return this.needsProfileCompletion;
    }

    public final LoginResult copy(Session session, boolean needsProfileCompletion) {
        AbstractC22676k.m65750j(session, "session");
        return new LoginResult(session, needsProfileCompletion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoginResult)) {
            return false;
        }
        LoginResult loginResult = (LoginResult) other;
        return AbstractC22676k.m65745e(this.session, loginResult.session) && this.needsProfileCompletion == loginResult.needsProfileCompletion;
    }

    public final boolean getNeedsProfileCompletion() {
        return this.needsProfileCompletion;
    }

    public final Session getSession() {
        return this.session;
    }

    public int hashCode() {
        return Boolean.hashCode(this.needsProfileCompletion) + (this.session.hashCode() * 31);
    }

    public String toString() {
        return "LoginResult(session=" + this.session + ", needsProfileCompletion=" + this.needsProfileCompletion + ")";
    }
}
