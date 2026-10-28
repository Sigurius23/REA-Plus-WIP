package io.getstream.chat.android.client.errorhandler;

import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bg\u0018\u0000 \f2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\b\u0012\u0004\u0012\u00020\u00000\u0005:\u0001\fJ\u0011\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0000H\u0096\u0002R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/errorhandler/ErrorHandler;", "Lio/getstream/chat/android/client/errorhandler/DeleteReactionErrorHandler;", "Lio/getstream/chat/android/client/errorhandler/CreateChannelErrorHandler;", "Lio/getstream/chat/android/client/errorhandler/QueryMembersErrorHandler;", "Lio/getstream/chat/android/client/errorhandler/SendReactionErrorHandler;", "", "priority", "", "getPriority", "()I", "compareTo", "other", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface ErrorHandler extends DeleteReactionErrorHandler, CreateChannelErrorHandler, QueryMembersErrorHandler, SendReactionErrorHandler, Comparable<ErrorHandler> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int DEFAULT_PRIORITY = 1;

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/client/errorhandler/ErrorHandler$Companion;", "", "<init>", "()V", "DEFAULT_PRIORITY", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int DEFAULT_PRIORITY = 1;

        private Companion() {
        }
    }

    int getPriority();

    @Override // java.lang.Comparable
    default int compareTo(ErrorHandler other) {
        AbstractC22676k.m65750j(other, "other");
        return AbstractC22676k.m65751k(1, 1);
    }
}
