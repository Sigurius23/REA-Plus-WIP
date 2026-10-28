package io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator;

import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.p226ui.common.helper.DateFormatter;
import io.getstream.chat.android.p226ui.common.utils.extensions.C19616a;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageListView;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageListViewStyle;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.internal.MessageListItemDecoratorProvider;
import io.getstream.chat.android.p226ui.feature.messages.list.background.MessageBackgroundFactory;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012JK\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fH&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProviderFactory;", "", "Lio/getstream/chat/android/models/Channel;", "channel", "Lio/getstream/chat/android/ui/common/helper/DateFormatter;", "dateFormatter", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;", "messageListViewStyle", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ShowAvatarPredicate;", "showAvatarPredicate", "Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactory;", "messageBackgroundFactory", "Lkotlin/Function1;", "", "getLanguageDisplayName", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;", "createDecoratorProvider", "(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/ui/common/helper/DateFormatter;Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ShowAvatarPredicate;Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactory;Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface DecoratorProviderFactory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¨\u0006\n"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProviderFactory$Companion;", "", "<init>", "()V", "defaultFactory", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProviderFactory;", "predicate", "Lkotlin/Function1;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator;", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public static /* synthetic */ DecoratorProviderFactory defaultFactory$default(Companion companion, Function1 function1, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                function1 = new C19616a(21);
            }
            return companion.defaultFactory(function1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean defaultFactory$lambda$0(Decorator it) {
            AbstractC22676k.m65750j(it, "it");
            return true;
        }

        public final DecoratorProviderFactory defaultFactory(final Function1 predicate) {
            AbstractC22676k.m65750j(predicate, "predicate");
            return new DecoratorProviderFactory() { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.viewholder.decorator.DecoratorProviderFactory$Companion$defaultFactory$2
                @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.DecoratorProviderFactory
                public final DecoratorProvider createDecoratorProvider(Channel channel, DateFormatter dateFormatter, MessageListViewStyle messageListViewStyle, MessageListView.ShowAvatarPredicate showAvatarPredicate, MessageBackgroundFactory messageBackgroundFactory, Function1 getLanguageDisplayName) {
                    AbstractC22676k.m65750j(channel, "channel");
                    AbstractC22676k.m65750j(dateFormatter, "dateFormatter");
                    AbstractC22676k.m65750j(messageListViewStyle, "messageListViewStyle");
                    AbstractC22676k.m65750j(showAvatarPredicate, "showAvatarPredicate");
                    AbstractC22676k.m65750j(messageBackgroundFactory, "messageBackgroundFactory");
                    AbstractC22676k.m65750j(getLanguageDisplayName, "getLanguageDisplayName");
                    return new MessageListItemDecoratorProvider(channel, dateFormatter, messageListViewStyle, showAvatarPredicate, messageBackgroundFactory, getLanguageDisplayName, predicate);
                }
            };
        }
    }

    static DecoratorProviderFactory defaultFactory(Function1 function1) {
        return INSTANCE.defaultFactory(function1);
    }

    DecoratorProvider createDecoratorProvider(Channel channel, DateFormatter dateFormatter, MessageListViewStyle messageListViewStyle, MessageListView.ShowAvatarPredicate showAvatarPredicate, MessageBackgroundFactory messageBackgroundFactory, Function1 getLanguageDisplayName);
}
