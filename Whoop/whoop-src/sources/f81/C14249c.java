package f81;

import androidx.core.app.NotificationCompat;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: f81.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0018\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0015\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lf81/c;", "Lm91/u;", "", "title", "subtitle", "", NotificationCompat.CATEGORY_PROGRESS, "Ly81/f;", "barColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;FLy81/f;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "c", "F", "()F", "d", "Ly81/f;", "()Ly81/f;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C14249c implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float progress;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC39333f barColor;

    public C14249c(String str, String str2, float f13, EnumC39333f barColor) {
        AbstractC22676k.m65750j(barColor, "barColor");
        this.title = str;
        this.subtitle = str2;
        this.progress = f13;
        this.barColor = barColor;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC39333f getBarColor() {
        return this.barColor;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getProgress() {
        return this.progress;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14249c)) {
            return false;
        }
        C14249c c14249c = (C14249c) other;
        return AbstractC22676k.m65745e(this.title, c14249c.title) && AbstractC22676k.m65745e(this.subtitle, c14249c.subtitle) && Float.compare(this.progress, c14249c.progress) == 0 && this.barColor == c14249c.barColor;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        return this.barColor.hashCode() + AbstractC11266d.m30447a(this.progress, (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        float f13 = this.progress;
        EnumC39333f enumC39333f = this.barColor;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ProgressMeterViewState(title=", str, ", subtitle=", str2, ", progress=");
        sbM32001t.append(f13);
        sbM32001t.append(", barColor=");
        sbM32001t.append(enumC39333f);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
