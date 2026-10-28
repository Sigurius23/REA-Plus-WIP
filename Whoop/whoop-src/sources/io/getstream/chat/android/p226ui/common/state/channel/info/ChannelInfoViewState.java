package io.getstream.chat.android.p226ui.common.state.channel.info;

import c13.AbstractC3855a;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.common.utils.ExpandableList;
import io.getstream.chat.android.p226ui.common.utils.ExpandableListKt;
import java.util.List;
import m83.C25271y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState;", "", "Loading", "Content", "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;", "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Loading;", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface ChannelInfoViewState {

    @Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;", "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState;", "owner", "Lio/getstream/chat/android/models/User;", QueryChannelRequest.KEY_MEMBERS, "Lio/getstream/chat/android/ui/common/utils/ExpandableList;", "Lio/getstream/chat/android/models/Member;", "options", "", "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option;", "<init>", "(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/utils/ExpandableList;Ljava/util/List;)V", "getOwner", "()Lio/getstream/chat/android/models/User;", "getMembers", "()Lio/getstream/chat/android/ui/common/utils/ExpandableList;", "getOptions", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Option", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class Content implements ChannelInfoViewState {
        public static final int $stable = 8;
        private final ExpandableList<Member> members;
        private final List<Option> options;
        private final User owner;

        @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option;", "", "AddMember", "EditChannel", "MuteChannel", "MuteUser", "BlockUser", "PinnedMessages", "MediaAttachments", "FilesAttachments", "LeaveChannel", "DeleteChannel", "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option$AddMember;", "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option$BlockUser;", "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option$DeleteChannel;", "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option$EditChannel;", "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option$FilesAttachments;", "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option$LeaveChannel;", "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option$MediaAttachments;", "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option$MuteChannel;", "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option$MuteUser;", "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option$PinnedMessages;", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public interface Option {

            @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option$AddMember;", "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
            public static final /* data */ class AddMember implements Option {
                public static final int $stable = 0;
                public static final AddMember INSTANCE = new AddMember();

                private AddMember() {
                }

                public final boolean equals(Object other) {
                    return this == other || (other instanceof AddMember);
                }

                public final int hashCode() {
                    return -605220784;
                }

                public final String toString() {
                    return "AddMember";
                }
            }

            @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option$BlockUser;", "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option;", "isBlocked", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
            public static final /* data */ class BlockUser implements Option {
                public static final int $stable = 0;
                private final boolean isBlocked;

                public BlockUser(boolean z4) {
                    this.isBlocked = z4;
                }

                public static BlockUser copy$default(BlockUser blockUser, boolean z4, int i13, Object obj) {
                    if ((i13 & 1) != 0) {
                        z4 = blockUser.isBlocked;
                    }
                    blockUser.getClass();
                    return new BlockUser(z4);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final boolean getIsBlocked() {
                    return this.isBlocked;
                }

                public final BlockUser copy(boolean isBlocked) {
                    return new BlockUser(isBlocked);
                }

                public final boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof BlockUser) && this.isBlocked == ((BlockUser) other).isBlocked;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.isBlocked);
                }

                public final boolean isBlocked() {
                    return this.isBlocked;
                }

                public final String toString() {
                    return AbstractC3855a.m11827k("BlockUser(isBlocked=", ")", this.isBlocked);
                }
            }

            @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option$DeleteChannel;", "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
            public static final /* data */ class DeleteChannel implements Option {
                public static final int $stable = 0;
                public static final DeleteChannel INSTANCE = new DeleteChannel();

                private DeleteChannel() {
                }

                public final boolean equals(Object other) {
                    return this == other || (other instanceof DeleteChannel);
                }

                public final int hashCode() {
                    return 1913250829;
                }

                public final String toString() {
                    return "DeleteChannel";
                }
            }

            @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option$EditChannel;", "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option;", "name", "", "<init>", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
            public static final /* data */ class EditChannel implements Option {
                public static final int $stable = 0;
                private final String name;

                public EditChannel(String name) {
                    AbstractC22676k.m65750j(name, "name");
                    this.name = name;
                }

                public static /* synthetic */ EditChannel copy$default(EditChannel editChannel, String str, int i13, Object obj) {
                    if ((i13 & 1) != 0) {
                        str = editChannel.name;
                    }
                    return editChannel.copy(str);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final String getName() {
                    return this.name;
                }

                public final EditChannel copy(String name) {
                    AbstractC22676k.m65750j(name, "name");
                    return new EditChannel(name);
                }

                public final boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof EditChannel) && AbstractC22676k.m65745e(this.name, ((EditChannel) other).name);
                }

                public final String getName() {
                    return this.name;
                }

                public final int hashCode() {
                    return this.name.hashCode();
                }

                public final String toString() {
                    return AbstractC11895b.m31996o("EditChannel(name=", this.name, ")");
                }
            }

            @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option$FilesAttachments;", "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
            public static final /* data */ class FilesAttachments implements Option {
                public static final int $stable = 0;
                public static final FilesAttachments INSTANCE = new FilesAttachments();

                private FilesAttachments() {
                }

                public final boolean equals(Object other) {
                    return this == other || (other instanceof FilesAttachments);
                }

                public final int hashCode() {
                    return 1699321188;
                }

                public final String toString() {
                    return "FilesAttachments";
                }
            }

            @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option$LeaveChannel;", "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
            public static final /* data */ class LeaveChannel implements Option {
                public static final int $stable = 0;
                public static final LeaveChannel INSTANCE = new LeaveChannel();

                private LeaveChannel() {
                }

                public final boolean equals(Object other) {
                    return this == other || (other instanceof LeaveChannel);
                }

                public final int hashCode() {
                    return 809264247;
                }

                public final String toString() {
                    return "LeaveChannel";
                }
            }

            @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option$MediaAttachments;", "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
            public static final /* data */ class MediaAttachments implements Option {
                public static final int $stable = 0;
                public static final MediaAttachments INSTANCE = new MediaAttachments();

                private MediaAttachments() {
                }

                public final boolean equals(Object other) {
                    return this == other || (other instanceof MediaAttachments);
                }

                public final int hashCode() {
                    return 1232677335;
                }

                public final String toString() {
                    return "MediaAttachments";
                }
            }

            @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option$MuteChannel;", "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option;", "isMuted", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
            public static final /* data */ class MuteChannel implements Option {
                public static final int $stable = 0;
                private final boolean isMuted;

                public MuteChannel(boolean z4) {
                    this.isMuted = z4;
                }

                public static MuteChannel copy$default(MuteChannel muteChannel, boolean z4, int i13, Object obj) {
                    if ((i13 & 1) != 0) {
                        z4 = muteChannel.isMuted;
                    }
                    muteChannel.getClass();
                    return new MuteChannel(z4);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final boolean getIsMuted() {
                    return this.isMuted;
                }

                public final MuteChannel copy(boolean isMuted) {
                    return new MuteChannel(isMuted);
                }

                public final boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof MuteChannel) && this.isMuted == ((MuteChannel) other).isMuted;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.isMuted);
                }

                public final boolean isMuted() {
                    return this.isMuted;
                }

                public final String toString() {
                    return AbstractC3855a.m11827k("MuteChannel(isMuted=", ")", this.isMuted);
                }
            }

            @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option$MuteUser;", "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option;", "isMuted", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
            public static final /* data */ class MuteUser implements Option {
                public static final int $stable = 0;
                private final boolean isMuted;

                public MuteUser(boolean z4) {
                    this.isMuted = z4;
                }

                public static MuteUser copy$default(MuteUser muteUser, boolean z4, int i13, Object obj) {
                    if ((i13 & 1) != 0) {
                        z4 = muteUser.isMuted;
                    }
                    muteUser.getClass();
                    return new MuteUser(z4);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final boolean getIsMuted() {
                    return this.isMuted;
                }

                public final MuteUser copy(boolean isMuted) {
                    return new MuteUser(isMuted);
                }

                public final boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof MuteUser) && this.isMuted == ((MuteUser) other).isMuted;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.isMuted);
                }

                public final boolean isMuted() {
                    return this.isMuted;
                }

                public final String toString() {
                    return AbstractC3855a.m11827k("MuteUser(isMuted=", ")", this.isMuted);
                }
            }

            @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option$PinnedMessages;", "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
            public static final /* data */ class PinnedMessages implements Option {
                public static final int $stable = 0;
                public static final PinnedMessages INSTANCE = new PinnedMessages();

                private PinnedMessages() {
                }

                public final boolean equals(Object other) {
                    return this == other || (other instanceof PinnedMessages);
                }

                public final int hashCode() {
                    return 361794735;
                }

                public final String toString() {
                    return "PinnedMessages";
                }
            }
        }

        public Content() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Content copy$default(Content content, User user, ExpandableList expandableList, List list, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                user = content.owner;
            }
            if ((i13 & 2) != 0) {
                expandableList = content.members;
            }
            if ((i13 & 4) != 0) {
                list = content.options;
            }
            return content.copy(user, expandableList, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final User getOwner() {
            return this.owner;
        }

        public final ExpandableList<Member> component2() {
            return this.members;
        }

        public final List<Option> component3() {
            return this.options;
        }

        public final Content copy(User owner, ExpandableList<Member> members, List<? extends Option> options) {
            AbstractC22676k.m65750j(owner, "owner");
            AbstractC22676k.m65750j(members, "members");
            AbstractC22676k.m65750j(options, "options");
            return new Content(owner, members, options);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Content)) {
                return false;
            }
            Content content = (Content) other;
            return AbstractC22676k.m65745e(this.owner, content.owner) && AbstractC22676k.m65745e(this.members, content.members) && AbstractC22676k.m65745e(this.options, content.options);
        }

        public final ExpandableList<Member> getMembers() {
            return this.members;
        }

        public final List<Option> getOptions() {
            return this.options;
        }

        public final User getOwner() {
            return this.owner;
        }

        public final int hashCode() {
            return this.options.hashCode() + ((this.members.hashCode() + (this.owner.hashCode() * 31)) * 31);
        }

        public final String toString() {
            User user = this.owner;
            ExpandableList<Member> expandableList = this.members;
            List<Option> list = this.options;
            StringBuilder sb4 = new StringBuilder("Content(owner=");
            sb4.append(user);
            sb4.append(", members=");
            sb4.append(expandableList);
            sb4.append(", options=");
            return AbstractC3855a.m11829m(sb4, list, ")");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Content(User owner, ExpandableList<Member> members, List<? extends Option> options) {
            AbstractC22676k.m65750j(owner, "owner");
            AbstractC22676k.m65750j(members, "members");
            AbstractC22676k.m65750j(options, "options");
            this.owner = owner;
            this.members = members;
            this.options = options;
        }

        public /* synthetic */ Content(User user, ExpandableList expandableList, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? new User(null, null, null, null, null, null, null, null, null, false, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, 33554431, null) : user, (i13 & 2) != 0 ? ExpandableListKt.emptyExpandableList() : expandableList, (i13 & 4) != 0 ? C25271y.f99162w : list);
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Loading;", "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class Loading implements ChannelInfoViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public final int hashCode() {
            return 316943619;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
