package is0;

import c93.InterfaceC4339a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: is0.j */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0081\b\u0018\u00002\u00020\u0001Bg\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0004\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%R\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00048\u0006¢\u0006\f\n\u0004\b*\u0010\u001f\u001a\u0004\b+\u0010!R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b$\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, m65681d2 = {"Lis0/j;", "", "", "isExpanded", "Lkotlin/Function0;", "", "chromeProgress", "chromeHeightPx", "Ly3/f;", "contentInsetHorizontal", "contentInsetBottom", "", "layoutHeightPx", "Lkotlin/Function1;", "Ll83/a0;", "onNaturalHeightChanged", "<init>", "(ZLc93/a;FFFLc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "m", "()Z", "b", "Lc93/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lc93/a;", "c", "F", "g", "()F", "d", "j", "e", "i", "f", "k", "Lkotlin/jvm/functions/Function1;", "l", "()Lkotlin/jvm/functions/Function1;", "community-reactions-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C20888j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isExpanded;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC4339a chromeProgress;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float chromeHeightPx;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float contentInsetHorizontal;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float contentInsetBottom;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC4339a layoutHeightPx;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Function1 onNaturalHeightChanged;

    public /* synthetic */ C20888j(boolean z4, InterfaceC4339a interfaceC4339a, float f13, float f14, float f15, InterfaceC4339a interfaceC4339a2, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(z4, interfaceC4339a, f13, f14, f15, interfaceC4339a2, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final float m57719d() {
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final Integer m57720e() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m57721f(int i13) {
        return C23454a0.f92919a;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C20888j)) {
            return false;
        }
        C20888j c20888j = (C20888j) other;
        return this.isExpanded == c20888j.isExpanded && AbstractC22676k.m65745e(this.chromeProgress, c20888j.chromeProgress) && Float.compare(this.chromeHeightPx, c20888j.chromeHeightPx) == 0 && C39174f.m124782b(this.contentInsetHorizontal, c20888j.contentInsetHorizontal) && C39174f.m124782b(this.contentInsetBottom, c20888j.contentInsetBottom) && AbstractC22676k.m65745e(this.layoutHeightPx, c20888j.layoutHeightPx) && AbstractC22676k.m65745e(this.onNaturalHeightChanged, c20888j.onNaturalHeightChanged);
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final float getChromeHeightPx() {
        return this.chromeHeightPx;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final InterfaceC4339a getChromeProgress() {
        return this.chromeProgress;
    }

    public int hashCode() {
        return this.onNaturalHeightChanged.hashCode() + AbstractC30802r.m94755d(AbstractC11266d.m30447a(this.contentInsetBottom, AbstractC11266d.m30447a(this.contentInsetHorizontal, AbstractC11266d.m30447a(this.chromeHeightPx, AbstractC30802r.m94755d(Boolean.hashCode(this.isExpanded) * 31, 31, this.chromeProgress), 31), 31), 31), 31, this.layoutHeightPx);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final float getContentInsetBottom() {
        return this.contentInsetBottom;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final float getContentInsetHorizontal() {
        return this.contentInsetHorizontal;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final InterfaceC4339a getLayoutHeightPx() {
        return this.layoutHeightPx;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final Function1 getOnNaturalHeightChanged() {
        return this.onNaturalHeightChanged;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    public String toString() {
        return "ReactionsBarExpansion(isExpanded=" + this.isExpanded + ", chromeProgress=" + this.chromeProgress + ", chromeHeightPx=" + this.chromeHeightPx + ", contentInsetHorizontal=" + C39174f.m124783c(this.contentInsetHorizontal) + ", contentInsetBottom=" + C39174f.m124783c(this.contentInsetBottom) + ", layoutHeightPx=" + this.layoutHeightPx + ", onNaturalHeightChanged=" + this.onNaturalHeightChanged + ")";
    }

    private C20888j(boolean z4, InterfaceC4339a chromeProgress, float f13, float f14, float f15, InterfaceC4339a layoutHeightPx, Function1 onNaturalHeightChanged) {
        AbstractC22676k.m65750j(chromeProgress, "chromeProgress");
        AbstractC22676k.m65750j(layoutHeightPx, "layoutHeightPx");
        AbstractC22676k.m65750j(onNaturalHeightChanged, "onNaturalHeightChanged");
        this.isExpanded = z4;
        this.chromeProgress = chromeProgress;
        this.chromeHeightPx = f13;
        this.contentInsetHorizontal = f14;
        this.contentInsetBottom = f15;
        this.layoutHeightPx = layoutHeightPx;
        this.onNaturalHeightChanged = onNaturalHeightChanged;
    }

    public C20888j(boolean z4, InterfaceC4339a interfaceC4339a, float f13, float f14, float f15, InterfaceC4339a interfaceC4339a2, Function1 function1, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? new C20886i(0) : interfaceC4339a, (i13 & 4) != 0 ? 0.0f : f13, (i13 & 8) != 0 ? 0 : f14, (i13 & 16) != 0 ? 0 : f15, (i13 & 32) != 0 ? new C20886i(1) : interfaceC4339a2, (i13 & 64) != 0 ? new C20918y(2) : function1, null);
    }
}
