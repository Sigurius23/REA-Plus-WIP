package f41;

import com.whoop.design.util.TextResource;
import hy0.C17731c2;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22403o;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.InterfaceC39332e;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: f41.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ¨\u0001\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u000f2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010%\u001a\u0004\b&\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010*R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b+\u00107R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b/\u0010.\u001a\u0004\b8\u00100R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b<\u00109\u001a\u0004\b=\u0010;R\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b=\u00109\u001a\u0004\b>\u0010;R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b)\u0010?\u001a\u0004\b5\u0010@R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b3\u0010A\u001a\u0004\b<\u0010 R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b>\u0010B\u001a\u0004\b1\u0010C¨\u0006D"}, m65681d2 = {"Lf41/e;", "Lm91/u;", "", "id", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "avoidText", "Lkd1/o;", "icon", "Lhy0/c2;", "trend", "Ly81/e;", "activeColor", "imageUrl", "", "isSelected", "showAvoidOption", "isAvoidChecked", "Lf41/b;", "dayOptions", "", "selectedNumber", "Lf41/a;", "bottomSheetInfo", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Lhy0/c2;Ly81/e;Lkd1/o;ZZZLf41/b;ILf41/a;)V", "a", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Lhy0/c2;Ly81/e;Lkd1/o;ZZZLf41/b;ILf41/a;)Lf41/e;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "b", "Lcom/whoop/design/util/TextResource;", "l", "()Lcom/whoop/design/util/TextResource;", "c", "d", "e", "Lkd1/o;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lkd1/o;", "f", "Lhy0/c2;", "m", "()Lhy0/c2;", "g", "Ly81/e;", "()Ly81/e;", "i", "Z", "o", "()Z", "j", "k", "n", "Lf41/b;", "()Lf41/b;", "I", "Lf41/a;", "()Lf41/a;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C14067e implements InterfaceC25312u {

    /* JADX INFO: renamed from: o */
    public static final int f50443o = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource avoidText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AbstractC22403o icon;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C17731c2 trend;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC39332e activeColor;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final AbstractC22403o imageUrl;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean isSelected;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final boolean showAvoidOption;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final boolean isAvoidChecked;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final C14064b dayOptions;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final int selectedNumber;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final C14063a bottomSheetInfo;

    public C14067e(String id4, TextResource title, TextResource textResource, TextResource textResource2, AbstractC22403o abstractC22403o, C17731c2 c17731c2, InterfaceC39332e activeColor, AbstractC22403o abstractC22403o2, boolean z4, boolean z13, boolean z14, C14064b dayOptions, int i13, C14063a c14063a) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(activeColor, "activeColor");
        AbstractC22676k.m65750j(dayOptions, "dayOptions");
        this.id = id4;
        this.title = title;
        this.subtitle = textResource;
        this.avoidText = textResource2;
        this.icon = abstractC22403o;
        this.trend = c17731c2;
        this.activeColor = activeColor;
        this.imageUrl = abstractC22403o2;
        this.isSelected = z4;
        this.showAvoidOption = z13;
        this.isAvoidChecked = z14;
        this.dayOptions = dayOptions;
        this.selectedNumber = i13;
        this.bottomSheetInfo = c14063a;
    }

    /* JADX INFO: renamed from: a */
    public final C14067e m40036a(String id4, TextResource title, TextResource subtitle, TextResource avoidText, AbstractC22403o icon, C17731c2 trend, InterfaceC39332e activeColor, AbstractC22403o imageUrl, boolean isSelected, boolean showAvoidOption, boolean isAvoidChecked, C14064b dayOptions, int selectedNumber, C14063a bottomSheetInfo) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(activeColor, "activeColor");
        AbstractC22676k.m65750j(dayOptions, "dayOptions");
        return new C14067e(id4, title, subtitle, avoidText, icon, trend, activeColor, imageUrl, isSelected, showAvoidOption, isAvoidChecked, dayOptions, selectedNumber, bottomSheetInfo);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC39332e getActiveColor() {
        return this.activeColor;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getAvoidText() {
        return this.avoidText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14067e)) {
            return false;
        }
        C14067e c14067e = (C14067e) other;
        return AbstractC22676k.m65745e(this.id, c14067e.id) && AbstractC22676k.m65745e(this.title, c14067e.title) && AbstractC22676k.m65745e(this.subtitle, c14067e.subtitle) && AbstractC22676k.m65745e(this.avoidText, c14067e.avoidText) && AbstractC22676k.m65745e(this.icon, c14067e.icon) && AbstractC22676k.m65745e(this.trend, c14067e.trend) && AbstractC22676k.m65745e(this.activeColor, c14067e.activeColor) && AbstractC22676k.m65745e(this.imageUrl, c14067e.imageUrl) && this.isSelected == c14067e.isSelected && this.showAvoidOption == c14067e.showAvoidOption && this.isAvoidChecked == c14067e.isAvoidChecked && AbstractC22676k.m65745e(this.dayOptions, c14067e.dayOptions) && this.selectedNumber == c14067e.selectedNumber && AbstractC22676k.m65745e(this.bottomSheetInfo, c14067e.bottomSheetInfo);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C14063a getBottomSheetInfo() {
        return this.bottomSheetInfo;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C14064b getDayOptions() {
        return this.dayOptions;
    }

    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final AbstractC22403o getIcon() {
        return this.icon;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(this.id.hashCode() * 31, this.title, 31);
        TextResource textResource = this.subtitle;
        int iHashCode = (iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31;
        TextResource textResource2 = this.avoidText;
        int iHashCode2 = (iHashCode + (textResource2 == null ? 0 : textResource2.hashCode())) * 31;
        AbstractC22403o abstractC22403o = this.icon;
        int iHashCode3 = (iHashCode2 + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31;
        C17731c2 c17731c2 = this.trend;
        int iM106648g = AbstractC33745d.m106648g(this.activeColor, (iHashCode3 + (c17731c2 == null ? 0 : c17731c2.hashCode())) * 31, 31);
        AbstractC22403o abstractC22403o2 = this.imageUrl;
        int iM30448b = AbstractC11266d.m30448b(this.selectedNumber, (this.dayOptions.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM106648g + (abstractC22403o2 == null ? 0 : abstractC22403o2.hashCode())) * 31, 31, this.isSelected), 31, this.showAvoidOption), 31, this.isAvoidChecked)) * 31, 31);
        C14063a c14063a = this.bottomSheetInfo;
        return iM30448b + (c14063a != null ? c14063a.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final AbstractC22403o getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getSelectedNumber() {
        return this.selectedNumber;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getShowAvoidOption() {
        return this.showAvoidOption;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final C17731c2 getTrend() {
        return this.trend;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getIsAvoidChecked() {
        return this.isAvoidChecked;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public String toString() {
        String str = this.id;
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        TextResource textResource3 = this.avoidText;
        AbstractC22403o abstractC22403o = this.icon;
        C17731c2 c17731c2 = this.trend;
        InterfaceC39332e interfaceC39332e = this.activeColor;
        AbstractC22403o abstractC22403o2 = this.imageUrl;
        boolean z4 = this.isSelected;
        boolean z13 = this.showAvoidOption;
        boolean z14 = this.isAvoidChecked;
        C14064b c14064b = this.dayOptions;
        int i13 = this.selectedNumber;
        C14063a c14063a = this.bottomSheetInfo;
        StringBuilder sbM91847q = AbstractC30007c.m91847q("GoalSettingsTileState(id=", str, ", title=", textResource, ", subtitle=");
        AbstractC30007c.m91855y(sbM91847q, textResource2, ", avoidText=", textResource3, ", icon=");
        sbM91847q.append(abstractC22403o);
        sbM91847q.append(", trend=");
        sbM91847q.append(c17731c2);
        sbM91847q.append(", activeColor=");
        sbM91847q.append(interfaceC39332e);
        sbM91847q.append(", imageUrl=");
        sbM91847q.append(abstractC22403o2);
        sbM91847q.append(", isSelected=");
        AbstractC38963t7.m124392v(sbM91847q, z4, ", showAvoidOption=", z13, ", isAvoidChecked=");
        sbM91847q.append(z14);
        sbM91847q.append(", dayOptions=");
        sbM91847q.append(c14064b);
        sbM91847q.append(", selectedNumber=");
        sbM91847q.append(i13);
        sbM91847q.append(", bottomSheetInfo=");
        sbM91847q.append(c14063a);
        sbM91847q.append(")");
        return sbM91847q.toString();
    }

    public /* synthetic */ C14067e(String str, TextResource textResource, TextResource textResource2, TextResource textResource3, AbstractC22403o abstractC22403o, C17731c2 c17731c2, InterfaceC39332e interfaceC39332e, AbstractC22403o abstractC22403o2, boolean z4, boolean z13, boolean z14, C14064b c14064b, int i13, C14063a c14063a, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textResource, textResource2, textResource3, (i14 & 16) != 0 ? null : abstractC22403o, c17731c2, interfaceC39332e, (i14 & 128) != 0 ? null : abstractC22403o2, z4, (i14 & 512) != 0 ? false : z13, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? false : z14, c14064b, (i14 & 4096) != 0 ? 1 : i13, (i14 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : c14063a);
    }
}
