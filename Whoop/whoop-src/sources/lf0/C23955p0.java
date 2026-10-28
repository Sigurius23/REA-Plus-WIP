package lf0;

import c13.AbstractC3855a;
import com.whoop.design.util.TextResource;
import java.util.List;
import m83.C25271y;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.InterfaceC39332e;
import te0.AbstractC33745d;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: lf0.p0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b%\u0010$R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u0019\u0010'¨\u0006("}, m65681d2 = {"Llf0/p0;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "Ly81/e;", "subtitleTextColor", "priceLabel", "", "isEnabled", "isSelected", "", "additionalItems", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;ZZLjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "b", "d", "c", "Ly81/e;", "()Ly81/e;", "Z", "f", "()Z", "g", "Ljava/util/List;", "()Ljava/util/List;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C23955p0 implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC39332e subtitleTextColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource priceLabel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isEnabled;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean isSelected;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final List<InterfaceC25312u> additionalItems;

    /* JADX WARN: Multi-variable type inference failed */
    public C23955p0(TextResource title, TextResource textResource, InterfaceC39332e interfaceC39332e, TextResource textResource2, boolean z4, boolean z13, List<? extends InterfaceC25312u> additionalItems) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(additionalItems, "additionalItems");
        this.title = title;
        this.subtitle = textResource;
        this.subtitleTextColor = interfaceC39332e;
        this.priceLabel = textResource2;
        this.isEnabled = z4;
        this.isSelected = z13;
        this.additionalItems = additionalItems;
    }

    /* JADX INFO: renamed from: a */
    public final List<InterfaceC25312u> m70592a() {
        return this.additionalItems;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getPriceLabel() {
        return this.priceLabel;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC39332e getSubtitleTextColor() {
        return this.subtitleTextColor;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C23955p0)) {
            return false;
        }
        C23955p0 c23955p0 = (C23955p0) other;
        return AbstractC22676k.m65745e(this.title, c23955p0.title) && AbstractC22676k.m65745e(this.subtitle, c23955p0.subtitle) && AbstractC22676k.m65745e(this.subtitleTextColor, c23955p0.subtitleTextColor) && AbstractC22676k.m65745e(this.priceLabel, c23955p0.priceLabel) && this.isEnabled == c23955p0.isEnabled && this.isSelected == c23955p0.isSelected && AbstractC22676k.m65745e(this.additionalItems, c23955p0.additionalItems);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        TextResource textResource = this.subtitle;
        int iHashCode2 = (iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31;
        InterfaceC39332e interfaceC39332e = this.subtitleTextColor;
        int iHashCode3 = (iHashCode2 + (interfaceC39332e == null ? 0 : interfaceC39332e.hashCode())) * 31;
        TextResource textResource2 = this.priceLabel;
        return this.additionalItems.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode3 + (textResource2 != null ? textResource2.hashCode() : 0)) * 31, 31, this.isEnabled), 31, this.isSelected);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        InterfaceC39332e interfaceC39332e = this.subtitleTextColor;
        TextResource textResource3 = this.priceLabel;
        boolean z4 = this.isEnabled;
        boolean z13 = this.isSelected;
        List<InterfaceC25312u> list = this.additionalItems;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("CollectionMethodTileState(title=", textResource, ", subtitle=", textResource2, ", subtitleTextColor=");
        AbstractC33745d.m106665x(sbM106658q, interfaceC39332e, ", priceLabel=", textResource3, ", isEnabled=");
        AbstractC38963t7.m124392v(sbM106658q, z4, ", isSelected=", z13, ", additionalItems=");
        return AbstractC3855a.m11829m(sbM106658q, list, ")");
    }

    public /* synthetic */ C23955p0(TextResource textResource, TextResource textResource2, InterfaceC39332e interfaceC39332e, TextResource textResource3, boolean z4, boolean z13, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, textResource2, interfaceC39332e, textResource3, z4, (i13 & 32) != 0 ? false : z13, (i13 & 64) != 0 ? C25271y.f99162w : list);
    }
}
