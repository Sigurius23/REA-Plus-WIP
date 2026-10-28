package io.getstream.chat.android.p226ui.common.feature.messages.composer.query.filter;

import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.common.feature.messages.composer.query.formatter.Combine;
import io.getstream.chat.android.p226ui.common.feature.messages.composer.query.formatter.IgnoreDiacritics;
import io.getstream.chat.android.p226ui.common.feature.messages.composer.query.formatter.Lowercase;
import io.getstream.chat.android.p226ui.common.feature.messages.composer.query.formatter.Transliterate;
import io.getstream.chat.android.p226ui.common.feature.messages.composer.transliteration.DefaultStreamTransliterator;
import io.getstream.chat.android.p226ui.common.feature.messages.composer.transliteration.StreamTransliterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23465k;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/messages/composer/query/filter/DefaultUserQueryFilter;", "Lio/getstream/chat/android/ui/common/feature/messages/composer/query/filter/QueryFilter;", "Lio/getstream/chat/android/models/User;", "Lio/getstream/chat/android/ui/common/feature/messages/composer/transliteration/StreamTransliterator;", "transliterator", "<init>", "(Lio/getstream/chat/android/ui/common/feature/messages/composer/transliteration/StreamTransliterator;)V", "", "items", "", "query", "filter", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/Combine;", "queryFormatter", "Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/Combine;", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DefaultUserQueryFilter implements QueryFilter<User> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final Combine queryFormatter;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultUserQueryFilter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.getstream.chat.android.p226ui.common.feature.messages.composer.query.filter.QueryFilter
    public final List<User> filter(List<? extends User> items, String query) {
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(query, "query");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC25012a.m73374g(items.size(), "[filter] query: \"", query, "\", items.size: "), null);
        }
        String str2 = this.queryFormatter.format(query);
        if (str2.length() == 0) {
            return items;
        }
        ArrayList arrayList = new ArrayList();
        for (User user : items) {
            Combine combine = this.queryFormatter;
            String name = user.getName();
            if (AbstractC39414r.m125890i0(name)) {
                name = user.getId();
            }
            int iM125888g0 = AbstractC39414r.m125888g0(combine.format(name), str2, 0, false, 6);
            C23465k c23465k = iM125888g0 >= 0 ? new C23465k(user, Integer.valueOf(iM125888g0)) : null;
            if (c23465k != null) {
                arrayList.add(c23465k);
            }
        }
        List listM74152u1 = AbstractC25265s.m74152u1(arrayList, new DefaultUserQueryFilter$filter$$inlined$sortedBy$1());
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM74152u1, 10));
        Iterator it = listM74152u1.iterator();
        while (it.hasNext()) {
            arrayList2.add((User) ((C23465k) it.next()).f92937w);
        }
        return arrayList2;
    }

    public DefaultUserQueryFilter(StreamTransliterator transliterator) {
        AbstractC22676k.m65750j(transliterator, "transliterator");
        this.logger = AbstractC1772c1.m5382S(this, "Chat:QueryFilter");
        this.queryFormatter = new Combine(new Lowercase(), new IgnoreDiacritics(), new Transliterate(transliterator));
    }

    public /* synthetic */ DefaultUserQueryFilter(StreamTransliterator streamTransliterator, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new DefaultStreamTransliterator(null, 1, null) : streamTransliterator);
    }
}
