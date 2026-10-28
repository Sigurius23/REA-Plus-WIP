package com.whoop.domain.model;

import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\u0006\u001a\u00020\u0007H\u0096\u0080\u0004¨\u0006\b"}, m65681d2 = {"Lcom/whoop/domain/model/Login;", "Lcom/whoop/domain/model/UserSwitchEvent;", "session", "Lcom/whoop/domain/model/Session;", "<init>", "(Lcom/whoop/domain/model/Session;)V", "toString", "", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class Login extends UserSwitchEvent {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Login(Session session) {
        super(session, null);
        AbstractC22676k.m65750j(session, "session");
    }

    public String toString() {
        return AbstractC2875y.m8295h(getSession().getUser().getId(), "Login ");
    }
}
