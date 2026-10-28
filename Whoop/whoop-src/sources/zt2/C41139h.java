package zt2;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import hy0.EnumC17740f;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import kd1.AbstractC22403o;
import no.nordicsemi.android.dfu.DfuBaseService;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import y00.AbstractC38963t7;
import y71.C39274g;

/* JADX INFO: renamed from: zt2.h */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J¨\u0001\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00102\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b+\u0010*R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b2\u00104R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\f8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b7\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b0\u0010<\u001a\u0004\b5\u0010=R\u0017\u0010\u0012\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b>\u0010<\u001a\u0004\b?\u0010=R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b.\u0010*R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b)\u0010(\u001a\u0004\b>\u0010*R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b%\u0010@\u001a\u0004\bA\u0010\u001c¨\u0006B"}, m65681d2 = {"Lzt2/h;", "Lm91/u;", "Lkd1/o;", "titleImage", "Lcom/whoop/design/util/TextResource;", "title", "subTitle", "actionText", "Ly71/g;", "icon", "Lcom/whoop/navigation/e;", "destination", "", "goalCards", "Lhy0/f;", "titleStyle", "", "displayHeaderDivider", "useHeaderDividerV2", "callout", "linkText", "", "id", "<init>", "(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly71/g;Lcom/whoop/navigation/e;Ljava/util/List;Lhy0/f;ZZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V", "a", "(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly71/g;Lcom/whoop/navigation/e;Ljava/util/List;Lhy0/f;ZZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Lzt2/h;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lkd1/o;", "m", "()Lkd1/o;", "b", "Lcom/whoop/design/util/TextResource;", "l", "()Lcom/whoop/design/util/TextResource;", "c", "k", "d", "e", "Ly71/g;", "i", "()Ly71/g;", "f", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "g", "Ljava/util/List;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Ljava/util/List;", "Lhy0/f;", "n", "()Lhy0/f;", "Z", "()Z", "j", "o", "Ljava/lang/String;", "getId", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C41139h implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC22403o titleImage;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource subTitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource actionText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C39274g icon;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C9598e destination;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final List<InterfaceC25312u> goalCards;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final EnumC17740f titleStyle;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean displayHeaderDivider;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final boolean useHeaderDividerV2;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final TextResource callout;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final TextResource linkText;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final String id;

    /* JADX WARN: Multi-variable type inference failed */
    public C41139h(AbstractC22403o abstractC22403o, TextResource title, TextResource textResource, TextResource textResource2, C39274g c39274g, C9598e c9598e, List<? extends InterfaceC25312u> goalCards, EnumC17740f titleStyle, boolean z4, boolean z13, TextResource textResource3, TextResource textResource4, String str) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(goalCards, "goalCards");
        AbstractC22676k.m65750j(titleStyle, "titleStyle");
        this.titleImage = abstractC22403o;
        this.title = title;
        this.subTitle = textResource;
        this.actionText = textResource2;
        this.icon = c39274g;
        this.destination = c9598e;
        this.goalCards = goalCards;
        this.titleStyle = titleStyle;
        this.displayHeaderDivider = z4;
        this.useHeaderDividerV2 = z13;
        this.callout = textResource3;
        this.linkText = textResource4;
        this.id = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C41139h m133575b(C41139h c41139h, AbstractC22403o abstractC22403o, TextResource textResource, TextResource textResource2, TextResource textResource3, C39274g c39274g, C9598e c9598e, List list, EnumC17740f enumC17740f, boolean z4, boolean z13, TextResource textResource4, TextResource textResource5, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            abstractC22403o = c41139h.titleImage;
        }
        return c41139h.m133576a(abstractC22403o, (i13 & 2) != 0 ? c41139h.title : textResource, (i13 & 4) != 0 ? c41139h.subTitle : textResource2, (i13 & 8) != 0 ? c41139h.actionText : textResource3, (i13 & 16) != 0 ? c41139h.icon : c39274g, (i13 & 32) != 0 ? c41139h.destination : c9598e, (i13 & 64) != 0 ? c41139h.goalCards : list, (i13 & 128) != 0 ? c41139h.titleStyle : enumC17740f, (i13 & 256) != 0 ? c41139h.displayHeaderDivider : z4, (i13 & 512) != 0 ? c41139h.useHeaderDividerV2 : z13, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c41139h.callout : textResource4, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c41139h.linkText : textResource5, (i13 & 4096) != 0 ? c41139h.id : str);
    }

    /* JADX INFO: renamed from: a */
    public final C41139h m133576a(AbstractC22403o titleImage, TextResource title, TextResource subTitle, TextResource actionText, C39274g icon, C9598e destination, List<? extends InterfaceC25312u> goalCards, EnumC17740f titleStyle, boolean displayHeaderDivider, boolean useHeaderDividerV2, TextResource callout, TextResource linkText, String id4) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(goalCards, "goalCards");
        AbstractC22676k.m65750j(titleStyle, "titleStyle");
        return new C41139h(titleImage, title, subTitle, actionText, icon, destination, goalCards, titleStyle, displayHeaderDivider, useHeaderDividerV2, callout, linkText, id4);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getActionText() {
        return this.actionText;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getCallout() {
        return this.callout;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C41139h)) {
            return false;
        }
        C41139h c41139h = (C41139h) other;
        return AbstractC22676k.m65745e(this.titleImage, c41139h.titleImage) && AbstractC22676k.m65745e(this.title, c41139h.title) && AbstractC22676k.m65745e(this.subTitle, c41139h.subTitle) && AbstractC22676k.m65745e(this.actionText, c41139h.actionText) && AbstractC22676k.m65745e(this.icon, c41139h.icon) && AbstractC22676k.m65745e(this.destination, c41139h.destination) && AbstractC22676k.m65745e(this.goalCards, c41139h.goalCards) && this.titleStyle == c41139h.titleStyle && this.displayHeaderDivider == c41139h.displayHeaderDivider && this.useHeaderDividerV2 == c41139h.useHeaderDividerV2 && AbstractC22676k.m65745e(this.callout, c41139h.callout) && AbstractC22676k.m65745e(this.linkText, c41139h.linkText) && AbstractC22676k.m65745e(this.id, c41139h.id);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getDisplayHeaderDivider() {
        return this.displayHeaderDivider;
    }

    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: h */
    public final List<InterfaceC25312u> m133581h() {
        return this.goalCards;
    }

    public int hashCode() {
        AbstractC22403o abstractC22403o = this.titleImage;
        int iM95625a = AbstractC31061c.m95625a((abstractC22403o == null ? 0 : abstractC22403o.hashCode()) * 31, this.title, 31);
        TextResource textResource = this.subTitle;
        int iHashCode = (iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31;
        TextResource textResource2 = this.actionText;
        int iHashCode2 = (iHashCode + (textResource2 == null ? 0 : textResource2.hashCode())) * 31;
        C39274g c39274g = this.icon;
        int iHashCode3 = (iHashCode2 + (c39274g == null ? 0 : c39274g.hashCode())) * 31;
        C9598e c9598e = this.destination;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((this.titleStyle.hashCode() + AbstractC11895b.m31983b((iHashCode3 + (c9598e == null ? 0 : c9598e.hashCode())) * 31, 31, this.goalCards)) * 31, 31, this.displayHeaderDivider), 31, this.useHeaderDividerV2);
        TextResource textResource3 = this.callout;
        int iHashCode4 = (iM8289b + (textResource3 == null ? 0 : textResource3.hashCode())) * 31;
        TextResource textResource4 = this.linkText;
        int iHashCode5 = (iHashCode4 + (textResource4 == null ? 0 : textResource4.hashCode())) * 31;
        String str = this.id;
        return iHashCode5 + (str != null ? str.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final C39274g getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final TextResource getLinkText() {
        return this.linkText;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final TextResource getSubTitle() {
        return this.subTitle;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final AbstractC22403o getTitleImage() {
        return this.titleImage;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final EnumC17740f getTitleStyle() {
        return this.titleStyle;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getUseHeaderDividerV2() {
        return this.useHeaderDividerV2;
    }

    public String toString() {
        AbstractC22403o abstractC22403o = this.titleImage;
        TextResource textResource = this.title;
        TextResource textResource2 = this.subTitle;
        TextResource textResource3 = this.actionText;
        C39274g c39274g = this.icon;
        C9598e c9598e = this.destination;
        List<InterfaceC25312u> list = this.goalCards;
        EnumC17740f enumC17740f = this.titleStyle;
        boolean z4 = this.displayHeaderDivider;
        boolean z13 = this.useHeaderDividerV2;
        TextResource textResource4 = this.callout;
        TextResource textResource5 = this.linkText;
        String str = this.id;
        StringBuilder sbM114683k = AbstractC36095b.m114683k("GoalSectionItemState(titleImage=", textResource, abstractC22403o, ", title=", ", subTitle=");
        AbstractC30007c.m91855y(sbM114683k, textResource2, ", actionText=", textResource3, ", icon=");
        sbM114683k.append(c39274g);
        sbM114683k.append(", destination=");
        sbM114683k.append(c9598e);
        sbM114683k.append(", goalCards=");
        sbM114683k.append(list);
        sbM114683k.append(", titleStyle=");
        sbM114683k.append(enumC17740f);
        sbM114683k.append(", displayHeaderDivider=");
        AbstractC38963t7.m124392v(sbM114683k, z4, ", useHeaderDividerV2=", z13, ", callout=");
        AbstractC30007c.m91855y(sbM114683k, textResource4, ", linkText=", textResource5, ", id=");
        return AbstractC25012a.m73376i(str, ")", sbM114683k);
    }
}
