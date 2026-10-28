package q80;

import com.whoop.activation.view.navigation.ActivationFlowDestination;
import ge3.AbstractC15751g;
import j80.InterfaceC21413a;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: q80.l */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\t¨\u0006\n"}, m65681d2 = {"Lq80/l;", "", "Lq80/d;", "descriptor", "<init>", "(Ljava/lang/String;ILq80/d;)V", "Lq80/d;", "getDescriptor", "()Lq80/d;", "FinalScreens", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC30040l {
    FinalScreens(new C30032d(ActivationFlowDestination.AFTER_ACTIVATION_FINAL_SCREENS, new C30034f(4), "activation_after_activation_final_screens", true));

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    private final C30032d descriptor;

    EnumC30040l(C30032d c30032d) {
        this.descriptor = c30032d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC21413a _init_$lambda$0(String str) {
        return new InterfaceC21413a.l(str);
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final C30032d getDescriptor() {
        return this.descriptor;
    }
}
