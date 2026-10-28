package rg2;

import com.whoop.addactivity.network.model.ScoreType;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: rg2.j */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0017\u0010\u001aR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lrg2/j;", "", "", "internalName", "displayName", "iconUrl", "", "hasGps", "Lcom/whoop/addactivity/network/model/ScoreType;", "scoreType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/addactivity/network/model/ScoreType;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "c", "Z", "()Z", "e", "Lcom/whoop/addactivity/network/model/ScoreType;", "()Lcom/whoop/addactivity/network/model/ScoreType;", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C31398j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String internalName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String displayName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String iconUrl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean hasGps;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final ScoreType scoreType;

    public C31398j(String internalName, String displayName, String iconUrl, boolean z4, ScoreType scoreType) {
        AbstractC22676k.m65750j(internalName, "internalName");
        AbstractC22676k.m65750j(displayName, "displayName");
        AbstractC22676k.m65750j(iconUrl, "iconUrl");
        AbstractC22676k.m65750j(scoreType, "scoreType");
        this.internalName = internalName;
        this.displayName = displayName;
        this.iconUrl = iconUrl;
        this.hasGps = z4;
        this.scoreType = scoreType;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getHasGps() {
        return this.hasGps;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getInternalName() {
        return this.internalName;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final ScoreType getScoreType() {
        return this.scoreType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C31398j)) {
            return false;
        }
        C31398j c31398j = (C31398j) other;
        return AbstractC22676k.m65745e(this.internalName, c31398j.internalName) && AbstractC22676k.m65745e(this.displayName, c31398j.displayName) && AbstractC22676k.m65745e(this.iconUrl, c31398j.iconUrl) && this.hasGps == c31398j.hasGps && this.scoreType == c31398j.scoreType;
    }

    public int hashCode() {
        return this.scoreType.hashCode() + AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.internalName.hashCode() * 31, 31, this.displayName), 31, this.iconUrl), 31, this.hasGps);
    }

    public String toString() {
        String str = this.internalName;
        String str2 = this.displayName;
        String str3 = this.iconUrl;
        boolean z4 = this.hasGps;
        ScoreType scoreType = this.scoreType;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("PreSessionRecentActivityItem(internalName=", str, ", displayName=", str2, ", iconUrl=");
        AbstractC38963t7.m124390t(sbM32001t, str3, ", hasGps=", z4, ", scoreType=");
        sbM32001t.append(scoreType);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
