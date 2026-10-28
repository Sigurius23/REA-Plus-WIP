package iw1;

import com.whoop.membership.extensions.domain.models.CtaAction;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: iw1.e */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m65681d2 = {"Liw1/e;", "Liw1/g;", "<init>", "()V", "a", "Liw1/e$a;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC20999e implements InterfaceC21001g {

    /* JADX INFO: renamed from: iw1.e$a */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Liw1/e$a;", "Liw1/e;", "Liw1/f;", "viewState", "Lcom/whoop/membership/extensions/domain/models/CtaAction;", "action", "<init>", "(Liw1/f;Lcom/whoop/membership/extensions/domain/models/CtaAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liw1/f;", "b", "()Liw1/f;", "Lcom/whoop/membership/extensions/domain/models/CtaAction;", "()Lcom/whoop/membership/extensions/domain/models/CtaAction;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC20999e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final InterfaceC21000f viewState;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final CtaAction action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC21000f viewState, CtaAction action) {
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

        /* JADX INFO: renamed from: b, reason: from getter */
        public final InterfaceC21000f getViewState() {
            return this.viewState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.viewState, aVar.viewState) && this.action == aVar.action;
        }

        public int hashCode() {
            return this.action.hashCode() + (this.viewState.hashCode() * 31);
        }

        public String toString() {
            return "CtaClickedV2(viewState=" + this.viewState + ", action=" + this.action + ")";
        }
    }

    public /* synthetic */ AbstractC20999e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC20999e() {
    }
}
