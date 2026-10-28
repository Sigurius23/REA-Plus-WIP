package io.getstream.chat.android.client.internal.offline.repository.database.converter.internal;

import com.squareup.moshi.JsonAdapter;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.ReactionGroupEntity;
import j93.C21462d0;
import java.util.LinkedHashMap;
import java.util.Map;
import p441qx.C30722l0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import ug.AbstractC34924m;
import x43.AbstractC37978j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\nH\u0007J\u0014\u0010\u000e\u001a\u0004\u0018\u00010\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0007J \u0010\u0010\u001a\u0004\u0018\u00010\n2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\tH\u0007J \u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t2\b\u0010\r\u001a\u0004\u0018\u00010\nH\u0007R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0003R&\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\t0\u0005X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0003¨\u0006\u0013"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReactionGroupConverter;", "", "<init>", "()V", "entityAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupEntity;", "getEntityAdapter$annotations", "entityMapAdapter", "", "", "getEntityMapAdapter$annotations", "stringToReactionGroupEntity", "data", "reactionGroupEntityToString", "entity", "reactionGroupEntityMapToString", "entities", "stringToReactionGroupEntityMap", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ReactionGroupConverter {
    private final JsonAdapter<ReactionGroupEntity> entityAdapter = AbstractC34924m.m110152m(ConverterMoshiInstanceKt.getMoshi(), AbstractC22671h0.m65691d(ReactionGroupEntity.class));
    private final JsonAdapter<Map<String, ReactionGroupEntity>> entityMapAdapter;

    public ReactionGroupConverter() {
        C30722l0 moshi = ConverterMoshiInstanceKt.getMoshi();
        C21462d0 c21462d0 = C21462d0.f82423c;
        this.entityMapAdapter = AbstractC34924m.m110152m(moshi, AbstractC22671h0.m65690c(AbstractC37978j.m121626I(AbstractC22671h0.m65691d(String.class)), AbstractC37978j.m121626I(AbstractC22671h0.m65691d(ReactionGroupEntity.class))));
    }

    private static /* synthetic */ void getEntityAdapter$annotations() {
    }

    private static /* synthetic */ void getEntityMapAdapter$annotations() {
    }

    public final String reactionGroupEntityMapToString(Map<String, ReactionGroupEntity> entities) {
        if (entities != null) {
            return this.entityMapAdapter.toJson(entities);
        }
        return null;
    }

    public final String reactionGroupEntityToString(ReactionGroupEntity entity) {
        if (entity != null) {
            return this.entityAdapter.toJson(entity);
        }
        return null;
    }

    public final ReactionGroupEntity stringToReactionGroupEntity(String data) {
        if (data != null) {
            return this.entityAdapter.fromJson(data);
        }
        return null;
    }

    public final Map<String, ReactionGroupEntity> stringToReactionGroupEntityMap(String data) {
        return (data == null || data.length() == 0 || AbstractC22676k.m65745e(data, "null")) ? new LinkedHashMap() : this.entityMapAdapter.fromJson(data);
    }
}
