package im2;

import com.whoop.trendsminiarch.domain.models.TrendsMiniArchSectionSpacingType;
import e31.C12611c;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: im2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0013\u0016\u0019B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Lim2/c;", "Lm91/u;", "Lim2/c$a;", "miniArchModal", "Lim2/c$b;", "screenContent", "<init>", "(Lim2/c$a;Lim2/c$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lim2/c$a;", "()Lim2/c$a;", "b", "Lim2/c$b;", "()Lim2/c$b;", "c", "trends-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C18712c implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final a miniArchModal;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final b screenContent;

    /* JADX INFO: renamed from: im2.c$b */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lim2/c$b;", "", "", "Lim2/c$c;", "items", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "trends-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<c> items;

        public b(List<c> items) {
            AbstractC22676k.m65750j(items, "items");
            this.items = items;
        }

        /* JADX INFO: renamed from: a */
        public final List<c> m54411a() {
            return this.items;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.items, ((b) other).items);
        }

        public int hashCode() {
            return this.items.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106654m("ScreenContent(items=", ")", this.items);
        }
    }

    /* JADX INFO: renamed from: im2.c$c */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lim2/c$c;", "", "", "Lm91/u;", "items", "Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchSectionSpacingType;", "insetBottom", "<init>", "(Ljava/util/List;Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchSectionSpacingType;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchSectionSpacingType;", "()Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchSectionSpacingType;", "trends-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<InterfaceC25312u> items;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TrendsMiniArchSectionSpacingType insetBottom;

        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends InterfaceC25312u> items, TrendsMiniArchSectionSpacingType insetBottom) {
            AbstractC22676k.m65750j(items, "items");
            AbstractC22676k.m65750j(insetBottom, "insetBottom");
            this.items = items;
            this.insetBottom = insetBottom;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TrendsMiniArchSectionSpacingType getInsetBottom() {
            return this.insetBottom;
        }

        /* JADX INFO: renamed from: b */
        public final List<InterfaceC25312u> m54413b() {
            return this.items;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.items, cVar.items) && this.insetBottom == cVar.insetBottom;
        }

        public int hashCode() {
            return this.insetBottom.hashCode() + (this.items.hashCode() * 31);
        }

        public String toString() {
            return "SectionItem(items=" + this.items + ", insetBottom=" + this.insetBottom + ")";
        }
    }

    public C18712c(a aVar, b bVar) {
        this.miniArchModal = aVar;
        this.screenContent = bVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getMiniArchModal() {
        return this.miniArchModal;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getScreenContent() {
        return this.screenContent;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C18712c)) {
            return false;
        }
        C18712c c18712c = (C18712c) other;
        return AbstractC22676k.m65745e(this.miniArchModal, c18712c.miniArchModal) && AbstractC22676k.m65745e(this.screenContent, c18712c.screenContent);
    }

    public int hashCode() {
        a aVar = this.miniArchModal;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        b bVar = this.screenContent;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TrendsMiniArchViewState(miniArchModal=" + this.miniArchModal + ", screenContent=" + this.screenContent + ")";
    }

    /* JADX INFO: renamed from: im2.c$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ2\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, m65681d2 = {"Lim2/c$a;", "", "Le31/c;", "state", "Lim2/a;", "primaryClickEvent", "secondaryClickEvent", "<init>", "(Le31/c;Lim2/a;Lim2/a;)V", "a", "(Le31/c;Lim2/a;Lim2/a;)Lim2/c$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Le31/c;", "e", "()Le31/c;", "b", "Lim2/a;", "c", "()Lim2/a;", "d", "trends-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: d */
        public static final int f73518d = C12611c.f43049g;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C12611c state;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final InterfaceC18710a primaryClickEvent;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final InterfaceC18710a secondaryClickEvent;

        public a(C12611c state, InterfaceC18710a interfaceC18710a, InterfaceC18710a interfaceC18710a2) {
            AbstractC22676k.m65750j(state, "state");
            this.state = state;
            this.primaryClickEvent = interfaceC18710a;
            this.secondaryClickEvent = interfaceC18710a2;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ a m54406b(a aVar, C12611c c12611c, InterfaceC18710a interfaceC18710a, InterfaceC18710a interfaceC18710a2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                c12611c = aVar.state;
            }
            if ((i13 & 2) != 0) {
                interfaceC18710a = aVar.primaryClickEvent;
            }
            if ((i13 & 4) != 0) {
                interfaceC18710a2 = aVar.secondaryClickEvent;
            }
            return aVar.m54407a(c12611c, interfaceC18710a, interfaceC18710a2);
        }

        /* JADX INFO: renamed from: a */
        public final a m54407a(C12611c state, InterfaceC18710a primaryClickEvent, InterfaceC18710a secondaryClickEvent) {
            AbstractC22676k.m65750j(state, "state");
            return new a(state, primaryClickEvent, secondaryClickEvent);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final InterfaceC18710a getPrimaryClickEvent() {
            return this.primaryClickEvent;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final InterfaceC18710a getSecondaryClickEvent() {
            return this.secondaryClickEvent;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final C12611c getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.state, aVar.state) && AbstractC22676k.m65745e(this.primaryClickEvent, aVar.primaryClickEvent) && AbstractC22676k.m65745e(this.secondaryClickEvent, aVar.secondaryClickEvent);
        }

        public int hashCode() {
            int iHashCode = this.state.hashCode() * 31;
            InterfaceC18710a interfaceC18710a = this.primaryClickEvent;
            int iHashCode2 = (iHashCode + (interfaceC18710a == null ? 0 : interfaceC18710a.hashCode())) * 31;
            InterfaceC18710a interfaceC18710a2 = this.secondaryClickEvent;
            return iHashCode2 + (interfaceC18710a2 != null ? interfaceC18710a2.hashCode() : 0);
        }

        public String toString() {
            return "MiniArchModal(state=" + this.state + ", primaryClickEvent=" + this.primaryClickEvent + ", secondaryClickEvent=" + this.secondaryClickEvent + ")";
        }

        public /* synthetic */ a(C12611c c12611c, InterfaceC18710a interfaceC18710a, InterfaceC18710a interfaceC18710a2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(c12611c, (i13 & 2) != 0 ? null : interfaceC18710a, (i13 & 4) != 0 ? null : interfaceC18710a2);
        }
    }

    public /* synthetic */ C18712c(a aVar, b bVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : aVar, (i13 & 2) != 0 ? null : bVar);
    }
}
