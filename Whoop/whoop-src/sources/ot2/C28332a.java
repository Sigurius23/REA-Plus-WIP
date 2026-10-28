package ot2;

import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import km0.C22581e;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p730qt2.C30596c0;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: ot2.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b)\u0010#R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010!\u001a\u0004\b*\u0010#R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b'\u0010+\u001a\u0004\b.\u0010-R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b%\u0010/\u001a\u0004\b \u00100R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b&\u0010#R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b(\u00103R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b)\u00104\u001a\u0004\b1\u00105R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b,\u00106\u001a\u0004\b$\u00107¨\u00068"}, m65681d2 = {"Lot2/a;", "", "Lcom/whoop/design/util/TextResource;", "titleDisplay", "title", "subtitle", "topHeadingDisplay", "", "Lm91/u;", "topItemStates", "headingDisplay", "itemStates", "Lot2/b;", "addButtonInfo", "continueButtonDisplay", "", "enableContinueButton", "Lqt2/c0;", "tooltip", "Lkm0/e;", "bottomSheet", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lot2/b;Lcom/whoop/design/util/TextResource;ZLqt2/c0;Lkm0/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "i", "()Lcom/whoop/design/util/TextResource;", "b", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "c", "g", "d", "k", "e", "Ljava/util/List;", "l", "()Ljava/util/List;", "f", "Lot2/b;", "()Lot2/b;", "j", "Z", "()Z", "Lqt2/c0;", "()Lqt2/c0;", "Lkm0/e;", "()Lkm0/e;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C28332a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource titleDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource topHeadingDisplay;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<InterfaceC25312u> topItemStates;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextResource headingDisplay;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final List<InterfaceC25312u> itemStates;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C28333b addButtonInfo;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final TextResource continueButtonDisplay;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final boolean enableContinueButton;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C30596c0 tooltip;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final C22581e bottomSheet;

    /* JADX WARN: Multi-variable type inference failed */
    public C28332a(TextResource titleDisplay, TextResource title, TextResource subtitle, TextResource topHeadingDisplay, List<? extends InterfaceC25312u> topItemStates, TextResource headingDisplay, List<? extends InterfaceC25312u> itemStates, C28333b addButtonInfo, TextResource continueButtonDisplay, boolean z4, C30596c0 c30596c0, C22581e bottomSheet) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(topHeadingDisplay, "topHeadingDisplay");
        AbstractC22676k.m65750j(topItemStates, "topItemStates");
        AbstractC22676k.m65750j(headingDisplay, "headingDisplay");
        AbstractC22676k.m65750j(itemStates, "itemStates");
        AbstractC22676k.m65750j(addButtonInfo, "addButtonInfo");
        AbstractC22676k.m65750j(continueButtonDisplay, "continueButtonDisplay");
        AbstractC22676k.m65750j(bottomSheet, "bottomSheet");
        this.titleDisplay = titleDisplay;
        this.title = title;
        this.subtitle = subtitle;
        this.topHeadingDisplay = topHeadingDisplay;
        this.topItemStates = topItemStates;
        this.headingDisplay = headingDisplay;
        this.itemStates = itemStates;
        this.addButtonInfo = addButtonInfo;
        this.continueButtonDisplay = continueButtonDisplay;
        this.enableContinueButton = z4;
        this.tooltip = c30596c0;
        this.bottomSheet = bottomSheet;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C28333b getAddButtonInfo() {
        return this.addButtonInfo;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C22581e getBottomSheet() {
        return this.bottomSheet;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getContinueButtonDisplay() {
        return this.continueButtonDisplay;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getEnableContinueButton() {
        return this.enableContinueButton;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getHeadingDisplay() {
        return this.headingDisplay;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C28332a)) {
            return false;
        }
        C28332a c28332a = (C28332a) other;
        return AbstractC22676k.m65745e(this.titleDisplay, c28332a.titleDisplay) && AbstractC22676k.m65745e(this.title, c28332a.title) && AbstractC22676k.m65745e(this.subtitle, c28332a.subtitle) && AbstractC22676k.m65745e(this.topHeadingDisplay, c28332a.topHeadingDisplay) && AbstractC22676k.m65745e(this.topItemStates, c28332a.topItemStates) && AbstractC22676k.m65745e(this.headingDisplay, c28332a.headingDisplay) && AbstractC22676k.m65745e(this.itemStates, c28332a.itemStates) && AbstractC22676k.m65745e(this.addButtonInfo, c28332a.addButtonInfo) && AbstractC22676k.m65745e(this.continueButtonDisplay, c28332a.continueButtonDisplay) && this.enableContinueButton == c28332a.enableContinueButton && AbstractC22676k.m65745e(this.tooltip, c28332a.tooltip) && AbstractC22676k.m65745e(this.bottomSheet, c28332a.bottomSheet);
    }

    /* JADX INFO: renamed from: f */
    public final List<InterfaceC25312u> m85867f() {
        return this.itemStates;
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
        int iM8289b = AbstractC2875y.m8289b(AbstractC31061c.m95625a((this.addButtonInfo.hashCode() + AbstractC11895b.m31983b(AbstractC31061c.m95625a(AbstractC11895b.m31983b(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.titleDisplay.hashCode() * 31, this.title, 31), this.subtitle, 31), this.topHeadingDisplay, 31), 31, this.topItemStates), this.headingDisplay, 31), 31, this.itemStates)) * 31, this.continueButtonDisplay, 31), 31, this.enableContinueButton);
        C30596c0 c30596c0 = this.tooltip;
        return this.bottomSheet.hashCode() + ((iM8289b + (c30596c0 == null ? 0 : c30596c0.hashCode())) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextResource getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final C30596c0 getTooltip() {
        return this.tooltip;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final TextResource getTopHeadingDisplay() {
        return this.topHeadingDisplay;
    }

    /* JADX INFO: renamed from: l */
    public final List<InterfaceC25312u> m85873l() {
        return this.topItemStates;
    }

    public String toString() {
        TextResource textResource = this.titleDisplay;
        TextResource textResource2 = this.title;
        TextResource textResource3 = this.subtitle;
        TextResource textResource4 = this.topHeadingDisplay;
        List<InterfaceC25312u> list = this.topItemStates;
        TextResource textResource5 = this.headingDisplay;
        List<InterfaceC25312u> list2 = this.itemStates;
        C28333b c28333b = this.addButtonInfo;
        TextResource textResource6 = this.continueButtonDisplay;
        boolean z4 = this.enableContinueButton;
        C30596c0 c30596c0 = this.tooltip;
        C22581e c22581e = this.bottomSheet;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("ActivitiesScreenState(titleDisplay=", textResource, ", title=", textResource2, ", subtitle=");
        AbstractC30007c.m91855y(sbM106658q, textResource3, ", topHeadingDisplay=", textResource4, ", topItemStates=");
        AbstractC30007c.m91852v(textResource5, ", headingDisplay=", ", itemStates=", sbM106658q, list);
        sbM106658q.append(list2);
        sbM106658q.append(", addButtonInfo=");
        sbM106658q.append(c28333b);
        sbM106658q.append(", continueButtonDisplay=");
        AbstractC33745d.m106664w(textResource6, ", enableContinueButton=", ", tooltip=", sbM106658q, z4);
        sbM106658q.append(c30596c0);
        sbM106658q.append(", bottomSheet=");
        sbM106658q.append(c22581e);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
