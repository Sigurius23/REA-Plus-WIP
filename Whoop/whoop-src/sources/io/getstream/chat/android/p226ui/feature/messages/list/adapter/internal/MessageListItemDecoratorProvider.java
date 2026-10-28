package io.getstream.chat.android.p226ui.feature.messages.list.adapter.internal;

import c93.InterfaceC4339a;
import com.whoop.profile.view.edit.C9786j;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.p226ui.common.helper.DateFormatter;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageListView;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageListViewStyle;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.internal.MessageListItemDecoratorProvider;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.Decorator;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.DecoratorProvider;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.internal.AvatarDecorator;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.internal.BackgroundDecorator;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.internal.FailedIndicatorDecorator;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.internal.FootnoteDecorator;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.internal.GapDecorator;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.internal.MaxPossibleWidthDecorator;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.internal.MessageContainerMarginDecorator;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.internal.PinIndicatorDecorator;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.internal.ReactionsDecorator;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.internal.ReplyDecorator;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.internal.TextDecorator;
import io.getstream.chat.android.p226ui.feature.messages.list.background.MessageBackgroundFactory;
import io.getstream.chat.android.p226ui.utils.extensions.ChannelKt;
import java.util.ArrayList;
import java.util.List;
import l83.InterfaceC23462h;
import m83.AbstractC25260n;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\f¢\u0006\u0004\b\u0012\u0010\u0013R!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00148VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemDecoratorProvider;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;", "Lio/getstream/chat/android/models/Channel;", "channel", "Lio/getstream/chat/android/ui/common/helper/DateFormatter;", "dateFormatter", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;", "messageListViewStyle", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ShowAvatarPredicate;", "showAvatarPredicate", "Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactory;", "messageBackgroundFactory", "Lkotlin/Function1;", "", "getLanguageDisplayName", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator;", "", "decoratorPredicate", "<init>", "(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/ui/common/helper/DateFormatter;Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ShowAvatarPredicate;Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactory;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "", "decorators$delegate", "Ll83/h;", "getDecorators", "()Ljava/util/List;", "decorators", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageListItemDecoratorProvider implements DecoratorProvider {

    /* JADX INFO: renamed from: decorators$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h decorators;

    public MessageListItemDecoratorProvider(Channel channel, DateFormatter dateFormatter, MessageListViewStyle messageListViewStyle, MessageListView.ShowAvatarPredicate showAvatarPredicate, MessageBackgroundFactory messageBackgroundFactory, Function1 getLanguageDisplayName, Function1 decoratorPredicate) {
        AbstractC22676k.m65750j(channel, "channel");
        AbstractC22676k.m65750j(dateFormatter, "dateFormatter");
        AbstractC22676k.m65750j(messageListViewStyle, "messageListViewStyle");
        AbstractC22676k.m65750j(showAvatarPredicate, "showAvatarPredicate");
        AbstractC22676k.m65750j(messageBackgroundFactory, "messageBackgroundFactory");
        AbstractC22676k.m65750j(getLanguageDisplayName, "getLanguageDisplayName");
        AbstractC22676k.m65750j(decoratorPredicate, "decoratorPredicate");
        this.decorators = AbstractC30060g.m92088H(new C9786j(messageBackgroundFactory, messageListViewStyle, showAvatarPredicate, dateFormatter, getLanguageDisplayName, decoratorPredicate, channel, 2));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ ArrayList m55476b(MessageBackgroundFactory messageBackgroundFactory, MessageListViewStyle messageListViewStyle, MessageListView.ShowAvatarPredicate showAvatarPredicate, DateFormatter dateFormatter, Function1 function1, Function1 function2, Channel channel) {
        return (ArrayList) decorators_delegate$lambda$5(messageBackgroundFactory, messageListViewStyle, showAvatarPredicate, dateFormatter, function1, function2, channel);
    }

    private static final List decorators_delegate$lambda$5(MessageBackgroundFactory messageBackgroundFactory, MessageListViewStyle messageListViewStyle, MessageListView.ShowAvatarPredicate showAvatarPredicate, DateFormatter dateFormatter, Function1 function1, Function1 function2, final Channel channel) {
        BackgroundDecorator backgroundDecorator = new BackgroundDecorator(messageBackgroundFactory);
        TextDecorator textDecorator = new TextDecorator(messageListViewStyle.getItemStyle());
        GapDecorator gapDecorator = new GapDecorator();
        MaxPossibleWidthDecorator maxPossibleWidthDecorator = new MaxPossibleWidthDecorator(messageListViewStyle.getItemStyle());
        MessageContainerMarginDecorator messageContainerMarginDecorator = new MessageContainerMarginDecorator(messageListViewStyle.getItemStyle());
        AvatarDecorator avatarDecorator = new AvatarDecorator(showAvatarPredicate);
        final int i13 = 0;
        FailedIndicatorDecorator failedIndicatorDecorator = new FailedIndicatorDecorator(messageListViewStyle.getItemStyle(), new InterfaceC4339a() { // from class: u13.a
            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                boolean zIsCurrentUserBanned;
                switch (i13) {
                    case 0:
                        zIsCurrentUserBanned = ChannelKt.isCurrentUserBanned(channel);
                        break;
                    case 1:
                        zIsCurrentUserBanned = io.getstream.chat.android.p226ui.common.utils.extensions.ChannelKt.isDirectMessaging(channel);
                        break;
                    default:
                        zIsCurrentUserBanned = MessageListItemDecoratorProvider.decorators_delegate$lambda$5$lambda$3(channel);
                        break;
                }
                return Boolean.valueOf(zIsCurrentUserBanned);
            }
        });
        ReactionsDecorator reactionsDecorator = new ReactionsDecorator(messageListViewStyle.getItemStyle());
        if (!messageListViewStyle.getReactionsEnabled()) {
            reactionsDecorator = null;
        }
        final int i14 = 1;
        final int i15 = 2;
        List listM74077r0 = AbstractC25260n.m74077r0(new Decorator[]{backgroundDecorator, textDecorator, gapDecorator, maxPossibleWidthDecorator, messageContainerMarginDecorator, avatarDecorator, failedIndicatorDecorator, reactionsDecorator, new ReplyDecorator(messageListViewStyle.getReplyMessageStyle()), new FootnoteDecorator(dateFormatter, new InterfaceC4339a() { // from class: u13.a
            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                boolean zIsCurrentUserBanned;
                switch (i14) {
                    case 0:
                        zIsCurrentUserBanned = ChannelKt.isCurrentUserBanned(channel);
                        break;
                    case 1:
                        zIsCurrentUserBanned = io.getstream.chat.android.p226ui.common.utils.extensions.ChannelKt.isDirectMessaging(channel);
                        break;
                    default:
                        zIsCurrentUserBanned = MessageListItemDecoratorProvider.decorators_delegate$lambda$5$lambda$3(channel);
                        break;
                }
                return Boolean.valueOf(zIsCurrentUserBanned);
            }
        }, new InterfaceC4339a() { // from class: u13.a
            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                boolean zIsCurrentUserBanned;
                switch (i15) {
                    case 0:
                        zIsCurrentUserBanned = ChannelKt.isCurrentUserBanned(channel);
                        break;
                    case 1:
                        zIsCurrentUserBanned = io.getstream.chat.android.p226ui.common.utils.extensions.ChannelKt.isDirectMessaging(channel);
                        break;
                    default:
                        zIsCurrentUserBanned = MessageListItemDecoratorProvider.decorators_delegate$lambda$5$lambda$3(channel);
                        break;
                }
                return Boolean.valueOf(zIsCurrentUserBanned);
            }
        }, messageListViewStyle, function1), messageListViewStyle.getPinMessageEnabled() ? new PinIndicatorDecorator(messageListViewStyle.getItemStyle()) : null});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM74077r0) {
            if (((Boolean) function2.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean decorators_delegate$lambda$5$lambda$3(Channel channel) {
        return channel.getConfig().isThreadEnabled();
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.DecoratorProvider
    public final List<Decorator> getDecorators() {
        return (List) this.decorators.getValue();
    }
}
