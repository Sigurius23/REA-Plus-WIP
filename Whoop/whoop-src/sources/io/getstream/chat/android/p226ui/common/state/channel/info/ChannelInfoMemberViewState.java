package io.getstream.chat.android.p226ui.common.state.channel.info;

import io.getstream.chat.android.models.Member;
import java.util.Set;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoMemberViewState;", "", "Loading", "Content", "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoMemberViewState$Content;", "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoMemberViewState$Loading;", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface ChannelInfoMemberViewState {

    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0010¨\u0006\u001c"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoMemberViewState$Content;", "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoMemberViewState;", "member", "Lio/getstream/chat/android/models/Member;", "capabilities", "", "", "isMuted", "", "isBlocked", "<init>", "(Lio/getstream/chat/android/models/Member;Ljava/util/Set;ZZ)V", "getMember", "()Lio/getstream/chat/android/models/Member;", "getCapabilities", "()Ljava/util/Set;", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class Content implements ChannelInfoMemberViewState {
        public static final int $stable = 8;
        private final Set<String> capabilities;
        private final boolean isBlocked;
        private final boolean isMuted;
        private final Member member;

        public Content(Member member, Set<String> capabilities, boolean z4, boolean z13) {
            AbstractC22676k.m65750j(member, "member");
            AbstractC22676k.m65750j(capabilities, "capabilities");
            this.member = member;
            this.capabilities = capabilities;
            this.isMuted = z4;
            this.isBlocked = z13;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Content copy$default(Content content, Member member, Set set, boolean z4, boolean z13, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                member = content.member;
            }
            if ((i13 & 2) != 0) {
                set = content.capabilities;
            }
            if ((i13 & 4) != 0) {
                z4 = content.isMuted;
            }
            if ((i13 & 8) != 0) {
                z13 = content.isBlocked;
            }
            return content.copy(member, set, z4, z13);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Member getMember() {
            return this.member;
        }

        public final Set<String> component2() {
            return this.capabilities;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getIsMuted() {
            return this.isMuted;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getIsBlocked() {
            return this.isBlocked;
        }

        public final Content copy(Member member, Set<String> capabilities, boolean isMuted, boolean isBlocked) {
            AbstractC22676k.m65750j(member, "member");
            AbstractC22676k.m65750j(capabilities, "capabilities");
            return new Content(member, capabilities, isMuted, isBlocked);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Content)) {
                return false;
            }
            Content content = (Content) other;
            return AbstractC22676k.m65745e(this.member, content.member) && AbstractC22676k.m65745e(this.capabilities, content.capabilities) && this.isMuted == content.isMuted && this.isBlocked == content.isBlocked;
        }

        public final Set<String> getCapabilities() {
            return this.capabilities;
        }

        public final Member getMember() {
            return this.member;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isBlocked) + AbstractC2875y.m8289b(AbstractC25012a.m73368a(this.capabilities, this.member.hashCode() * 31, 31), 31, this.isMuted);
        }

        public final boolean isBlocked() {
            return this.isBlocked;
        }

        public final boolean isMuted() {
            return this.isMuted;
        }

        public final String toString() {
            Member member = this.member;
            Set<String> set = this.capabilities;
            boolean z4 = this.isMuted;
            boolean z13 = this.isBlocked;
            StringBuilder sb4 = new StringBuilder("Content(member=");
            sb4.append(member);
            sb4.append(", capabilities=");
            sb4.append(set);
            sb4.append(", isMuted=");
            return AbstractC36095b.m114682j(sb4, z4, ", isBlocked=", z13, ")");
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoMemberViewState$Loading;", "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoMemberViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class Loading implements ChannelInfoMemberViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public final int hashCode() {
            return 539006665;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
