package com.whoop.data.repositories;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lcom/whoop/data/repositories/AnalyticsUserRepository;", "", "<init>", "()V", "newUser", "", "getNewUser", "()Z", "setNewUser", "(Z)V", "userType", "", "getUserType", "()Ljava/lang/String;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class AnalyticsUserRepository {
    public static final AnalyticsUserRepository INSTANCE = new AnalyticsUserRepository();
    private static boolean newUser;

    private AnalyticsUserRepository() {
    }

    public final boolean getNewUser() {
        return newUser;
    }

    public final String getUserType() {
        return newUser ? "Onboarding" : "Existing_User";
    }

    public final void setNewUser(boolean z4) {
        newUser = z4;
    }
}
