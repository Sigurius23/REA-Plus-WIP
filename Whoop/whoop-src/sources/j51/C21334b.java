package j51;

import gz0.EnumC16313m0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.C33169c0;

/* JADX INFO: renamed from: j51.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Lj51/b;", "", "Lgz0/m0;", "icon", "Lsz0/c0;", "primaryText", "secondaryText", "<init>", "(Lgz0/m0;Lsz0/c0;Lsz0/c0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgz0/m0;", "()Lgz0/m0;", "b", "Lsz0/c0;", "()Lsz0/c0;", "c", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21334b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C33169c0 primaryText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C33169c0 secondaryText;

    public C21334b(EnumC16313m0 enumC16313m0, C33169c0 primaryText, C33169c0 secondaryText) {
        AbstractC22676k.m65750j(primaryText, "primaryText");
        AbstractC22676k.m65750j(secondaryText, "secondaryText");
        this.icon = enumC16313m0;
        this.primaryText = primaryText;
        this.secondaryText = secondaryText;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C33169c0 getPrimaryText() {
        return this.primaryText;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C33169c0 getSecondaryText() {
        return this.secondaryText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21334b)) {
            return false;
        }
        C21334b c21334b = (C21334b) other;
        return this.icon == c21334b.icon && AbstractC22676k.m65745e(this.primaryText, c21334b.primaryText) && AbstractC22676k.m65745e(this.secondaryText, c21334b.secondaryText);
    }

    public int hashCode() {
        EnumC16313m0 enumC16313m0 = this.icon;
        return this.secondaryText.hashCode() + ((this.primaryText.hashCode() + ((enumC16313m0 == null ? 0 : enumC16313m0.hashCode()) * 31)) * 31);
    }

    public String toString() {
        return "ChallengeProgressGaugeFooterViewState(icon=" + this.icon + ", primaryText=" + this.primaryText + ", secondaryText=" + this.secondaryText + ")";
    }
}
