package p716lb1;

import gz0.EnumC16313m0;
import jh3.AbstractC21702c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import rz0.EnumC31927f;

/* JADX INFO: renamed from: lb1.i2 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001d\u0010\u001c¨\u0006!"}, m65681d2 = {"Llb1/i2;", "", "Lgz0/m0;", "icon", "Ly81/f;", "backgroundColor", "contentColor", "Lrz0/f;", "tileStyle", "dismissIconColor", "<init>", "(Lgz0/m0;Ly81/f;Ly81/f;Lrz0/f;Ly81/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgz0/m0;", "d", "()Lgz0/m0;", "b", "Ly81/f;", "()Ly81/f;", "c", "Lrz0/f;", "e", "()Lrz0/f;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C23646i2 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC39333f backgroundColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC39333f contentColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC31927f tileStyle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EnumC39333f dismissIconColor;

    public C23646i2(EnumC16313m0 enumC16313m0, EnumC39333f backgroundColor, EnumC39333f contentColor, EnumC31927f enumC31927f, EnumC39333f enumC39333f) {
        AbstractC22676k.m65750j(backgroundColor, "backgroundColor");
        AbstractC22676k.m65750j(contentColor, "contentColor");
        this.icon = enumC16313m0;
        this.backgroundColor = backgroundColor;
        this.contentColor = contentColor;
        this.tileStyle = enumC31927f;
        this.dismissIconColor = enumC39333f;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC39333f getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC39333f getContentColor() {
        return this.contentColor;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC39333f getDismissIconColor() {
        return this.dismissIconColor;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC31927f getTileStyle() {
        return this.tileStyle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C23646i2)) {
            return false;
        }
        C23646i2 c23646i2 = (C23646i2) other;
        return this.icon == c23646i2.icon && this.backgroundColor == c23646i2.backgroundColor && this.contentColor == c23646i2.contentColor && this.tileStyle == c23646i2.tileStyle && this.dismissIconColor == c23646i2.dismissIconColor;
    }

    public int hashCode() {
        EnumC16313m0 enumC16313m0 = this.icon;
        int iM61132c = AbstractC21702c.m61132c(this.contentColor, AbstractC21702c.m61132c(this.backgroundColor, (enumC16313m0 == null ? 0 : enumC16313m0.hashCode()) * 31, 31), 31);
        EnumC31927f enumC31927f = this.tileStyle;
        int iHashCode = (iM61132c + (enumC31927f == null ? 0 : enumC31927f.hashCode())) * 31;
        EnumC39333f enumC39333f = this.dismissIconColor;
        return iHashCode + (enumC39333f != null ? enumC39333f.hashCode() : 0);
    }

    public String toString() {
        EnumC16313m0 enumC16313m0 = this.icon;
        EnumC39333f enumC39333f = this.backgroundColor;
        EnumC39333f enumC39333f2 = this.contentColor;
        EnumC31927f enumC31927f = this.tileStyle;
        EnumC39333f enumC39333f3 = this.dismissIconColor;
        StringBuilder sb4 = new StringBuilder("InfoCallOutStyleModel(icon=");
        sb4.append(enumC16313m0);
        sb4.append(", backgroundColor=");
        sb4.append(enumC39333f);
        sb4.append(", contentColor=");
        sb4.append(enumC39333f2);
        sb4.append(", tileStyle=");
        sb4.append(enumC31927f);
        sb4.append(", dismissIconColor=");
        return AbstractC21702c.m61138i(sb4, enumC39333f3, ")");
    }

    public /* synthetic */ C23646i2(EnumC16313m0 enumC16313m0, EnumC39333f enumC39333f, EnumC39333f enumC39333f2, EnumC31927f enumC31927f, EnumC39333f enumC39333f3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC16313m0, enumC39333f, enumC39333f2, (i13 & 8) != 0 ? null : enumC31927f, (i13 & 16) != 0 ? null : enumC39333f3);
    }
}
