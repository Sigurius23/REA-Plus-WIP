package io.getstream.chat.android.p226ui.common.feature.messages.composer.mention;

import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.common.feature.messages.composer.query.formatter.QueryFormatter;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m65681d2 = {"withQueryFormatter", "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;", "queryFormatter", "Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/QueryFormatter;", "stream-chat-android-ui-common_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class UserLookupHandlerKt {
    public static final UserLookupHandler withQueryFormatter(final UserLookupHandler userLookupHandler, final QueryFormatter queryFormatter) {
        AbstractC22676k.m65750j(userLookupHandler, "<this>");
        AbstractC22676k.m65750j(queryFormatter, "queryFormatter");
        return new UserLookupHandler() { // from class: io.getstream.chat.android.ui.common.feature.messages.composer.mention.UserLookupHandlerKt.withQueryFormatter.1
            @Override // io.getstream.chat.android.p226ui.common.feature.messages.composer.mention.UserLookupHandler
            public final Object handleUserLookup(String str, InterfaceC30057d<? super List<User>> interfaceC30057d) {
                return userLookupHandler.handleUserLookup(queryFormatter.format(str), interfaceC30057d);
            }
        };
    }
}
