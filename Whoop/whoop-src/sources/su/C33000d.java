package su;

import com.google.gson.annotations.SerializedName;
import l83.InterfaceC23457c;
import p000.AbstractC11266d;
import p506tu.C34186m;
import p506tu.EnumC34176c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: su.d */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u001c\u0010!\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, m65681d2 = {"Lsu/d;", "", "", "a", "J", "getBegin", "()J", "begin", "b", "Ljava/lang/Long;", "getEnd", "()Ljava/lang/Long;", "end", "Ltu/c;", "c", "Ltu/c;", "getType", "()Ltu/c;", "type", "", "d", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "e", "getSourceId", "sourceId", "Ltu/m;", "f", "Ltu/m;", "getTileId", "()Ltu/m;", "tileId", "sdk-base_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
@InterfaceC23457c
public final /* data */ class C33000d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("begin")
    private final long begin;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("end")
    private final Long end;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("type")
    private final EnumC34176c type;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("message")
    private final String message;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @SerializedName("source-id")
    private final String sourceId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @SerializedName("tile-id")
    private final C34186m tileId;

    public C33000d(long j7, Long l7, EnumC34176c type, String str, String str2, C34186m c34186m) {
        AbstractC22676k.m65750j(type, "type");
        this.begin = j7;
        this.end = l7;
        this.type = type;
        this.message = str;
        this.sourceId = str2;
        this.tileId = c34186m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33000d)) {
            return false;
        }
        C33000d c33000d = (C33000d) obj;
        return this.begin == c33000d.begin && AbstractC22676k.m65745e(this.end, c33000d.end) && this.type == c33000d.type && AbstractC22676k.m65745e(this.message, c33000d.message) && AbstractC22676k.m65745e(this.sourceId, c33000d.sourceId) && AbstractC22676k.m65745e(this.tileId, c33000d.tileId);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.begin) * 31;
        Long l7 = this.end;
        int iM30450d = AbstractC11266d.m30450d((this.type.hashCode() + ((iHashCode + (l7 == null ? 0 : l7.hashCode())) * 31)) * 31, 31, this.message);
        String str = this.sourceId;
        int iHashCode2 = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        C34186m c34186m = this.tileId;
        return iHashCode2 + (c34186m != null ? c34186m.hashCode() : 0);
    }

    public final String toString() {
        return "MapLoadingErrorEventData(begin=" + this.begin + ", end=" + this.end + ", type=" + this.type + ", message=" + this.message + ", sourceId=" + this.sourceId + ", tileId=" + this.tileId + ')';
    }
}
