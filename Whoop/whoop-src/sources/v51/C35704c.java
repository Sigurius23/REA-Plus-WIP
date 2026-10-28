package v51;

import b91.EnumC2888c;
import c13.AbstractC3855a;
import com.whoop.design.atomic.organism.expandablecontent.ExpandableContentHeaderPosition;
import com.whoop.design.atomic.organism.expandablecontent.ExpandableContentLayout;
import hy0.C17750h1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p208i2.C17919x;
import p392p3.C28780r;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: v51.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ¤\u0001\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u0017HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010&\u001a\u0004\b'\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b)\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b>\u00107\u001a\u0004\b:\u00109R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b?\u0010/\u001a\u0004\b*\u00101R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b<\u0010@\u001a\u0004\b2\u0010AR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b)\u0010B\u001a\u0004\b>\u0010CR\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b0\u0010D\u001a\u0004\b6\u0010ER\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00178\u0006¢\u0006\f\n\u0004\b4\u0010F\u001a\u0004\b?\u0010G¨\u0006H"}, m65681d2 = {"Lv51/c;", "Lm91/u;", "", "id", "title", "Lb91/c;", "titleTypography", "Li2/x;", "titleColor", "Lp3/r;", "titleFontWeight", "", "uppercaseTitle", "Lhy0/h1;", "tagState", "initiallyExpanded", "backgroundColorExpanded", "Ly3/f;", "expandedBottomPadding", "Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;", "itemLayout", "Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;", "headerPosition", "", "items", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lb91/c;Li2/x;Lp3/r;ZLhy0/h1;ZLi2/x;Ly3/f;Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Lb91/c;Li2/x;Lp3/r;ZLhy0/h1;ZLi2/x;Ly3/f;Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;Ljava/util/List;)Lv51/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "b", "k", "c", "Lb91/c;", "n", "()Lb91/c;", "d", "Li2/x;", "l", "()Li2/x;", "e", "Lp3/r;", "m", "()Lp3/r;", "f", "Z", "o", "()Z", "g", "Lhy0/h1;", "j", "()Lhy0/h1;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "Ly3/f;", "()Ly3/f;", "Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;", "()Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;", "Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;", "()Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;", "Ljava/util/List;", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35704c implements InterfaceC25312u {

    /* JADX INFO: renamed from: n */
    public static final int f151903n = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC2888c titleTypography;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C17919x titleColor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C28780r titleFontWeight;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean uppercaseTitle;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C17750h1 tagState;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean initiallyExpanded;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C17919x backgroundColorExpanded;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C39174f expandedBottomPadding;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final ExpandableContentLayout itemLayout;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final ExpandableContentHeaderPosition headerPosition;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final List<InterfaceC25312u> items;

    public /* synthetic */ C35704c(String str, String str2, EnumC2888c enumC2888c, C17919x c17919x, C28780r c28780r, boolean z4, C17750h1 c17750h1, boolean z13, C17919x c17919x2, C39174f c39174f, ExpandableContentLayout expandableContentLayout, ExpandableContentHeaderPosition expandableContentHeaderPosition, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, enumC2888c, c17919x, c28780r, z4, c17750h1, z13, c17919x2, c39174f, expandableContentLayout, expandableContentHeaderPosition, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C35704c m113165b(C35704c c35704c, String str, String str2, EnumC2888c enumC2888c, C17919x c17919x, C28780r c28780r, boolean z4, C17750h1 c17750h1, boolean z13, C17919x c17919x2, C39174f c39174f, ExpandableContentLayout expandableContentLayout, ExpandableContentHeaderPosition expandableContentHeaderPosition, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c35704c.id;
        }
        return c35704c.m113166a(str, (i13 & 2) != 0 ? c35704c.title : str2, (i13 & 4) != 0 ? c35704c.titleTypography : enumC2888c, (i13 & 8) != 0 ? c35704c.titleColor : c17919x, (i13 & 16) != 0 ? c35704c.titleFontWeight : c28780r, (i13 & 32) != 0 ? c35704c.uppercaseTitle : z4, (i13 & 64) != 0 ? c35704c.tagState : c17750h1, (i13 & 128) != 0 ? c35704c.initiallyExpanded : z13, (i13 & 256) != 0 ? c35704c.backgroundColorExpanded : c17919x2, (i13 & 512) != 0 ? c35704c.expandedBottomPadding : c39174f, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c35704c.itemLayout : expandableContentLayout, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c35704c.headerPosition : expandableContentHeaderPosition, (i13 & 4096) != 0 ? c35704c.items : list);
    }

    /* JADX INFO: renamed from: a */
    public final C35704c m113166a(String id4, String title, EnumC2888c titleTypography, C17919x titleColor, C28780r titleFontWeight, boolean uppercaseTitle, C17750h1 tagState, boolean initiallyExpanded, C17919x backgroundColorExpanded, C39174f expandedBottomPadding, ExpandableContentLayout itemLayout, ExpandableContentHeaderPosition headerPosition, List<? extends InterfaceC25312u> items) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(titleTypography, "titleTypography");
        AbstractC22676k.m65750j(itemLayout, "itemLayout");
        AbstractC22676k.m65750j(headerPosition, "headerPosition");
        AbstractC22676k.m65750j(items, "items");
        return new C35704c(id4, title, titleTypography, titleColor, titleFontWeight, uppercaseTitle, tagState, initiallyExpanded, backgroundColorExpanded, expandedBottomPadding, itemLayout, headerPosition, items, null);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C17919x getBackgroundColorExpanded() {
        return this.backgroundColorExpanded;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C39174f getExpandedBottomPadding() {
        return this.expandedBottomPadding;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35704c)) {
            return false;
        }
        C35704c c35704c = (C35704c) other;
        return AbstractC22676k.m65745e(this.id, c35704c.id) && AbstractC22676k.m65745e(this.title, c35704c.title) && this.titleTypography == c35704c.titleTypography && AbstractC22676k.m65745e(this.titleColor, c35704c.titleColor) && AbstractC22676k.m65745e(this.titleFontWeight, c35704c.titleFontWeight) && this.uppercaseTitle == c35704c.uppercaseTitle && AbstractC22676k.m65745e(this.tagState, c35704c.tagState) && this.initiallyExpanded == c35704c.initiallyExpanded && AbstractC22676k.m65745e(this.backgroundColorExpanded, c35704c.backgroundColorExpanded) && AbstractC22676k.m65745e(this.expandedBottomPadding, c35704c.expandedBottomPadding) && this.itemLayout == c35704c.itemLayout && this.headerPosition == c35704c.headerPosition && AbstractC22676k.m65745e(this.items, c35704c.items);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final ExpandableContentHeaderPosition getHeaderPosition() {
        return this.headerPosition;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getInitiallyExpanded() {
        return this.initiallyExpanded;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final ExpandableContentLayout getItemLayout() {
        return this.itemLayout;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (this.titleTypography.hashCode() + AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.title)) * 31;
        C17919x c17919x = this.titleColor;
        int iHashCode2 = (iHashCode + (c17919x == null ? 0 : Long.hashCode(c17919x.f69639a))) * 31;
        C28780r c28780r = this.titleFontWeight;
        int iM8289b = AbstractC2875y.m8289b((iHashCode2 + (c28780r == null ? 0 : c28780r.f116547w)) * 31, 31, this.uppercaseTitle);
        C17750h1 c17750h1 = this.tagState;
        int iM8289b2 = AbstractC2875y.m8289b((iM8289b + (c17750h1 == null ? 0 : c17750h1.hashCode())) * 31, 31, this.initiallyExpanded);
        C17919x c17919x2 = this.backgroundColorExpanded;
        int iHashCode3 = (iM8289b2 + (c17919x2 == null ? 0 : Long.hashCode(c17919x2.f69639a))) * 31;
        C39174f c39174f = this.expandedBottomPadding;
        return this.items.hashCode() + ((this.headerPosition.hashCode() + ((this.itemLayout.hashCode() + ((iHashCode3 + (c39174f != null ? Float.hashCode(c39174f.f168413w) : 0)) * 31)) * 31)) * 31);
    }

    /* JADX INFO: renamed from: i */
    public final List<InterfaceC25312u> m113172i() {
        return this.items;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final C17750h1 getTagState() {
        return this.tagState;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final C17919x getTitleColor() {
        return this.titleColor;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final C28780r getTitleFontWeight() {
        return this.titleFontWeight;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final EnumC2888c getTitleTypography() {
        return this.titleTypography;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getUppercaseTitle() {
        return this.uppercaseTitle;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        EnumC2888c enumC2888c = this.titleTypography;
        C17919x c17919x = this.titleColor;
        C28780r c28780r = this.titleFontWeight;
        boolean z4 = this.uppercaseTitle;
        C17750h1 c17750h1 = this.tagState;
        boolean z13 = this.initiallyExpanded;
        C17919x c17919x2 = this.backgroundColorExpanded;
        C39174f c39174f = this.expandedBottomPadding;
        ExpandableContentLayout expandableContentLayout = this.itemLayout;
        ExpandableContentHeaderPosition expandableContentHeaderPosition = this.headerPosition;
        List<InterfaceC25312u> list = this.items;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ExpandableContentViewState(id=", str, ", title=", str2, ", titleTypography=");
        sbM32001t.append(enumC2888c);
        sbM32001t.append(", titleColor=");
        sbM32001t.append(c17919x);
        sbM32001t.append(", titleFontWeight=");
        sbM32001t.append(c28780r);
        sbM32001t.append(", uppercaseTitle=");
        sbM32001t.append(z4);
        sbM32001t.append(", tagState=");
        sbM32001t.append(c17750h1);
        sbM32001t.append(", initiallyExpanded=");
        sbM32001t.append(z13);
        sbM32001t.append(", backgroundColorExpanded=");
        sbM32001t.append(c17919x2);
        sbM32001t.append(", expandedBottomPadding=");
        sbM32001t.append(c39174f);
        sbM32001t.append(", itemLayout=");
        sbM32001t.append(expandableContentLayout);
        sbM32001t.append(", headerPosition=");
        sbM32001t.append(expandableContentHeaderPosition);
        sbM32001t.append(", items=");
        return AbstractC3855a.m11829m(sbM32001t, list, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C35704c(String str, String title, EnumC2888c titleTypography, C17919x c17919x, C28780r c28780r, boolean z4, C17750h1 c17750h1, boolean z13, C17919x c17919x2, C39174f c39174f, ExpandableContentLayout itemLayout, ExpandableContentHeaderPosition headerPosition, List<? extends InterfaceC25312u> items) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(titleTypography, "titleTypography");
        AbstractC22676k.m65750j(itemLayout, "itemLayout");
        AbstractC22676k.m65750j(headerPosition, "headerPosition");
        AbstractC22676k.m65750j(items, "items");
        this.id = str;
        this.title = title;
        this.titleTypography = titleTypography;
        this.titleColor = c17919x;
        this.titleFontWeight = c28780r;
        this.uppercaseTitle = z4;
        this.tagState = c17750h1;
        this.initiallyExpanded = z13;
        this.backgroundColorExpanded = c17919x2;
        this.expandedBottomPadding = c39174f;
        this.itemLayout = itemLayout;
        this.headerPosition = headerPosition;
        this.items = items;
    }

    public /* synthetic */ C35704c(String str, String str2, EnumC2888c enumC2888c, C17919x c17919x, C28780r c28780r, boolean z4, C17750h1 c17750h1, boolean z13, C17919x c17919x2, C39174f c39174f, ExpandableContentLayout expandableContentLayout, ExpandableContentHeaderPosition expandableContentHeaderPosition, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, str2, (i13 & 4) != 0 ? EnumC2888c.SH4 : enumC2888c, (i13 & 8) != 0 ? null : c17919x, (i13 & 16) != 0 ? null : c28780r, (i13 & 32) != 0 ? false : z4, (i13 & 64) != 0 ? null : c17750h1, (i13 & 128) != 0 ? true : z13, (i13 & 256) != 0 ? null : c17919x2, (i13 & 512) != 0 ? null : c39174f, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? ExpandableContentLayout.VERTICAL : expandableContentLayout, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? ExpandableContentHeaderPosition.TOP : expandableContentHeaderPosition, list, null);
    }
}
