package q80;

import com.whoop.activation.view.navigation.ActivationFlowDestination;
import ge3.AbstractC15751g;
import j80.InterfaceC21413a;
import p715kotlin.Metadata;
import pl0.C29343a;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: q80.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\t¨\u0006\n"}, m65681d2 = {"Lq80/a;", "", "Lq80/d;", "descriptor", "<init>", "(Ljava/lang/String;ILq80/d;)V", "Lq80/d;", "getDescriptor", "()Lq80/d;", "LegacyAfterActivation", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC30029a {
    LegacyAfterActivation(new C30032d(ActivationFlowDestination.ACCOUNT_TRANSITION_LEGACY_AFTER_ACTIVATION, new C29343a(17), "activation_account_transition_legacy_after_activation", false, 8, null));

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    private final C30032d descriptor;

    EnumC30029a(C30032d c30032d) {
        this.descriptor = c30032d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC21413a _init_$lambda$0(String str) {
        return InterfaceC21413a.j.f82115a;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final C30032d getDescriptor() {
        return this.descriptor;
    }
}
