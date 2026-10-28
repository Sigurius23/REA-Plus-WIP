package ry0;

import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22403o;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: ry0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001B©\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\n\u0012\b\b\u0002\u0010\u0014\u001a\u00020\n\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0018\u0010\u0019J¶\u0001\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010$\u001a\u0004\b%\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b,\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b0\u00103\u001a\u0004\b9\u00105R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b:\u00103\u001a\u0004\b;\u00105R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b9\u0010<\u001a\u0004\b(\u0010=R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b>\u0010<\u001a\u0004\b.\u0010=R\u0017\u0010\u0013\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b7\u00103\u001a\u0004\b>\u00105R\u0017\u0010\u0014\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b4\u00103\u001a\u0004\b?\u00105R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b;\u0010@\u001a\u0004\b2\u0010AR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b:\u0010\u001d¨\u0006B"}, m65681d2 = {"Lry0/d;", "Lm91/u;", "", "id", "title", "subtitle", "Lgz0/m0;", "leftIcon", "Lkd1/o;", "leftImage", "", "shouldTintLeftImage", "Lry0/c;", "selectionStyle", "selected", "showCheckbox", "", "actionArgument", "deselectArgument", "selectionDisabled", "isDisabled", "Ly3/f;", "fixedHeightInSizeDp", "sectionTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lkd1/o;ZLry0/c;ZZLjava/lang/Object;Ljava/lang/Object;ZZLy3/f;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lkd1/o;ZLry0/c;ZZLjava/lang/Object;Ljava/lang/Object;ZZLy3/f;Ljava/lang/String;)Lry0/d;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "b", "p", "c", "o", "d", "Lgz0/m0;", "g", "()Lgz0/m0;", "e", "Lkd1/o;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lkd1/o;", "f", "Z", "m", "()Z", "Lry0/c;", "l", "()Lry0/c;", "j", "i", "n", "Ljava/lang/Object;", "()Ljava/lang/Object;", "k", "q", "Ly3/f;", "()Ly3/f;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C31909d implements InterfaceC25312u {

    /* JADX INFO: renamed from: p */
    public static final int f132449p = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String subtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC16313m0 leftIcon;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AbstractC22403o leftImage;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean shouldTintLeftImage;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final EnumC31908c selectionStyle;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean selected;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean showCheckbox;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final Object actionArgument;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final Object deselectArgument;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final boolean selectionDisabled;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final boolean isDisabled;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final C39174f fixedHeightInSizeDp;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final String sectionTitle;

    public /* synthetic */ C31909d(String str, String str2, String str3, EnumC16313m0 enumC16313m0, AbstractC22403o abstractC22403o, boolean z4, EnumC31908c enumC31908c, boolean z13, boolean z14, Object obj, Object obj2, boolean z15, boolean z16, C39174f c39174f, String str4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, enumC16313m0, abstractC22403o, z4, enumC31908c, z13, z14, obj, obj2, z15, z16, c39174f, str4);
    }

    /* JADX INFO: renamed from: a */
    public final C31909d m99205a(String id4, String title, String subtitle, EnumC16313m0 leftIcon, AbstractC22403o leftImage, boolean shouldTintLeftImage, EnumC31908c selectionStyle, boolean selected, boolean showCheckbox, Object actionArgument, Object deselectArgument, boolean selectionDisabled, boolean isDisabled, C39174f fixedHeightInSizeDp, String sectionTitle) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        return new C31909d(id4, title, subtitle, leftIcon, leftImage, shouldTintLeftImage, selectionStyle, selected, showCheckbox, actionArgument, deselectArgument, selectionDisabled, isDisabled, fixedHeightInSizeDp, sectionTitle, null);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Object getActionArgument() {
        return this.actionArgument;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Object getDeselectArgument() {
        return this.deselectArgument;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C31909d)) {
            return false;
        }
        C31909d c31909d = (C31909d) other;
        return AbstractC22676k.m65745e(this.id, c31909d.id) && AbstractC22676k.m65745e(this.title, c31909d.title) && AbstractC22676k.m65745e(this.subtitle, c31909d.subtitle) && this.leftIcon == c31909d.leftIcon && AbstractC22676k.m65745e(this.leftImage, c31909d.leftImage) && this.shouldTintLeftImage == c31909d.shouldTintLeftImage && this.selectionStyle == c31909d.selectionStyle && this.selected == c31909d.selected && this.showCheckbox == c31909d.showCheckbox && AbstractC22676k.m65745e(this.actionArgument, c31909d.actionArgument) && AbstractC22676k.m65745e(this.deselectArgument, c31909d.deselectArgument) && this.selectionDisabled == c31909d.selectionDisabled && this.isDisabled == c31909d.isDisabled && AbstractC22676k.m65745e(this.fixedHeightInSizeDp, c31909d.fixedHeightInSizeDp) && AbstractC22676k.m65745e(this.sectionTitle, c31909d.sectionTitle);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C39174f getFixedHeightInSizeDp() {
        return this.fixedHeightInSizeDp;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final EnumC16313m0 getLeftIcon() {
        return this.leftIcon;
    }

    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final AbstractC22403o getLeftImage() {
        return this.leftImage;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.title);
        String str = this.subtitle;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        EnumC16313m0 enumC16313m0 = this.leftIcon;
        int iHashCode2 = (iHashCode + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31;
        AbstractC22403o abstractC22403o = this.leftImage;
        int iM8289b = AbstractC2875y.m8289b((iHashCode2 + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31, 31, this.shouldTintLeftImage);
        EnumC31908c enumC31908c = this.selectionStyle;
        int iM8289b2 = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM8289b + (enumC31908c == null ? 0 : enumC31908c.hashCode())) * 31, 31, this.selected), 31, this.showCheckbox);
        Object obj = this.actionArgument;
        int iHashCode3 = (iM8289b2 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.deselectArgument;
        int iM8289b3 = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31, 31, this.selectionDisabled), 31, this.isDisabled);
        C39174f c39174f = this.fixedHeightInSizeDp;
        int iHashCode4 = (iM8289b3 + (c39174f == null ? 0 : Float.hashCode(c39174f.f168413w))) * 31;
        String str2 = this.sectionTitle;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getSectionTitle() {
        return this.sectionTitle;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getSelectionDisabled() {
        return this.selectionDisabled;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final EnumC31908c getSelectionStyle() {
        return this.selectionStyle;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getShouldTintLeftImage() {
        return this.shouldTintLeftImage;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getShowCheckbox() {
        return this.showCheckbox;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getIsDisabled() {
        return this.isDisabled;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.subtitle;
        EnumC16313m0 enumC16313m0 = this.leftIcon;
        AbstractC22403o abstractC22403o = this.leftImage;
        boolean z4 = this.shouldTintLeftImage;
        EnumC31908c enumC31908c = this.selectionStyle;
        boolean z13 = this.selected;
        boolean z14 = this.showCheckbox;
        Object obj = this.actionArgument;
        Object obj2 = this.deselectArgument;
        boolean z15 = this.selectionDisabled;
        boolean z16 = this.isDisabled;
        C39174f c39174f = this.fixedHeightInSizeDp;
        String str4 = this.sectionTitle;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SelectableCellState(id=", str, ", title=", str2, ", subtitle=");
        sbM32001t.append(str3);
        sbM32001t.append(", leftIcon=");
        sbM32001t.append(enumC16313m0);
        sbM32001t.append(", leftImage=");
        sbM32001t.append(abstractC22403o);
        sbM32001t.append(", shouldTintLeftImage=");
        sbM32001t.append(z4);
        sbM32001t.append(", selectionStyle=");
        sbM32001t.append(enumC31908c);
        sbM32001t.append(", selected=");
        sbM32001t.append(z13);
        sbM32001t.append(", showCheckbox=");
        sbM32001t.append(z14);
        sbM32001t.append(", actionArgument=");
        sbM32001t.append(obj);
        sbM32001t.append(", deselectArgument=");
        sbM32001t.append(obj2);
        sbM32001t.append(", selectionDisabled=");
        sbM32001t.append(z15);
        sbM32001t.append(", isDisabled=");
        sbM32001t.append(z16);
        sbM32001t.append(", fixedHeightInSizeDp=");
        sbM32001t.append(c39174f);
        sbM32001t.append(", sectionTitle=");
        return AbstractC25012a.m73376i(str4, ")", sbM32001t);
    }

    private C31909d(String id4, String title, String str, EnumC16313m0 enumC16313m0, AbstractC22403o abstractC22403o, boolean z4, EnumC31908c enumC31908c, boolean z13, boolean z14, Object obj, Object obj2, boolean z15, boolean z16, C39174f c39174f, String str2) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        this.id = id4;
        this.title = title;
        this.subtitle = str;
        this.leftIcon = enumC16313m0;
        this.leftImage = abstractC22403o;
        this.shouldTintLeftImage = z4;
        this.selectionStyle = enumC31908c;
        this.selected = z13;
        this.showCheckbox = z14;
        this.actionArgument = obj;
        this.deselectArgument = obj2;
        this.selectionDisabled = z15;
        this.isDisabled = z16;
        this.fixedHeightInSizeDp = c39174f;
        this.sectionTitle = str2;
    }

    public /* synthetic */ C31909d(String str, String str2, String str3, EnumC16313m0 enumC16313m0, AbstractC22403o abstractC22403o, boolean z4, EnumC31908c enumC31908c, boolean z13, boolean z14, Object obj, Object obj2, boolean z15, boolean z16, C39174f c39174f, String str4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : enumC16313m0, (i13 & 16) != 0 ? null : abstractC22403o, (i13 & 32) != 0 ? false : z4, (i13 & 64) != 0 ? EnumC31908c.DEFAULT : enumC31908c, (i13 & 128) != 0 ? false : z13, (i13 & 256) != 0 ? false : z14, (i13 & 512) != 0 ? null : obj, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : obj2, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? false : z15, (i13 & 4096) != 0 ? false : z16, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : c39174f, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : str4, null);
    }
}
