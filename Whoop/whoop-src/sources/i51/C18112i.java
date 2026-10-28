package i51;

import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: i51.i */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJP\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b \u0010+\u001a\u0004\b'\u0010,¨\u0006-"}, m65681d2 = {"Li51/i;", "Lm91/u;", "Li51/h;", "mediaSource", "Li51/g;", "size", "Lcom/whoop/design/util/TextResource;", "textOverlay", "textOverlaySuffix", "Li51/p;", "textOverlayStyle", "", "reserveOverlaySpace", "<init>", "(Li51/h;Li51/g;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Li51/p;Z)V", "a", "(Li51/h;Li51/g;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Li51/p;Z)Li51/i;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Li51/h;", "c", "()Li51/h;", "b", "Li51/g;", "f", "()Li51/g;", "Lcom/whoop/design/util/TextResource;", "g", "()Lcom/whoop/design/util/TextResource;", "d", "i", "e", "Li51/p;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Li51/p;", "Z", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C18112i implements InterfaceC25312u {

    /* JADX INFO: renamed from: g */
    public static final int f70331g = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC18111h mediaSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC18110g size;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource textOverlay;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource textOverlaySuffix;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EnumC18119p textOverlayStyle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean reserveOverlaySpace;

    public C18112i(AbstractC18111h mediaSource, EnumC18110g size, TextResource textResource, TextResource textResource2, EnumC18119p textOverlayStyle, boolean z4) {
        AbstractC22676k.m65750j(mediaSource, "mediaSource");
        AbstractC22676k.m65750j(size, "size");
        AbstractC22676k.m65750j(textOverlayStyle, "textOverlayStyle");
        this.mediaSource = mediaSource;
        this.size = size;
        this.textOverlay = textResource;
        this.textOverlaySuffix = textResource2;
        this.textOverlayStyle = textOverlayStyle;
        this.reserveOverlaySpace = z4;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C18112i m51978b(C18112i c18112i, AbstractC18111h abstractC18111h, EnumC18110g enumC18110g, TextResource textResource, TextResource textResource2, EnumC18119p enumC18119p, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            abstractC18111h = c18112i.mediaSource;
        }
        if ((i13 & 2) != 0) {
            enumC18110g = c18112i.size;
        }
        if ((i13 & 4) != 0) {
            textResource = c18112i.textOverlay;
        }
        if ((i13 & 8) != 0) {
            textResource2 = c18112i.textOverlaySuffix;
        }
        if ((i13 & 16) != 0) {
            enumC18119p = c18112i.textOverlayStyle;
        }
        if ((i13 & 32) != 0) {
            z4 = c18112i.reserveOverlaySpace;
        }
        EnumC18119p enumC18119p2 = enumC18119p;
        boolean z13 = z4;
        return c18112i.m51979a(abstractC18111h, enumC18110g, textResource, textResource2, enumC18119p2, z13);
    }

    /* JADX INFO: renamed from: a */
    public final C18112i m51979a(AbstractC18111h mediaSource, EnumC18110g size, TextResource textOverlay, TextResource textOverlaySuffix, EnumC18119p textOverlayStyle, boolean reserveOverlaySpace) {
        AbstractC22676k.m65750j(mediaSource, "mediaSource");
        AbstractC22676k.m65750j(size, "size");
        AbstractC22676k.m65750j(textOverlayStyle, "textOverlayStyle");
        return new C18112i(mediaSource, size, textOverlay, textOverlaySuffix, textOverlayStyle, reserveOverlaySpace);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AbstractC18111h getMediaSource() {
        return this.mediaSource;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getReserveOverlaySpace() {
        return this.reserveOverlaySpace;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C18112i)) {
            return false;
        }
        C18112i c18112i = (C18112i) other;
        return AbstractC22676k.m65745e(this.mediaSource, c18112i.mediaSource) && this.size == c18112i.size && AbstractC22676k.m65745e(this.textOverlay, c18112i.textOverlay) && AbstractC22676k.m65745e(this.textOverlaySuffix, c18112i.textOverlaySuffix) && this.textOverlayStyle == c18112i.textOverlayStyle && this.reserveOverlaySpace == c18112i.reserveOverlaySpace;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC18110g getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getTextOverlay() {
        return this.textOverlay;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final EnumC18119p getTextOverlayStyle() {
        return this.textOverlayStyle;
    }

    public int hashCode() {
        int iHashCode = (this.size.hashCode() + (this.mediaSource.hashCode() * 31)) * 31;
        TextResource textResource = this.textOverlay;
        int iHashCode2 = (iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31;
        TextResource textResource2 = this.textOverlaySuffix;
        return Boolean.hashCode(this.reserveOverlaySpace) + ((this.textOverlayStyle.hashCode() + ((iHashCode2 + (textResource2 != null ? textResource2.hashCode() : 0)) * 31)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextResource getTextOverlaySuffix() {
        return this.textOverlaySuffix;
    }

    public String toString() {
        AbstractC18111h abstractC18111h = this.mediaSource;
        EnumC18110g enumC18110g = this.size;
        TextResource textResource = this.textOverlay;
        TextResource textResource2 = this.textOverlaySuffix;
        EnumC18119p enumC18119p = this.textOverlayStyle;
        boolean z4 = this.reserveOverlaySpace;
        StringBuilder sb4 = new StringBuilder("CelebrationMediaViewState(mediaSource=");
        sb4.append(abstractC18111h);
        sb4.append(", size=");
        sb4.append(enumC18110g);
        sb4.append(", textOverlay=");
        AbstractC30007c.m91855y(sb4, textResource, ", textOverlaySuffix=", textResource2, ", textOverlayStyle=");
        sb4.append(enumC18119p);
        sb4.append(", reserveOverlaySpace=");
        sb4.append(z4);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ C18112i(AbstractC18111h abstractC18111h, EnumC18110g enumC18110g, TextResource textResource, TextResource textResource2, EnumC18119p enumC18119p, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC18111h, enumC18110g, (i13 & 4) != 0 ? null : textResource, (i13 & 8) != 0 ? null : textResource2, (i13 & 16) != 0 ? EnumC18119p.DEFAULT : enumC18119p, (i13 & 32) != 0 ? false : z4);
    }
}
