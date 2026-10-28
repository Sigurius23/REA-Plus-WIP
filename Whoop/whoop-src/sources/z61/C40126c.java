package z61;

import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.InterfaceC39332e;

/* JADX INFO: renamed from: z61.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0019\u0010!R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001f\u0010\u001c¨\u0006\""}, m65681d2 = {"Lz61/c;", "", "Ly81/e;", "activeColor", "", "rangeMin", "rangeMax", "currentValue", "height", "positionY", "<init>", "(Ly81/e;FFLjava/lang/Float;FF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ly81/e;", "()Ly81/e;", "b", "F", "f", "()F", "c", "e", "d", "Ljava/lang/Float;", "()Ljava/lang/Float;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C40126c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC39332e activeColor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float rangeMin;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float rangeMax;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Float currentValue;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float height;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final float positionY;

    public C40126c(InterfaceC39332e activeColor, float f13, float f14, Float f15, float f16, float f17) {
        AbstractC22676k.m65750j(activeColor, "activeColor");
        this.activeColor = activeColor;
        this.rangeMin = f13;
        this.rangeMax = f14;
        this.currentValue = f15;
        this.height = f16;
        this.positionY = f17;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC39332e getActiveColor() {
        return this.activeColor;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Float getCurrentValue() {
        return this.currentValue;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getPositionY() {
        return this.positionY;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getRangeMax() {
        return this.rangeMax;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C40126c)) {
            return false;
        }
        C40126c c40126c = (C40126c) other;
        return AbstractC22676k.m65745e(this.activeColor, c40126c.activeColor) && Float.compare(this.rangeMin, c40126c.rangeMin) == 0 && Float.compare(this.rangeMax, c40126c.rangeMax) == 0 && AbstractC22676k.m65745e(this.currentValue, c40126c.currentValue) && Float.compare(this.height, c40126c.height) == 0 && Float.compare(this.positionY, c40126c.positionY) == 0;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getRangeMin() {
        return this.rangeMin;
    }

    public int hashCode() {
        int iM30447a = AbstractC11266d.m30447a(this.rangeMax, AbstractC11266d.m30447a(this.rangeMin, this.activeColor.hashCode() * 31, 31), 31);
        Float f13 = this.currentValue;
        return Float.hashCode(this.positionY) + AbstractC11266d.m30447a(this.height, (iM30447a + (f13 == null ? 0 : f13.hashCode())) * 31, 31);
    }

    public String toString() {
        return "ProgressPlotState(activeColor=" + this.activeColor + ", rangeMin=" + this.rangeMin + ", rangeMax=" + this.rangeMax + ", currentValue=" + this.currentValue + ", height=" + this.height + ", positionY=" + this.positionY + ")";
    }
}
