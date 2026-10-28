package kj2;

import com.mapbox.maps.MapboxMap;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: kj2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Lkj2/b;", "", "<init>", "()V", "b", "c", "a", "Lkj2/b$a;", "Lkj2/b$b;", "Lkj2/b$c;", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
abstract class AbstractC22518b {

    /* JADX INFO: renamed from: kj2.b$a */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0015"}, m65681d2 = {"Lkj2/b$a;", "Lkj2/b;", "", "specificDate", "", MapboxMap.QFE_OFFSET, "<init>", "(Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC22518b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String specificDate;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int offset;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String specificDate, int i13) {
            super(null);
            AbstractC22676k.m65750j(specificDate, "specificDate");
            this.specificDate = specificDate;
            this.offset = i13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getOffset() {
            return this.offset;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSpecificDate() {
            return this.specificDate;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.specificDate, aVar.specificDate) && this.offset == aVar.offset;
        }

        public int hashCode() {
            return Integer.hashCode(this.offset) + (this.specificDate.hashCode() * 31);
        }

        public String toString() {
            return AbstractC11895b.m31993l(this.offset, "CalendarPaged(specificDate=", this.specificDate, ", offset=", ")");
        }
    }

    /* JADX INFO: renamed from: kj2.b$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lkj2/b$b;", "Lkj2/b;", "<init>", "()V", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC22518b {

        /* JADX INFO: renamed from: a */
        public static final b f88276a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: kj2.b$c */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0015"}, m65681d2 = {"Lkj2/b$c;", "Lkj2/b;", "", "specificDate", "", MapboxMap.QFE_OFFSET, "<init>", "(Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC22518b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String specificDate;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int offset;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String specificDate, int i13) {
            super(null);
            AbstractC22676k.m65750j(specificDate, "specificDate");
            this.specificDate = specificDate;
            this.offset = i13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getOffset() {
            return this.offset;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSpecificDate() {
            return this.specificDate;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.specificDate, cVar.specificDate) && this.offset == cVar.offset;
        }

        public int hashCode() {
            return Integer.hashCode(this.offset) + (this.specificDate.hashCode() * 31);
        }

        public String toString() {
            return AbstractC11895b.m31993l(this.offset, "RefreshSpecificDate(specificDate=", this.specificDate, ", offset=", ")");
        }
    }

    public /* synthetic */ AbstractC22518b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC22518b() {
    }
}
