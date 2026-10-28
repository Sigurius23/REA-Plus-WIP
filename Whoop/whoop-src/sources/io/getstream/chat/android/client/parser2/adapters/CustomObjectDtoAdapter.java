package io.getstream.chat.android.client.parser2.adapters;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import j93.InterfaceC21459c;
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p007a6.C0438l0;
import p441qx.AbstractC30704c0;
import p441qx.EnumC30741w;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22681m0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\b\u0010\u0018\u0000 \u001d*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001\u001dB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006JA\u0010\u000e\u001a\u0004\u0018\u00018\u00002\u0006\u0010\b\u001a\u00020\u00072\u0018\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\n0\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0004¢\u0006\u0004\b\u000e\u0010\u000fJK\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00018\u00002\u001a\u0010\f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n0\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0004¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016R!\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m65681d2 = {"Lio/getstream/chat/android/client/parser2/adapters/CustomObjectDtoAdapter;", "", "Value", "Lj93/d;", "kClass", "<init>", "(Lj93/d;)V", "Lcom/squareup/moshi/JsonReader;", "jsonReader", "Lcom/squareup/moshi/JsonAdapter;", "", "", "mapAdapter", "valueAdapter", "parseWithExtraData", "(Lcom/squareup/moshi/JsonReader;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;)Ljava/lang/Object;", "Lqx/c0;", "jsonWriter", "value", "Ll83/a0;", "serializeWithExtraData", "(Lqx/c0;Ljava/lang/Object;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;)V", "Lj93/d;", "", "memberNames$delegate", "Ll83/h;", "getMemberNames", "()Ljava/util/List;", "memberNames", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public class CustomObjectDtoAdapter<Value> {
    private static final Companion Companion = new Companion();
    private static final String EXTRA_DATA = "extraData";
    private final InterfaceC21461d kClass;

    /* JADX INFO: renamed from: memberNames$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h memberNames;

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/client/parser2/adapters/CustomObjectDtoAdapter$Companion;", "", "<init>", "()V", "EXTRA_DATA", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public CustomObjectDtoAdapter(InterfaceC21461d kClass) {
        AbstractC22676k.m65750j(kClass, "kClass");
        this.kClass = kClass;
        this.memberNames = AbstractC30060g.m92088H(new C0438l0(this, 22));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ ArrayList m54903a(CustomObjectDtoAdapter customObjectDtoAdapter) {
        return (ArrayList) memberNames_delegate$lambda$1(customObjectDtoAdapter);
    }

    private final List<String> getMemberNames() {
        return (List) this.memberNames.getValue();
    }

    private static final List memberNames_delegate$lambda$1(CustomObjectDtoAdapter customObjectDtoAdapter) {
        Collection members = customObjectDtoAdapter.kClass.getMembers();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(members, 10));
        Iterator it = members.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC21459c) it.next()).getName());
        }
        return AbstractC25265s.m74124b1(arrayList, EXTRA_DATA);
    }

    public final Value parseWithExtraData(JsonReader jsonReader, JsonAdapter<Map<String, Object>> mapAdapter, JsonAdapter<Value> valueAdapter) {
        AbstractC22676k.m65750j(jsonReader, "jsonReader");
        AbstractC22676k.m65750j(mapAdapter, "mapAdapter");
        AbstractC22676k.m65750j(valueAdapter, "valueAdapter");
        if (jsonReader.mo16731k() == EnumC30741w.f126546I) {
            jsonReader.mo16730i();
            return null;
        }
        Object objFromJson = mapAdapter.fromJson(jsonReader);
        AbstractC22676k.m65747g(objFromJson);
        Map map = (Map) objFromJson;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object obj = map.get(EXTRA_DATA);
        if (obj != null) {
            linkedHashMap.put(EXTRA_DATA, obj);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!getMemberNames().contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        map.put(EXTRA_DATA, linkedHashMap);
        Value valueFromJsonValue = valueAdapter.fromJsonValue(map);
        AbstractC22676k.m65747g(valueFromJsonValue);
        return valueFromJsonValue;
    }

    public final void serializeWithExtraData(AbstractC30704c0 jsonWriter, Value value, JsonAdapter<Map<String, Object>> mapAdapter, JsonAdapter<Value> valueAdapter) {
        AbstractC22676k.m65750j(jsonWriter, "jsonWriter");
        AbstractC22676k.m65750j(mapAdapter, "mapAdapter");
        AbstractC22676k.m65750j(valueAdapter, "valueAdapter");
        if (value == null) {
            jsonWriter.mo94363J();
            return;
        }
        Object jsonValue = valueAdapter.toJsonValue(value);
        AbstractC22676k.m65748h(jsonValue, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>");
        Map mapM65772c = AbstractC22681m0.m65772c(jsonValue);
        Object obj = mapM65772c.get(EXTRA_DATA);
        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        mapM65772c.remove(EXTRA_DATA);
        mapM65772c.putAll((Map) obj);
        mapAdapter.toJson(jsonWriter, mapM65772c);
    }
}
