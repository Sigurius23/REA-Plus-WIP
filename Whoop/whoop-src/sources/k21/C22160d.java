package k21;

import kd1.AbstractC22403o;
import ny0.C27256h;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: k21.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u000fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b#\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001f\u0010$\u001a\u0004\b\u0018\u0010%¨\u0006&"}, m65681d2 = {"Lk21/d;", "Lm91/u;", "Lkd1/o;", "image", "", "title", "subtitle", "Lk21/a;", "primaryButtonState", "secondaryButtonState", "Lny0/h;", "cardButtonState", "<init>", "(Lkd1/o;Ljava/lang/String;Ljava/lang/String;Lk21/a;Lk21/a;Lny0/h;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkd1/o;", "b", "()Lkd1/o;", "Ljava/lang/String;", "g", "c", "f", "d", "Lk21/a;", "()Lk21/a;", "e", "Lny0/h;", "()Lny0/h;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22160d implements InterfaceC25312u {

    /* JADX INFO: renamed from: g */
    public static final int f85916g = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC22403o image;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String subtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C22157a primaryButtonState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C22157a secondaryButtonState;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C27256h cardButtonState;

    public C22160d(AbstractC22403o image, String title, String subtitle, C22157a c22157a, C22157a c22157a2, C27256h c27256h) {
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        this.image = image;
        this.title = title;
        this.subtitle = subtitle;
        this.primaryButtonState = c22157a;
        this.secondaryButtonState = c22157a2;
        this.cardButtonState = c27256h;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C27256h getCardButtonState() {
        return this.cardButtonState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC22403o getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C22157a getPrimaryButtonState() {
        return this.primaryButtonState;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C22157a getSecondaryButtonState() {
        return this.secondaryButtonState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22160d)) {
            return false;
        }
        C22160d c22160d = (C22160d) other;
        return AbstractC22676k.m65745e(this.image, c22160d.image) && AbstractC22676k.m65745e(this.title, c22160d.title) && AbstractC22676k.m65745e(this.subtitle, c22160d.subtitle) && AbstractC22676k.m65745e(this.primaryButtonState, c22160d.primaryButtonState) && AbstractC22676k.m65745e(this.secondaryButtonState, c22160d.secondaryButtonState) && AbstractC22676k.m65745e(this.cardButtonState, c22160d.cardButtonState);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.image.hashCode() * 31, 31, this.title), 31, this.subtitle);
        C22157a c22157a = this.primaryButtonState;
        int iHashCode = (iM30450d + (c22157a == null ? 0 : c22157a.hashCode())) * 31;
        C22157a c22157a2 = this.secondaryButtonState;
        int iHashCode2 = (iHashCode + (c22157a2 == null ? 0 : c22157a2.hashCode())) * 31;
        C27256h c27256h = this.cardButtonState;
        return iHashCode2 + (c27256h != null ? c27256h.hashCode() : 0);
    }

    public String toString() {
        return "IntegrationsUpsellViewState(image=" + this.image + ", title=" + this.title + ", subtitle=" + this.subtitle + ", primaryButtonState=" + this.primaryButtonState + ", secondaryButtonState=" + this.secondaryButtonState + ", cardButtonState=" + this.cardButtonState + ")";
    }

    public /* synthetic */ C22160d(AbstractC22403o abstractC22403o, String str, String str2, C22157a c22157a, C22157a c22157a2, C27256h c27256h, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC22403o, str, str2, (i13 & 8) != 0 ? null : c22157a, (i13 & 16) != 0 ? null : c22157a2, (i13 & 32) != 0 ? null : c27256h);
    }
}
