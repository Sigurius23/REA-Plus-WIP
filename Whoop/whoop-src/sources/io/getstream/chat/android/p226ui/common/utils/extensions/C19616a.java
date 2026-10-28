package io.getstream.chat.android.p226ui.common.utils.extensions;

import ad3.C0764g;
import androidx.constraintlayout.widget.C1153p;
import androidx.health.platform.client.proto.C1533u;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4339a;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.models.Command;
import io.getstream.chat.android.models.CreatePollParams;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.feature.channels.list.adapter.viewholder.ChannelListIconProviderContainerImpl;
import io.getstream.chat.android.p226ui.feature.channels.list.adapter.viewholder.ChannelListListenerContainerImpl;
import io.getstream.chat.android.p226ui.feature.channels.list.adapter.viewholder.ChannelListVisibilityContainerImpl;
import io.getstream.chat.android.p226ui.feature.channels.list.adapter.viewholder.internal.ChannelItemSwipeListener;
import io.getstream.chat.android.p226ui.feature.messages.composer.MessageComposerView;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.Decorator;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.DecoratorProviderFactory;
import io.getstream.chat.android.p226ui.feature.messages.list.internal.HiddenMessageListItemPredicate;
import io.getstream.chat.android.p226ui.feature.messages.list.internal.SwipeReplyCallback;
import io.getstream.chat.android.p226ui.feature.messages.list.reactions.user.internal.UserReactionAdapter;
import io.getstream.chat.android.p226ui.utils.extensions.StringKt;
import io.getstream.chat.android.p226ui.viewmodel.messages.ChannelViewModelFactory;
import io.getstream.chat.android.p226ui.viewmodel.messages.MessageListViewModel;
import io0.AbstractC20714a0;
import java.io.File;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import n23.AbstractC26205h;
import p715kotlin.jvm.functions.Function1;
import yb3.InterfaceC39407k;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.common.utils.extensions.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19616a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74473w;

    public /* synthetic */ C19616a(int i13) {
        this.f74473w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f74473w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        switch (i13) {
            case 0:
                return StringKt.m55086a((String) obj);
            case 1:
                return ChannelListIconProviderContainerImpl.m55115c((InterfaceC4339a) obj);
            case 2:
                return ChannelListIconProviderContainerImpl.m55116d((InterfaceC4339a) obj);
            case 3:
                return ChannelListListenerContainerImpl.m55128k((InterfaceC4339a) obj);
            case 4:
                return ChannelListListenerContainerImpl.m55119b((InterfaceC4339a) obj);
            case 5:
                return ChannelListListenerContainerImpl.m55125h((InterfaceC4339a) obj);
            case 6:
                return ChannelListListenerContainerImpl.m55121d((InterfaceC4339a) obj);
            case 7:
                return ChannelListListenerContainerImpl.m55124g((InterfaceC4339a) obj);
            case 8:
                return ChannelListListenerContainerImpl.m55122e((InterfaceC4339a) obj);
            case 9:
                return ChannelListVisibilityContainerImpl.isMoreOptionsVisible_delegate$lambda$0((InterfaceC4339a) obj);
            case 10:
                return ChannelListVisibilityContainerImpl.isDeleteOptionVisible_delegate$lambda$1((InterfaceC4339a) obj);
            case 11:
                return Boolean.valueOf(ChannelItemSwipeListener.closeAllOtherPositions$lambda$3((Map.Entry) obj));
            case 12:
                ((Integer) obj).getClass();
                return c23454a0;
            case 13:
                MessageComposerView.textInputChangeListener$lambda$1((String) obj);
                return c23454a0;
            case 14:
                ((Float) obj).getClass();
                int i14 = MessageComposerView.f74523w;
                return c23454a0;
            case 15:
                MessageComposerView.attachmentSelectionListener$lambda$2((List) obj);
                return c23454a0;
            case 16:
                MessageComposerView.pollSubmissionListener$lambda$3((CreatePollParams) obj);
                return c23454a0;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                MessageComposerView.attachmentRemovalListener$lambda$4((Attachment) obj);
                return c23454a0;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                MessageComposerView.mentionSelectionListener$lambda$5((User) obj);
                return c23454a0;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                MessageComposerView.commandSelectionListener$lambda$6((Command) obj);
                return c23454a0;
            case 20:
                ((Boolean) obj).getClass();
                int i15 = MessageComposerView.f74523w;
                return c23454a0;
            case 21:
                DecoratorProviderFactory.Companion.defaultFactory$lambda$0((Decorator) obj);
                return Boolean.TRUE;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return Boolean.valueOf(HiddenMessageListItemPredicate.theirGiphyEphemeralMessagePredicate$lambda$0((MessageListItem) obj));
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                SwipeReplyCallback.onReply$lambda$0((Message) obj);
                return c23454a0;
            case 24:
                UserReactionAdapter.UserReactionViewHolder.bindUserReaction$lambda$3$lambda$1((C1153p) obj);
                return c23454a0;
            case 25:
                return StringKt.getOccurrenceRanges$lambda$2$lambda$1((InterfaceC39407k) obj);
            case 26:
                return ChannelViewModelFactory.m55712a((InterfaceC3027k1) obj);
            case 27:
                return ChannelViewModelFactory._init_$lambda$0((File) obj);
            case 28:
                MessageListViewModel.Event.FlagMessage._init_$lambda$0((AbstractC26205h) obj);
                return c23454a0;
            default:
                return AbstractC20714a0.m56907c((C0764g) obj);
        }
    }
}
