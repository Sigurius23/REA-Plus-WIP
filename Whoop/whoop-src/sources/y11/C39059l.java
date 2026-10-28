package y11;

import androidx.compose.p018ui.Modifier;
import androidx.core.app.NotificationCompat;
import b21.C2332e;
import com.whoop.design.models.items.graph.LayoutDirection;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import l83.C23454a0;
import l83.C23465k;
import nh3.AbstractC26725a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p026b2.C2314t;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: y11.l */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b'\b\u0087\b\u0018\u00002\u00020\u0001B±\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000e\u0012\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJÄ\u0001\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u000e2\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u000e2\b\b\u0002\u0010\u0019\u001a\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\u001aHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u000e2\b\u0010&\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010/R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b2\u0010/R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u0010-\u001a\u0004\b4\u0010/R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b5\u0010-\u001a\u0004\b6\u0010/R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b3\u00109R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b2\u0010:\u001a\u0004\b7\u0010;R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b@\u0010=\u001a\u0004\bA\u0010?R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\b<\u0010DR\u0017\u0010\u0014\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b4\u0010=\u001a\u0004\b@\u0010?R%\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\b0\u0010GR\u0017\u0010\u0018\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b6\u0010=\u001a\u0004\bB\u0010?R\u0017\u0010\u0019\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b.\u0010=\u001a\u0004\b5\u0010?R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b>\u0010H\u001a\u0004\bE\u0010I¨\u0006J"}, m65681d2 = {"Ly11/l;", "Lm91/u;", "", NotificationCompat.CATEGORY_EVENT, "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "percentage", "time", "timeSuffix", "Ly11/a;", "fillColor", "Landroidx/compose/ui/Modifier;", "modifier", "", "isDrillDown", "isSelected", "", "Lb21/e;", "ratios", "showAverage", "Ll83/k;", "", "averageRange", "showRadioButton", "hideBackground", "Lcom/whoop/design/models/items/graph/LayoutDirection;", "timeSpliceLayoutDirection", "<init>", "(Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly11/a;Landroidx/compose/ui/Modifier;ZZLjava/util/List;ZLl83/k;ZZLcom/whoop/design/models/items/graph/LayoutDirection;)V", "a", "(Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly11/a;Landroidx/compose/ui/Modifier;ZZLjava/util/List;ZLl83/k;ZZLcom/whoop/design/models/items/graph/LayoutDirection;)Ly11/l;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "getEvent", "()Ljava/lang/Object;", "b", "Lcom/whoop/design/util/TextResource;", "o", "()Lcom/whoop/design/util/TextResource;", "c", "d", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "e", "l", "f", "n", "g", "Ly11/a;", "()Ly11/a;", "Landroidx/compose/ui/Modifier;", "()Landroidx/compose/ui/Modifier;", "i", "Z", "p", "()Z", "j", "q", "k", "Ljava/util/List;", "()Ljava/util/List;", "m", "Ll83/k;", "()Ll83/k;", "Lcom/whoop/design/models/items/graph/LayoutDirection;", "()Lcom/whoop/design/models/items/graph/LayoutDirection;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C39059l implements InterfaceC25312u {

    /* JADX INFO: renamed from: q */
    public static final int f168079q = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Object event;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource percentage;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource time;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextResource timeSuffix;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final EnumC39048a fillColor;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final Modifier modifier;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean isDrillDown;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final boolean isSelected;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final List<C2332e> ratios;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final boolean showAverage;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final C23465k averageRange;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final boolean showRadioButton;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final boolean hideBackground;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final LayoutDirection timeSpliceLayoutDirection;

    public C39059l(Object event, TextResource title, TextResource subtitle, TextResource percentage, TextResource time, TextResource timeSuffix, EnumC39048a fillColor, Modifier modifier, boolean z4, boolean z13, List<C2332e> ratios, boolean z14, C23465k c23465k, boolean z15, boolean z16, LayoutDirection timeSpliceLayoutDirection) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(percentage, "percentage");
        AbstractC22676k.m65750j(time, "time");
        AbstractC22676k.m65750j(timeSuffix, "timeSuffix");
        AbstractC22676k.m65750j(fillColor, "fillColor");
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(ratios, "ratios");
        AbstractC22676k.m65750j(timeSpliceLayoutDirection, "timeSpliceLayoutDirection");
        this.event = event;
        this.title = title;
        this.subtitle = subtitle;
        this.percentage = percentage;
        this.time = time;
        this.timeSuffix = timeSuffix;
        this.fillColor = fillColor;
        this.modifier = modifier;
        this.isDrillDown = z4;
        this.isSelected = z13;
        this.ratios = ratios;
        this.showAverage = z14;
        this.averageRange = c23465k;
        this.showRadioButton = z15;
        this.hideBackground = z16;
        this.timeSpliceLayoutDirection = timeSpliceLayoutDirection;
    }

    /* JADX INFO: renamed from: a */
    public final C39059l m124529a(Object event, TextResource title, TextResource subtitle, TextResource percentage, TextResource time, TextResource timeSuffix, EnumC39048a fillColor, Modifier modifier, boolean isDrillDown, boolean isSelected, List<C2332e> ratios, boolean showAverage, C23465k averageRange, boolean showRadioButton, boolean hideBackground, LayoutDirection timeSpliceLayoutDirection) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(percentage, "percentage");
        AbstractC22676k.m65750j(time, "time");
        AbstractC22676k.m65750j(timeSuffix, "timeSuffix");
        AbstractC22676k.m65750j(fillColor, "fillColor");
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(ratios, "ratios");
        AbstractC22676k.m65750j(timeSpliceLayoutDirection, "timeSpliceLayoutDirection");
        return new C39059l(event, title, subtitle, percentage, time, timeSuffix, fillColor, modifier, isDrillDown, isSelected, ratios, showAverage, averageRange, showRadioButton, hideBackground, timeSpliceLayoutDirection);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C23465k getAverageRange() {
        return this.averageRange;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC39048a getFillColor() {
        return this.fillColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C39059l)) {
            return false;
        }
        C39059l c39059l = (C39059l) other;
        return AbstractC22676k.m65745e(this.event, c39059l.event) && AbstractC22676k.m65745e(this.title, c39059l.title) && AbstractC22676k.m65745e(this.subtitle, c39059l.subtitle) && AbstractC22676k.m65745e(this.percentage, c39059l.percentage) && AbstractC22676k.m65745e(this.time, c39059l.time) && AbstractC22676k.m65745e(this.timeSuffix, c39059l.timeSuffix) && this.fillColor == c39059l.fillColor && AbstractC22676k.m65745e(this.modifier, c39059l.modifier) && this.isDrillDown == c39059l.isDrillDown && this.isSelected == c39059l.isSelected && AbstractC22676k.m65745e(this.ratios, c39059l.ratios) && this.showAverage == c39059l.showAverage && AbstractC22676k.m65745e(this.averageRange, c39059l.averageRange) && this.showRadioButton == c39059l.showRadioButton && this.hideBackground == c39059l.hideBackground && this.timeSpliceLayoutDirection == c39059l.timeSpliceLayoutDirection;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getHideBackground() {
        return this.hideBackground;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // p720m91.InterfaceC25312u
    public Object getEvent() {
        return this.event;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextResource getPercentage() {
        return this.percentage;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC11895b.m31983b(AbstractC2875y.m8289b(AbstractC2875y.m8289b((this.modifier.hashCode() + ((this.fillColor.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.event.hashCode() * 31, this.title, 31), this.subtitle, 31), this.percentage, 31), this.time, 31), this.timeSuffix, 31)) * 31)) * 31, 31, this.isDrillDown), 31, this.isSelected), 31, this.ratios), 31, this.showAverage);
        C23465k c23465k = this.averageRange;
        return this.timeSpliceLayoutDirection.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM8289b + (c23465k == null ? 0 : c23465k.hashCode())) * 31, 31, this.showRadioButton), 31, this.hideBackground);
    }

    /* JADX INFO: renamed from: i */
    public final List<C2332e> m124536i() {
        return this.ratios;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getShowAverage() {
        return this.showAverage;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getShowRadioButton() {
        return this.showRadioButton;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final TextResource getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final LayoutDirection getTimeSpliceLayoutDirection() {
        return this.timeSpliceLayoutDirection;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final TextResource getTimeSuffix() {
        return this.timeSuffix;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final boolean getIsDrillDown() {
        return this.isDrillDown;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public String toString() {
        Object obj = this.event;
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        TextResource textResource3 = this.percentage;
        TextResource textResource4 = this.time;
        TextResource textResource5 = this.timeSuffix;
        EnumC39048a enumC39048a = this.fillColor;
        Modifier modifier = this.modifier;
        boolean z4 = this.isDrillDown;
        boolean z13 = this.isSelected;
        List<C2332e> list = this.ratios;
        boolean z14 = this.showAverage;
        C23465k c23465k = this.averageRange;
        boolean z15 = this.showRadioButton;
        boolean z16 = this.hideBackground;
        LayoutDirection layoutDirection = this.timeSpliceLayoutDirection;
        StringBuilder sb4 = new StringBuilder("HorizontalBarGraphTileState(event=");
        sb4.append(obj);
        sb4.append(", title=");
        sb4.append(textResource);
        sb4.append(", subtitle=");
        AbstractC30007c.m91855y(sb4, textResource2, ", percentage=", textResource3, ", time=");
        AbstractC30007c.m91855y(sb4, textResource4, ", timeSuffix=", textResource5, ", fillColor=");
        sb4.append(enumC39048a);
        sb4.append(", modifier=");
        sb4.append(modifier);
        sb4.append(", isDrillDown=");
        AbstractC38963t7.m124392v(sb4, z4, ", isSelected=", z13, ", ratios=");
        AbstractC26725a.m79512p(", showAverage=", ", averageRange=", sb4, list, z14);
        sb4.append(c23465k);
        sb4.append(", showRadioButton=");
        sb4.append(z15);
        sb4.append(", hideBackground=");
        sb4.append(z16);
        sb4.append(", timeSpliceLayoutDirection=");
        sb4.append(layoutDirection);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ C39059l(Object obj, TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, TextResource textResource5, EnumC39048a enumC39048a, Modifier modifier, boolean z4, boolean z13, List list, boolean z14, C23465k c23465k, boolean z15, boolean z16, LayoutDirection layoutDirection, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C23454a0.f92919a : obj, textResource, (i13 & 4) != 0 ? AbstractC8693b.m21267a() : textResource2, textResource3, textResource4, (i13 & 32) != 0 ? AbstractC8693b.m21267a() : textResource5, enumC39048a, (i13 & 128) != 0 ? C2314t.f9131w : modifier, (i13 & 256) != 0 ? false : z4, (i13 & 512) != 0 ? false : z13, list, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? true : z14, (i13 & 4096) != 0 ? null : c23465k, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? false : z15, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? false : z16, (i13 & 32768) != 0 ? LayoutDirection.LEFT_TO_RIGHT : layoutDirection);
    }
}
