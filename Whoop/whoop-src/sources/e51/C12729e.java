package e51;

import b91.EnumC2888c;
import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p31.AbstractC28805p;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: e51.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012Jh\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0016R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b'\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b%\u00102R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b+\u00103\u001a\u0004\b0\u00104R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b \u00103\u001a\u0004\b5\u00104¨\u00066"}, m65681d2 = {"Le51/e;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "", "type", "", "items", "Le51/d;", "spacingType", "Lb91/c;", "titleTypography", "Lp31/p$a;", "headerState", "Ly3/f;", "leadingPadding", "trailingPadding", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;Le51/d;Lb91/c;Lp31/p$a;FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;Le51/d;Lb91/c;Lp31/p$a;FF)Le51/e;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/design/util/TextResource;", "b", "Ljava/lang/String;", "k", "c", "Ljava/util/List;", "e", "()Ljava/util/List;", "d", "Le51/d;", "g", "()Le51/d;", "Lb91/c;", "i", "()Lb91/c;", "f", "Lp31/p$a;", "()Lp31/p$a;", "F", "()F", "j", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C12729e implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String type;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<InterfaceC25312u> items;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC12728d spacingType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EnumC2888c titleTypography;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final AbstractC28805p.a headerState;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final float leadingPadding;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final float trailingPadding;

    public /* synthetic */ C12729e(TextResource textResource, String str, List list, EnumC12728d enumC12728d, EnumC2888c enumC2888c, AbstractC28805p.a aVar, float f13, float f14, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, str, list, enumC12728d, enumC2888c, aVar, f13, f14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C12729e m35590b(C12729e c12729e, TextResource textResource, String str, List list, EnumC12728d enumC12728d, EnumC2888c enumC2888c, AbstractC28805p.a aVar, float f13, float f14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = c12729e.title;
        }
        if ((i13 & 2) != 0) {
            str = c12729e.type;
        }
        if ((i13 & 4) != 0) {
            list = c12729e.items;
        }
        if ((i13 & 8) != 0) {
            enumC12728d = c12729e.spacingType;
        }
        if ((i13 & 16) != 0) {
            enumC2888c = c12729e.titleTypography;
        }
        if ((i13 & 32) != 0) {
            aVar = c12729e.headerState;
        }
        if ((i13 & 64) != 0) {
            f13 = c12729e.leadingPadding;
        }
        if ((i13 & 128) != 0) {
            f14 = c12729e.trailingPadding;
        }
        float f15 = f13;
        float f16 = f14;
        EnumC2888c enumC2888c2 = enumC2888c;
        AbstractC28805p.a aVar2 = aVar;
        return c12729e.m35591a(textResource, str, list, enumC12728d, enumC2888c2, aVar2, f15, f16);
    }

    /* JADX INFO: renamed from: a */
    public final C12729e m35591a(TextResource title, String type, List<? extends InterfaceC25312u> items, EnumC12728d spacingType, EnumC2888c titleTypography, AbstractC28805p.a headerState, float leadingPadding, float trailingPadding) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(spacingType, "spacingType");
        AbstractC22676k.m65750j(titleTypography, "titleTypography");
        return new C12729e(title, type, items, spacingType, titleTypography, headerState, leadingPadding, trailingPadding, null);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AbstractC28805p.a getHeaderState() {
        return this.headerState;
    }

    /* JADX INFO: renamed from: e */
    public final List<InterfaceC25312u> m35593e() {
        return this.items;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C12729e)) {
            return false;
        }
        C12729e c12729e = (C12729e) other;
        return AbstractC22676k.m65745e(this.title, c12729e.title) && AbstractC22676k.m65745e(this.type, c12729e.type) && AbstractC22676k.m65745e(this.items, c12729e.items) && this.spacingType == c12729e.spacingType && this.titleTypography == c12729e.titleTypography && AbstractC22676k.m65745e(this.headerState, c12729e.headerState) && C39174f.m124782b(this.leadingPadding, c12729e.leadingPadding) && C39174f.m124782b(this.trailingPadding, c12729e.trailingPadding);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getLeadingPadding() {
        return this.leadingPadding;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final EnumC12728d getSpacingType() {
        return this.spacingType;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = (this.titleTypography.hashCode() + ((this.spacingType.hashCode() + AbstractC11895b.m31983b(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.type), 31, this.items)) * 31)) * 31;
        AbstractC28805p.a aVar = this.headerState;
        return Float.hashCode(this.trailingPadding) + AbstractC11266d.m30447a(this.leadingPadding, (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final EnumC2888c getTitleTypography() {
        return this.titleTypography;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final float getTrailingPadding() {
        return this.trailingPadding;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public String toString() {
        TextResource textResource = this.title;
        String str = this.type;
        List<InterfaceC25312u> list = this.items;
        EnumC12728d enumC12728d = this.spacingType;
        EnumC2888c enumC2888c = this.titleTypography;
        AbstractC28805p.a aVar = this.headerState;
        String strM124783c = C39174f.m124783c(this.leadingPadding);
        String strM124783c2 = C39174f.m124783c(this.trailingPadding);
        StringBuilder sbM91845o = AbstractC30007c.m91845o("AnchorSectionState(title=", textResource, ", type=", str, ", items=");
        sbM91845o.append(list);
        sbM91845o.append(", spacingType=");
        sbM91845o.append(enumC12728d);
        sbM91845o.append(", titleTypography=");
        sbM91845o.append(enumC2888c);
        sbM91845o.append(", headerState=");
        sbM91845o.append(aVar);
        sbM91845o.append(", leadingPadding=");
        return AbstractC11266d.m30464r(sbM91845o, strM124783c, ", trailingPadding=", strM124783c2, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C12729e(TextResource title, String type, List<? extends InterfaceC25312u> items, EnumC12728d spacingType, EnumC2888c titleTypography, AbstractC28805p.a aVar, float f13, float f14) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(spacingType, "spacingType");
        AbstractC22676k.m65750j(titleTypography, "titleTypography");
        this.title = title;
        this.type = type;
        this.items = items;
        this.spacingType = spacingType;
        this.titleTypography = titleTypography;
        this.headerState = aVar;
        this.leadingPadding = f13;
        this.trailingPadding = f14;
    }

    public /* synthetic */ C12729e(TextResource textResource, String str, List list, EnumC12728d enumC12728d, EnumC2888c enumC2888c, AbstractC28805p.a aVar, float f13, float f14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, str, list, (i13 & 8) != 0 ? EnumC12728d.NORMAL : enumC12728d, (i13 & 16) != 0 ? EnumC2888c.H5 : enumC2888c, (i13 & 32) != 0 ? null : aVar, (i13 & 64) != 0 ? AbstractC12730f.m35600a() : f13, (i13 & 128) != 0 ? AbstractC12730f.m35600a() : f14, null);
    }
}
