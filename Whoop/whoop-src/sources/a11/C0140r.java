package a11;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jh3.AbstractC21702c;
import no.nordicsemi.android.dfu.DfuBaseService;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: a11.r */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b2\u0010#\u001a\u0004\b3\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b3\u0010#\u001a\u0004\b4\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010#\u001a\u0004\b2\u0010%R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b0\u0010/\u001a\u0004\b5\u00101R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b'\u00106\u001a\u0004\b&\u00107R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b)\u00108\u001a\u0004\b.\u00109R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b4\u0010:\u001a\u0004\b(\u0010;R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b$\u0010<\u001a\u0004\b\"\u0010=R\u0017\u0010\u0016\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b5\u0010/\u001a\u0004\b>\u00101¨\u0006?"}, m65681d2 = {"La11/r;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "subTitle", "subTitleTrailing", "", "leftIcon", "", "leftLottieAnimation", "dataLabel", "timeLabel", "ctaButtonLabel", "useSolidCtaButton", "La11/d;", "connectivityInfoTileType", "La11/c;", "connectivityStatusType", "La11/b;", "connectivityNavType", "La11/a;", "connectivityEventType", "isVisible", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLa11/d;La11/c;La11/b;La11/a;Z)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "m", "()Lcom/whoop/design/util/TextResource;", "b", "j", "c", "k", "d", "Ljava/lang/Integer;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Ljava/lang/Integer;", "e", "Z", "i", "()Z", "f", "g", "l", "n", "La11/d;", "()La11/d;", "La11/c;", "()La11/c;", "La11/b;", "()La11/b;", "La11/a;", "()La11/a;", "o", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C0140r implements InterfaceC25312u {

    /* JADX INFO: renamed from: o */
    public static final int f434o = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource subTitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource subTitleTrailing;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Integer leftIcon;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean leftLottieAnimation;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextResource dataLabel;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final TextResource timeLabel;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final TextResource ctaButtonLabel;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean useSolidCtaButton;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final EnumC0126d connectivityInfoTileType;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final EnumC0125c connectivityStatusType;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final EnumC0124b connectivityNavType;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final EnumC0123a connectivityEventType;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final boolean isVisible;

    public C0140r(TextResource title, TextResource textResource, TextResource textResource2, Integer num, boolean z4, TextResource textResource3, TextResource textResource4, TextResource textResource5, boolean z13, EnumC0126d connectivityInfoTileType, EnumC0125c connectivityStatusType, EnumC0124b connectivityNavType, EnumC0123a connectivityEventType, boolean z14) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(connectivityInfoTileType, "connectivityInfoTileType");
        AbstractC22676k.m65750j(connectivityStatusType, "connectivityStatusType");
        AbstractC22676k.m65750j(connectivityNavType, "connectivityNavType");
        AbstractC22676k.m65750j(connectivityEventType, "connectivityEventType");
        this.title = title;
        this.subTitle = textResource;
        this.subTitleTrailing = textResource2;
        this.leftIcon = num;
        this.leftLottieAnimation = z4;
        this.dataLabel = textResource3;
        this.timeLabel = textResource4;
        this.ctaButtonLabel = textResource5;
        this.useSolidCtaButton = z13;
        this.connectivityInfoTileType = connectivityInfoTileType;
        this.connectivityStatusType = connectivityStatusType;
        this.connectivityNavType = connectivityNavType;
        this.connectivityEventType = connectivityEventType;
        this.isVisible = z14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC0123a getConnectivityEventType() {
        return this.connectivityEventType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC0126d getConnectivityInfoTileType() {
        return this.connectivityInfoTileType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC0124b getConnectivityNavType() {
        return this.connectivityNavType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC0125c getConnectivityStatusType() {
        return this.connectivityStatusType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C0140r)) {
            return false;
        }
        C0140r c0140r = (C0140r) other;
        return AbstractC22676k.m65745e(this.title, c0140r.title) && AbstractC22676k.m65745e(this.subTitle, c0140r.subTitle) && AbstractC22676k.m65745e(this.subTitleTrailing, c0140r.subTitleTrailing) && AbstractC22676k.m65745e(this.leftIcon, c0140r.leftIcon) && this.leftLottieAnimation == c0140r.leftLottieAnimation && AbstractC22676k.m65745e(this.dataLabel, c0140r.dataLabel) && AbstractC22676k.m65745e(this.timeLabel, c0140r.timeLabel) && AbstractC22676k.m65745e(this.ctaButtonLabel, c0140r.ctaButtonLabel) && this.useSolidCtaButton == c0140r.useSolidCtaButton && this.connectivityInfoTileType == c0140r.connectivityInfoTileType && this.connectivityStatusType == c0140r.connectivityStatusType && this.connectivityNavType == c0140r.connectivityNavType && this.connectivityEventType == c0140r.connectivityEventType && this.isVisible == c0140r.isVisible;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getCtaButtonLabel() {
        return this.ctaButtonLabel;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getDataLabel() {
        return this.dataLabel;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Integer getLeftIcon() {
        return this.leftIcon;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        TextResource textResource = this.subTitle;
        int iHashCode2 = (iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31;
        TextResource textResource2 = this.subTitleTrailing;
        int iHashCode3 = (iHashCode2 + (textResource2 == null ? 0 : textResource2.hashCode())) * 31;
        Integer num = this.leftIcon;
        int iM8289b = AbstractC2875y.m8289b((iHashCode3 + (num == null ? 0 : num.hashCode())) * 31, 31, this.leftLottieAnimation);
        TextResource textResource3 = this.dataLabel;
        int iHashCode4 = (iM8289b + (textResource3 == null ? 0 : textResource3.hashCode())) * 31;
        TextResource textResource4 = this.timeLabel;
        int iHashCode5 = (iHashCode4 + (textResource4 == null ? 0 : textResource4.hashCode())) * 31;
        TextResource textResource5 = this.ctaButtonLabel;
        return Boolean.hashCode(this.isVisible) + ((this.connectivityEventType.hashCode() + ((this.connectivityNavType.hashCode() + ((this.connectivityStatusType.hashCode() + ((this.connectivityInfoTileType.hashCode() + AbstractC2875y.m8289b((iHashCode5 + (textResource5 != null ? textResource5.hashCode() : 0)) * 31, 31, this.useSolidCtaButton)) * 31)) * 31)) * 31)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getLeftLottieAnimation() {
        return this.leftLottieAnimation;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final TextResource getSubTitle() {
        return this.subTitle;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final TextResource getSubTitleTrailing() {
        return this.subTitleTrailing;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final TextResource getTimeLabel() {
        return this.timeLabel;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getUseSolidCtaButton() {
        return this.useSolidCtaButton;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.subTitle;
        TextResource textResource3 = this.subTitleTrailing;
        Integer num = this.leftIcon;
        boolean z4 = this.leftLottieAnimation;
        TextResource textResource4 = this.dataLabel;
        TextResource textResource5 = this.timeLabel;
        TextResource textResource6 = this.ctaButtonLabel;
        boolean z13 = this.useSolidCtaButton;
        EnumC0126d enumC0126d = this.connectivityInfoTileType;
        EnumC0125c enumC0125c = this.connectivityStatusType;
        EnumC0124b enumC0124b = this.connectivityNavType;
        EnumC0123a enumC0123a = this.connectivityEventType;
        boolean z14 = this.isVisible;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("ConnectivityTileState(title=", textResource, ", subTitle=", textResource2, ", subTitleTrailing=");
        sbM106658q.append(textResource3);
        sbM106658q.append(", leftIcon=");
        sbM106658q.append(num);
        sbM106658q.append(", leftLottieAnimation=");
        AbstractC21702c.m61144o(textResource4, ", dataLabel=", ", timeLabel=", sbM106658q, z4);
        AbstractC30007c.m91855y(sbM106658q, textResource5, ", ctaButtonLabel=", textResource6, ", useSolidCtaButton=");
        sbM106658q.append(z13);
        sbM106658q.append(", connectivityInfoTileType=");
        sbM106658q.append(enumC0126d);
        sbM106658q.append(", connectivityStatusType=");
        sbM106658q.append(enumC0125c);
        sbM106658q.append(", connectivityNavType=");
        sbM106658q.append(enumC0124b);
        sbM106658q.append(", connectivityEventType=");
        sbM106658q.append(enumC0123a);
        sbM106658q.append(", isVisible=");
        sbM106658q.append(z14);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }

    public /* synthetic */ C0140r(TextResource textResource, TextResource textResource2, TextResource textResource3, Integer num, boolean z4, TextResource textResource4, TextResource textResource5, TextResource textResource6, boolean z13, EnumC0126d enumC0126d, EnumC0125c enumC0125c, EnumC0124b enumC0124b, EnumC0123a enumC0123a, boolean z14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC8693b.m21278l("") : textResource, (i13 & 2) != 0 ? null : textResource2, (i13 & 4) != 0 ? null : textResource3, (i13 & 8) != 0 ? null : num, (i13 & 16) != 0 ? false : z4, (i13 & 32) != 0 ? null : textResource4, (i13 & 64) != 0 ? null : textResource5, (i13 & 128) == 0 ? textResource6 : null, (i13 & 256) != 0 ? false : z13, (i13 & 512) != 0 ? EnumC0126d.STANDARD : enumC0126d, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? EnumC0125c.NONE : enumC0125c, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? EnumC0124b.DEFAULT : enumC0124b, (i13 & 4096) != 0 ? EnumC0123a.NONE : enumC0123a, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? false : z14);
    }
}
