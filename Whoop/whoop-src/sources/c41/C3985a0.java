package c41;

import androidx.core.app.NotificationCompat;
import com.whoop.design.util.TextResource;
import gy0.AbstractC16272a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import p745y81.InterfaceC39332e;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: c41.a0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0003\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010JV\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b(\u0010*\u001a\u0004\b+\u0010\u0017R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b\"\u0010.R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b+\u0010-\u001a\u0004\b,\u0010.¨\u0006/"}, m65681d2 = {"Lc41/a0;", "Lm91/u;", "", NotificationCompat.CATEGORY_EVENT, "Lc41/b0;", "type", "Lcom/whoop/design/util/TextResource;", "title", "", "enabled", "", "resourceId", "Ly81/e;", "dashedOutlineColor", "fillColor", "<init>", "(Ljava/lang/Object;Lc41/b0;Lcom/whoop/design/util/TextResource;ZILy81/e;Ly81/e;)V", "a", "(Ljava/lang/Object;Lc41/b0;Lcom/whoop/design/util/TextResource;ZILy81/e;Ly81/e;)Lc41/a0;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "getEvent", "()Ljava/lang/Object;", "b", "Lc41/b0;", "i", "()Lc41/b0;", "c", "Lcom/whoop/design/util/TextResource;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/design/util/TextResource;", "d", "Z", "e", "()Z", "I", "g", "f", "Ly81/e;", "()Ly81/e;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3985a0 implements InterfaceC25312u {

    /* JADX INFO: renamed from: h */
    public static final int f16213h = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Object event;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC3992b0 type;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean enabled;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int resourceId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC39332e dashedOutlineColor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC39332e fillColor;

    public C3985a0(Object event, AbstractC3992b0 type, TextResource title, boolean z4, int i13, InterfaceC39332e dashedOutlineColor, InterfaceC39332e fillColor) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(dashedOutlineColor, "dashedOutlineColor");
        AbstractC22676k.m65750j(fillColor, "fillColor");
        this.event = event;
        this.type = type;
        this.title = title;
        this.enabled = z4;
        this.resourceId = i13;
        this.dashedOutlineColor = dashedOutlineColor;
        this.fillColor = fillColor;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C3985a0 m12026b(C3985a0 c3985a0, Object obj, AbstractC3992b0 abstractC3992b0, TextResource textResource, boolean z4, int i13, InterfaceC39332e interfaceC39332e, InterfaceC39332e interfaceC39332e2, int i14, Object obj2) {
        if ((i14 & 1) != 0) {
            obj = c3985a0.event;
        }
        if ((i14 & 2) != 0) {
            abstractC3992b0 = c3985a0.type;
        }
        if ((i14 & 4) != 0) {
            textResource = c3985a0.title;
        }
        if ((i14 & 8) != 0) {
            z4 = c3985a0.enabled;
        }
        if ((i14 & 16) != 0) {
            i13 = c3985a0.resourceId;
        }
        if ((i14 & 32) != 0) {
            interfaceC39332e = c3985a0.dashedOutlineColor;
        }
        if ((i14 & 64) != 0) {
            interfaceC39332e2 = c3985a0.fillColor;
        }
        InterfaceC39332e interfaceC39332e3 = interfaceC39332e;
        InterfaceC39332e interfaceC39332e4 = interfaceC39332e2;
        int i15 = i13;
        TextResource textResource2 = textResource;
        return c3985a0.m12027a(obj, abstractC3992b0, textResource2, z4, i15, interfaceC39332e3, interfaceC39332e4);
    }

    /* JADX INFO: renamed from: a */
    public final C3985a0 m12027a(Object event, AbstractC3992b0 type, TextResource title, boolean enabled, int resourceId, InterfaceC39332e dashedOutlineColor, InterfaceC39332e fillColor) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(dashedOutlineColor, "dashedOutlineColor");
        AbstractC22676k.m65750j(fillColor, "fillColor");
        return new C3985a0(event, type, title, enabled, resourceId, dashedOutlineColor, fillColor);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC39332e getDashedOutlineColor() {
        return this.dashedOutlineColor;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3985a0)) {
            return false;
        }
        C3985a0 c3985a0 = (C3985a0) other;
        return AbstractC22676k.m65745e(this.event, c3985a0.event) && AbstractC22676k.m65745e(this.type, c3985a0.type) && AbstractC22676k.m65745e(this.title, c3985a0.title) && this.enabled == c3985a0.enabled && this.resourceId == c3985a0.resourceId && AbstractC22676k.m65745e(this.dashedOutlineColor, c3985a0.dashedOutlineColor) && AbstractC22676k.m65745e(this.fillColor, c3985a0.fillColor);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final InterfaceC39332e getFillColor() {
        return this.fillColor;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getResourceId() {
        return this.resourceId;
    }

    @Override // p720m91.InterfaceC25312u
    /* JADX INFO: renamed from: getEvent, reason: from getter */
    public Object getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String() {
        return this.event;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.fillColor.hashCode() + AbstractC33745d.m106648g(this.dashedOutlineColor, AbstractC11266d.m30448b(this.resourceId, AbstractC2875y.m8289b(AbstractC31061c.m95625a((this.type.hashCode() + (this.event.hashCode() * 31)) * 31, this.title, 31), 31, this.enabled), 31), 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final AbstractC3992b0 getType() {
        return this.type;
    }

    public String toString() {
        Object obj = this.event;
        AbstractC3992b0 abstractC3992b0 = this.type;
        TextResource textResource = this.title;
        boolean z4 = this.enabled;
        int i13 = this.resourceId;
        InterfaceC39332e interfaceC39332e = this.dashedOutlineColor;
        InterfaceC39332e interfaceC39332e2 = this.fillColor;
        StringBuilder sb4 = new StringBuilder("AddTileState(event=");
        sb4.append(obj);
        sb4.append(", type=");
        sb4.append(abstractC3992b0);
        sb4.append(", title=");
        AbstractC33745d.m106664w(textResource, ", enabled=", ", resourceId=", sb4, z4);
        sb4.append(i13);
        sb4.append(", dashedOutlineColor=");
        sb4.append(interfaceC39332e);
        sb4.append(", fillColor=");
        sb4.append(interfaceC39332e2);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ C3985a0(Object obj, AbstractC3992b0 abstractC3992b0, TextResource textResource, boolean z4, int i13, InterfaceC39332e interfaceC39332e, InterfaceC39332e interfaceC39332e2, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? C23454a0.f92919a : obj, abstractC3992b0, textResource, (i14 & 8) != 0 ? true : z4, (i14 & 16) != 0 ? AbstractC16272a.f62074f : i13, (i14 & 32) != 0 ? EnumC39333f.ACCENT_ACTION : interfaceC39332e, (i14 & 64) != 0 ? EnumC39333f.ACCENT_ACTION : interfaceC39332e2);
    }
}
