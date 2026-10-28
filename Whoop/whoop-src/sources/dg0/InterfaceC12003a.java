package dg0;

import com.whoop.advancedlabsjoin.feature.updatetests.domain.models.UpdateTestsDialogModel;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: dg0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0002\t\n¨\u0006\u000bÀ\u0006\u0003"}, m65681d2 = {"Ldg0/a;", "", "e", "a", "b", "c", "d", "f", "g", "Ldg0/a$b;", "Ldg0/a$e;", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC12003a {

    /* JADX INFO: renamed from: dg0.a$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Ldg0/a$a;", "Ldg0/a$e;", "Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel;", "dialogData", "<init>", "(Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel;", "()Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel;", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final UpdateTestsDialogModel dialogData;

        public a(UpdateTestsDialogModel dialogData) {
            AbstractC22676k.m65750j(dialogData, "dialogData");
            this.dialogData = dialogData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final UpdateTestsDialogModel getDialogData() {
            return this.dialogData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.dialogData, ((a) other).dialogData);
        }

        public int hashCode() {
            return this.dialogData.hashCode();
        }

        public String toString() {
            return "ConfirmationDialog(dialogData=" + this.dialogData + ")";
        }
    }

    /* JADX INFO: renamed from: dg0.a$b */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Ldg0/a$b;", "Ldg0/a;", "Ldg0/a$c;", "Ldg0/a$d;", "Ldg0/a$f;", "Ldg0/a$g;", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface b extends InterfaceC12003a {
    }

    /* JADX INFO: renamed from: dg0.a$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldg0/a$c;", "Ldg0/a$b;", "<init>", "()V", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements b {

        /* JADX INFO: renamed from: a */
        public static final c f39592a = new c();

        private c() {
        }
    }

    /* JADX INFO: renamed from: dg0.a$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldg0/a$d;", "Ldg0/a$b;", "<init>", "()V", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements b {

        /* JADX INFO: renamed from: a */
        public static final d f39593a = new d();

        private d() {
        }
    }

    /* JADX INFO: renamed from: dg0.a$e */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0001\u0002¨\u0006\u0003À\u0006\u0003"}, m65681d2 = {"Ldg0/a$e;", "Ldg0/a;", "Ldg0/a$a;", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface e extends InterfaceC12003a {
    }

    /* JADX INFO: renamed from: dg0.a$f */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldg0/a$f;", "Ldg0/a$b;", "<init>", "()V", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements b {

        /* JADX INFO: renamed from: a */
        public static final f f39594a = new f();

        private f() {
        }
    }

    /* JADX INFO: renamed from: dg0.a$g */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldg0/a$g;", "Ldg0/a$b;", "<init>", "()V", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements b {

        /* JADX INFO: renamed from: a */
        public static final g f39595a = new g();

        private g() {
        }
    }
}
