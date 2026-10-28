package fz0;

import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.InterfaceC39332e;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: fz0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001b\u0010%R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b!\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b+\u0010*\u001a\u0004\b#\u0010,R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b(\u0010*\u001a\u0004\b\u001f\u0010,¨\u0006-"}, m65681d2 = {"Lfz0/d;", "Lm91/u;", "Lfz0/e;", "zoneType", "Lcom/whoop/design/util/TextResource;", "label", "Ly81/e;", "color", "", "showThumb", "", "percentage", "Ly3/f;", "height", "currentZoneCoveredAlpha", "<init>", "(Lfz0/e;Lcom/whoop/design/util/TextResource;Ly81/e;ZFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lfz0/e;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lfz0/e;", "b", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "c", "Ly81/e;", "()Ly81/e;", "d", "Z", "g", "()Z", "F", "f", "()F", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C14889d implements InterfaceC25312u {

    /* JADX INFO: renamed from: h */
    public static final int f55552h = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC14890e zoneType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource label;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC39332e color;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean showThumb;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float percentage;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final float height;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final float currentZoneCoveredAlpha;

    public /* synthetic */ C14889d(EnumC14890e enumC14890e, TextResource textResource, InterfaceC39332e interfaceC39332e, boolean z4, float f13, float f14, float f15, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC14890e, textResource, interfaceC39332e, z4, f13, f14, f15);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC39332e getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getCurrentZoneCoveredAlpha() {
        return this.currentZoneCoveredAlpha;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getLabel() {
        return this.label;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14889d)) {
            return false;
        }
        C14889d c14889d = (C14889d) other;
        return this.zoneType == c14889d.zoneType && AbstractC22676k.m65745e(this.label, c14889d.label) && AbstractC22676k.m65745e(this.color, c14889d.color) && this.showThumb == c14889d.showThumb && Float.compare(this.percentage, c14889d.percentage) == 0 && C39174f.m124782b(this.height, c14889d.height) && Float.compare(this.currentZoneCoveredAlpha, c14889d.currentZoneCoveredAlpha) == 0;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getPercentage() {
        return this.percentage;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getShowThumb() {
        return this.showThumb;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final EnumC14890e getZoneType() {
        return this.zoneType;
    }

    public int hashCode() {
        return Float.hashCode(this.currentZoneCoveredAlpha) + AbstractC11266d.m30447a(this.height, AbstractC11266d.m30447a(this.percentage, AbstractC2875y.m8289b(AbstractC33745d.m106648g(this.color, AbstractC31061c.m95625a(this.zoneType.hashCode() * 31, this.label, 31), 31), 31, this.showThumb), 31), 31);
    }

    public String toString() {
        EnumC14890e enumC14890e = this.zoneType;
        TextResource textResource = this.label;
        InterfaceC39332e interfaceC39332e = this.color;
        boolean z4 = this.showThumb;
        float f13 = this.percentage;
        String strM124783c = C39174f.m124783c(this.height);
        float f14 = this.currentZoneCoveredAlpha;
        StringBuilder sb4 = new StringBuilder("HrZoneState(zoneType=");
        sb4.append(enumC14890e);
        sb4.append(", label=");
        sb4.append(textResource);
        sb4.append(", color=");
        sb4.append(interfaceC39332e);
        sb4.append(", showThumb=");
        sb4.append(z4);
        sb4.append(", percentage=");
        sb4.append(f13);
        sb4.append(", height=");
        sb4.append(strM124783c);
        sb4.append(", currentZoneCoveredAlpha=");
        return AbstractC30007c.m91837g(f14, ")", sb4);
    }

    private C14889d(EnumC14890e zoneType, TextResource label, InterfaceC39332e color, boolean z4, float f13, float f14, float f15) {
        AbstractC22676k.m65750j(zoneType, "zoneType");
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(color, "color");
        this.zoneType = zoneType;
        this.label = label;
        this.color = color;
        this.showThumb = z4;
        this.percentage = f13;
        this.height = f14;
        this.currentZoneCoveredAlpha = f15;
    }

    public C14889d(EnumC14890e enumC14890e, TextResource textResource, InterfaceC39332e interfaceC39332e, boolean z4, float f13, float f14, float f15, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC14890e, textResource, interfaceC39332e, z4, (i13 & 16) != 0 ? 0.0f : f13, (i13 & 32) != 0 ? ((float) 1.5d) * 4 : f14, f15, null);
    }
}
