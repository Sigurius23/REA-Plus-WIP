package i51;

import b91.EnumC2888c;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22403o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: i51.l */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u001f\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\"\u0010'R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b(\u0010!R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b,\u0010$¨\u0006-"}, m65681d2 = {"Li51/l;", "Lm91/u;", "Li51/i;", "media", "Lcom/whoop/design/util/TextResource;", "captionText", "Lb91/c;", "captionTypography", "Lcom/whoop/navigation/e;", "destination", "subCaptionText", "Lkd1/o;", "subCaptionLeadingImage", "subCaptionTypography", "<init>", "(Li51/i;Lcom/whoop/design/util/TextResource;Lb91/c;Lcom/whoop/navigation/e;Lcom/whoop/design/util/TextResource;Lkd1/o;Lb91/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li51/i;", "e", "()Li51/i;", "b", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "c", "Lb91/c;", "()Lb91/c;", "d", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "g", "f", "Lkd1/o;", "()Lkd1/o;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C18115l implements InterfaceC25312u {

    /* JADX INFO: renamed from: h */
    public static final int f70339h = C9598e.f28134d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C18112i media;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource captionText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC2888c captionTypography;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C9598e destination;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource subCaptionText;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final AbstractC22403o subCaptionLeadingImage;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final EnumC2888c subCaptionTypography;

    public C18115l(C18112i media, TextResource textResource, EnumC2888c enumC2888c, C9598e c9598e, TextResource textResource2, AbstractC22403o abstractC22403o, EnumC2888c enumC2888c2) {
        AbstractC22676k.m65750j(media, "media");
        this.media = media;
        this.captionText = textResource;
        this.captionTypography = enumC2888c;
        this.destination = c9598e;
        this.subCaptionText = textResource2;
        this.subCaptionLeadingImage = abstractC22403o;
        this.subCaptionTypography = enumC2888c2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getCaptionText() {
        return this.captionText;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC2888c getCaptionTypography() {
        return this.captionTypography;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C18112i getMedia() {
        return this.media;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C18115l)) {
            return false;
        }
        C18115l c18115l = (C18115l) other;
        return AbstractC22676k.m65745e(this.media, c18115l.media) && AbstractC22676k.m65745e(this.captionText, c18115l.captionText) && this.captionTypography == c18115l.captionTypography && AbstractC22676k.m65745e(this.destination, c18115l.destination) && AbstractC22676k.m65745e(this.subCaptionText, c18115l.subCaptionText) && AbstractC22676k.m65745e(this.subCaptionLeadingImage, c18115l.subCaptionLeadingImage) && this.subCaptionTypography == c18115l.subCaptionTypography;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final AbstractC22403o getSubCaptionLeadingImage() {
        return this.subCaptionLeadingImage;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getSubCaptionText() {
        return this.subCaptionText;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final EnumC2888c getSubCaptionTypography() {
        return this.subCaptionTypography;
    }

    public int hashCode() {
        int iHashCode = this.media.hashCode() * 31;
        TextResource textResource = this.captionText;
        int iHashCode2 = (iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31;
        EnumC2888c enumC2888c = this.captionTypography;
        int iHashCode3 = (iHashCode2 + (enumC2888c == null ? 0 : enumC2888c.hashCode())) * 31;
        C9598e c9598e = this.destination;
        int iHashCode4 = (iHashCode3 + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        TextResource textResource2 = this.subCaptionText;
        int iHashCode5 = (iHashCode4 + (textResource2 == null ? 0 : textResource2.hashCode())) * 31;
        AbstractC22403o abstractC22403o = this.subCaptionLeadingImage;
        int iHashCode6 = (iHashCode5 + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31;
        EnumC2888c enumC2888c2 = this.subCaptionTypography;
        return iHashCode6 + (enumC2888c2 != null ? enumC2888c2.hashCode() : 0);
    }

    public String toString() {
        return "CelebrationMediaWithCaptionViewState(media=" + this.media + ", captionText=" + this.captionText + ", captionTypography=" + this.captionTypography + ", destination=" + this.destination + ", subCaptionText=" + this.subCaptionText + ", subCaptionLeadingImage=" + this.subCaptionLeadingImage + ", subCaptionTypography=" + this.subCaptionTypography + ")";
    }
}
