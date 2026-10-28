package nj2;

import c13.AbstractC3855a;
import com.whoop.stress.domain.model.StressCustomizationDrawer;
import com.whoop.stress.domain.model.StressCustomizationPicker;
import java.util.Map;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import v41.C35666g;
import y71.C39282o;

/* JADX INFO: renamed from: nj2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\t\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0001\u0002\u0014\u0015¨\u0006\u0016"}, m65681d2 = {"Lnj2/b;", "", "<init>", "()V", "Ly71/o;", "c", "()Ly71/o;", "menuItemState", "", "b", "()Ljava/lang/String;", "currentSelection", "Lv41/g;", "a", "()Lv41/g;", "bottomSheetTopBar", "", "d", "()Ljava/util/Map;", "menuItemStateMap", "Lnj2/b$a;", "Lnj2/b$b;", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC26755b {

    /* JADX INFO: renamed from: nj2.b$a */
    @Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001e\u001a\u0004\b\u0018\u0010\u001fR&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%¨\u0006&"}, m65681d2 = {"Lnj2/b$a;", "Lnj2/b;", "Ly71/o;", "menuItemState", "", "currentSelection", "Lv41/g;", "bottomSheetTopBar", "", "menuItemStateMap", "Lcom/whoop/stress/domain/model/StressCustomizationDrawer;", "drawer", "<init>", "(Ly71/o;Ljava/lang/String;Lv41/g;Ljava/util/Map;Lcom/whoop/stress/domain/model/StressCustomizationDrawer;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ly71/o;", "c", "()Ly71/o;", "b", "Ljava/lang/String;", "Lv41/g;", "()Lv41/g;", "d", "Ljava/util/Map;", "()Ljava/util/Map;", "e", "Lcom/whoop/stress/domain/model/StressCustomizationDrawer;", "()Lcom/whoop/stress/domain/model/StressCustomizationDrawer;", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC26755b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C39282o menuItemState;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String currentSelection;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C35666g bottomSheetTopBar;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final Map<String, C39282o> menuItemStateMap;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final StressCustomizationDrawer drawer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C39282o menuItemState, String currentSelection, C35666g bottomSheetTopBar, Map<String, C39282o> menuItemStateMap, StressCustomizationDrawer drawer) {
            super(null);
            AbstractC22676k.m65750j(menuItemState, "menuItemState");
            AbstractC22676k.m65750j(currentSelection, "currentSelection");
            AbstractC22676k.m65750j(bottomSheetTopBar, "bottomSheetTopBar");
            AbstractC22676k.m65750j(menuItemStateMap, "menuItemStateMap");
            AbstractC22676k.m65750j(drawer, "drawer");
            this.menuItemState = menuItemState;
            this.currentSelection = currentSelection;
            this.bottomSheetTopBar = bottomSheetTopBar;
            this.menuItemStateMap = menuItemStateMap;
            this.drawer = drawer;
        }

        @Override // nj2.AbstractC26755b
        /* JADX INFO: renamed from: a, reason: from getter */
        public C35666g getBottomSheetTopBar() {
            return this.bottomSheetTopBar;
        }

        @Override // nj2.AbstractC26755b
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getCurrentSelection() {
            return this.currentSelection;
        }

        @Override // nj2.AbstractC26755b
        /* JADX INFO: renamed from: c, reason: from getter */
        public C39282o getMenuItemState() {
            return this.menuItemState;
        }

        @Override // nj2.AbstractC26755b
        /* JADX INFO: renamed from: d */
        public Map<String, C39282o> mo79644d() {
            return this.menuItemStateMap;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final StressCustomizationDrawer getDrawer() {
            return this.drawer;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.menuItemState, aVar.menuItemState) && AbstractC22676k.m65745e(this.currentSelection, aVar.currentSelection) && AbstractC22676k.m65745e(this.bottomSheetTopBar, aVar.bottomSheetTopBar) && AbstractC22676k.m65745e(this.menuItemStateMap, aVar.menuItemStateMap) && AbstractC22676k.m65745e(this.drawer, aVar.drawer);
        }

        public int hashCode() {
            return this.drawer.hashCode() + AbstractC3855a.m11821e(this.menuItemStateMap, (this.bottomSheetTopBar.hashCode() + AbstractC11266d.m30450d(this.menuItemState.hashCode() * 31, 31, this.currentSelection)) * 31, 31);
        }

        public String toString() {
            return "Drawer(menuItemState=" + this.menuItemState + ", currentSelection=" + this.currentSelection + ", bottomSheetTopBar=" + this.bottomSheetTopBar + ", menuItemStateMap=" + this.menuItemStateMap + ", drawer=" + this.drawer + ")";
        }
    }

    /* JADX INFO: renamed from: nj2.b$b */
    @Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001e\u001a\u0004\b\u0018\u0010\u001fR&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%¨\u0006&"}, m65681d2 = {"Lnj2/b$b;", "Lnj2/b;", "Ly71/o;", "menuItemState", "", "currentSelection", "Lv41/g;", "bottomSheetTopBar", "", "menuItemStateMap", "Lcom/whoop/stress/domain/model/StressCustomizationPicker;", "picker", "<init>", "(Ly71/o;Ljava/lang/String;Lv41/g;Ljava/util/Map;Lcom/whoop/stress/domain/model/StressCustomizationPicker;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ly71/o;", "c", "()Ly71/o;", "b", "Ljava/lang/String;", "Lv41/g;", "()Lv41/g;", "d", "Ljava/util/Map;", "()Ljava/util/Map;", "e", "Lcom/whoop/stress/domain/model/StressCustomizationPicker;", "()Lcom/whoop/stress/domain/model/StressCustomizationPicker;", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC26755b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C39282o menuItemState;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String currentSelection;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C35666g bottomSheetTopBar;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final Map<String, C39282o> menuItemStateMap;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final StressCustomizationPicker picker;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C39282o menuItemState, String currentSelection, C35666g bottomSheetTopBar, Map<String, C39282o> menuItemStateMap, StressCustomizationPicker picker) {
            super(null);
            AbstractC22676k.m65750j(menuItemState, "menuItemState");
            AbstractC22676k.m65750j(currentSelection, "currentSelection");
            AbstractC22676k.m65750j(bottomSheetTopBar, "bottomSheetTopBar");
            AbstractC22676k.m65750j(menuItemStateMap, "menuItemStateMap");
            AbstractC22676k.m65750j(picker, "picker");
            this.menuItemState = menuItemState;
            this.currentSelection = currentSelection;
            this.bottomSheetTopBar = bottomSheetTopBar;
            this.menuItemStateMap = menuItemStateMap;
            this.picker = picker;
        }

        @Override // nj2.AbstractC26755b
        /* JADX INFO: renamed from: a, reason: from getter */
        public C35666g getBottomSheetTopBar() {
            return this.bottomSheetTopBar;
        }

        @Override // nj2.AbstractC26755b
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getCurrentSelection() {
            return this.currentSelection;
        }

        @Override // nj2.AbstractC26755b
        /* JADX INFO: renamed from: c, reason: from getter */
        public C39282o getMenuItemState() {
            return this.menuItemState;
        }

        @Override // nj2.AbstractC26755b
        /* JADX INFO: renamed from: d */
        public Map<String, C39282o> mo79644d() {
            return this.menuItemStateMap;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final StressCustomizationPicker getPicker() {
            return this.picker;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.menuItemState, bVar.menuItemState) && AbstractC22676k.m65745e(this.currentSelection, bVar.currentSelection) && AbstractC22676k.m65745e(this.bottomSheetTopBar, bVar.bottomSheetTopBar) && AbstractC22676k.m65745e(this.menuItemStateMap, bVar.menuItemStateMap) && AbstractC22676k.m65745e(this.picker, bVar.picker);
        }

        public int hashCode() {
            return this.picker.hashCode() + AbstractC3855a.m11821e(this.menuItemStateMap, (this.bottomSheetTopBar.hashCode() + AbstractC11266d.m30450d(this.menuItemState.hashCode() * 31, 31, this.currentSelection)) * 31, 31);
        }

        public String toString() {
            return "Picker(menuItemState=" + this.menuItemState + ", currentSelection=" + this.currentSelection + ", bottomSheetTopBar=" + this.bottomSheetTopBar + ", menuItemStateMap=" + this.menuItemStateMap + ", picker=" + this.picker + ")";
        }
    }

    public /* synthetic */ AbstractC26755b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public abstract C35666g getBottomSheetTopBar();

    /* JADX INFO: renamed from: b */
    public abstract String getCurrentSelection();

    /* JADX INFO: renamed from: c */
    public abstract C39282o getMenuItemState();

    /* JADX INFO: renamed from: d */
    public abstract Map<String, C39282o> mo79644d();

    private AbstractC26755b() {
    }
}
