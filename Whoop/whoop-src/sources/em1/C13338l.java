package em1;

import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j11.EnumC21213p;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC13767f0;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import p745y81.InterfaceC39332e;
import q63.AbstractC30007c;
import te0.AbstractC33745d;
import ul1.EnumC35066c;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: em1.l */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010,R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b%\u0010,R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b)\u00102R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b-\u0010,R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\"\u001a\u0004\b3\u0010$R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b4\u00106R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b'\u00107\u001a\u0004\b!\u00108R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010\"\u001a\u0004\b9\u0010$R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b9\u0010\"\u001a\u0004\b:\u0010$R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u0010\"\u001a\u0004\b/\u0010$R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010;\u001a\u0004\b0\u0010<¨\u0006="}, m65681d2 = {"Lem1/l;", "", "", "isVisible", "Lul1/c;", "type", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "primaryActionText", "Ly81/e;", "primaryActionTextColor", "secondaryActionText", "useSolidCtaButtons", "Lj11/p;", "topDialogStyle", "", "icon", "isDismissable", "isSleepModal", "Lf0;", "sleepNeedModalViewState", "showCloseIcon", "<init>", "(ZLul1/c;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;ZLj11/p;Ljava/lang/Integer;ZZLf0;Z)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "n", "()Z", "b", "Lul1/c;", "j", "()Lul1/c;", "c", "Lcom/whoop/design/util/TextResource;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/design/util/TextResource;", "d", "g", "e", "f", "Ly81/e;", "()Ly81/e;", "k", "i", "Lj11/p;", "()Lj11/p;", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "l", "m", "Lf0;", "()Lf0;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C13338l {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isVisible;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC35066c type;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource primaryActionText;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC39332e primaryActionTextColor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final TextResource secondaryActionText;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean useSolidCtaButtons;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final EnumC21213p topDialogStyle;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final Integer icon;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final boolean isDismissable;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final boolean isSleepModal;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final boolean showCloseIcon;

    public C13338l(boolean z4, EnumC35066c type, TextResource textResource, TextResource textResource2, TextResource textResource3, InterfaceC39332e primaryActionTextColor, TextResource textResource4, boolean z13, EnumC21213p topDialogStyle, Integer num, boolean z14, boolean z15, AbstractC13767f0 abstractC13767f0, boolean z16) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(primaryActionTextColor, "primaryActionTextColor");
        AbstractC22676k.m65750j(topDialogStyle, "topDialogStyle");
        this.isVisible = z4;
        this.type = type;
        this.title = textResource;
        this.subtitle = textResource2;
        this.primaryActionText = textResource3;
        this.primaryActionTextColor = primaryActionTextColor;
        this.secondaryActionText = textResource4;
        this.useSolidCtaButtons = z13;
        this.topDialogStyle = topDialogStyle;
        this.icon = num;
        this.isDismissable = z14;
        this.isSleepModal = z15;
        this.showCloseIcon = z16;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getPrimaryActionText() {
        return this.primaryActionText;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC39332e getPrimaryActionTextColor() {
        return this.primaryActionTextColor;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSecondaryActionText() {
        return this.secondaryActionText;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getShowCloseIcon() {
        return this.showCloseIcon;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C13338l)) {
            return false;
        }
        C13338l c13338l = (C13338l) other;
        return this.isVisible == c13338l.isVisible && this.type == c13338l.type && AbstractC22676k.m65745e(this.title, c13338l.title) && AbstractC22676k.m65745e(this.subtitle, c13338l.subtitle) && AbstractC22676k.m65745e(this.primaryActionText, c13338l.primaryActionText) && AbstractC22676k.m65745e(this.primaryActionTextColor, c13338l.primaryActionTextColor) && AbstractC22676k.m65745e(this.secondaryActionText, c13338l.secondaryActionText) && this.useSolidCtaButtons == c13338l.useSolidCtaButtons && this.topDialogStyle == c13338l.topDialogStyle && AbstractC22676k.m65745e(this.icon, c13338l.icon) && this.isDismissable == c13338l.isDismissable && this.isSleepModal == c13338l.isSleepModal && this.showCloseIcon == c13338l.showCloseIcon;
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC13767f0 m37473f() {
        return null;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = (this.type.hashCode() + (Boolean.hashCode(this.isVisible) * 31)) * 31;
        TextResource textResource = this.title;
        int iHashCode2 = (iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31;
        TextResource textResource2 = this.subtitle;
        int iHashCode3 = (iHashCode2 + (textResource2 == null ? 0 : textResource2.hashCode())) * 31;
        TextResource textResource3 = this.primaryActionText;
        int iM106648g = AbstractC33745d.m106648g(this.primaryActionTextColor, (iHashCode3 + (textResource3 == null ? 0 : textResource3.hashCode())) * 31, 31);
        TextResource textResource4 = this.secondaryActionText;
        int iM106647f = AbstractC33745d.m106647f(this.topDialogStyle, AbstractC2875y.m8289b((iM106648g + (textResource4 == null ? 0 : textResource4.hashCode())) * 31, 31, this.useSolidCtaButtons), 31);
        Integer num = this.icon;
        return Boolean.hashCode(this.showCloseIcon) + AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM106647f + (num != null ? num.hashCode() : 0)) * 31, 31, this.isDismissable), 961, this.isSleepModal);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final EnumC21213p getTopDialogStyle() {
        return this.topDialogStyle;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final EnumC35066c getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getUseSolidCtaButtons() {
        return this.useSolidCtaButtons;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getIsDismissable() {
        return this.isDismissable;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getIsSleepModal() {
        return this.isSleepModal;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    public String toString() {
        boolean z4 = this.isVisible;
        EnumC35066c enumC35066c = this.type;
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        TextResource textResource3 = this.primaryActionText;
        InterfaceC39332e interfaceC39332e = this.primaryActionTextColor;
        TextResource textResource4 = this.secondaryActionText;
        boolean z13 = this.useSolidCtaButtons;
        EnumC21213p enumC21213p = this.topDialogStyle;
        Integer num = this.icon;
        boolean z14 = this.isDismissable;
        boolean z15 = this.isSleepModal;
        boolean z16 = this.showCloseIcon;
        StringBuilder sb4 = new StringBuilder("HomeDialogViewState(isVisible=");
        sb4.append(z4);
        sb4.append(", type=");
        sb4.append(enumC35066c);
        sb4.append(", title=");
        AbstractC30007c.m91855y(sb4, textResource, ", subtitle=", textResource2, ", primaryActionText=");
        sb4.append(textResource3);
        sb4.append(", primaryActionTextColor=");
        sb4.append(interfaceC39332e);
        sb4.append(", secondaryActionText=");
        AbstractC33745d.m106664w(textResource4, ", useSolidCtaButtons=", ", topDialogStyle=", sb4, z13);
        sb4.append(enumC21213p);
        sb4.append(", icon=");
        sb4.append(num);
        sb4.append(", isDismissable=");
        AbstractC38963t7.m124392v(sb4, z14, ", isSleepModal=", z15, ", sleepNeedModalViewState=null, showCloseIcon=");
        return AbstractC18489d0.m53372m(sb4, z16, ")");
    }

    public /* synthetic */ C13338l(boolean z4, EnumC35066c enumC35066c, TextResource textResource, TextResource textResource2, TextResource textResource3, InterfaceC39332e interfaceC39332e, TextResource textResource4, boolean z13, EnumC21213p enumC21213p, Integer num, boolean z14, boolean z15, AbstractC13767f0 abstractC13767f0, boolean z16, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? EnumC35066c.NONE : enumC35066c, (i13 & 4) != 0 ? null : textResource, (i13 & 8) != 0 ? null : textResource2, (i13 & 16) != 0 ? null : textResource3, (i13 & 32) != 0 ? EnumC39333f.BRAND_WHITE : interfaceC39332e, (i13 & 64) != 0 ? null : textResource4, (i13 & 128) != 0 ? false : z13, (i13 & 256) != 0 ? EnumC21213p.DEFAULT : enumC21213p, (i13 & 512) != 0 ? null : num, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? true : z14, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0 ? z15 : false, (i13 & 4096) == 0 ? abstractC13767f0 : null, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? true : z16);
    }
}
