package bm2;

import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import hc3.AbstractC17176i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jh3.AbstractC21702c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: bm2.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b&\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010\u001fR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001d\u001a\u0004\b\u001c\u0010\u001fR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010)\u001a\u0004\b'\u0010*R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, m65681d2 = {"Lbm2/f;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "Lgz0/m0;", "icon", "Lbm2/h0;", "meter", "subtitle", "subtitleSuffix", "description", "Lbm2/i0;", "modal", "Ly81/f;", "backgroundColor", "<init>", "(Lcom/whoop/design/util/TextResource;Lgz0/m0;Lbm2/h0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lbm2/i0;Ly81/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "g", "()Lcom/whoop/design/util/TextResource;", "b", "Lgz0/m0;", "()Lgz0/m0;", "c", "Lbm2/h0;", "()Lbm2/h0;", "d", "e", "f", "Lbm2/i0;", "()Lbm2/i0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ly81/f;", "getBackgroundColor", "()Ly81/f;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3438f implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C3445h0 meter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource subtitleSuffix;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextResource description;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C3448i0 modal;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final EnumC39333f backgroundColor;

    public C3438f(TextResource title, EnumC16313m0 icon, C3445h0 meter, TextResource subtitle, TextResource subtitleSuffix, TextResource description, C3448i0 c3448i0, EnumC39333f backgroundColor) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(meter, "meter");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(subtitleSuffix, "subtitleSuffix");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(backgroundColor, "backgroundColor");
        this.title = title;
        this.icon = icon;
        this.meter = meter;
        this.subtitle = subtitle;
        this.subtitleSuffix = subtitleSuffix;
        this.description = description;
        this.modal = c3448i0;
        this.backgroundColor = backgroundColor;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C3445h0 getMeter() {
        return this.meter;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C3448i0 getModal() {
        return this.modal;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3438f)) {
            return false;
        }
        C3438f c3438f = (C3438f) other;
        return AbstractC22676k.m65745e(this.title, c3438f.title) && this.icon == c3438f.icon && AbstractC22676k.m65745e(this.meter, c3438f.meter) && AbstractC22676k.m65745e(this.subtitle, c3438f.subtitle) && AbstractC22676k.m65745e(this.subtitleSuffix, c3438f.subtitleSuffix) && AbstractC22676k.m65745e(this.description, c3438f.description) && AbstractC22676k.m65745e(this.modal, c3438f.modal) && this.backgroundColor == c3438f.backgroundColor;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getSubtitleSuffix() {
        return this.subtitleSuffix;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a((this.meter.hashCode() + AbstractC17176i.m48500b(this.icon, this.title.hashCode() * 31, 31)) * 31, this.subtitle, 31), this.subtitleSuffix, 31), this.description, 31);
        C3448i0 c3448i0 = this.modal;
        return this.backgroundColor.hashCode() + ((iM95625a + (c3448i0 == null ? 0 : c3448i0.hashCode())) * 31);
    }

    public String toString() {
        TextResource textResource = this.title;
        EnumC16313m0 enumC16313m0 = this.icon;
        C3445h0 c3445h0 = this.meter;
        TextResource textResource2 = this.subtitle;
        TextResource textResource3 = this.subtitleSuffix;
        TextResource textResource4 = this.description;
        C3448i0 c3448i0 = this.modal;
        EnumC39333f enumC39333f = this.backgroundColor;
        StringBuilder sbM61140k = AbstractC21702c.m61140k("FitnessLevelCardState(title=", textResource, ", icon=", enumC16313m0, ", meter=");
        sbM61140k.append(c3445h0);
        sbM61140k.append(", subtitle=");
        sbM61140k.append(textResource2);
        sbM61140k.append(", subtitleSuffix=");
        AbstractC30007c.m91855y(sbM61140k, textResource3, ", description=", textResource4, ", modal=");
        sbM61140k.append(c3448i0);
        sbM61140k.append(", backgroundColor=");
        sbM61140k.append(enumC39333f);
        sbM61140k.append(")");
        return sbM61140k.toString();
    }

    public /* synthetic */ C3438f(TextResource textResource, EnumC16313m0 enumC16313m0, C3445h0 c3445h0, TextResource textResource2, TextResource textResource3, TextResource textResource4, C3448i0 c3448i0, EnumC39333f enumC39333f, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, enumC16313m0, c3445h0, textResource2, textResource3, textResource4, c3448i0, (i13 & 128) != 0 ? EnumC39333f.WHITE_5 : enumC39333f);
    }
}
