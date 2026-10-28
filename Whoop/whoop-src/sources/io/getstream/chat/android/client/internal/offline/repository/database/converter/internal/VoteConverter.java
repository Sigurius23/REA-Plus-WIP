package io.getstream.chat.android.client.internal.offline.repository.database.converter.internal;

import com.squareup.moshi.JsonAdapter;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.VoteEntity;
import j93.C21462d0;
import java.util.List;
import m83.C25271y;
import p441qx.C30722l0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import ug.AbstractC34924m;
import x43.AbstractC37978j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007J\u0014\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0007J\u001a\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007J\u001a\u0010\u0011\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\tH\u0007R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0003R \u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t0\u0005X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0003¨\u0006\u0013"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/VoteConverter;", "", "<init>", "()V", "entityAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/VoteEntity;", "getEntityAdapter$annotations", "entityListAdapter", "", "getEntityListAdapter$annotations", "stringToVote", "data", "", "voteToString", "entity", "stringToVoteList", "voteListToString", "entities", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class VoteConverter {
    private final JsonAdapter<VoteEntity> entityAdapter = AbstractC34924m.m110152m(ConverterMoshiInstanceKt.getMoshi(), AbstractC22671h0.m65691d(VoteEntity.class));
    private final JsonAdapter<List<VoteEntity>> entityListAdapter;

    public VoteConverter() {
        C30722l0 moshi = ConverterMoshiInstanceKt.getMoshi();
        C21462d0 c21462d0 = C21462d0.f82423c;
        this.entityListAdapter = AbstractC34924m.m110152m(moshi, AbstractC22671h0.m65692e(List.class, AbstractC37978j.m121626I(AbstractC22671h0.m65691d(VoteEntity.class))));
    }

    private static /* synthetic */ void getEntityAdapter$annotations() {
    }

    private static /* synthetic */ void getEntityListAdapter$annotations() {
    }

    public final VoteEntity stringToVote(String data) {
        if (data != null) {
            return this.entityAdapter.fromJson(data);
        }
        return null;
    }

    public final List<VoteEntity> stringToVoteList(String data) {
        return (data == null || data.length() == 0 || AbstractC22676k.m65745e(data, "null")) ? C25271y.f99162w : this.entityListAdapter.fromJson(data);
    }

    public final String voteListToString(List<VoteEntity> entities) {
        if (entities != null) {
            return this.entityListAdapter.toJson(entities);
        }
        return null;
    }

    public final String voteToString(VoteEntity entity) {
        if (entity != null) {
            return this.entityAdapter.toJson(entity);
        }
        return null;
    }
}
