package iz0;

import b91.C2886a;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: iz0.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0018\u0010\u0015¨\u0006\u0019"}, m65681d2 = {"Liz0/a;", "", "Lb91/a;", "h1", "h2", "h3", "h4", "<init>", "(Lb91/a;Lb91/a;Lb91/a;Lb91/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lb91/a;", "()Lb91/a;", "b", "c", "d", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21042a {

    /* JADX INFO: renamed from: e */
    public static final int f79783e = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C2886a h1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C2886a h2;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C2886a h3;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C2886a h4;

    public C21042a(C2886a h1, C2886a h7, C2886a h13, C2886a h14) {
        AbstractC22676k.m65750j(h1, "h1");
        AbstractC22676k.m65750j(h7, "h2");
        AbstractC22676k.m65750j(h13, "h3");
        AbstractC22676k.m65750j(h14, "h4");
        this.h1 = h1;
        this.h2 = h7;
        this.h3 = h13;
        this.h4 = h14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C2886a getH1() {
        return this.h1;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C2886a getH2() {
        return this.h2;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C2886a getH3() {
        return this.h3;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C2886a getH4() {
        return this.h4;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21042a)) {
            return false;
        }
        C21042a c21042a = (C21042a) other;
        return AbstractC22676k.m65745e(this.h1, c21042a.h1) && AbstractC22676k.m65745e(this.h2, c21042a.h2) && AbstractC22676k.m65745e(this.h3, c21042a.h3) && AbstractC22676k.m65745e(this.h4, c21042a.h4);
    }

    public int hashCode() {
        return this.h4.hashCode() + AbstractC11895b.m31984c(this.h3, AbstractC11895b.m31984c(this.h2, this.h1.hashCode() * 31, 31), 31);
    }

    public String toString() {
        return "HeadingStyles(h1=" + this.h1 + ", h2=" + this.h2 + ", h3=" + this.h3 + ", h4=" + this.h4 + ")";
    }
}
