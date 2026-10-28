package io.getstream.chat.android.client.query.pagination;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0000\u001a\n\u0010\b\u001a\u00020\u0006*\u00020\u0007\u001a\f\u0010\t\u001a\u00020\u0006*\u00020\u0007H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m65681d2 = {"MESSAGE_LIMIT", "", "CHANNEL_LIMIT", "MEMBER_LIMIT", "WATCHER_LIMIT", "isFirstPage", "", "Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;", "isRequestingMoreThanLastMessage", "isNotFirstPage", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AnyChannelPaginationRequestKt {
    private static final int CHANNEL_LIMIT = 30;
    private static final int MEMBER_LIMIT = 30;
    private static final int MESSAGE_LIMIT = 30;
    private static final int WATCHER_LIMIT = 30;

    public static final boolean isFirstPage(AnyChannelPaginationRequest anyChannelPaginationRequest) {
        AbstractC22676k.m65750j(anyChannelPaginationRequest, "<this>");
        return anyChannelPaginationRequest.getChannelOffset() == 0;
    }

    public static final boolean isNotFirstPage(AnyChannelPaginationRequest anyChannelPaginationRequest) {
        AbstractC22676k.m65750j(anyChannelPaginationRequest, "<this>");
        return !isFirstPage(anyChannelPaginationRequest);
    }

    public static final boolean isRequestingMoreThanLastMessage(AnyChannelPaginationRequest anyChannelPaginationRequest) {
        AbstractC22676k.m65750j(anyChannelPaginationRequest, "<this>");
        return (isFirstPage(anyChannelPaginationRequest) && anyChannelPaginationRequest.getMessageLimit() > 1) || (isNotFirstPage(anyChannelPaginationRequest) && anyChannelPaginationRequest.getMessageLimit() > 0);
    }
}
