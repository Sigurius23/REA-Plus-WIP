package n70;

import com.whoop.activation.domain.models.ActivationFlowStepModel;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n70.f */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Ln70/f;", "", "Lcom/whoop/activation/domain/models/ActivationFlowStepModel;", "currentScreen", "", "shouldSkip", "<init>", "(Lcom/whoop/activation/domain/models/ActivationFlowStepModel;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/activation/domain/models/ActivationFlowStepModel;", "()Lcom/whoop/activation/domain/models/ActivationFlowStepModel;", "b", "Z", "getShouldSkip", "()Z", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C26419f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ActivationFlowStepModel currentScreen;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean shouldSkip;

    public C26419f(ActivationFlowStepModel currentScreen, boolean z4) {
        AbstractC22676k.m65750j(currentScreen, "currentScreen");
        this.currentScreen = currentScreen;
        this.shouldSkip = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ActivationFlowStepModel getCurrentScreen() {
        return this.currentScreen;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C26419f)) {
            return false;
        }
        C26419f c26419f = (C26419f) other;
        return AbstractC22676k.m65745e(this.currentScreen, c26419f.currentScreen) && this.shouldSkip == c26419f.shouldSkip;
    }

    public int hashCode() {
        return Boolean.hashCode(this.shouldSkip) + (this.currentScreen.hashCode() * 31);
    }

    public String toString() {
        return "ScreenSpecificNavigationAction(currentScreen=" + this.currentScreen + ", shouldSkip=" + this.shouldSkip + ")";
    }
}
