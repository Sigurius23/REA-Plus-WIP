package q80;

import com.whoop.activation.view.navigation.ActivationFlowDestination;
import ge3.AbstractC15751g;
import j80.InterfaceC21413a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pl0.C29343a;
import t83.InterfaceC33616a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'Permissions' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: q80.n */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m65681d2 = {"Lq80/n;", "", "Lq80/d;", "descriptor", "<init>", "(Ljava/lang/String;ILq80/d;)V", "Lq80/d;", "getDescriptor", "()Lq80/d;", "Permissions", "AfterActivation", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EnumC30042n {
    private static final /* synthetic */ InterfaceC33616a $ENTRIES;
    private static final /* synthetic */ EnumC30042n[] $VALUES;
    public static final EnumC30042n AfterActivation;
    public static final EnumC30042n Permissions;
    private final C30032d descriptor;

    private static final /* synthetic */ EnumC30042n[] $values() {
        return new EnumC30042n[]{Permissions, AfterActivation};
    }

    static {
        int i13 = 8;
        DefaultConstructorMarker defaultConstructorMarker = null;
        boolean z4 = false;
        Permissions = new EnumC30042n("Permissions", 0, new C30032d(ActivationFlowDestination.MEDICARE_PERMISSIONS, new C29343a(21), "activation_medicare_permissions", z4, i13, defaultConstructorMarker));
        AfterActivation = new EnumC30042n("AfterActivation", 1, new C30032d(ActivationFlowDestination.MEDICARE_AFTER_ACTIVATION, new C29343a(22), "activation_medicare_after_activation", z4, i13, defaultConstructorMarker));
        EnumC30042n[] enumC30042nArr$values = $values();
        $VALUES = enumC30042nArr$values;
        $ENTRIES = AbstractC15751g.m44468u(enumC30042nArr$values);
    }

    private EnumC30042n(String str, int i13, C30032d c30032d) {
        super(str, i13);
        this.descriptor = c30032d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC21413a _init_$lambda$0(String str) {
        return InterfaceC21413a.w.f82148a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC21413a _init_$lambda$1(String str) {
        return InterfaceC21413a.v.f82145a;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public static EnumC30042n valueOf(String str) {
        return (EnumC30042n) Enum.valueOf(EnumC30042n.class, str);
    }

    public static EnumC30042n[] values() {
        return (EnumC30042n[]) $VALUES.clone();
    }

    public final C30032d getDescriptor() {
        return this.descriptor;
    }
}
