package com.whoop.mfa.setup.view;

import androidx.annotation.Keep;
import ge3.AbstractC15751g;
import java.util.Comparator;
import java.util.List;
import m83.AbstractC25260n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import t83.InterfaceC33616a;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\tj\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, m65681d2 = {"Lcom/whoop/mfa/setup/view/MfaSetupDestination;", "", "", "step", "<init>", "(Ljava/lang/String;II)V", "getNextStep", "()Lcom/whoop/mfa/setup/view/MfaSetupDestination;", "getCurrentStepIndex", "()I", "", "getProgress", "()F", "I", "getStep", "Companion", "a", "INTRO", "INPUT", "ENTER_CODE", "COMPLETED", "mfa_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum MfaSetupDestination {
    INTRO(0),
    INPUT(1),
    ENTER_CODE(2),
    COMPLETED(3);

    private final int step;
    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final List<MfaSetupDestination> stepsSortedByOrder = AbstractC25260n.m74041Q0(values(), new Comparator() { // from class: com.whoop.mfa.setup.view.MfaSetupDestination.b
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t14, T t15) {
            return AbstractC30060g.m92127q(Integer.valueOf(((MfaSetupDestination) t14).getStep()), Integer.valueOf(((MfaSetupDestination) t15).getStep()));
        }
    });

    /* JADX INFO: renamed from: com.whoop.mfa.setup.view.MfaSetupDestination$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lcom/whoop/mfa/setup/view/MfaSetupDestination$a;", "", "<init>", "()V", "", "a", "()I", "", "Lcom/whoop/mfa/setup/view/MfaSetupDestination;", "stepsSortedByOrder", "Ljava/util/List;", "mfa_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final int m22897a() {
            return MfaSetupDestination.stepsSortedByOrder.size();
        }

        private Companion() {
        }
    }

    MfaSetupDestination(int i13) {
        this.step = i13;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final int getCurrentStepIndex() {
        return stepsSortedByOrder.indexOf(this);
    }

    public final MfaSetupDestination getNextStep() {
        List<MfaSetupDestination> list = stepsSortedByOrder;
        int iIndexOf = list.indexOf(this);
        if (iIndexOf < list.size() - 1) {
            return list.get(iIndexOf + 1);
        }
        return null;
    }

    public final float getProgress() {
        return getCurrentStepIndex() / (INSTANCE.m22897a() - 1);
    }

    public final int getStep() {
        return this.step;
    }
}
