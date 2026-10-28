package k71;

import androidx.core.app.NotificationCompat;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import d13.AbstractC11478a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import kd1.EnumC22400l;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import y71.C39274g;

/* JADX INFO: renamed from: k71.c0 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b(\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0001\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J¨\u0001\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0016HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u00102\b\u0010\"\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b*\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010.R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u0010)\u001a\u0004\b2\u0010+R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b3\u0010,\u001a\u0004\b4\u0010.R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b5\u0010,\u001a\u0004\b6\u0010.R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b5\u00109R\u0017\u0010\u000e\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b7\u0010<R\u0017\u0010\u000f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b1\u0010.R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b2\u0010=\u001a\u0004\b>\u0010?R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b6\u0010@\u001a\u0004\b:\u0010AR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b4\u0010B\u001a\u0004\b3\u0010CR\u001f\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bD\u0010F¨\u0006G"}, m65681d2 = {"Lk71/c0;", "Lm91/u;", "", NotificationCompat.CATEGORY_EVENT, "Ly81/e;", "backgroundColor", "Lcom/whoop/design/util/TextResource;", "title", "label", "labelColor", "score", "lastUpdatedText", "", "graphAspectRatio", "graphItem", "body", "", "isCompact", "Ly71/g;", "icon", "Lkd1/l;", "ctaType", "", "subItems", "<init>", "(Ljava/lang/Object;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;FLm91/u;Lcom/whoop/design/util/TextResource;ZLy71/g;Lkd1/l;Ljava/util/List;)V", "a", "(Ljava/lang/Object;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;FLm91/u;Lcom/whoop/design/util/TextResource;ZLy71/g;Lkd1/l;Ljava/util/List;)Lk71/c0;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "getEvent", "()Ljava/lang/Object;", "b", "Ly81/e;", "c", "()Ly81/e;", "Lcom/whoop/design/util/TextResource;", "o", "()Lcom/whoop/design/util/TextResource;", "d", "j", "e", "k", "f", "m", "g", "l", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "F", "()F", "i", "Lm91/u;", "()Lm91/u;", "Z", "p", "()Z", "Ly71/g;", "()Ly71/g;", "Lkd1/l;", "()Lkd1/l;", "n", "Ljava/util/List;", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22245c0 implements InterfaceC25312u {

    /* JADX INFO: renamed from: o */
    public static final int f86725o = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Object event;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC39332e backgroundColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource label;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC39332e labelColor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextResource score;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final TextResource lastUpdatedText;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final float graphAspectRatio;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final InterfaceC25312u graphItem;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final TextResource body;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final boolean isCompact;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final C39274g icon;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final EnumC22400l ctaType;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final List<InterfaceC25312u> subItems;

    /* JADX INFO: renamed from: k71.c0$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f86740w = new a();

        /* JADX INFO: renamed from: a */
        public final long m63804a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite5();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m63804a((C39336i) obj));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C22245c0(Object event, InterfaceC39332e backgroundColor, TextResource title, TextResource label, InterfaceC39332e labelColor, TextResource score, TextResource lastUpdatedText, float f13, InterfaceC25312u graphItem, TextResource body, boolean z4, C39274g c39274g, EnumC22400l enumC22400l, List<? extends InterfaceC25312u> list) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(backgroundColor, "backgroundColor");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(labelColor, "labelColor");
        AbstractC22676k.m65750j(score, "score");
        AbstractC22676k.m65750j(lastUpdatedText, "lastUpdatedText");
        AbstractC22676k.m65750j(graphItem, "graphItem");
        AbstractC22676k.m65750j(body, "body");
        this.event = event;
        this.backgroundColor = backgroundColor;
        this.title = title;
        this.label = label;
        this.labelColor = labelColor;
        this.score = score;
        this.lastUpdatedText = lastUpdatedText;
        this.graphAspectRatio = f13;
        this.graphItem = graphItem;
        this.body = body;
        this.isCompact = z4;
        this.icon = c39274g;
        this.ctaType = enumC22400l;
        this.subItems = list;
    }

    /* JADX INFO: renamed from: a */
    public final C22245c0 m63790a(Object event, InterfaceC39332e backgroundColor, TextResource title, TextResource label, InterfaceC39332e labelColor, TextResource score, TextResource lastUpdatedText, float graphAspectRatio, InterfaceC25312u graphItem, TextResource body, boolean isCompact, C39274g icon, EnumC22400l ctaType, List<? extends InterfaceC25312u> subItems) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(backgroundColor, "backgroundColor");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(labelColor, "labelColor");
        AbstractC22676k.m65750j(score, "score");
        AbstractC22676k.m65750j(lastUpdatedText, "lastUpdatedText");
        AbstractC22676k.m65750j(graphItem, "graphItem");
        AbstractC22676k.m65750j(body, "body");
        return new C22245c0(event, backgroundColor, title, label, labelColor, score, lastUpdatedText, graphAspectRatio, graphItem, body, isCompact, icon, ctaType, subItems);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC39332e getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getBody() {
        return this.body;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22245c0)) {
            return false;
        }
        C22245c0 c22245c0 = (C22245c0) other;
        return AbstractC22676k.m65745e(this.event, c22245c0.event) && AbstractC22676k.m65745e(this.backgroundColor, c22245c0.backgroundColor) && AbstractC22676k.m65745e(this.title, c22245c0.title) && AbstractC22676k.m65745e(this.label, c22245c0.label) && AbstractC22676k.m65745e(this.labelColor, c22245c0.labelColor) && AbstractC22676k.m65745e(this.score, c22245c0.score) && AbstractC22676k.m65745e(this.lastUpdatedText, c22245c0.lastUpdatedText) && Float.compare(this.graphAspectRatio, c22245c0.graphAspectRatio) == 0 && AbstractC22676k.m65745e(this.graphItem, c22245c0.graphItem) && AbstractC22676k.m65745e(this.body, c22245c0.body) && this.isCompact == c22245c0.isCompact && AbstractC22676k.m65745e(this.icon, c22245c0.icon) && this.ctaType == c22245c0.ctaType && AbstractC22676k.m65745e(this.subItems, c22245c0.subItems);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC22400l getCtaType() {
        return this.ctaType;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final float getGraphAspectRatio() {
        return this.graphAspectRatio;
    }

    @Override // p720m91.InterfaceC25312u
    /* JADX INFO: renamed from: getEvent, reason: from getter */
    public Object getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String() {
        return this.event;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final InterfaceC25312u getGraphItem() {
        return this.graphItem;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC31061c.m95625a(AbstractC11478a.m30851c(this.graphItem, AbstractC11266d.m30447a(this.graphAspectRatio, AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC33745d.m106648g(this.labelColor, AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC33745d.m106648g(this.backgroundColor, this.event.hashCode() * 31, 31), this.title, 31), this.label, 31), 31), this.score, 31), this.lastUpdatedText, 31), 31), 31), this.body, 31), 31, this.isCompact);
        C39274g c39274g = this.icon;
        int iHashCode = (iM8289b + (c39274g == null ? 0 : c39274g.hashCode())) * 31;
        EnumC22400l enumC22400l = this.ctaType;
        int iHashCode2 = (iHashCode + (enumC22400l == null ? 0 : enumC22400l.hashCode())) * 31;
        List<InterfaceC25312u> list = this.subItems;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final C39274g getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final TextResource getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final InterfaceC39332e getLabelColor() {
        return this.labelColor;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final TextResource getLastUpdatedText() {
        return this.lastUpdatedText;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final TextResource getScore() {
        return this.score;
    }

    /* JADX INFO: renamed from: n */
    public final List<InterfaceC25312u> m63801n() {
        return this.subItems;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final boolean getIsCompact() {
        return this.isCompact;
    }

    public String toString() {
        Object obj = this.event;
        InterfaceC39332e interfaceC39332e = this.backgroundColor;
        TextResource textResource = this.title;
        TextResource textResource2 = this.label;
        InterfaceC39332e interfaceC39332e2 = this.labelColor;
        TextResource textResource3 = this.score;
        TextResource textResource4 = this.lastUpdatedText;
        float f13 = this.graphAspectRatio;
        InterfaceC25312u interfaceC25312u = this.graphItem;
        TextResource textResource5 = this.body;
        boolean z4 = this.isCompact;
        C39274g c39274g = this.icon;
        EnumC22400l enumC22400l = this.ctaType;
        List<InterfaceC25312u> list = this.subItems;
        StringBuilder sb4 = new StringBuilder("StressGraphingCardState(event=");
        sb4.append(obj);
        sb4.append(", backgroundColor=");
        sb4.append(interfaceC39332e);
        sb4.append(", title=");
        AbstractC30007c.m91855y(sb4, textResource, ", label=", textResource2, ", labelColor=");
        AbstractC33745d.m106665x(sb4, interfaceC39332e2, ", score=", textResource3, ", lastUpdatedText=");
        sb4.append(textResource4);
        sb4.append(", graphAspectRatio=");
        sb4.append(f13);
        sb4.append(", graphItem=");
        sb4.append(interfaceC25312u);
        sb4.append(", body=");
        sb4.append(textResource5);
        sb4.append(", isCompact=");
        sb4.append(z4);
        sb4.append(", icon=");
        sb4.append(c39274g);
        sb4.append(", ctaType=");
        sb4.append(enumC22400l);
        sb4.append(", subItems=");
        sb4.append(list);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ C22245c0(Object obj, InterfaceC39332e interfaceC39332e, TextResource textResource, TextResource textResource2, InterfaceC39332e interfaceC39332e2, TextResource textResource3, TextResource textResource4, float f13, InterfaceC25312u interfaceC25312u, TextResource textResource5, boolean z4, C39274g c39274g, EnumC22400l enumC22400l, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C23454a0.f92919a : obj, (i13 & 2) != 0 ? p745y81.Function1.m125323a(a.f86740w) : interfaceC39332e, textResource, textResource2, interfaceC39332e2, textResource3, (i13 & 64) != 0 ? AbstractC8693b.m21267a() : textResource4, (i13 & 128) != 0 ? 1.3333334f : f13, interfaceC25312u, textResource5, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? false : z4, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : c39274g, (i13 & 4096) != 0 ? null : enumC22400l, list);
    }
}
