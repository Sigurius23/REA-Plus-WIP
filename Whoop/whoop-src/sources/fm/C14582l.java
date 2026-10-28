package fm;

import java.util.ArrayList;

/* JADX INFO: renamed from: fm.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C14582l extends AbstractC14589s {

    /* JADX INFO: renamed from: a */
    public final long f53652a;

    /* JADX INFO: renamed from: b */
    public final long f53653b;

    /* JADX INFO: renamed from: c */
    public final C14580j f53654c;

    /* JADX INFO: renamed from: d */
    public final Integer f53655d;

    /* JADX INFO: renamed from: e */
    public final String f53656e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f53657f;

    public C14582l(long j7, long j13, C14580j c14580j, Integer num, String str, ArrayList arrayList) {
        EnumC14593w enumC14593w = EnumC14593w.f53667w;
        this.f53652a = j7;
        this.f53653b = j13;
        this.f53654c = c14580j;
        this.f53655d = num;
        this.f53656e = str;
        this.f53657f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC14589s)) {
            return false;
        }
        C14582l c14582l = (C14582l) ((AbstractC14589s) obj);
        Object obj2 = EnumC14593w.f53667w;
        ArrayList arrayList = c14582l.f53657f;
        String str = c14582l.f53656e;
        Integer num = c14582l.f53655d;
        C14580j c14580j = c14582l.f53654c;
        if (this.f53652a != c14582l.f53652a || this.f53653b != c14582l.f53653b || !this.f53654c.equals(c14580j)) {
            return false;
        }
        Integer num2 = this.f53655d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str2 = this.f53656e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return this.f53657f.equals(arrayList) && obj2.equals(obj2);
    }

    public final int hashCode() {
        long j7 = this.f53652a;
        long j13 = this.f53653b;
        int iHashCode = (((((((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j13 >>> 32) ^ j13))) * 1000003) ^ this.f53654c.hashCode()) * 1000003;
        Integer num = this.f53655d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f53656e;
        return ((((iHashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.f53657f.hashCode()) * 1000003) ^ EnumC14593w.f53667w.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f53652a + ", requestUptimeMs=" + this.f53653b + ", clientInfo=" + this.f53654c + ", logSource=" + this.f53655d + ", logSourceName=" + this.f53656e + ", logEvents=" + this.f53657f + ", qosTier=" + EnumC14593w.f53667w + "}";
    }
}
