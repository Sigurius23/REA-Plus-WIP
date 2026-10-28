package io.getstream.chat.android.p226ui.common.feature.channel.info;

import io.getstream.chat.android.models.Member;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent;", "", "MessageMember", "BanMember", "UnbanMember", "MuteUser", "UnmuteUser", "BlockUser", "UnblockUser", "RemoveMember", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$BanMember;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$BlockUser;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$MessageMember;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$MuteUser;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$RemoveMember;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$UnbanMember;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$UnblockUser;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$UnmuteUser;", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface ChannelInfoMemberViewEvent {

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$BanMember;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent;", "member", "Lio/getstream/chat/android/models/Member;", "<init>", "(Lio/getstream/chat/android/models/Member;)V", "getMember", "()Lio/getstream/chat/android/models/Member;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class BanMember implements ChannelInfoMemberViewEvent {
        public static final int $stable = 0;
        private final Member member;

        public BanMember(Member member) {
            AbstractC22676k.m65750j(member, "member");
            this.member = member;
        }

        public static /* synthetic */ BanMember copy$default(BanMember banMember, Member member, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                member = banMember.member;
            }
            return banMember.copy(member);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Member getMember() {
            return this.member;
        }

        public final BanMember copy(Member member) {
            AbstractC22676k.m65750j(member, "member");
            return new BanMember(member);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BanMember) && AbstractC22676k.m65745e(this.member, ((BanMember) other).member);
        }

        public final Member getMember() {
            return this.member;
        }

        public final int hashCode() {
            return this.member.hashCode();
        }

        public final String toString() {
            return "BanMember(member=" + this.member + ")";
        }
    }

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$BlockUser;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent;", "member", "Lio/getstream/chat/android/models/Member;", "<init>", "(Lio/getstream/chat/android/models/Member;)V", "getMember", "()Lio/getstream/chat/android/models/Member;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class BlockUser implements ChannelInfoMemberViewEvent {
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

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$MessageMember;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent;", "memberId", "", "distinctCid", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getMemberId", "()Ljava/lang/String;", "getDistinctCid", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class MessageMember implements ChannelInfoMemberViewEvent {
        public static final int $stable = 0;
        private final String distinctCid;
        private final String memberId;

        public MessageMember(String memberId, String str) {
            AbstractC22676k.m65750j(memberId, "memberId");
            this.memberId = memberId;
            this.distinctCid = str;
        }

        public static /* synthetic */ MessageMember copy$default(MessageMember messageMember, String str, String str2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = messageMember.memberId;
            }
            if ((i13 & 2) != 0) {
                str2 = messageMember.distinctCid;
            }
            return messageMember.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMemberId() {
            return this.memberId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getDistinctCid() {
            return this.distinctCid;
        }

        public final MessageMember copy(String memberId, String distinctCid) {
            AbstractC22676k.m65750j(memberId, "memberId");
            return new MessageMember(memberId, distinctCid);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MessageMember)) {
                return false;
            }
            MessageMember messageMember = (MessageMember) other;
            return AbstractC22676k.m65745e(this.memberId, messageMember.memberId) && AbstractC22676k.m65745e(this.distinctCid, messageMember.distinctCid);
        }

        public final String getDistinctCid() {
            return this.distinctCid;
        }

        public final String getMemberId() {
            return this.memberId;
        }

        public final int hashCode() {
            int iHashCode = this.memberId.hashCode() * 31;
            String str = this.distinctCid;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return AbstractC2875y.m8300m("MessageMember(memberId=", this.memberId, ", distinctCid=", this.distinctCid, ")");
        }
    }

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$MuteUser;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent;", "member", "Lio/getstream/chat/android/models/Member;", "<init>", "(Lio/getstream/chat/android/models/Member;)V", "getMember", "()Lio/getstream/chat/android/models/Member;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class MuteUser implements ChannelInfoMemberViewEvent {
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

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$RemoveMember;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent;", "member", "Lio/getstream/chat/android/models/Member;", "<init>", "(Lio/getstream/chat/android/models/Member;)V", "getMember", "()Lio/getstream/chat/android/models/Member;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class RemoveMember implements ChannelInfoMemberViewEvent {
        public static final int $stable = 0;
        private final Member member;

        public RemoveMember(Member member) {
            AbstractC22676k.m65750j(member, "member");
            this.member = member;
        }

        public static /* synthetic */ RemoveMember copy$default(RemoveMember removeMember, Member member, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                member = removeMember.member;
            }
            return removeMember.copy(member);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Member getMember() {
            return this.member;
        }

        public final RemoveMember copy(Member member) {
            AbstractC22676k.m65750j(member, "member");
            return new RemoveMember(member);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RemoveMember) && AbstractC22676k.m65745e(this.member, ((RemoveMember) other).member);
        }

        public final Member getMember() {
            return this.member;
        }

        public final int hashCode() {
            return this.member.hashCode();
        }

        public final String toString() {
            return "RemoveMember(member=" + this.member + ")";
        }
    }

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$UnbanMember;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent;", "member", "Lio/getstream/chat/android/models/Member;", "<init>", "(Lio/getstream/chat/android/models/Member;)V", "getMember", "()Lio/getstream/chat/android/models/Member;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class UnbanMember implements ChannelInfoMemberViewEvent {
        public static final int $stable = 0;
        private final Member member;

        public UnbanMember(Member member) {
            AbstractC22676k.m65750j(member, "member");
            this.member = member;
        }

        public static /* synthetic */ UnbanMember copy$default(UnbanMember unbanMember, Member member, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                member = unbanMember.member;
            }
            return unbanMember.copy(member);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Member getMember() {
            return this.member;
        }

        public final UnbanMember copy(Member member) {
            AbstractC22676k.m65750j(member, "member");
            return new UnbanMember(member);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UnbanMember) && AbstractC22676k.m65745e(this.member, ((UnbanMember) other).member);
        }

        public final Member getMember() {
            return this.member;
        }

        public final int hashCode() {
            return this.member.hashCode();
        }

        public final String toString() {
            return "UnbanMember(member=" + this.member + ")";
        }
    }

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$UnblockUser;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent;", "member", "Lio/getstream/chat/android/models/Member;", "<init>", "(Lio/getstream/chat/android/models/Member;)V", "getMember", "()Lio/getstream/chat/android/models/Member;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class UnblockUser implements ChannelInfoMemberViewEvent {
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

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent$UnmuteUser;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent;", "member", "Lio/getstream/chat/android/models/Member;", "<init>", "(Lio/getstream/chat/android/models/Member;)V", "getMember", "()Lio/getstream/chat/android/models/Member;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class UnmuteUser implements ChannelInfoMemberViewEvent {
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
}
