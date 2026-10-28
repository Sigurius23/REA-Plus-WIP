package io0;

import p319m4.AbstractC25012a;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: io0.t */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ4\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\f¨\u0006\u0019"}, m65681d2 = {"Lio0/t;", "", "", "weight", "height", "", "unit", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "a", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lio0/t;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "b", "c", "Ljava/lang/String;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C20733t {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Integer weight;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Integer height;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String unit;

    public C20733t(Integer num, Integer num2, String str) {
        this.weight = num;
        this.height = num2;
        this.unit = str;
    }

    /* JADX INFO: renamed from: a */
    public final C20733t m57015a(Integer weight, Integer height, String unit) {
        return new C20733t(weight, height, unit);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getUnit() {
        return this.unit;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getWeight() {
        return this.weight;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C20733t)) {
            return false;
        }
        C20733t c20733t = (C20733t) other;
        return AbstractC22676k.m65745e(this.weight, c20733t.weight) && AbstractC22676k.m65745e(this.height, c20733t.height) && AbstractC22676k.m65745e(this.unit, c20733t.unit);
    }

    public int hashCode() {
        Integer num = this.weight;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.height;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.unit;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.unit, ")", AbstractC36095b.m114684l("HeightWeightPickerResponseBody(weight=", this.weight, ", height=", this.height, ", unit="));
    }

    public /* synthetic */ C20733t(Integer num, Integer num2, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : num, (i13 & 2) != 0 ? null : num2, (i13 & 4) != 0 ? null : str);
    }
}
