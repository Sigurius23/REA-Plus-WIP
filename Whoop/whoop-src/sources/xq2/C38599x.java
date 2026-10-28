package xq2;

import jh3.AbstractC21702c;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: xq2.x */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lxq2/x;", "", "Ly3/f;", "width", "height", "Ly81/f;", "color", "<init>", "(FFLy81/f;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "c", "()F", "b", "Ly81/f;", "()Ly81/f;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C38599x {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float width;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float height;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC39333f color;

    public /* synthetic */ C38599x(float f13, float f14, EnumC39333f enumC39333f, DefaultConstructorMarker defaultConstructorMarker) {
        this(f13, f14, enumC39333f);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC39333f getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C38599x)) {
            return false;
        }
        C38599x c38599x = (C38599x) other;
        return C39174f.m124782b(this.width, c38599x.width) && C39174f.m124782b(this.height, c38599x.height) && this.color == c38599x.color;
    }

    public int hashCode() {
        return this.color.hashCode() + AbstractC11266d.m30447a(this.height, Float.hashCode(this.width) * 31, 31);
    }

    public String toString() {
        String strM124783c = C39174f.m124783c(this.width);
        String strM124783c2 = C39174f.m124783c(this.height);
        return AbstractC21702c.m61138i(AbstractC11895b.m32001t("TickSpec(width=", strM124783c, ", height=", strM124783c2, ", color="), this.color, ")");
    }

    private C38599x(float f13, float f14, EnumC39333f color) {
        AbstractC22676k.m65750j(color, "color");
        this.width = f13;
        this.height = f14;
        this.color = color;
    }
}
