package iq1;

import e31.C12611c;
import java.util.List;
import m83.C25271y;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: iq1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0013\u0016\u0019B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Liq1/a;", "Lm91/u;", "Liq1/a$a;", "miniArchModal", "Liq1/a$b;", "screenContent", "<init>", "(Liq1/a$a;Liq1/a$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liq1/a$a;", "()Liq1/a$a;", "b", "Liq1/a$b;", "()Liq1/a$b;", "c", "behavior-impact_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C20848a implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final a miniArchModal;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final b screenContent;

    /* JADX INFO: renamed from: iq1.a$c */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\f¨\u0006\u001a"}, m65681d2 = {"Liq1/a$c;", "", "", "Lm91/u;", "items", "", "sectionType", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "a", "(Ljava/util/List;Ljava/lang/String;)Liq1/a$c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Ljava/lang/String;", "getSectionType", "behavior-impact_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<InterfaceC25312u> items;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String sectionType;

        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends InterfaceC25312u> items, String str) {
            AbstractC22676k.m65750j(items, "items");
            this.items = items;
            this.sectionType = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ c m57582b(c cVar, List list, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                list = cVar.items;
            }
            if ((i13 & 2) != 0) {
                str = cVar.sectionType;
            }
            return cVar.m57583a(list, str);
        }

        /* JADX INFO: renamed from: a */
        public final c m57583a(List<? extends InterfaceC25312u> items, String sectionType) {
            AbstractC22676k.m65750j(items, "items");
            return new c(items, sectionType);
        }

        /* JADX INFO: renamed from: c */
        public final List<InterfaceC25312u> m57584c() {
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
            return AbstractC22676k.m65745e(this.items, cVar.items) && AbstractC22676k.m65745e(this.sectionType, cVar.sectionType);
        }

        public int hashCode() {
            int iHashCode = this.items.hashCode() * 31;
            String str = this.sectionType;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return AbstractC30802r.m94761j("SectionItem(items=", ", sectionType=", this.sectionType, ")", this.items);
        }
    }

    public C20848a(a aVar, b bVar) {
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
        if (!(other instanceof C20848a)) {
            return false;
        }
        C20848a c20848a = (C20848a) other;
        return AbstractC22676k.m65745e(this.miniArchModal, c20848a.miniArchModal) && AbstractC22676k.m65745e(this.screenContent, c20848a.screenContent);
    }

    public int hashCode() {
        a aVar = this.miniArchModal;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        b bVar = this.screenContent;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "BehaviorDetailsImpactCalendarTrendsViewState(miniArchModal=" + this.miniArchModal + ", screenContent=" + this.screenContent + ")";
    }

    /* JADX INFO: renamed from: iq1.a$b */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u0007\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Liq1/a$b;", "", "", "Liq1/a$c;", "items", "<init>", "(Ljava/util/List;)V", "a", "(Ljava/util/List;)Liq1/a$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "b", "()Ljava/util/List;", "behavior-impact_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<c> items;

        public b(List<c> items) {
            AbstractC22676k.m65750j(items, "items");
            this.items = items;
        }

        /* JADX INFO: renamed from: a */
        public final b m57580a(List<c> items) {
            AbstractC22676k.m65750j(items, "items");
            return new b(items);
        }

        /* JADX INFO: renamed from: b */
        public final List<c> m57581b() {
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

        public /* synthetic */ b(List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? C25271y.f99162w : list);
        }
    }

    /* JADX INFO: renamed from: iq1.a$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Liq1/a$a;", "", "Le31/c;", "state", "Liq1/c;", "primaryClickEvent", "secondaryClickEvent", "<init>", "(Le31/c;Liq1/c;Liq1/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Le31/c;", "c", "()Le31/c;", "b", "Liq1/c;", "()Liq1/c;", "behavior-impact_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: d */
        public static final int f78375d = C12611c.f43049g;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C12611c state;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final InterfaceC20850c primaryClickEvent;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final InterfaceC20850c secondaryClickEvent;

        public a(C12611c state, InterfaceC20850c interfaceC20850c, InterfaceC20850c interfaceC20850c2) {
            AbstractC22676k.m65750j(state, "state");
            this.state = state;
            this.primaryClickEvent = interfaceC20850c;
            this.secondaryClickEvent = interfaceC20850c2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC20850c getPrimaryClickEvent() {
            return this.primaryClickEvent;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final InterfaceC20850c getSecondaryClickEvent() {
            return this.secondaryClickEvent;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
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
            InterfaceC20850c interfaceC20850c = this.primaryClickEvent;
            int iHashCode2 = (iHashCode + (interfaceC20850c == null ? 0 : interfaceC20850c.hashCode())) * 31;
            InterfaceC20850c interfaceC20850c2 = this.secondaryClickEvent;
            return iHashCode2 + (interfaceC20850c2 != null ? interfaceC20850c2.hashCode() : 0);
        }

        public String toString() {
            return "MiniArchModal(state=" + this.state + ", primaryClickEvent=" + this.primaryClickEvent + ", secondaryClickEvent=" + this.secondaryClickEvent + ")";
        }

        public /* synthetic */ a(C12611c c12611c, InterfaceC20850c interfaceC20850c, InterfaceC20850c interfaceC20850c2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(c12611c, (i13 & 2) != 0 ? null : interfaceC20850c, (i13 & 4) != 0 ? null : interfaceC20850c2);
        }
    }

    public /* synthetic */ C20848a(a aVar, b bVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : aVar, (i13 & 2) != 0 ? null : bVar);
    }
}
