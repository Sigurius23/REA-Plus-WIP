package a01;

import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.InterfaceC39332e;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: a01.o */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"La01/o;", "", "Ly81/e;", "style", "", "start", "end", "<init>", "(Ly81/e;FF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ly81/e;", "c", "()Ly81/e;", "b", "F", "()F", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C0095o {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC39332e style;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float start;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float end;

    public C0095o(InterfaceC39332e style, float f13, float f14) {
        AbstractC22676k.m65750j(style, "style");
        this.style = style;
        this.start = f13;
        this.end = f14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getEnd() {
        return this.end;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC39332e getStyle() {
        return this.style;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C0095o)) {
            return false;
        }
        C0095o c0095o = (C0095o) other;
        return AbstractC22676k.m65745e(this.style, c0095o.style) && Float.compare(this.start, c0095o.start) == 0 && Float.compare(this.end, c0095o.end) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.end) + AbstractC11266d.m30447a(this.start, this.style.hashCode() * 31, 31);
    }

    public String toString() {
        InterfaceC39332e interfaceC39332e = this.style;
        float f13 = this.start;
        float f14 = this.end;
        StringBuilder sb4 = new StringBuilder("RangeSectionViewState(style=");
        sb4.append(interfaceC39332e);
        sb4.append(", start=");
        sb4.append(f13);
        sb4.append(", end=");
        return AbstractC30007c.m91837g(f14, ")", sb4);
    }
}
