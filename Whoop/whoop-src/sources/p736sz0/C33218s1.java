package p736sz0;

import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.InterfaceC39332e;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: sz0.s1 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001b\u0010#R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010 R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b!\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b)\u0010+\u001a\u0004\b'\u0010,R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b%\u0010+\u001a\u0004\b&\u0010,¨\u0006-"}, m65681d2 = {"Lsz0/s1;", "Lm91/u;", "", "id", "Lcom/whoop/design/util/TextResource;", "label", "Ly81/e;", "color", "units", "lineColor", "", "opacity", "Lsz0/u1;", "minValueState", "maxValueState", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;FLsz0/u1;Lsz0/u1;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "c", "Ly81/e;", "()Ly81/e;", "d", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "e", "f", "F", "g", "()F", "Lsz0/u1;", "()Lsz0/u1;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33218s1 implements InterfaceC25312u {

    /* JADX INFO: renamed from: i */
    public static final int f138525i = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource label;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC39332e color;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource units;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC39332e lineColor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final float opacity;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C33224u1 minValueState;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C33224u1 maxValueState;

    public C33218s1(String id4, TextResource label, InterfaceC39332e color, TextResource units, InterfaceC39332e lineColor, float f13, C33224u1 minValueState, C33224u1 maxValueState) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(color, "color");
        AbstractC22676k.m65750j(units, "units");
        AbstractC22676k.m65750j(lineColor, "lineColor");
        AbstractC22676k.m65750j(minValueState, "minValueState");
        AbstractC22676k.m65750j(maxValueState, "maxValueState");
        this.id = id4;
        this.label = label;
        this.color = color;
        this.units = units;
        this.lineColor = lineColor;
        this.opacity = f13;
        this.minValueState = minValueState;
        this.maxValueState = maxValueState;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC39332e getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC39332e getLineColor() {
        return this.lineColor;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C33224u1 getMaxValueState() {
        return this.maxValueState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33218s1)) {
            return false;
        }
        C33218s1 c33218s1 = (C33218s1) other;
        return AbstractC22676k.m65745e(this.id, c33218s1.id) && AbstractC22676k.m65745e(this.label, c33218s1.label) && AbstractC22676k.m65745e(this.color, c33218s1.color) && AbstractC22676k.m65745e(this.units, c33218s1.units) && AbstractC22676k.m65745e(this.lineColor, c33218s1.lineColor) && Float.compare(this.opacity, c33218s1.opacity) == 0 && AbstractC22676k.m65745e(this.minValueState, c33218s1.minValueState) && AbstractC22676k.m65745e(this.maxValueState, c33218s1.maxValueState);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C33224u1 getMinValueState() {
        return this.minValueState;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final float getOpacity() {
        return this.opacity;
    }

    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextResource getUnits() {
        return this.units;
    }

    public int hashCode() {
        return this.maxValueState.hashCode() + ((this.minValueState.hashCode() + AbstractC11266d.m30447a(this.opacity, AbstractC33745d.m106648g(this.lineColor, AbstractC31061c.m95625a(AbstractC33745d.m106648g(this.color, AbstractC31061c.m95625a(this.id.hashCode() * 31, this.label, 31), 31), this.units, 31), 31), 31)) * 31);
    }

    public String toString() {
        String str = this.id;
        TextResource textResource = this.label;
        InterfaceC39332e interfaceC39332e = this.color;
        TextResource textResource2 = this.units;
        InterfaceC39332e interfaceC39332e2 = this.lineColor;
        float f13 = this.opacity;
        C33224u1 c33224u1 = this.minValueState;
        C33224u1 c33224u2 = this.maxValueState;
        StringBuilder sbM91847q = AbstractC30007c.m91847q("ZoneRowState(id=", str, ", label=", textResource, ", color=");
        AbstractC33745d.m106665x(sbM91847q, interfaceC39332e, ", units=", textResource2, ", lineColor=");
        sbM91847q.append(interfaceC39332e2);
        sbM91847q.append(", opacity=");
        sbM91847q.append(f13);
        sbM91847q.append(", minValueState=");
        sbM91847q.append(c33224u1);
        sbM91847q.append(", maxValueState=");
        sbM91847q.append(c33224u2);
        sbM91847q.append(")");
        return sbM91847q.toString();
    }

    public /* synthetic */ C33218s1(String str, TextResource textResource, InterfaceC39332e interfaceC39332e, TextResource textResource2, InterfaceC39332e interfaceC39332e2, float f13, C33224u1 c33224u1, C33224u1 c33224u2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textResource, interfaceC39332e, textResource2, (i13 & 16) != 0 ? interfaceC39332e : interfaceC39332e2, (i13 & 32) != 0 ? 0.2f : f13, c33224u1, c33224u2);
    }
}
