package io.getstream.chat.android.p226ui.common.feature.channel.info;

import hc3.AbstractC17176i;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.Message;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0013\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0082\u0001\u0013\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'¨\u0006(À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction;", "", "ExpandMembersClick", "CollapseMembersClick", "MemberClick", "RenameChannelClick", "PinnedMessagesClick", "MediaAttachmentsClick", "FilesAttachmentsClick", "MuteChannelClick", "UnmuteChannelClick", "MuteUserClick", "UnmuteUserClick", "BlockUserClick", "UnblockUserClick", "LeaveChannelClick", "LeaveChannelConfirmationClick", "DeleteChannelClick", "DeleteChannelConfirmationClick", "BanMemberConfirmationClick", "RemoveMemberConfirmationClick", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$BanMemberConfirmationClick;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$BlockUserClick;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$CollapseMembersClick;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$DeleteChannelClick;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$DeleteChannelConfirmationClick;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$ExpandMembersClick;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$FilesAttachmentsClick;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$LeaveChannelClick;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$LeaveChannelConfirmationClick;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$MediaAttachmentsClick;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$MemberClick;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$MuteChannelClick;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$MuteUserClick;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$PinnedMessagesClick;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$RemoveMemberConfirmationClick;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$RenameChannelClick;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$UnblockUserClick;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$UnmuteChannelClick;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$UnmuteUserClick;", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface ChannelInfoViewAction {

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$BanMemberConfirmationClick;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction;", "memberId", "", "timeoutInMinutes", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getMemberId", "()Ljava/lang/String;", "getTimeoutInMinutes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$BanMemberConfirmationClick;", "equals", "", "other", "", "hashCode", "toString", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class BanMemberConfirmationClick implements ChannelInfoViewAction {
        public static final int $stable = 0;
        private final String memberId;
        private final Integer timeoutInMinutes;

        public BanMemberConfirmationClick(String memberId, Integer num) {
            AbstractC22676k.m65750j(memberId, "memberId");
            this.memberId = memberId;
            this.timeoutInMinutes = num;
        }

        public static /* synthetic */ BanMemberConfirmationClick copy$default(BanMemberConfirmationClick banMemberConfirmationClick, String str, Integer num, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = banMemberConfirmationClick.memberId;
            }
            if ((i13 & 2) != 0) {
                num = banMemberConfirmationClick.timeoutInMinutes;
            }
            return banMemberConfirmationClick.copy(str, num);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMemberId() {
            return this.memberId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Integer getTimeoutInMinutes() {
            return this.timeoutInMinutes;
        }

        public final BanMemberConfirmationClick copy(String memberId, Integer timeoutInMinutes) {
            AbstractC22676k.m65750j(memberId, "memberId");
            return new BanMemberConfirmationClick(memberId, timeoutInMinutes);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BanMemberConfirmationClick)) {
                return false;
            }
            BanMemberConfirmationClick banMemberConfirmationClick = (BanMemberConfirmationClick) other;
            return AbstractC22676k.m65745e(this.memberId, banMemberConfirmationClick.memberId) && AbstractC22676k.m65745e(this.timeoutInMinutes, banMemberConfirmationClick.timeoutInMinutes);
        }

        public final String getMemberId() {
            return this.memberId;
        }

        public final Integer getTimeoutInMinutes() {
            return this.timeoutInMinutes;
        }

        public final int hashCode() {
            int iHashCode = this.memberId.hashCode() * 31;
            Integer num = this.timeoutInMinutes;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            return "BanMemberConfirmationClick(memberId=" + this.memberId + ", timeoutInMinutes=" + this.timeoutInMinutes + ")";
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$BlockUserClick;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class BlockUserClick implements ChannelInfoViewAction {
        public static final int $stable = 0;
        public static final BlockUserClick INSTANCE = new BlockUserClick();

        private BlockUserClick() {
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof BlockUserClick);
        }

        public final int hashCode() {
            return -499295183;
        }

        public final String toString() {
            return "BlockUserClick";
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$CollapseMembersClick;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class CollapseMembersClick implements ChannelInfoViewAction {
        public static final int $stable = 0;
        public static final CollapseMembersClick INSTANCE = new CollapseMembersClick();

        private CollapseMembersClick() {
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof CollapseMembersClick);
        }

        public final int hashCode() {
            return 2071641405;
        }

        public final String toString() {
            return "CollapseMembersClick";
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$DeleteChannelClick;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class DeleteChannelClick implements ChannelInfoViewAction {
        public static final int $stable = 0;
        public static final DeleteChannelClick INSTANCE = new DeleteChannelClick();

        private DeleteChannelClick() {
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof DeleteChannelClick);
        }

        public final int hashCode() {
            return -790655791;
        }

        public final String toString() {
            return "DeleteChannelClick";
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$DeleteChannelConfirmationClick;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class DeleteChannelConfirmationClick implements ChannelInfoViewAction {
        public static final int $stable = 0;
        public static final DeleteChannelConfirmationClick INSTANCE = new DeleteChannelConfirmationClick();

        private DeleteChannelConfirmationClick() {
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof DeleteChannelConfirmationClick);
        }

        public final int hashCode() {
            return -443497444;
        }

        public final String toString() {
            return "DeleteChannelConfirmationClick";
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$ExpandMembersClick;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class ExpandMembersClick implements ChannelInfoViewAction {
        public static final int $stable = 0;
        public static final ExpandMembersClick INSTANCE = new ExpandMembersClick();

        private ExpandMembersClick() {
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof ExpandMembersClick);
        }

        public final int hashCode() {
            return -1704474390;
        }

        public final String toString() {
            return "ExpandMembersClick";
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$FilesAttachmentsClick;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class FilesAttachmentsClick implements ChannelInfoViewAction {
        public static final int $stable = 0;
        public static final FilesAttachmentsClick INSTANCE = new FilesAttachmentsClick();

        private FilesAttachmentsClick() {
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof FilesAttachmentsClick);
        }

        public final int hashCode() {
            return 846666606;
        }

        public final String toString() {
            return "FilesAttachmentsClick";
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$LeaveChannelClick;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class LeaveChannelClick implements ChannelInfoViewAction {
        public static final int $stable = 0;
        public static final LeaveChannelClick INSTANCE = new LeaveChannelClick();

        private LeaveChannelClick() {
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof LeaveChannelClick);
        }

        public final int hashCode() {
            return -235879109;
        }

        public final String toString() {
            return "LeaveChannelClick";
        }
    }

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$LeaveChannelConfirmationClick;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction;", "quitMessage", "Lio/getstream/chat/android/models/Message;", "<init>", "(Lio/getstream/chat/android/models/Message;)V", "getQuitMessage", "()Lio/getstream/chat/android/models/Message;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class LeaveChannelConfirmationClick implements ChannelInfoViewAction {
        public static final int $stable = 0;
        private final Message quitMessage;

        public LeaveChannelConfirmationClick(Message message) {
            this.quitMessage = message;
        }

        public static LeaveChannelConfirmationClick copy$default(LeaveChannelConfirmationClick leaveChannelConfirmationClick, Message message, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                message = leaveChannelConfirmationClick.quitMessage;
            }
            leaveChannelConfirmationClick.getClass();
            return new LeaveChannelConfirmationClick(message);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Message getQuitMessage() {
            return this.quitMessage;
        }

        public final LeaveChannelConfirmationClick copy(Message quitMessage) {
            return new LeaveChannelConfirmationClick(quitMessage);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LeaveChannelConfirmationClick) && AbstractC22676k.m65745e(this.quitMessage, ((LeaveChannelConfirmationClick) other).quitMessage);
        }

        public final Message getQuitMessage() {
            return this.quitMessage;
        }

        public final int hashCode() {
            Message message = this.quitMessage;
            if (message == null) {
                return 0;
            }
            return message.hashCode();
        }

        public final String toString() {
            return AbstractC17176i.m48501c(this.quitMessage, "LeaveChannelConfirmationClick(quitMessage=", ")");
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$MediaAttachmentsClick;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class MediaAttachmentsClick implements ChannelInfoViewAction {
        public static final int $stable = 0;
        public static final MediaAttachmentsClick INSTANCE = new MediaAttachmentsClick();

        private MediaAttachmentsClick() {
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof MediaAttachmentsClick);
        }

        public final int hashCode() {
            return -450799909;
        }

        public final String toString() {
            return "MediaAttachmentsClick";
        }
    }

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$MemberClick;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction;", "member", "Lio/getstream/chat/android/models/Member;", "<init>", "(Lio/getstream/chat/android/models/Member;)V", "getMember", "()Lio/getstream/chat/android/models/Member;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class MemberClick implements ChannelInfoViewAction {
        public static final int $stable = 0;
        private final Member member;

        public MemberClick(Member member) {
            AbstractC22676k.m65750j(member, "member");
            this.member = member;
        }

        public static /* synthetic */ MemberClick copy$default(MemberClick memberClick, Member member, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                member = memberClick.member;
            }
            return memberClick.copy(member);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Member getMember() {
            return this.member;
        }

        public final MemberClick copy(Member member) {
            AbstractC22676k.m65750j(member, "member");
            return new MemberClick(member);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MemberClick) && AbstractC22676k.m65745e(this.member, ((MemberClick) other).member);
        }

        public final Member getMember() {
            return this.member;
        }

        public final int hashCode() {
            return this.member.hashCode();
        }

        public final String toString() {
            return "MemberClick(member=" + this.member + ")";
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$MuteChannelClick;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class MuteChannelClick implements ChannelInfoViewAction {
        public static final int $stable = 0;
        public static final MuteChannelClick INSTANCE = new MuteChannelClick();

        private MuteChannelClick() {
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof MuteChannelClick);
        }

        public final int hashCode() {
            return -1340178305;
        }

        public final String toString() {
            return "MuteChannelClick";
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$MuteUserClick;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class MuteUserClick implements ChannelInfoViewAction {
        public static final int $stable = 0;
        public static final MuteUserClick INSTANCE = new MuteUserClick();

        private MuteUserClick() {
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof MuteUserClick);
        }

        public final int hashCode() {
            return 1575308419;
        }

        public final String toString() {
            return "MuteUserClick";
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$PinnedMessagesClick;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class PinnedMessagesClick implements ChannelInfoViewAction {
        public static final int $stable = 0;
        public static final PinnedMessagesClick INSTANCE = new PinnedMessagesClick();

        private PinnedMessagesClick() {
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof PinnedMessagesClick);
        }

        public final int hashCode() {
            return 138685827;
        }

        public final String toString() {
            return "PinnedMessagesClick";
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$RemoveMemberConfirmationClick;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction;", "memberId", "", "<init>", "(Ljava/lang/String;)V", "getMemberId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class RemoveMemberConfirmationClick implements ChannelInfoViewAction {
        public static final int $stable = 0;
        private final String memberId;

        public RemoveMemberConfirmationClick(String memberId) {
            AbstractC22676k.m65750j(memberId, "memberId");
            this.memberId = memberId;
        }

        public static /* synthetic */ RemoveMemberConfirmationClick copy$default(RemoveMemberConfirmationClick removeMemberConfirmationClick, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = removeMemberConfirmationClick.memberId;
            }
            return removeMemberConfirmationClick.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMemberId() {
            return this.memberId;
        }

        public final RemoveMemberConfirmationClick copy(String memberId) {
            AbstractC22676k.m65750j(memberId, "memberId");
            return new RemoveMemberConfirmationClick(memberId);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RemoveMemberConfirmationClick) && AbstractC22676k.m65745e(this.memberId, ((RemoveMemberConfirmationClick) other).memberId);
        }

        public final String getMemberId() {
            return this.memberId;
        }

        public final int hashCode() {
            return this.memberId.hashCode();
        }

        public final String toString() {
            return AbstractC11895b.m31996o("RemoveMemberConfirmationClick(memberId=", this.memberId, ")");
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$RenameChannelClick;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction;", "name", "", "<init>", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class RenameChannelClick implements ChannelInfoViewAction {
        public static final int $stable = 0;
        private final String name;

        public RenameChannelClick(String name) {
            AbstractC22676k.m65750j(name, "name");
            this.name = name;
        }

        public static /* synthetic */ RenameChannelClick copy$default(RenameChannelClick renameChannelClick, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = renameChannelClick.name;
            }
            return renameChannelClick.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final RenameChannelClick copy(String name) {
            AbstractC22676k.m65750j(name, "name");
            return new RenameChannelClick(name);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RenameChannelClick) && AbstractC22676k.m65745e(this.name, ((RenameChannelClick) other).name);
        }

        public final String getName() {
            return this.name;
        }

        public final int hashCode() {
            return this.name.hashCode();
        }

        public final String toString() {
            return AbstractC11895b.m31996o("RenameChannelClick(name=", this.name, ")");
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$UnblockUserClick;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class UnblockUserClick implements ChannelInfoViewAction {
        public static final int $stable = 0;
        public static final UnblockUserClick INSTANCE = new UnblockUserClick();

        private UnblockUserClick() {
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof UnblockUserClick);
        }

        public final int hashCode() {
            return 2005794506;
        }

        public final String toString() {
            return "UnblockUserClick";
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$UnmuteChannelClick;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class UnmuteChannelClick implements ChannelInfoViewAction {
        public static final int $stable = 0;
        public static final UnmuteChannelClick INSTANCE = new UnmuteChannelClick();

        private UnmuteChannelClick() {
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof UnmuteChannelClick);
        }

        public final int hashCode() {
            return 869327064;
        }

        public final String toString() {
            return "UnmuteChannelClick";
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$UnmuteUserClick;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class UnmuteUserClick implements ChannelInfoViewAction {
        public static final int $stable = 0;
        public static final UnmuteUserClick INSTANCE = new UnmuteUserClick();

        private UnmuteUserClick() {
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof UnmuteUserClick);
        }

        public final int hashCode() {
            return -283544886;
        }

        public final String toString() {
            return "UnmuteUserClick";
        }
    }
}
