package com.whoop.data.remote;

import l83.C23454a0;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\b\u0010\t¨\u0006\u000bÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/data/remote/AppConfigurationRepository;", "", "", "source", "", "refresh", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Ll83/a0;", "clear", "(Lq83/d;)Ljava/lang/Object;", "Companion", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface AppConfigurationRepository {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final String SOURCE_LANGUAGE_CHANGE = "language_change";
    public static final String SOURCE_TOKEN_REFRESH = "token_refresh";
    public static final String SOURCE_USER_ACCOUNT_CREATION = "user_account_creation";
    public static final String SOURCE_USER_LOGIN = "user_login";

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m65681d2 = {"Lcom/whoop/data/remote/AppConfigurationRepository$Companion;", "", "<init>", "()V", "SOURCE_TOKEN_REFRESH", "", "SOURCE_USER_LOGIN", "SOURCE_USER_ACCOUNT_CREATION", "SOURCE_LANGUAGE_CHANGE", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String SOURCE_LANGUAGE_CHANGE = "language_change";
        public static final String SOURCE_TOKEN_REFRESH = "token_refresh";
        public static final String SOURCE_USER_ACCOUNT_CREATION = "user_account_creation";
        public static final String SOURCE_USER_LOGIN = "user_login";

        private Companion() {
        }
    }

    Object clear(InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object refresh(String str, InterfaceC30057d<? super Boolean> interfaceC30057d);
}
