package gm;

import a30.C0332w0;
import java.util.HashMap;
import java.util.Map;
import p127ev.AbstractC13673n;

/* JADX INFO: renamed from: gm.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C15980h {

    /* JADX INFO: renamed from: a */
    public final String f60482a;

    /* JADX INFO: renamed from: b */
    public final Integer f60483b;

    /* JADX INFO: renamed from: c */
    public final C15985m f60484c;

    /* JADX INFO: renamed from: d */
    public final long f60485d;

    /* JADX INFO: renamed from: e */
    public final long f60486e;

    /* JADX INFO: renamed from: f */
    public final Map f60487f;

    public C15980h(String str, Integer num, C15985m c15985m, long j7, long j13, HashMap map) {
        this.f60482a = str;
        this.f60483b = num;
        this.f60484c = c15985m;
        this.f60485d = j7;
        this.f60486e = j13;
        this.f60487f = map;
    }

    /* JADX INFO: renamed from: a */
    public final String m45122a(String str) {
        String str2 = (String) this.f60487f.get(str);
        return str2 == null ? "" : str2;
    }

    /* JADX INFO: renamed from: b */
    public final int m45123b(String str) {
        String str2 = (String) this.f60487f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* JADX INFO: renamed from: c */
    public final C0332w0 m45124c() {
        C0332w0 c0332w0 = new C0332w0(4);
        String str = this.f60482a;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        c0332w0.f1170z = str;
        c0332w0.f1168x = this.f60483b;
        C15985m c15985m = this.f60484c;
        if (c15985m == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        c0332w0.f1169y = c15985m;
        c0332w0.f1164E = Long.valueOf(this.f60485d);
        c0332w0.f1165F = Long.valueOf(this.f60486e);
        c0332w0.f1166G = new HashMap(this.f60487f);
        return c0332w0;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C15980h) {
            C15980h c15980h = (C15980h) obj;
            Integer num2 = c15980h.f60483b;
            if (this.f60482a.equals(c15980h.f60482a) && ((num = this.f60483b) != null ? num.equals(num2) : num2 == null) && this.f60484c.equals(c15980h.f60484c) && this.f60485d == c15980h.f60485d && this.f60486e == c15980h.f60486e && this.f60487f.equals(c15980h.f60487f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f60482a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f60483b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f60484c.hashCode()) * 1000003;
        long j7 = this.f60485d;
        int i13 = (iHashCode2 ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        long j13 = this.f60486e;
        return ((i13 ^ ((int) (j13 ^ (j13 >>> 32)))) * 1000003) ^ this.f60487f.hashCode();
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("EventInternal{transportName=");
        sb4.append(this.f60482a);
        sb4.append(", code=");
        sb4.append(this.f60483b);
        sb4.append(", encodedPayload=");
        sb4.append(this.f60484c);
        sb4.append(", eventMillis=");
        sb4.append(this.f60485d);
        sb4.append(", uptimeMillis=");
        sb4.append(this.f60486e);
        sb4.append(", autoMetadata=");
        return AbstractC13673n.m38565l(sb4, this.f60487f, "}");
    }
}
