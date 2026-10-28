package com.whoop.design.model;

import c13.AbstractC3855a;
import java.util.List;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0014Jj\u0010 \u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\"\u0010\u0016J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b+\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u0018R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b1\u0010\u001aR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b3\u0010\u001cR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00104\u001a\u0004\b5\u0010\u001eR\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010*\u001a\u0004\b6\u0010\u0014¨\u00067"}, m65681d2 = {"Lcom/whoop/design/model/FeatureEducationParagraph;", "", "", "Lcom/whoop/design/model/FeatureEducationSentence;", "sentences", "", "alignment", "Lcom/whoop/design/model/ParagraphInsets;", "insets", "Lcom/whoop/design/model/FeatureEducationImage;", "image", "Lcom/whoop/design/model/FeatureEducationVideo;", "video", "Lcom/whoop/design/model/FeatureEducationCtaButton;", "ctaButton", "Lm91/u;", "ctas", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/model/ParagraphInsets;Lcom/whoop/design/model/FeatureEducationImage;Lcom/whoop/design/model/FeatureEducationVideo;Lcom/whoop/design/model/FeatureEducationCtaButton;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/whoop/design/model/ParagraphInsets;", "component4", "()Lcom/whoop/design/model/FeatureEducationImage;", "component5", "()Lcom/whoop/design/model/FeatureEducationVideo;", "component6", "()Lcom/whoop/design/model/FeatureEducationCtaButton;", "component7", "copy", "(Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/model/ParagraphInsets;Lcom/whoop/design/model/FeatureEducationImage;Lcom/whoop/design/model/FeatureEducationVideo;Lcom/whoop/design/model/FeatureEducationCtaButton;Ljava/util/List;)Lcom/whoop/design/model/FeatureEducationParagraph;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getSentences", "Ljava/lang/String;", "getAlignment", "Lcom/whoop/design/model/ParagraphInsets;", "getInsets", "Lcom/whoop/design/model/FeatureEducationImage;", "getImage", "Lcom/whoop/design/model/FeatureEducationVideo;", "getVideo", "Lcom/whoop/design/model/FeatureEducationCtaButton;", "getCtaButton", "getCtas", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class FeatureEducationParagraph {
    public static final int $stable = 8;
    private final String alignment;
    private final FeatureEducationCtaButton ctaButton;
    private final List<InterfaceC25312u> ctas;
    private final FeatureEducationImage image;
    private final ParagraphInsets insets;
    private final List<FeatureEducationSentence> sentences;
    private final FeatureEducationVideo video;

    /* JADX WARN: Multi-variable type inference failed */
    public FeatureEducationParagraph(List<FeatureEducationSentence> sentences, String alignment, ParagraphInsets insets, FeatureEducationImage featureEducationImage, FeatureEducationVideo featureEducationVideo, FeatureEducationCtaButton featureEducationCtaButton, List<? extends InterfaceC25312u> list) {
        AbstractC22676k.m65750j(sentences, "sentences");
        AbstractC22676k.m65750j(alignment, "alignment");
        AbstractC22676k.m65750j(insets, "insets");
        this.sentences = sentences;
        this.alignment = alignment;
        this.insets = insets;
        this.image = featureEducationImage;
        this.video = featureEducationVideo;
        this.ctaButton = featureEducationCtaButton;
        this.ctas = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeatureEducationParagraph copy$default(FeatureEducationParagraph featureEducationParagraph, List list, String str, ParagraphInsets paragraphInsets, FeatureEducationImage featureEducationImage, FeatureEducationVideo featureEducationVideo, FeatureEducationCtaButton featureEducationCtaButton, List list2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = featureEducationParagraph.sentences;
        }
        if ((i13 & 2) != 0) {
            str = featureEducationParagraph.alignment;
        }
        if ((i13 & 4) != 0) {
            paragraphInsets = featureEducationParagraph.insets;
        }
        if ((i13 & 8) != 0) {
            featureEducationImage = featureEducationParagraph.image;
        }
        if ((i13 & 16) != 0) {
            featureEducationVideo = featureEducationParagraph.video;
        }
        if ((i13 & 32) != 0) {
            featureEducationCtaButton = featureEducationParagraph.ctaButton;
        }
        if ((i13 & 64) != 0) {
            list2 = featureEducationParagraph.ctas;
        }
        FeatureEducationCtaButton featureEducationCtaButton2 = featureEducationCtaButton;
        List list3 = list2;
        FeatureEducationVideo featureEducationVideo2 = featureEducationVideo;
        ParagraphInsets paragraphInsets2 = paragraphInsets;
        return featureEducationParagraph.copy(list, str, paragraphInsets2, featureEducationImage, featureEducationVideo2, featureEducationCtaButton2, list3);
    }

    public final List<FeatureEducationSentence> component1() {
        return this.sentences;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAlignment() {
        return this.alignment;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ParagraphInsets getInsets() {
        return this.insets;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final FeatureEducationImage getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final FeatureEducationVideo getVideo() {
        return this.video;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final FeatureEducationCtaButton getCtaButton() {
        return this.ctaButton;
    }

    public final List<InterfaceC25312u> component7() {
        return this.ctas;
    }

    public final FeatureEducationParagraph copy(List<FeatureEducationSentence> sentences, String alignment, ParagraphInsets insets, FeatureEducationImage image, FeatureEducationVideo video, FeatureEducationCtaButton ctaButton, List<? extends InterfaceC25312u> ctas) {
        AbstractC22676k.m65750j(sentences, "sentences");
        AbstractC22676k.m65750j(alignment, "alignment");
        AbstractC22676k.m65750j(insets, "insets");
        return new FeatureEducationParagraph(sentences, alignment, insets, image, video, ctaButton, ctas);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeatureEducationParagraph)) {
            return false;
        }
        FeatureEducationParagraph featureEducationParagraph = (FeatureEducationParagraph) other;
        return AbstractC22676k.m65745e(this.sentences, featureEducationParagraph.sentences) && AbstractC22676k.m65745e(this.alignment, featureEducationParagraph.alignment) && AbstractC22676k.m65745e(this.insets, featureEducationParagraph.insets) && AbstractC22676k.m65745e(this.image, featureEducationParagraph.image) && AbstractC22676k.m65745e(this.video, featureEducationParagraph.video) && AbstractC22676k.m65745e(this.ctaButton, featureEducationParagraph.ctaButton) && AbstractC22676k.m65745e(this.ctas, featureEducationParagraph.ctas);
    }

    public final String getAlignment() {
        return this.alignment;
    }

    public final FeatureEducationCtaButton getCtaButton() {
        return this.ctaButton;
    }

    public final List<InterfaceC25312u> getCtas() {
        return this.ctas;
    }

    public final FeatureEducationImage getImage() {
        return this.image;
    }

    public final ParagraphInsets getInsets() {
        return this.insets;
    }

    public final List<FeatureEducationSentence> getSentences() {
        return this.sentences;
    }

    public final FeatureEducationVideo getVideo() {
        return this.video;
    }

    public int hashCode() {
        int iHashCode = (this.insets.hashCode() + AbstractC11266d.m30450d(this.sentences.hashCode() * 31, 31, this.alignment)) * 31;
        FeatureEducationImage featureEducationImage = this.image;
        int iHashCode2 = (iHashCode + (featureEducationImage == null ? 0 : featureEducationImage.hashCode())) * 31;
        FeatureEducationVideo featureEducationVideo = this.video;
        int iHashCode3 = (iHashCode2 + (featureEducationVideo == null ? 0 : featureEducationVideo.hashCode())) * 31;
        FeatureEducationCtaButton featureEducationCtaButton = this.ctaButton;
        int iHashCode4 = (iHashCode3 + (featureEducationCtaButton == null ? 0 : featureEducationCtaButton.hashCode())) * 31;
        List<InterfaceC25312u> list = this.ctas;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        List<FeatureEducationSentence> list = this.sentences;
        String str = this.alignment;
        ParagraphInsets paragraphInsets = this.insets;
        FeatureEducationImage featureEducationImage = this.image;
        FeatureEducationVideo featureEducationVideo = this.video;
        FeatureEducationCtaButton featureEducationCtaButton = this.ctaButton;
        List<InterfaceC25312u> list2 = this.ctas;
        StringBuilder sbM79507k = AbstractC26725a.m79507k("FeatureEducationParagraph(sentences=", ", alignment=", str, ", insets=", list);
        sbM79507k.append(paragraphInsets);
        sbM79507k.append(", image=");
        sbM79507k.append(featureEducationImage);
        sbM79507k.append(", video=");
        sbM79507k.append(featureEducationVideo);
        sbM79507k.append(", ctaButton=");
        sbM79507k.append(featureEducationCtaButton);
        sbM79507k.append(", ctas=");
        return AbstractC3855a.m11829m(sbM79507k, list2, ")");
    }

    public /* synthetic */ FeatureEducationParagraph(List list, String str, ParagraphInsets paragraphInsets, FeatureEducationImage featureEducationImage, FeatureEducationVideo featureEducationVideo, FeatureEducationCtaButton featureEducationCtaButton, List list2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, paragraphInsets, (i13 & 8) != 0 ? null : featureEducationImage, (i13 & 16) != 0 ? null : featureEducationVideo, (i13 & 32) != 0 ? null : featureEducationCtaButton, (i13 & 64) != 0 ? null : list2);
    }
}
