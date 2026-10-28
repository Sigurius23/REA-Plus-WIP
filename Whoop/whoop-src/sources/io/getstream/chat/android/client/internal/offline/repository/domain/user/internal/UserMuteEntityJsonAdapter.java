package io.getstream.chat.android.client.internal.offline.repository.domain.user.internal;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.util.Date;
import m83.C25235a0;
import p441qx.AbstractC30704c0;
import p441qx.C30722l0;
import p441qx.C30740v;
import p471rx.AbstractC31885f;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018¨\u0006\u001c"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserMuteEntityJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserMuteEntity;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserMuteEntity;", "Lqx/c0;", "writer", "value_", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserMuteEntity;)V", "Lqx/v;", "options", "Lqx/v;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/util/Date;", "dateAdapter", "nullableDateAdapter", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class UserMuteEntityJsonAdapter extends JsonAdapter<UserMuteEntity> {
    private final JsonAdapter<Date> dateAdapter;
    private final JsonAdapter<Date> nullableDateAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final C30740v options;

    public UserMuteEntityJsonAdapter(C30722l0 moshi) {
        AbstractC22676k.m65750j(moshi, "moshi");
        this.options = C30740v.m94403a("userId", "targetId", "createdAt", "updatedAt", "expires");
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.nullableStringAdapter = moshi.m94400c(String.class, c25235a0, "userId");
        this.dateAdapter = moshi.m94400c(Date.class, c25235a0, "createdAt");
        this.nullableDateAdapter = moshi.m94400c(Date.class, c25235a0, "expires");
    }

    public final String toString() {
        return AbstractC36095b.m114677e(36, "GeneratedJsonAdapter(UserMuteEntity)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final UserMuteEntity fromJson(JsonReader reader) {
        AbstractC22676k.m65750j(reader, "reader");
        reader.beginObject();
        String str = null;
        String str2 = null;
        Date date = null;
        Date date2 = null;
        Date date3 = null;
        while (reader.hasNext()) {
            int iMo16725T = reader.mo16725T(this.options);
            if (iMo16725T == -1) {
                reader.mo16728b0();
                reader.skipValue();
            } else if (iMo16725T == 0) {
                str = (String) this.nullableStringAdapter.fromJson(reader);
            } else if (iMo16725T == 1) {
                str2 = (String) this.nullableStringAdapter.fromJson(reader);
            } else if (iMo16725T == 2) {
                date = (Date) this.dateAdapter.fromJson(reader);
                if (date == null) {
                    throw AbstractC31885f.m99135m("createdAt", "createdAt", reader);
                }
            } else if (iMo16725T == 3) {
                date2 = (Date) this.dateAdapter.fromJson(reader);
                if (date2 == null) {
                    throw AbstractC31885f.m99135m("updatedAt", "updatedAt", reader);
                }
            } else if (iMo16725T == 4) {
                date3 = (Date) this.nullableDateAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (date == null) {
            throw AbstractC31885f.m99129g("createdAt", "createdAt", reader);
        }
        if (date2 != null) {
            return new UserMuteEntity(str, str2, date, date2, date3);
        }
        throw AbstractC31885f.m99129g("updatedAt", "updatedAt", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(AbstractC30704c0 writer, UserMuteEntity value_) {
        AbstractC22676k.m65750j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo94368h();
        writer.mo94373x("userId");
        this.nullableStringAdapter.toJson(writer, value_.getUserId());
        writer.mo94373x("targetId");
        this.nullableStringAdapter.toJson(writer, value_.getTargetId());
        writer.mo94373x("createdAt");
        this.dateAdapter.toJson(writer, value_.getCreatedAt());
        writer.mo94373x("updatedAt");
        this.dateAdapter.toJson(writer, value_.getUpdatedAt());
        writer.mo94373x("expires");
        this.nullableDateAdapter.toJson(writer, value_.getExpires());
        writer.mo94370m();
    }
}
