package yy0;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.InterfaceC39332e;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: yy0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJR\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010#\u001a\u0004\b&\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001e\u0010'\u001a\u0004\b\"\u0010(¨\u0006)"}, m65681d2 = {"Lyy0/c;", "", "Lcom/whoop/design/util/TextResource;", "label", "subLabel", "Ly81/e;", "color", "", "xPercent", "yPercent", "Lgz0/m0;", "icon", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFLgz0/m0;)V", "a", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFLgz0/m0;)Lyy0/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "b", "f", "c", "Ly81/e;", "()Ly81/e;", "d", "F", "g", "()F", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lgz0/m0;", "()Lgz0/m0;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C39889c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource label;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource subLabel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC39332e color;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float xPercent;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float yPercent;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    public C39889c(TextResource label, TextResource textResource, InterfaceC39332e interfaceC39332e, float f13, float f14, EnumC16313m0 enumC16313m0) {
        AbstractC22676k.m65750j(label, "label");
        this.label = label;
        this.subLabel = textResource;
        this.color = interfaceC39332e;
        this.xPercent = f13;
        this.yPercent = f14;
        this.icon = enumC16313m0;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C39889c m127975b(C39889c c39889c, TextResource textResource, TextResource textResource2, InterfaceC39332e interfaceC39332e, float f13, float f14, EnumC16313m0 enumC16313m0, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = c39889c.label;
        }
        if ((i13 & 2) != 0) {
            textResource2 = c39889c.subLabel;
        }
        if ((i13 & 4) != 0) {
            interfaceC39332e = c39889c.color;
        }
        if ((i13 & 8) != 0) {
            f13 = c39889c.xPercent;
        }
        if ((i13 & 16) != 0) {
            f14 = c39889c.yPercent;
        }
        if ((i13 & 32) != 0) {
            enumC16313m0 = c39889c.icon;
        }
        float f15 = f14;
        EnumC16313m0 enumC16313m1 = enumC16313m0;
        return c39889c.m127976a(textResource, textResource2, interfaceC39332e, f13, f15, enumC16313m1);
    }

    /* JADX INFO: renamed from: a */
    public final C39889c m127976a(TextResource label, TextResource subLabel, InterfaceC39332e color, float xPercent, float yPercent, EnumC16313m0 icon) {
        AbstractC22676k.m65750j(label, "label");
        return new C39889c(label, subLabel, color, xPercent, yPercent, icon);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC39332e getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getLabel() {
        return this.label;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C39889c)) {
            return false;
        }
        C39889c c39889c = (C39889c) other;
        return AbstractC22676k.m65745e(this.label, c39889c.label) && AbstractC22676k.m65745e(this.subLabel, c39889c.subLabel) && AbstractC22676k.m65745e(this.color, c39889c.color) && Float.compare(this.xPercent, c39889c.xPercent) == 0 && Float.compare(this.yPercent, c39889c.yPercent) == 0 && this.icon == c39889c.icon;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getSubLabel() {
        return this.subLabel;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final float getXPercent() {
        return this.xPercent;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final float getYPercent() {
        return this.yPercent;
    }

    public int hashCode() {
        int iHashCode = this.label.hashCode() * 31;
        TextResource textResource = this.subLabel;
        int iHashCode2 = (iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31;
        InterfaceC39332e interfaceC39332e = this.color;
        int iM30447a = AbstractC11266d.m30447a(this.yPercent, AbstractC11266d.m30447a(this.xPercent, (iHashCode2 + (interfaceC39332e == null ? 0 : interfaceC39332e.hashCode())) * 31, 31), 31);
        EnumC16313m0 enumC16313m0 = this.icon;
        return iM30447a + (enumC16313m0 != null ? enumC16313m0.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.label;
        TextResource textResource2 = this.subLabel;
        InterfaceC39332e interfaceC39332e = this.color;
        float f13 = this.xPercent;
        float f14 = this.yPercent;
        EnumC16313m0 enumC16313m0 = this.icon;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("AxisLabelState(label=", textResource, ", subLabel=", textResource2, ", color=");
        sbM106658q.append(interfaceC39332e);
        sbM106658q.append(", xPercent=");
        sbM106658q.append(f13);
        sbM106658q.append(", yPercent=");
        sbM106658q.append(f14);
        sbM106658q.append(", icon=");
        sbM106658q.append(enumC16313m0);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }

    public /* synthetic */ C39889c(TextResource textResource, TextResource textResource2, InterfaceC39332e interfaceC39332e, float f13, float f14, EnumC16313m0 enumC16313m0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 2) != 0 ? null : textResource2, (i13 & 4) != 0 ? null : interfaceC39332e, (i13 & 8) != 0 ? 0.0f : f13, (i13 & 16) != 0 ? 0.0f : f14, (i13 & 32) != 0 ? null : enumC16313m0);
    }
}
