package p31;

import com.whoop.navigation.C9598e;
import kd1.EnumC22400l;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: p31.j */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m65681d2 = {"Lp31/j;", "", "<init>", "()V", "b", "d", "c", "a", "e", "Lp31/j$a;", "Lp31/j$b;", "Lp31/j$c;", "Lp31/j$d;", "Lp31/j$e;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28799j {

    /* JADX INFO: renamed from: p31.j$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lp31/j$a;", "Lp31/j;", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Lcom/whoop/navigation/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC28799j {

        /* JADX INFO: renamed from: b */
        public static final int f116575b = C9598e.f28134d;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C9598e destination;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C9598e destination) {
            super(null);
            AbstractC22676k.m65750j(destination, "destination");
            this.destination = destination;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C9598e getDestination() {
            return this.destination;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.destination, ((a) other).destination);
        }

        public int hashCode() {
            return this.destination.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106650i("BackendDrivenNavigation(destination=", this.destination, ")");
        }
    }

    /* JADX INFO: renamed from: p31.j$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lp31/j$b;", "Lp31/j;", "<init>", "()V", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC28799j {

        /* JADX INFO: renamed from: a */
        public static final b f116577a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: p31.j$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lp31/j$c;", "Lp31/j;", "Lkd1/l;", "homeCtaType", "<init>", "(Lkd1/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkd1/l;", "()Lkd1/l;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC28799j {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC22400l homeCtaType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(EnumC22400l homeCtaType) {
            super(null);
            AbstractC22676k.m65750j(homeCtaType, "homeCtaType");
            this.homeCtaType = homeCtaType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC22400l getHomeCtaType() {
            return this.homeCtaType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && this.homeCtaType == ((c) other).homeCtaType;
        }

        public int hashCode() {
            return this.homeCtaType.hashCode();
        }

        public String toString() {
            return "CtaClick(homeCtaType=" + this.homeCtaType + ")";
        }
    }

    /* JADX INFO: renamed from: p31.j$d */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lp31/j$d;", "Lp31/j;", "Lkd1/l;", "homeCtaType", "<init>", "(Lkd1/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkd1/l;", "()Lkd1/l;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC28799j {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC22400l homeCtaType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(EnumC22400l homeCtaType) {
            super(null);
            AbstractC22676k.m65750j(homeCtaType, "homeCtaType");
            this.homeCtaType = homeCtaType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC22400l getHomeCtaType() {
            return this.homeCtaType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && this.homeCtaType == ((d) other).homeCtaType;
        }

        public int hashCode() {
            return this.homeCtaType.hashCode();
        }

        public String toString() {
            return "FabClick(homeCtaType=" + this.homeCtaType + ")";
        }
    }

    /* JADX INFO: renamed from: p31.j$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lp31/j$e;", "Lp31/j;", "<init>", "()V", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC28799j {

        /* JADX INFO: renamed from: a */
        public static final e f116580a = new e();

        private e() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC28799j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC28799j() {
    }
}
