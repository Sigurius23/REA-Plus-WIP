package p716lb1;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: lb1.f3 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Llb1/f3;", "", "Ly81/f;", "foregroundColor", "backgroundColor", "<init>", "(Ly81/f;Ly81/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ly81/f;", "b", "()Ly81/f;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C23626f3 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC39333f foregroundColor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC39333f backgroundColor;

    public C23626f3(EnumC39333f foregroundColor, EnumC39333f backgroundColor) {
        AbstractC22676k.m65750j(foregroundColor, "foregroundColor");
        AbstractC22676k.m65750j(backgroundColor, "backgroundColor");
        this.foregroundColor = foregroundColor;
        this.backgroundColor = backgroundColor;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC39333f getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC39333f getForegroundColor() {
        return this.foregroundColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C23626f3)) {
            return false;
        }
        C23626f3 c23626f3 = (C23626f3) other;
        return this.foregroundColor == c23626f3.foregroundColor && this.backgroundColor == c23626f3.backgroundColor;
    }

    public int hashCode() {
        return this.backgroundColor.hashCode() + (this.foregroundColor.hashCode() * 31);
    }

    public String toString() {
        return "MiniCalloutStyleProperties(foregroundColor=" + this.foregroundColor + ", backgroundColor=" + this.backgroundColor + ")";
    }
}
