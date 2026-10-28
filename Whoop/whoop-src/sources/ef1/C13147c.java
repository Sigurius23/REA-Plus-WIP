package ef1;

import e31.C12611c;
import i11.C17863f;
import java.util.List;
import java.util.Map;
import k71.C22246d;
import o51.C27539e;
import o51.C27540f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import s01.C32048d;
import v41.C35678m;

/* JADX INFO: renamed from: ef1.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0013\u0016\u0019B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Lef1/c;", "Lm91/u;", "Lef1/c$a;", "miniArchModal", "Lef1/c$b;", "screenContent", "<init>", "(Lef1/c$a;Lef1/c$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lef1/c$a;", "()Lef1/c$a;", "b", "Lef1/c$b;", "()Lef1/c$b;", "c", "exercise-progress-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C13147c implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final a miniArchModal;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final b screenContent;

    /* JADX INFO: renamed from: ef1.c$b */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJJ\u0010\r\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, m65681d2 = {"Lef1/c$b;", "", "", "", "Lef1/c$c;", "timeSegmentStates", "Lo51/f;", "segmentController", "Lo51/e;", "noDataGraphState", "selectedIndex", "<init>", "(Ljava/util/Map;Lo51/f;Lo51/e;Ljava/lang/Integer;)V", "a", "(Ljava/util/Map;Lo51/f;Lo51/e;Ljava/lang/Integer;)Lef1/c$b;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "f", "()Ljava/util/Map;", "b", "Lo51/f;", "d", "()Lo51/f;", "c", "Lo51/e;", "()Lo51/e;", "Ljava/lang/Integer;", "e", "()Ljava/lang/Integer;", "exercise-progress-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Map<Integer, c> timeSegmentStates;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C27540f segmentController;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C27539e noDataGraphState;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final Integer selectedIndex;

        public b(Map<Integer, c> timeSegmentStates, C27540f c27540f, C27539e c27539e, Integer num) {
            AbstractC22676k.m65750j(timeSegmentStates, "timeSegmentStates");
            this.timeSegmentStates = timeSegmentStates;
            this.segmentController = c27540f;
            this.noDataGraphState = c27539e;
            this.selectedIndex = num;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ b m36810b(b bVar, Map map, C27540f c27540f, C27539e c27539e, Integer num, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                map = bVar.timeSegmentStates;
            }
            if ((i13 & 2) != 0) {
                c27540f = bVar.segmentController;
            }
            if ((i13 & 4) != 0) {
                c27539e = bVar.noDataGraphState;
            }
            if ((i13 & 8) != 0) {
                num = bVar.selectedIndex;
            }
            return bVar.m36811a(map, c27540f, c27539e, num);
        }

        /* JADX INFO: renamed from: a */
        public final b m36811a(Map<Integer, c> timeSegmentStates, C27540f segmentController, C27539e noDataGraphState, Integer selectedIndex) {
            AbstractC22676k.m65750j(timeSegmentStates, "timeSegmentStates");
            return new b(timeSegmentStates, segmentController, noDataGraphState, selectedIndex);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C27539e getNoDataGraphState() {
            return this.noDataGraphState;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final C27540f getSegmentController() {
            return this.segmentController;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Integer getSelectedIndex() {
            return this.selectedIndex;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.timeSegmentStates, bVar.timeSegmentStates) && AbstractC22676k.m65745e(this.segmentController, bVar.segmentController) && AbstractC22676k.m65745e(this.noDataGraphState, bVar.noDataGraphState) && AbstractC22676k.m65745e(this.selectedIndex, bVar.selectedIndex);
        }

        /* JADX INFO: renamed from: f */
        public final Map<Integer, c> m36815f() {
            return this.timeSegmentStates;
        }

        public int hashCode() {
            int iHashCode = this.timeSegmentStates.hashCode() * 31;
            C27540f c27540f = this.segmentController;
            int iHashCode2 = (iHashCode + (c27540f == null ? 0 : c27540f.hashCode())) * 31;
            C27539e c27539e = this.noDataGraphState;
            int iHashCode3 = (iHashCode2 + (c27539e == null ? 0 : c27539e.hashCode())) * 31;
            Integer num = this.selectedIndex;
            return iHashCode3 + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            return "ScreenContent(timeSegmentStates=" + this.timeSegmentStates + ", segmentController=" + this.segmentController + ", noDataGraphState=" + this.noDataGraphState + ", selectedIndex=" + this.selectedIndex + ")";
        }
    }

    /* JADX INFO: renamed from: ef1.c$c */
    @Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJT\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b#\u0010$R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b%\u0010\u001dR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, m65681d2 = {"Lef1/c$c;", "", "", "Lv41/m;", "keyMetricState", "Li11/f;", "dateSelectorState", "Lm91/u;", "graphItem", "Lk71/d;", "graphLegendState", "Ls01/d;", "whoopCoachVow", "<init>", "(Ljava/util/List;Li11/f;Lm91/u;Ljava/util/List;Ls01/d;)V", "a", "(Ljava/util/List;Li11/f;Lm91/u;Ljava/util/List;Ls01/d;)Lef1/c$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "f", "()Ljava/util/List;", "b", "Li11/f;", "c", "()Li11/f;", "Lm91/u;", "d", "()Lm91/u;", "e", "Ls01/d;", "g", "()Ls01/d;", "exercise-progress-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<C35678m> keyMetricState;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C17863f dateSelectorState;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final InterfaceC25312u graphItem;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final List<C22246d> graphLegendState;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final C32048d whoopCoachVow;

        public c(List<C35678m> keyMetricState, C17863f dateSelectorState, InterfaceC25312u interfaceC25312u, List<C22246d> list, C32048d c32048d) {
            AbstractC22676k.m65750j(keyMetricState, "keyMetricState");
            AbstractC22676k.m65750j(dateSelectorState, "dateSelectorState");
            this.keyMetricState = keyMetricState;
            this.dateSelectorState = dateSelectorState;
            this.graphItem = interfaceC25312u;
            this.graphLegendState = list;
            this.whoopCoachVow = c32048d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ c m36816b(c cVar, List list, C17863f c17863f, InterfaceC25312u interfaceC25312u, List list2, C32048d c32048d, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                list = cVar.keyMetricState;
            }
            if ((i13 & 2) != 0) {
                c17863f = cVar.dateSelectorState;
            }
            if ((i13 & 4) != 0) {
                interfaceC25312u = cVar.graphItem;
            }
            if ((i13 & 8) != 0) {
                list2 = cVar.graphLegendState;
            }
            if ((i13 & 16) != 0) {
                c32048d = cVar.whoopCoachVow;
            }
            C32048d c32048d2 = c32048d;
            InterfaceC25312u interfaceC25312u2 = interfaceC25312u;
            return cVar.m36817a(list, c17863f, interfaceC25312u2, list2, c32048d2);
        }

        /* JADX INFO: renamed from: a */
        public final c m36817a(List<C35678m> keyMetricState, C17863f dateSelectorState, InterfaceC25312u graphItem, List<C22246d> graphLegendState, C32048d whoopCoachVow) {
            AbstractC22676k.m65750j(keyMetricState, "keyMetricState");
            AbstractC22676k.m65750j(dateSelectorState, "dateSelectorState");
            return new c(keyMetricState, dateSelectorState, graphItem, graphLegendState, whoopCoachVow);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C17863f getDateSelectorState() {
            return this.dateSelectorState;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final InterfaceC25312u getGraphItem() {
            return this.graphItem;
        }

        /* JADX INFO: renamed from: e */
        public final List<C22246d> m36820e() {
            return this.graphLegendState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.keyMetricState, cVar.keyMetricState) && AbstractC22676k.m65745e(this.dateSelectorState, cVar.dateSelectorState) && AbstractC22676k.m65745e(this.graphItem, cVar.graphItem) && AbstractC22676k.m65745e(this.graphLegendState, cVar.graphLegendState) && AbstractC22676k.m65745e(this.whoopCoachVow, cVar.whoopCoachVow);
        }

        /* JADX INFO: renamed from: f */
        public final List<C35678m> m36821f() {
            return this.keyMetricState;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final C32048d getWhoopCoachVow() {
            return this.whoopCoachVow;
        }

        public int hashCode() {
            int iHashCode = (this.dateSelectorState.hashCode() + (this.keyMetricState.hashCode() * 31)) * 31;
            InterfaceC25312u interfaceC25312u = this.graphItem;
            int iHashCode2 = (iHashCode + (interfaceC25312u == null ? 0 : interfaceC25312u.hashCode())) * 31;
            List<C22246d> list = this.graphLegendState;
            int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            C32048d c32048d = this.whoopCoachVow;
            return iHashCode3 + (c32048d != null ? c32048d.hashCode() : 0);
        }

        public String toString() {
            return "TimeSegmentState(keyMetricState=" + this.keyMetricState + ", dateSelectorState=" + this.dateSelectorState + ", graphItem=" + this.graphItem + ", graphLegendState=" + this.graphLegendState + ", whoopCoachVow=" + this.whoopCoachVow + ")";
        }
    }

    public C13147c(a aVar, b bVar) {
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
        if (!(other instanceof C13147c)) {
            return false;
        }
        C13147c c13147c = (C13147c) other;
        return AbstractC22676k.m65745e(this.miniArchModal, c13147c.miniArchModal) && AbstractC22676k.m65745e(this.screenContent, c13147c.screenContent);
    }

    public int hashCode() {
        a aVar = this.miniArchModal;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        b bVar = this.screenContent;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "ExerciseProgressViewState(miniArchModal=" + this.miniArchModal + ", screenContent=" + this.screenContent + ")";
    }

    /* JADX INFO: renamed from: ef1.c$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ2\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, m65681d2 = {"Lef1/c$a;", "", "Le31/c;", "state", "Lef1/a;", "primaryClickEvent", "secondaryClickEvent", "<init>", "(Le31/c;Lef1/a;Lef1/a;)V", "a", "(Le31/c;Lef1/a;Lef1/a;)Lef1/c$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Le31/c;", "e", "()Le31/c;", "b", "Lef1/a;", "c", "()Lef1/a;", "d", "exercise-progress-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: d */
        public static final int f45516d = C12611c.f43049g;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C12611c state;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final InterfaceC13145a primaryClickEvent;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final InterfaceC13145a secondaryClickEvent;

        public a(C12611c state, InterfaceC13145a interfaceC13145a, InterfaceC13145a interfaceC13145a2) {
            AbstractC22676k.m65750j(state, "state");
            this.state = state;
            this.primaryClickEvent = interfaceC13145a;
            this.secondaryClickEvent = interfaceC13145a2;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ a m36805b(a aVar, C12611c c12611c, InterfaceC13145a interfaceC13145a, InterfaceC13145a interfaceC13145a2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                c12611c = aVar.state;
            }
            if ((i13 & 2) != 0) {
                interfaceC13145a = aVar.primaryClickEvent;
            }
            if ((i13 & 4) != 0) {
                interfaceC13145a2 = aVar.secondaryClickEvent;
            }
            return aVar.m36806a(c12611c, interfaceC13145a, interfaceC13145a2);
        }

        /* JADX INFO: renamed from: a */
        public final a m36806a(C12611c state, InterfaceC13145a primaryClickEvent, InterfaceC13145a secondaryClickEvent) {
            AbstractC22676k.m65750j(state, "state");
            return new a(state, primaryClickEvent, secondaryClickEvent);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final InterfaceC13145a getPrimaryClickEvent() {
            return this.primaryClickEvent;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final InterfaceC13145a getSecondaryClickEvent() {
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
            InterfaceC13145a interfaceC13145a = this.primaryClickEvent;
            int iHashCode2 = (iHashCode + (interfaceC13145a == null ? 0 : interfaceC13145a.hashCode())) * 31;
            InterfaceC13145a interfaceC13145a2 = this.secondaryClickEvent;
            return iHashCode2 + (interfaceC13145a2 != null ? interfaceC13145a2.hashCode() : 0);
        }

        public String toString() {
            return "MiniArchModal(state=" + this.state + ", primaryClickEvent=" + this.primaryClickEvent + ", secondaryClickEvent=" + this.secondaryClickEvent + ")";
        }

        public /* synthetic */ a(C12611c c12611c, InterfaceC13145a interfaceC13145a, InterfaceC13145a interfaceC13145a2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(c12611c, (i13 & 2) != 0 ? null : interfaceC13145a, (i13 & 4) != 0 ? null : interfaceC13145a2);
        }
    }

    public /* synthetic */ C13147c(a aVar, b bVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : aVar, (i13 & 2) != 0 ? null : bVar);
    }
}
