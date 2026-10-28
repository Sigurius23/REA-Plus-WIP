package io.getstream.chat.android.p226ui.feature.messages.list.adapter;

import com.whoop.service.network.model.UserState;
import no.nordicsemi.android.dfu.DfuBaseService;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b7\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 >2\u00020\u0001:\u0001>B\u0087\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0000H\u0086\u0002J\u0006\u0010'\u001a\u00020\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J©\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u0003HÆ\u0001J\u0013\u00109\u001a\u00020\u00032\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020;HÖ\u0001J\t\u0010<\u001a\u00020=HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0016R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0016¨\u0006?"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;", "", "text", "", "replyText", "reactions", "attachments", "replies", "syncStatus", "deleted", "positions", "pinned", UserState.Sources.USER, "mentions", "footer", "poll", "threadMode", "showOriginalText", "isMessageRead", "<init>", "(ZZZZZZZZZZZZZZZZ)V", "getText", "()Z", "getReplyText", "getReactions", "getAttachments", "getReplies", "getSyncStatus", "getDeleted", "getPositions", "getPinned", "getUser", "getMentions", "getFooter", "getPoll", "getThreadMode", "getShowOriginalText", "plus", "other", "anyChanged", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "equals", "hashCode", "", "toString", "", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class MessageListItemPayloadDiff {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final MessageListItemPayloadDiff EMPTY = new MessageListItemPayloadDiff(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
    private static final MessageListItemPayloadDiff FULL = new MessageListItemPayloadDiff(true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true);
    private final boolean attachments;
    private final boolean deleted;
    private final boolean footer;
    private final boolean isMessageRead;
    private final boolean mentions;
    private final boolean pinned;
    private final boolean poll;
    private final boolean positions;
    private final boolean reactions;
    private final boolean replies;
    private final boolean replyText;
    private final boolean showOriginalText;
    private final boolean syncStatus;
    private final boolean text;
    private final boolean threadMode;
    private final boolean user;

    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff$Companion;", "", "<init>", "()V", "EMPTY", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;", "getEMPTY", "()Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;", "FULL", "getFULL", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final MessageListItemPayloadDiff getEMPTY() {
            return MessageListItemPayloadDiff.EMPTY;
        }

        public final MessageListItemPayloadDiff getFULL() {
            return MessageListItemPayloadDiff.FULL;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public MessageListItemPayloadDiff(boolean z4, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, boolean z34, boolean z35) {
        this.text = z4;
        this.replyText = z13;
        this.reactions = z14;
        this.attachments = z15;
        this.replies = z16;
        this.syncStatus = z17;
        this.deleted = z18;
        this.positions = z19;
        this.pinned = z24;
        this.user = z25;
        this.mentions = z26;
        this.footer = z27;
        this.poll = z28;
        this.threadMode = z29;
        this.showOriginalText = z34;
        this.isMessageRead = z35;
    }

    public static MessageListItemPayloadDiff copy$default(MessageListItemPayloadDiff messageListItemPayloadDiff, boolean z4, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, boolean z34, boolean z35, int i13, Object obj) {
        boolean z36 = (i13 & 1) != 0 ? messageListItemPayloadDiff.text : z4;
        boolean z37 = (i13 & 2) != 0 ? messageListItemPayloadDiff.replyText : z13;
        boolean z38 = (i13 & 4) != 0 ? messageListItemPayloadDiff.reactions : z14;
        boolean z39 = (i13 & 8) != 0 ? messageListItemPayloadDiff.attachments : z15;
        boolean z44 = (i13 & 16) != 0 ? messageListItemPayloadDiff.replies : z16;
        boolean z45 = (i13 & 32) != 0 ? messageListItemPayloadDiff.syncStatus : z17;
        boolean z46 = (i13 & 64) != 0 ? messageListItemPayloadDiff.deleted : z18;
        boolean z47 = (i13 & 128) != 0 ? messageListItemPayloadDiff.positions : z19;
        boolean z48 = (i13 & 256) != 0 ? messageListItemPayloadDiff.pinned : z24;
        boolean z49 = (i13 & 512) != 0 ? messageListItemPayloadDiff.user : z25;
        boolean z52 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? messageListItemPayloadDiff.mentions : z26;
        boolean z54 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? messageListItemPayloadDiff.footer : z27;
        boolean z55 = (i13 & 4096) != 0 ? messageListItemPayloadDiff.poll : z28;
        boolean z56 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? messageListItemPayloadDiff.threadMode : z29;
        boolean z57 = z36;
        boolean z58 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? messageListItemPayloadDiff.showOriginalText : z34;
        boolean z59 = (i13 & 32768) != 0 ? messageListItemPayloadDiff.isMessageRead : z35;
        messageListItemPayloadDiff.getClass();
        return new MessageListItemPayloadDiff(z57, z37, z38, z39, z44, z45, z46, z47, z48, z49, z52, z54, z55, z56, z58, z59);
    }

    public final boolean anyChanged() {
        return !equals(EMPTY);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getMentions() {
        return this.mentions;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getFooter() {
        return this.footer;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getPoll() {
        return this.poll;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getThreadMode() {
        return this.threadMode;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final boolean getShowOriginalText() {
        return this.showOriginalText;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final boolean getIsMessageRead() {
        return this.isMessageRead;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getReplyText() {
        return this.replyText;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getReactions() {
        return this.reactions;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getAttachments() {
        return this.attachments;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getReplies() {
        return this.replies;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getSyncStatus() {
        return this.syncStatus;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getDeleted() {
        return this.deleted;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getPositions() {
        return this.positions;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getPinned() {
        return this.pinned;
    }

    public final MessageListItemPayloadDiff copy(boolean text, boolean replyText, boolean reactions, boolean attachments, boolean replies, boolean syncStatus, boolean deleted, boolean positions, boolean pinned, boolean user, boolean mentions, boolean footer, boolean poll, boolean threadMode, boolean showOriginalText, boolean isMessageRead) {
        return new MessageListItemPayloadDiff(text, replyText, reactions, attachments, replies, syncStatus, deleted, positions, pinned, user, mentions, footer, poll, threadMode, showOriginalText, isMessageRead);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageListItemPayloadDiff)) {
            return false;
        }
        MessageListItemPayloadDiff messageListItemPayloadDiff = (MessageListItemPayloadDiff) other;
        return this.text == messageListItemPayloadDiff.text && this.replyText == messageListItemPayloadDiff.replyText && this.reactions == messageListItemPayloadDiff.reactions && this.attachments == messageListItemPayloadDiff.attachments && this.replies == messageListItemPayloadDiff.replies && this.syncStatus == messageListItemPayloadDiff.syncStatus && this.deleted == messageListItemPayloadDiff.deleted && this.positions == messageListItemPayloadDiff.positions && this.pinned == messageListItemPayloadDiff.pinned && this.user == messageListItemPayloadDiff.user && this.mentions == messageListItemPayloadDiff.mentions && this.footer == messageListItemPayloadDiff.footer && this.poll == messageListItemPayloadDiff.poll && this.threadMode == messageListItemPayloadDiff.threadMode && this.showOriginalText == messageListItemPayloadDiff.showOriginalText && this.isMessageRead == messageListItemPayloadDiff.isMessageRead;
    }

    public final boolean getAttachments() {
        return this.attachments;
    }

    public final boolean getDeleted() {
        return this.deleted;
    }

    public final boolean getFooter() {
        return this.footer;
    }

    public final boolean getMentions() {
        return this.mentions;
    }

    public final boolean getPinned() {
        return this.pinned;
    }

    public final boolean getPoll() {
        return this.poll;
    }

    public final boolean getPositions() {
        return this.positions;
    }

    public final boolean getReactions() {
        return this.reactions;
    }

    public final boolean getReplies() {
        return this.replies;
    }

    public final boolean getReplyText() {
        return this.replyText;
    }

    public final boolean getShowOriginalText() {
        return this.showOriginalText;
    }

    public final boolean getSyncStatus() {
        return this.syncStatus;
    }

    public final boolean getText() {
        return this.text;
    }

    public final boolean getThreadMode() {
        return this.threadMode;
    }

    public final boolean getUser() {
        return this.user;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isMessageRead) + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(Boolean.hashCode(this.text) * 31, 31, this.replyText), 31, this.reactions), 31, this.attachments), 31, this.replies), 31, this.syncStatus), 31, this.deleted), 31, this.positions), 31, this.pinned), 31, this.user), 31, this.mentions), 31, this.footer), 31, this.poll), 31, this.threadMode), 31, this.showOriginalText);
    }

    public final boolean isMessageRead() {
        return this.isMessageRead;
    }

    public final MessageListItemPayloadDiff plus(MessageListItemPayloadDiff other) {
        AbstractC22676k.m65750j(other, "other");
        boolean z4 = true;
        boolean z13 = false;
        if (!this.text && !other.text) {
            z4 = false;
        }
        if (this.replyText || other.replyText) {
            z13 = z4;
        }
        if (this.reactions || other.reactions) {
            z13 = z4;
        }
        if (this.attachments || other.attachments) {
            z13 = z4;
        }
        if (this.replies || other.replies) {
            z13 = z4;
        }
        if (this.syncStatus || other.syncStatus) {
            z13 = z4;
        }
        if (this.deleted || other.deleted) {
            z13 = z4;
        }
        if (this.positions || other.positions) {
            z13 = z4;
        }
        if (this.pinned || other.pinned) {
            z13 = z4;
        }
        if (this.user || other.user) {
            z13 = z4;
        }
        if (this.mentions || other.mentions) {
            z13 = true;
        }
        return new MessageListItemPayloadDiff(z4, z13, z13, z13, z13, z13, z13, z13, z13, z13, z13, this.footer || other.footer, this.poll || other.poll, this.threadMode || other.threadMode, this.showOriginalText || other.showOriginalText, this.isMessageRead || other.isMessageRead);
    }

    public final String toString() {
        boolean z4 = this.text;
        boolean z13 = this.replyText;
        boolean z14 = this.reactions;
        boolean z15 = this.attachments;
        boolean z16 = this.replies;
        boolean z17 = this.syncStatus;
        boolean z18 = this.deleted;
        boolean z19 = this.positions;
        boolean z24 = this.pinned;
        boolean z25 = this.user;
        boolean z26 = this.mentions;
        boolean z27 = this.footer;
        boolean z28 = this.poll;
        boolean z29 = this.threadMode;
        boolean z34 = this.showOriginalText;
        boolean z35 = this.isMessageRead;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("MessageListItemPayloadDiff(text=", ", replyText=", ", reactions=", z4, z13);
        AbstractC38963t7.m124392v(sbM32002u, z14, ", attachments=", z15, ", replies=");
        AbstractC38963t7.m124392v(sbM32002u, z16, ", syncStatus=", z17, ", deleted=");
        AbstractC38963t7.m124392v(sbM32002u, z18, ", positions=", z19, ", pinned=");
        AbstractC38963t7.m124392v(sbM32002u, z24, ", user=", z25, ", mentions=");
        AbstractC38963t7.m124392v(sbM32002u, z26, ", footer=", z27, ", poll=");
        AbstractC38963t7.m124392v(sbM32002u, z28, ", threadMode=", z29, ", showOriginalText=");
        return AbstractC36095b.m114682j(sbM32002u, z34, ", isMessageRead=", z35, ")");
    }
}
