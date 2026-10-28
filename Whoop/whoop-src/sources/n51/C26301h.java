package n51;

import java.util.List;
import m83.C25271y;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p026b2.C2299e;
import p026b2.InterfaceC2300f;
import p088dc.AbstractC11895b;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: n51.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000fR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u001b\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b \u0010%\u001a\u0004\b\u0018\u0010&¨\u0006'"}, m65681d2 = {"Ln51/h;", "Lm91/u;", "", "id", "", "items", "Ly3/f;", "spacing", "Lb2/f;", "horizontalAlignment", "Ln51/a;", "entrance", "<init>", "(Ljava/lang/String;Ljava/util/List;FLb2/f;Ln51/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "F", "e", "()F", "d", "Lb2/f;", "()Lb2/f;", "Ln51/a;", "()Ln51/a;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C26301h implements InterfaceC25312u {

    /* JADX INFO: renamed from: f */
    public static final int f104529f = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<InterfaceC25312u> items;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float spacing;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC2300f horizontalAlignment;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C26294a entrance;

    public /* synthetic */ C26301h(String str, List list, float f13, InterfaceC2300f interfaceC2300f, C26294a c26294a, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, f13, interfaceC2300f, c26294a);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C26294a getEntrance() {
        return this.entrance;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC2300f getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    /* JADX INFO: renamed from: c */
    public final List<InterfaceC25312u> m78052c() {
        return this.items;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getSpacing() {
        return this.spacing;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C26301h)) {
            return false;
        }
        C26301h c26301h = (C26301h) other;
        return AbstractC22676k.m65745e(this.id, c26301h.id) && AbstractC22676k.m65745e(this.items, c26301h.items) && C39174f.m124782b(this.spacing, c26301h.spacing) && AbstractC22676k.m65745e(this.horizontalAlignment, c26301h.horizontalAlignment) && AbstractC22676k.m65745e(this.entrance, c26301h.entrance);
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (this.horizontalAlignment.hashCode() + AbstractC11266d.m30447a(this.spacing, AbstractC11895b.m31983b((str == null ? 0 : str.hashCode()) * 31, 31, this.items), 31)) * 31;
        C26294a c26294a = this.entrance;
        return iHashCode + (c26294a != null ? c26294a.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        List<InterfaceC25312u> list = this.items;
        String strM124783c = C39174f.m124783c(this.spacing);
        InterfaceC2300f interfaceC2300f = this.horizontalAlignment;
        C26294a c26294a = this.entrance;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("ColumnViewState(id=", str, ", items=", ", spacing=", list);
        sbM94766o.append(strM124783c);
        sbM94766o.append(", horizontalAlignment=");
        sbM94766o.append(interfaceC2300f);
        sbM94766o.append(", entrance=");
        sbM94766o.append(c26294a);
        sbM94766o.append(")");
        return sbM94766o.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C26301h(String str, List<? extends InterfaceC25312u> items, float f13, InterfaceC2300f horizontalAlignment, C26294a c26294a) {
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(horizontalAlignment, "horizontalAlignment");
        this.id = str;
        this.items = items;
        this.spacing = f13;
        this.horizontalAlignment = horizontalAlignment;
        this.entrance = c26294a;
    }

    public C26301h(String str, List list, float f13, InterfaceC2300f interfaceC2300f, C26294a c26294a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? C25271y.f99162w : list, (i13 & 4) != 0 ? 0 : f13, (i13 & 8) != 0 ? C2299e.f9111N : interfaceC2300f, (i13 & 16) != 0 ? null : c26294a, null);
    }
}
