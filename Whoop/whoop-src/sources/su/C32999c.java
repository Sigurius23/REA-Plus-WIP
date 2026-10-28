package su;

import com.google.gson.annotations.SerializedName;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: su.c */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m65681d2 = {"Lsu/c;", "", "", "a", "J", "getBegin", "()J", "begin", "b", "Ljava/lang/Long;", "getEnd", "()Ljava/lang/Long;", "end", "sdk-base_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
@InterfaceC23457c
public final /* data */ class C32999c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("begin")
    private final long begin;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("end")
    private final Long end;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32999c)) {
            return false;
        }
        C32999c c32999c = (C32999c) obj;
        return this.begin == c32999c.begin && AbstractC22676k.m65745e(this.end, c32999c.end);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.begin) * 31;
        Long l7 = this.end;
        return iHashCode + (l7 == null ? 0 : l7.hashCode());
    }

    public final String toString() {
        return "MapLoadedEventData(begin=" + this.begin + ", end=" + this.end + ')';
    }
}
