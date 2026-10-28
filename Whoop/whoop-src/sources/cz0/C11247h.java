package cz0;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.InterfaceC39332e;

/* JADX INFO: renamed from: cz0.h */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lcz0/h;", "", "Ly81/e;", "color", "", "yPercent", "<init>", "(Ly81/e;F)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ly81/e;", "()Ly81/e;", "b", "F", "()F", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C11247h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC39332e color;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float yPercent;

    public C11247h(InterfaceC39332e color, float f13) {
        AbstractC22676k.m65750j(color, "color");
        this.color = color;
        this.yPercent = f13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC39332e getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getYPercent() {
        return this.yPercent;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C11247h)) {
            return false;
        }
        C11247h c11247h = (C11247h) other;
        return AbstractC22676k.m65745e(this.color, c11247h.color) && Float.compare(this.yPercent, c11247h.yPercent) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.yPercent) + (this.color.hashCode() * 31);
    }

    public String toString() {
        return "DataScrubberDotState(color=" + this.color + ", yPercent=" + this.yPercent + ")";
    }
}
