package xq2;

import i91.AbstractC18247a;
import p026b2.InterfaceC2302h;
import p291l0.InterfaceC22973k1;
import p490t0.C33252i;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: xq2.g */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0017\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b\u001d\u0010#¨\u0006$"}, m65681d2 = {"Lxq2/g;", "", "Lt0/i;", "cornerShape", "Lb2/h;", "barAlignment", "textAlignment", "Ll0/k1;", "textPadding", "Li91/a;", "gradientBackground", "<init>", "(Lt0/i;Lb2/h;Lb2/h;Ll0/k1;Li91/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lt0/i;", "b", "()Lt0/i;", "Lb2/h;", "()Lb2/h;", "c", "d", "Ll0/k1;", "e", "()Ll0/k1;", "Li91/a;", "()Li91/a;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C38564g {

    /* JADX INFO: renamed from: f */
    public static final int f165981f = AbstractC18247a.f71043a;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C33252i cornerShape;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC2302h barAlignment;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC2302h textAlignment;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC22973k1 textPadding;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AbstractC18247a gradientBackground;

    public C38564g(C33252i cornerShape, InterfaceC2302h barAlignment, InterfaceC2302h textAlignment, InterfaceC22973k1 textPadding, AbstractC18247a gradientBackground) {
        AbstractC22676k.m65750j(cornerShape, "cornerShape");
        AbstractC22676k.m65750j(barAlignment, "barAlignment");
        AbstractC22676k.m65750j(textAlignment, "textAlignment");
        AbstractC22676k.m65750j(textPadding, "textPadding");
        AbstractC22676k.m65750j(gradientBackground, "gradientBackground");
        this.cornerShape = cornerShape;
        this.barAlignment = barAlignment;
        this.textAlignment = textAlignment;
        this.textPadding = textPadding;
        this.gradientBackground = gradientBackground;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC2302h getBarAlignment() {
        return this.barAlignment;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C33252i getCornerShape() {
        return this.cornerShape;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AbstractC18247a getGradientBackground() {
        return this.gradientBackground;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC2302h getTextAlignment() {
        return this.textAlignment;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC22973k1 getTextPadding() {
        return this.textPadding;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C38564g)) {
            return false;
        }
        C38564g c38564g = (C38564g) other;
        return AbstractC22676k.m65745e(this.cornerShape, c38564g.cornerShape) && AbstractC22676k.m65745e(this.barAlignment, c38564g.barAlignment) && AbstractC22676k.m65745e(this.textAlignment, c38564g.textAlignment) && AbstractC22676k.m65745e(this.textPadding, c38564g.textPadding) && AbstractC22676k.m65745e(this.gradientBackground, c38564g.gradientBackground);
    }

    public int hashCode() {
        return this.gradientBackground.hashCode() + ((this.textPadding.hashCode() + ((this.textAlignment.hashCode() + ((this.barAlignment.hashCode() + (this.cornerShape.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "BarLayoutState(cornerShape=" + this.cornerShape + ", barAlignment=" + this.barAlignment + ", textAlignment=" + this.textAlignment + ", textPadding=" + this.textPadding + ", gradientBackground=" + this.gradientBackground + ")";
    }
}
