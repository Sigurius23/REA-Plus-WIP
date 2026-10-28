package io.getstream.chat.android.p226ui.common.feature.messages.composer.query.formatter;

import java.util.Locale;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/Lowercase;", "Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/QueryFormatter;", "<init>", "()V", "format", "", "query", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class Lowercase implements QueryFormatter {
    public static final int $stable = 0;

    @Override // io.getstream.chat.android.p226ui.common.feature.messages.composer.query.formatter.QueryFormatter
    public final String format(String query) {
        AbstractC22676k.m65750j(query, "query");
        if (query.length() == 0) {
            return query;
        }
        String lowerCase = query.toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
