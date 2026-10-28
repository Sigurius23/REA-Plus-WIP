package lz0;

import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: lz0.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u0018\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006\""}, m65681d2 = {"Llz0/a;", "", "Ly81/f;", "color", "", "rangeMin", "rangeMax", "currentValue", "", "showAnnotation", "<init>", "(Ly81/f;FFLjava/lang/Float;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ly81/f;", "()Ly81/f;", "b", "F", "d", "()F", "c", "Ljava/lang/Float;", "()Ljava/lang/Float;", "e", "Z", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C24816a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC39333f color;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float rangeMin;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float rangeMax;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Float currentValue;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean showAnnotation;

    public C24816a(EnumC39333f color, float f13, float f14, Float f15, boolean z4) {
        AbstractC22676k.m65750j(color, "color");
        this.color = color;
        this.rangeMin = f13;
        this.rangeMax = f14;
        this.currentValue = f15;
        this.showAnnotation = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC39333f getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Float getCurrentValue() {
        return this.currentValue;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getRangeMax() {
        return this.rangeMax;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getRangeMin() {
        return this.rangeMin;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getShowAnnotation() {
        return this.showAnnotation;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24816a)) {
            return false;
        }
        C24816a c24816a = (C24816a) other;
        return this.color == c24816a.color && Float.compare(this.rangeMin, c24816a.rangeMin) == 0 && Float.compare(this.rangeMax, c24816a.rangeMax) == 0 && AbstractC22676k.m65745e(this.currentValue, c24816a.currentValue) && this.showAnnotation == c24816a.showAnnotation;
    }

    public int hashCode() {
        int iM30447a = AbstractC11266d.m30447a(this.rangeMax, AbstractC11266d.m30447a(this.rangeMin, this.color.hashCode() * 31, 31), 31);
        Float f13 = this.currentValue;
        return Boolean.hashCode(this.showAnnotation) + ((iM30447a + (f13 == null ? 0 : f13.hashCode())) * 31);
    }

    public String toString() {
        EnumC39333f enumC39333f = this.color;
        float f13 = this.rangeMin;
        float f14 = this.rangeMax;
        Float f15 = this.currentValue;
        boolean z4 = this.showAnnotation;
        StringBuilder sb4 = new StringBuilder("PregnancyProgressBar(color=");
        sb4.append(enumC39333f);
        sb4.append(", rangeMin=");
        sb4.append(f13);
        sb4.append(", rangeMax=");
        sb4.append(f14);
        sb4.append(", currentValue=");
        sb4.append(f15);
        sb4.append(", showAnnotation=");
        return AbstractC18489d0.m53372m(sb4, z4, ")");
    }
}
