package n70;

import com.whoop.activation.view.navigation.ActivationFlowDestination;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: n70.e */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJF\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001b\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0011\u0010$\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, m65681d2 = {"Ln70/e;", "", "", "currentStepIndex", "stepTotal", "previousFlowStepTotal", "Lcom/whoop/activation/view/navigation/ActivationFlowDestination;", "currentDestination", "Ln70/d;", "navigationAction", "<init>", "(IIILcom/whoop/activation/view/navigation/ActivationFlowDestination;Ln70/d;)V", "a", "(IIILcom/whoop/activation/view/navigation/ActivationFlowDestination;Ln70/d;)Ln70/e;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "d", "b", "g", "c", "f", "Lcom/whoop/activation/view/navigation/ActivationFlowDestination;", "()Lcom/whoop/activation/view/navigation/ActivationFlowDestination;", "e", "Ln70/d;", "()Ln70/d;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Z", "isOnLastScreen", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C26418e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int currentStepIndex;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int stepTotal;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int previousFlowStepTotal;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final ActivationFlowDestination currentDestination;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AbstractC26417d navigationAction;

    public C26418e(int i13, int i14, int i15, ActivationFlowDestination activationFlowDestination, AbstractC26417d abstractC26417d) {
        this.currentStepIndex = i13;
        this.stepTotal = i14;
        this.previousFlowStepTotal = i15;
        this.currentDestination = activationFlowDestination;
        this.navigationAction = abstractC26417d;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C26418e m78162b(C26418e c26418e, int i13, int i14, int i15, ActivationFlowDestination activationFlowDestination, AbstractC26417d abstractC26417d, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i13 = c26418e.currentStepIndex;
        }
        if ((i16 & 2) != 0) {
            i14 = c26418e.stepTotal;
        }
        if ((i16 & 4) != 0) {
            i15 = c26418e.previousFlowStepTotal;
        }
        if ((i16 & 8) != 0) {
            activationFlowDestination = c26418e.currentDestination;
        }
        if ((i16 & 16) != 0) {
            abstractC26417d = c26418e.navigationAction;
        }
        AbstractC26417d abstractC26417d2 = abstractC26417d;
        int i17 = i15;
        return c26418e.m78163a(i13, i14, i17, activationFlowDestination, abstractC26417d2);
    }

    /* JADX INFO: renamed from: a */
    public final C26418e m78163a(int currentStepIndex, int stepTotal, int previousFlowStepTotal, ActivationFlowDestination currentDestination, AbstractC26417d navigationAction) {
        return new C26418e(currentStepIndex, stepTotal, previousFlowStepTotal, currentDestination, navigationAction);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ActivationFlowDestination getCurrentDestination() {
        return this.currentDestination;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getCurrentStepIndex() {
        return this.currentStepIndex;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final AbstractC26417d getNavigationAction() {
        return this.navigationAction;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C26418e)) {
            return false;
        }
        C26418e c26418e = (C26418e) other;
        return this.currentStepIndex == c26418e.currentStepIndex && this.stepTotal == c26418e.stepTotal && this.previousFlowStepTotal == c26418e.previousFlowStepTotal && this.currentDestination == c26418e.currentDestination && AbstractC22676k.m65745e(this.navigationAction, c26418e.navigationAction);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getPreviousFlowStepTotal() {
        return this.previousFlowStepTotal;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getStepTotal() {
        return this.stepTotal;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m78169h() {
        int i13 = this.stepTotal;
        return i13 > 0 && this.currentStepIndex == i13 - 1;
    }

    public int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.previousFlowStepTotal, AbstractC11266d.m30448b(this.stepTotal, Integer.hashCode(this.currentStepIndex) * 31, 31), 31);
        ActivationFlowDestination activationFlowDestination = this.currentDestination;
        int iHashCode = (iM30448b + (activationFlowDestination == null ? 0 : activationFlowDestination.hashCode())) * 31;
        AbstractC26417d abstractC26417d = this.navigationAction;
        return iHashCode + (abstractC26417d != null ? abstractC26417d.hashCode() : 0);
    }

    public String toString() {
        int i13 = this.currentStepIndex;
        int i14 = this.stepTotal;
        int i15 = this.previousFlowStepTotal;
        ActivationFlowDestination activationFlowDestination = this.currentDestination;
        AbstractC26417d abstractC26417d = this.navigationAction;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "ActivationProgressResult(currentStepIndex=", ", stepTotal=", ", previousFlowStepTotal=");
        sbM30465s.append(i15);
        sbM30465s.append(", currentDestination=");
        sbM30465s.append(activationFlowDestination);
        sbM30465s.append(", navigationAction=");
        sbM30465s.append(abstractC26417d);
        sbM30465s.append(")");
        return sbM30465s.toString();
    }

    public /* synthetic */ C26418e(int i13, int i14, int i15, ActivationFlowDestination activationFlowDestination, AbstractC26417d abstractC26417d, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this((i16 & 1) != 0 ? 0 : i13, (i16 & 2) != 0 ? 0 : i14, (i16 & 4) != 0 ? 0 : i15, (i16 & 8) != 0 ? null : activationFlowDestination, (i16 & 16) != 0 ? null : abstractC26417d);
    }
}
