package t51;

import hc3.AbstractC17176i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import p000.AbstractC11266d;
import p026b2.C2306l;
import p026b2.InterfaceC2301g;
import p088dc.AbstractC11895b;
import p291l0.InterfaceC22973k1;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.C25306o;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: t51.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001c\u0010!R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b\"\u0010!R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b'\u0010!R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b\u001f\u0010*R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b'\u0010.\u001a\u0004\b(\u0010/¨\u00060"}, m65681d2 = {"Lt51/c;", "Lm91/u;", "", "id", "Ly3/f;", "columnWidth", "", "Lm91/o;", "items", "horizontalSpacing", "verticalSpacing", "Ll0/k1;", "contentPadding", "Lb2/g;", "verticalAlignment", "", "numberOfColumns", "<init>", "(Ljava/lang/String;FLjava/util/List;FFLl0/k1;Lb2/g;Ljava/lang/Integer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "F", "()F", "c", "Ljava/util/List;", "e", "()Ljava/util/List;", "d", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "f", "Ll0/k1;", "()Ll0/k1;", "g", "Lb2/g;", "()Lb2/g;", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33544c implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float columnWidth;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<C25306o> items;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float horizontalSpacing;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float verticalSpacing;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC22973k1 contentPadding;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC2301g verticalAlignment;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final Integer numberOfColumns;

    public /* synthetic */ C33544c(String str, float f13, List list, float f14, float f15, InterfaceC22973k1 interfaceC22973k1, InterfaceC2301g interfaceC2301g, Integer num, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f13, list, f14, f15, interfaceC22973k1, interfaceC2301g, num);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getColumnWidth() {
        return this.columnWidth;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC22973k1 getContentPadding() {
        return this.contentPadding;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getHorizontalSpacing() {
        return this.horizontalSpacing;
    }

    /* JADX INFO: renamed from: e */
    public final List<C25306o> m105922e() {
        return this.items;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33544c)) {
            return false;
        }
        C33544c c33544c = (C33544c) other;
        return AbstractC22676k.m65745e(this.id, c33544c.id) && C39174f.m124782b(this.columnWidth, c33544c.columnWidth) && AbstractC22676k.m65745e(this.items, c33544c.items) && C39174f.m124782b(this.horizontalSpacing, c33544c.horizontalSpacing) && C39174f.m124782b(this.verticalSpacing, c33544c.verticalSpacing) && AbstractC22676k.m65745e(this.contentPadding, c33544c.contentPadding) && AbstractC22676k.m65745e(this.verticalAlignment, c33544c.verticalAlignment) && AbstractC22676k.m65745e(this.numberOfColumns, c33544c.numberOfColumns);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getNumberOfColumns() {
        return this.numberOfColumns;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final InterfaceC2301g getVerticalAlignment() {
        return this.verticalAlignment;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final float getVerticalSpacing() {
        return this.verticalSpacing;
    }

    public int hashCode() {
        int iM30447a = AbstractC11266d.m30447a(((C2306l) this.verticalAlignment).f9120a, (this.contentPadding.hashCode() + AbstractC11266d.m30447a(this.verticalSpacing, AbstractC11266d.m30447a(this.horizontalSpacing, AbstractC11895b.m31983b(AbstractC11266d.m30447a(this.columnWidth, this.id.hashCode() * 31, 31), 31, this.items), 31), 31)) * 31, 31);
        Integer num = this.numberOfColumns;
        return iM30447a + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        String str = this.id;
        String strM124783c = C39174f.m124783c(this.columnWidth);
        List<C25306o> list = this.items;
        String strM124783c2 = C39174f.m124783c(this.horizontalSpacing);
        String strM124783c3 = C39174f.m124783c(this.verticalSpacing);
        InterfaceC22973k1 interfaceC22973k1 = this.contentPadding;
        InterfaceC2301g interfaceC2301g = this.verticalAlignment;
        Integer num = this.numberOfColumns;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("DesignItemGridViewState(id=", str, ", columnWidth=", strM124783c, ", items=");
        AbstractC17176i.m48511m(", horizontalSpacing=", strM124783c2, ", verticalSpacing=", sbM32001t, list);
        sbM32001t.append(strM124783c3);
        sbM32001t.append(", contentPadding=");
        sbM32001t.append(interfaceC22973k1);
        sbM32001t.append(", verticalAlignment=");
        sbM32001t.append(interfaceC2301g);
        sbM32001t.append(", numberOfColumns=");
        sbM32001t.append(num);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    private C33544c(String id4, float f13, List<C25306o> items, float f14, float f15, InterfaceC22973k1 contentPadding, InterfaceC2301g verticalAlignment, Integer num) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(contentPadding, "contentPadding");
        AbstractC22676k.m65750j(verticalAlignment, "verticalAlignment");
        this.id = id4;
        this.columnWidth = f13;
        this.items = items;
        this.horizontalSpacing = f14;
        this.verticalSpacing = f15;
        this.contentPadding = contentPadding;
        this.verticalAlignment = verticalAlignment;
        this.numberOfColumns = num;
    }
}
