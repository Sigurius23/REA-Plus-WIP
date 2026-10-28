package jw0;

import com.whoop.core.details.network.model.sleep.SleepMetricTypeModel;
import com.whoop.design.util.TextResource;
import mw0.C25978f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: jw0.i */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0010\u000e\u0012\u0015\fB%\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u000e\u0010\u0014\u0082\u0001\u0005\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, m65681d2 = {"Ljw0/i;", "", "", "vow", "Lmw0/f;", "mainStat", "centerStat", "<init>", "(Ljava/lang/String;Lmw0/f;Lmw0/f;)V", "Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;", "selectedTooltip", "Lcom/whoop/design/util/TextResource;", "d", "(Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;)Lcom/whoop/design/util/TextResource;", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "Lmw0/f;", "()Lmw0/f;", "e", "Ljw0/i$a;", "Ljw0/i$b;", "Ljw0/i$c;", "Ljw0/i$d;", "Ljw0/i$e;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21991i {

    /* JADX INFO: renamed from: d */
    public static final int f85211d = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String vow;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C25978f mainStat;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C25978f centerStat;

    /* JADX INFO: renamed from: jw0.i$a */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, m65681d2 = {"Ljw0/i$a;", "Ljw0/i;", "", "vow", "Lmw0/f;", "mainStat", "centerStat", "<init>", "(Ljava/lang/String;Lmw0/f;Lmw0/f;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/lang/String;", "c", "f", "Lmw0/f;", "b", "()Lmw0/f;", "g", "a", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC21991i {

        /* JADX INFO: renamed from: h */
        public static final int f85215h = TextResource.$stable;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String vow;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final C25978f mainStat;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final C25978f centerStat;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String vow, C25978f mainStat, C25978f c25978f) {
            super(vow, mainStat, c25978f, null);
            AbstractC22676k.m65750j(vow, "vow");
            AbstractC22676k.m65750j(mainStat, "mainStat");
            this.vow = vow;
            this.mainStat = mainStat;
            this.centerStat = c25978f;
        }

        @Override // jw0.AbstractC21991i
        /* JADX INFO: renamed from: a, reason: from getter */
        public C25978f getCenterStat() {
            return this.centerStat;
        }

        @Override // jw0.AbstractC21991i
        /* JADX INFO: renamed from: b, reason: from getter */
        public C25978f getMainStat() {
            return this.mainStat;
        }

        @Override // jw0.AbstractC21991i
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getVow() {
            return this.vow;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.vow, aVar.vow) && AbstractC22676k.m65745e(this.mainStat, aVar.mainStat) && AbstractC22676k.m65745e(this.centerStat, aVar.centerStat);
        }

        public int hashCode() {
            int iHashCode = (this.mainStat.hashCode() + (this.vow.hashCode() * 31)) * 31;
            C25978f c25978f = this.centerStat;
            return iHashCode + (c25978f == null ? 0 : c25978f.hashCode());
        }

        public String toString() {
            return "AwakeSleepMetricType(vow=" + this.vow + ", mainStat=" + this.mainStat + ", centerStat=" + this.centerStat + ")";
        }
    }

    /* JADX INFO: renamed from: jw0.i$b */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Ljw0/i$b;", "Ljw0/i;", "", "vow", "Lmw0/f;", "mainStat", "<init>", "(Ljava/lang/String;Lmw0/f;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/lang/String;", "c", "f", "Lmw0/f;", "b", "()Lmw0/f;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC21991i {

        /* JADX INFO: renamed from: g */
        public static final int f85219g = TextResource.$stable;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String vow;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final C25978f mainStat;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(String vow, C25978f mainStat) {
            super(vow, mainStat, null, 0 == true ? 1 : 0);
            AbstractC22676k.m65750j(vow, "vow");
            AbstractC22676k.m65750j(mainStat, "mainStat");
            this.vow = vow;
            this.mainStat = mainStat;
        }

        @Override // jw0.AbstractC21991i
        /* JADX INFO: renamed from: b, reason: from getter */
        public C25978f getMainStat() {
            return this.mainStat;
        }

        @Override // jw0.AbstractC21991i
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getVow() {
            return this.vow;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.vow, bVar.vow) && AbstractC22676k.m65745e(this.mainStat, bVar.mainStat);
        }

        public int hashCode() {
            return this.mainStat.hashCode() + (this.vow.hashCode() * 31);
        }

        public String toString() {
            return "LightSleepMetricType(vow=" + this.vow + ", mainStat=" + this.mainStat + ")";
        }
    }

    /* JADX INFO: renamed from: jw0.i$c */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, m65681d2 = {"Ljw0/i$c;", "Ljw0/i;", "", "vow", "Lmw0/f;", "mainStat", "centerStat", "<init>", "(Ljava/lang/String;Lmw0/f;Lmw0/f;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/lang/String;", "c", "f", "Lmw0/f;", "b", "()Lmw0/f;", "g", "a", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC21991i {

        /* JADX INFO: renamed from: h */
        public static final int f85222h = TextResource.$stable;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String vow;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final C25978f mainStat;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final C25978f centerStat;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String vow, C25978f mainStat, C25978f centerStat) {
            super(vow, mainStat, centerStat, null);
            AbstractC22676k.m65750j(vow, "vow");
            AbstractC22676k.m65750j(mainStat, "mainStat");
            AbstractC22676k.m65750j(centerStat, "centerStat");
            this.vow = vow;
            this.mainStat = mainStat;
            this.centerStat = centerStat;
        }

        @Override // jw0.AbstractC21991i
        /* JADX INFO: renamed from: a, reason: from getter */
        public C25978f getCenterStat() {
            return this.centerStat;
        }

        @Override // jw0.AbstractC21991i
        /* JADX INFO: renamed from: b, reason: from getter */
        public C25978f getMainStat() {
            return this.mainStat;
        }

        @Override // jw0.AbstractC21991i
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getVow() {
            return this.vow;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.vow, cVar.vow) && AbstractC22676k.m65745e(this.mainStat, cVar.mainStat) && AbstractC22676k.m65745e(this.centerStat, cVar.centerStat);
        }

        public int hashCode() {
            return this.centerStat.hashCode() + ((this.mainStat.hashCode() + (this.vow.hashCode() * 31)) * 31);
        }

        public String toString() {
            return "NoSelectedSleepType(vow=" + this.vow + ", mainStat=" + this.mainStat + ", centerStat=" + this.centerStat + ")";
        }
    }

    /* JADX INFO: renamed from: jw0.i$d */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Ljw0/i$d;", "Ljw0/i;", "", "vow", "Lmw0/f;", "mainStat", "<init>", "(Ljava/lang/String;Lmw0/f;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/lang/String;", "c", "f", "Lmw0/f;", "b", "()Lmw0/f;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC21991i {

        /* JADX INFO: renamed from: g */
        public static final int f85226g = TextResource.$stable;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String vow;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final C25978f mainStat;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(String vow, C25978f mainStat) {
            super(vow, mainStat, null, 0 == true ? 1 : 0);
            AbstractC22676k.m65750j(vow, "vow");
            AbstractC22676k.m65750j(mainStat, "mainStat");
            this.vow = vow;
            this.mainStat = mainStat;
        }

        @Override // jw0.AbstractC21991i
        /* JADX INFO: renamed from: b, reason: from getter */
        public C25978f getMainStat() {
            return this.mainStat;
        }

        @Override // jw0.AbstractC21991i
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getVow() {
            return this.vow;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.vow, dVar.vow) && AbstractC22676k.m65745e(this.mainStat, dVar.mainStat);
        }

        public int hashCode() {
            return this.mainStat.hashCode() + (this.vow.hashCode() * 31);
        }

        public String toString() {
            return "RemSleepMetricType(vow=" + this.vow + ", mainStat=" + this.mainStat + ")";
        }
    }

    /* JADX INFO: renamed from: jw0.i$e */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Ljw0/i$e;", "Ljw0/i;", "", "vow", "Lmw0/f;", "mainStat", "<init>", "(Ljava/lang/String;Lmw0/f;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/lang/String;", "c", "f", "Lmw0/f;", "b", "()Lmw0/f;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC21991i {

        /* JADX INFO: renamed from: g */
        public static final int f85229g = TextResource.$stable;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String vow;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final C25978f mainStat;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(String vow, C25978f mainStat) {
            super(vow, mainStat, null, 0 == true ? 1 : 0);
            AbstractC22676k.m65750j(vow, "vow");
            AbstractC22676k.m65750j(mainStat, "mainStat");
            this.vow = vow;
            this.mainStat = mainStat;
        }

        @Override // jw0.AbstractC21991i
        /* JADX INFO: renamed from: b, reason: from getter */
        public C25978f getMainStat() {
            return this.mainStat;
        }

        @Override // jw0.AbstractC21991i
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getVow() {
            return this.vow;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.vow, eVar.vow) && AbstractC22676k.m65745e(this.mainStat, eVar.mainStat);
        }

        public int hashCode() {
            return this.mainStat.hashCode() + (this.vow.hashCode() * 31);
        }

        public String toString() {
            return "SwsSleepMetricType(vow=" + this.vow + ", mainStat=" + this.mainStat + ")";
        }
    }

    public /* synthetic */ AbstractC21991i(String str, C25978f c25978f, C25978f c25978f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, c25978f, c25978f2);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public C25978f getCenterStat() {
        return this.centerStat;
    }

    /* JADX INFO: renamed from: b */
    public abstract C25978f getMainStat();

    /* JADX INFO: renamed from: c */
    public abstract String getVow();

    /* JADX INFO: renamed from: d */
    public final TextResource m62842d(SleepMetricTypeModel selectedTooltip) {
        TextResource tooltip;
        TextResource tooltip2;
        AbstractC22676k.m65750j(selectedTooltip, "selectedTooltip");
        C25978f mainStat = getMainStat();
        if ((mainStat != null ? mainStat.getMetricTypeModel() : null) == selectedTooltip) {
            C25978f mainStat2 = getMainStat();
            if (mainStat2 != null && (tooltip2 = mainStat2.getTooltip()) != null) {
                return tooltip2;
            }
            throw new IllegalStateException("No tooltip present for stat " + getMainStat());
        }
        C25978f centerStat = getCenterStat();
        if ((centerStat != null ? centerStat.getMetricTypeModel() : null) != selectedTooltip) {
            throw new IllegalStateException("Cannot get vow for tooltip " + selectedTooltip + " with present stats");
        }
        C25978f centerStat2 = getCenterStat();
        if (centerStat2 != null && (tooltip = centerStat2.getTooltip()) != null) {
            return tooltip;
        }
        throw new IllegalStateException("No tooltip present for stat " + getCenterStat());
    }

    private AbstractC21991i(String str, C25978f c25978f, C25978f c25978f2) {
        this.vow = str;
        this.mainStat = c25978f;
        this.centerStat = c25978f2;
    }
}
