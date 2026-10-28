package io.getstream.chat.android.p226ui.common.utils.extensions;

import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.models.FilterObject;
import io.getstream.chat.android.models.Filters;
import io.getstream.chat.android.models.User;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¨\u0006\u0005"}, m65681d2 = {"defaultChannelListFilter", "Lio/getstream/chat/android/models/FilterObject;", "Lio/getstream/chat/android/models/Filters;", UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "stream-chat-android-ui-common_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class FiltersKt {
    public static final FilterObject defaultChannelListFilter(Filters filters, User user) {
        AbstractC22676k.m65750j(filters, "<this>");
        if (user == null) {
            return null;
        }
        return Filters.and(Filters.m54979eq("type", "messaging"), Filters.m54980in(QueryChannelRequest.KEY_MEMBERS, (List<? extends Object>) AbstractC37056f.m118958J(user.getId())));
    }
}
