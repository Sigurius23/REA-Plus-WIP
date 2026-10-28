package g61;

import com.mapbox.maps.MapboxMap;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import m83.C25271y;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.InterfaceC39332e;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import yy0.C39889c;

/* JADX INFO: renamed from: g61.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013Jj\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b$\u0010,\u001a\u0004\b(\u0010-R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b'\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b/\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b \u00104\u001a\u0004\b&\u00105R\u0017\u00107\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b2\u0010.\u001a\u0004\b6\u00100¨\u00068"}, m65681d2 = {"Lg61/b;", "", "", "size", "", "Lyy0/c;", "labels", MapboxMap.QFE_OFFSET, "Lg61/d;", "type", "Lcom/whoop/design/util/TextResource;", "axisDescription", "", "scrimPresent", "Lg61/c;", "style", "Ly81/e;", "axisColorOverride", "<init>", "(FLjava/util/List;FLg61/d;Lcom/whoop/design/util/TextResource;ZLg61/c;Ly81/e;)V", "a", "(FLjava/util/List;FLg61/d;Lcom/whoop/design/util/TextResource;ZLg61/c;Ly81/e;)Lg61/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "F", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()F", "b", "Ljava/util/List;", "e", "()Ljava/util/List;", "c", "f", "d", "Lg61/d;", "j", "()Lg61/d;", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "Z", "g", "()Z", "Lg61/c;", "i", "()Lg61/c;", "Ly81/e;", "()Ly81/e;", "k", "isZeroOffsetTimeMarker", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C15529b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float size;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C39889c> labels;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float offset;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC15531d type;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource axisDescription;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean scrimPresent;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final EnumC15530c style;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final InterfaceC39332e axisColorOverride;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean isZeroOffsetTimeMarker;

    public C15529b(float f13, List<C39889c> labels, float f14, EnumC15531d type, TextResource axisDescription, boolean z4, EnumC15530c enumC15530c, InterfaceC39332e interfaceC39332e) {
        AbstractC22676k.m65750j(labels, "labels");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(axisDescription, "axisDescription");
        this.size = f13;
        this.labels = labels;
        this.offset = f14;
        this.type = type;
        this.axisDescription = axisDescription;
        this.scrimPresent = z4;
        this.style = enumC15530c;
        this.axisColorOverride = interfaceC39332e;
        this.isZeroOffsetTimeMarker = (type == EnumC15531d.TIME_MARKER || type == EnumC15531d.TIME_MARKER_WITHOUT_BULB) && f14 == 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C15529b m43718b(C15529b c15529b, float f13, List list, float f14, EnumC15531d enumC15531d, TextResource textResource, boolean z4, EnumC15530c enumC15530c, InterfaceC39332e interfaceC39332e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f13 = c15529b.size;
        }
        if ((i13 & 2) != 0) {
            list = c15529b.labels;
        }
        if ((i13 & 4) != 0) {
            f14 = c15529b.offset;
        }
        if ((i13 & 8) != 0) {
            enumC15531d = c15529b.type;
        }
        if ((i13 & 16) != 0) {
            textResource = c15529b.axisDescription;
        }
        if ((i13 & 32) != 0) {
            z4 = c15529b.scrimPresent;
        }
        if ((i13 & 64) != 0) {
            enumC15530c = c15529b.style;
        }
        if ((i13 & 128) != 0) {
            interfaceC39332e = c15529b.axisColorOverride;
        }
        EnumC15530c enumC15530c2 = enumC15530c;
        InterfaceC39332e interfaceC39332e2 = interfaceC39332e;
        TextResource textResource2 = textResource;
        boolean z13 = z4;
        return c15529b.m43719a(f13, list, f14, enumC15531d, textResource2, z13, enumC15530c2, interfaceC39332e2);
    }

    /* JADX INFO: renamed from: a */
    public final C15529b m43719a(float size, List<C39889c> labels, float offset, EnumC15531d type, TextResource axisDescription, boolean scrimPresent, EnumC15530c style, InterfaceC39332e axisColorOverride) {
        AbstractC22676k.m65750j(labels, "labels");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(axisDescription, "axisDescription");
        return new C15529b(size, labels, offset, type, axisDescription, scrimPresent, style, axisColorOverride);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC39332e getAxisColorOverride() {
        return this.axisColorOverride;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getAxisDescription() {
        return this.axisDescription;
    }

    /* JADX INFO: renamed from: e */
    public final List<C39889c> m43722e() {
        return this.labels;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C15529b)) {
            return false;
        }
        C15529b c15529b = (C15529b) other;
        return Float.compare(this.size, c15529b.size) == 0 && AbstractC22676k.m65745e(this.labels, c15529b.labels) && Float.compare(this.offset, c15529b.offset) == 0 && this.type == c15529b.type && AbstractC22676k.m65745e(this.axisDescription, c15529b.axisDescription) && this.scrimPresent == c15529b.scrimPresent && this.style == c15529b.style && AbstractC22676k.m65745e(this.axisColorOverride, c15529b.axisColorOverride);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getOffset() {
        return this.offset;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getScrimPresent() {
        return this.scrimPresent;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final float getSize() {
        return this.size;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC31061c.m95625a((this.type.hashCode() + AbstractC11266d.m30447a(this.offset, AbstractC11895b.m31983b(Float.hashCode(this.size) * 31, 31, this.labels), 31)) * 31, this.axisDescription, 31), 31, this.scrimPresent);
        EnumC15530c enumC15530c = this.style;
        int iHashCode = (iM8289b + (enumC15530c == null ? 0 : enumC15530c.hashCode())) * 31;
        InterfaceC39332e interfaceC39332e = this.axisColorOverride;
        return iHashCode + (interfaceC39332e != null ? interfaceC39332e.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final EnumC15530c getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final EnumC15531d getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getIsZeroOffsetTimeMarker() {
        return this.isZeroOffsetTimeMarker;
    }

    public String toString() {
        float f13 = this.size;
        List<C39889c> list = this.labels;
        float f14 = this.offset;
        EnumC15531d enumC15531d = this.type;
        TextResource textResource = this.axisDescription;
        boolean z4 = this.scrimPresent;
        EnumC15530c enumC15530c = this.style;
        InterfaceC39332e interfaceC39332e = this.axisColorOverride;
        StringBuilder sb4 = new StringBuilder("GraphAxisState(size=");
        sb4.append(f13);
        sb4.append(", labels=");
        sb4.append(list);
        sb4.append(", offset=");
        sb4.append(f14);
        sb4.append(", type=");
        sb4.append(enumC15531d);
        sb4.append(", axisDescription=");
        AbstractC33745d.m106664w(textResource, ", scrimPresent=", ", style=", sb4, z4);
        sb4.append(enumC15530c);
        sb4.append(", axisColorOverride=");
        sb4.append(interfaceC39332e);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ C15529b(float f13, List list, float f14, EnumC15531d enumC15531d, TextResource textResource, boolean z4, EnumC15530c enumC15530c, InterfaceC39332e interfaceC39332e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0.1f : f13, (i13 & 2) != 0 ? C25271y.f99162w : list, (i13 & 4) != 0 ? 0.0f : f14, (i13 & 8) != 0 ? EnumC15531d.STANDARD : enumC15531d, (i13 & 16) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 32) != 0 ? false : z4, (i13 & 64) != 0 ? null : enumC15530c, (i13 & 128) != 0 ? null : interfaceC39332e);
    }
}
