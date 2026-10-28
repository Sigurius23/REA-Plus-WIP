package p12;

import i91.AbstractC18247a;
import kd1.AbstractC22403o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import v41.InterfaceC35689r0;

/* JADX INFO: renamed from: p12.f */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\"\u0010'\u001a\u0004\b\u0019\u0010(R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001b\u0010)\u001a\u0004\b\u001d\u0010*¨\u0006+"}, m65681d2 = {"Lp12/f;", "", "", "isImageBackground", "Lkd1/o;", "imageSource", "Lp12/a;", "mediaType", "Lv41/r0;", "lottieWrapper", "Li91/a;", "background", "Lp12/c;", "backgroundType", "<init>", "(ZLkd1/o;Lp12/a;Lv41/r0;Li91/a;Lp12/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "f", "()Z", "b", "Lkd1/o;", "c", "()Lkd1/o;", "Lp12/a;", "e", "()Lp12/a;", "d", "Lv41/r0;", "()Lv41/r0;", "Li91/a;", "()Li91/a;", "Lp12/c;", "()Lp12/c;", "onboarding-story_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C28716f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isImageBackground;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC22403o imageSource;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC28706a mediaType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC35689r0 lottieWrapper;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AbstractC18247a background;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final EnumC28710c backgroundType;

    public C28716f(boolean z4, AbstractC22403o imageSource, EnumC28706a mediaType, InterfaceC35689r0 interfaceC35689r0, AbstractC18247a abstractC18247a, EnumC28710c backgroundType) {
        AbstractC22676k.m65750j(imageSource, "imageSource");
        AbstractC22676k.m65750j(mediaType, "mediaType");
        AbstractC22676k.m65750j(backgroundType, "backgroundType");
        this.isImageBackground = z4;
        this.imageSource = imageSource;
        this.mediaType = mediaType;
        this.lottieWrapper = interfaceC35689r0;
        this.background = abstractC18247a;
        this.backgroundType = backgroundType;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC18247a getBackground() {
        return this.background;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC28710c getBackgroundType() {
        return this.backgroundType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AbstractC22403o getImageSource() {
        return this.imageSource;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC35689r0 getLottieWrapper() {
        return this.lottieWrapper;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC28706a getMediaType() {
        return this.mediaType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C28716f)) {
            return false;
        }
        C28716f c28716f = (C28716f) other;
        return this.isImageBackground == c28716f.isImageBackground && AbstractC22676k.m65745e(this.imageSource, c28716f.imageSource) && this.mediaType == c28716f.mediaType && AbstractC22676k.m65745e(this.lottieWrapper, c28716f.lottieWrapper) && AbstractC22676k.m65745e(this.background, c28716f.background) && this.backgroundType == c28716f.backgroundType;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsImageBackground() {
        return this.isImageBackground;
    }

    public int hashCode() {
        int iHashCode = (this.mediaType.hashCode() + AbstractC30007c.m91833c(this.imageSource, Boolean.hashCode(this.isImageBackground) * 31, 31)) * 31;
        InterfaceC35689r0 interfaceC35689r0 = this.lottieWrapper;
        int iHashCode2 = (iHashCode + (interfaceC35689r0 == null ? 0 : interfaceC35689r0.hashCode())) * 31;
        AbstractC18247a abstractC18247a = this.background;
        return this.backgroundType.hashCode() + ((iHashCode2 + (abstractC18247a != null ? abstractC18247a.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "ImageInfo(isImageBackground=" + this.isImageBackground + ", imageSource=" + this.imageSource + ", mediaType=" + this.mediaType + ", lottieWrapper=" + this.lottieWrapper + ", background=" + this.background + ", backgroundType=" + this.backgroundType + ")";
    }
}
