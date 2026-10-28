package c41;

import nh3.AbstractC26725a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: c41.v */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lc41/v;", "", "", "activityV2Id", "", "isSelected", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4131v {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String activityV2Id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isSelected;

    public C4131v(String activityV2Id, boolean z4) {
        AbstractC22676k.m65750j(activityV2Id, "activityV2Id");
        this.activityV2Id = activityV2Id;
        this.isSelected = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getActivityV2Id() {
        return this.activityV2Id;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4131v)) {
            return false;
        }
        C4131v c4131v = (C4131v) other;
        return AbstractC22676k.m65745e(this.activityV2Id, c4131v.activityV2Id) && this.isSelected == c4131v.isSelected;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isSelected) + (this.activityV2Id.hashCode() * 31);
    }

    public String toString() {
        return AbstractC26725a.m79503g("ActivityTileSelectionToggleEvent(activityV2Id=", this.activityV2Id, ", isSelected=", ")", this.isSelected);
    }
}
