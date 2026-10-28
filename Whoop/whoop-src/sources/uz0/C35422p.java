package uz0;

import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: uz0.p */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001b"}, m65681d2 = {"Luz0/p;", "", "", "size", "Luz0/k;", "style", "", "title", "<init>", "(FLuz0/k;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "()F", "b", "Luz0/k;", "()Luz0/k;", "c", "Ljava/lang/String;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35422p {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float size;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC35417k style;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String title;

    public C35422p(float f13, EnumC35417k style, String title) {
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(title, "title");
        this.size = f13;
        this.style = style;
        this.title = title;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC35417k getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35422p)) {
            return false;
        }
        C35422p c35422p = (C35422p) other;
        return Float.compare(this.size, c35422p.size) == 0 && this.style == c35422p.style && AbstractC22676k.m65745e(this.title, c35422p.title);
    }

    public int hashCode() {
        return this.title.hashCode() + ((this.style.hashCode() + (Float.hashCode(this.size) * 31)) * 31);
    }

    public String toString() {
        float f13 = this.size;
        EnumC35417k enumC35417k = this.style;
        String str = this.title;
        StringBuilder sb4 = new StringBuilder("ZoneInfoViewState(size=");
        sb4.append(f13);
        sb4.append(", style=");
        sb4.append(enumC35417k);
        sb4.append(", title=");
        return AbstractC25012a.m73376i(str, ")", sb4);
    }
}
