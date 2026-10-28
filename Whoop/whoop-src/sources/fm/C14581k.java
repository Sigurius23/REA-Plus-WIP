package fm;

import java.util.Arrays;

/* JADX INFO: renamed from: fm.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C14581k extends AbstractC14588r {

    /* JADX INFO: renamed from: a */
    public final long f53645a;

    /* JADX INFO: renamed from: b */
    public final Integer f53646b;

    /* JADX INFO: renamed from: c */
    public final long f53647c;

    /* JADX INFO: renamed from: d */
    public final byte[] f53648d;

    /* JADX INFO: renamed from: e */
    public final String f53649e;

    /* JADX INFO: renamed from: f */
    public final long f53650f;

    /* JADX INFO: renamed from: g */
    public final AbstractC14592v f53651g;

    public C14581k(long j7, Integer num, long j13, byte[] bArr, String str, long j14, AbstractC14592v abstractC14592v) {
        this.f53645a = j7;
        this.f53646b = num;
        this.f53647c = j13;
        this.f53648d = bArr;
        this.f53649e = str;
        this.f53650f = j14;
        this.f53651g = abstractC14592v;
    }

    public final boolean equals(Object obj) {
        Integer num;
        String str;
        AbstractC14592v abstractC14592v;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC14588r) {
            AbstractC14588r abstractC14588r = (AbstractC14588r) obj;
            C14581k c14581k = (C14581k) abstractC14588r;
            AbstractC14592v abstractC14592v2 = c14581k.f53651g;
            String str2 = c14581k.f53649e;
            Integer num2 = c14581k.f53646b;
            if (this.f53645a == c14581k.f53645a && ((num = this.f53646b) != null ? num.equals(num2) : num2 == null) && this.f53647c == c14581k.f53647c) {
                if (Arrays.equals(this.f53648d, abstractC14588r instanceof C14581k ? ((C14581k) abstractC14588r).f53648d : c14581k.f53648d) && ((str = this.f53649e) != null ? str.equals(str2) : str2 == null) && this.f53650f == c14581k.f53650f && ((abstractC14592v = this.f53651g) != null ? abstractC14592v.equals(abstractC14592v2) : abstractC14592v2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j7 = this.f53645a;
        int i13 = (((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f53646b;
        int iHashCode = (i13 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j13 = this.f53647c;
        int iHashCode2 = (((iHashCode ^ ((int) (j13 ^ (j13 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f53648d)) * 1000003;
        String str = this.f53649e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j14 = this.f53650f;
        int i14 = (iHashCode3 ^ ((int) (j14 ^ (j14 >>> 32)))) * 1000003;
        AbstractC14592v abstractC14592v = this.f53651g;
        return i14 ^ (abstractC14592v != null ? abstractC14592v.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f53645a + ", eventCode=" + this.f53646b + ", eventUptimeMs=" + this.f53647c + ", sourceExtension=" + Arrays.toString(this.f53648d) + ", sourceExtensionJsonProto3=" + this.f53649e + ", timezoneOffsetSeconds=" + this.f53650f + ", networkConnectionInfo=" + this.f53651g + "}";
    }
}
