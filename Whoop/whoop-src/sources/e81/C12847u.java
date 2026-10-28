package e81;

import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p077d0.InterfaceC11372l;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: e81.u */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u0017BU\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\b\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b\u001b\u0010\"R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010!\u001a\u0004\b#\u0010\"¨\u0006$"}, m65681d2 = {"Le81/u;", "", "", "unselectedSliceAlpha", "Ly3/f;", "hitTargetPadding", "", "isHapticFeedbackEnabled", "Ld0/l;", "pressAnimation", "dragAnimation", "releaseAnimation", "<init>", "(FFZLd0/l;Ld0/l;Ld0/l;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "F", "f", "()F", "b", "c", "Z", "g", "()Z", "d", "Ld0/l;", "()Ld0/l;", "e", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C12847u {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h */
    private static final C12847u f44054h = new C12847u(0.0f, 0.0f, false, null, null, null, 63, null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float unselectedSliceAlpha;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float hitTargetPadding;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isHapticFeedbackEnabled;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC11372l pressAnimation;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC11372l dragAnimation;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC11372l releaseAnimation;

    /* JADX INFO: renamed from: e81.u$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Le81/u$a;", "", "<init>", "()V", "Le81/u;", "Default", "Le81/u;", "a", "()Le81/u;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C12847u m36083a() {
            return C12847u.f44054h;
        }

        private Companion() {
        }
    }

    public /* synthetic */ C12847u(float f13, float f14, boolean z4, InterfaceC11372l interfaceC11372l, InterfaceC11372l interfaceC11372l2, InterfaceC11372l interfaceC11372l3, DefaultConstructorMarker defaultConstructorMarker) {
        this(f13, f14, z4, interfaceC11372l, interfaceC11372l2, interfaceC11372l3);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC11372l getDragAnimation() {
        return this.dragAnimation;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getHitTargetPadding() {
        return this.hitTargetPadding;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC11372l getPressAnimation() {
        return this.pressAnimation;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC11372l getReleaseAnimation() {
        return this.releaseAnimation;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C12847u)) {
            return false;
        }
        C12847u c12847u = (C12847u) other;
        return Float.compare(this.unselectedSliceAlpha, c12847u.unselectedSliceAlpha) == 0 && C39174f.m124782b(this.hitTargetPadding, c12847u.hitTargetPadding) && this.isHapticFeedbackEnabled == c12847u.isHapticFeedbackEnabled && AbstractC22676k.m65745e(this.pressAnimation, c12847u.pressAnimation) && AbstractC22676k.m65745e(this.dragAnimation, c12847u.dragAnimation) && AbstractC22676k.m65745e(this.releaseAnimation, c12847u.releaseAnimation);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getUnselectedSliceAlpha() {
        return this.unselectedSliceAlpha;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsHapticFeedbackEnabled() {
        return this.isHapticFeedbackEnabled;
    }

    public int hashCode() {
        return this.releaseAnimation.hashCode() + ((this.dragAnimation.hashCode() + ((this.pressAnimation.hashCode() + AbstractC2875y.m8289b(AbstractC11266d.m30447a(this.hitTargetPadding, Float.hashCode(this.unselectedSliceAlpha) * 31, 31), 31, this.isHapticFeedbackEnabled)) * 31)) * 31);
    }

    public String toString() {
        return "PieChartDialSelectionConfig(unselectedSliceAlpha=" + this.unselectedSliceAlpha + ", hitTargetPadding=" + C39174f.m124783c(this.hitTargetPadding) + ", isHapticFeedbackEnabled=" + this.isHapticFeedbackEnabled + ", pressAnimation=" + this.pressAnimation + ", dragAnimation=" + this.dragAnimation + ", releaseAnimation=" + this.releaseAnimation + ")";
    }

    private C12847u(float f13, float f14, boolean z4, InterfaceC11372l pressAnimation, InterfaceC11372l dragAnimation, InterfaceC11372l releaseAnimation) {
        AbstractC22676k.m65750j(pressAnimation, "pressAnimation");
        AbstractC22676k.m65750j(dragAnimation, "dragAnimation");
        AbstractC22676k.m65750j(releaseAnimation, "releaseAnimation");
        this.unselectedSliceAlpha = f13;
        this.hitTargetPadding = f14;
        this.isHapticFeedbackEnabled = z4;
        this.pressAnimation = pressAnimation;
        this.dragAnimation = dragAnimation;
        this.releaseAnimation = releaseAnimation;
    }

    public C12847u(float f13, float f14, boolean z4, InterfaceC11372l interfaceC11372l, InterfaceC11372l interfaceC11372l2, InterfaceC11372l interfaceC11372l3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0.3f : f13, (i13 & 2) != 0 ? 12 : f14, (i13 & 4) != 0 ? true : z4, (i13 & 8) != 0 ? AbstractC12848v.m36085b(0.32f, 0.62f) : interfaceC11372l, (i13 & 16) != 0 ? AbstractC12848v.m36085b(0.2f, 0.82f) : interfaceC11372l2, (i13 & 32) != 0 ? AbstractC12848v.m36085b(0.32f, 1.0f) : interfaceC11372l3, null);
    }
}
