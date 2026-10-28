package tv1;

import com.whoop.membership.domain.upcycle.models.UpcycleLandingModel;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: tv1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Ltv1/c;", "", "<init>", "()V", "c", "a", "b", "Ltv1/c$a;", "Ltv1/c$b;", "Ltv1/c$c;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34207c {

    /* JADX INFO: renamed from: tv1.c$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ltv1/c$a;", "Ltv1/c;", "<init>", "()V", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC34207c {

        /* JADX INFO: renamed from: a */
        public static final a f143493a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: tv1.c$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Ltv1/c$b;", "Ltv1/c;", "Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;", "model", "<init>", "(Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;", "()Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC34207c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final UpcycleLandingModel model;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(UpcycleLandingModel model) {
            super(null);
            AbstractC22676k.m65750j(model, "model");
            this.model = model;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final UpcycleLandingModel getModel() {
            return this.model;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.model, ((b) other).model);
        }

        public int hashCode() {
            return this.model.hashCode();
        }

        public String toString() {
            return "LandingInfoSuccess(model=" + this.model + ")";
        }
    }

    /* JADX INFO: renamed from: tv1.c$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ltv1/c$c;", "Ltv1/c;", "<init>", "()V", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC34207c {

        /* JADX INFO: renamed from: a */
        public static final c f143495a = new c();

        private c() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC34207c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC34207c() {
    }
}
