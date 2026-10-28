package ny0;

import b91.C2886a;
import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p132f0.C13825t;
import p163g1.InterfaceC15156u0;
import p208i2.AbstractC17911t;
import p291l0.C22976l1;
import p291l0.InterfaceC22973k1;
import p555vl.AbstractC36095b;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: ny0.a0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J~\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0012HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00122\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b)\u0010/R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b0\u00102R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b+\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b'\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b7\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b<\u0010>R\u0017\u0010\u0014\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b?\u0010=\u001a\u0004\b?\u0010>¨\u0006@"}, m65681d2 = {"Lny0/a0;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "text", "Lg1/u0;", "buttonColors", "Li2/t;", "brushBackground", "Lf0/t;", "border", "Ly3/f;", "borderRadius", "Ll0/k1;", "paddingValues", "Lb91/a;", "buttonTextStyle", "", "icon", "", "enabled", "fillMaxWidth", "<init>", "(Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Ljava/lang/Integer;ZZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "(Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Ljava/lang/Integer;ZZ)Lny0/a0;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "m", "()Lcom/whoop/design/util/TextResource;", "b", "Lg1/u0;", "g", "()Lg1/u0;", "c", "Li2/t;", "f", "()Li2/t;", "d", "Lf0/t;", "()Lf0/t;", "e", "F", "()F", "Ll0/k1;", "l", "()Ll0/k1;", "Lb91/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lb91/a;", "Ljava/lang/Integer;", "k", "()Ljava/lang/Integer;", "i", "Z", "()Z", "j", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C27238a0 implements InterfaceC25312u {

    /* JADX INFO: renamed from: k */
    public static final int f109008k = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource text;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC15156u0 buttonColors;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC17911t brushBackground;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C13825t border;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float borderRadius;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC22973k1 paddingValues;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C2886a buttonTextStyle;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final Integer icon;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean enabled;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final boolean fillMaxWidth;

    public /* synthetic */ C27238a0(TextResource textResource, InterfaceC15156u0 interfaceC15156u0, AbstractC17911t abstractC17911t, C13825t c13825t, float f13, InterfaceC22973k1 interfaceC22973k1, C2886a c2886a, Integer num, boolean z4, boolean z13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, interfaceC15156u0, abstractC17911t, c13825t, f13, interfaceC22973k1, c2886a, num, z4, z13);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C27238a0 m82077b(C27238a0 c27238a0, TextResource textResource, InterfaceC15156u0 interfaceC15156u0, AbstractC17911t abstractC17911t, C13825t c13825t, float f13, InterfaceC22973k1 interfaceC22973k1, C2886a c2886a, Integer num, boolean z4, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = c27238a0.text;
        }
        if ((i13 & 2) != 0) {
            interfaceC15156u0 = c27238a0.buttonColors;
        }
        if ((i13 & 4) != 0) {
            abstractC17911t = c27238a0.brushBackground;
        }
        if ((i13 & 8) != 0) {
            c13825t = c27238a0.border;
        }
        if ((i13 & 16) != 0) {
            f13 = c27238a0.borderRadius;
        }
        if ((i13 & 32) != 0) {
            interfaceC22973k1 = c27238a0.paddingValues;
        }
        if ((i13 & 64) != 0) {
            c2886a = c27238a0.buttonTextStyle;
        }
        if ((i13 & 128) != 0) {
            num = c27238a0.icon;
        }
        if ((i13 & 256) != 0) {
            z4 = c27238a0.enabled;
        }
        if ((i13 & 512) != 0) {
            z13 = c27238a0.fillMaxWidth;
        }
        boolean z14 = z4;
        boolean z15 = z13;
        C2886a c2886a2 = c2886a;
        Integer num2 = num;
        float f14 = f13;
        InterfaceC22973k1 interfaceC22973k2 = interfaceC22973k1;
        return c27238a0.m82078a(textResource, interfaceC15156u0, abstractC17911t, c13825t, f14, interfaceC22973k2, c2886a2, num2, z14, z15);
    }

    /* JADX INFO: renamed from: a */
    public final C27238a0 m82078a(TextResource text, InterfaceC15156u0 buttonColors, AbstractC17911t brushBackground, C13825t border, float borderRadius, InterfaceC22973k1 paddingValues, C2886a buttonTextStyle, Integer icon, boolean enabled, boolean fillMaxWidth) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(paddingValues, "paddingValues");
        return new C27238a0(text, buttonColors, brushBackground, border, borderRadius, paddingValues, buttonTextStyle, icon, enabled, fillMaxWidth, null);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C13825t getBorder() {
        return this.border;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getBorderRadius() {
        return this.borderRadius;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C27238a0)) {
            return false;
        }
        C27238a0 c27238a0 = (C27238a0) other;
        return AbstractC22676k.m65745e(this.text, c27238a0.text) && AbstractC22676k.m65745e(this.buttonColors, c27238a0.buttonColors) && AbstractC22676k.m65745e(this.brushBackground, c27238a0.brushBackground) && AbstractC22676k.m65745e(this.border, c27238a0.border) && C39174f.m124782b(this.borderRadius, c27238a0.borderRadius) && AbstractC22676k.m65745e(this.paddingValues, c27238a0.paddingValues) && AbstractC22676k.m65745e(this.buttonTextStyle, c27238a0.buttonTextStyle) && AbstractC22676k.m65745e(this.icon, c27238a0.icon) && this.enabled == c27238a0.enabled && this.fillMaxWidth == c27238a0.fillMaxWidth;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final AbstractC17911t getBrushBackground() {
        return this.brushBackground;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final InterfaceC15156u0 getButtonColors() {
        return this.buttonColors;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C2886a getButtonTextStyle() {
        return this.buttonTextStyle;
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        InterfaceC15156u0 interfaceC15156u0 = this.buttonColors;
        int iHashCode2 = (iHashCode + (interfaceC15156u0 == null ? 0 : interfaceC15156u0.hashCode())) * 31;
        AbstractC17911t abstractC17911t = this.brushBackground;
        int iHashCode3 = (iHashCode2 + (abstractC17911t == null ? 0 : abstractC17911t.hashCode())) * 31;
        C13825t c13825t = this.border;
        int iHashCode4 = (this.paddingValues.hashCode() + AbstractC11266d.m30447a(this.borderRadius, (iHashCode3 + (c13825t == null ? 0 : c13825t.hashCode())) * 31, 31)) * 31;
        C2886a c2886a = this.buttonTextStyle;
        int iHashCode5 = (iHashCode4 + (c2886a == null ? 0 : c2886a.hashCode())) * 31;
        Integer num = this.icon;
        return Boolean.hashCode(this.fillMaxWidth) + AbstractC2875y.m8289b((iHashCode5 + (num != null ? num.hashCode() : 0)) * 31, 31, this.enabled);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getFillMaxWidth() {
        return this.fillMaxWidth;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Integer getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final InterfaceC22973k1 getPaddingValues() {
        return this.paddingValues;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final TextResource getText() {
        return this.text;
    }

    public String toString() {
        TextResource textResource = this.text;
        InterfaceC15156u0 interfaceC15156u0 = this.buttonColors;
        AbstractC17911t abstractC17911t = this.brushBackground;
        C13825t c13825t = this.border;
        String strM124783c = C39174f.m124783c(this.borderRadius);
        InterfaceC22973k1 interfaceC22973k1 = this.paddingValues;
        C2886a c2886a = this.buttonTextStyle;
        Integer num = this.icon;
        boolean z4 = this.enabled;
        boolean z13 = this.fillMaxWidth;
        StringBuilder sb4 = new StringBuilder("PrimaryButtonV2ViewState(text=");
        sb4.append(textResource);
        sb4.append(", buttonColors=");
        sb4.append(interfaceC15156u0);
        sb4.append(", brushBackground=");
        sb4.append(abstractC17911t);
        sb4.append(", border=");
        sb4.append(c13825t);
        sb4.append(", borderRadius=");
        sb4.append(strM124783c);
        sb4.append(", paddingValues=");
        sb4.append(interfaceC22973k1);
        sb4.append(", buttonTextStyle=");
        sb4.append(c2886a);
        sb4.append(", icon=");
        sb4.append(num);
        sb4.append(", enabled=");
        return AbstractC36095b.m114682j(sb4, z4, ", fillMaxWidth=", z13, ")");
    }

    private C27238a0(TextResource text, InterfaceC15156u0 interfaceC15156u0, AbstractC17911t abstractC17911t, C13825t c13825t, float f13, InterfaceC22973k1 paddingValues, C2886a c2886a, Integer num, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(paddingValues, "paddingValues");
        this.text = text;
        this.buttonColors = interfaceC15156u0;
        this.brushBackground = abstractC17911t;
        this.border = c13825t;
        this.borderRadius = f13;
        this.paddingValues = paddingValues;
        this.buttonTextStyle = c2886a;
        this.icon = num;
        this.enabled = z4;
        this.fillMaxWidth = z13;
    }

    public C27238a0(TextResource textResource, InterfaceC15156u0 interfaceC15156u0, AbstractC17911t abstractC17911t, C13825t c13825t, float f13, InterfaceC22973k1 interfaceC22973k1, C2886a c2886a, Integer num, boolean z4, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        float f14;
        InterfaceC22973k1 c22976l1;
        InterfaceC15156u0 interfaceC15156u1 = (i13 & 2) != 0 ? null : interfaceC15156u0;
        AbstractC17911t abstractC17911t2 = (i13 & 4) != 0 ? null : abstractC17911t;
        C13825t c13825t2 = (i13 & 8) != 0 ? null : c13825t;
        if ((i13 & 16) != 0) {
            float f15 = 4;
            f14 = f15 * f15;
        } else {
            f14 = f13;
        }
        if ((i13 & 32) != 0) {
            float f16 = 8;
            float f17 = 1 * f16;
            float f18 = 2 * f16;
            c22976l1 = new C22976l1(f17, f18, f17, f18);
        } else {
            c22976l1 = interfaceC22973k1;
        }
        this(textResource, interfaceC15156u1, abstractC17911t2, c13825t2, f14, c22976l1, (i13 & 64) != 0 ? null : c2886a, (i13 & 128) != 0 ? null : num, (i13 & 256) != 0 ? true : z4, (i13 & 512) != 0 ? true : z13, null);
    }
}
