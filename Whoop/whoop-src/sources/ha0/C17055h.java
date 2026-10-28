package ha0;

import com.whoop.addactivity.network.model.ScoreType;
import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: ha0.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0019\u0010\u001eR\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u0016\u0010\u000fR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006\""}, m65681d2 = {"Lha0/h;", "", "", "internalName", "displayName", "iconUrl", "", "deleted", "category", "Lcom/whoop/addactivity/network/model/ScoreType;", "scoreType", "hasGps", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/whoop/addactivity/network/model/ScoreType;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "c", "e", "d", "Z", "()Z", "Lcom/whoop/addactivity/network/model/ScoreType;", "g", "()Lcom/whoop/addactivity/network/model/ScoreType;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17055h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String internalName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String displayName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String iconUrl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean deleted;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String category;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final ScoreType scoreType;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean hasGps;

    public C17055h(String internalName, String displayName, String iconUrl, boolean z4, String category, ScoreType scoreType, boolean z13) {
        AbstractC22676k.m65750j(internalName, "internalName");
        AbstractC22676k.m65750j(displayName, "displayName");
        AbstractC22676k.m65750j(iconUrl, "iconUrl");
        AbstractC22676k.m65750j(category, "category");
        AbstractC22676k.m65750j(scoreType, "scoreType");
        this.internalName = internalName;
        this.displayName = displayName;
        this.iconUrl = iconUrl;
        this.deleted = z4;
        this.category = category;
        this.scoreType = scoreType;
        this.hasGps = z13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getDeleted() {
        return this.deleted;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getHasGps() {
        return this.hasGps;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17055h)) {
            return false;
        }
        C17055h c17055h = (C17055h) other;
        return AbstractC22676k.m65745e(this.internalName, c17055h.internalName) && AbstractC22676k.m65745e(this.displayName, c17055h.displayName) && AbstractC22676k.m65745e(this.iconUrl, c17055h.iconUrl) && this.deleted == c17055h.deleted && AbstractC22676k.m65745e(this.category, c17055h.category) && this.scoreType == c17055h.scoreType && this.hasGps == c17055h.hasGps;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getInternalName() {
        return this.internalName;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final ScoreType getScoreType() {
        return this.scoreType;
    }

    public int hashCode() {
        return Boolean.hashCode(this.hasGps) + ((this.scoreType.hashCode() + AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.internalName.hashCode() * 31, 31, this.displayName), 31, this.iconUrl), 31, this.deleted), 31, this.category)) * 31);
    }

    public String toString() {
        String str = this.internalName;
        String str2 = this.displayName;
        String str3 = this.iconUrl;
        boolean z4 = this.deleted;
        String str4 = this.category;
        ScoreType scoreType = this.scoreType;
        boolean z13 = this.hasGps;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("RecentActivityDto(internalName=", str, ", displayName=", str2, ", iconUrl=");
        AbstractC38963t7.m124390t(sbM32001t, str3, ", deleted=", z4, ", category=");
        sbM32001t.append(str4);
        sbM32001t.append(", scoreType=");
        sbM32001t.append(scoreType);
        sbM32001t.append(", hasGps=");
        return AbstractC18489d0.m53372m(sbM32001t, z13, ")");
    }
}
