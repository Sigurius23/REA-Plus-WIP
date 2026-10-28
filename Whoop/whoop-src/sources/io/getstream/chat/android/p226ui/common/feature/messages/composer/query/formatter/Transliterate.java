package io.getstream.chat.android.p226ui.common.feature.messages.composer.query.formatter;

import io.getstream.chat.android.p226ui.common.feature.messages.composer.transliteration.DefaultStreamTransliterator;
import io.getstream.chat.android.p226ui.common.feature.messages.composer.transliteration.StreamTransliterator;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/Transliterate;", "Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/QueryFormatter;", "transliterator", "Lio/getstream/chat/android/ui/common/feature/messages/composer/transliteration/StreamTransliterator;", "<init>", "(Lio/getstream/chat/android/ui/common/feature/messages/composer/transliteration/StreamTransliterator;)V", "format", "", "query", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class Transliterate implements QueryFormatter {
    public static final int $stable = 8;
    private final StreamTransliterator transliterator;

    /* JADX WARN: Multi-variable type inference failed */
    public Transliterate() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.getstream.chat.android.p226ui.common.feature.messages.composer.query.formatter.QueryFormatter
    public final String format(String query) {
        AbstractC22676k.m65750j(query, "query");
        return query.length() == 0 ? query : this.transliterator.transliterate(query);
    }

    public Transliterate(StreamTransliterator transliterator) {
        AbstractC22676k.m65750j(transliterator, "transliterator");
        this.transliterator = transliterator;
    }

    public /* synthetic */ Transliterate(StreamTransliterator streamTransliterator, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new DefaultStreamTransliterator(null, 1, null) : streamTransliterator);
    }
}
