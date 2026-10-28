package ok2;

import java.util.List;
import m83.C25271y;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: ok2.h */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0015\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lok2/h;", "Lm91/u;", "", "id", "", "Lok2/a;", "zoneBars", "Lok2/c;", "style", "<init>", "(Ljava/lang/String;Ljava/util/List;Lok2/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "Lok2/c;", "()Lok2/c;", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C28002h implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C27995a> zoneBars;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC27997c style;

    public C28002h(String id4, List<C27995a> zoneBars, EnumC27997c style) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(zoneBars, "zoneBars");
        AbstractC22676k.m65750j(style, "style");
        this.id = id4;
        this.zoneBars = zoneBars;
        this.style = style;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC27997c getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: b */
    public final List<C27995a> m84463b() {
        return this.zoneBars;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C28002h)) {
            return false;
        }
        C28002h c28002h = (C28002h) other;
        return AbstractC22676k.m65745e(this.id, c28002h.id) && AbstractC22676k.m65745e(this.zoneBars, c28002h.zoneBars) && this.style == c28002h.style;
    }

    public int hashCode() {
        return this.style.hashCode() + AbstractC11895b.m31983b(this.id.hashCode() * 31, 31, this.zoneBars);
    }

    public String toString() {
        String str = this.id;
        List<C27995a> list = this.zoneBars;
        EnumC27997c enumC27997c = this.style;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("TrackActivityHrZonesItemViewState(id=", str, ", zoneBars=", ", style=", list);
        sbM94766o.append(enumC27997c);
        sbM94766o.append(")");
        return sbM94766o.toString();
    }

    public /* synthetic */ C28002h(String str, List list, EnumC27997c enumC27997c, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "TRACK_ACTIVITY_HR_ZONES" : str, (i13 & 2) != 0 ? C25271y.f99162w : list, (i13 & 4) != 0 ? EnumC27997c.Full : enumC27997c);
    }
}
