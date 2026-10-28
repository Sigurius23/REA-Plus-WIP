package w90;

import c31.C3927k;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22403o;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: w90.c */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJF\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, m65681d2 = {"Lw90/c;", "Lm91/u;", "", "title", "subtitle", "Lkd1/o;", "backgroundImage", "logoImage", "Lc31/k;", "progressButtonState", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkd1/o;Lkd1/o;Lc31/k;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Lkd1/o;Lkd1/o;Lc31/k;)Lw90/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "b", "g", "c", "Lkd1/o;", "()Lkd1/o;", "d", "e", "Lc31/k;", "f", "()Lc31/k;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C36953c implements InterfaceC25312u {

    /* JADX INFO: renamed from: f */
    public static final int f158116f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC22403o backgroundImage;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC22403o logoImage;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C3927k progressButtonState;

    static {
        int i13 = C3927k.f16020r;
        int i14 = AbstractC22403o.f87638a;
        f158116f = i13 | i14 | i14;
    }

    public C36953c(String title, String str, AbstractC22403o backgroundImage, AbstractC22403o logoImage, C3927k c3927k) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(backgroundImage, "backgroundImage");
        AbstractC22676k.m65750j(logoImage, "logoImage");
        this.title = title;
        this.subtitle = str;
        this.backgroundImage = backgroundImage;
        this.logoImage = logoImage;
        this.progressButtonState = c3927k;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C36953c m118670b(C36953c c36953c, String str, String str2, AbstractC22403o abstractC22403o, AbstractC22403o abstractC22403o2, C3927k c3927k, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c36953c.title;
        }
        if ((i13 & 2) != 0) {
            str2 = c36953c.subtitle;
        }
        if ((i13 & 4) != 0) {
            abstractC22403o = c36953c.backgroundImage;
        }
        if ((i13 & 8) != 0) {
            abstractC22403o2 = c36953c.logoImage;
        }
        if ((i13 & 16) != 0) {
            c3927k = c36953c.progressButtonState;
        }
        C3927k c3927k2 = c3927k;
        AbstractC22403o abstractC22403o3 = abstractC22403o;
        return c36953c.m118671a(str, str2, abstractC22403o3, abstractC22403o2, c3927k2);
    }

    /* JADX INFO: renamed from: a */
    public final C36953c m118671a(String title, String subtitle, AbstractC22403o backgroundImage, AbstractC22403o logoImage, C3927k progressButtonState) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(backgroundImage, "backgroundImage");
        AbstractC22676k.m65750j(logoImage, "logoImage");
        return new C36953c(title, subtitle, backgroundImage, logoImage, progressButtonState);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AbstractC22403o getBackgroundImage() {
        return this.backgroundImage;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final AbstractC22403o getLogoImage() {
        return this.logoImage;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C36953c)) {
            return false;
        }
        C36953c c36953c = (C36953c) other;
        return AbstractC22676k.m65745e(this.title, c36953c.title) && AbstractC22676k.m65745e(this.subtitle, c36953c.subtitle) && AbstractC22676k.m65745e(this.backgroundImage, c36953c.backgroundImage) && AbstractC22676k.m65745e(this.logoImage, c36953c.logoImage) && AbstractC22676k.m65745e(this.progressButtonState, c36953c.progressButtonState);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C3927k getProgressButtonState() {
        return this.progressButtonState;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int iM91833c = AbstractC30007c.m91833c(this.logoImage, AbstractC30007c.m91833c(this.backgroundImage, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        C3927k c3927k = this.progressButtonState;
        return iM91833c + (c3927k != null ? c3927k.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        AbstractC22403o abstractC22403o = this.backgroundImage;
        AbstractC22403o abstractC22403o2 = this.logoImage;
        C3927k c3927k = this.progressButtonState;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("WelcomeTransitionViewState(title=", str, ", subtitle=", str2, ", backgroundImage=");
        sbM32001t.append(abstractC22403o);
        sbM32001t.append(", logoImage=");
        sbM32001t.append(abstractC22403o2);
        sbM32001t.append(", progressButtonState=");
        sbM32001t.append(c3927k);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ C36953c(String str, String str2, AbstractC22403o abstractC22403o, AbstractC22403o abstractC22403o2, C3927k c3927k, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : str2, abstractC22403o, abstractC22403o2, (i13 & 16) != 0 ? null : c3927k);
    }
}
