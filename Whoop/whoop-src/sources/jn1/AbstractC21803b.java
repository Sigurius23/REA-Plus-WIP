package jn1;

import c13.AbstractC3855a;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: jn1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m65681d2 = {"Ljn1/b;", "", "<init>", "()V", "b", "e", "a", "d", "f", "c", "Ljn1/b$a;", "Ljn1/b$b;", "Ljn1/b$c;", "Ljn1/b$d;", "Ljn1/b$e;", "Ljn1/b$f;", "home-customization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21803b {

    /* JADX INFO: renamed from: jn1.b$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, m65681d2 = {"Ljn1/b$a;", "Ljn1/b;", "", "index", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "home-customization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC21803b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int index;

        public a(int i13) {
            super(null);
            this.index = i13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && this.index == ((a) other).index;
        }

        public int hashCode() {
            return Integer.hashCode(this.index);
        }

        public String toString() {
            return AbstractC2875y.m8296i(this.index, "AddToChosen(index=", ")");
        }
    }

    /* JADX INFO: renamed from: jn1.b$b */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Ljn1/b$b;", "Ljn1/b;", "", "isFirstTimeFetch", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "home-customization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC21803b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isFirstTimeFetch;

        public b(boolean z4) {
            super(null);
            this.isFirstTimeFetch = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getIsFirstTimeFetch() {
            return this.isFirstTimeFetch;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && this.isFirstTimeFetch == ((b) other).isFirstTimeFetch;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isFirstTimeFetch);
        }

        public String toString() {
            return AbstractC3855a.m11827k("Fetch(isFirstTimeFetch=", ")", this.isFirstTimeFetch);
        }
    }

    /* JADX INFO: renamed from: jn1.b$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ljn1/b$c;", "Ljn1/b;", "<init>", "()V", "home-customization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC21803b {

        /* JADX INFO: renamed from: a */
        public static final c f84009a = new c();

        private c() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: jn1.b$d */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, m65681d2 = {"Ljn1/b$d;", "Ljn1/b;", "", "index", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "home-customization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC21803b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int index;

        public d(int i13) {
            super(null);
            this.index = i13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && this.index == ((d) other).index;
        }

        public int hashCode() {
            return Integer.hashCode(this.index);
        }

        public String toString() {
            return AbstractC2875y.m8296i(this.index, "RemoveFromChosen(index=", ")");
        }
    }

    /* JADX INFO: renamed from: jn1.b$e */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0014"}, m65681d2 = {"Ljn1/b$e;", "Ljn1/b;", "", "fromIndex", "toIndex", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "home-customization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC21803b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int fromIndex;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int toIndex;

        public e(int i13, int i14) {
            super(null);
            this.fromIndex = i13;
            this.toIndex = i14;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getFromIndex() {
            return this.fromIndex;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getToIndex() {
            return this.toIndex;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return this.fromIndex == eVar.fromIndex && this.toIndex == eVar.toIndex;
        }

        public int hashCode() {
            return Integer.hashCode(this.toIndex) + (Integer.hashCode(this.fromIndex) * 31);
        }

        public String toString() {
            return AbstractC25012a.m73372e(this.fromIndex, this.toIndex, "ReorderGroup(fromIndex=", ", toIndex=", ")");
        }
    }

    /* JADX INFO: renamed from: jn1.b$f */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Ljn1/b$f;", "Ljn1/b;", "", "index", "", "isToggle", "<init>", "(IZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Z", "()Z", "home-customization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC21803b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int index;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean isToggle;

        public f(int i13, boolean z4) {
            super(null);
            this.index = i13;
            this.isToggle = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsToggle() {
            return this.isToggle;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof f)) {
                return false;
            }
            f fVar = (f) other;
            return this.index == fVar.index && this.isToggle == fVar.isToggle;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isToggle) + (Integer.hashCode(this.index) * 31);
        }

        public String toString() {
            return "onTogglePress(index=" + this.index + ", isToggle=" + this.isToggle + ")";
        }
    }

    public /* synthetic */ AbstractC21803b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC21803b() {
    }
}
