package vy0;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: vy0.j0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010 R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b!\u0010 R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b\u0018\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010#\u001a\u0004\b\u001e\u0010$R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010#\u001a\u0004\b\"\u0010$R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0019\u001a\u0004\b%\u0010\u001b¨\u0006&"}, m65681d2 = {"Lvy0/j0;", "", "", "isBorderAnimationEnabled", "isGlowingAnimationEnabled", "Lcom/whoop/design/util/TextResource;", "loadingDisplayText", "previewDisplayText", "listeningDisplayText", "", "loadingTextAlpha", "previewTextAlpha", "isPreviewCollapsed", "<init>", "(ZZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;FFZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "f", "()Z", "b", "g", "c", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "d", "e", "F", "()F", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C36582j0 {

    /* JADX INFO: renamed from: i */
    public static final int f156694i = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isBorderAnimationEnabled;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isGlowingAnimationEnabled;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource loadingDisplayText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource previewDisplayText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource listeningDisplayText;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final float loadingTextAlpha;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final float previewTextAlpha;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean isPreviewCollapsed;

    public C36582j0(boolean z4, boolean z13, TextResource loadingDisplayText, TextResource previewDisplayText, TextResource listeningDisplayText, float f13, float f14, boolean z14) {
        AbstractC22676k.m65750j(loadingDisplayText, "loadingDisplayText");
        AbstractC22676k.m65750j(previewDisplayText, "previewDisplayText");
        AbstractC22676k.m65750j(listeningDisplayText, "listeningDisplayText");
        this.isBorderAnimationEnabled = z4;
        this.isGlowingAnimationEnabled = z13;
        this.loadingDisplayText = loadingDisplayText;
        this.previewDisplayText = previewDisplayText;
        this.listeningDisplayText = listeningDisplayText;
        this.loadingTextAlpha = f13;
        this.previewTextAlpha = f14;
        this.isPreviewCollapsed = z14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getListeningDisplayText() {
        return this.listeningDisplayText;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getLoadingDisplayText() {
        return this.loadingDisplayText;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getLoadingTextAlpha() {
        return this.loadingTextAlpha;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getPreviewDisplayText() {
        return this.previewDisplayText;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getPreviewTextAlpha() {
        return this.previewTextAlpha;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C36582j0)) {
            return false;
        }
        C36582j0 c36582j0 = (C36582j0) other;
        return this.isBorderAnimationEnabled == c36582j0.isBorderAnimationEnabled && this.isGlowingAnimationEnabled == c36582j0.isGlowingAnimationEnabled && AbstractC22676k.m65745e(this.loadingDisplayText, c36582j0.loadingDisplayText) && AbstractC22676k.m65745e(this.previewDisplayText, c36582j0.previewDisplayText) && AbstractC22676k.m65745e(this.listeningDisplayText, c36582j0.listeningDisplayText) && Float.compare(this.loadingTextAlpha, c36582j0.loadingTextAlpha) == 0 && Float.compare(this.previewTextAlpha, c36582j0.previewTextAlpha) == 0 && this.isPreviewCollapsed == c36582j0.isPreviewCollapsed;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsBorderAnimationEnabled() {
        return this.isBorderAnimationEnabled;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsGlowingAnimationEnabled() {
        return this.isGlowingAnimationEnabled;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsPreviewCollapsed() {
        return this.isPreviewCollapsed;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isPreviewCollapsed) + AbstractC11266d.m30447a(this.previewTextAlpha, AbstractC11266d.m30447a(this.loadingTextAlpha, AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC2875y.m8289b(Boolean.hashCode(this.isBorderAnimationEnabled) * 31, 31, this.isGlowingAnimationEnabled), this.loadingDisplayText, 31), this.previewDisplayText, 31), this.listeningDisplayText, 31), 31), 31);
    }

    public String toString() {
        boolean z4 = this.isBorderAnimationEnabled;
        boolean z13 = this.isGlowingAnimationEnabled;
        TextResource textResource = this.loadingDisplayText;
        TextResource textResource2 = this.previewDisplayText;
        TextResource textResource3 = this.listeningDisplayText;
        float f13 = this.loadingTextAlpha;
        float f14 = this.previewTextAlpha;
        boolean z14 = this.isPreviewCollapsed;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("WhoopCoachFabState(isBorderAnimationEnabled=", ", isGlowingAnimationEnabled=", ", loadingDisplayText=", z4, z13);
        AbstractC30007c.m91855y(sbM32002u, textResource, ", previewDisplayText=", textResource2, ", listeningDisplayText=");
        sbM32002u.append(textResource3);
        sbM32002u.append(", loadingTextAlpha=");
        sbM32002u.append(f13);
        sbM32002u.append(", previewTextAlpha=");
        sbM32002u.append(f14);
        sbM32002u.append(", isPreviewCollapsed=");
        sbM32002u.append(z14);
        sbM32002u.append(")");
        return sbM32002u.toString();
    }

    public /* synthetic */ C36582j0(boolean z4, boolean z13, TextResource textResource, TextResource textResource2, TextResource textResource3, float f13, float f14, boolean z14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 8) != 0 ? AbstractC8693b.m21267a() : textResource2, (i13 & 16) != 0 ? AbstractC8693b.m21267a() : textResource3, (i13 & 32) != 0 ? 1.0f : f13, (i13 & 64) != 0 ? 1.0f : f14, (i13 & 128) != 0 ? false : z14);
    }
}
