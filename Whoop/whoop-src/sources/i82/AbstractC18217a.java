package i82;

import nh3.AbstractC26725a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: i82.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0004\b\t\u0005\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u000b\f\r\u000e¨\u0006\u000f"}, m65681d2 = {"Li82/a;", "", "<init>", "()V", "", "a", "()Ljava/lang/String;", "id", "c", "d", "b", "Li82/a$a;", "Li82/a$b;", "Li82/a$c;", "Li82/a$d;", "search-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC18217a {

    /* JADX INFO: renamed from: i82.a$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Li82/a$a;", "Li82/a;", "", "id", "", "hasSecondaryEnd", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "search-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC18217a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean hasSecondaryEnd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String id4, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(id4, "id");
            this.id = id4;
            this.hasSecondaryEnd = z4;
        }

        @Override // i82.AbstractC18217a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getHasSecondaryEnd() {
            return this.hasSecondaryEnd;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.id, aVar.id) && this.hasSecondaryEnd == aVar.hasSecondaryEnd;
        }

        public int hashCode() {
            return Boolean.hashCode(this.hasSecondaryEnd) + (this.id.hashCode() * 31);
        }

        public String toString() {
            return AbstractC26725a.m79503g("EndPrimarySuccess(id=", this.id, ", hasSecondaryEnd=", ")", this.hasSecondaryEnd);
        }
    }

    /* JADX INFO: renamed from: i82.a$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Li82/a$b;", "Li82/a;", "", "id", "", "hasTertiaryEnd", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "search-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC18217a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean hasTertiaryEnd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String id4, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(id4, "id");
            this.id = id4;
            this.hasTertiaryEnd = z4;
        }

        @Override // i82.AbstractC18217a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getHasTertiaryEnd() {
            return this.hasTertiaryEnd;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.id, bVar.id) && this.hasTertiaryEnd == bVar.hasTertiaryEnd;
        }

        public int hashCode() {
            return Boolean.hashCode(this.hasTertiaryEnd) + (this.id.hashCode() * 31);
        }

        public String toString() {
            return AbstractC26725a.m79503g("EndSecondarySuccess(id=", this.id, ", hasTertiaryEnd=", ")", this.hasTertiaryEnd);
        }
    }

    /* JADX INFO: renamed from: i82.a$c */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Li82/a$c;", "Li82/a;", "", "id", "", "hasSecondaryProgression", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "search-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC18217a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean hasSecondaryProgression;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String id4, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(id4, "id");
            this.id = id4;
            this.hasSecondaryProgression = z4;
        }

        @Override // i82.AbstractC18217a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getHasSecondaryProgression() {
            return this.hasSecondaryProgression;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.id, cVar.id) && this.hasSecondaryProgression == cVar.hasSecondaryProgression;
        }

        public int hashCode() {
            return Boolean.hashCode(this.hasSecondaryProgression) + (this.id.hashCode() * 31);
        }

        public String toString() {
            return AbstractC26725a.m79503g("PrimarySuccess(id=", this.id, ", hasSecondaryProgression=", ")", this.hasSecondaryProgression);
        }
    }

    /* JADX INFO: renamed from: i82.a$d */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Li82/a$d;", "Li82/a;", "", "id", "", "hasTertiaryStart", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "search-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC18217a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean hasTertiaryStart;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String id4, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(id4, "id");
            this.id = id4;
            this.hasTertiaryStart = z4;
        }

        @Override // i82.AbstractC18217a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getHasTertiaryStart() {
            return this.hasTertiaryStart;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.id, dVar.id) && this.hasTertiaryStart == dVar.hasTertiaryStart;
        }

        public int hashCode() {
            return Boolean.hashCode(this.hasTertiaryStart) + (this.id.hashCode() * 31);
        }

        public String toString() {
            return AbstractC26725a.m79503g("SecondarySuccess(id=", this.id, ", hasTertiaryStart=", ")", this.hasTertiaryStart);
        }
    }

    public /* synthetic */ AbstractC18217a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public abstract String getId();

    private AbstractC18217a() {
    }
}
