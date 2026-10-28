package id2;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: id2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u0017"}, m65681d2 = {"Lid2/c;", "", "Ly3/f;", "width", "height", "cornerRadius", "<init>", "(FFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "c", "()F", "b", "share_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C18418c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float width;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float height;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float cornerRadius;

    public /* synthetic */ C18418c(float f13, float f14, float f15, DefaultConstructorMarker defaultConstructorMarker) {
        this(f13, f14, f15);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getCornerRadius() {
        return this.cornerRadius;
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
        if (!(other instanceof C18418c)) {
            return false;
        }
        C18418c c18418c = (C18418c) other;
        return C39174f.m124782b(this.width, c18418c.width) && C39174f.m124782b(this.height, c18418c.height) && C39174f.m124782b(this.cornerRadius, c18418c.cornerRadius);
    }

    public int hashCode() {
        return Float.hashCode(this.cornerRadius) + AbstractC11266d.m30447a(this.height, Float.hashCode(this.width) * 31, 31);
    }

    public String toString() {
        return AbstractC25012a.m73376i(C39174f.m124783c(this.cornerRadius), ")", AbstractC11895b.m32001t("CardConfig(width=", C39174f.m124783c(this.width), ", height=", C39174f.m124783c(this.height), ", cornerRadius="));
    }

    private C18418c(float f13, float f14, float f15) {
        this.width = f13;
        this.height = f14;
        this.cornerRadius = f15;
    }
}
