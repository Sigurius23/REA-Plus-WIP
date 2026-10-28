package co1;

import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.InterfaceC39332e;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: co1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0007\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010\u001f¨\u0006$"}, m65681d2 = {"Lco1/b;", "", "Ly81/e;", "color", "Ly3/f;", "lineWidth", "", "isDashed", "hasLeadingEdge", "hasTrailingEdge", "<init>", "(Ly81/e;FZZZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ly81/e;", "getColor", "()Ly81/e;", "b", "F", "getLineWidth-D9Ej5fM", "()F", "c", "Z", "()Z", "d", "getHasLeadingEdge", "e", "getHasTrailingEdge", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4860b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC39332e color;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float lineWidth;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isDashed;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean hasLeadingEdge;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean hasTrailingEdge;

    public /* synthetic */ C4860b(InterfaceC39332e interfaceC39332e, float f13, boolean z4, boolean z13, boolean z14, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC39332e, f13, z4, z13, z14);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4860b)) {
            return false;
        }
        C4860b c4860b = (C4860b) other;
        return AbstractC22676k.m65745e(this.color, c4860b.color) && C39174f.m124782b(this.lineWidth, c4860b.lineWidth) && this.isDashed == c4860b.isDashed && this.hasLeadingEdge == c4860b.hasLeadingEdge && this.hasTrailingEdge == c4860b.hasTrailingEdge;
    }

    public int hashCode() {
        return Boolean.hashCode(this.hasTrailingEdge) + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30447a(this.lineWidth, this.color.hashCode() * 31, 31), 31, this.isDashed), 31, this.hasLeadingEdge);
    }

    public String toString() {
        InterfaceC39332e interfaceC39332e = this.color;
        String strM124783c = C39174f.m124783c(this.lineWidth);
        boolean z4 = this.isDashed;
        boolean z13 = this.hasLeadingEdge;
        boolean z14 = this.hasTrailingEdge;
        StringBuilder sb4 = new StringBuilder("FertilityCalendarOutlineState(color=");
        sb4.append(interfaceC39332e);
        sb4.append(", lineWidth=");
        sb4.append(strM124783c);
        sb4.append(", isDashed=");
        AbstractC38963t7.m124392v(sb4, z4, ", hasLeadingEdge=", z13, ", hasTrailingEdge=");
        return AbstractC18489d0.m53372m(sb4, z14, ")");
    }

    private C4860b(InterfaceC39332e color, float f13, boolean z4, boolean z13, boolean z14) {
        AbstractC22676k.m65750j(color, "color");
        this.color = color;
        this.lineWidth = f13;
        this.isDashed = z4;
        this.hasLeadingEdge = z13;
        this.hasTrailingEdge = z14;
    }
}
