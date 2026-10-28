package io.getstream.chat.android.client.api2.model.requests;

import androidx.room.AbstractC1772c1;
import com.mapbox.maps.MapboxMap;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.List;
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
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R,\u0010\u001d\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001c0\u001b0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;", "Lqx/c0;", "writer", "value_", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;)V", "Lqx/v;", "options", "Lqx/v;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "", "", "listOfMapOfStringAnyAdapter", "nullableStringAdapter", "Ljava/util/Date;", "nullableDateAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class PinnedMessagesRequestJsonAdapter extends JsonAdapter<PinnedMessagesRequest> {
    private volatile Constructor<PinnedMessagesRequest> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<List<Map<String, Object>>> listOfMapOfStringAnyAdapter;
    private final JsonAdapter<Date> nullableDateAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final C30740v options;

    public PinnedMessagesRequestJsonAdapter(C30722l0 moshi) {
        AbstractC22676k.m65750j(moshi, "moshi");
        this.options = C30740v.m94403a(MapboxMap.QFE_LIMIT, "sort", "id_around", "id_gt", "id_gte", "id_lt", "id_lte", "pinned_at_around", "pinned_at_after", "pinned_at_after_or_equal", "pinned_at_before", "pinned_at_before_or_equal");
        Class cls = Integer.TYPE;
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.intAdapter = moshi.m94400c(cls, c25235a0, MapboxMap.QFE_LIMIT);
        this.listOfMapOfStringAnyAdapter = moshi.m94400c(AbstractC1772c1.m5369F(List.class, AbstractC1772c1.m5369F(Map.class, String.class, Object.class)), c25235a0, "sort");
        this.nullableStringAdapter = moshi.m94400c(String.class, c25235a0, "id_around");
        this.nullableDateAdapter = moshi.m94400c(Date.class, c25235a0, "pinned_at_around");
    }

    public String toString() {
        return AbstractC36095b.m114677e(43, "GeneratedJsonAdapter(PinnedMessagesRequest)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public PinnedMessagesRequest fromJson(JsonReader reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        AbstractC22676k.m65750j(reader, "reader");
        reader.beginObject();
        int i13 = -1;
        Integer num = null;
        List list = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Date date = null;
        Date date2 = null;
        Date date3 = null;
        Date date4 = null;
        Date date5 = null;
        while (reader.hasNext()) {
            switch (reader.mo16725T(this.options)) {
                case -1:
                    reader.mo16728b0();
                    reader.skipValue();
                    break;
                case 0:
                    num = (Integer) this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw AbstractC31885f.m99135m(MapboxMap.QFE_LIMIT, MapboxMap.QFE_LIMIT, reader);
                    }
                    break;
                    break;
                case 1:
                    list = (List) this.listOfMapOfStringAnyAdapter.fromJson(reader);
                    if (list == null) {
                        throw AbstractC31885f.m99135m("sort", "sort", reader);
                    }
                    break;
                    break;
                case 2:
                    str = (String) this.nullableStringAdapter.fromJson(reader);
                    i13 &= -5;
                    break;
                case 3:
                    str2 = (String) this.nullableStringAdapter.fromJson(reader);
                    i13 &= -9;
                    break;
                case 4:
                    str3 = (String) this.nullableStringAdapter.fromJson(reader);
                    i13 &= -17;
                    break;
                case 5:
                    str4 = (String) this.nullableStringAdapter.fromJson(reader);
                    i13 &= -33;
                    break;
                case 6:
                    str5 = (String) this.nullableStringAdapter.fromJson(reader);
                    i13 &= -65;
                    break;
                case 7:
                    date = (Date) this.nullableDateAdapter.fromJson(reader);
                    i13 &= -129;
                    break;
                case 8:
                    date2 = (Date) this.nullableDateAdapter.fromJson(reader);
                    i13 &= -257;
                    break;
                case 9:
                    date3 = (Date) this.nullableDateAdapter.fromJson(reader);
                    i13 &= -513;
                    break;
                case 10:
                    date4 = (Date) this.nullableDateAdapter.fromJson(reader);
                    i13 &= -1025;
                    break;
                case 11:
                    date5 = (Date) this.nullableDateAdapter.fromJson(reader);
                    i13 &= -2049;
                    break;
            }
        }
        reader.endObject();
        if (i13 == -4093) {
            Date date6 = date;
            String str6 = str4;
            String str7 = str2;
            List list2 = list;
            if (num == null) {
                throw AbstractC31885f.m99129g(MapboxMap.QFE_LIMIT, MapboxMap.QFE_LIMIT, reader);
            }
            String str8 = str5;
            String str9 = str3;
            String str10 = str;
            int iIntValue = num.intValue();
            if (list2 != null) {
                return new PinnedMessagesRequest(iIntValue, list2, str10, str7, str9, str6, str8, date6, date2, date3, date4, date5);
            }
            throw AbstractC31885f.m99129g("sort", "sort", reader);
        }
        String str11 = str3;
        String str12 = str;
        String str13 = str5;
        Date date7 = date;
        String str14 = str4;
        String str15 = str2;
        List list3 = list;
        Constructor<PinnedMessagesRequest> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            Class cls = AbstractC31885f.f132392c;
            Class cls2 = Integer.TYPE;
            declaredConstructor = PinnedMessagesRequest.class.getDeclaredConstructor(cls2, List.class, String.class, String.class, String.class, String.class, String.class, Date.class, Date.class, Date.class, Date.class, Date.class, cls2, cls);
            this.constructorRef = declaredConstructor;
            AbstractC22676k.m65749i(declaredConstructor, "also(...)");
        }
        Constructor<PinnedMessagesRequest> constructor = declaredConstructor;
        if (num == null) {
            throw AbstractC31885f.m99129g(MapboxMap.QFE_LIMIT, MapboxMap.QFE_LIMIT, reader);
        }
        if (list3 == null) {
            throw AbstractC31885f.m99129g("sort", "sort", reader);
        }
        PinnedMessagesRequest pinnedMessagesRequestNewInstance = constructor.newInstance(num, list3, str12, str15, str11, str14, str13, date7, date2, date3, date4, date5, Integer.valueOf(i13), null);
        AbstractC22676k.m65749i(pinnedMessagesRequestNewInstance, "newInstance(...)");
        return pinnedMessagesRequestNewInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(AbstractC30704c0 writer, PinnedMessagesRequest value_) {
        AbstractC22676k.m65750j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo94368h();
        writer.mo94373x(MapboxMap.QFE_LIMIT);
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getLimit()));
        writer.mo94373x("sort");
        this.listOfMapOfStringAnyAdapter.toJson(writer, value_.getSort());
        writer.mo94373x("id_around");
        this.nullableStringAdapter.toJson(writer, value_.getId_around());
        writer.mo94373x("id_gt");
        this.nullableStringAdapter.toJson(writer, value_.getId_gt());
        writer.mo94373x("id_gte");
        this.nullableStringAdapter.toJson(writer, value_.getId_gte());
        writer.mo94373x("id_lt");
        this.nullableStringAdapter.toJson(writer, value_.getId_lt());
        writer.mo94373x("id_lte");
        this.nullableStringAdapter.toJson(writer, value_.getId_lte());
        writer.mo94373x("pinned_at_around");
        this.nullableDateAdapter.toJson(writer, value_.getPinned_at_around());
        writer.mo94373x("pinned_at_after");
        this.nullableDateAdapter.toJson(writer, value_.getPinned_at_after());
        writer.mo94373x("pinned_at_after_or_equal");
        this.nullableDateAdapter.toJson(writer, value_.getPinned_at_after_or_equal());
        writer.mo94373x("pinned_at_before");
        this.nullableDateAdapter.toJson(writer, value_.getPinned_at_before());
        writer.mo94373x("pinned_at_before_or_equal");
        this.nullableDateAdapter.toJson(writer, value_.getPinned_at_before_or_equal());
        writer.mo94370m();
    }
}
