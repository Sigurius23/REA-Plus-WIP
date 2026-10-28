package i51;

import java.util.List;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: i51.v */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m65681d2 = {"Li51/v;", "", "<init>", "()V", "a", "b", "d", "c", "Li51/v$a;", "Li51/v$b;", "Li51/v$c;", "Li51/v$d;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC18125v {

    /* JADX INFO: renamed from: i51.v$a */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0017\u0010\fR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Li51/v$a;", "Li51/v;", "", "max", "selected", "", "layerPattern", "", "baseLayers", "<init>", "(IILjava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "d", "Ljava/lang/String;", "Ljava/util/List;", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC18125v {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int max;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int selected;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String layerPattern;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final List<String> baseLayers;

        public a(int i13, int i14, String str, List<String> list) {
            super(null);
            this.max = i13;
            this.selected = i14;
            this.layerPattern = str;
            this.baseLayers = list;
        }

        /* JADX INFO: renamed from: a */
        public final List<String> m52050a() {
            return this.baseLayers;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getLayerPattern() {
            return this.layerPattern;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getMax() {
            return this.max;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getSelected() {
            return this.selected;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.max == aVar.max && this.selected == aVar.selected && AbstractC22676k.m65745e(this.layerPattern, aVar.layerPattern) && AbstractC22676k.m65745e(this.baseLayers, aVar.baseLayers);
        }

        public int hashCode() {
            int iM30448b = AbstractC11266d.m30448b(this.selected, Integer.hashCode(this.max) * 31, 31);
            String str = this.layerPattern;
            int iHashCode = (iM30448b + (str == null ? 0 : str.hashCode())) * 31;
            List<String> list = this.baseLayers;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            int i13 = this.max;
            int i14 = this.selected;
            return AbstractC30007c.m91840j(this.layerPattern, ", baseLayers=", ")", AbstractC11266d.m30465s(i13, i14, "Cumulative(max=", ", selected=", ", layerPattern="), this.baseLayers);
        }
    }

    /* JADX INFO: renamed from: i51.v$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\n¨\u0006\u0017"}, m65681d2 = {"Li51/v$b;", "Li51/v;", "", "max", "selected", "", "layerPattern", "<init>", "(IILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "c", "Ljava/lang/String;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC18125v {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int max;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int selected;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String layerPattern;

        public b(int i13, int i14, String str) {
            super(null);
            this.max = i13;
            this.selected = i14;
            this.layerPattern = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getLayerPattern() {
            return this.layerPattern;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getMax() {
            return this.max;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getSelected() {
            return this.selected;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return this.max == bVar.max && this.selected == bVar.selected && AbstractC22676k.m65745e(this.layerPattern, bVar.layerPattern);
        }

        public int hashCode() {
            int iM30448b = AbstractC11266d.m30448b(this.selected, Integer.hashCode(this.max) * 31, 31);
            String str = this.layerPattern;
            return iM30448b + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return AbstractC25012a.m73376i(this.layerPattern, ")", AbstractC11266d.m30465s(this.max, this.selected, "Exclusive(max=", ", selected=", ", layerPattern="));
        }
    }

    /* JADX INFO: renamed from: i51.v$c */
    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001a\u0010\u000fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0015\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Li51/v$c;", "Li51/v;", "", "name", "", "selectedGroup", "selectedLevel", "", "Li51/w;", "groups", "<init>", "(Ljava/lang/String;IILjava/util/List;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "c", "d", "Ljava/util/List;", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC18125v {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String name;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int selectedGroup;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final int selectedLevel;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final List<C18126w> groups;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String name, int i13, int i14, List<C18126w> groups) {
            super(null);
            AbstractC22676k.m65750j(name, "name");
            AbstractC22676k.m65750j(groups, "groups");
            this.name = name;
            this.selectedGroup = i13;
            this.selectedLevel = i14;
            this.groups = groups;
        }

        /* JADX INFO: renamed from: a */
        public final List<C18126w> m52057a() {
            return this.groups;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getSelectedGroup() {
            return this.selectedGroup;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getSelectedLevel() {
            return this.selectedLevel;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.name, cVar.name) && this.selectedGroup == cVar.selectedGroup && this.selectedLevel == cVar.selectedLevel && AbstractC22676k.m65745e(this.groups, cVar.groups);
        }

        public int hashCode() {
            return this.groups.hashCode() + AbstractC11266d.m30448b(this.selectedLevel, AbstractC11266d.m30448b(this.selectedGroup, this.name.hashCode() * 31, 31), 31);
        }

        public String toString() {
            String str = this.name;
            int i13 = this.selectedGroup;
            int i14 = this.selectedLevel;
            List<C18126w> list = this.groups;
            StringBuilder sbM30467u = AbstractC11266d.m30467u(i13, "GroupedCumulative(name=", str, ", selectedGroup=", ", selectedLevel=");
            sbM30467u.append(i14);
            sbM30467u.append(", groups=");
            sbM30467u.append(list);
            sbM30467u.append(")");
            return sbM30467u.toString();
        }
    }

    /* JADX INFO: renamed from: i51.v$d */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Li51/v$d;", "Li51/v;", "", "", "layers", "", "value", "<init>", "(Ljava/util/List;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Z", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC18125v {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<String> layers;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean value;

        public d(List<String> list, boolean z4) {
            super(null);
            this.layers = list;
            this.value = z4;
        }

        /* JADX INFO: renamed from: a */
        public final List<String> m52061a() {
            return this.layers;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.layers, dVar.layers) && this.value == dVar.value;
        }

        public int hashCode() {
            List<String> list = this.layers;
            return Boolean.hashCode(this.value) + ((list == null ? 0 : list.hashCode()) * 31);
        }

        public String toString() {
            return "Toggle(layers=" + this.layers + ", value=" + this.value + ")";
        }
    }

    public /* synthetic */ AbstractC18125v(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC18125v() {
    }
}
