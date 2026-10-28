package p736sz0;

import java.util.List;
import p000.AbstractC11266d;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.InterfaceC2301g;
import p319m4.AbstractC25012a;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: sz0.m */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ4\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006!"}, m65681d2 = {"Lsz0/m;", "Lm91/u;", "", "items", "Lb2/g;", "verticalAlignment", "Ly3/f;", "horizontalSpacing", "<init>", "(Ljava/util/List;Lb2/g;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "(Ljava/util/List;Lb2/g;F)Lsz0/m;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "e", "()Ljava/util/List;", "b", "Lb2/g;", "f", "()Lb2/g;", "c", "F", "()F", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33198m implements InterfaceC25312u {

    /* JADX INFO: renamed from: d */
    public static final int f138411d = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC25312u> items;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC2301g verticalAlignment;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float horizontalSpacing;

    public /* synthetic */ C33198m(List list, InterfaceC2301g interfaceC2301g, float f13, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, interfaceC2301g, f13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C33198m m105204b(C33198m c33198m, List list, InterfaceC2301g interfaceC2301g, float f13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = c33198m.items;
        }
        if ((i13 & 2) != 0) {
            interfaceC2301g = c33198m.verticalAlignment;
        }
        if ((i13 & 4) != 0) {
            f13 = c33198m.horizontalSpacing;
        }
        return c33198m.m105205a(list, interfaceC2301g, f13);
    }

    /* JADX INFO: renamed from: a */
    public final C33198m m105205a(List<? extends InterfaceC25312u> items, InterfaceC2301g verticalAlignment, float horizontalSpacing) {
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(verticalAlignment, "verticalAlignment");
        return new C33198m(items, verticalAlignment, horizontalSpacing, null);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getHorizontalSpacing() {
        return this.horizontalSpacing;
    }

    /* JADX INFO: renamed from: e */
    public final List<InterfaceC25312u> m105207e() {
        return this.items;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33198m)) {
            return false;
        }
        C33198m c33198m = (C33198m) other;
        return AbstractC22676k.m65745e(this.items, c33198m.items) && AbstractC22676k.m65745e(this.verticalAlignment, c33198m.verticalAlignment) && C39174f.m124782b(this.horizontalSpacing, c33198m.horizontalSpacing);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final InterfaceC2301g getVerticalAlignment() {
        return this.verticalAlignment;
    }

    public int hashCode() {
        return Float.hashCode(this.horizontalSpacing) + AbstractC11266d.m30447a(((C2306l) this.verticalAlignment).f9120a, this.items.hashCode() * 31, 31);
    }

    public String toString() {
        List<InterfaceC25312u> list = this.items;
        InterfaceC2301g interfaceC2301g = this.verticalAlignment;
        String strM124783c = C39174f.m124783c(this.horizontalSpacing);
        StringBuilder sb4 = new StringBuilder("FlowRowState(items=");
        sb4.append(list);
        sb4.append(", verticalAlignment=");
        sb4.append(interfaceC2301g);
        sb4.append(", horizontalSpacing=");
        return AbstractC25012a.m73376i(strM124783c, ")", sb4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C33198m(List<? extends InterfaceC25312u> items, InterfaceC2301g verticalAlignment, float f13) {
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(verticalAlignment, "verticalAlignment");
        this.items = items;
        this.verticalAlignment = verticalAlignment;
        this.horizontalSpacing = f13;
    }

    public C33198m(List list, InterfaceC2301g interfaceC2301g, float f13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i13 & 2) != 0 ? C2299e.f9107J : interfaceC2301g, (i13 & 4) != 0 ? 1 * 8 : f13, null);
    }
}
