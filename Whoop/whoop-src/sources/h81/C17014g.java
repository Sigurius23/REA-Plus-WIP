package h81;

import java.util.List;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p736sz0.C33169c0;

/* JADX INFO: renamed from: h81.g */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u0019\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lh81/g;", "Lm91/u;", "Lsz0/c0;", "title", "", "items", "Lh81/f;", "style", "<init>", "(Lsz0/c0;Ljava/util/List;Lh81/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsz0/c0;", "c", "()Lsz0/c0;", "b", "Ljava/util/List;", "()Ljava/util/List;", "Lh81/f;", "()Lh81/f;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17014g implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C33169c0 title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<InterfaceC25312u> items;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC17013f style;

    /* JADX WARN: Multi-variable type inference failed */
    public C17014g(C33169c0 title, List<? extends InterfaceC25312u> items, EnumC17013f style) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(style, "style");
        this.title = title;
        this.items = items;
        this.style = style;
    }

    /* JADX INFO: renamed from: a */
    public final List<InterfaceC25312u> m47980a() {
        return this.items;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC17013f getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C33169c0 getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17014g)) {
            return false;
        }
        C17014g c17014g = (C17014g) other;
        return AbstractC22676k.m65745e(this.title, c17014g.title) && AbstractC22676k.m65745e(this.items, c17014g.items) && this.style == c17014g.style;
    }

    public int hashCode() {
        return this.style.hashCode() + AbstractC11895b.m31983b(this.title.hashCode() * 31, 31, this.items);
    }

    public String toString() {
        return "RewardsSectionViewState(title=" + this.title + ", items=" + this.items + ", style=" + this.style + ")";
    }
}
