package c21;

import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p745y81.InterfaceC39332e;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: c21.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\u0017\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lc21/e;", "Lm91/u;", "", "icon", "", "title", "trendIcon", "Ly81/e;", "iconColor", "iconBackgroundColor", "<init>", "(ILjava/lang/String;ILy81/e;Ly81/e;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "e", "c", "f", "d", "Ly81/e;", "()Ly81/e;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3892e implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int icon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int trendIcon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC39332e iconColor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC39332e iconBackgroundColor;

    public C3892e(int i13, String title, int i14, InterfaceC39332e iconColor, InterfaceC39332e iconBackgroundColor) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(iconColor, "iconColor");
        AbstractC22676k.m65750j(iconBackgroundColor, "iconBackgroundColor");
        this.icon = i13;
        this.title = title;
        this.trendIcon = i14;
        this.iconColor = iconColor;
        this.iconBackgroundColor = iconBackgroundColor;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC39332e getIconBackgroundColor() {
        return this.iconBackgroundColor;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC39332e getIconColor() {
        return this.iconColor;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3892e)) {
            return false;
        }
        C3892e c3892e = (C3892e) other;
        return this.icon == c3892e.icon && AbstractC22676k.m65745e(this.title, c3892e.title) && this.trendIcon == c3892e.trendIcon && AbstractC22676k.m65745e(this.iconColor, c3892e.iconColor) && AbstractC22676k.m65745e(this.iconBackgroundColor, c3892e.iconBackgroundColor);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getTrendIcon() {
        return this.trendIcon;
    }

    public int hashCode() {
        return this.iconBackgroundColor.hashCode() + AbstractC33745d.m106648g(this.iconColor, AbstractC11266d.m30448b(this.trendIcon, AbstractC11266d.m30450d(Integer.hashCode(this.icon) * 31, 31, this.title), 31), 31);
    }

    public String toString() {
        int i13 = this.icon;
        String str = this.title;
        int i14 = this.trendIcon;
        InterfaceC39332e interfaceC39332e = this.iconColor;
        InterfaceC39332e interfaceC39332e2 = this.iconBackgroundColor;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "HealthMonitorMetricViewState(icon=", ", title=", str, ", trendIcon=");
        sbM53373n.append(i14);
        sbM53373n.append(", iconColor=");
        sbM53373n.append(interfaceC39332e);
        sbM53373n.append(", iconBackgroundColor=");
        sbM53373n.append(interfaceC39332e2);
        sbM53373n.append(")");
        return sbM53373n.toString();
    }
}
