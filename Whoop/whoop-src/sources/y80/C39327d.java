package y80;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import kd1.AbstractC22403o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import v41.InterfaceC35689r0;

/* JADX INFO: renamed from: y80.d */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b\u0019\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b$\u0010&\u001a\u0004\b%\u0010'¨\u0006("}, m65681d2 = {"Ly80/d;", "Lm91/u;", "Lkd1/o;", "image", "Lv41/r0;", "lottie", "Lcom/whoop/design/util/TextResource;", "title", "subTitle", "ctaText", "Lcom/whoop/navigation/e;", "navigationAction", "<init>", "(Lkd1/o;Lv41/r0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkd1/o;", "b", "()Lkd1/o;", "Lv41/r0;", "c", "()Lv41/r0;", "Lcom/whoop/design/util/TextResource;", "g", "()Lcom/whoop/design/util/TextResource;", "d", "f", "e", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C39327d implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC22403o image;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC35689r0 lottie;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource subTitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource ctaText;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C9598e navigationAction;

    public C39327d(AbstractC22403o abstractC22403o, InterfaceC35689r0 interfaceC35689r0, TextResource title, TextResource subTitle, TextResource textResource, C9598e c9598e) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subTitle, "subTitle");
        this.image = abstractC22403o;
        this.lottie = interfaceC35689r0;
        this.title = title;
        this.subTitle = subTitle;
        this.ctaText = textResource;
        this.navigationAction = c9598e;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getCtaText() {
        return this.ctaText;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC22403o getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC35689r0 getLottie() {
        return this.lottie;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C9598e getNavigationAction() {
        return this.navigationAction;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C39327d)) {
            return false;
        }
        C39327d c39327d = (C39327d) other;
        return AbstractC22676k.m65745e(this.image, c39327d.image) && AbstractC22676k.m65745e(this.lottie, c39327d.lottie) && AbstractC22676k.m65745e(this.title, c39327d.title) && AbstractC22676k.m65745e(this.subTitle, c39327d.subTitle) && AbstractC22676k.m65745e(this.ctaText, c39327d.ctaText) && AbstractC22676k.m65745e(this.navigationAction, c39327d.navigationAction);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getSubTitle() {
        return this.subTitle;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        AbstractC22403o abstractC22403o = this.image;
        int iHashCode = (abstractC22403o == null ? 0 : abstractC22403o.hashCode()) * 31;
        InterfaceC35689r0 interfaceC35689r0 = this.lottie;
        int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a((iHashCode + (interfaceC35689r0 == null ? 0 : interfaceC35689r0.hashCode())) * 31, this.title, 31), this.subTitle, 31);
        TextResource textResource = this.ctaText;
        int iHashCode2 = (iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31;
        C9598e c9598e = this.navigationAction;
        return iHashCode2 + (c9598e != null ? c9598e.hashCode() : 0);
    }

    public String toString() {
        AbstractC22403o abstractC22403o = this.image;
        InterfaceC35689r0 interfaceC35689r0 = this.lottie;
        TextResource textResource = this.title;
        TextResource textResource2 = this.subTitle;
        TextResource textResource3 = this.ctaText;
        C9598e c9598e = this.navigationAction;
        StringBuilder sb4 = new StringBuilder("DeviceEducationState(image=");
        sb4.append(abstractC22403o);
        sb4.append(", lottie=");
        sb4.append(interfaceC35689r0);
        sb4.append(", title=");
        AbstractC30007c.m91855y(sb4, textResource, ", subTitle=", textResource2, ", ctaText=");
        sb4.append(textResource3);
        sb4.append(", navigationAction=");
        sb4.append(c9598e);
        sb4.append(")");
        return sb4.toString();
    }
}
