package om1;

import com.whoop.home.domain.models.DayZeroCardsViewState;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: om1.j */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m65681d2 = {"Lom1/j;", "", "<init>", "()V", "a", "Lom1/j$a;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28036j {
    public /* synthetic */ AbstractC28036j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC28036j() {
    }

    /* JADX INFO: renamed from: om1.j$a */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u001c"}, m65681d2 = {"Lom1/j$a;", "Lom1/j;", "Lcom/whoop/home/domain/models/DayZeroCardsViewState;", "viewState", "Lom1/i;", "animationStatus", "", "registerCompletion", "<init>", "(Lcom/whoop/home/domain/models/DayZeroCardsViewState;Lom1/i;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/home/domain/models/DayZeroCardsViewState;", "c", "()Lcom/whoop/home/domain/models/DayZeroCardsViewState;", "b", "Lom1/i;", "()Lom1/i;", "Ljava/lang/String;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC28036j {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final DayZeroCardsViewState viewState;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final InterfaceC28035i animationStatus;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String registerCompletion;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(DayZeroCardsViewState viewState, InterfaceC28035i animationStatus, String str) {
            super(null);
            AbstractC22676k.m65750j(viewState, "viewState");
            AbstractC22676k.m65750j(animationStatus, "animationStatus");
            this.viewState = viewState;
            this.animationStatus = animationStatus;
            this.registerCompletion = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC28035i getAnimationStatus() {
            return this.animationStatus;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getRegisterCompletion() {
            return this.registerCompletion;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final DayZeroCardsViewState getViewState() {
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
            return AbstractC22676k.m65745e(this.viewState, aVar.viewState) && AbstractC22676k.m65745e(this.animationStatus, aVar.animationStatus) && AbstractC22676k.m65745e(this.registerCompletion, aVar.registerCompletion);
        }

        public int hashCode() {
            int iHashCode = (this.animationStatus.hashCode() + (this.viewState.hashCode() * 31)) * 31;
            String str = this.registerCompletion;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            DayZeroCardsViewState dayZeroCardsViewState = this.viewState;
            InterfaceC28035i interfaceC28035i = this.animationStatus;
            String str = this.registerCompletion;
            StringBuilder sb4 = new StringBuilder("PerformAnimation(viewState=");
            sb4.append(dayZeroCardsViewState);
            sb4.append(", animationStatus=");
            sb4.append(interfaceC28035i);
            sb4.append(", registerCompletion=");
            return AbstractC25012a.m73376i(str, ")", sb4);
        }

        public /* synthetic */ a(DayZeroCardsViewState dayZeroCardsViewState, InterfaceC28035i interfaceC28035i, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(dayZeroCardsViewState, (i13 & 2) != 0 ? InterfaceC28035i.f.f113104a : interfaceC28035i, (i13 & 4) != 0 ? null : str);
        }
    }
}
