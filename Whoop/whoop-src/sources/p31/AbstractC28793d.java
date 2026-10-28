package p31;

import kd1.EnumC22400l;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: p31.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m65681d2 = {"Lp31/d;", "", "<init>", "()V", "b", "a", "Lp31/d$a;", "Lp31/d$b;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28793d {

    /* JADX INFO: renamed from: p31.d$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lp31/d$a;", "Lp31/d;", "Lkd1/l;", "homeCtaType", "<init>", "(Lkd1/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkd1/l;", "()Lkd1/l;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC28793d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC22400l homeCtaType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(EnumC22400l homeCtaType) {
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
            return (other instanceof a) && this.homeCtaType == ((a) other).homeCtaType;
        }

        public int hashCode() {
            return this.homeCtaType.hashCode();
        }

        public String toString() {
            return "ItemClicked(homeCtaType=" + this.homeCtaType + ")";
        }
    }

    /* JADX INFO: renamed from: p31.d$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lp31/d$b;", "Lp31/d;", "<init>", "()V", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC28793d {

        /* JADX INFO: renamed from: a */
        public static final b f116569a = new b();

        private b() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC28793d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC28793d() {
    }
}
