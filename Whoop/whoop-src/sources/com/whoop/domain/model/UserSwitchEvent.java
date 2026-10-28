package com.whoop.domain.model;

import java.util.Objects;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u000b\u001a\u00020\fH\u0096\u0080\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\r\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f\u0082\u0001\u0002\u0012\u0013¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/domain/model/UserSwitchEvent;", "", "session", "Lcom/whoop/domain/model/Session;", "<init>", "(Lcom/whoop/domain/model/Session;)V", "getSession", "()Lcom/whoop/domain/model/Session;", "equals", "", "other", "hashCode", "", "logout", "isLogout", "()Z", "login", "isLogin", "Lcom/whoop/domain/model/Login;", "Lcom/whoop/domain/model/Logout;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class UserSwitchEvent {
    private final Session session;

    public /* synthetic */ UserSwitchEvent(Session session, DefaultConstructorMarker defaultConstructorMarker) {
        this(session);
    }

    public boolean equals(Object other) {
        UserSwitchEvent userSwitchEvent = other instanceof UserSwitchEvent ? (UserSwitchEvent) other : null;
        return userSwitchEvent != null && isLogout() == userSwitchEvent.isLogout() && this.session.getUser().getId() == userSwitchEvent.session.getUser().getId();
    }

    public final Session getSession() {
        return this.session;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(isLogout()), Integer.valueOf(this.session.getUser().getId()));
    }

    public final boolean isLogin() {
        return this instanceof Login;
    }

    public final boolean isLogout() {
        return this instanceof Logout;
    }

    private UserSwitchEvent(Session session) {
        this.session = session;
    }
}
