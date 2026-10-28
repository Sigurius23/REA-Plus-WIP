package live.hms.video.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.util.Log;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.google.gson.JsonObject;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13084s1;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import l83.C23467m;
import l83.C23468n;
import live.hms.video.error.ErrorFactory;
import live.hms.video.error.HMSException;
import live.hms.video.sdk.models.EVENT_TYPE;
import live.hms.video.sdk.models.IRetryAttemptTracking;
import live.hms.video.transport.models.TransportFailureCategory;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000~\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00028\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a-\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\bj\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t`\n*\u00020\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u000e*\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u008e\u0001\u0010!\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00112\u001c\u0010\u0014\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00122*\u0010\u0019\u001a&\b\u0001\u0012\u0004\u0012\u00020\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00170\u0013\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00152\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0080@¢\u0006\u0004\b!\u0010\"\u001a\u001b\u0010'\u001a\u00020&*\u00020#2\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b'\u0010(\u001a/\u0010+\u001a\u00020&\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u001c\u001a\u00020\u00012\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000)H\u0086\bø\u0001\u0000¢\u0006\u0004\b+\u0010,\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006-"}, m65681d2 = {"T", "", "toJson", "(Ljava/lang/Object;)Ljava/lang/String;", "Lcom/google/gson/JsonObject;", "toJsonObject", "(Ljava/lang/Object;)Lcom/google/gson/JsonObject;", "Lorg/json/JSONObject;", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "toMap", "(Lorg/json/JSONObject;)Ljava/util/HashMap;", "Lorg/json/JSONArray;", "", "toList", "(Lorg/json/JSONArray;)Ljava/util/List;", "R", "Lkotlin/Function1;", "Lq83/d;", "task", "Lkotlin/Function2;", "Llive/hms/video/transport/models/TransportFailureCategory;", "Lbc3/s;", "", "dependencyCheck", "tfcDependency", "Llive/hms/video/sdk/models/EVENT_TYPE;", "name", "Llive/hms/video/sdk/models/IRetryAttemptTracking;", "retryAttemptTracking", "", "maxRetryCount", "withRetry", "(Lkotlin/jvm/functions/Function1;Lc93/m;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/sdk/models/EVENT_TYPE;Llive/hms/video/sdk/models/IRetryAttemptTracking;ILq83/d;)Ljava/lang/Object;", "Landroid/content/Context;", "Landroid/content/BroadcastReceiver;", "receiver", "Ll83/a0;", "safeUnregisterReceiver", "(Landroid/content/Context;Landroid/content/BroadcastReceiver;)V", "Lkotlin/Function0;", "block", "traceTime", "(Ljava/lang/String;Lc93/a;)V", "lib_release"}, m65682k = 2, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class ExtensionUtilsKt {

    /* JADX INFO: renamed from: live.hms.video.utils.ExtensionUtilsKt$withRetry$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.utils.ExtensionUtilsKt", m100430f = "ExtensionUtils.kt", m100431l = {103}, m100432m = "withRetry")
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C243961<R> extends AbstractC32269c {
        int label;
        /* synthetic */ Object result;

        public C243961(InterfaceC30057d<? super C243961> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ExtensionUtilsKt.withRetry(null, null, null, null, null, 0, this);
        }
    }

    public static final void safeUnregisterReceiver(Context context, BroadcastReceiver broadcastReceiver) {
        AbstractC22676k.m65750j(context, "<this>");
        if (broadcastReceiver == null) {
            return;
        }
        try {
            context.unregisterReceiver(broadcastReceiver);
        } catch (IllegalArgumentException unused) {
        }
    }

    public static final <T> String toJson(T t14) {
        String json = GsonUtils.INSTANCE.getGson().toJson(t14);
        AbstractC22676k.m65749i(json, "toJson(...)");
        return json;
    }

    public static final <T> JsonObject toJsonObject(T t14) {
        JsonObject asJsonObject = GsonUtils.INSTANCE.getGson().toJsonTree(t14).getAsJsonObject();
        AbstractC22676k.m65749i(asJsonObject, "getAsJsonObject(...)");
        return asJsonObject;
    }

    public static final List<Object> toList(JSONArray jSONArray) throws JSONException {
        AbstractC22676k.m65750j(jSONArray, "<this>");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i13 = 0; i13 < length; i13++) {
            Object map = jSONArray.get(i13);
            AbstractC22676k.m65749i(map, "get(...)");
            if (map instanceof JSONArray) {
                map = toList((JSONArray) map);
            } else if (map instanceof JSONObject) {
                map = toMap((JSONObject) map);
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    public static final HashMap<String, Object> toMap(JSONObject jSONObject) throws JSONException {
        AbstractC22676k.m65750j(jSONObject, "<this>");
        HashMap<String, Object> map = new HashMap<>();
        Iterator<String> itKeys = jSONObject.keys();
        AbstractC22676k.m65749i(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object map2 = jSONObject.get(next);
            AbstractC22676k.m65749i(map2, "get(...)");
            if (map2 instanceof JSONArray) {
                map2 = toList((JSONArray) map2);
            } else if (map2 instanceof JSONObject) {
                map2 = toMap((JSONObject) map2);
            }
            map.put(next, map2);
        }
        return map;
    }

    public static final <T> void traceTime(String name, InterfaceC4339a block) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(block, "block");
        long jCurrentTimeMillis = System.currentTimeMillis();
        block.invoke();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        StringBuilder sbM53375p = AbstractC18489d0.m53375p(" Time taken (:", name, "): ");
        sbM53375p.append(jCurrentTimeMillis2 - jCurrentTimeMillis);
        sbM53375p.append("ms thread name ");
        sbM53375p.append(Thread.currentThread().getName());
        Log.d("Profiling", sbM53375p.toString());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <R> Object withRetry(Function1 function1, InterfaceC4351m interfaceC4351m, TransportFailureCategory transportFailureCategory, EVENT_TYPE event_type, IRetryAttemptTracking iRetryAttemptTracking, int i13, InterfaceC30057d<? super R> interfaceC30057d) throws Throwable {
        C243961 c243961;
        String message;
        if (interfaceC30057d instanceof C243961) {
            c243961 = (C243961) interfaceC30057d;
            int i14 = c243961.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c243961.label = i14 - Integer.MIN_VALUE;
            } else {
                c243961 = new C243961(interfaceC30057d);
            }
        } else {
            c243961 = new C243961(interfaceC30057d);
        }
        Object objM107888l = c243961.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = c243961.label;
        try {
            if (i15 == 0) {
                AbstractC34132o.m107864I(objM107888l);
                C13015a0 c13015a0 = new C13015a0(AbstractC13091v.m36580F(new C13084s1(new ExtensionUtilsKt$withRetry$result$1$1(transportFailureCategory, interfaceC4351m, function1, null)), HMSCoroutineScope.INSTANCE.getCoroutineContext()), new ExtensionUtilsKt$withRetry$result$1$2(i13, iRetryAttemptTracking, event_type, null));
                c243961.label = 1;
                objM107888l = AbstractC13091v.m36575A(c13015a0, c243961);
                if (objM107888l == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objM107888l);
            }
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        boolean z4 = objM107888l instanceof C23467m;
        if (!z4) {
            if ((z4 ? null : objM107888l) != null) {
                Object obj = z4 ? null : objM107888l;
                AbstractC22676k.m65747g(obj);
                return obj;
            }
        }
        if (C23468n.m68037a(objM107888l) instanceof HMSException) {
            Throwable thM68037a = C23468n.m68037a(objM107888l);
            AbstractC22676k.m65747g(thM68037a);
            throw thM68037a;
        }
        ErrorFactory.GenericErrors genericErrors = ErrorFactory.GenericErrors.INSTANCE;
        ErrorFactory.Action action = ErrorFactory.Action.NONE;
        Throwable thM68037a2 = C23468n.m68037a(objM107888l);
        if (thM68037a2 == null || (message = thM68037a2.getMessage()) == null) {
            message = "with retry caused an error";
        }
        String str = message;
        Throwable thM68037a3 = C23468n.m68037a(objM107888l);
        if (thM68037a3 == null) {
            thM68037a3 = new UnknownError();
        }
        throw ErrorFactory.GenericErrors.Unknown$default(genericErrors, action, str, thM68037a3, null, 8, null);
    }

    public static /* synthetic */ Object withRetry$default(Function1 function1, InterfaceC4351m interfaceC4351m, TransportFailureCategory transportFailureCategory, EVENT_TYPE event_type, IRetryAttemptTracking iRetryAttemptTracking, int i13, InterfaceC30057d interfaceC30057d, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            transportFailureCategory = TransportFailureCategory.SignalDisconnect;
        }
        TransportFailureCategory transportFailureCategory2 = transportFailureCategory;
        EVENT_TYPE event_type2 = (i14 & 8) != 0 ? null : event_type;
        IRetryAttemptTracking iRetryAttemptTracking2 = (i14 & 16) != 0 ? null : iRetryAttemptTracking;
        if ((i14 & 32) != 0) {
            i13 = 2;
        }
        return withRetry(function1, interfaceC4351m, transportFailureCategory2, event_type2, iRetryAttemptTracking2, i13, interfaceC30057d);
    }
}
