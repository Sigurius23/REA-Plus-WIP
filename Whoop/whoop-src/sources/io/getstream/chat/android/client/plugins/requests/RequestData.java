package io.getstream.chat.android.client.plugins.requests;

import c13.AbstractC3855a;
import java.util.Date;
import java.util.Map;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m65681d2 = {"Lio/getstream/chat/android/client/plugins/requests/RequestData;", "", "name", "", "time", "Ljava/util/Date;", "extraData", "", "<init>", "(Ljava/lang/String;Ljava/util/Date;Ljava/util/Map;)V", "getName", "()Ljava/lang/String;", "getTime", "()Ljava/util/Date;", "getExtraData", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class RequestData {
    private final Map<String, String> extraData;
    private final String name;
    private final Date time;

    public RequestData(String name, Date time, Map<String, String> extraData) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(time, "time");
        AbstractC22676k.m65750j(extraData, "extraData");
        this.name = name;
        this.time = time;
        this.extraData = extraData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RequestData copy$default(RequestData requestData, String str, Date date, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = requestData.name;
        }
        if ((i13 & 2) != 0) {
            date = requestData.time;
        }
        if ((i13 & 4) != 0) {
            map = requestData.extraData;
        }
        return requestData.copy(str, date, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Date getTime() {
        return this.time;
    }

    public final Map<String, String> component3() {
        return this.extraData;
    }

    public final RequestData copy(String name, Date time, Map<String, String> extraData) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(time, "time");
        AbstractC22676k.m65750j(extraData, "extraData");
        return new RequestData(name, time, extraData);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequestData)) {
            return false;
        }
        RequestData requestData = (RequestData) other;
        return AbstractC22676k.m65745e(this.name, requestData.name) && AbstractC22676k.m65745e(this.time, requestData.time) && AbstractC22676k.m65745e(this.extraData, requestData.extraData);
    }

    public final Map<String, String> getExtraData() {
        return this.extraData;
    }

    public final String getName() {
        return this.name;
    }

    public final Date getTime() {
        return this.time;
    }

    public final int hashCode() {
        return this.extraData.hashCode() + AbstractC38963t7.m124373c(this.time, this.name.hashCode() * 31, 31);
    }

    public final String toString() {
        String str = this.name;
        Date date = this.time;
        return AbstractC13673n.m38565l(AbstractC3855a.m11830n("RequestData(name=", str, ", time=", date, ", extraData="), this.extraData, ")");
    }
}
