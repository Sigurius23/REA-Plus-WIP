package kw0;

import com.whoop.navigation.C9598e;
import jh3.AbstractC21702c;
import org.joda.time.LocalDateTime;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: kw0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m65681d2 = {"Lkw0/a;", "", "<init>", "()V", "a", "b", "c", "d", "Lkw0/a$a;", "Lkw0/a$b;", "Lkw0/a$c;", "Lkw0/a$d;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22848a {

    /* JADX INFO: renamed from: kw0.a$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lkw0/a$a;", "Lkw0/a;", "<init>", "()V", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC22848a {

        /* JADX INFO: renamed from: a */
        public static final a f90080a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: kw0.a$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lkw0/a$b;", "Lkw0/a;", "", "message", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC22848a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String message) {
            super(null);
            AbstractC22676k.m65750j(message, "message");
            this.message = message;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.message, ((b) other).message);
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("CoachVowClicked(message=", this.message, ")");
        }
    }

    /* JADX INFO: renamed from: kw0.a$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lkw0/a$c;", "Lkw0/a;", "Lorg/joda/time/LocalDateTime;", "lowerBound", "upperBound", "", "sleepIdV2", "", "isNap", "<init>", "(Lorg/joda/time/LocalDateTime;Lorg/joda/time/LocalDateTime;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lorg/joda/time/LocalDateTime;", "()Lorg/joda/time/LocalDateTime;", "b", "c", "Ljava/lang/String;", "d", "Z", "()Z", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC22848a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final LocalDateTime lowerBound;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final LocalDateTime upperBound;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String sleepIdV2;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean isNap;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(LocalDateTime lowerBound, LocalDateTime upperBound, String str, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(lowerBound, "lowerBound");
            AbstractC22676k.m65750j(upperBound, "upperBound");
            this.lowerBound = lowerBound;
            this.upperBound = upperBound;
            this.sleepIdV2 = str;
            this.isNap = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LocalDateTime getLowerBound() {
            return this.lowerBound;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSleepIdV2() {
            return this.sleepIdV2;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final LocalDateTime getUpperBound() {
            return this.upperBound;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getIsNap() {
            return this.isNap;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.lowerBound, cVar.lowerBound) && AbstractC22676k.m65745e(this.upperBound, cVar.upperBound) && AbstractC22676k.m65745e(this.sleepIdV2, cVar.sleepIdV2) && this.isNap == cVar.isNap;
        }

        public int hashCode() {
            int iHashCode = (this.upperBound.hashCode() + (this.lowerBound.hashCode() * 31)) * 31;
            String str = this.sleepIdV2;
            return Boolean.hashCode(this.isNap) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public String toString() {
            LocalDateTime localDateTime = this.lowerBound;
            LocalDateTime localDateTime2 = this.upperBound;
            String str = this.sleepIdV2;
            boolean z4 = this.isNap;
            StringBuilder sb4 = new StringBuilder("NavigateToEditActivity(lowerBound=");
            sb4.append(localDateTime);
            sb4.append(", upperBound=");
            sb4.append(localDateTime2);
            sb4.append(", sleepIdV2=");
            return AbstractC21702c.m61137h(sb4, str, ", isNap=", z4, ")");
        }
    }

    /* JADX INFO: renamed from: kw0.a$d */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lkw0/a$d;", "Lkw0/a;", "Lcom/whoop/navigation/e;", "action", "<init>", "(Lcom/whoop/navigation/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC22848a {

        /* JADX INFO: renamed from: b */
        public static final int f90086b = C9598e.f28134d;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C9598e action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C9598e action) {
            super(null);
            AbstractC22676k.m65750j(action, "action");
            this.action = action;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C9598e getAction() {
            return this.action;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && AbstractC22676k.m65745e(this.action, ((d) other).action);
        }

        public int hashCode() {
            return this.action.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106650i("NavigateToScreen(action=", this.action, ")");
        }
    }

    public /* synthetic */ AbstractC22848a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC22848a() {
    }
}
