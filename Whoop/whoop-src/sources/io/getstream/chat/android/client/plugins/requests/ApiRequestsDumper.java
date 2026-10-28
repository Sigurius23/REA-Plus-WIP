package io.getstream.chat.android.client.plugins.requests;

import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.C19336c;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import m83.AbstractC25265s;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00060\bj\u0002`\t*\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R&\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, m65681d2 = {"Lio/getstream/chat/android/client/plugins/requests/ApiRequestsDumper;", "Lio/getstream/chat/android/client/plugins/requests/ApiRequestsAnalyser;", "Ljava/text/DateFormat;", "dateFormat", "<init>", "(Ljava/text/DateFormat;)V", "", "Lio/getstream/chat/android/client/plugins/requests/RequestData;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "toHumanReadableStringBuilder", "(Ljava/util/List;)Ljava/lang/StringBuilder;", "", "requestName", "", "data", "Ll83/a0;", "registerRequest", "(Ljava/lang/String;Ljava/util/Map;)V", "dumpRequestByName", "(Ljava/lang/String;)Ljava/lang/String;", "dumpAll", "()Ljava/lang/String;", "clearAll", "()V", "queryText", "clearRequestContaining", "(Ljava/lang/String;)V", "", "countRequestContaining", "(Ljava/lang/String;)I", "countAllRequests", "()I", "Ljava/text/DateFormat;", "", "requestsDataMap", "Ljava/util/Map;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ApiRequestsDumper implements ApiRequestsAnalyser {
    private final DateFormat dateFormat;
    private final Map<String, List<RequestData>> requestsDataMap;

    /* JADX WARN: Multi-variable type inference failed */
    public ApiRequestsDumper() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m54911a(Map.Entry entry) {
        return (String) toHumanReadableStringBuilder$lambda$9$lambda$8$lambda$7(entry);
    }

    private final StringBuilder toHumanReadableStringBuilder(List<RequestData> list) {
        String name = ((RequestData) AbstractC25265s.m74096F0(list)).getName();
        int size = list.size();
        StringBuilder sb4 = new StringBuilder();
        int i13 = 0;
        for (Object obj : list) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            RequestData requestData = (RequestData) obj;
            String str = this.dateFormat.format(requestData.getTime());
            String strM74110N0 = AbstractC25265s.m74110N0(requestData.getExtraData().entrySet(), null, null, null, new C19336c(11), 31);
            StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "Call ", ". Time: ", str, ". Params: ");
            sbM53373n.append(strM74110N0);
            sb4.append(sbM53373n.toString());
            sb4.append('\n');
            i13 = i14;
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Request: " + name + ". Count: " + size);
        sb5.append('\n');
        sb5.append((CharSequence) sb4);
        return sb5;
    }

    private static final CharSequence toHumanReadableStringBuilder$lambda$9$lambda$8$lambda$7(Map.Entry entry) {
        AbstractC22676k.m65750j(entry, "<destruct>");
        return AbstractC18489d0.m53370k((String) entry.getKey(), " - ", (String) entry.getValue());
    }

    @Override // io.getstream.chat.android.client.plugins.requests.ApiRequestsAnalyser
    public final void clearAll() {
        this.requestsDataMap.clear();
    }

    @Override // io.getstream.chat.android.client.plugins.requests.ApiRequestsAnalyser
    public final void clearRequestContaining(String queryText) {
        AbstractC22676k.m65750j(queryText, "queryText");
        synchronized (this) {
            try {
                Set<String> setKeySet = this.requestsDataMap.keySet();
                ArrayList arrayList = new ArrayList();
                for (Object obj : setKeySet) {
                    if (AbstractC39414r.m125876U((String) obj, queryText, false)) {
                        arrayList.add(obj);
                    }
                }
                Map<String, List<RequestData>> map = this.requestsDataMap;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    map.remove((String) it.next());
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // io.getstream.chat.android.client.plugins.requests.ApiRequestsAnalyser
    public final int countAllRequests() {
        Iterator<T> it = this.requestsDataMap.values().iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((List) it.next()).size();
        }
        return size;
    }

    @Override // io.getstream.chat.android.client.plugins.requests.ApiRequestsAnalyser
    public final int countRequestContaining(String requestName) {
        Object next;
        AbstractC22676k.m65750j(requestName, "requestName");
        Iterator<T> it = this.requestsDataMap.keySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC39414r.m125876U((String) next, requestName, false));
        List<RequestData> list = this.requestsDataMap.get((String) next);
        if (list != null) {
            return list.size();
        }
        return -1;
    }

    @Override // io.getstream.chat.android.client.plugins.requests.ApiRequestsAnalyser
    public final String dumpAll() {
        StringBuilder sb4 = new StringBuilder();
        Iterator<T> it = this.requestsDataMap.values().iterator();
        while (it.hasNext()) {
            sb4.append((CharSequence) toHumanReadableStringBuilder((List) it.next()));
            sb4.append('\n');
        }
        return sb4.toString();
    }

    @Override // io.getstream.chat.android.client.plugins.requests.ApiRequestsAnalyser
    public final String dumpRequestByName(String requestName) {
        String string;
        AbstractC22676k.m65750j(requestName, "requestName");
        List<RequestData> list = this.requestsDataMap.get(requestName);
        return (list == null || (string = toHumanReadableStringBuilder(list).toString()) == null) ? "not found" : string;
    }

    @Override // io.getstream.chat.android.client.plugins.requests.ApiRequestsAnalyser
    public final void registerRequest(String requestName, Map<String, String> data) {
        AbstractC22676k.m65750j(requestName, "requestName");
        AbstractC22676k.m65750j(data, "data");
        synchronized (this) {
            try {
                RequestData requestData = new RequestData(requestName, new Date(), data);
                Map<String, List<RequestData>> map = this.requestsDataMap;
                List<RequestData> list = map.get(requestName);
                if (list == null) {
                    list = C25271y.f99162w;
                }
                map.put(requestName, AbstractC25265s.m74128f1(requestData, list));
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public ApiRequestsDumper(DateFormat dateFormat) {
        AbstractC22676k.m65750j(dateFormat, "dateFormat");
        this.dateFormat = dateFormat;
        this.requestsDataMap = new LinkedHashMap();
    }

    public /* synthetic */ ApiRequestsDumper(DateFormat dateFormat, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new SimpleDateFormat("HH:mm:ss.SSS", Locale.getDefault()) : dateFormat);
    }
}
