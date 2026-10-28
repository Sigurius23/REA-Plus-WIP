package su;

import com.google.gson.annotations.SerializedName;
import l83.InterfaceC23457c;
import p031b9.AbstractC2875y;
import p506tu.EnumC34177d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: su.e */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017¨\u0006\u001c"}, m65681d2 = {"Lsu/e;", "", "", "a", "J", "getBegin", "()J", "begin", "b", "Ljava/lang/Long;", "getEnd", "()Ljava/lang/Long;", "end", "Ltu/d;", "c", "Ltu/d;", "getRenderMode", "()Ltu/d;", "renderMode", "", "d", "Z", "getNeedsRepaint", "()Z", "needsRepaint", "e", "getPlacementChanged", "placementChanged", "sdk-base_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
@InterfaceC23457c
public final /* data */ class C33001e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("begin")
    private final long begin;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("end")
    private final Long end;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("render-mode")
    private final EnumC34177d renderMode;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("needs-repaint")
    private final boolean needsRepaint;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @SerializedName("placement-changed")
    private final boolean placementChanged;

    public C33001e(long j7, Long l7, EnumC34177d renderMode, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(renderMode, "renderMode");
        this.begin = j7;
        this.end = l7;
        this.renderMode = renderMode;
        this.needsRepaint = z4;
        this.placementChanged = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33001e)) {
            return false;
        }
        C33001e c33001e = (C33001e) obj;
        return this.begin == c33001e.begin && AbstractC22676k.m65745e(this.end, c33001e.end) && this.renderMode == c33001e.renderMode && this.needsRepaint == c33001e.needsRepaint && this.placementChanged == c33001e.placementChanged;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public final int hashCode() {
        int iHashCode = Long.hashCode(this.begin) * 31;
        Long l7 = this.end;
        int iHashCode2 = (this.renderMode.hashCode() + ((iHashCode + (l7 == null ? 0 : l7.hashCode())) * 31)) * 31;
        boolean z4 = this.needsRepaint;
        ?? r10 = z4;
        if (z4) {
            r10 = 1;
        }
        int i13 = (iHashCode2 + r10) * 31;
        boolean z13 = this.placementChanged;
        return i13 + (z13 ? 1 : z13);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("RenderFrameFinishedEventData(begin=");
        sb4.append(this.begin);
        sb4.append(", end=");
        sb4.append(this.end);
        sb4.append(", renderMode=");
        sb4.append(this.renderMode);
        sb4.append(", needsRepaint=");
        sb4.append(this.needsRepaint);
        sb4.append(", placementChanged=");
        return AbstractC2875y.m8305r(sb4, this.placementChanged, ')');
    }
}
