package io.getstream.chat.android.p226ui.common.feature.channel.info;

import ge3.AbstractC15751g;
import io.getstream.chat.android.models.Member;
import java.util.List;
import m83.AbstractC25265s;
import org.joda.time.DateTimeConstants;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u001f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f \u0082\u0001\u0007!\"#$%&'¨\u0006(À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent;", "", "Modal", "LeaveChannelModal", "DeleteChannelModal", "MemberInfoModal", "BanMemberModal", "RemoveMemberModal", "MuteUser", "UnmuteUser", "BlockUser", "UnblockUser", "Navigation", "NavigateUp", "NavigateToPinnedMessages", "NavigateToMediaAttachments", "NavigateToFilesAttachments", "NavigateToChannel", "NavigateToDraftChannel", "Error", "RenameChannelError", "MuteChannelError", "MuteUserError", "UnmuteUserError", "BlockUserError", "UnblockUserError", "UnmuteChannelError", "LeaveChannelError", "DeleteChannelError", "BanMemberError", "UnbanMemberError", "RemoveMemberError", "AddMembersError", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BlockUser;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Error;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Modal;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$MuteUser;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Navigation;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$UnblockUser;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$UnmuteUser;", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface ChannelInfoViewEvent {

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$AddMembersError;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Error;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class AddMembersError implements Error {
        public static final int $stable = 0;
        public static final AddMembersError INSTANCE = new AddMembersError();

        private AddMembersError() {
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof AddMembersError);
        }

        public final int hashCode() {
            return 208897829;
        }

        public final String toString() {
            return "AddMembersError";
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberError;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Error;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class BanMemberError implements Error {
        public static final int $stable = 0;
        public static final BanMemberError INSTANCE = new BanMemberError();

        private BanMemberError() {
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof BanMemberError);
        }

        public final int hashCode() {
            return -1555513878;
        }

        public final String toString() {
            return "BanMemberError";
        }
    }

    @Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Modal;", "member", "Lio/getstream/chat/android/models/Member;", "<init>", "(Lio/getstream/chat/android/models/Member;)V", "getMember", "()Lio/getstream/chat/android/models/Member;", "timeouts", "", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal$Timeout;", "getTimeouts", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Timeout", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class BanMemberModal implements Modal {
        public static final int $stable = 8;
        private final Member member;
        private final List<Timeout> timeouts;

        @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal$Timeout;", "", "valueInMinutes", "", "<init>", "(Ljava/lang/String;ILjava/lang/Integer;)V", "getValueInMinutes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "OneHour", "OneDay", "OneWeek", "NoTimeout", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public enum Timeout {
            OneHour(60),
            OneDay(Integer.valueOf(DateTimeConstants.MINUTES_PER_DAY)),
            OneWeek(Integer.valueOf(DateTimeConstants.MINUTES_PER_WEEK)),
            NoTimeout(null);

            private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
            private final Integer valueInMinutes;

            Timeout(Integer num) {
                this.valueInMinutes = num;
            }

            public static InterfaceC33616a getEntries() {
                return $ENTRIES;
            }

            public final Integer getValueInMinutes() {
                return this.valueInMinutes;
            }
        }

        public BanMemberModal(Member member) {
            AbstractC22676k.m65750j(member, "member");
            this.member = member;
            this.timeouts = AbstractC25265s.m74093D1(Timeout.getEntries());
        }

        public static /* synthetic */ BanMemberModal copy$default(BanMemberModal banMemberModal, Member member, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                member = banMemberModal.member;
            }
            return banMemberModal.copy(member);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Member getMember() {
            return this.member;
        }

        public final BanMemberModal copy(Member member) {
            AbstractC22676k.m65750j(member, "member");
            return new BanMemberModal(member);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BanMemberModal) && AbstractC22676k.m65745e(this.member, ((BanMemberModal) other).member);
        }

        public final Member getMember() {
            return this.member;
        }

        public final List<Timeout> getTimeouts() {
            return this.timeouts;
        }

        public final int hashCode() {
            return this.member.hashCode();
        }

        public final String toString() {
            return "BanMemberModal(member=" + this.member + ")";
        }
    }

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BlockUser;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent;", "member", "Lio/getstream/chat/android/models/Member;", "<init>", "(Lio/getstream/chat/android/models/Member;)V", "getMember", "()Lio/getstream/chat/android/models/Member;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class BlockUser implements ChannelInfoViewEvent {
        public static final int $stable = 0;
        private final Member member;

        public BlockUser(Member member) {
            AbstractC22676k.m65750j(member, "member");
            this.member = member;
        }

        public static /* synthetic */ BlockUser copy$default(BlockUser blockUser, Member member, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                member = blockUser.member;
            }
            return blockUser.copy(member);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Member getMember() {
            return this.member;
        }

        public final BlockUser copy(Member member) {
            AbstractC22676k.m65750j(member, "member");
            return new BlockUser(member);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BlockUser) && AbstractC22676k.m65745e(this.member, ((BlockUser) other).member);
        }

        public final Member getMember() {
            return this.member;
        }

        public final int hashCode() {
            return this.member.hashCode();
        }

        public final String toString() {
            return "BlockUser(member=" + this.member + ")";
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BlockUserError;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Error;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class BlockUserError implements Error {
        public static final int $stable = 0;
        public static final BlockUserError INSTANCE = new BlockUserError();

        private BlockUserError() {
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof BlockUserError);
        }

        public final int hashCode() {
            return 1871003867;
        }

        public final String toString() {
            return "BlockUserError";
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$DeleteChannelError;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Error;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class DeleteChannelError implements Error {
        public static final int $stable = 0;
        public static final DeleteChannelError INSTANCE = new DeleteChannelError();

        private DeleteChannelError() {
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof DeleteChannelError);
        }

        public final int hashCode() {
            return 1883982971;
        }

        public final String toString() {
            return "DeleteChannelError";
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$DeleteChannelModal;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Modal;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class DeleteChannelModal implements Modal {
        public static final int $stable = 0;
        public static final DeleteChannelModal INSTANCE = new DeleteChannelModal();

        private DeleteChannelModal() {
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof DeleteChannelModal);
        }

        public final int hashCode() {
            return 1891267872;
        }

        public final String toString() {
            return "DeleteChannelModal";
        }
    }

    @Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e¨\u0006\u000fÀ\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Error;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$AddMembersError;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberError;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BlockUserError;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$DeleteChannelError;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$LeaveChannelError;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$MuteChannelError;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$MuteUserError;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$RemoveMemberError;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$RenameChannelError;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$UnbanMemberError;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$UnblockUserError;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$UnmuteChannelError;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$UnmuteUserError;", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface Error extends ChannelInfoViewEvent {
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$LeaveChannelError;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Error;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class LeaveChannelError implements Error {
        public static final int $stable = 0;
        public static final LeaveChannelError INSTANCE = new LeaveChannelError();

        private LeaveChannelError() {
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof LeaveChannelError);
        }

        public final int hashCode() {
            return -701820591;
        }

        public final String toString() {
            return "LeaveChannelError";
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$LeaveChannelModal;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Modal;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class LeaveChannelModal implements Modal {
        public static final int $stable = 0;
        public static final LeaveChannelModal INSTANCE = new LeaveChannelModal();

        private LeaveChannelModal() {
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof LeaveChannelModal);
        }

        public final int hashCode() {
            return -694535690;
        }

        public final String toString() {
            return "LeaveChannelModal";
        }
    }

    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$MemberInfoModal;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Modal;", "cid", "", "member", "Lio/getstream/chat/android/models/Member;", "<init>", "(Ljava/lang/String;Lio/getstream/chat/android/models/Member;)V", "getCid", "()Ljava/lang/String;", "getMember", "()Lio/getstream/chat/android/models/Member;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class MemberInfoModal implements Modal {
        public static final int $stable = 0;
        private final String cid;
        private final Member member;

        public MemberInfoModal(String cid, Member member) {
            AbstractC22676k.m65750j(cid, "cid");
            AbstractC22676k.m65750j(member, "member");
            this.cid = cid;
            this.member = member;
        }

        public static /* synthetic */ MemberInfoModal copy$default(MemberInfoModal memberInfoModal, String str, Member member, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = memberInfoModal.cid;
            }
            if ((i13 & 2) != 0) {
                member = memberInfoModal.member;
            }
            return memberInfoModal.copy(str, member);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCid() {
            return this.cid;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Member getMember() {
            return this.member;
        }

        public final MemberInfoModal copy(String cid, Member member) {
            AbstractC22676k.m65750j(cid, "cid");
            AbstractC22676k.m65750j(member, "member");
            return new MemberInfoModal(cid, member);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MemberInfoModal)) {
                return false;
            }
            MemberInfoModal memberInfoModal = (MemberInfoModal) other;
            return AbstractC22676k.m65745e(this.cid, memberInfoModal.cid) && AbstractC22676k.m65745e(this.member, memberInfoModal.member);
        }

        public final String getCid() {
            return this.cid;
        }

        public final Member getMember() {
            return this.member;
        }

        public final int hashCode() {
            return this.member.hashCode() + (this.cid.hashCode() * 31);
        }

        public final String toString() {
            return "MemberInfoModal(cid=" + this.cid + ", member=" + this.member + ")";
        }
    }

    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Modal;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$DeleteChannelModal;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$LeaveChannelModal;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$MemberInfoModal;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$RemoveMemberModal;", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface Modal extends ChannelInfoViewEvent {
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$MuteChannelError;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Error;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class MuteChannelError implements Error {
        public static final int $stable = 0;
        public static final MuteChannelError INSTANCE = new MuteChannelError();

        private MuteChannelError() {
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof MuteChannelError);
        }

        public final int hashCode() {
            return -1768881495;
        }

        public final String toString() {
            return "MuteChannelError";
        }
    }

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$MuteUser;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent;", "member", "Lio/getstream/chat/android/models/Member;", "<init>", "(Lio/getstream/chat/android/models/Member;)V", "getMember", "()Lio/getstream/chat/android/models/Member;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class MuteUser implements ChannelInfoViewEvent {
        public static final int $stable = 0;
        private final Member member;

        public MuteUser(Member member) {
            AbstractC22676k.m65750j(member, "member");
            this.member = member;
        }

        public static /* synthetic */ MuteUser copy$default(MuteUser muteUser, Member member, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                member = muteUser.member;
            }
            return muteUser.copy(member);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Member getMember() {
            return this.member;
        }

        public final MuteUser copy(Member member) {
            AbstractC22676k.m65750j(member, "member");
            return new MuteUser(member);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MuteUser) && AbstractC22676k.m65745e(this.member, ((MuteUser) other).member);
        }

        public final Member getMember() {
            return this.member;
        }

        public final int hashCode() {
            return this.member.hashCode();
        }

        public final String toString() {
            return "MuteUser(member=" + this.member + ")";
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$MuteUserError;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Error;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class MuteUserError implements Error {
        public static final int $stable = 0;
        public static final MuteUserError INSTANCE = new MuteUserError();

        private MuteUserError() {
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof MuteUserError);
        }

        public final int hashCode() {
            return -978660455;
        }

        public final String toString() {
            return "MuteUserError";
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$NavigateToChannel;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Navigation;", "cid", "", "<init>", "(Ljava/lang/String;)V", "getCid", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class NavigateToChannel extends Navigation {
        public static final int $stable = 8;
        private final String cid;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public NavigateToChannel(String cid) {
            super(null, 0 == true ? 1 : 0);
            AbstractC22676k.m65750j(cid, "cid");
            this.cid = cid;
        }

        public static /* synthetic */ NavigateToChannel copy$default(NavigateToChannel navigateToChannel, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = navigateToChannel.cid;
            }
            return navigateToChannel.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCid() {
            return this.cid;
        }

        public final NavigateToChannel copy(String cid) {
            AbstractC22676k.m65750j(cid, "cid");
            return new NavigateToChannel(cid);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NavigateToChannel) && AbstractC22676k.m65745e(this.cid, ((NavigateToChannel) other).cid);
        }

        public final String getCid() {
            return this.cid;
        }

        public final int hashCode() {
            return this.cid.hashCode();
        }

        public final String toString() {
            return AbstractC11895b.m31996o("NavigateToChannel(cid=", this.cid, ")");
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$NavigateToDraftChannel;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Navigation;", "memberId", "", "<init>", "(Ljava/lang/String;)V", "getMemberId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class NavigateToDraftChannel extends Navigation {
        public static final int $stable = 8;
        private final String memberId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public NavigateToDraftChannel(String memberId) {
            super(null, 0 == true ? 1 : 0);
            AbstractC22676k.m65750j(memberId, "memberId");
            this.memberId = memberId;
        }

        public static /* synthetic */ NavigateToDraftChannel copy$default(NavigateToDraftChannel navigateToDraftChannel, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = navigateToDraftChannel.memberId;
            }
            return navigateToDraftChannel.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMemberId() {
            return this.memberId;
        }

        public final NavigateToDraftChannel copy(String memberId) {
            AbstractC22676k.m65750j(memberId, "memberId");
            return new NavigateToDraftChannel(memberId);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NavigateToDraftChannel) && AbstractC22676k.m65745e(this.memberId, ((NavigateToDraftChannel) other).memberId);
        }

        public final String getMemberId() {
            return this.memberId;
        }

        public final int hashCode() {
            return this.memberId.hashCode();
        }

        public final String toString() {
            return AbstractC11895b.m31996o("NavigateToDraftChannel(memberId=", this.memberId, ")");
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$NavigateToFilesAttachments;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Navigation;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class NavigateToFilesAttachments extends Navigation {
        public static final NavigateToFilesAttachments INSTANCE = new NavigateToFilesAttachments(null, 0 == true ? 1 : 0);
        public static final int $stable = 8;

        /* JADX WARN: Multi-variable type inference failed */
        private NavigateToFilesAttachments() {
            super(null, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof NavigateToFilesAttachments);
        }

        public final int hashCode() {
            return -1196790256;
        }

        public final String toString() {
            return "NavigateToFilesAttachments";
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$NavigateToMediaAttachments;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Navigation;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class NavigateToMediaAttachments extends Navigation {
        public static final NavigateToMediaAttachments INSTANCE = new NavigateToMediaAttachments(null, 0 == true ? 1 : 0);
        public static final int $stable = 8;

        /* JADX WARN: Multi-variable type inference failed */
        private NavigateToMediaAttachments() {
            super(null, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof NavigateToMediaAttachments);
        }

        public final int hashCode() {
            return -1663434109;
        }

        public final String toString() {
            return "NavigateToMediaAttachments";
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$NavigateToPinnedMessages;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Navigation;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class NavigateToPinnedMessages extends Navigation {
        public static final NavigateToPinnedMessages INSTANCE = new NavigateToPinnedMessages(null, 0 == true ? 1 : 0);
        public static final int $stable = 8;

        /* JADX WARN: Multi-variable type inference failed */
        private NavigateToPinnedMessages() {
            super(null, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof NavigateToPinnedMessages);
        }

        public final int hashCode() {
            return 1114087515;
        }

        public final String toString() {
            return "NavigateToPinnedMessages";
        }
    }

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$NavigateUp;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Navigation;", "reason", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Navigation$Reason;", "<init>", "(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Navigation$Reason;)V", "getReason", "()Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Navigation$Reason;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class NavigateUp extends Navigation {
        public static final int $stable = 0;
        private final Navigation.Reason reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateUp(Navigation.Reason reason) {
            super(reason, null);
            AbstractC22676k.m65750j(reason, "reason");
            this.reason = reason;
        }

        public static /* synthetic */ NavigateUp copy$default(NavigateUp navigateUp, Navigation.Reason reason, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                reason = navigateUp.reason;
            }
            return navigateUp.copy(reason);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Navigation.Reason getReason() {
            return this.reason;
        }

        public final NavigateUp copy(Navigation.Reason reason) {
            AbstractC22676k.m65750j(reason, "reason");
            return new NavigateUp(reason);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NavigateUp) && AbstractC22676k.m65745e(this.reason, ((NavigateUp) other).reason);
        }

        @Override // io.getstream.chat.android.ui.common.feature.channel.info.ChannelInfoViewEvent.Navigation
        public final Navigation.Reason getReason() {
            return this.reason;
        }

        public final int hashCode() {
            return this.reason.hashCode();
        }

        public final String toString() {
            return "NavigateUp(reason=" + this.reason + ")";
        }
    }

    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\bB\u0013\b\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Navigation;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent;", "reason", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Navigation$Reason;", "<init>", "(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Navigation$Reason;)V", "getReason", "()Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Navigation$Reason;", "Reason", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$NavigateToChannel;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$NavigateToDraftChannel;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$NavigateToFilesAttachments;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$NavigateToMediaAttachments;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$NavigateToPinnedMessages;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$NavigateUp;", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static abstract class Navigation implements ChannelInfoViewEvent {
        public static final int $stable = 8;
        private final Reason reason;

        @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Navigation$Reason;", "", "LeaveChannelSuccess", "DeleteChannelSuccess", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Navigation$Reason$DeleteChannelSuccess;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Navigation$Reason$LeaveChannelSuccess;", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public interface Reason {

            @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Navigation$Reason$DeleteChannelSuccess;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Navigation$Reason;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
            public static final /* data */ class DeleteChannelSuccess implements Reason {
                public static final int $stable = 0;
                public static final DeleteChannelSuccess INSTANCE = new DeleteChannelSuccess();

                private DeleteChannelSuccess() {
                }

                public final boolean equals(Object other) {
                    return this == other || (other instanceof DeleteChannelSuccess);
                }

                public final int hashCode() {
                    return 5744006;
                }

                public final String toString() {
                    return "DeleteChannelSuccess";
                }
            }

            @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Navigation$Reason$LeaveChannelSuccess;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Navigation$Reason;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
            public static final /* data */ class LeaveChannelSuccess implements Reason {
                public static final int $stable = 0;
                public static final LeaveChannelSuccess INSTANCE = new LeaveChannelSuccess();

                private LeaveChannelSuccess() {
                }

                public final boolean equals(Object other) {
                    return this == other || (other instanceof LeaveChannelSuccess);
                }

                public final int hashCode() {
                    return -1144431812;
                }

                public final String toString() {
                    return "LeaveChannelSuccess";
                }
            }
        }

        public /* synthetic */ Navigation(Reason reason, DefaultConstructorMarker defaultConstructorMarker) {
            this(reason);
        }

        public Reason getReason() {
            return this.reason;
        }

        private Navigation(Reason reason) {
            this.reason = reason;
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$RemoveMemberError;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Error;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class RemoveMemberError implements Error {
        public static final int $stable = 0;
        public static final RemoveMemberError INSTANCE = new RemoveMemberError();

        private RemoveMemberError() {
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof RemoveMemberError);
        }

        public final int hashCode() {
            return 1411094175;
        }

        public final String toString() {
            return "RemoveMemberError";
        }
    }

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$RemoveMemberModal;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Modal;", "member", "Lio/getstream/chat/android/models/Member;", "<init>", "(Lio/getstream/chat/android/models/Member;)V", "getMember", "()Lio/getstream/chat/android/models/Member;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class RemoveMemberModal implements Modal {
        public static final int $stable = 0;
        private final Member member;

        public RemoveMemberModal(Member member) {
            AbstractC22676k.m65750j(member, "member");
            this.member = member;
        }

        public static /* synthetic */ RemoveMemberModal copy$default(RemoveMemberModal removeMemberModal, Member member, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                member = removeMemberModal.member;
            }
            return removeMemberModal.copy(member);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Member getMember() {
            return this.member;
        }

        public final RemoveMemberModal copy(Member member) {
            AbstractC22676k.m65750j(member, "member");
            return new RemoveMemberModal(member);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RemoveMemberModal) && AbstractC22676k.m65745e(this.member, ((RemoveMemberModal) other).member);
        }

        public final Member getMember() {
            return this.member;
        }

        public final int hashCode() {
            return this.member.hashCode();
        }

        public final String toString() {
            return "RemoveMemberModal(member=" + this.member + ")";
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$RenameChannelError;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Error;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class RenameChannelError implements Error {
        public static final int $stable = 0;
        public static final RenameChannelError INSTANCE = new RenameChannelError();

        private RenameChannelError() {
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof RenameChannelError);
        }

        public final int hashCode() {
            return 1592473998;
        }

        public final String toString() {
            return "RenameChannelError";
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$UnbanMemberError;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Error;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class UnbanMemberError implements Error {
        public static final int $stable = 0;
        public static final UnbanMemberError INSTANCE = new UnbanMemberError();

        private UnbanMemberError() {
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof UnbanMemberError);
        }

        public final int hashCode() {
            return -1849426429;
        }

        public final String toString() {
            return "UnbanMemberError";
        }
    }

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$UnblockUser;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent;", "member", "Lio/getstream/chat/android/models/Member;", "<init>", "(Lio/getstream/chat/android/models/Member;)V", "getMember", "()Lio/getstream/chat/android/models/Member;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class UnblockUser implements ChannelInfoViewEvent {
        public static final int $stable = 0;
        private final Member member;

        public UnblockUser(Member member) {
            AbstractC22676k.m65750j(member, "member");
            this.member = member;
        }

        public static /* synthetic */ UnblockUser copy$default(UnblockUser unblockUser, Member member, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                member = unblockUser.member;
            }
            return unblockUser.copy(member);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Member getMember() {
            return this.member;
        }

        public final UnblockUser copy(Member member) {
            AbstractC22676k.m65750j(member, "member");
            return new UnblockUser(member);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UnblockUser) && AbstractC22676k.m65745e(this.member, ((UnblockUser) other).member);
        }

        public final Member getMember() {
            return this.member;
        }

        public final int hashCode() {
            return this.member.hashCode();
        }

        public final String toString() {
            return "UnblockUser(member=" + this.member + ")";
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$UnblockUserError;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Error;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class UnblockUserError implements Error {
        public static final int $stable = 0;
        public static final UnblockUserError INSTANCE = new UnblockUserError();

        private UnblockUserError() {
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof UnblockUserError);
        }

        public final int hashCode() {
            return 1577091316;
        }

        public final String toString() {
            return "UnblockUserError";
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$UnmuteChannelError;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Error;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class UnmuteChannelError implements Error {
        public static final int $stable = 0;
        public static final UnmuteChannelError INSTANCE = new UnmuteChannelError();

        private UnmuteChannelError() {
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof UnmuteChannelError);
        }

        public final int hashCode() {
            return -751001470;
        }

        public final String toString() {
            return "UnmuteChannelError";
        }
    }

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$UnmuteUser;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent;", "member", "Lio/getstream/chat/android/models/Member;", "<init>", "(Lio/getstream/chat/android/models/Member;)V", "getMember", "()Lio/getstream/chat/android/models/Member;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class UnmuteUser implements ChannelInfoViewEvent {
        public static final int $stable = 0;
        private final Member member;

        public UnmuteUser(Member member) {
            AbstractC22676k.m65750j(member, "member");
            this.member = member;
        }

        public static /* synthetic */ UnmuteUser copy$default(UnmuteUser unmuteUser, Member member, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                member = unmuteUser.member;
            }
            return unmuteUser.copy(member);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Member getMember() {
            return this.member;
        }

        public final UnmuteUser copy(Member member) {
            AbstractC22676k.m65750j(member, "member");
            return new UnmuteUser(member);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UnmuteUser) && AbstractC22676k.m65745e(this.member, ((UnmuteUser) other).member);
        }

        public final Member getMember() {
            return this.member;
        }

        public final int hashCode() {
            return this.member.hashCode();
        }

        public final String toString() {
            return "UnmuteUser(member=" + this.member + ")";
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$UnmuteUserError;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Error;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class UnmuteUserError implements Error {
        public static final int $stable = 0;
        public static final UnmuteUserError INSTANCE = new UnmuteUserError();

        private UnmuteUserError() {
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof UnmuteUserError);
        }

        public final int hashCode() {
            return 120237152;
        }

        public final String toString() {
            return "UnmuteUserError";
        }
    }
}
