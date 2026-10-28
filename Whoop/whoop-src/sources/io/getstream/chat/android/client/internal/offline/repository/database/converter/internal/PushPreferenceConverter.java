package io.getstream.chat.android.client.internal.offline.repository.database.converter.internal;

import com.squareup.moshi.JsonAdapter;
import io.getstream.chat.android.client.internal.offline.repository.domain.push.internal.PushPreferenceEntity;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import ug.AbstractC34924m;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J\u0014\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0006H\u0007R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0003¨\u0006\r"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/PushPreferenceConverter;", "", "<init>", "()V", "pushPreferenceAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/push/internal/PushPreferenceEntity;", "getPushPreferenceAdapter$annotations", "stringToPushPreference", "data", "", "pushPreferenceToString", "entity", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class PushPreferenceConverter {
    private final JsonAdapter<PushPreferenceEntity> pushPreferenceAdapter = AbstractC34924m.m110152m(ConverterMoshiInstanceKt.getMoshi(), AbstractC22671h0.m65691d(PushPreferenceEntity.class));

    private static /* synthetic */ void getPushPreferenceAdapter$annotations() {
    }

    public final String pushPreferenceToString(PushPreferenceEntity entity) {
        if (entity != null) {
            return this.pushPreferenceAdapter.toJson(entity);
        }
        return null;
    }

    public final PushPreferenceEntity stringToPushPreference(String data) {
        if (data != null) {
            return this.pushPreferenceAdapter.fromJson(data);
        }
        return null;
    }
}
