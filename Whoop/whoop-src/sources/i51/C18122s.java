package i51;

import java.util.List;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import v41.InterfaceC35689r0;

/* JADX INFO: renamed from: i51.s */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u0019\u0010%R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\"R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(¨\u0006)"}, m65681d2 = {"Li51/s;", "Lm91/u;", "Lv41/r0;", "lottieSource", "", "overlayUrl", "", "Li51/v;", "slots", "Li51/a;", "animationMode", "highlightGradient", "", "showLoadingShimmer", "<init>", "(Lv41/r0;Ljava/lang/String;Ljava/util/List;Li51/a;Ljava/util/List;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lv41/r0;", "c", "()Lv41/r0;", "b", "Ljava/lang/String;", "e", "Ljava/util/List;", "g", "()Ljava/util/List;", "d", "Li51/a;", "()Li51/a;", "f", "Z", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C18122s implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC35689r0 lottieSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String overlayUrl;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<AbstractC18125v> slots;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC18104a animationMode;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<String> highlightGradient;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean showLoadingShimmer;

    /* JADX WARN: Multi-variable type inference failed */
    public C18122s(InterfaceC35689r0 lottieSource, String str, List<? extends AbstractC18125v> slots, EnumC18104a animationMode, List<String> list, boolean z4) {
        AbstractC22676k.m65750j(lottieSource, "lottieSource");
        AbstractC22676k.m65750j(slots, "slots");
        AbstractC22676k.m65750j(animationMode, "animationMode");
        this.lottieSource = lottieSource;
        this.overlayUrl = str;
        this.slots = slots;
        this.animationMode = animationMode;
        this.highlightGradient = list;
        this.showLoadingShimmer = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC18104a getAnimationMode() {
        return this.animationMode;
    }

    /* JADX INFO: renamed from: b */
    public final List<String> m52037b() {
        return this.highlightGradient;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC35689r0 getLottieSource() {
        return this.lottieSource;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getOverlayUrl() {
        return this.overlayUrl;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C18122s)) {
            return false;
        }
        C18122s c18122s = (C18122s) other;
        return AbstractC22676k.m65745e(this.lottieSource, c18122s.lottieSource) && AbstractC22676k.m65745e(this.overlayUrl, c18122s.overlayUrl) && AbstractC22676k.m65745e(this.slots, c18122s.slots) && this.animationMode == c18122s.animationMode && AbstractC22676k.m65745e(this.highlightGradient, c18122s.highlightGradient) && this.showLoadingShimmer == c18122s.showLoadingShimmer;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getShowLoadingShimmer() {
        return this.showLoadingShimmer;
    }

    /* JADX INFO: renamed from: g */
    public final List<AbstractC18125v> m52041g() {
        return this.slots;
    }

    public int hashCode() {
        int iHashCode = this.lottieSource.hashCode() * 31;
        String str = this.overlayUrl;
        int iHashCode2 = (this.animationMode.hashCode() + AbstractC11895b.m31983b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.slots)) * 31;
        List<String> list = this.highlightGradient;
        return Boolean.hashCode(this.showLoadingShimmer) + ((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "DynamicLottieViewState(lottieSource=" + this.lottieSource + ", overlayUrl=" + this.overlayUrl + ", slots=" + this.slots + ", animationMode=" + this.animationMode + ", highlightGradient=" + this.highlightGradient + ", showLoadingShimmer=" + this.showLoadingShimmer + ")";
    }

    public /* synthetic */ C18122s(InterfaceC35689r0 interfaceC35689r0, String str, List list, EnumC18104a enumC18104a, List list2, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC35689r0, (i13 & 2) != 0 ? null : str, list, (i13 & 8) != 0 ? EnumC18104a.LOOP : enumC18104a, (i13 & 16) != 0 ? null : list2, (i13 & 32) != 0 ? true : z4);
    }
}
