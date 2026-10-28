package su;

import com.google.gson.annotations.SerializedName;
import l83.InterfaceC23457c;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: su.l */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m65681d2 = {"Lsu/l;", "", "", "a", "J", "getBegin", "()J", "begin", "b", "Ljava/lang/Long;", "getEnd", "()Ljava/lang/Long;", "end", "", "c", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "sdk-base_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
@InterfaceC23457c
public final /* data */ class C33008l {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("begin")
    private final long begin;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("end")
    private final Long end;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("id")
    private final String id;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33008l)) {
            return false;
        }
        C33008l c33008l = (C33008l) obj;
        return this.begin == c33008l.begin && AbstractC22676k.m65745e(this.end, c33008l.end) && AbstractC22676k.m65745e(this.id, c33008l.id);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.begin) * 31;
        Long l7 = this.end;
        return this.id.hashCode() + ((iHashCode + (l7 == null ? 0 : l7.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("StyleImageMissingEventData(begin=");
        sb4.append(this.begin);
        sb4.append(", end=");
        sb4.append(this.end);
        sb4.append(", id=");
        return AbstractC25012a.m73377j(sb4, this.id, ')');
    }
}
