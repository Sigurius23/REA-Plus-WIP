package br2;

import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: br2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lbr2/a;", "", "", "weight", "Ly3/f;", "maxHeight", "<init>", "(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "b", "()F", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3559a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float weight;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float maxHeight;

    public /* synthetic */ C3559a(float f13, float f14, DefaultConstructorMarker defaultConstructorMarker) {
        this(f13, f14);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getMaxHeight() {
        return this.maxHeight;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getWeight() {
        return this.weight;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3559a)) {
            return false;
        }
        C3559a c3559a = (C3559a) other;
        return Float.compare(this.weight, c3559a.weight) == 0 && C39174f.m124782b(this.maxHeight, c3559a.maxHeight);
    }

    public int hashCode() {
        return Float.hashCode(this.maxHeight) + (Float.hashCode(this.weight) * 31);
    }

    public String toString() {
        return "BarSize(weight=" + this.weight + ", maxHeight=" + C39174f.m124783c(this.maxHeight) + ")";
    }

    private C3559a(float f13, float f14) {
        this.weight = f13;
        this.maxHeight = f14;
    }
}
