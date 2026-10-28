package pw1;

import com.whoop.membership.familyPlan.domain.model.RemoveFamilyMemberDialogResponse;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: pw1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0002\b\t¨\u0006\nÀ\u0006\u0003"}, m65681d2 = {"Lpw1/c;", "", "e", "a", "b", "c", "d", "f", "Lpw1/c$b;", "Lpw1/c$e;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC29587c {

    /* JADX INFO: renamed from: pw1.c$a */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0013\u0010\n¨\u0006\u0019"}, m65681d2 = {"Lpw1/c$a;", "Lpw1/c$e;", "Lcom/whoop/membership/familyPlan/domain/model/RemoveFamilyMemberDialogResponse;", "response", "", "userId", "familyPlanId", "<init>", "(Lcom/whoop/membership/familyPlan/domain/model/RemoveFamilyMemberDialogResponse;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/membership/familyPlan/domain/model/RemoveFamilyMemberDialogResponse;", "b", "()Lcom/whoop/membership/familyPlan/domain/model/RemoveFamilyMemberDialogResponse;", "Ljava/lang/String;", "c", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final RemoveFamilyMemberDialogResponse response;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String userId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String familyPlanId;

        public a(RemoveFamilyMemberDialogResponse response, String userId, String familyPlanId) {
            AbstractC22676k.m65750j(response, "response");
            AbstractC22676k.m65750j(userId, "userId");
            AbstractC22676k.m65750j(familyPlanId, "familyPlanId");
            this.response = response;
            this.userId = userId;
            this.familyPlanId = familyPlanId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFamilyPlanId() {
            return this.familyPlanId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final RemoveFamilyMemberDialogResponse getResponse() {
            return this.response;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getUserId() {
            return this.userId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.response, aVar.response) && AbstractC22676k.m65745e(this.userId, aVar.userId) && AbstractC22676k.m65745e(this.familyPlanId, aVar.familyPlanId);
        }

        public int hashCode() {
            return this.familyPlanId.hashCode() + AbstractC11266d.m30450d(this.response.hashCode() * 31, 31, this.userId);
        }

        public String toString() {
            RemoveFamilyMemberDialogResponse removeFamilyMemberDialogResponse = this.response;
            String str = this.userId;
            String str2 = this.familyPlanId;
            StringBuilder sb4 = new StringBuilder("ConfirmRemovalDialog(response=");
            sb4.append(removeFamilyMemberDialogResponse);
            sb4.append(", userId=");
            sb4.append(str);
            sb4.append(", familyPlanId=");
            return AbstractC25012a.m73376i(str2, ")", sb4);
        }
    }

    /* JADX INFO: renamed from: pw1.c$b */
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0003\u0002\u0003\u0004¨\u0006\u0005À\u0006\u0003"}, m65681d2 = {"Lpw1/c$b;", "Lpw1/c;", "Lpw1/c$c;", "Lpw1/c$d;", "Lpw1/c$f;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface b extends InterfaceC29587c {
    }

    /* JADX INFO: renamed from: pw1.c$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lpw1/c$c;", "Lpw1/c$b;", "<init>", "()V", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements b {

        /* JADX INFO: renamed from: a */
        public static final c f120758a = new c();

        private c() {
        }
    }

    /* JADX INFO: renamed from: pw1.c$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lpw1/c$d;", "Lpw1/c$b;", "<init>", "()V", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements b {

        /* JADX INFO: renamed from: a */
        public static final d f120759a = new d();

        private d() {
        }
    }

    /* JADX INFO: renamed from: pw1.c$e */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0001\u0002¨\u0006\u0003À\u0006\u0003"}, m65681d2 = {"Lpw1/c$e;", "Lpw1/c;", "Lpw1/c$a;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface e extends InterfaceC29587c {
    }

    /* JADX INFO: renamed from: pw1.c$f */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lpw1/c$f;", "Lpw1/c$b;", "<init>", "()V", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements b {

        /* JADX INFO: renamed from: a */
        public static final f f120760a = new f();

        private f() {
        }
    }
}
