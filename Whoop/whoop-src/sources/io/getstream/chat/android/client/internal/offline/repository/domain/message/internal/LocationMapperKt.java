package io.getstream.chat.android.client.internal.offline.repository.domain.message.internal;

import io.getstream.chat.android.models.Location;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0000¨\u0006\u0004"}, m65681d2 = {"toModel", "Lio/getstream/chat/android/models/Location;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;", "toEntity", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class LocationMapperKt {
    public static final LocationEntity toEntity(Location location) {
        AbstractC22676k.m65750j(location, "<this>");
        return new LocationEntity(location.getCid(), location.getMessageId(), location.getUserId(), location.getEndAt(), location.getLatitude(), location.getLongitude(), location.getDeviceId());
    }

    public static final Location toModel(LocationEntity locationEntity) {
        AbstractC22676k.m65750j(locationEntity, "<this>");
        return new Location(locationEntity.getCid(), locationEntity.getMessageId(), locationEntity.getUserId(), locationEntity.getEndAt(), locationEntity.getLatitude(), locationEntity.getLongitude(), locationEntity.getDeviceId());
    }
}
