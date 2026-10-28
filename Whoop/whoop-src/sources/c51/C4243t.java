package c51;

import d51.C11716d;
import m83.C25271y;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: c51.t */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Lc51/t;", "", "Li2/x;", "color", "Ld51/d;", "startRange", "stopRange", "<init>", "(JLd51/d;Ld51/d;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "Ld51/d;", "()Ld51/d;", "c", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4243t {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long color;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C11716d startRange;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C11716d stopRange;

    public /* synthetic */ C4243t(long j7, C11716d c11716d, C11716d c11716d2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j7, c11716d, c11716d2);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C11716d getStartRange() {
        return this.startRange;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C11716d getStopRange() {
        return this.stopRange;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4243t)) {
            return false;
        }
        C4243t c4243t = (C4243t) other;
        return C17919x.m51542d(this.color, c4243t.color) && AbstractC22676k.m65745e(this.startRange, c4243t.startRange) && AbstractC22676k.m65745e(this.stopRange, c4243t.stopRange);
    }

    public int hashCode() {
        long j7 = this.color;
        int i13 = C17919x.f69638o;
        return this.stopRange.hashCode() + ((this.startRange.hashCode() + (Long.hashCode(j7) * 31)) * 31);
    }

    public String toString() {
        return "CenterShadowSettings(color=" + C17919x.m51548j(this.color) + ", startRange=" + this.startRange + ", stopRange=" + this.stopRange + ")";
    }

    private C4243t(long j7, C11716d startRange, C11716d stopRange) {
        AbstractC22676k.m65750j(startRange, "startRange");
        AbstractC22676k.m65750j(stopRange, "stopRange");
        this.color = j7;
        this.startRange = startRange;
        this.stopRange = stopRange;
    }

    public /* synthetic */ C4243t(long j7, C11716d c11716d, C11716d c11716d2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC17918w0.m51517e(4278716424L) : j7, (i13 & 2) != 0 ? new C11716d(0.25f, C25271y.f99162w, 0.15f, null, 8, null) : c11716d, (i13 & 4) != 0 ? new C11716d(0.6f, AbstractC37056f.m118958J(Float.valueOf(0.55f)), 0.4f, null, 8, null) : c11716d2, null);
    }
}
