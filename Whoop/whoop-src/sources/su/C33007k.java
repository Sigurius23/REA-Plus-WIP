package su;

import com.google.gson.annotations.SerializedName;
import l83.InterfaceC23457c;
import p506tu.EnumC34185l;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: su.k */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m65681d2 = {"Lsu/k;", "", "", "a", "J", "getBegin", "()J", "begin", "b", "Ljava/lang/Long;", "getEnd", "()Ljava/lang/Long;", "end", "Ltu/l;", "c", "Ltu/l;", "getType", "()Ltu/l;", "type", "sdk-base_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
@InterfaceC23457c
public final /* data */ class C33007k {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("begin")
    private final long begin;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("end")
    private final Long end;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("type")
    private final EnumC34185l type;

    public C33007k(long j7, Long l7, EnumC34185l type) {
        AbstractC22676k.m65750j(type, "type");
        this.begin = j7;
        this.end = l7;
        this.type = type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33007k)) {
            return false;
        }
        C33007k c33007k = (C33007k) obj;
        return this.begin == c33007k.begin && AbstractC22676k.m65745e(this.end, c33007k.end) && this.type == c33007k.type;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.begin) * 31;
        Long l7 = this.end;
        return this.type.hashCode() + ((iHashCode + (l7 == null ? 0 : l7.hashCode())) * 31);
    }

    public final String toString() {
        return "StyleDataLoadedEventData(begin=" + this.begin + ", end=" + this.end + ", type=" + this.type + ')';
    }
}
