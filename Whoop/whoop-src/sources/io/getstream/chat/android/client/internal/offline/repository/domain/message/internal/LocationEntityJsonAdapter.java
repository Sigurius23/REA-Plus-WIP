package io.getstream.chat.android.client.internal.offline.repository.domain.message.internal;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
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
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntityJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;", "Lqx/c0;", "writer", "value_", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;)V", "Lqx/v;", "options", "Lqx/v;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/util/Date;", "nullableDateAdapter", "", "doubleAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class LocationEntityJsonAdapter extends JsonAdapter<LocationEntity> {
    private volatile Constructor<LocationEntity> constructorRef;
    private final JsonAdapter<Double> doubleAdapter;
    private final JsonAdapter<Date> nullableDateAdapter;
    private final C30740v options;
    private final JsonAdapter<String> stringAdapter;

    public LocationEntityJsonAdapter(C30722l0 moshi) {
        AbstractC22676k.m65750j(moshi, "moshi");
        this.options = C30740v.m94403a("cid", "messageId", "userId", "endAt", "latitude", "longitude", "deviceId");
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.stringAdapter = moshi.m94400c(String.class, c25235a0, "cid");
        this.nullableDateAdapter = moshi.m94400c(Date.class, c25235a0, "endAt");
        this.doubleAdapter = moshi.m94400c(Double.TYPE, c25235a0, "latitude");
    }

    public final String toString() {
        return AbstractC36095b.m114677e(36, "GeneratedJsonAdapter(LocationEntity)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final LocationEntity fromJson(JsonReader reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        AbstractC22676k.m65750j(reader, "reader");
        Double dValueOf = Double.valueOf(0.0d);
        reader.beginObject();
        int i13 = -1;
        Double d3 = dValueOf;
        Double d14 = d3;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Date date = null;
        while (reader.hasNext()) {
            switch (reader.mo16725T(this.options)) {
                case -1:
                    reader.mo16728b0();
                    reader.skipValue();
                    break;
                case 0:
                    str = (String) this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw AbstractC31885f.m99135m("cid", "cid", reader);
                    }
                    i13 &= -2;
                    break;
                    break;
                case 1:
                    str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw AbstractC31885f.m99135m("messageId", "messageId", reader);
                    }
                    i13 &= -3;
                    break;
                    break;
                case 2:
                    str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw AbstractC31885f.m99135m("userId", "userId", reader);
                    }
                    i13 &= -5;
                    break;
                    break;
                case 3:
                    date = (Date) this.nullableDateAdapter.fromJson(reader);
                    i13 &= -9;
                    break;
                case 4:
                    d3 = (Double) this.doubleAdapter.fromJson(reader);
                    if (d3 == null) {
                        throw AbstractC31885f.m99135m("latitude", "latitude", reader);
                    }
                    i13 &= -17;
                    break;
                    break;
                case 5:
                    d14 = (Double) this.doubleAdapter.fromJson(reader);
                    if (d14 == null) {
                        throw AbstractC31885f.m99135m("longitude", "longitude", reader);
                    }
                    i13 &= -33;
                    break;
                    break;
                case 6:
                    str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw AbstractC31885f.m99135m("deviceId", "deviceId", reader);
                    }
                    i13 &= -65;
                    break;
                    break;
            }
        }
        reader.endObject();
        if (i13 == -128) {
            AbstractC22676k.m65748h(str, "null cannot be cast to non-null type kotlin.String");
            AbstractC22676k.m65748h(str2, "null cannot be cast to non-null type kotlin.String");
            AbstractC22676k.m65748h(str4, "null cannot be cast to non-null type kotlin.String");
            double dDoubleValue = d3.doubleValue();
            double dDoubleValue2 = d14.doubleValue();
            AbstractC22676k.m65748h(str3, "null cannot be cast to non-null type kotlin.String");
            return new LocationEntity(str, str2, str4, date, dDoubleValue, dDoubleValue2, str3);
        }
        String str5 = str3;
        Constructor<LocationEntity> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            Class cls2 = AbstractC31885f.f132392c;
            Class cls3 = Double.TYPE;
            declaredConstructor = LocationEntity.class.getDeclaredConstructor(String.class, String.class, String.class, Date.class, cls3, cls3, String.class, cls, cls2);
            this.constructorRef = declaredConstructor;
            AbstractC22676k.m65749i(declaredConstructor, "also(...)");
        }
        LocationEntity locationEntityNewInstance = declaredConstructor.newInstance(str, str2, str4, date, d3, d14, str5, Integer.valueOf(i13), null);
        AbstractC22676k.m65749i(locationEntityNewInstance, "newInstance(...)");
        return locationEntityNewInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(AbstractC30704c0 writer, LocationEntity value_) {
        AbstractC22676k.m65750j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo94368h();
        writer.mo94373x("cid");
        this.stringAdapter.toJson(writer, value_.getCid());
        writer.mo94373x("messageId");
        this.stringAdapter.toJson(writer, value_.getMessageId());
        writer.mo94373x("userId");
        this.stringAdapter.toJson(writer, value_.getUserId());
        writer.mo94373x("endAt");
        this.nullableDateAdapter.toJson(writer, value_.getEndAt());
        writer.mo94373x("latitude");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getLatitude()));
        writer.mo94373x("longitude");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getLongitude()));
        writer.mo94373x("deviceId");
        this.stringAdapter.toJson(writer, value_.getDeviceId());
        writer.mo94370m();
    }
}
