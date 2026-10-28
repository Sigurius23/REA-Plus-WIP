package io.getstream.chat.android.p226ui.feature.messages.list.options.message;

import android.graphics.drawable.Drawable;
import io.getstream.chat.android.p226ui.common.state.messages.MessageAction;
import nh3.AbstractC26725a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012¨\u0006\u001d"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;", "", "optionText", "", "optionIcon", "Landroid/graphics/drawable/Drawable;", "messageAction", "Lio/getstream/chat/android/ui/common/state/messages/MessageAction;", "isWarningItem", "", "<init>", "(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Z)V", "getOptionText", "()Ljava/lang/String;", "getOptionIcon", "()Landroid/graphics/drawable/Drawable;", "getMessageAction", "()Lio/getstream/chat/android/ui/common/state/messages/MessageAction;", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class MessageOptionItem {
    private final boolean isWarningItem;
    private final MessageAction messageAction;
    private final Drawable optionIcon;
    private final String optionText;

    public MessageOptionItem(String optionText, Drawable optionIcon, MessageAction messageAction, boolean z4) {
        AbstractC22676k.m65750j(optionText, "optionText");
        AbstractC22676k.m65750j(optionIcon, "optionIcon");
        AbstractC22676k.m65750j(messageAction, "messageAction");
        this.optionText = optionText;
        this.optionIcon = optionIcon;
        this.messageAction = messageAction;
        this.isWarningItem = z4;
    }

    public static /* synthetic */ MessageOptionItem copy$default(MessageOptionItem messageOptionItem, String str, Drawable drawable, MessageAction messageAction, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = messageOptionItem.optionText;
        }
        if ((i13 & 2) != 0) {
            drawable = messageOptionItem.optionIcon;
        }
        if ((i13 & 4) != 0) {
            messageAction = messageOptionItem.messageAction;
        }
        if ((i13 & 8) != 0) {
            z4 = messageOptionItem.isWarningItem;
        }
        return messageOptionItem.copy(str, drawable, messageAction, z4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOptionText() {
        return this.optionText;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Drawable getOptionIcon() {
        return this.optionIcon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final MessageAction getMessageAction() {
        return this.messageAction;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsWarningItem() {
        return this.isWarningItem;
    }

    public final MessageOptionItem copy(String optionText, Drawable optionIcon, MessageAction messageAction, boolean isWarningItem) {
        AbstractC22676k.m65750j(optionText, "optionText");
        AbstractC22676k.m65750j(optionIcon, "optionIcon");
        AbstractC22676k.m65750j(messageAction, "messageAction");
        return new MessageOptionItem(optionText, optionIcon, messageAction, isWarningItem);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageOptionItem)) {
            return false;
        }
        MessageOptionItem messageOptionItem = (MessageOptionItem) other;
        return AbstractC22676k.m65745e(this.optionText, messageOptionItem.optionText) && AbstractC22676k.m65745e(this.optionIcon, messageOptionItem.optionIcon) && AbstractC22676k.m65745e(this.messageAction, messageOptionItem.messageAction) && this.isWarningItem == messageOptionItem.isWarningItem;
    }

    public final MessageAction getMessageAction() {
        return this.messageAction;
    }

    public final Drawable getOptionIcon() {
        return this.optionIcon;
    }

    public final String getOptionText() {
        return this.optionText;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isWarningItem) + ((this.messageAction.hashCode() + AbstractC26725a.m79497a(this.optionIcon, this.optionText.hashCode() * 31, 31)) * 31);
    }

    public final boolean isWarningItem() {
        return this.isWarningItem;
    }

    public final String toString() {
        return "MessageOptionItem(optionText=" + this.optionText + ", optionIcon=" + this.optionIcon + ", messageAction=" + this.messageAction + ", isWarningItem=" + this.isWarningItem + ")";
    }

    public /* synthetic */ MessageOptionItem(String str, Drawable drawable, MessageAction messageAction, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, drawable, messageAction, (i13 & 8) != 0 ? false : z4);
    }
}
