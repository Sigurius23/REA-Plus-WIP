package io.getstream.chat.android.p226ui.feature.messages.list.adapter;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewType;", "", "<init>", "()V", "OFFSET", "", "DATE_DIVIDER", "MESSAGE_DELETED", "PLAIN_TEXT", "CUSTOM_ATTACHMENTS", "LOADING_INDICATOR", "THREAD_SEPARATOR", "TYPING_INDICATOR", "GIPHY", "SYSTEM_MESSAGE", "ERROR_MESSAGE", "THREAD_PLACEHOLDER", "GIPHY_ATTACHMENT", "MEDIA_ATTACHMENT", "FILE_ATTACHMENTS", "LINK_ATTACHMENTS", "UNREAD_SEPARATOR", "START_OF_THE_CHANNEL", "POLL", "toString", "", "viewType", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageListItemViewType {
    public static final int CUSTOM_ATTACHMENTS = 1004;
    public static final int DATE_DIVIDER = 1001;
    public static final int ERROR_MESSAGE = 1010;
    public static final int FILE_ATTACHMENTS = 1014;
    public static final int GIPHY = 1008;
    public static final int GIPHY_ATTACHMENT = 1012;
    public static final MessageListItemViewType INSTANCE = new MessageListItemViewType();
    public static final int LINK_ATTACHMENTS = 1015;
    public static final int LOADING_INDICATOR = 1005;
    public static final int MEDIA_ATTACHMENT = 1013;
    public static final int MESSAGE_DELETED = 1002;
    private static final int OFFSET = 1000;
    public static final int PLAIN_TEXT = 1003;
    public static final int POLL = 1018;
    public static final int START_OF_THE_CHANNEL = 1017;
    public static final int SYSTEM_MESSAGE = 1009;
    public static final int THREAD_PLACEHOLDER = 1011;
    public static final int THREAD_SEPARATOR = 1006;
    public static final int TYPING_INDICATOR = 1007;
    public static final int UNREAD_SEPARATOR = 1016;

    private MessageListItemViewType() {
    }

    public final String toString(int viewType) {
        switch (viewType) {
            case 1001:
                return "DATE_DIVIDER";
            case 1002:
                return "MESSAGE_DELETED";
            case 1003:
                return "PLAIN_TEXT";
            case CUSTOM_ATTACHMENTS /* 1004 */:
                return "CUSTOM_ATTACHMENTS";
            case LOADING_INDICATOR /* 1005 */:
                return "LOADING_INDICATOR";
            case THREAD_SEPARATOR /* 1006 */:
                return "THREAD_SEPARATOR";
            case TYPING_INDICATOR /* 1007 */:
                return "TYPING_INDICATOR";
            case GIPHY /* 1008 */:
                return "GIPHY";
            case SYSTEM_MESSAGE /* 1009 */:
                return "SYSTEM_MESSAGE";
            case ERROR_MESSAGE /* 1010 */:
                return "ERROR_MESSAGE";
            case THREAD_PLACEHOLDER /* 1011 */:
                return "THREAD_PLACEHOLDER";
            case GIPHY_ATTACHMENT /* 1012 */:
                return "GIPHY_ATTACHMENT";
            case MEDIA_ATTACHMENT /* 1013 */:
                return "MEDIA_ATTACHMENT";
            case FILE_ATTACHMENTS /* 1014 */:
                return "FILE_ATTACHMENTS";
            case LINK_ATTACHMENTS /* 1015 */:
                return "LINK_ATTACHMENTS";
            case UNREAD_SEPARATOR /* 1016 */:
                return "UNREAD_SEPARATOR";
            case START_OF_THE_CHANNEL /* 1017 */:
                return "START_OF_THE_CHANNEL";
            case POLL /* 1018 */:
                return "POLL";
            default:
                return "UNKNOWN";
        }
    }
}
