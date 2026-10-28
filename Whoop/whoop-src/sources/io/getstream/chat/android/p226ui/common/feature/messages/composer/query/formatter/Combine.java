package io.getstream.chat.android.p226ui.common.feature.messages.composer.query.formatter;

import java.util.Iterator;
import java.util.List;
import m83.AbstractC25260n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\"\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/Combine;", "Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/QueryFormatter;", "transformers", "", "<init>", "(Ljava/util/List;)V", "", "([Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/QueryFormatter;)V", "format", "", "query", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class Combine implements QueryFormatter {
    public static final int $stable = 8;
    private final List<QueryFormatter> transformers;

    /* JADX WARN: Multi-variable type inference failed */
    public Combine(List<? extends QueryFormatter> transformers) {
        AbstractC22676k.m65750j(transformers, "transformers");
        this.transformers = transformers;
    }

    @Override // io.getstream.chat.android.p226ui.common.feature.messages.composer.query.formatter.QueryFormatter
    public final String format(String query) {
        AbstractC22676k.m65750j(query, "query");
        Iterator<T> it = this.transformers.iterator();
        while (it.hasNext()) {
            query = ((QueryFormatter) it.next()).format(query);
        }
        return query;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Combine(QueryFormatter... transformers) {
        this((List<? extends QueryFormatter>) AbstractC25260n.m74049W0(transformers));
        AbstractC22676k.m65750j(transformers, "transformers");
    }
}
