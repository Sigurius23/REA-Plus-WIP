package np1;

import com.whoop.design.util.TextResource;
import hc3.AbstractC17176i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j71.C21395c;
import java.util.List;
import jh3.AbstractC21702c;
import m81.C25232g;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p745y81.InterfaceC39332e;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import s01.C32048d;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: np1.g */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b(\b\u0087\b\u0018\u00002\u00020\u0001B±\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u000e\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b4\u0010:\u001a\u0004\b6\u0010;R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b2\u0010BR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bC\u0010,\u001a\u0004\bD\u0010#R\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b8\u0010A\u001a\u0004\bE\u0010BR\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\bF\u0010#R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b-\u0010G\u001a\u0004\bC\u0010HR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\bF\u0010I\u001a\u0004\bJ\u0010KR\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u000e8\u0006¢\u0006\f\n\u0004\bE\u0010A\u001a\u0004\b+\u0010BR\u001f\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bD\u0010A\u001a\u0004\b@\u0010BR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b>\u0010L\u001a\u0004\b.\u0010MR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\bJ\u0010N\u001a\u0004\b<\u0010O¨\u0006P"}, m65681d2 = {"Lnp1/g;", "", "", "pregnancyId", "Lcom/whoop/design/util/TextResource;", "navigationTitle", "Lnp1/c;", "datePicker", "Lnp1/e;", "header", "Lnp1/b;", "congratulationsHeader", "Ly81/e;", "style", "", "Lm81/g;", "buttons", "selectedButtonId", "Lnp1/k;", "segmentedControlDisplays", "segmentedControlDisplayId", "Lj71/c;", "graphState", "Ls01/d;", "vowState", "Lm91/u;", "belowGraphContent", "graphLegends", "Lnp1/a;", "bottomSheet", "Lnp1/d;", "deletePregnancyDialogState", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lnp1/c;Lnp1/e;Lnp1/b;Ly81/e;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lj71/c;Ls01/d;Ljava/util/List;Ljava/util/List;Lnp1/a;Lnp1/d;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "k", "b", "Lcom/whoop/design/util/TextResource;", "j", "()Lcom/whoop/design/util/TextResource;", "c", "Lnp1/c;", "e", "()Lnp1/c;", "d", "Lnp1/e;", "i", "()Lnp1/e;", "Lnp1/b;", "()Lnp1/b;", "f", "Ly81/e;", "o", "()Ly81/e;", "g", "Ljava/util/List;", "()Ljava/util/List;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "n", "m", "l", "Lj71/c;", "()Lj71/c;", "Ls01/d;", "p", "()Ls01/d;", "Lnp1/a;", "()Lnp1/a;", "Lnp1/d;", "()Lnp1/d;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C27029g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String pregnancyId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource navigationTitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C27025c datePicker;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C27027e header;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C27024b congratulationsHeader;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC39332e style;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final List<C25232g> buttons;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String selectedButtonId;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final List<C27033k> segmentedControlDisplays;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final String segmentedControlDisplayId;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C21395c graphState;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final C32048d vowState;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final List<InterfaceC25312u> belowGraphContent;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final List<TextResource> graphLegends;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final C27023a bottomSheet;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final C27026d deletePregnancyDialogState;

    /* JADX WARN: Multi-variable type inference failed */
    public C27029g(String pregnancyId, TextResource navigationTitle, C27025c c27025c, C27027e c27027e, C27024b c27024b, InterfaceC39332e style, List<C25232g> buttons, String selectedButtonId, List<C27033k> list, String segmentedControlDisplayId, C21395c c21395c, C32048d c32048d, List<? extends InterfaceC25312u> belowGraphContent, List<? extends TextResource> list2, C27023a c27023a, C27026d c27026d) {
        AbstractC22676k.m65750j(pregnancyId, "pregnancyId");
        AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(buttons, "buttons");
        AbstractC22676k.m65750j(selectedButtonId, "selectedButtonId");
        AbstractC22676k.m65750j(segmentedControlDisplayId, "segmentedControlDisplayId");
        AbstractC22676k.m65750j(belowGraphContent, "belowGraphContent");
        this.pregnancyId = pregnancyId;
        this.navigationTitle = navigationTitle;
        this.datePicker = c27025c;
        this.header = c27027e;
        this.congratulationsHeader = c27024b;
        this.style = style;
        this.buttons = buttons;
        this.selectedButtonId = selectedButtonId;
        this.segmentedControlDisplays = list;
        this.segmentedControlDisplayId = segmentedControlDisplayId;
        this.graphState = c21395c;
        this.vowState = c32048d;
        this.belowGraphContent = belowGraphContent;
        this.graphLegends = list2;
        this.bottomSheet = c27023a;
        this.deletePregnancyDialogState = c27026d;
    }

    /* JADX INFO: renamed from: a */
    public final List<InterfaceC25312u> m81046a() {
        return this.belowGraphContent;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C27023a getBottomSheet() {
        return this.bottomSheet;
    }

    /* JADX INFO: renamed from: c */
    public final List<C25232g> m81048c() {
        return this.buttons;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C27024b getCongratulationsHeader() {
        return this.congratulationsHeader;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C27025c getDatePicker() {
        return this.datePicker;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C27029g)) {
            return false;
        }
        C27029g c27029g = (C27029g) other;
        return AbstractC22676k.m65745e(this.pregnancyId, c27029g.pregnancyId) && AbstractC22676k.m65745e(this.navigationTitle, c27029g.navigationTitle) && AbstractC22676k.m65745e(this.datePicker, c27029g.datePicker) && AbstractC22676k.m65745e(this.header, c27029g.header) && AbstractC22676k.m65745e(this.congratulationsHeader, c27029g.congratulationsHeader) && AbstractC22676k.m65745e(this.style, c27029g.style) && AbstractC22676k.m65745e(this.buttons, c27029g.buttons) && AbstractC22676k.m65745e(this.selectedButtonId, c27029g.selectedButtonId) && AbstractC22676k.m65745e(this.segmentedControlDisplays, c27029g.segmentedControlDisplays) && AbstractC22676k.m65745e(this.segmentedControlDisplayId, c27029g.segmentedControlDisplayId) && AbstractC22676k.m65745e(this.graphState, c27029g.graphState) && AbstractC22676k.m65745e(this.vowState, c27029g.vowState) && AbstractC22676k.m65745e(this.belowGraphContent, c27029g.belowGraphContent) && AbstractC22676k.m65745e(this.graphLegends, c27029g.graphLegends) && AbstractC22676k.m65745e(this.bottomSheet, c27029g.bottomSheet) && AbstractC22676k.m65745e(this.deletePregnancyDialogState, c27029g.deletePregnancyDialogState);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C27026d getDeletePregnancyDialogState() {
        return this.deletePregnancyDialogState;
    }

    /* JADX INFO: renamed from: g */
    public final List<TextResource> m81052g() {
        return this.graphLegends;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C21395c getGraphState() {
        return this.graphState;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(this.pregnancyId.hashCode() * 31, this.navigationTitle, 31);
        C27025c c27025c = this.datePicker;
        int iHashCode = (iM95625a + (c27025c == null ? 0 : c27025c.hashCode())) * 31;
        C27027e c27027e = this.header;
        int iHashCode2 = (iHashCode + (c27027e == null ? 0 : c27027e.hashCode())) * 31;
        C27024b c27024b = this.congratulationsHeader;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11895b.m31983b(AbstractC33745d.m106648g(this.style, (iHashCode2 + (c27024b == null ? 0 : c27024b.hashCode())) * 31, 31), 31, this.buttons), 31, this.selectedButtonId);
        List<C27033k> list = this.segmentedControlDisplays;
        int iM30450d2 = AbstractC11266d.m30450d((iM30450d + (list == null ? 0 : list.hashCode())) * 31, 31, this.segmentedControlDisplayId);
        C21395c c21395c = this.graphState;
        int iHashCode3 = (iM30450d2 + (c21395c == null ? 0 : c21395c.hashCode())) * 31;
        C32048d c32048d = this.vowState;
        int iM31983b = AbstractC11895b.m31983b((iHashCode3 + (c32048d == null ? 0 : c32048d.hashCode())) * 31, 31, this.belowGraphContent);
        List<TextResource> list2 = this.graphLegends;
        int iHashCode4 = (iM31983b + (list2 == null ? 0 : list2.hashCode())) * 31;
        C27023a c27023a = this.bottomSheet;
        int iHashCode5 = (iHashCode4 + (c27023a == null ? 0 : c27023a.hashCode())) * 31;
        C27026d c27026d = this.deletePregnancyDialogState;
        return iHashCode5 + (c27026d != null ? c27026d.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final C27027e getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final TextResource getNavigationTitle() {
        return this.navigationTitle;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getPregnancyId() {
        return this.pregnancyId;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getSegmentedControlDisplayId() {
        return this.segmentedControlDisplayId;
    }

    /* JADX INFO: renamed from: m */
    public final List<C27033k> m81058m() {
        return this.segmentedControlDisplays;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getSelectedButtonId() {
        return this.selectedButtonId;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final InterfaceC39332e getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final C32048d getVowState() {
        return this.vowState;
    }

    public String toString() {
        String str = this.pregnancyId;
        TextResource textResource = this.navigationTitle;
        C27025c c27025c = this.datePicker;
        C27027e c27027e = this.header;
        C27024b c27024b = this.congratulationsHeader;
        InterfaceC39332e interfaceC39332e = this.style;
        List<C25232g> list = this.buttons;
        String str2 = this.selectedButtonId;
        List<C27033k> list2 = this.segmentedControlDisplays;
        String str3 = this.segmentedControlDisplayId;
        C21395c c21395c = this.graphState;
        C32048d c32048d = this.vowState;
        List<InterfaceC25312u> list3 = this.belowGraphContent;
        List<TextResource> list4 = this.graphLegends;
        C27023a c27023a = this.bottomSheet;
        C27026d c27026d = this.deletePregnancyDialogState;
        StringBuilder sbM91847q = AbstractC30007c.m91847q("PregnancyInsightsState(pregnancyId=", str, ", navigationTitle=", textResource, ", datePicker=");
        sbM91847q.append(c27025c);
        sbM91847q.append(", header=");
        sbM91847q.append(c27027e);
        sbM91847q.append(", congratulationsHeader=");
        sbM91847q.append(c27024b);
        sbM91847q.append(", style=");
        sbM91847q.append(interfaceC39332e);
        sbM91847q.append(", buttons=");
        AbstractC17176i.m48511m(", selectedButtonId=", str2, ", segmentedControlDisplays=", sbM91847q, list);
        AbstractC17176i.m48511m(", segmentedControlDisplayId=", str3, ", graphState=", sbM91847q, list2);
        sbM91847q.append(c21395c);
        sbM91847q.append(", vowState=");
        sbM91847q.append(c32048d);
        sbM91847q.append(", belowGraphContent=");
        AbstractC21702c.m61148s(sbM91847q, list3, ", graphLegends=", list4, ", bottomSheet=");
        sbM91847q.append(c27023a);
        sbM91847q.append(", deletePregnancyDialogState=");
        sbM91847q.append(c27026d);
        sbM91847q.append(")");
        return sbM91847q.toString();
    }
}
