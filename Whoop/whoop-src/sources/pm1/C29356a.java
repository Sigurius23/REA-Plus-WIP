package pm1;

import com.whoop.home.domain.models.DayZeroCardsViewState;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: pm1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\t¨\u0006\u0017"}, m65681d2 = {"Lpm1/a;", "Lpm1/b;", "Lcom/whoop/home/domain/models/DayZeroCardsViewState;", "viewState", "", "registerCompletion", "<init>", "(Lcom/whoop/home/domain/models/DayZeroCardsViewState;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/home/domain/models/DayZeroCardsViewState;", "b", "()Lcom/whoop/home/domain/models/DayZeroCardsViewState;", "Ljava/lang/String;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C29356a implements InterfaceC29357b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final DayZeroCardsViewState viewState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String registerCompletion;

    public C29356a(DayZeroCardsViewState viewState, String str) {
        AbstractC22676k.m65750j(viewState, "viewState");
        this.viewState = viewState;
        this.registerCompletion = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getRegisterCompletion() {
        return this.registerCompletion;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final DayZeroCardsViewState getViewState() {
        return this.viewState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C29356a)) {
            return false;
        }
        C29356a c29356a = (C29356a) other;
        return AbstractC22676k.m65745e(this.viewState, c29356a.viewState) && AbstractC22676k.m65745e(this.registerCompletion, c29356a.registerCompletion);
    }

    public int hashCode() {
        int iHashCode = this.viewState.hashCode() * 31;
        String str = this.registerCompletion;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "PerformAnimation(viewState=" + this.viewState + ", registerCompletion=" + this.registerCompletion + ")";
    }

    public /* synthetic */ C29356a(DayZeroCardsViewState dayZeroCardsViewState, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(dayZeroCardsViewState, (i13 & 2) != 0 ? null : str);
    }
}
