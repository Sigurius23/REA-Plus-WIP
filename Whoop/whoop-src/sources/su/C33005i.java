package su;

import com.google.gson.annotations.SerializedName;
import l83.InterfaceC23457c;
import p000.AbstractC11266d;
import p506tu.C34186m;
import p506tu.EnumC34184k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: su.i */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010$\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, m65681d2 = {"Lsu/i;", "", "", "a", "J", "getBegin", "()J", "begin", "b", "Ljava/lang/Long;", "getEnd", "()Ljava/lang/Long;", "end", "", "c", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "Ltu/k;", "d", "Ltu/k;", "getType", "()Ltu/k;", "type", "", "e", "Ljava/lang/Boolean;", "getLoaded", "()Ljava/lang/Boolean;", "loaded", "Ltu/m;", "f", "Ltu/m;", "getTileID", "()Ltu/m;", "tileID", "sdk-base_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
@InterfaceC23457c
public final /* data */ class C33005i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("begin")
    private final long begin;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("end")
    private final Long end;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("id")
    private final String id;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("type")
    private final EnumC34184k type;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @SerializedName("loaded")
    private final Boolean loaded;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @SerializedName("tile-id")
    private final C34186m tileID;

    public C33005i(long j7, Long l7, String str, EnumC34184k type, Boolean bool, C34186m c34186m) {
        AbstractC22676k.m65750j(type, "type");
        this.begin = j7;
        this.end = l7;
        this.id = str;
        this.type = type;
        this.loaded = bool;
        this.tileID = c34186m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33005i)) {
            return false;
        }
        C33005i c33005i = (C33005i) obj;
        return this.begin == c33005i.begin && AbstractC22676k.m65745e(this.end, c33005i.end) && AbstractC22676k.m65745e(this.id, c33005i.id) && this.type == c33005i.type && AbstractC22676k.m65745e(this.loaded, c33005i.loaded) && AbstractC22676k.m65745e(this.tileID, c33005i.tileID);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.begin) * 31;
        Long l7 = this.end;
        int iHashCode2 = (this.type.hashCode() + AbstractC11266d.m30450d((iHashCode + (l7 == null ? 0 : l7.hashCode())) * 31, 31, this.id)) * 31;
        Boolean bool = this.loaded;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        C34186m c34186m = this.tileID;
        return iHashCode3 + (c34186m != null ? c34186m.hashCode() : 0);
    }

    public final String toString() {
        return "SourceDataLoadedEventData(begin=" + this.begin + ", end=" + this.end + ", id=" + this.id + ", type=" + this.type + ", loaded=" + this.loaded + ", tileID=" + this.tileID + ')';
    }
}
