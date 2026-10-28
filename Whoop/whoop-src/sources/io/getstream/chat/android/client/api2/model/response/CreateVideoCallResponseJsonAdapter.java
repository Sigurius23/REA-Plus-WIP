package io.getstream.chat.android.client.api2.model.response;

import androidx.core.app.NotificationCompat;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import io.getstream.chat.android.client.api2.model.dto.VideoCallInfoDto;
import m83.C25235a0;
import p441qx.AbstractC30704c0;
import p441qx.C30722l0;
import p441qx.C30740v;
import p471rx.AbstractC31885f;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019¨\u0006\u001e"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/response/CreateVideoCallResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/response/CreateVideoCallResponse;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/response/CreateVideoCallResponse;", "Lqx/c0;", "writer", "value_", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/response/CreateVideoCallResponse;)V", "Lqx/v;", "options", "Lqx/v;", "Lio/getstream/chat/android/client/api2/model/dto/VideoCallInfoDto;", "videoCallInfoDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "", "nullableIntAdapter", "nullableStringAdapter", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class CreateVideoCallResponseJsonAdapter extends JsonAdapter<CreateVideoCallResponse> {
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final C30740v options;
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<VideoCallInfoDto> videoCallInfoDtoAdapter;

    public CreateVideoCallResponseJsonAdapter(C30722l0 moshi) {
        AbstractC22676k.m65750j(moshi, "moshi");
        this.options = C30740v.m94403a(NotificationCompat.CATEGORY_CALL, "token", "agora_uid", "agora_app_id");
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.videoCallInfoDtoAdapter = moshi.m94400c(VideoCallInfoDto.class, c25235a0, NotificationCompat.CATEGORY_CALL);
        this.stringAdapter = moshi.m94400c(String.class, c25235a0, "token");
        this.nullableIntAdapter = moshi.m94400c(Integer.class, c25235a0, "agoraUid");
        this.nullableStringAdapter = moshi.m94400c(String.class, c25235a0, "agoraAppId");
    }

    public String toString() {
        return AbstractC36095b.m114677e(45, "GeneratedJsonAdapter(CreateVideoCallResponse)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public CreateVideoCallResponse fromJson(JsonReader reader) {
        AbstractC22676k.m65750j(reader, "reader");
        reader.beginObject();
        VideoCallInfoDto videoCallInfoDto = null;
        String str = null;
        Integer num = null;
        String str2 = null;
        while (reader.hasNext()) {
            int iMo16725T = reader.mo16725T(this.options);
            if (iMo16725T == -1) {
                reader.mo16728b0();
                reader.skipValue();
            } else if (iMo16725T == 0) {
                videoCallInfoDto = (VideoCallInfoDto) this.videoCallInfoDtoAdapter.fromJson(reader);
                if (videoCallInfoDto == null) {
                    throw AbstractC31885f.m99135m(NotificationCompat.CATEGORY_CALL, NotificationCompat.CATEGORY_CALL, reader);
                }
            } else if (iMo16725T == 1) {
                str = (String) this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw AbstractC31885f.m99135m("token", "token", reader);
                }
            } else if (iMo16725T == 2) {
                num = (Integer) this.nullableIntAdapter.fromJson(reader);
            } else if (iMo16725T == 3) {
                str2 = (String) this.nullableStringAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (videoCallInfoDto == null) {
            throw AbstractC31885f.m99129g(NotificationCompat.CATEGORY_CALL, NotificationCompat.CATEGORY_CALL, reader);
        }
        if (str != null) {
            return new CreateVideoCallResponse(videoCallInfoDto, str, num, str2);
        }
        throw AbstractC31885f.m99129g("token", "token", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(AbstractC30704c0 writer, CreateVideoCallResponse value_) {
        AbstractC22676k.m65750j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo94368h();
        writer.mo94373x(NotificationCompat.CATEGORY_CALL);
        this.videoCallInfoDtoAdapter.toJson(writer, value_.getCall());
        writer.mo94373x("token");
        this.stringAdapter.toJson(writer, value_.getToken());
        writer.mo94373x("agora_uid");
        this.nullableIntAdapter.toJson(writer, value_.getAgoraUid());
        writer.mo94373x("agora_app_id");
        this.nullableStringAdapter.toJson(writer, value_.getAgoraAppId());
        writer.mo94370m();
    }
}
