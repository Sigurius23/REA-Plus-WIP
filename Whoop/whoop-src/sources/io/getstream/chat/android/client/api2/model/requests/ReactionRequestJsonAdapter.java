package io.getstream.chat.android.client.api2.model.requests;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import io.getstream.chat.android.client.api2.model.dto.UpstreamReactionDto;
import m83.C25235a0;
import p441qx.AbstractC30704c0;
import p441qx.C30722l0;
import p441qx.C30740v;
import p471rx.AbstractC31885f;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/requests/ReactionRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/requests/ReactionRequest;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/requests/ReactionRequest;", "Lqx/c0;", "writer", "value_", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/requests/ReactionRequest;)V", "Lqx/v;", "options", "Lqx/v;", "Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;", "upstreamReactionDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "booleanAdapter", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ReactionRequestJsonAdapter extends JsonAdapter<ReactionRequest> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final C30740v options;
    private final JsonAdapter<UpstreamReactionDto> upstreamReactionDtoAdapter;

    public ReactionRequestJsonAdapter(C30722l0 moshi) {
        AbstractC22676k.m65750j(moshi, "moshi");
        this.options = C30740v.m94403a("reaction", "enforce_unique", "skip_push");
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.upstreamReactionDtoAdapter = moshi.m94400c(UpstreamReactionDto.class, c25235a0, "reaction");
        this.booleanAdapter = moshi.m94400c(Boolean.TYPE, c25235a0, "enforce_unique");
    }

    public String toString() {
        return AbstractC36095b.m114677e(37, "GeneratedJsonAdapter(ReactionRequest)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public ReactionRequest fromJson(JsonReader reader) {
        AbstractC22676k.m65750j(reader, "reader");
        reader.beginObject();
        UpstreamReactionDto upstreamReactionDto = null;
        Boolean bool = null;
        Boolean bool2 = null;
        while (reader.hasNext()) {
            int iMo16725T = reader.mo16725T(this.options);
            if (iMo16725T == -1) {
                reader.mo16728b0();
                reader.skipValue();
            } else if (iMo16725T == 0) {
                upstreamReactionDto = (UpstreamReactionDto) this.upstreamReactionDtoAdapter.fromJson(reader);
                if (upstreamReactionDto == null) {
                    throw AbstractC31885f.m99135m("reaction", "reaction", reader);
                }
            } else if (iMo16725T == 1) {
                bool = (Boolean) this.booleanAdapter.fromJson(reader);
                if (bool == null) {
                    throw AbstractC31885f.m99135m("enforce_unique", "enforce_unique", reader);
                }
            } else if (iMo16725T == 2 && (bool2 = (Boolean) this.booleanAdapter.fromJson(reader)) == null) {
                throw AbstractC31885f.m99135m("skip_push", "skip_push", reader);
            }
        }
        reader.endObject();
        if (upstreamReactionDto == null) {
            throw AbstractC31885f.m99129g("reaction", "reaction", reader);
        }
        if (bool == null) {
            throw AbstractC31885f.m99129g("enforce_unique", "enforce_unique", reader);
        }
        boolean zBooleanValue = bool.booleanValue();
        if (bool2 != null) {
            return new ReactionRequest(upstreamReactionDto, zBooleanValue, bool2.booleanValue());
        }
        throw AbstractC31885f.m99129g("skip_push", "skip_push", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(AbstractC30704c0 writer, ReactionRequest value_) {
        AbstractC22676k.m65750j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo94368h();
        writer.mo94373x("reaction");
        this.upstreamReactionDtoAdapter.toJson(writer, value_.getReaction());
        writer.mo94373x("enforce_unique");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getEnforce_unique()));
        writer.mo94373x("skip_push");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getSkip_push()));
        writer.mo94370m();
    }
}
