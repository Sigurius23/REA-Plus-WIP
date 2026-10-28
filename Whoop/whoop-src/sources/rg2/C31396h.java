package rg2;

import jh3.AbstractC21702c;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: rg2.h */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\rR\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u0019¨\u0006 "}, m65681d2 = {"Lrg2/h;", "", "", "internalName", "iconUrl", "", "isSelected", "displayName", "scoreType", "hasGps", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Z", "()Z", "d", "getDisplayName", "e", "getScoreType", "f", "getHasGps", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C31396h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String internalName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String iconUrl;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isSelected;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String displayName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String scoreType;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean hasGps;

    public C31396h(String internalName, String iconUrl, boolean z4, String displayName, String scoreType, boolean z13) {
        AbstractC22676k.m65750j(internalName, "internalName");
        AbstractC22676k.m65750j(iconUrl, "iconUrl");
        AbstractC22676k.m65750j(displayName, "displayName");
        AbstractC22676k.m65750j(scoreType, "scoreType");
        this.internalName = internalName;
        this.iconUrl = iconUrl;
        this.isSelected = z4;
        this.displayName = displayName;
        this.scoreType = scoreType;
        this.hasGps = z13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getInternalName() {
        return this.internalName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C31396h)) {
            return false;
        }
        C31396h c31396h = (C31396h) other;
        return AbstractC22676k.m65745e(this.internalName, c31396h.internalName) && AbstractC22676k.m65745e(this.iconUrl, c31396h.iconUrl) && this.isSelected == c31396h.isSelected && AbstractC22676k.m65745e(this.displayName, c31396h.displayName) && AbstractC22676k.m65745e(this.scoreType, c31396h.scoreType) && this.hasGps == c31396h.hasGps;
    }

    public int hashCode() {
        return Boolean.hashCode(this.hasGps) + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC11266d.m30450d(this.internalName.hashCode() * 31, 31, this.iconUrl), 31, this.isSelected), 31, this.displayName), 31, this.scoreType);
    }

    public String toString() {
        String str = this.internalName;
        String str2 = this.iconUrl;
        boolean z4 = this.isSelected;
        String str3 = this.displayName;
        String str4 = this.scoreType;
        boolean z13 = this.hasGps;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("PreSessionRecentActivityIconState(internalName=", str, ", iconUrl=", str2, ", isSelected=");
        AbstractC38963t7.m124391u(sbM32001t, z4, ", displayName=", str3, ", scoreType=");
        return AbstractC21702c.m61137h(sbM32001t, str4, ", hasGps=", z13, ")");
    }
}
