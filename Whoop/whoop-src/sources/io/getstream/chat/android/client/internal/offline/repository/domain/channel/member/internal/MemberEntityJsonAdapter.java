package io.getstream.chat.android.client.internal.offline.repository.domain.channel.member.internal;

import androidx.core.app.NotificationCompat;
import androidx.room.AbstractC1772c1;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
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

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R&\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020 0\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntityJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;", "Lqx/c0;", "writer", "value_", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;)V", "Lqx/v;", "options", "Lqx/v;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/util/Date;", "nullableDateAdapter", "", "booleanAdapter", "nullableStringAdapter", "nullableBooleanAdapter", "", "", "mapOfStringAnyAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MemberEntityJsonAdapter extends JsonAdapter<MemberEntity> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<MemberEntity> constructorRef;
    private final JsonAdapter<Map<String, Object>> mapOfStringAnyAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Date> nullableDateAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final C30740v options;
    private final JsonAdapter<String> stringAdapter;

    public MemberEntityJsonAdapter(C30722l0 moshi) {
        AbstractC22676k.m65750j(moshi, "moshi");
        this.options = C30740v.m94403a("userId", "role", "createdAt", "updatedAt", "isInvited", "inviteAcceptedAt", "inviteRejectedAt", "shadowBanned", "banned", "channelRole", "notificationsMuted", NotificationCompat.CATEGORY_STATUS, "banExpires", "pinnedAt", "archivedAt", "extraData");
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.stringAdapter = moshi.m94400c(String.class, c25235a0, "userId");
        this.nullableDateAdapter = moshi.m94400c(Date.class, c25235a0, "createdAt");
        this.booleanAdapter = moshi.m94400c(Boolean.TYPE, c25235a0, "isInvited");
        this.nullableStringAdapter = moshi.m94400c(String.class, c25235a0, "channelRole");
        this.nullableBooleanAdapter = moshi.m94400c(Boolean.class, c25235a0, "notificationsMuted");
        this.mapOfStringAnyAdapter = moshi.m94400c(AbstractC1772c1.m5369F(Map.class, String.class, Object.class), c25235a0, "extraData");
    }

    public final String toString() {
        return AbstractC36095b.m114677e(34, "GeneratedJsonAdapter(MemberEntity)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final MemberEntity fromJson(JsonReader reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        AbstractC22676k.m65750j(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        Map map = null;
        int i13 = -1;
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        Boolean bool4 = bool3;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Date date = null;
        Date date2 = null;
        Date date3 = null;
        Date date4 = null;
        Date date5 = null;
        Boolean bool5 = null;
        Date date6 = null;
        Date date7 = null;
        while (reader.hasNext()) {
            switch (reader.mo16725T(this.options)) {
                case -1:
                    reader.mo16728b0();
                    reader.skipValue();
                    break;
                case 0:
                    str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw AbstractC31885f.m99135m("userId", "userId", reader);
                    }
                    break;
                    break;
                case 1:
                    str = (String) this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw AbstractC31885f.m99135m("role", "role", reader);
                    }
                    i13 &= -3;
                    break;
                    break;
                case 2:
                    date = (Date) this.nullableDateAdapter.fromJson(reader);
                    i13 &= -5;
                    break;
                case 3:
                    date2 = (Date) this.nullableDateAdapter.fromJson(reader);
                    i13 &= -9;
                    break;
                case 4:
                    bool2 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw AbstractC31885f.m99135m("isInvited", "isInvited", reader);
                    }
                    i13 &= -17;
                    break;
                    break;
                case 5:
                    date4 = (Date) this.nullableDateAdapter.fromJson(reader);
                    i13 &= -33;
                    break;
                case 6:
                    date5 = (Date) this.nullableDateAdapter.fromJson(reader);
                    i13 &= -65;
                    break;
                case 7:
                    bool3 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool3 == null) {
                        throw AbstractC31885f.m99135m("shadowBanned", "shadowBanned", reader);
                    }
                    i13 &= -129;
                    break;
                    break;
                case 8:
                    bool4 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool4 == null) {
                        throw AbstractC31885f.m99135m("banned", "banned", reader);
                    }
                    i13 &= -257;
                    break;
                    break;
                case 9:
                    str2 = (String) this.nullableStringAdapter.fromJson(reader);
                    i13 &= -513;
                    break;
                case 10:
                    bool5 = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    i13 &= -1025;
                    break;
                case 11:
                    str4 = (String) this.nullableStringAdapter.fromJson(reader);
                    i13 &= -2049;
                    break;
                case 12:
                    date6 = (Date) this.nullableDateAdapter.fromJson(reader);
                    i13 &= -4097;
                    break;
                case 13:
                    date7 = (Date) this.nullableDateAdapter.fromJson(reader);
                    i13 &= -8193;
                    break;
                case 14:
                    date3 = (Date) this.nullableDateAdapter.fromJson(reader);
                    i13 &= -16385;
                    break;
                case 15:
                    map = (Map) this.mapOfStringAnyAdapter.fromJson(reader);
                    if (map == null) {
                        throw AbstractC31885f.m99135m("extraData", "extraData", reader);
                    }
                    i13 &= -32769;
                    break;
                    break;
            }
        }
        reader.endObject();
        if (i13 == -65535) {
            String str5 = str2;
            if (str3 == null) {
                throw AbstractC31885f.m99129g("userId", "userId", reader);
            }
            AbstractC22676k.m65748h(str, "null cannot be cast to non-null type kotlin.String");
            Date date8 = date3;
            boolean zBooleanValue = bool2.booleanValue();
            boolean zBooleanValue2 = bool3.booleanValue();
            boolean zBooleanValue3 = bool4.booleanValue();
            AbstractC22676k.m65748h(map, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
            return new MemberEntity(str3, str, date, date2, zBooleanValue, date4, date5, zBooleanValue2, zBooleanValue3, str5, bool5, str4, date6, date7, date8, map);
        }
        Map map2 = map;
        String str6 = str2;
        String str7 = str4;
        Date date9 = date3;
        String str8 = str;
        Constructor<MemberEntity> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            Class cls2 = AbstractC31885f.f132392c;
            Class cls3 = Boolean.TYPE;
            declaredConstructor = MemberEntity.class.getDeclaredConstructor(String.class, String.class, Date.class, Date.class, cls3, Date.class, Date.class, cls3, cls3, String.class, Boolean.class, String.class, Date.class, Date.class, Date.class, Map.class, cls, cls2);
            this.constructorRef = declaredConstructor;
            AbstractC22676k.m65749i(declaredConstructor, "also(...)");
        }
        if (str3 == null) {
            throw AbstractC31885f.m99129g("userId", "userId", reader);
        }
        MemberEntity memberEntityNewInstance = declaredConstructor.newInstance(str3, str8, date, date2, bool2, date4, date5, bool3, bool4, str6, bool5, str7, date6, date7, date9, map2, Integer.valueOf(i13), null);
        AbstractC22676k.m65749i(memberEntityNewInstance, "newInstance(...)");
        return memberEntityNewInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(AbstractC30704c0 writer, MemberEntity value_) {
        AbstractC22676k.m65750j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo94368h();
        writer.mo94373x("userId");
        this.stringAdapter.toJson(writer, value_.getUserId());
        writer.mo94373x("role");
        this.stringAdapter.toJson(writer, value_.getRole());
        writer.mo94373x("createdAt");
        this.nullableDateAdapter.toJson(writer, value_.getCreatedAt());
        writer.mo94373x("updatedAt");
        this.nullableDateAdapter.toJson(writer, value_.getUpdatedAt());
        writer.mo94373x("isInvited");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.isInvited()));
        writer.mo94373x("inviteAcceptedAt");
        this.nullableDateAdapter.toJson(writer, value_.getInviteAcceptedAt());
        writer.mo94373x("inviteRejectedAt");
        this.nullableDateAdapter.toJson(writer, value_.getInviteRejectedAt());
        writer.mo94373x("shadowBanned");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getShadowBanned()));
        writer.mo94373x("banned");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getBanned()));
        writer.mo94373x("channelRole");
        this.nullableStringAdapter.toJson(writer, value_.getChannelRole());
        writer.mo94373x("notificationsMuted");
        this.nullableBooleanAdapter.toJson(writer, value_.getNotificationsMuted());
        writer.mo94373x(NotificationCompat.CATEGORY_STATUS);
        this.nullableStringAdapter.toJson(writer, value_.getStatus());
        writer.mo94373x("banExpires");
        this.nullableDateAdapter.toJson(writer, value_.getBanExpires());
        writer.mo94373x("pinnedAt");
        this.nullableDateAdapter.toJson(writer, value_.getPinnedAt());
        writer.mo94373x("archivedAt");
        this.nullableDateAdapter.toJson(writer, value_.getArchivedAt());
        writer.mo94373x("extraData");
        this.mapOfStringAnyAdapter.toJson(writer, value_.getExtraData());
        writer.mo94370m();
    }
}
