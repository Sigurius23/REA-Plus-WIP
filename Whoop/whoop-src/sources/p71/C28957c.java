package p71;

import com.mapbox.maps.MapboxMap;
import com.whoop.design.atomic.organism.historylistitem.HistoryListItemStyle;
import com.whoop.navigation.C9598e;
import gz0.EnumC16313m0;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import kd1.AbstractC22403o;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: p71.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00000\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b*\u00100R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b,\u0010+\u001a\u0004\b1\u0010-R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b3\u0010\"\u001a\u0004\b5\u0010\u0019R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b'\u00106\u001a\u0004\b&\u00107R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b!\u0010\u0019R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00000\u00128\u0006¢\u0006\f\n\u0004\b)\u00108\u001a\u0004\b$\u00109R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b5\u0010:\u001a\u0004\b.\u0010;¨\u0006<"}, m65681d2 = {"Lp71/c;", "Lm91/u;", "", "id", "title", "subtitle", "trailingText", "Lgz0/m0;", "leftIcon", "Lkd1/o;", "imageUrl", "rightIcon", "Lcom/whoop/design/atomic/organism/historylistitem/HistoryListItemStyle;", "style", "warning", "Lcom/whoop/navigation/e;", "destination", "caption", "", MapboxMap.QFE_CHILDREN, "", "initiallyExpanded", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lkd1/o;Lgz0/m0;Lcom/whoop/design/atomic/organism/historylistitem/HistoryListItemStyle;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/util/List;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "k", "c", "j", "d", "l", "e", "Lgz0/m0;", "g", "()Lgz0/m0;", "f", "Lkd1/o;", "()Lkd1/o;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lcom/whoop/design/atomic/organism/historylistitem/HistoryListItemStyle;", "i", "()Lcom/whoop/design/atomic/organism/historylistitem/HistoryListItemStyle;", "m", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "Ljava/util/List;", "()Ljava/util/List;", "Z", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C28957c implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String subtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String trailingText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EnumC16313m0 leftIcon;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final AbstractC22403o imageUrl;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final EnumC16313m0 rightIcon;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final HistoryListItemStyle style;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String warning;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C9598e destination;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final String caption;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final List<C28957c> children;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final boolean initiallyExpanded;

    public C28957c(String id4, String title, String str, String str2, EnumC16313m0 enumC16313m0, AbstractC22403o abstractC22403o, EnumC16313m0 enumC16313m1, HistoryListItemStyle style, String str3, C9598e c9598e, String str4, List<C28957c> children, boolean z4) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(children, "children");
        this.id = id4;
        this.title = title;
        this.subtitle = str;
        this.trailingText = str2;
        this.leftIcon = enumC16313m0;
        this.imageUrl = abstractC22403o;
        this.rightIcon = enumC16313m1;
        this.style = style;
        this.warning = str3;
        this.destination = c9598e;
        this.caption = str4;
        this.children = children;
        this.initiallyExpanded = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCaption() {
        return this.caption;
    }

    /* JADX INFO: renamed from: b */
    public final List<C28957c> m87947b() {
        return this.children;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final AbstractC22403o getImageUrl() {
        return this.imageUrl;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C28957c)) {
            return false;
        }
        C28957c c28957c = (C28957c) other;
        return AbstractC22676k.m65745e(this.id, c28957c.id) && AbstractC22676k.m65745e(this.title, c28957c.title) && AbstractC22676k.m65745e(this.subtitle, c28957c.subtitle) && AbstractC22676k.m65745e(this.trailingText, c28957c.trailingText) && this.leftIcon == c28957c.leftIcon && AbstractC22676k.m65745e(this.imageUrl, c28957c.imageUrl) && this.rightIcon == c28957c.rightIcon && this.style == c28957c.style && AbstractC22676k.m65745e(this.warning, c28957c.warning) && AbstractC22676k.m65745e(this.destination, c28957c.destination) && AbstractC22676k.m65745e(this.caption, c28957c.caption) && AbstractC22676k.m65745e(this.children, c28957c.children) && this.initiallyExpanded == c28957c.initiallyExpanded;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getInitiallyExpanded() {
        return this.initiallyExpanded;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final EnumC16313m0 getLeftIcon() {
        return this.leftIcon;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final EnumC16313m0 getRightIcon() {
        return this.rightIcon;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.title);
        String str = this.subtitle;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.trailingText;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        EnumC16313m0 enumC16313m0 = this.leftIcon;
        int iHashCode3 = (iHashCode2 + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31;
        AbstractC22403o abstractC22403o = this.imageUrl;
        int iHashCode4 = (iHashCode3 + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31;
        EnumC16313m0 enumC16313m1 = this.rightIcon;
        int iHashCode5 = (this.style.hashCode() + ((iHashCode4 + (enumC16313m1 == null ? 0 : enumC16313m1.hashCode())) * 31)) * 31;
        String str3 = this.warning;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        C9598e c9598e = this.destination;
        int iHashCode7 = (iHashCode6 + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        String str4 = this.caption;
        return Boolean.hashCode(this.initiallyExpanded) + AbstractC11895b.m31983b((iHashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.children);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final HistoryListItemStyle getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getTrailingText() {
        return this.trailingText;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getWarning() {
        return this.warning;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.subtitle;
        String str4 = this.trailingText;
        EnumC16313m0 enumC16313m0 = this.leftIcon;
        AbstractC22403o abstractC22403o = this.imageUrl;
        EnumC16313m0 enumC16313m1 = this.rightIcon;
        HistoryListItemStyle historyListItemStyle = this.style;
        String str5 = this.warning;
        C9598e c9598e = this.destination;
        String str6 = this.caption;
        List<C28957c> list = this.children;
        boolean z4 = this.initiallyExpanded;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("HistoryListItemState(id=", str, ", title=", str2, ", subtitle=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", trailingText=", str4, ", leftIcon=");
        sbM32001t.append(enumC16313m0);
        sbM32001t.append(", imageUrl=");
        sbM32001t.append(abstractC22403o);
        sbM32001t.append(", rightIcon=");
        sbM32001t.append(enumC16313m1);
        sbM32001t.append(", style=");
        sbM32001t.append(historyListItemStyle);
        sbM32001t.append(", warning=");
        AbstractC30007c.m91827B(sbM32001t, str5, ", destination=", c9598e, ", caption=");
        AbstractC36095b.m114694v(str6, ", children=", ", initiallyExpanded=", sbM32001t, list);
        return AbstractC18489d0.m53372m(sbM32001t, z4, ")");
    }

    public /* synthetic */ C28957c(String str, String str2, String str3, String str4, EnumC16313m0 enumC16313m0, AbstractC22403o abstractC22403o, EnumC16313m0 enumC16313m1, HistoryListItemStyle historyListItemStyle, String str5, C9598e c9598e, String str6, List list, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, enumC16313m0, abstractC22403o, enumC16313m1, historyListItemStyle, str5, c9598e, str6, list, (i13 & 4096) != 0 ? false : z4);
    }
}
