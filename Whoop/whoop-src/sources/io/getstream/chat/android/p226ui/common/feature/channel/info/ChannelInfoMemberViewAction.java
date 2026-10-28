package io.getstream.chat.android.p226ui.common.feature.channel.info;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewAction;", "", "MessageMemberClick", "BanMemberClick", "UnbanMemberClick", "MuteUserClick", "UnmuteUserClick", "BlockUserClick", "UnblockUserClick", "RemoveMemberClick", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewAction$BanMemberClick;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewAction$BlockUserClick;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewAction$MessageMemberClick;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewAction$MuteUserClick;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewAction$RemoveMemberClick;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewAction$UnbanMemberClick;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewAction$UnblockUserClick;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewAction$UnmuteUserClick;", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface ChannelInfoMemberViewAction {

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewAction$BanMemberClick;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class BanMemberClick implements ChannelInfoMemberViewAction {
        public static final int $stable = 0;
        public static final BanMemberClick INSTANCE = new BanMemberClick();

        private BanMemberClick() {
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof BanMemberClick);
        }

        public final int hashCode() {
            return -2067215034;
        }

        public final String toString() {
            return "BanMemberClick";
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewAction$BlockUserClick;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class BlockUserClick implements ChannelInfoMemberViewAction {
        public static final int $stable = 0;
        public static final BlockUserClick INSTANCE = new BlockUserClick();

        private BlockUserClick() {
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof BlockUserClick);
        }

        public final int hashCode() {
            return 1359302711;
        }

        public final String toString() {
            return "BlockUserClick";
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewAction$MessageMemberClick;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class MessageMemberClick implements ChannelInfoMemberViewAction {
        public static final int $stable = 0;
        public static final MessageMemberClick INSTANCE = new MessageMemberClick();

        private MessageMemberClick() {
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof MessageMemberClick);
        }

        public final int hashCode() {
            return -996580658;
        }

        public final String toString() {
            return "MessageMemberClick";
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewAction$MuteUserClick;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class MuteUserClick implements ChannelInfoMemberViewAction {
        public static final int $stable = 0;
        public static final MuteUserClick INSTANCE = new MuteUserClick();

        private MuteUserClick() {
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof MuteUserClick);
        }

        public final int hashCode() {
            return 803979197;
        }

        public final String toString() {
            return "MuteUserClick";
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewAction$RemoveMemberClick;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class RemoveMemberClick implements ChannelInfoMemberViewAction {
        public static final int $stable = 0;
        public static final RemoveMemberClick INSTANCE = new RemoveMemberClick();

        private RemoveMemberClick() {
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof RemoveMemberClick);
        }

        public final int hashCode() {
            return 648515779;
        }

        public final String toString() {
            return "RemoveMemberClick";
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewAction$UnbanMemberClick;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class UnbanMemberClick implements ChannelInfoMemberViewAction {
        public static final int $stable = 0;
        public static final UnbanMemberClick INSTANCE = new UnbanMemberClick();

        private UnbanMemberClick() {
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof UnbanMemberClick);
        }

        public final int hashCode() {
            return -2014542241;
        }

        public final String toString() {
            return "UnbanMemberClick";
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewAction$UnblockUserClick;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class UnblockUserClick implements ChannelInfoMemberViewAction {
        public static final int $stable = 0;
        public static final UnblockUserClick INSTANCE = new UnblockUserClick();

        private UnblockUserClick() {
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof UnblockUserClick);
        }

        public final int hashCode() {
            return 1411975504;
        }

        public final String toString() {
            return "UnblockUserClick";
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewAction$UnmuteUserClick;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class UnmuteUserClick implements ChannelInfoMemberViewAction {
        public static final int $stable = 0;
        public static final UnmuteUserClick INSTANCE = new UnmuteUserClick();

        private UnmuteUserClick() {
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof UnmuteUserClick);
        }

        public final int hashCode() {
            return 1498414980;
        }

        public final String toString() {
            return "UnmuteUserClick";
        }
    }
}
