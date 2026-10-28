package io.getstream.chat.android.p226ui.common.feature.channel.info;

import ec3.C13045h2;
import ec3.InterfaceC13075p1;
import io.getstream.chat.android.models.ChannelCapabilities;
import io.getstream.chat.android.models.ChannelData;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.Mute;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.common.state.channel.info.ChannelInfoViewState;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import n83.C26460c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u001aK\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H\u0002¢\u0006\u0004\b\f\u0010\r\u001a-\u0010\u0014\u001a\u00020\u0013*\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\"\u0018\u0010\u0019\u001a\u00020\u0004*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\"\u0018\u0010\u001b\u001a\u00020\u0004*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Lio/getstream/chat/android/models/ChannelData;", "channelData", "Lio/getstream/chat/android/models/Member;", "singleMember", "", "isMuted", "", "Lio/getstream/chat/android/models/Mute;", "mutedUsers", "", "blockedUserIds", "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option;", "buildChannelOptionList", "(Lio/getstream/chat/android/models/ChannelData;Lio/getstream/chat/android/models/Member;ZLjava/util/List;Ljava/util/List;)Ljava/util/List;", "Lec3/p1;", "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState;", "Lkotlin/Function1;", "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;", "transformation", "Ll83/a0;", "updateContent", "(Lec3/p1;Lkotlin/jvm/functions/Function1;)V", "", "MINIMUM_VISIBLE_MEMBERS", "I", "isGroupChannel", "(Lio/getstream/chat/android/models/ChannelData;)Z", "isDistinct", "stream-chat-android-ui-common_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelInfoViewControllerKt {
    private static final int MINIMUM_VISIBLE_MEMBERS = 5;

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<ChannelInfoViewState.Content.Option> buildChannelOptionList(ChannelData channelData, Member member, boolean z4, List<Mute> list, List<String> list2) {
        User target;
        C26460c c26460cM119000x = AbstractC37056f.m119000x();
        boolean z13 = true;
        boolean z14 = (member == null || isGroupChannel(channelData)) ? false : true;
        if (isGroupChannel(channelData) && channelData.getOwnCapabilities().contains(ChannelCapabilities.UPDATE_CHANNEL_MEMBERS)) {
            c26460cM119000x.add(ChannelInfoViewState.Content.Option.AddMember.INSTANCE);
        }
        if (z14) {
            c26460cM119000x.add(ChannelInfoViewState.Content.Option.PinnedMessages.INSTANCE);
            c26460cM119000x.add(ChannelInfoViewState.Content.Option.MediaAttachments.INSTANCE);
            c26460cM119000x.add(ChannelInfoViewState.Content.Option.FilesAttachments.INSTANCE);
            if (channelData.getOwnCapabilities().contains(ChannelCapabilities.MUTE_CHANNEL)) {
                c26460cM119000x.add(new ChannelInfoViewState.Content.Option.MuteChannel(z4));
            }
            List<Mute> list3 = list;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator<T> it = list3.iterator();
                do {
                    if (!it.hasNext()) {
                        z13 = false;
                        break;
                    }
                    target = ((Mute) it.next()).getTarget();
                } while (!AbstractC22676k.m65745e(target != null ? target.getId() : null, member.getUserId()));
            } else {
                z13 = false;
                break;
            }
            c26460cM119000x.add(new ChannelInfoViewState.Content.Option.MuteUser(z13));
            c26460cM119000x.add(new ChannelInfoViewState.Content.Option.BlockUser(list2.contains(member.getUserId())));
            if (channelData.getOwnCapabilities().contains(ChannelCapabilities.DELETE_CHANNEL)) {
                c26460cM119000x.add(ChannelInfoViewState.Content.Option.DeleteChannel.INSTANCE);
            }
        } else {
            if (channelData.getOwnCapabilities().contains(ChannelCapabilities.UPDATE_CHANNEL)) {
                c26460cM119000x.add(new ChannelInfoViewState.Content.Option.EditChannel(channelData.getName()));
            }
            if (channelData.getOwnCapabilities().contains(ChannelCapabilities.MUTE_CHANNEL)) {
                c26460cM119000x.add(new ChannelInfoViewState.Content.Option.MuteChannel(z4));
            }
            c26460cM119000x.add(ChannelInfoViewState.Content.Option.PinnedMessages.INSTANCE);
            c26460cM119000x.add(ChannelInfoViewState.Content.Option.MediaAttachments.INSTANCE);
            c26460cM119000x.add(ChannelInfoViewState.Content.Option.FilesAttachments.INSTANCE);
            if (channelData.getOwnCapabilities().contains(ChannelCapabilities.LEAVE_CHANNEL)) {
                c26460cM119000x.add(ChannelInfoViewState.Content.Option.LeaveChannel.INSTANCE);
            }
            if (channelData.getOwnCapabilities().contains(ChannelCapabilities.DELETE_CHANNEL)) {
                c26460cM119000x.add(ChannelInfoViewState.Content.Option.DeleteChannel.INSTANCE);
            }
        }
        return AbstractC37056f.m118988k(c26460cM119000x);
    }

    private static final boolean isDistinct(ChannelData channelData) {
        return AbstractC39421y.m125930O(channelData.getId(), "!members", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isGroupChannel(ChannelData channelData) {
        return channelData.getMemberCount() > 2 || !isDistinct(channelData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateContent(InterfaceC13075p1 interfaceC13075p1, Function1 function1) {
        C13045h2 c13045h2;
        Object value;
        ChannelInfoViewState channelInfoViewState;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
            channelInfoViewState = (ChannelInfoViewState) value;
            if (channelInfoViewState instanceof ChannelInfoViewState.Content) {
                channelInfoViewState = (ChannelInfoViewState) function1.invoke(channelInfoViewState);
            }
        } while (!c13045h2.m36569i(value, channelInfoViewState));
    }
}
