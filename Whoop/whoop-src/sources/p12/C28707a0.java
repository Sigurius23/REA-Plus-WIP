package p12;

import com.whoop.design.model.FeatureEducationParagraph;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p12.a0 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b\u0017\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"¨\u0006#"}, m65681d2 = {"Lp12/a0;", "", "", "Lcom/whoop/design/model/FeatureEducationParagraph;", "paragraphs", "Lp12/f;", "imageInfo", "Lp12/b;", "ctaButtons", "Lp12/e0;", "videoInfo", "<init>", "(Ljava/util/List;Lp12/f;Lp12/b;Lp12/e0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Lp12/f;", "()Lp12/f;", "Lp12/b;", "()Lp12/b;", "d", "Lp12/e0;", "()Lp12/e0;", "onboarding-story_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C28707a0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<FeatureEducationParagraph> paragraphs;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C28716f imageInfo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C28708b ctaButtons;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C28715e0 videoInfo;

    public C28707a0(List<FeatureEducationParagraph> paragraphs, C28716f imageInfo, C28708b c28708b, C28715e0 c28715e0) {
        AbstractC22676k.m65750j(paragraphs, "paragraphs");
        AbstractC22676k.m65750j(imageInfo, "imageInfo");
        this.paragraphs = paragraphs;
        this.imageInfo = imageInfo;
        this.ctaButtons = c28708b;
        this.videoInfo = c28715e0;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C28708b getCtaButtons() {
        return this.ctaButtons;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C28716f getImageInfo() {
        return this.imageInfo;
    }

    /* JADX INFO: renamed from: c */
    public final List<FeatureEducationParagraph> m87336c() {
        return this.paragraphs;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C28715e0 getVideoInfo() {
        return this.videoInfo;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C28707a0)) {
            return false;
        }
        C28707a0 c28707a0 = (C28707a0) other;
        return AbstractC22676k.m65745e(this.paragraphs, c28707a0.paragraphs) && AbstractC22676k.m65745e(this.imageInfo, c28707a0.imageInfo) && AbstractC22676k.m65745e(this.ctaButtons, c28707a0.ctaButtons) && AbstractC22676k.m65745e(this.videoInfo, c28707a0.videoInfo);
    }

    public int hashCode() {
        int iHashCode = (this.imageInfo.hashCode() + (this.paragraphs.hashCode() * 31)) * 31;
        C28708b c28708b = this.ctaButtons;
        int iHashCode2 = (iHashCode + (c28708b == null ? 0 : c28708b.hashCode())) * 31;
        C28715e0 c28715e0 = this.videoInfo;
        return iHashCode2 + (c28715e0 != null ? c28715e0.hashCode() : 0);
    }

    public String toString() {
        return "StoryContentViewDataV2(paragraphs=" + this.paragraphs + ", imageInfo=" + this.imageInfo + ", ctaButtons=" + this.ctaButtons + ", videoInfo=" + this.videoInfo + ")";
    }
}
