package k81;

import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.C25306o;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: k81.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012Jt\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\u001f\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010\u0016R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b&\u0010)\u001a\u0004\b,\u0010+R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b(\u0010+R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b*\u0010-\u001a\u0004\b\"\u0010.R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b#\u0010/\u001a\u0004\b0\u00101¨\u00062"}, m65681d2 = {"Lk81/e;", "Lm91/u;", "", "id", "title", "subtitle", "", "Lm91/o;", "items", "", "sectionTopPadding", "sectionBottomPadding", "interItemPadding", "Lk81/a;", "alignment", "", "isVisible", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;FFFLk81/a;Z)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;FFFLk81/a;Z)Lk81/e;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "b", "j", "c", "i", "d", "Ljava/util/List;", "f", "()Ljava/util/List;", "e", "F", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()F", "g", "Lk81/a;", "()Lk81/a;", "Z", "k", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22295e implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String subtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<C25306o> items;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float sectionTopPadding;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final float sectionBottomPadding;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final float interItemPadding;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final EnumC22291a alignment;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean isVisible;

    public C22295e(String id4, String str, String str2, List<C25306o> items, float f13, float f14, float f15, EnumC22291a alignment, boolean z4) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(alignment, "alignment");
        this.id = id4;
        this.title = str;
        this.subtitle = str2;
        this.items = items;
        this.sectionTopPadding = f13;
        this.sectionBottomPadding = f14;
        this.interItemPadding = f15;
        this.alignment = alignment;
        this.isVisible = z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C22295e m64058b(C22295e c22295e, String str, String str2, String str3, List list, float f13, float f14, float f15, EnumC22291a enumC22291a, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c22295e.id;
        }
        if ((i13 & 2) != 0) {
            str2 = c22295e.title;
        }
        if ((i13 & 4) != 0) {
            str3 = c22295e.subtitle;
        }
        if ((i13 & 8) != 0) {
            list = c22295e.items;
        }
        if ((i13 & 16) != 0) {
            f13 = c22295e.sectionTopPadding;
        }
        if ((i13 & 32) != 0) {
            f14 = c22295e.sectionBottomPadding;
        }
        if ((i13 & 64) != 0) {
            f15 = c22295e.interItemPadding;
        }
        if ((i13 & 128) != 0) {
            enumC22291a = c22295e.alignment;
        }
        if ((i13 & 256) != 0) {
            z4 = c22295e.isVisible;
        }
        EnumC22291a enumC22291a2 = enumC22291a;
        boolean z13 = z4;
        float f16 = f14;
        float f17 = f15;
        float f18 = f13;
        String str4 = str3;
        return c22295e.m64059a(str, str2, str4, list, f18, f16, f17, enumC22291a2, z13);
    }

    /* JADX INFO: renamed from: a */
    public final C22295e m64059a(String id4, String title, String subtitle, List<C25306o> items, float sectionTopPadding, float sectionBottomPadding, float interItemPadding, EnumC22291a alignment, boolean isVisible) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(alignment, "alignment");
        return new C22295e(id4, title, subtitle, items, sectionTopPadding, sectionBottomPadding, interItemPadding, alignment, isVisible);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC22291a getAlignment() {
        return this.alignment;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getInterItemPadding() {
        return this.interItemPadding;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22295e)) {
            return false;
        }
        C22295e c22295e = (C22295e) other;
        return AbstractC22676k.m65745e(this.id, c22295e.id) && AbstractC22676k.m65745e(this.title, c22295e.title) && AbstractC22676k.m65745e(this.subtitle, c22295e.subtitle) && AbstractC22676k.m65745e(this.items, c22295e.items) && Float.compare(this.sectionTopPadding, c22295e.sectionTopPadding) == 0 && Float.compare(this.sectionBottomPadding, c22295e.sectionBottomPadding) == 0 && Float.compare(this.interItemPadding, c22295e.interItemPadding) == 0 && this.alignment == c22295e.alignment && this.isVisible == c22295e.isVisible;
    }

    /* JADX INFO: renamed from: f */
    public final List<C25306o> m64062f() {
        return this.items;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final float getSectionBottomPadding() {
        return this.sectionBottomPadding;
    }

    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final float getSectionTopPadding() {
        return this.sectionTopPadding;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        return Boolean.hashCode(this.isVisible) + ((this.alignment.hashCode() + AbstractC11266d.m30447a(this.interItemPadding, AbstractC11266d.m30447a(this.sectionBottomPadding, AbstractC11266d.m30447a(this.sectionTopPadding, AbstractC11895b.m31983b((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.items), 31), 31), 31)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.subtitle;
        List<C25306o> list = this.items;
        float f13 = this.sectionTopPadding;
        float f14 = this.sectionBottomPadding;
        float f15 = this.interItemPadding;
        EnumC22291a enumC22291a = this.alignment;
        boolean z4 = this.isVisible;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SectionState(id=", str, ", title=", str2, ", subtitle=");
        AbstractC36095b.m114694v(str3, ", items=", ", sectionTopPadding=", sbM32001t, list);
        AbstractC30802r.m94772u(sbM32001t, f13, ", sectionBottomPadding=", f14, ", interItemPadding=");
        sbM32001t.append(f15);
        sbM32001t.append(", alignment=");
        sbM32001t.append(enumC22291a);
        sbM32001t.append(", isVisible=");
        return AbstractC18489d0.m53372m(sbM32001t, z4, ")");
    }

    public /* synthetic */ C22295e(String str, String str2, String str3, List list, float f13, float f14, float f15, EnumC22291a enumC22291a, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, list, (i13 & 16) != 0 ? 0.0f : f13, (i13 & 32) != 0 ? 0.0f : f14, (i13 & 64) != 0 ? 8.0f : f15, (i13 & 128) != 0 ? EnumC22291a.LEADING : enumC22291a, (i13 & 256) != 0 ? true : z4);
    }
}
