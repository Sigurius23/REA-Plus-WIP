package hz0;

import androidx.core.app.NotificationCompat;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: hz0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u000eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0019\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b\u001a\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, m65681d2 = {"Lhz0/c;", "Lm91/u;", "", "leftLabel", "leftSublabel", "rightLabel", "rightSublabel", "", NotificationCompat.CATEGORY_PROGRESS, "Ly81/f;", "style", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLy81/f;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "e", "d", "f", "F", "()F", "Ly81/f;", "g", "()Ly81/f;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17814c implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String leftLabel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String leftSublabel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String rightLabel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String rightSublabel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float progress;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final EnumC39333f style;

    public C17814c(String str, String str2, String str3, String str4, float f13, EnumC39333f style) {
        AbstractC22676k.m65750j(style, "style");
        this.leftLabel = str;
        this.leftSublabel = str2;
        this.rightLabel = str3;
        this.rightSublabel = str4;
        this.progress = f13;
        this.style = style;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getLeftLabel() {
        return this.leftLabel;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getLeftSublabel() {
        return this.leftSublabel;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getProgress() {
        return this.progress;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getRightLabel() {
        return this.rightLabel;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17814c)) {
            return false;
        }
        C17814c c17814c = (C17814c) other;
        return AbstractC22676k.m65745e(this.leftLabel, c17814c.leftLabel) && AbstractC22676k.m65745e(this.leftSublabel, c17814c.leftSublabel) && AbstractC22676k.m65745e(this.rightLabel, c17814c.rightLabel) && AbstractC22676k.m65745e(this.rightSublabel, c17814c.rightSublabel) && Float.compare(this.progress, c17814c.progress) == 0 && this.style == c17814c.style;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getRightSublabel() {
        return this.rightSublabel;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final EnumC39333f getStyle() {
        return this.style;
    }

    public int hashCode() {
        String str = this.leftLabel;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.leftSublabel;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.rightLabel;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.rightSublabel;
        return this.style.hashCode() + AbstractC11266d.m30447a(this.progress, (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31, 31);
    }

    public String toString() {
        String str = this.leftLabel;
        String str2 = this.leftSublabel;
        String str3 = this.rightLabel;
        String str4 = this.rightSublabel;
        float f13 = this.progress;
        EnumC39333f enumC39333f = this.style;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("LabeledProgressBarState(leftLabel=", str, ", leftSublabel=", str2, ", rightLabel=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", rightSublabel=", str4, ", progress=");
        sbM32001t.append(f13);
        sbM32001t.append(", style=");
        sbM32001t.append(enumC39333f);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ C17814c(String str, String str2, String str3, String str4, float f13, EnumC39333f enumC39333f, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : str4, (i13 & 16) != 0 ? 0.0f : f13, (i13 & 32) != 0 ? EnumC39333f.ACCENT_POSITIVE_TREND : enumC39333f);
    }
}
