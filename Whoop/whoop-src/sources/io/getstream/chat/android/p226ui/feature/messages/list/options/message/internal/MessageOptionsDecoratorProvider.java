package io.getstream.chat.android.p226ui.feature.messages.list.options.message.internal;

import io.getstream.chat.android.p226ui.feature.messages.list.MessageListItemStyle;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageListView;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageReplyStyle;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.Decorator;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.DecoratorProvider;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.internal.AvatarDecorator;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.internal.BackgroundDecorator;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.internal.MaxPossibleWidthDecorator;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.internal.MessageContainerMarginDecorator;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.internal.ReplyDecorator;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.internal.TextDecorator;
import io.getstream.chat.android.p226ui.feature.messages.list.background.MessageBackgroundFactory;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsDecoratorProvider;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;", "messageListItemStyle", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;", "messageReplyStyle", "Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;", "messageBackgroundFactory", "Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactory;", "showAvatarPredicate", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ShowAvatarPredicate;", "<init>", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactory;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ShowAvatarPredicate;)V", "messageOptionsDecorators", "", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator;", "decorators", "getDecorators", "()Ljava/util/List;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageOptionsDecoratorProvider implements DecoratorProvider {
    private final List<Decorator> decorators;
    private final List<Decorator> messageOptionsDecorators;

    public MessageOptionsDecoratorProvider(MessageListItemStyle messageListItemStyle, MessageReplyStyle messageReplyStyle, MessageBackgroundFactory messageBackgroundFactory, MessageListView.ShowAvatarPredicate showAvatarPredicate) {
        AbstractC22676k.m65750j(messageListItemStyle, "messageListItemStyle");
        AbstractC22676k.m65750j(messageReplyStyle, "messageReplyStyle");
        AbstractC22676k.m65750j(messageBackgroundFactory, "messageBackgroundFactory");
        AbstractC22676k.m65750j(showAvatarPredicate, "showAvatarPredicate");
        List<Decorator> listM118959K = AbstractC37056f.m118959K(new BackgroundDecorator(messageBackgroundFactory), new TextDecorator(messageListItemStyle), new MaxPossibleWidthDecorator(messageListItemStyle), new MessageContainerMarginDecorator(messageListItemStyle), new AvatarDecorator(showAvatarPredicate), new ReplyDecorator(messageReplyStyle));
        this.messageOptionsDecorators = listM118959K;
        this.decorators = listM118959K;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.DecoratorProvider
    public final List<Decorator> getDecorators() {
        return this.decorators;
    }
}
