package iw1;

import com.whoop.membership.extensions.domain.models.CtaAction;
import lw1.C24773i;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: iw1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m65681d2 = {"Liw1/c;", "Liw1/g;", "<init>", "()V", "e", "b", "a", "c", "d", "Liw1/c$a;", "Liw1/c$b;", "Liw1/c$c;", "Liw1/c$d;", "Liw1/c$e;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC20997c implements InterfaceC21001g {

    /* JADX INFO: renamed from: iw1.c$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Liw1/c$a;", "Liw1/c;", "Llw1/i;", "optionSelected", "<init>", "(Llw1/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Llw1/i;", "()Llw1/i;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC20997c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C24773i optionSelected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C24773i optionSelected) {
            super(null);
            AbstractC22676k.m65750j(optionSelected, "optionSelected");
            this.optionSelected = optionSelected;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C24773i getOptionSelected() {
            return this.optionSelected;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.optionSelected, ((a) other).optionSelected);
        }

        public int hashCode() {
            return this.optionSelected.hashCode();
        }

        public String toString() {
            return "ChangeOption(optionSelected=" + this.optionSelected + ")";
        }
    }

    /* JADX INFO: renamed from: iw1.c$b */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Liw1/c$b;", "Liw1/c;", "Liw1/d;", "viewState", "Lcom/whoop/membership/extensions/domain/models/CtaAction;", "action", "<init>", "(Liw1/d;Lcom/whoop/membership/extensions/domain/models/CtaAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liw1/d;", "getViewState", "()Liw1/d;", "b", "Lcom/whoop/membership/extensions/domain/models/CtaAction;", "()Lcom/whoop/membership/extensions/domain/models/CtaAction;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC20997c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AbstractC20998d viewState;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final CtaAction action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC20998d viewState, CtaAction action) {
            super(null);
            AbstractC22676k.m65750j(viewState, "viewState");
            AbstractC22676k.m65750j(action, "action");
            this.viewState = viewState;
            this.action = action;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CtaAction getAction() {
            return this.action;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.viewState, bVar.viewState) && this.action == bVar.action;
        }

        public int hashCode() {
            return this.action.hashCode() + (this.viewState.hashCode() * 31);
        }

        public String toString() {
            return "CtaClicked(viewState=" + this.viewState + ", action=" + this.action + ")";
        }
    }

    /* JADX INFO: renamed from: iw1.c$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Liw1/c$c;", "Liw1/c;", "Llw1/i;", "optionSelected", "<init>", "(Llw1/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Llw1/i;", "()Llw1/i;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC20997c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C24773i optionSelected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C24773i optionSelected) {
            super(null);
            AbstractC22676k.m65750j(optionSelected, "optionSelected");
            this.optionSelected = optionSelected;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C24773i getOptionSelected() {
            return this.optionSelected;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && AbstractC22676k.m65745e(this.optionSelected, ((c) other).optionSelected);
        }

        public int hashCode() {
            return this.optionSelected.hashCode();
        }

        public String toString() {
            return "PressContinue(optionSelected=" + this.optionSelected + ")";
        }
    }

    /* JADX INFO: renamed from: iw1.c$d */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Liw1/c$d;", "Liw1/c;", "Llw1/i;", "optionSelected", "<init>", "(Llw1/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Llw1/i;", "()Llw1/i;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC20997c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C24773i optionSelected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C24773i optionSelected) {
            super(null);
            AbstractC22676k.m65750j(optionSelected, "optionSelected");
            this.optionSelected = optionSelected;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C24773i getOptionSelected() {
            return this.optionSelected;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && AbstractC22676k.m65745e(this.optionSelected, ((d) other).optionSelected);
        }

        public int hashCode() {
            return this.optionSelected.hashCode();
        }

        public String toString() {
            return "PressSecondaryCta(optionSelected=" + this.optionSelected + ")";
        }
    }

    /* JADX INFO: renamed from: iw1.c$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Liw1/c$e;", "Liw1/c;", "<init>", "()V", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC20997c {

        /* JADX INFO: renamed from: a */
        public static final e f79400a = new e();

        private e() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC20997c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC20997c() {
    }
}
