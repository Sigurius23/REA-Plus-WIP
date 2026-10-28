package pk;

import java.util.LinkedHashMap;
import java.util.Map;
import p000.AbstractC30802r;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: pk.a */
/* JADX INFO: loaded from: classes.dex */
public final class C29327a {

    /* JADX INFO: renamed from: a */
    public final String f118779a;

    /* JADX INFO: renamed from: b */
    public final Map f118780b;

    /* JADX INFO: renamed from: c */
    public final Map f118781c;

    /* JADX INFO: renamed from: d */
    public final Map f118782d;

    /* JADX INFO: renamed from: e */
    public final Map f118783e;

    public C29327a(String eventType, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, LinkedHashMap linkedHashMap3, LinkedHashMap linkedHashMap4) {
        AbstractC22676k.m65750j(eventType, "eventType");
        this.f118779a = eventType;
        this.f118780b = linkedHashMap;
        this.f118781c = linkedHashMap2;
        this.f118782d = linkedHashMap3;
        this.f118783e = linkedHashMap4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29327a)) {
            return false;
        }
        C29327a c29327a = (C29327a) obj;
        return AbstractC22676k.m65745e(this.f118779a, c29327a.f118779a) && AbstractC22676k.m65745e(this.f118780b, c29327a.f118780b) && AbstractC22676k.m65745e(this.f118781c, c29327a.f118781c) && AbstractC22676k.m65745e(this.f118782d, c29327a.f118782d) && AbstractC22676k.m65745e(this.f118783e, c29327a.f118783e);
    }

    public final int hashCode() {
        int iHashCode = this.f118779a.hashCode() * 31;
        Map map = this.f118780b;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map map2 = this.f118781c;
        int iHashCode3 = (iHashCode2 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map map3 = this.f118782d;
        int iHashCode4 = (iHashCode3 + (map3 == null ? 0 : map3.hashCode())) * 31;
        Map map4 = this.f118783e;
        return iHashCode4 + (map4 != null ? map4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Event(eventType=");
        sb4.append(this.f118779a);
        sb4.append(", eventProperties=");
        sb4.append(this.f118780b);
        sb4.append(", userProperties=");
        sb4.append(this.f118781c);
        sb4.append(", groups=");
        sb4.append(this.f118782d);
        sb4.append(", groupProperties=");
        return AbstractC30802r.m94764m(sb4, this.f118783e, ')');
    }
}
