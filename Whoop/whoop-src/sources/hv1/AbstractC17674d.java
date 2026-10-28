package hv1;

import com.mapbox.common.HttpHeaders;
import java.time.LocalDateTime;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: hv1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m65681d2 = {"Lhv1/d;", "", "<init>", "()V", "a", "Lhv1/d$a;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17674d {

    /* JADX INFO: renamed from: hv1.d$a */
    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001e\u001a\u0004\b\u0018\u0010\r¨\u0006\u001f"}, m65681d2 = {"Lhv1/d$a;", "Lhv1/d;", "Ljava/time/LocalDateTime;", HttpHeaders.DATE, "", "vo2MaxValue", "Lhv1/h;", "source", "", "id", "<init>", "(Ljava/time/LocalDateTime;ILhv1/h;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/LocalDateTime;", "()Ljava/time/LocalDateTime;", "b", "I", "d", "c", "Lhv1/h;", "()Lhv1/h;", "Ljava/lang/String;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC17674d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final LocalDateTime date;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int vo2MaxValue;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final EnumC17678h source;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LocalDateTime date, int i13, EnumC17678h source, String str) {
            super(null);
            AbstractC22676k.m65750j(date, "date");
            AbstractC22676k.m65750j(source, "source");
            this.date = date;
            this.vo2MaxValue = i13;
            this.source = source;
            this.id = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LocalDateTime getDate() {
            return this.date;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final EnumC17678h getSource() {
            return this.source;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getVo2MaxValue() {
            return this.vo2MaxValue;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.date, aVar.date) && this.vo2MaxValue == aVar.vo2MaxValue && this.source == aVar.source && AbstractC22676k.m65745e(this.id, aVar.id);
        }

        public int hashCode() {
            int iHashCode = (this.source.hashCode() + AbstractC11266d.m30448b(this.vo2MaxValue, this.date.hashCode() * 31, 31)) * 31;
            String str = this.id;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Vo2MaxDate(date=" + this.date + ", vo2MaxValue=" + this.vo2MaxValue + ", source=" + this.source + ", id=" + this.id + ")";
        }
    }

    public /* synthetic */ AbstractC17674d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC17674d() {
    }
}
