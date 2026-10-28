package l71;

import java.util.List;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: l71.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Ll71/d;", "Lm91/u;", "", "id", "", "items", "Ly3/f;", "bottomContentInset", "<init>", "(Ljava/lang/String;Ljava/util/List;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "F", "()F", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C23393d implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<InterfaceC25312u> items;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float bottomContentInset;

    public /* synthetic */ C23393d(String str, List list, float f13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, f13);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getBottomContentInset() {
        return this.bottomContentInset;
    }

    /* JADX INFO: renamed from: b */
    public final List<InterfaceC25312u> m67703b() {
        return this.items;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C23393d)) {
            return false;
        }
        C23393d c23393d = (C23393d) other;
        return AbstractC22676k.m65745e(this.id, c23393d.id) && AbstractC22676k.m65745e(this.items, c23393d.items) && C39174f.m124782b(this.bottomContentInset, c23393d.bottomContentInset);
    }

    public int hashCode() {
        String str = this.id;
        return Float.hashCode(this.bottomContentInset) + AbstractC11895b.m31983b((str == null ? 0 : str.hashCode()) * 31, 31, this.items);
    }

    public String toString() {
        return AbstractC25012a.m73376i(C39174f.m124783c(this.bottomContentInset), ")", AbstractC30802r.m94766o("GroupedItemsPanelViewState(id=", this.id, ", items=", ", bottomContentInset=", this.items));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C23393d(String str, List<? extends InterfaceC25312u> items, float f13) {
        AbstractC22676k.m65750j(items, "items");
        this.id = str;
        this.items = items;
        this.bottomContentInset = f13;
    }
}
