package n71;

import p000.AbstractC11266d;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: n71.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0016\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001f¨\u0006\""}, m65681d2 = {"Ln71/d;", "Lm91/u;", "Ln71/f;", "type", "Ln71/e;", "stat", "Ly3/f;", "zoneHeight", "spaceBetween", "<init>", "(Ln71/f;Ln71/e;FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln71/f;", "b", "()Ln71/f;", "Ln71/e;", "()Ln71/e;", "c", "F", "getZoneHeight-D9Ej5fM", "()F", "d", "getSpaceBetween-D9Ej5fM", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C26423d implements InterfaceC25312u {

    /* JADX INFO: renamed from: e */
    public static final int f104947e = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26425f type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C26424e stat;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float zoneHeight;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float spaceBetween;

    public /* synthetic */ C26423d(InterfaceC26425f interfaceC26425f, C26424e c26424e, float f13, float f14, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC26425f, c26424e, f13, f14);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C26424e getStat() {
        return this.stat;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC26425f getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C26423d)) {
            return false;
        }
        C26423d c26423d = (C26423d) other;
        return AbstractC22676k.m65745e(this.type, c26423d.type) && AbstractC22676k.m65745e(this.stat, c26423d.stat) && C39174f.m124782b(this.zoneHeight, c26423d.zoneHeight) && C39174f.m124782b(this.spaceBetween, c26423d.spaceBetween);
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        C26424e c26424e = this.stat;
        return Float.hashCode(this.spaceBetween) + AbstractC11266d.m30447a(this.zoneHeight, (iHashCode + (c26424e == null ? 0 : c26424e.hashCode())) * 31, 31);
    }

    public String toString() {
        InterfaceC26425f interfaceC26425f = this.type;
        C26424e c26424e = this.stat;
        String strM124783c = C39174f.m124783c(this.zoneHeight);
        String strM124783c2 = C39174f.m124783c(this.spaceBetween);
        StringBuilder sb4 = new StringBuilder("HeartRateMonitorState(type=");
        sb4.append(interfaceC26425f);
        sb4.append(", stat=");
        sb4.append(c26424e);
        sb4.append(", zoneHeight=");
        return AbstractC11266d.m30464r(sb4, strM124783c, ", spaceBetween=", strM124783c2, ")");
    }

    private C26423d(InterfaceC26425f type, C26424e c26424e, float f13, float f14) {
        AbstractC22676k.m65750j(type, "type");
        this.type = type;
        this.stat = c26424e;
        this.zoneHeight = f13;
        this.spaceBetween = f14;
    }

    public C26423d(InterfaceC26425f interfaceC26425f, C26424e c26424e, float f13, float f14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC26425f, (i13 & 2) != 0 ? null : c26424e, (i13 & 4) != 0 ? 4 * ((float) 1.5d) : f13, (i13 & 8) != 0 ? 1 : f14, null);
    }
}
