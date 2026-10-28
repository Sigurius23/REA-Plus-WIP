package su;

import com.google.gson.annotations.SerializedName;
import l83.InterfaceC23457c;
import p031b9.AbstractC2875y;
import p506tu.C34178e;
import p506tu.C34181h;
import p506tu.EnumC34174a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: su.g */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010$\u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, m65681d2 = {"Lsu/g;", "", "", "a", "J", "getBegin", "()J", "begin", "b", "Ljava/lang/Long;", "getEnd", "()Ljava/lang/Long;", "end", "Ltu/a;", "c", "Ltu/a;", "getDataSource", "()Ltu/a;", "dataSource", "Ltu/e;", "d", "Ltu/e;", "getRequest", "()Ltu/e;", "request", "Ltu/h;", "e", "Ltu/h;", "getResponse", "()Ltu/h;", "response", "", "f", "Z", "getCancelled", "()Z", "cancelled", "sdk-base_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
@InterfaceC23457c
public final /* data */ class C33003g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("begin")
    private final long begin;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("end")
    private final Long end;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("data-source")
    private final EnumC34174a dataSource;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("request")
    private final C34178e request;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @SerializedName("response")
    private final C34181h response;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @SerializedName("cancelled")
    private final boolean cancelled;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33003g)) {
            return false;
        }
        C33003g c33003g = (C33003g) obj;
        return this.begin == c33003g.begin && AbstractC22676k.m65745e(this.end, c33003g.end) && this.dataSource == c33003g.dataSource && AbstractC22676k.m65745e(this.request, c33003g.request) && AbstractC22676k.m65745e(this.response, c33003g.response) && this.cancelled == c33003g.cancelled;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    public final int hashCode() {
        int iHashCode = Long.hashCode(this.begin) * 31;
        Long l7 = this.end;
        int iHashCode2 = (this.request.hashCode() + ((this.dataSource.hashCode() + ((iHashCode + (l7 == null ? 0 : l7.hashCode())) * 31)) * 31)) * 31;
        C34181h c34181h = this.response;
        int iHashCode3 = (iHashCode2 + (c34181h != null ? c34181h.hashCode() : 0)) * 31;
        boolean z4 = this.cancelled;
        ?? r10 = z4;
        if (z4) {
            r10 = 1;
        }
        return iHashCode3 + r10;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("ResourceEventData(begin=");
        sb4.append(this.begin);
        sb4.append(", end=");
        sb4.append(this.end);
        sb4.append(", dataSource=");
        sb4.append(this.dataSource);
        sb4.append(", request=");
        sb4.append(this.request);
        sb4.append(", response=");
        sb4.append(this.response);
        sb4.append(", cancelled=");
        return AbstractC2875y.m8305r(sb4, this.cancelled, ')');
    }
}
