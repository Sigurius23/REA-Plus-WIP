package j61;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p208i2.C17919x;
import p319m4.AbstractC25012a;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: j61.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0094\u0001\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00132\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010&R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010$\u001a\u0004\b,\u0010&R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b)\u0010/R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b+\u00102R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b,\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b6\u00108R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b9\u00107\u001a\u0004\b:\u00108R\u0017\u0010\u0010\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b:\u00107\u001a\u0004\b;\u00108R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b9\u0010=R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b4\u0010>\u001a\u0004\b0\u0010?R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b*\u0010$\u001a\u0004\b-\u0010&¨\u0006@"}, m65681d2 = {"Lj61/c;", "", "", "xPercent", "yPercent", "widthPercent", "heightPercent", "Ly81/e;", "background", "Lj61/a;", "dimension", "Lj61/e;", "type", "Lcom/whoop/design/util/TextResource;", "label", "secondLabel", "subLabel", "Lj61/b;", "labelStyle", "", "fadeTop", "Ly3/f;", "extraBottom", "<init>", "(FFFFLy81/e;Lj61/a;Lj61/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lj61/b;ZFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "(FFFFLy81/e;Lj61/a;Lj61/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lj61/b;ZF)Lj61/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "F", "n", "()F", "b", "o", "c", "m", "d", "g", "e", "Ly81/e;", "()Ly81/e;", "f", "Lj61/a;", "()Lj61/a;", "Lj61/e;", "l", "()Lj61/e;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "i", "j", "k", "Lj61/b;", "()Lj61/b;", "Z", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21369c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float xPercent;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float yPercent;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float widthPercent;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float heightPercent;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC39332e background;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final EnumC21367a dimension;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final EnumC21371e type;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final TextResource label;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final TextResource secondLabel;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final TextResource subLabel;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final EnumC21368b labelStyle;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final boolean fadeTop;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final float extraBottom;

    /* JADX INFO: renamed from: j61.c$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f81730w = new a();

        /* JADX INFO: renamed from: a */
        public final long m59974a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m59974a((C39336i) obj));
        }
    }

    public /* synthetic */ C21369c(float f13, float f14, float f15, float f16, InterfaceC39332e interfaceC39332e, EnumC21367a enumC21367a, EnumC21371e enumC21371e, TextResource textResource, TextResource textResource2, TextResource textResource3, EnumC21368b enumC21368b, boolean z4, float f17, DefaultConstructorMarker defaultConstructorMarker) {
        this(f13, f14, f15, f16, interfaceC39332e, enumC21367a, enumC21371e, textResource, textResource2, textResource3, enumC21368b, z4, f17);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C21369c m59959b(C21369c c21369c, float f13, float f14, float f15, float f16, InterfaceC39332e interfaceC39332e, EnumC21367a enumC21367a, EnumC21371e enumC21371e, TextResource textResource, TextResource textResource2, TextResource textResource3, EnumC21368b enumC21368b, boolean z4, float f17, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f13 = c21369c.xPercent;
        }
        return c21369c.m59960a(f13, (i13 & 2) != 0 ? c21369c.yPercent : f14, (i13 & 4) != 0 ? c21369c.widthPercent : f15, (i13 & 8) != 0 ? c21369c.heightPercent : f16, (i13 & 16) != 0 ? c21369c.background : interfaceC39332e, (i13 & 32) != 0 ? c21369c.dimension : enumC21367a, (i13 & 64) != 0 ? c21369c.type : enumC21371e, (i13 & 128) != 0 ? c21369c.label : textResource, (i13 & 256) != 0 ? c21369c.secondLabel : textResource2, (i13 & 512) != 0 ? c21369c.subLabel : textResource3, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c21369c.labelStyle : enumC21368b, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c21369c.fadeTop : z4, (i13 & 4096) != 0 ? c21369c.extraBottom : f17);
    }

    /* JADX INFO: renamed from: a */
    public final C21369c m59960a(float xPercent, float yPercent, float widthPercent, float heightPercent, InterfaceC39332e background, EnumC21367a dimension, EnumC21371e type, TextResource label, TextResource secondLabel, TextResource subLabel, EnumC21368b labelStyle, boolean fadeTop, float extraBottom) {
        AbstractC22676k.m65750j(background, "background");
        AbstractC22676k.m65750j(dimension, "dimension");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(secondLabel, "secondLabel");
        AbstractC22676k.m65750j(subLabel, "subLabel");
        return new C21369c(xPercent, yPercent, widthPercent, heightPercent, background, dimension, type, label, secondLabel, subLabel, labelStyle, fadeTop, extraBottom, null);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC39332e getBackground() {
        return this.background;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final EnumC21367a getDimension() {
        return this.dimension;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getExtraBottom() {
        return this.extraBottom;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21369c)) {
            return false;
        }
        C21369c c21369c = (C21369c) other;
        return Float.compare(this.xPercent, c21369c.xPercent) == 0 && Float.compare(this.yPercent, c21369c.yPercent) == 0 && Float.compare(this.widthPercent, c21369c.widthPercent) == 0 && Float.compare(this.heightPercent, c21369c.heightPercent) == 0 && AbstractC22676k.m65745e(this.background, c21369c.background) && this.dimension == c21369c.dimension && this.type == c21369c.type && AbstractC22676k.m65745e(this.label, c21369c.label) && AbstractC22676k.m65745e(this.secondLabel, c21369c.secondLabel) && AbstractC22676k.m65745e(this.subLabel, c21369c.subLabel) && this.labelStyle == c21369c.labelStyle && this.fadeTop == c21369c.fadeTop && C39174f.m124782b(this.extraBottom, c21369c.extraBottom);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getFadeTop() {
        return this.fadeTop;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final float getHeightPercent() {
        return this.heightPercent;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextResource getLabel() {
        return this.label;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a((this.type.hashCode() + ((this.dimension.hashCode() + AbstractC33745d.m106648g(this.background, AbstractC11266d.m30447a(this.heightPercent, AbstractC11266d.m30447a(this.widthPercent, AbstractC11266d.m30447a(this.yPercent, Float.hashCode(this.xPercent) * 31, 31), 31), 31), 31)) * 31)) * 31, this.label, 31), this.secondLabel, 31), this.subLabel, 31);
        EnumC21368b enumC21368b = this.labelStyle;
        return Float.hashCode(this.extraBottom) + AbstractC2875y.m8289b((iM95625a + (enumC21368b == null ? 0 : enumC21368b.hashCode())) * 31, 31, this.fadeTop);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final EnumC21368b getLabelStyle() {
        return this.labelStyle;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final TextResource getSecondLabel() {
        return this.secondLabel;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final TextResource getSubLabel() {
        return this.subLabel;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final EnumC21371e getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final float getWidthPercent() {
        return this.widthPercent;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final float getXPercent() {
        return this.xPercent;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final float getYPercent() {
        return this.yPercent;
    }

    public String toString() {
        float f13 = this.xPercent;
        float f14 = this.yPercent;
        float f15 = this.widthPercent;
        float f16 = this.heightPercent;
        InterfaceC39332e interfaceC39332e = this.background;
        EnumC21367a enumC21367a = this.dimension;
        EnumC21371e enumC21371e = this.type;
        TextResource textResource = this.label;
        TextResource textResource2 = this.secondLabel;
        TextResource textResource3 = this.subLabel;
        EnumC21368b enumC21368b = this.labelStyle;
        boolean z4 = this.fadeTop;
        String strM124783c = C39174f.m124783c(this.extraBottom);
        StringBuilder sbM8307t = AbstractC2875y.m8307t("GraphAnnotationState(xPercent=", f13, ", yPercent=", f14, ", widthPercent=");
        AbstractC30802r.m94772u(sbM8307t, f15, ", heightPercent=", f16, ", background=");
        sbM8307t.append(interfaceC39332e);
        sbM8307t.append(", dimension=");
        sbM8307t.append(enumC21367a);
        sbM8307t.append(", type=");
        sbM8307t.append(enumC21371e);
        sbM8307t.append(", label=");
        sbM8307t.append(textResource);
        sbM8307t.append(", secondLabel=");
        AbstractC30007c.m91855y(sbM8307t, textResource2, ", subLabel=", textResource3, ", labelStyle=");
        sbM8307t.append(enumC21368b);
        sbM8307t.append(", fadeTop=");
        sbM8307t.append(z4);
        sbM8307t.append(", extraBottom=");
        return AbstractC25012a.m73376i(strM124783c, ")", sbM8307t);
    }

    private C21369c(float f13, float f14, float f15, float f16, InterfaceC39332e background, EnumC21367a dimension, EnumC21371e type, TextResource label, TextResource secondLabel, TextResource subLabel, EnumC21368b enumC21368b, boolean z4, float f17) {
        AbstractC22676k.m65750j(background, "background");
        AbstractC22676k.m65750j(dimension, "dimension");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(secondLabel, "secondLabel");
        AbstractC22676k.m65750j(subLabel, "subLabel");
        this.xPercent = f13;
        this.yPercent = f14;
        this.widthPercent = f15;
        this.heightPercent = f16;
        this.background = background;
        this.dimension = dimension;
        this.type = type;
        this.label = label;
        this.secondLabel = secondLabel;
        this.subLabel = subLabel;
        this.labelStyle = enumC21368b;
        this.fadeTop = z4;
        this.extraBottom = f17;
    }

    public C21369c(float f13, float f14, float f15, float f16, InterfaceC39332e interfaceC39332e, EnumC21367a enumC21367a, EnumC21371e enumC21371e, TextResource textResource, TextResource textResource2, TextResource textResource3, EnumC21368b enumC21368b, boolean z4, float f17, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0.0f : f13, (i13 & 2) != 0 ? 0.0f : f14, (i13 & 4) != 0 ? 1.0f : f15, (i13 & 8) != 0 ? 1.0f : f16, (i13 & 16) != 0 ? p745y81.Function1.m125323a(a.f81730w) : interfaceC39332e, enumC21367a, enumC21371e, (i13 & 128) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 256) != 0 ? AbstractC8693b.m21267a() : textResource2, (i13 & 512) != 0 ? AbstractC8693b.m21267a() : textResource3, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : enumC21368b, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? false : z4, (i13 & 4096) != 0 ? 0 : f17, null);
    }
}
