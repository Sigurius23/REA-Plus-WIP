package io.getstream.chat.android.client.api.models;

import com.mapbox.maps.MapboxMap;
import java.util.Map;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0016J\u0018\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0018\u0010\r\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0016J \u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/client/api/models/WatchChannelRequest;", "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;", "<init>", "()V", "withData", "data", "", "", "", "withMembers", MapboxMap.QFE_LIMIT, "", MapboxMap.QFE_OFFSET, "withWatchers", "withMessages", "direction", "Lio/getstream/chat/android/client/api/models/Pagination;", "messageId", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class WatchChannelRequest extends QueryChannelRequest {
    public WatchChannelRequest() {
        setWatch(true);
        setPresence(false);
        setState(true);
    }

    @Override // io.getstream.chat.android.client.api.models.QueryChannelRequest
    public final /* bridge */ /* synthetic */ QueryChannelRequest withData(Map map) {
        withData((Map<String, ? extends Object>) map);
        return this;
    }

    @Override // io.getstream.chat.android.client.api.models.QueryChannelRequest
    public final QueryChannelRequest withMembers(int i13, int i14) {
        super.withMembers(i13, i14);
        return this;
    }

    @Override // io.getstream.chat.android.client.api.models.QueryChannelRequest
    public final /* bridge */ /* synthetic */ QueryChannelRequest withMessages(Pagination pagination, String str, int i13) {
        withMessages(pagination, str, i13);
        return this;
    }

    @Override // io.getstream.chat.android.client.api.models.QueryChannelRequest
    public final QueryChannelRequest withWatchers(int i13, int i14) {
        super.withWatchers(i13, i14);
        return this;
    }

    @Override // io.getstream.chat.android.client.api.models.QueryChannelRequest
    public final WatchChannelRequest withData(Map<String, ? extends Object> data) {
        AbstractC22676k.m65750j(data, "data");
        super.withData(data);
        return this;
    }

    @Override // io.getstream.chat.android.client.api.models.QueryChannelRequest
    public final WatchChannelRequest withMembers(int limit, int offset) {
        super.withMembers(limit, offset);
        return this;
    }

    @Override // io.getstream.chat.android.client.api.models.QueryChannelRequest
    public final QueryChannelRequest withMessages(int i13) {
        super.withMessages(i13);
        return this;
    }

    @Override // io.getstream.chat.android.client.api.models.QueryChannelRequest
    public final WatchChannelRequest withWatchers(int limit, int offset) {
        super.withWatchers(limit, offset);
        return this;
    }

    @Override // io.getstream.chat.android.client.api.models.QueryChannelRequest
    public final WatchChannelRequest withMessages(int limit) {
        super.withMessages(limit);
        return this;
    }

    @Override // io.getstream.chat.android.client.api.models.QueryChannelRequest
    public final WatchChannelRequest withMessages(Pagination direction, String messageId, int limit) {
        AbstractC22676k.m65750j(direction, "direction");
        AbstractC22676k.m65750j(messageId, "messageId");
        super.withMessages(direction, messageId, limit);
        return this;
    }
}
