package io.getstream.chat.android.p226ui.common.feature.messages.composer.query.formatter;

import java.text.Normalizer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.C39412p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/IgnoreDiacritics;", "Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/QueryFormatter;", "<init>", "()V", "", "removeDiacritics", "(Ljava/lang/String;)Ljava/lang/String;", "query", "format", "Lyb3/p;", "diacriticsRegex", "Lyb3/p;", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class IgnoreDiacritics implements QueryFormatter {
    public static final int $stable = 8;
    private final C39412p diacriticsRegex = new C39412p("\\p{InCombiningDiacriticalMarks}+");

    private final String removeDiacritics(String str) {
        if (str.length() == 0) {
            return str;
        }
        String strNormalize = Normalizer.normalize(str, Normalizer.Form.NFD);
        AbstractC22676k.m65747g(strNormalize);
        return this.diacriticsRegex.m125852f(strNormalize, "");
    }

    @Override // io.getstream.chat.android.p226ui.common.feature.messages.composer.query.formatter.QueryFormatter
    public final String format(String query) {
        AbstractC22676k.m65750j(query, "query");
        return removeDiacritics(query);
    }
}
