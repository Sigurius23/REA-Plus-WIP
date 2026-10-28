package io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator;

import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.p226ui.common.helper.DateFormatter;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageListView;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageListViewStyle;
import io.getstream.chat.android.p226ui.feature.messages.list.background.MessageBackgroundFactory;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002¨\u0006\u0003"}, m65681d2 = {"plus", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProviderFactory;", "other", "stream-chat-android-ui-components_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DecoratorProviderFactoryKt {
    public static final DecoratorProviderFactory plus(final DecoratorProviderFactory decoratorProviderFactory, final DecoratorProviderFactory other) {
        AbstractC22676k.m65750j(decoratorProviderFactory, "<this>");
        AbstractC22676k.m65750j(other, "other");
        return new DecoratorProviderFactory() { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.viewholder.decorator.DecoratorProviderFactoryKt.plus.1
            @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.DecoratorProviderFactory
            public final DecoratorProvider createDecoratorProvider(Channel channel, DateFormatter dateFormatter, MessageListViewStyle messageListViewStyle, MessageListView.ShowAvatarPredicate showAvatarPredicate, MessageBackgroundFactory messageBackgroundFactory, Function1 getLanguageDisplayName) {
                AbstractC22676k.m65750j(channel, "channel");
                AbstractC22676k.m65750j(dateFormatter, "dateFormatter");
                AbstractC22676k.m65750j(messageListViewStyle, "messageListViewStyle");
                AbstractC22676k.m65750j(showAvatarPredicate, "showAvatarPredicate");
                AbstractC22676k.m65750j(messageBackgroundFactory, "messageBackgroundFactory");
                AbstractC22676k.m65750j(getLanguageDisplayName, "getLanguageDisplayName");
                return DecoratorProviderKt.plus(decoratorProviderFactory.createDecoratorProvider(channel, dateFormatter, messageListViewStyle, showAvatarPredicate, messageBackgroundFactory, getLanguageDisplayName), other.createDecoratorProvider(channel, dateFormatter, messageListViewStyle, showAvatarPredicate, messageBackgroundFactory, getLanguageDisplayName));
            }
        };
    }
}
