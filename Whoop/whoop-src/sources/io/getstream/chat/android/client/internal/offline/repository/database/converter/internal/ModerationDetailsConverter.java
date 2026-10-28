package io.getstream.chat.android.client.internal.offline.repository.database.converter.internal;

import com.squareup.moshi.JsonAdapter;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.ModerationDetailsEntity;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import ug.AbstractC34924m;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J\u0014\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0006H\u0007R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0003¨\u0006\r"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationDetailsConverter;", "", "<init>", "()V", "entityAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;", "getEntityAdapter$annotations", "stringToModerationDetails", "data", "", "moderationDetailsToString", "entity", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ModerationDetailsConverter {
    private final JsonAdapter<ModerationDetailsEntity> entityAdapter = AbstractC34924m.m110152m(ConverterMoshiInstanceKt.getMoshi(), AbstractC22671h0.m65691d(ModerationDetailsEntity.class));

    private static /* synthetic */ void getEntityAdapter$annotations() {
    }

    public final String moderationDetailsToString(ModerationDetailsEntity entity) {
        if (entity != null) {
            return this.entityAdapter.toJson(entity);
        }
        return null;
    }

    public final ModerationDetailsEntity stringToModerationDetails(String data) {
        if (data != null) {
            return this.entityAdapter.fromJson(data);
        }
        return null;
    }
}
