package io.getstream.chat.android.models;

import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, m65681d2 = {"Lio/getstream/chat/android/models/MessageModerationDetails;", "", "originalText", "", "action", "Lio/getstream/chat/android/models/MessageModerationAction;", "errorMsg", "<init>", "(Ljava/lang/String;Lio/getstream/chat/android/models/MessageModerationAction;Ljava/lang/String;)V", "getOriginalText", "()Ljava/lang/String;", "getAction", "()Lio/getstream/chat/android/models/MessageModerationAction;", "getErrorMsg", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class MessageModerationDetails {
    private final MessageModerationAction action;
    private final String errorMsg;
    private final String originalText;

    public MessageModerationDetails(String originalText, MessageModerationAction action, String errorMsg) {
        AbstractC22676k.m65750j(originalText, "originalText");
        AbstractC22676k.m65750j(action, "action");
        AbstractC22676k.m65750j(errorMsg, "errorMsg");
        this.originalText = originalText;
        this.action = action;
        this.errorMsg = errorMsg;
    }

    public static /* synthetic */ MessageModerationDetails copy$default(MessageModerationDetails messageModerationDetails, String str, MessageModerationAction messageModerationAction, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = messageModerationDetails.originalText;
        }
        if ((i13 & 2) != 0) {
            messageModerationAction = messageModerationDetails.action;
        }
        if ((i13 & 4) != 0) {
            str2 = messageModerationDetails.errorMsg;
        }
        return messageModerationDetails.copy(str, messageModerationAction, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOriginalText() {
        return this.originalText;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MessageModerationAction getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    public final MessageModerationDetails copy(String originalText, MessageModerationAction action, String errorMsg) {
        AbstractC22676k.m65750j(originalText, "originalText");
        AbstractC22676k.m65750j(action, "action");
        AbstractC22676k.m65750j(errorMsg, "errorMsg");
        return new MessageModerationDetails(originalText, action, errorMsg);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageModerationDetails)) {
            return false;
        }
        MessageModerationDetails messageModerationDetails = (MessageModerationDetails) other;
        return AbstractC22676k.m65745e(this.originalText, messageModerationDetails.originalText) && AbstractC22676k.m65745e(this.action, messageModerationDetails.action) && AbstractC22676k.m65745e(this.errorMsg, messageModerationDetails.errorMsg);
    }

    public final MessageModerationAction getAction() {
        return this.action;
    }

    public final String getErrorMsg() {
        return this.errorMsg;
    }

    public final String getOriginalText() {
        return this.originalText;
    }

    public int hashCode() {
        return this.errorMsg.hashCode() + ((this.action.hashCode() + (this.originalText.hashCode() * 31)) * 31);
    }

    public String toString() {
        String str = this.originalText;
        MessageModerationAction messageModerationAction = this.action;
        String str2 = this.errorMsg;
        StringBuilder sb4 = new StringBuilder("MessageModerationDetails(originalText=");
        sb4.append(str);
        sb4.append(", action=");
        sb4.append(messageModerationAction);
        sb4.append(", errorMsg=");
        return AbstractC25012a.m73376i(str2, ")", sb4);
    }
}
