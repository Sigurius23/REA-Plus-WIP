package c41;

import androidx.core.app.NotificationCompat;
import com.whoop.design.util.TextResource;
import gy0.AbstractC16277f;
import i41.C18084d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jh3.AbstractC21702c;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: c41.w2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b/\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\n\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ¦\u0001\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u0018HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u00182\b\u0010\"\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b3\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b<\u00102\u001a\u0004\b=\u00104R\u0017\u0010\u0011\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b>\u00109\u001a\u0004\b<\u0010;R\u0017\u0010\u0012\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b:\u00102\u001a\u0004\b+\u00104R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b=\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b6\u0010)\u001a\u0004\b>\u0010\u001fR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b@\u0010B\u001a\u0004\b8\u0010CR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b-\u0010D\u001a\u0004\bE\u0010F¨\u0006G"}, m65681d2 = {"Lc41/w2;", "Lm91/u;", "", NotificationCompat.CATEGORY_EVENT, "", "id", "Lc41/y2;", "type", "", "icon", "Ly81/f;", "iconColor", "Lc41/x2;", "trend", "Lcom/whoop/design/util/TextResource;", "title", "titleColor", "metric", "backgroundColor", "Li41/d;", "trendBarViewState", "placeHolderMessage", "Lc41/s2;", "keyMetricTileDialogContent", "", "useSmallValueText", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Lc41/y2;ILy81/f;Lc41/x2;Lcom/whoop/design/util/TextResource;Ly81/f;Lcom/whoop/design/util/TextResource;Ly81/f;Li41/d;Ljava/lang/String;Lc41/s2;Z)V", "a", "(Ljava/lang/Object;Ljava/lang/String;Lc41/y2;ILy81/f;Lc41/x2;Lcom/whoop/design/util/TextResource;Ly81/f;Lcom/whoop/design/util/TextResource;Ly81/f;Li41/d;Ljava/lang/String;Lc41/s2;Z)Lc41/w2;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "getEvent", "()Ljava/lang/Object;", "b", "Ljava/lang/String;", "getId", "c", "Lc41/y2;", "n", "()Lc41/y2;", "d", "I", "e", "Ly81/f;", "f", "()Ly81/f;", "Lc41/x2;", "l", "()Lc41/x2;", "g", "Lcom/whoop/design/util/TextResource;", "j", "()Lcom/whoop/design/util/TextResource;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "k", "i", "Li41/d;", "m", "()Li41/d;", "Lc41/s2;", "()Lc41/s2;", "Z", "o", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4141w2 implements InterfaceC25312u {

    /* JADX INFO: renamed from: o */
    public static final int f16853o = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Object event;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC4155y2 type;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int icon;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EnumC39333f iconColor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C4148x2 trend;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final EnumC39333f titleColor;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final TextResource metric;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final EnumC39333f backgroundColor;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C18084d trendBarViewState;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final String placeHolderMessage;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final C4113s2 keyMetricTileDialogContent;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final boolean useSmallValueText;

    public C4141w2(Object event, String id4, AbstractC4155y2 type, int i13, EnumC39333f enumC39333f, C4148x2 c4148x2, TextResource title, EnumC39333f titleColor, TextResource metric, EnumC39333f backgroundColor, C18084d c18084d, String str, C4113s2 c4113s2, boolean z4) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(titleColor, "titleColor");
        AbstractC22676k.m65750j(metric, "metric");
        AbstractC22676k.m65750j(backgroundColor, "backgroundColor");
        this.event = event;
        this.id = id4;
        this.type = type;
        this.icon = i13;
        this.iconColor = enumC39333f;
        this.trend = c4148x2;
        this.title = title;
        this.titleColor = titleColor;
        this.metric = metric;
        this.backgroundColor = backgroundColor;
        this.trendBarViewState = c18084d;
        this.placeHolderMessage = str;
        this.keyMetricTileDialogContent = c4113s2;
        this.useSmallValueText = z4;
    }

    /* JADX INFO: renamed from: a */
    public final C4141w2 m12873a(Object event, String id4, AbstractC4155y2 type, int icon, EnumC39333f iconColor, C4148x2 trend, TextResource title, EnumC39333f titleColor, TextResource metric, EnumC39333f backgroundColor, C18084d trendBarViewState, String placeHolderMessage, C4113s2 keyMetricTileDialogContent, boolean useSmallValueText) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(titleColor, "titleColor");
        AbstractC22676k.m65750j(metric, "metric");
        AbstractC22676k.m65750j(backgroundColor, "backgroundColor");
        return new C4141w2(event, id4, type, icon, iconColor, trend, title, titleColor, metric, backgroundColor, trendBarViewState, placeHolderMessage, keyMetricTileDialogContent, useSmallValueText);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC39333f getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getIcon() {
        return this.icon;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4141w2)) {
            return false;
        }
        C4141w2 c4141w2 = (C4141w2) other;
        return AbstractC22676k.m65745e(this.event, c4141w2.event) && AbstractC22676k.m65745e(this.id, c4141w2.id) && AbstractC22676k.m65745e(this.type, c4141w2.type) && this.icon == c4141w2.icon && this.iconColor == c4141w2.iconColor && AbstractC22676k.m65745e(this.trend, c4141w2.trend) && AbstractC22676k.m65745e(this.title, c4141w2.title) && this.titleColor == c4141w2.titleColor && AbstractC22676k.m65745e(this.metric, c4141w2.metric) && this.backgroundColor == c4141w2.backgroundColor && AbstractC22676k.m65745e(this.trendBarViewState, c4141w2.trendBarViewState) && AbstractC22676k.m65745e(this.placeHolderMessage, c4141w2.placeHolderMessage) && AbstractC22676k.m65745e(this.keyMetricTileDialogContent, c4141w2.keyMetricTileDialogContent) && this.useSmallValueText == c4141w2.useSmallValueText;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC39333f getIconColor() {
        return this.iconColor;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C4113s2 getKeyMetricTileDialogContent() {
        return this.keyMetricTileDialogContent;
    }

    @Override // p720m91.InterfaceC25312u
    public Object getEvent() {
        return this.event;
    }

    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextResource getMetric() {
        return this.metric;
    }

    public int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.icon, (this.type.hashCode() + AbstractC11266d.m30450d(this.event.hashCode() * 31, 31, this.id)) * 31, 31);
        EnumC39333f enumC39333f = this.iconColor;
        int iHashCode = (iM30448b + (enumC39333f == null ? 0 : enumC39333f.hashCode())) * 31;
        C4148x2 c4148x2 = this.trend;
        int iM61132c = AbstractC21702c.m61132c(this.backgroundColor, AbstractC31061c.m95625a(AbstractC21702c.m61132c(this.titleColor, AbstractC31061c.m95625a((iHashCode + (c4148x2 == null ? 0 : c4148x2.hashCode())) * 31, this.title, 31), 31), this.metric, 31), 31);
        C18084d c18084d = this.trendBarViewState;
        int iHashCode2 = (iM61132c + (c18084d == null ? 0 : c18084d.hashCode())) * 31;
        String str = this.placeHolderMessage;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        C4113s2 c4113s2 = this.keyMetricTileDialogContent;
        return Boolean.hashCode(this.useSmallValueText) + ((iHashCode3 + (c4113s2 != null ? c4113s2.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getPlaceHolderMessage() {
        return this.placeHolderMessage;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final EnumC39333f getTitleColor() {
        return this.titleColor;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final C4148x2 getTrend() {
        return this.trend;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final C18084d getTrendBarViewState() {
        return this.trendBarViewState;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final AbstractC4155y2 getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getUseSmallValueText() {
        return this.useSmallValueText;
    }

    public String toString() {
        return "KeyMetricTileState(event=" + this.event + ", id=" + this.id + ", type=" + this.type + ", icon=" + this.icon + ", iconColor=" + this.iconColor + ", trend=" + this.trend + ", title=" + this.title + ", titleColor=" + this.titleColor + ", metric=" + this.metric + ", backgroundColor=" + this.backgroundColor + ", trendBarViewState=" + this.trendBarViewState + ", placeHolderMessage=" + this.placeHolderMessage + ", keyMetricTileDialogContent=" + this.keyMetricTileDialogContent + ", useSmallValueText=" + this.useSmallValueText + ")";
    }

    public /* synthetic */ C4141w2(Object obj, String str, AbstractC4155y2 abstractC4155y2, int i13, EnumC39333f enumC39333f, C4148x2 c4148x2, TextResource textResource, EnumC39333f enumC39333f2, TextResource textResource2, EnumC39333f enumC39333f3, C18084d c18084d, String str2, C4113s2 c4113s2, boolean z4, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? C23454a0.f92919a : obj, (i14 & 2) != 0 ? "" : str, abstractC4155y2, i13, (i14 & 16) != 0 ? null : enumC39333f, (i14 & 32) != 0 ? null : c4148x2, textResource, (i14 & 128) != 0 ? EnumC39333f.WHITE_50 : enumC39333f2, (i14 & 256) != 0 ? new TextResource.C8688b(AbstractC16277f.f62327g0, null, 2, null) : textResource2, (i14 & 512) != 0 ? EnumC39333f.WHITE_10 : enumC39333f3, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : c18084d, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : str2, (i14 & 4096) != 0 ? null : c4113s2, (i14 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? false : z4);
    }
}
