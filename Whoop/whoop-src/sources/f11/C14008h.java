package f11;

import jh3.AbstractC21702c;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: f11.h */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0019"}, m65681d2 = {"Lf11/h;", "", "Ly81/f;", "activeColor", "", "isToday", "borderColor", "<init>", "(Ly81/f;ZLy81/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ly81/f;", "()Ly81/f;", "b", "Z", "c", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C14008h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC39333f activeColor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isToday;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC39333f borderColor;

    public C14008h(EnumC39333f activeColor, boolean z4, EnumC39333f enumC39333f) {
        AbstractC22676k.m65750j(activeColor, "activeColor");
        this.activeColor = activeColor;
        this.isToday = z4;
        this.borderColor = enumC39333f;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC39333f getActiveColor() {
        return this.activeColor;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC39333f getBorderColor() {
        return this.borderColor;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsToday() {
        return this.isToday;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14008h)) {
            return false;
        }
        C14008h c14008h = (C14008h) other;
        return this.activeColor == c14008h.activeColor && this.isToday == c14008h.isToday && this.borderColor == c14008h.borderColor;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(this.activeColor.hashCode() * 31, 31, this.isToday);
        EnumC39333f enumC39333f = this.borderColor;
        return iM8289b + (enumC39333f == null ? 0 : enumC39333f.hashCode());
    }

    public String toString() {
        EnumC39333f enumC39333f = this.activeColor;
        boolean z4 = this.isToday;
        EnumC39333f enumC39333f2 = this.borderColor;
        StringBuilder sb4 = new StringBuilder("TickMarkState(activeColor=");
        sb4.append(enumC39333f);
        sb4.append(", isToday=");
        sb4.append(z4);
        sb4.append(", borderColor=");
        return AbstractC21702c.m61138i(sb4, enumC39333f2, ")");
    }

    public /* synthetic */ C14008h(EnumC39333f enumC39333f, boolean z4, EnumC39333f enumC39333f2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC39333f, (i13 & 2) != 0 ? false : z4, (i13 & 4) != 0 ? null : enumC39333f2);
    }
}
