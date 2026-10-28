package il1;

import fm1.EnumC14603g;
import java.time.LocalDate;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: il1.m */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m65681d2 = {"Lil1/m;", "", "<init>", "()V", "a", "Lil1/m$a;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC18636m {
    public /* synthetic */ AbstractC18636m(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC18636m() {
    }

    /* JADX INFO: renamed from: il1.m$a */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0018\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lil1/m$a;", "Lil1/m;", "Ljava/time/LocalDate;", "requestDate", "", "monthOffset", "Lfm1/g;", "pillarType", "<init>", "(Ljava/time/LocalDate;ILfm1/g;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/LocalDate;", "c", "()Ljava/time/LocalDate;", "b", "I", "Lfm1/g;", "()Lfm1/g;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC18636m {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final LocalDate requestDate;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int monthOffset;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final EnumC14603g pillarType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LocalDate requestDate, int i13, EnumC14603g pillarType) {
            super(null);
            AbstractC22676k.m65750j(requestDate, "requestDate");
            AbstractC22676k.m65750j(pillarType, "pillarType");
            this.requestDate = requestDate;
            this.monthOffset = i13;
            this.pillarType = pillarType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getMonthOffset() {
            return this.monthOffset;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EnumC14603g getPillarType() {
            return this.pillarType;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final LocalDate getRequestDate() {
            return this.requestDate;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.requestDate, aVar.requestDate) && this.monthOffset == aVar.monthOffset && this.pillarType == aVar.pillarType;
        }

        public int hashCode() {
            return this.pillarType.hashCode() + AbstractC11266d.m30448b(this.monthOffset, this.requestDate.hashCode() * 31, 31);
        }

        public String toString() {
            return "CalendarMonth(requestDate=" + this.requestDate + ", monthOffset=" + this.monthOffset + ", pillarType=" + this.pillarType + ")";
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ a(LocalDate localDate, int i13, EnumC14603g enumC14603g, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i14 & 1) != 0) {
                localDate = LocalDate.now();
                AbstractC22676k.m65749i(localDate, "now(...)");
            }
            this(localDate, (i14 & 2) != 0 ? 0 : i13, (i14 & 4) != 0 ? EnumC14603g.OVERVIEW : enumC14603g);
        }
    }
}
