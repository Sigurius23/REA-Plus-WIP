package em1;

import fm1.EnumC14603g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: em1.i */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m65681d2 = {"Lem1/i;", "Lem1/t;", "<init>", "()V", "a", "Lem1/i$a;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13335i implements InterfaceC13346t {

    /* JADX INFO: renamed from: em1.i$a */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lem1/i$a;", "Lem1/i;", "", "monthOffset", "Lfm1/g;", "pillarType", "<init>", "(ILfm1/g;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Lfm1/g;", "()Lfm1/g;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC13335i {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int monthOffset;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC14603g pillarType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i13, EnumC14603g pillarType) {
            super(null);
            AbstractC22676k.m65750j(pillarType, "pillarType");
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

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.monthOffset == aVar.monthOffset && this.pillarType == aVar.pillarType;
        }

        public int hashCode() {
            return this.pillarType.hashCode() + (Integer.hashCode(this.monthOffset) * 31);
        }

        public String toString() {
            return "CalendarMonthChange(monthOffset=" + this.monthOffset + ", pillarType=" + this.pillarType + ")";
        }
    }

    public /* synthetic */ AbstractC13335i(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC13335i() {
    }
}
