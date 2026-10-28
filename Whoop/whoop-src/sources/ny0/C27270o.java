package ny0;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import p745y81.InterfaceC39332e;
import te0.AbstractC33745d;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: ny0.o */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b%\u0010\u0016J\u001a\u0010'\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010)\u001a\u0004\b*\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010+\u001a\u0004\b,\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010-\u001a\u0004\b.\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010-\u001a\u0004\b/\u0010\u0018R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010-\u001a\u0004\b0\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001a\u00101\u001a\u0004\b2\u0010\u001cR\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001b\u00101\u001a\u0004\b3\u0010\u001cR\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001d\u00101\u001a\u0004\b4\u0010\u001cR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001e\u00105\u001a\u0004\b6\u0010 R\u0017\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001f\u00101\u001a\u0004\b7\u0010\u001c¨\u00068"}, m65681d2 = {"Lny0/o;", "", "Lny0/q;", "type", "", "resource", "Ly81/e;", "color", "circleColor", "pressedColor", "", "enabled", "nonFunctional", "shouldKeepOriginalIconColor", "", "alpha", "fill", "<init>", "(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZ)V", "a", "()Lny0/q;", "c", "()I", "d", "()Ly81/e;", "e", "f", "g", "()Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "j", "()F", "b", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Lny0/q;", "m", "I", "l", "Ly81/e;", "getColor", "getCircleColor", "getPressedColor", "Z", "k", "getNonFunctional", "getShouldKeepOriginalIconColor", "F", "getAlpha", "getFill", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C27270o {

    /* JADX INFO: renamed from: k */
    public static final int f109105k = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC27274q type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int resource;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC39332e color;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC39332e circleColor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC39332e pressedColor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean enabled;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean nonFunctional;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean shouldKeepOriginalIconColor;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final float alpha;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final boolean fill;

    public C27270o(AbstractC27274q type, int i13, InterfaceC39332e color, InterfaceC39332e interfaceC39332e, InterfaceC39332e pressedColor, boolean z4, boolean z13, boolean z14, float f13, boolean z15) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(color, "color");
        AbstractC22676k.m65750j(pressedColor, "pressedColor");
        this.type = type;
        this.resource = i13;
        this.color = color;
        this.circleColor = interfaceC39332e;
        this.pressedColor = pressedColor;
        this.enabled = z4;
        this.nonFunctional = z13;
        this.shouldKeepOriginalIconColor = z14;
        this.alpha = f13;
        this.fill = z15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC27274q getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getFill() {
        return this.fill;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getResource() {
        return this.resource;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC39332e getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC39332e getCircleColor() {
        return this.circleColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C27270o)) {
            return false;
        }
        C27270o c27270o = (C27270o) other;
        return AbstractC22676k.m65745e(this.type, c27270o.type) && this.resource == c27270o.resource && AbstractC22676k.m65745e(this.color, c27270o.color) && AbstractC22676k.m65745e(this.circleColor, c27270o.circleColor) && AbstractC22676k.m65745e(this.pressedColor, c27270o.pressedColor) && this.enabled == c27270o.enabled && this.nonFunctional == c27270o.nonFunctional && this.shouldKeepOriginalIconColor == c27270o.shouldKeepOriginalIconColor && Float.compare(this.alpha, c27270o.alpha) == 0 && this.fill == c27270o.fill;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final InterfaceC39332e getPressedColor() {
        return this.pressedColor;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getNonFunctional() {
        return this.nonFunctional;
    }

    public int hashCode() {
        int iM106648g = AbstractC33745d.m106648g(this.color, AbstractC11266d.m30448b(this.resource, this.type.hashCode() * 31, 31), 31);
        InterfaceC39332e interfaceC39332e = this.circleColor;
        return Boolean.hashCode(this.fill) + AbstractC11266d.m30447a(this.alpha, AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC33745d.m106648g(this.pressedColor, (iM106648g + (interfaceC39332e == null ? 0 : interfaceC39332e.hashCode())) * 31, 31), 31, this.enabled), 31, this.nonFunctional), 31, this.shouldKeepOriginalIconColor), 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getShouldKeepOriginalIconColor() {
        return this.shouldKeepOriginalIconColor;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final float getAlpha() {
        return this.alpha;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m82249k() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: l */
    public final int m82250l() {
        return this.resource;
    }

    /* JADX INFO: renamed from: m */
    public final AbstractC27274q m82251m() {
        return this.type;
    }

    public String toString() {
        AbstractC27274q abstractC27274q = this.type;
        int i13 = this.resource;
        InterfaceC39332e interfaceC39332e = this.color;
        InterfaceC39332e interfaceC39332e2 = this.circleColor;
        InterfaceC39332e interfaceC39332e3 = this.pressedColor;
        boolean z4 = this.enabled;
        boolean z13 = this.nonFunctional;
        boolean z14 = this.shouldKeepOriginalIconColor;
        float f13 = this.alpha;
        boolean z15 = this.fill;
        StringBuilder sb4 = new StringBuilder("IconButtonState(type=");
        sb4.append(abstractC27274q);
        sb4.append(", resource=");
        sb4.append(i13);
        sb4.append(", color=");
        sb4.append(interfaceC39332e);
        sb4.append(", circleColor=");
        sb4.append(interfaceC39332e2);
        sb4.append(", pressedColor=");
        sb4.append(interfaceC39332e3);
        sb4.append(", enabled=");
        sb4.append(z4);
        sb4.append(", nonFunctional=");
        AbstractC38963t7.m124392v(sb4, z13, ", shouldKeepOriginalIconColor=", z14, ", alpha=");
        sb4.append(f13);
        sb4.append(", fill=");
        sb4.append(z15);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ C27270o(AbstractC27274q abstractC27274q, int i13, InterfaceC39332e interfaceC39332e, InterfaceC39332e interfaceC39332e2, InterfaceC39332e interfaceC39332e3, boolean z4, boolean z13, boolean z14, float f13, boolean z15, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC27274q, i13, (i14 & 4) != 0 ? EnumC39333f.BRAND_WHITE : interfaceC39332e, (i14 & 8) != 0 ? null : interfaceC39332e2, (i14 & 16) != 0 ? EnumC39333f.BRAND_BLACK : interfaceC39332e3, (i14 & 32) != 0 ? true : z4, (i14 & 64) != 0 ? false : z13, (i14 & 128) != 0 ? false : z14, (i14 & 256) != 0 ? 1.0f : f13, (i14 & 512) != 0 ? false : z15);
    }
}
