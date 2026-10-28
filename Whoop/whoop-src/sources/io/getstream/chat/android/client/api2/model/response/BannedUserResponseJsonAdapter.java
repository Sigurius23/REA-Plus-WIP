package io.getstream.chat.android.client.api2.model.response;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.client.api2.model.dto.DownstreamChannelDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamUserDto;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
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
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/response/BannedUserResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/response/BannedUserResponse;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/response/BannedUserResponse;", "Lqx/c0;", "writer", "value_", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/response/BannedUserResponse;)V", "Lqx/v;", "options", "Lqx/v;", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "downstreamUserDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableDownstreamUserDtoAdapter", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;", "nullableDownstreamChannelDtoAdapter", "Ljava/util/Date;", "nullableDateAdapter", "", "booleanAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class BannedUserResponseJsonAdapter extends JsonAdapter<BannedUserResponse> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<BannedUserResponse> constructorRef;
    private final JsonAdapter<DownstreamUserDto> downstreamUserDtoAdapter;
    private final JsonAdapter<Date> nullableDateAdapter;
    private final JsonAdapter<DownstreamChannelDto> nullableDownstreamChannelDtoAdapter;
    private final JsonAdapter<DownstreamUserDto> nullableDownstreamUserDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final C30740v options;

    public BannedUserResponseJsonAdapter(C30722l0 moshi) {
        AbstractC22676k.m65750j(moshi, "moshi");
        this.options = C30740v.m94403a(UserState.Sources.USER, "banned_by", "channel", "created_at", "expires", "shadow", "reason");
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.downstreamUserDtoAdapter = moshi.m94400c(DownstreamUserDto.class, c25235a0, UserState.Sources.USER);
        this.nullableDownstreamUserDtoAdapter = moshi.m94400c(DownstreamUserDto.class, c25235a0, "banned_by");
        this.nullableDownstreamChannelDtoAdapter = moshi.m94400c(DownstreamChannelDto.class, c25235a0, "channel");
        this.nullableDateAdapter = moshi.m94400c(Date.class, c25235a0, "created_at");
        this.booleanAdapter = moshi.m94400c(Boolean.TYPE, c25235a0, "shadow");
        this.nullableStringAdapter = moshi.m94400c(String.class, c25235a0, "reason");
    }

    public String toString() {
        return AbstractC36095b.m114677e(40, "GeneratedJsonAdapter(BannedUserResponse)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public BannedUserResponse fromJson(JsonReader reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        AbstractC22676k.m65750j(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        DownstreamUserDto downstreamUserDto = null;
        Boolean bool2 = bool;
        DownstreamUserDto downstreamUserDto2 = null;
        Date date = null;
        Date date2 = null;
        String str = null;
        int i13 = -1;
        DownstreamChannelDto downstreamChannelDto = null;
        while (reader.hasNext()) {
            switch (reader.mo16725T(this.options)) {
                case -1:
                    reader.mo16728b0();
                    reader.skipValue();
                    break;
                case 0:
                    downstreamUserDto2 = (DownstreamUserDto) this.downstreamUserDtoAdapter.fromJson(reader);
                    if (downstreamUserDto2 == null) {
                        throw AbstractC31885f.m99135m(UserState.Sources.USER, UserState.Sources.USER, reader);
                    }
                    break;
                    break;
                case 1:
                    downstreamUserDto = (DownstreamUserDto) this.nullableDownstreamUserDtoAdapter.fromJson(reader);
                    break;
                case 2:
                    downstreamChannelDto = (DownstreamChannelDto) this.nullableDownstreamChannelDtoAdapter.fromJson(reader);
                    break;
                case 3:
                    date = (Date) this.nullableDateAdapter.fromJson(reader);
                    break;
                case 4:
                    date2 = (Date) this.nullableDateAdapter.fromJson(reader);
                    break;
                case 5:
                    bool2 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw AbstractC31885f.m99135m("shadow", "shadow", reader);
                    }
                    i13 = -33;
                    break;
                    break;
                case 6:
                    str = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i13 == -33) {
            if (downstreamUserDto2 != null) {
                return new BannedUserResponse(downstreamUserDto2, downstreamUserDto, downstreamChannelDto, date, date2, bool2.booleanValue(), str);
            }
            throw AbstractC31885f.m99129g(UserState.Sources.USER, UserState.Sources.USER, reader);
        }
        Constructor<BannedUserResponse> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = BannedUserResponse.class.getDeclaredConstructor(DownstreamUserDto.class, DownstreamUserDto.class, DownstreamChannelDto.class, Date.class, Date.class, Boolean.TYPE, String.class, Integer.TYPE, AbstractC31885f.f132392c);
            this.constructorRef = declaredConstructor;
            AbstractC22676k.m65749i(declaredConstructor, "also(...)");
        }
        if (downstreamUserDto2 == null) {
            throw AbstractC31885f.m99129g(UserState.Sources.USER, UserState.Sources.USER, reader);
        }
        Date date3 = date2;
        String str2 = str;
        Date date4 = date;
        DownstreamUserDto downstreamUserDto3 = downstreamUserDto2;
        BannedUserResponse bannedUserResponseNewInstance = declaredConstructor.newInstance(downstreamUserDto3, downstreamUserDto, downstreamChannelDto, date4, date3, bool2, str2, Integer.valueOf(i13), null);
        AbstractC22676k.m65749i(bannedUserResponseNewInstance, "newInstance(...)");
        return bannedUserResponseNewInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(AbstractC30704c0 writer, BannedUserResponse value_) {
        AbstractC22676k.m65750j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo94368h();
        writer.mo94373x(UserState.Sources.USER);
        this.downstreamUserDtoAdapter.toJson(writer, value_.getUser());
        writer.mo94373x("banned_by");
        this.nullableDownstreamUserDtoAdapter.toJson(writer, value_.getBanned_by());
        writer.mo94373x("channel");
        this.nullableDownstreamChannelDtoAdapter.toJson(writer, value_.getChannel());
        writer.mo94373x("created_at");
        this.nullableDateAdapter.toJson(writer, value_.getCreated_at());
        writer.mo94373x("expires");
        this.nullableDateAdapter.toJson(writer, value_.getExpires());
        writer.mo94373x("shadow");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getShadow()));
        writer.mo94373x("reason");
        this.nullableStringAdapter.toJson(writer, value_.getReason());
        writer.mo94370m();
    }
}
