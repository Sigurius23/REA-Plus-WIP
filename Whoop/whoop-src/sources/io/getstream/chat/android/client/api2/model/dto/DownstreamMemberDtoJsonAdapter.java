package io.getstream.chat.android.client.api2.model.dto;

import androidx.core.app.NotificationCompat;
import androidx.room.AbstractC1772c1;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.whoop.service.network.model.UserState;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.Map;
import m83.C25235a0;
import p441qx.AbstractC30704c0;
import p441qx.C30722l0;
import p441qx.C30740v;
import p471rx.AbstractC31885f;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R&\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020 0\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;", "Lqx/c0;", "writer", "value_", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;)V", "Lqx/v;", "options", "Lqx/v;", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "downstreamUserDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/util/Date;", "nullableDateAdapter", "", "nullableBooleanAdapter", "nullableStringAdapter", "", "", "mapOfStringAnyAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DownstreamMemberDtoJsonAdapter extends JsonAdapter<DownstreamMemberDto> {
    private volatile Constructor<DownstreamMemberDto> constructorRef;
    private final JsonAdapter<DownstreamUserDto> downstreamUserDtoAdapter;
    private final JsonAdapter<Map<String, Object>> mapOfStringAnyAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Date> nullableDateAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final C30740v options;

    public DownstreamMemberDtoJsonAdapter(C30722l0 moshi) {
        AbstractC22676k.m65750j(moshi, "moshi");
        this.options = C30740v.m94403a(UserState.Sources.USER, "created_at", "updated_at", "invited", "invite_accepted_at", "invite_rejected_at", "shadow_banned", "banned", "channel_role", "notifications_muted", NotificationCompat.CATEGORY_STATUS, "ban_expires", "pinned_at", "archived_at", "extraData");
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.downstreamUserDtoAdapter = moshi.m94400c(DownstreamUserDto.class, c25235a0, UserState.Sources.USER);
        this.nullableDateAdapter = moshi.m94400c(Date.class, c25235a0, "created_at");
        this.nullableBooleanAdapter = moshi.m94400c(Boolean.class, c25235a0, "invited");
        this.nullableStringAdapter = moshi.m94400c(String.class, c25235a0, "channel_role");
        this.mapOfStringAnyAdapter = moshi.m94400c(AbstractC1772c1.m5369F(Map.class, String.class, Object.class), c25235a0, "extraData");
    }

    public String toString() {
        return AbstractC36095b.m114677e(41, "GeneratedJsonAdapter(DownstreamMemberDto)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public DownstreamMemberDto fromJson(JsonReader reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        AbstractC22676k.m65750j(reader, "reader");
        reader.beginObject();
        int i13 = -1;
        DownstreamUserDto downstreamUserDto = null;
        Date date = null;
        Date date2 = null;
        Boolean bool = null;
        Date date3 = null;
        Date date4 = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        String str = null;
        Boolean bool4 = null;
        String str2 = null;
        Date date5 = null;
        Date date6 = null;
        Date date7 = null;
        Map map = null;
        while (reader.hasNext()) {
            DownstreamUserDto downstreamUserDto2 = downstreamUserDto;
            switch (reader.mo16725T(this.options)) {
                case -1:
                    reader.mo16728b0();
                    reader.skipValue();
                    break;
                case 0:
                    downstreamUserDto = (DownstreamUserDto) this.downstreamUserDtoAdapter.fromJson(reader);
                    if (downstreamUserDto == null) {
                        throw AbstractC31885f.m99135m(UserState.Sources.USER, UserState.Sources.USER, reader);
                    }
                    continue;
                    break;
                case 1:
                    date = (Date) this.nullableDateAdapter.fromJson(reader);
                    break;
                case 2:
                    date2 = (Date) this.nullableDateAdapter.fromJson(reader);
                    break;
                case 3:
                    bool = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 4:
                    date3 = (Date) this.nullableDateAdapter.fromJson(reader);
                    break;
                case 5:
                    date4 = (Date) this.nullableDateAdapter.fromJson(reader);
                    break;
                case 6:
                    bool2 = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    i13 &= -65;
                    break;
                case 7:
                    bool3 = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    i13 &= -129;
                    break;
                case 8:
                    str = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 9:
                    bool4 = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 10:
                    str2 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 11:
                    date5 = (Date) this.nullableDateAdapter.fromJson(reader);
                    break;
                case 12:
                    date6 = (Date) this.nullableDateAdapter.fromJson(reader);
                    break;
                case 13:
                    date7 = (Date) this.nullableDateAdapter.fromJson(reader);
                    break;
                case 14:
                    map = (Map) this.mapOfStringAnyAdapter.fromJson(reader);
                    if (map == null) {
                        throw AbstractC31885f.m99135m("extraData", "extraData", reader);
                    }
                    break;
            }
            downstreamUserDto = downstreamUserDto2;
        }
        DownstreamUserDto downstreamUserDto3 = downstreamUserDto;
        reader.endObject();
        if (i13 == -193) {
            if (downstreamUserDto3 == null) {
                throw AbstractC31885f.m99129g(UserState.Sources.USER, UserState.Sources.USER, reader);
            }
            if (map == null) {
                throw AbstractC31885f.m99129g("extraData", "extraData", reader);
            }
            String str3 = str;
            Boolean bool5 = bool3;
            Boolean bool6 = bool2;
            Date date8 = date4;
            Date date9 = date3;
            return new DownstreamMemberDto(downstreamUserDto3, date, date2, bool, date9, date8, bool6, bool5, str3, bool4, str2, date5, date6, date7, map);
        }
        int i14 = i13;
        Constructor<DownstreamMemberDto> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = DownstreamMemberDto.class.getDeclaredConstructor(DownstreamUserDto.class, Date.class, Date.class, Boolean.class, Date.class, Date.class, Boolean.class, Boolean.class, String.class, Boolean.class, String.class, Date.class, Date.class, Date.class, Map.class, Integer.TYPE, AbstractC31885f.f132392c);
            this.constructorRef = declaredConstructor;
            AbstractC22676k.m65749i(declaredConstructor, "also(...)");
        }
        if (r4 == 0) {
            throw AbstractC31885f.m99129g(UserState.Sources.USER, UserState.Sources.USER, reader);
        }
        if (map == null) {
            throw AbstractC31885f.m99129g("extraData", "extraData", reader);
        }
        DownstreamMemberDto downstreamMemberDtoNewInstance = declaredConstructor.newInstance(downstreamUserDto3, date, date2, bool, date3, date4, bool2, bool3, str, bool4, str2, date5, date6, date7, map, Integer.valueOf(i14), null);
        AbstractC22676k.m65749i(downstreamMemberDtoNewInstance, "newInstance(...)");
        return downstreamMemberDtoNewInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(AbstractC30704c0 writer, DownstreamMemberDto value_) {
        AbstractC22676k.m65750j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo94368h();
        writer.mo94373x(UserState.Sources.USER);
        this.downstreamUserDtoAdapter.toJson(writer, value_.getUser());
        writer.mo94373x("created_at");
        this.nullableDateAdapter.toJson(writer, value_.getCreated_at());
        writer.mo94373x("updated_at");
        this.nullableDateAdapter.toJson(writer, value_.getUpdated_at());
        writer.mo94373x("invited");
        this.nullableBooleanAdapter.toJson(writer, value_.getInvited());
        writer.mo94373x("invite_accepted_at");
        this.nullableDateAdapter.toJson(writer, value_.getInvite_accepted_at());
        writer.mo94373x("invite_rejected_at");
        this.nullableDateAdapter.toJson(writer, value_.getInvite_rejected_at());
        writer.mo94373x("shadow_banned");
        this.nullableBooleanAdapter.toJson(writer, value_.getShadow_banned());
        writer.mo94373x("banned");
        this.nullableBooleanAdapter.toJson(writer, value_.getBanned());
        writer.mo94373x("channel_role");
        this.nullableStringAdapter.toJson(writer, value_.getChannel_role());
        writer.mo94373x("notifications_muted");
        this.nullableBooleanAdapter.toJson(writer, value_.getNotifications_muted());
        writer.mo94373x(NotificationCompat.CATEGORY_STATUS);
        this.nullableStringAdapter.toJson(writer, value_.getStatus());
        writer.mo94373x("ban_expires");
        this.nullableDateAdapter.toJson(writer, value_.getBan_expires());
        writer.mo94373x("pinned_at");
        this.nullableDateAdapter.toJson(writer, value_.getPinned_at());
        writer.mo94373x("archived_at");
        this.nullableDateAdapter.toJson(writer, value_.getArchived_at());
        writer.mo94373x("extraData");
        this.mapOfStringAnyAdapter.toJson(writer, value_.getExtraData());
        writer.mo94370m();
    }
}
