package lo0;

import c31.C3927k;
import java.util.List;
import kd1.AbstractC22403o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: lo0.l */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\u0017\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010!\u001a\u0004\b\u001b\u0010\"¨\u0006#"}, m65681d2 = {"Llo0/l;", "", "", "Lm91/u;", "itemViewStates", "Lc31/k;", "progressButton", "Lkd1/o;", "backgroundImage", "Ly81/f;", "gradientColor", "<init>", "(Ljava/util/List;Lc31/k;Lkd1/o;Ly81/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Lc31/k;", "d", "()Lc31/k;", "Lkd1/o;", "()Lkd1/o;", "Ly81/f;", "()Ly81/f;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C24590l {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC25312u> itemViewStates;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C3927k progressButton;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC22403o backgroundImage;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC39333f gradientColor;

    /* JADX WARN: Multi-variable type inference failed */
    public C24590l(List<? extends InterfaceC25312u> itemViewStates, C3927k progressButton, AbstractC22403o backgroundImage, EnumC39333f enumC39333f) {
        AbstractC22676k.m65750j(itemViewStates, "itemViewStates");
        AbstractC22676k.m65750j(progressButton, "progressButton");
        AbstractC22676k.m65750j(backgroundImage, "backgroundImage");
        this.itemViewStates = itemViewStates;
        this.progressButton = progressButton;
        this.backgroundImage = backgroundImage;
        this.gradientColor = enumC39333f;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC22403o getBackgroundImage() {
        return this.backgroundImage;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC39333f getGradientColor() {
        return this.gradientColor;
    }

    /* JADX INFO: renamed from: c */
    public final List<InterfaceC25312u> m71809c() {
        return this.itemViewStates;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C3927k getProgressButton() {
        return this.progressButton;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24590l)) {
            return false;
        }
        C24590l c24590l = (C24590l) other;
        return AbstractC22676k.m65745e(this.itemViewStates, c24590l.itemViewStates) && AbstractC22676k.m65745e(this.progressButton, c24590l.progressButton) && AbstractC22676k.m65745e(this.backgroundImage, c24590l.backgroundImage) && this.gradientColor == c24590l.gradientColor;
    }

    public int hashCode() {
        int iM91833c = AbstractC30007c.m91833c(this.backgroundImage, (this.progressButton.hashCode() + (this.itemViewStates.hashCode() * 31)) * 31, 31);
        EnumC39333f enumC39333f = this.gradientColor;
        return iM91833c + (enumC39333f == null ? 0 : enumC39333f.hashCode());
    }

    public String toString() {
        return "ClinicianSchedulingConfirmationScreenState(itemViewStates=" + this.itemViewStates + ", progressButton=" + this.progressButton + ", backgroundImage=" + this.backgroundImage + ", gradientColor=" + this.gradientColor + ")";
    }
}
