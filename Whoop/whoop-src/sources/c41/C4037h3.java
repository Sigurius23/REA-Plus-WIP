package c41;

import androidx.core.app.NotificationCompat;
import com.whoop.design.util.TextResource;
import hy0.C17750h1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import ny0.C27273p0;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: c41.h3 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ`\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b\"\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010#\u001a\u0004\b \u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, m65681d2 = {"Lc41/h3;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "value", "valueSuffix", "Lhy0/h1;", "statusTag", "Lny0/p0;", "updateButtonState", "", NotificationCompat.CATEGORY_EVENT, "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhy0/h1;Lny0/p0;Ljava/lang/Object;)V", "a", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhy0/h1;Lny0/p0;Ljava/lang/Object;)Lc41/h3;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "b", "d", "c", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lhy0/h1;", "()Lhy0/h1;", "f", "Lny0/p0;", "()Lny0/p0;", "Ljava/lang/Object;", "getEvent", "()Ljava/lang/Object;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4037h3 implements InterfaceC25312u {

    /* JADX INFO: renamed from: h */
    public static final int f16382h = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource value;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource valueSuffix;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C17750h1 statusTag;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C27273p0 updateButtonState;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Object event;

    public C4037h3(TextResource title, TextResource textResource, TextResource textResource2, TextResource textResource3, C17750h1 c17750h1, C27273p0 c27273p0, Object event) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(event, "event");
        this.title = title;
        this.subtitle = textResource;
        this.value = textResource2;
        this.valueSuffix = textResource3;
        this.statusTag = c17750h1;
        this.updateButtonState = c27273p0;
        this.event = event;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C4037h3 m12297b(C4037h3 c4037h3, TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, C17750h1 c17750h1, C27273p0 c27273p0, Object obj, int i13, Object obj2) {
        if ((i13 & 1) != 0) {
            textResource = c4037h3.title;
        }
        if ((i13 & 2) != 0) {
            textResource2 = c4037h3.subtitle;
        }
        if ((i13 & 4) != 0) {
            textResource3 = c4037h3.value;
        }
        if ((i13 & 8) != 0) {
            textResource4 = c4037h3.valueSuffix;
        }
        if ((i13 & 16) != 0) {
            c17750h1 = c4037h3.statusTag;
        }
        if ((i13 & 32) != 0) {
            c27273p0 = c4037h3.updateButtonState;
        }
        if ((i13 & 64) != 0) {
            obj = c4037h3.event;
        }
        C27273p0 c27273p1 = c27273p0;
        Object obj3 = obj;
        C17750h1 c17750h2 = c17750h1;
        TextResource textResource5 = textResource3;
        return c4037h3.m12298a(textResource, textResource2, textResource5, textResource4, c17750h2, c27273p1, obj3);
    }

    /* JADX INFO: renamed from: a */
    public final C4037h3 m12298a(TextResource title, TextResource subtitle, TextResource value, TextResource valueSuffix, C17750h1 statusTag, C27273p0 updateButtonState, Object event) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(event, "event");
        return new C4037h3(title, subtitle, value, valueSuffix, statusTag, updateButtonState, event);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C17750h1 getStatusTag() {
        return this.statusTag;
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
        if (!(other instanceof C4037h3)) {
            return false;
        }
        C4037h3 c4037h3 = (C4037h3) other;
        return AbstractC22676k.m65745e(this.title, c4037h3.title) && AbstractC22676k.m65745e(this.subtitle, c4037h3.subtitle) && AbstractC22676k.m65745e(this.value, c4037h3.value) && AbstractC22676k.m65745e(this.valueSuffix, c4037h3.valueSuffix) && AbstractC22676k.m65745e(this.statusTag, c4037h3.statusTag) && AbstractC22676k.m65745e(this.updateButtonState, c4037h3.updateButtonState) && AbstractC22676k.m65745e(this.event, c4037h3.event);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C27273p0 getUpdateButtonState() {
        return this.updateButtonState;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextResource getValueSuffix() {
        return this.valueSuffix;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        TextResource textResource = this.subtitle;
        int iHashCode2 = (iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31;
        TextResource textResource2 = this.value;
        int iHashCode3 = (iHashCode2 + (textResource2 == null ? 0 : textResource2.hashCode())) * 31;
        TextResource textResource3 = this.valueSuffix;
        int iHashCode4 = (iHashCode3 + (textResource3 == null ? 0 : textResource3.hashCode())) * 31;
        C17750h1 c17750h1 = this.statusTag;
        int iHashCode5 = (iHashCode4 + (c17750h1 == null ? 0 : c17750h1.hashCode())) * 31;
        C27273p0 c27273p0 = this.updateButtonState;
        return this.event.hashCode() + ((iHashCode5 + (c27273p0 != null ? c27273p0.hashCode() : 0)) * 31);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        TextResource textResource3 = this.value;
        TextResource textResource4 = this.valueSuffix;
        C17750h1 c17750h1 = this.statusTag;
        C27273p0 c27273p0 = this.updateButtonState;
        Object obj = this.event;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("MetricStatusTileState(title=", textResource, ", subtitle=", textResource2, ", value=");
        AbstractC30007c.m91855y(sbM106658q, textResource3, ", valueSuffix=", textResource4, ", statusTag=");
        sbM106658q.append(c17750h1);
        sbM106658q.append(", updateButtonState=");
        sbM106658q.append(c27273p0);
        sbM106658q.append(", event=");
        return AbstractC2875y.m8303p(sbM106658q, ")", obj);
    }

    public /* synthetic */ C4037h3(TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, C17750h1 c17750h1, C27273p0 c27273p0, Object obj, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, (i13 & 2) != 0 ? null : textResource2, (i13 & 4) != 0 ? null : textResource3, (i13 & 8) != 0 ? null : textResource4, (i13 & 16) != 0 ? null : c17750h1, (i13 & 32) != 0 ? null : c27273p0, (i13 & 64) != 0 ? C23454a0.f92919a : obj);
    }
}
