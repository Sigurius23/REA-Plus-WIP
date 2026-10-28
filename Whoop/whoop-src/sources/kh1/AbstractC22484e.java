package kh1;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: kh1.e */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Lkh1/e;", "", "<init>", "()V", "b", "c", "a", "Lkh1/e$a;", "Lkh1/e$b;", "Lkh1/e$c;", "gifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22484e {

    /* JADX INFO: renamed from: kh1.e$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lkh1/e$a;", "Lkh1/e;", "Lkh1/b;", "domainAction", "<init>", "(Lkh1/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkh1/b;", "()Lkh1/b;", "gifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC22484e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AbstractC22481b domainAction;

        public a(AbstractC22481b abstractC22481b) {
            super(null);
            this.domainAction = abstractC22481b;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AbstractC22481b getDomainAction() {
            return this.domainAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.domainAction, ((a) other).domainAction);
        }

        public int hashCode() {
            AbstractC22481b abstractC22481b = this.domainAction;
            if (abstractC22481b == null) {
                return 0;
            }
            return abstractC22481b.hashCode();
        }

        public String toString() {
            return "HandleDomainAction(domainAction=" + this.domainAction + ")";
        }
    }

    /* JADX INFO: renamed from: kh1.e$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lkh1/e$b;", "Lkh1/e;", "Lkh1/c;", "domainState", "<init>", "(Lkh1/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkh1/c;", "()Lkh1/c;", "gifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC22484e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C22482c domainState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C22482c domainState) {
            super(null);
            AbstractC22676k.m65750j(domainState, "domainState");
            this.domainState = domainState;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C22482c getDomainState() {
            return this.domainState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.domainState, ((b) other).domainState);
        }

        public int hashCode() {
            return this.domainState.hashCode();
        }

        public String toString() {
            return "LoadData(domainState=" + this.domainState + ")";
        }
    }

    /* JADX INFO: renamed from: kh1.e$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lkh1/e$c;", "Lkh1/e;", "Lkh1/a;", "dialogType", "<init>", "(Lkh1/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkh1/a;", "()Lkh1/a;", "gifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC22484e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final InterfaceC22480a dialogType;

        public c(InterfaceC22480a interfaceC22480a) {
            super(null);
            this.dialogType = interfaceC22480a;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC22480a getDialogType() {
            return this.dialogType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && AbstractC22676k.m65745e(this.dialogType, ((c) other).dialogType);
        }

        public int hashCode() {
            InterfaceC22480a interfaceC22480a = this.dialogType;
            if (interfaceC22480a == null) {
                return 0;
            }
            return interfaceC22480a.hashCode();
        }

        public String toString() {
            return "UpdateDialog(dialogType=" + this.dialogType + ")";
        }
    }

    public /* synthetic */ AbstractC22484e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC22484e() {
    }
}
