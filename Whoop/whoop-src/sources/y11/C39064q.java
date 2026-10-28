package y11;

import jh3.AbstractC21702c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: y11.q */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Ly11/q;", "Lm91/u;", "", "label", "Ly81/f;", "labelColor", "Ly11/r;", "impactBarViewState", "<init>", "(Ljava/lang/String;Ly81/f;Ly11/r;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ly81/f;", "c", "()Ly81/f;", "Ly11/r;", "()Ly11/r;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C39064q implements InterfaceC25312u {

    /* JADX INFO: renamed from: d */
    public static final int f168096d = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String label;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC39333f labelColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C39065r impactBarViewState;

    public C39064q(String label, EnumC39333f labelColor, C39065r c39065r) {
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(labelColor, "labelColor");
        this.label = label;
        this.labelColor = labelColor;
        this.impactBarViewState = c39065r;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C39065r getImpactBarViewState() {
        return this.impactBarViewState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC39333f getLabelColor() {
        return this.labelColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C39064q)) {
            return false;
        }
        C39064q c39064q = (C39064q) other;
        return AbstractC22676k.m65745e(this.label, c39064q.label) && this.labelColor == c39064q.labelColor && AbstractC22676k.m65745e(this.impactBarViewState, c39064q.impactBarViewState);
    }

    public int hashCode() {
        int iM61132c = AbstractC21702c.m61132c(this.labelColor, this.label.hashCode() * 31, 31);
        C39065r c39065r = this.impactBarViewState;
        return iM61132c + (c39065r == null ? 0 : c39065r.hashCode());
    }

    public String toString() {
        return "HorizontalImpactBarLabeledViewState(label=" + this.label + ", labelColor=" + this.labelColor + ", impactBarViewState=" + this.impactBarViewState + ")";
    }

    public /* synthetic */ C39064q(String str, EnumC39333f enumC39333f, C39065r c39065r, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? EnumC39333f.BRAND_WHITE : enumC39333f, c39065r);
    }
}
