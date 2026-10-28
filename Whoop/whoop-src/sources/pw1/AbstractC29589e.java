package pw1;

import com.whoop.membership.familyPlan.domain.model.FamilyPlanScreenResponse;
import com.whoop.membership.familyPlan.domain.model.RemoveFamilyMemberDialogResponse;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: pw1.e */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m65681d2 = {"Lpw1/e;", "", "<init>", "()V", "a", "d", "b", "e", "f", "c", "Lpw1/e$a;", "Lpw1/e$b;", "Lpw1/e$c;", "Lpw1/e$d;", "Lpw1/e$e;", "Lpw1/e$f;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
abstract class AbstractC29589e {

    /* JADX INFO: renamed from: pw1.e$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lpw1/e$a;", "Lpw1/e;", "Lcom/whoop/membership/familyPlan/domain/model/FamilyPlanScreenResponse;", "screenResponse", "<init>", "(Lcom/whoop/membership/familyPlan/domain/model/FamilyPlanScreenResponse;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/membership/familyPlan/domain/model/FamilyPlanScreenResponse;", "()Lcom/whoop/membership/familyPlan/domain/model/FamilyPlanScreenResponse;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC29589e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final FamilyPlanScreenResponse screenResponse;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FamilyPlanScreenResponse screenResponse) {
            super(null);
            AbstractC22676k.m65750j(screenResponse, "screenResponse");
            this.screenResponse = screenResponse;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final FamilyPlanScreenResponse getScreenResponse() {
            return this.screenResponse;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.screenResponse, ((a) other).screenResponse);
        }

        public int hashCode() {
            return this.screenResponse.hashCode();
        }

        public String toString() {
            return "DataLoaded(screenResponse=" + this.screenResponse + ")";
        }
    }

    /* JADX INFO: renamed from: pw1.e$b */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0016\u0010\n¨\u0006\u0019"}, m65681d2 = {"Lpw1/e$b;", "Lpw1/e;", "Lcom/whoop/membership/familyPlan/domain/model/RemoveFamilyMemberDialogResponse;", "dialogResponse", "", "userId", "familyPlanId", "<init>", "(Lcom/whoop/membership/familyPlan/domain/model/RemoveFamilyMemberDialogResponse;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/membership/familyPlan/domain/model/RemoveFamilyMemberDialogResponse;", "()Lcom/whoop/membership/familyPlan/domain/model/RemoveFamilyMemberDialogResponse;", "b", "Ljava/lang/String;", "c", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC29589e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final RemoveFamilyMemberDialogResponse dialogResponse;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String userId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String familyPlanId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(RemoveFamilyMemberDialogResponse dialogResponse, String userId, String familyPlanId) {
            super(null);
            AbstractC22676k.m65750j(dialogResponse, "dialogResponse");
            AbstractC22676k.m65750j(userId, "userId");
            AbstractC22676k.m65750j(familyPlanId, "familyPlanId");
            this.dialogResponse = dialogResponse;
            this.userId = userId;
            this.familyPlanId = familyPlanId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final RemoveFamilyMemberDialogResponse getDialogResponse() {
            return this.dialogResponse;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getFamilyPlanId() {
            return this.familyPlanId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getUserId() {
            return this.userId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.dialogResponse, bVar.dialogResponse) && AbstractC22676k.m65745e(this.userId, bVar.userId) && AbstractC22676k.m65745e(this.familyPlanId, bVar.familyPlanId);
        }

        public int hashCode() {
            return this.familyPlanId.hashCode() + AbstractC11266d.m30450d(this.dialogResponse.hashCode() * 31, 31, this.userId);
        }

        public String toString() {
            RemoveFamilyMemberDialogResponse removeFamilyMemberDialogResponse = this.dialogResponse;
            String str = this.userId;
            String str2 = this.familyPlanId;
            StringBuilder sb4 = new StringBuilder("DialogLoaded(dialogResponse=");
            sb4.append(removeFamilyMemberDialogResponse);
            sb4.append(", userId=");
            sb4.append(str);
            sb4.append(", familyPlanId=");
            return AbstractC25012a.m73376i(str2, ")", sb4);
        }
    }

    /* JADX INFO: renamed from: pw1.e$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lpw1/e$c;", "Lpw1/e;", "Lpw1/a;", "domainAction", "<init>", "(Lpw1/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lpw1/a;", "()Lpw1/a;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC29589e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final InterfaceC29585a domainAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC29585a domainAction) {
            super(null);
            AbstractC22676k.m65750j(domainAction, "domainAction");
            this.domainAction = domainAction;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC29585a getDomainAction() {
            return this.domainAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && AbstractC22676k.m65745e(this.domainAction, ((c) other).domainAction);
        }

        public int hashCode() {
            return this.domainAction.hashCode();
        }

        public String toString() {
            return "HandleDomainAction(domainAction=" + this.domainAction + ")";
        }
    }

    /* JADX INFO: renamed from: pw1.e$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lpw1/e$d;", "Lpw1/e;", "<init>", "()V", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC29589e {

        /* JADX INFO: renamed from: a */
        public static final d f120821a = new d();

        private d() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: pw1.e$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lpw1/e$e;", "Lpw1/e;", "<init>", "()V", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC29589e {

        /* JADX INFO: renamed from: a */
        public static final e f120822a = new e();

        private e() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: pw1.e$f */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lpw1/e$f;", "Lpw1/e;", "<init>", "()V", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC29589e {

        /* JADX INFO: renamed from: a */
        public static final f f120823a = new f();

        private f() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC29589e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC29589e() {
    }
}
